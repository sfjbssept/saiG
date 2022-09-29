/*
 * package com.security.controller;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.test.web.servlet.request.
 * SecurityMockMvcRequestPostProcessors; import
 * org.springframework.test.context.ActiveProfiles; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.ResultActions; import
 * org.springframework.util.Base64Utils;
 * 
 * import com.security.entity.Employee;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest({ AppController.class })
 * 
 * @ActiveProfiles(value = "true") public class AppControllerTest {
 * 
 * @Autowired public MockMvc mockMvs;
 * 
 * @Autowired SecurityMockMvcRequestPostProcessors processer;
 * 
 * @Value("${employee.get.url}") private String getUrl;
 * 
 * @Value("${employee.put.url}") String putUrl;
 * 
 * @Value("${employee.post.url}") String postUrl;
 * 
 * @Value("${employee.delete.url}") String deleteUrl;
 * 
 * @Value("${employee.userName}") String userName;
 * 
 * @Value("${employee.userPwd}") String userPwd;
 * 
 * @Value("${employee.adminName}") String adminName;
 * 
 * @Value("${employee.adminPwd}") String adminPwd;
 * 
 * @Test public void testgetEmployee() throws Exception { ResultActions respons
 * = processApi(getUrl, HttpMethod.GET, null, null, userName, userPwd);
 * //ResultActions andExpect = respons.andExpect(status().isOk());.
 * respons.andReturn().getResponse(); String contentAsString =
 * respons.andReturn().getResponse().getContentAsString();
 * assertEquals("employees", contentAsString);
 * 
 * }
 * 
 * 
 * @Test public void testPostEmployee() throws Exception { Employee emp =
 * createEmployee("test","dev"); ResultActions respons = processApi(postUrl,
 * HttpMethod.POST, null, emp, userName, userPwd);
 * respons.andExpect(status().isOk()); ObjectMapper mapper = new ObjectMapper();
 * Employee readValue =
 * mapper.readValue(respons.andReturn().getResponse().getContentAsString(), new
 * TypeReference<Employee>() { }); assertEquals("test", readValue.getName());
 * assertEquals("dev", readValue.getRole());
 * 
 * }
 * 
 * private Employee createEmployee(String string, String string2) { // TODO
 * Auto-generated method stub return null; }
 * 
 * private ResultActions processApi(String getUrl2, HttpMethod methodType,
 * String user, Employee emp, String userName2, String userPwd2) { // TODO
 * Auto-generated method stub ResultActions response = null; String secret =
 * "Basic" + Base64Utils.encodeToString((userName2 + ":" +
 * userPwd2).getBytes()); switch (methodType) { case GET: try { response =
 * response =
 * //mockMvs.perform(get(getUrl2).with(user(userName2).password(userPwd2).roles(
 * "USER"))); mockMvs.perform(get(getUrl2).header(HttpHeaders.AUTHORIZATION,
 * secret)); //header(HttpHeaders.AUTHORIZATION, secret)); } catch (Exception e)
 * { // TODO Auto-generated catch block e.printStackTrace(); } break; default:
 * break; } return response; }
 * 
 * }
 */