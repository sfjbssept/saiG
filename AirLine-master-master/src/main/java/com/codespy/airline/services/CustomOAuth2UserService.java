package com.codespy.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.codespy.airline.enums.SocialLogin;
import com.codespy.airline.exception.OAuth2Exception;
import com.codespy.airline.models.User;
import com.codespy.airline.repositories.UserRepository;
import com.codespy.airline.security.CustomOAuth2User;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2User oauth2user = super.loadUser(userRequest);
		try {
			User user = userRepository.findByUsername(oauth2user.getAttribute("email"));
			if (user == null) {
				user = this.saveUserInfoEndpoint(oauth2user.getAttribute("email"));
				if (user == null)
					throw new OAuth2Exception("Please Verify Your Identity Email/Username does not exists.");
			}

			return new CustomOAuth2User(oauth2user);
		} catch (AuthenticationException ex) {
			throw ex;
		} catch (Exception ex) {
			// Throwing an instance of AuthenticationException will trigger the
			// OAuth2AuthenticationFailureHandler
			throw new InternalAuthenticationServiceException(ex.getMessage(), ex.getCause());
		}
	}

	public User saveUserInfoEndpoint(String username) {
		/* System.out.println(username); */
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setSocialLogin(SocialLogin.GOOGLE);
		newUser.setEnabled(true);

		return userRepository.save(newUser);
	}

}