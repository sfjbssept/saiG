package com.security.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.security.entity.Employee;

@RunWith(SpringRunner.class)
@WebMvcTest({ AppController.class })
@ActiveProfiles(value = "true")
public class ControllerTest {

	@Autowired
	public MockMvc mockMvs;

	@Value("${employee.get.url}")
	private String getUrl;
	@Value("${employee.put.url}")
	String putUrl;
	@Value("${employee.post.url}")
	String postUrl;
	@Value("${employee.delete.url}")
	String deleteUrl;

	@Value("${employee.userName}")
	String userName;
	@Value("${employee.userPwd}")
	String userPwd;
	@Value("${employee.adminName}")
	String adminName;
	@Value("${employee.adminPwd}")
	String adminPwd;

	@Test
	public void testgetEmployee() throws Exception {
		ResultActions respons = processApi(getUrl, HttpMethod.GET, null, null, userName, userPwd);
		//ResultActions andExpect = respons.andExpect(status().isOk());.
		respons.andReturn().getResponse();
		String contentAsString = respons.andReturn().getResponse().getContentAsString();
		assertEquals("employees", contentAsString);

	}
	
	@Test
	public void testPostEmployee() throws Exception {
		Employee emp = createEmployee("test", "dev");
		ResultActions respons = processApi(postUrl, HttpMethod.POST, null, emp, adminName, adminPwd);
		respons.andExpect(status().isOk());
		ObjectMapper mapper = new ObjectMapper();
		Employee readValue = mapper.readValue(respons.andReturn().getResponse().getContentAsString(),
				new TypeReference<Employee>() {
				});
		assertEquals("test", readValue.getName());
		assertEquals("dev", readValue.getRole());

	}
	 
	private Employee createEmployee(String name, String role) {
		Employee empEmployee = new Employee(name, role);
		return empEmployee;
	}

	private ResultActions processApi(String getUrl2, HttpMethod methodType, String user, Employee emp,
			String userName2, String userPwd2)  {
		// TODO Auto-generated method stub
		ResultActions response = null;
		String secret = "Basic " + Base64Utils.encodeToString((userName2 + ":" + userPwd2).getBytes());
		switch (methodType) {
		case GET:
			try {
				response = mockMvs.perform(get(getUrl2).header(HttpHeaders.AUTHORIZATION, secret));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case POST:
			try {
				response = mockMvs.perform(
						post(getUrl2).header(HttpHeaders.AUTHORIZATION, secret).contentType(MediaType.APPLICATION_JSON)
								.content(asJsonString(emp)).accept(MediaType.APPLICATION_JSON));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		return response;
	}

	private String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
