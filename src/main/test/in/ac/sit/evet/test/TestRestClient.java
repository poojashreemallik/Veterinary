package in.ac.sit.evet.test;

import in.ac.sit.evet.model.Case;

import java.net.URI;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

public class TestRestClient {

	private static final String REST_URL = "http://localhost:8080/evetclinic";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testCreateCase();
		
	}

	private static void uploadCaseImage(int caseid)
	{
		
		System.out.println("Testing upload Case Image");
		
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new ClassPathResource("images2.jpg"));
		map.add("caseid", new Integer(caseid));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
		                    map, headers);		
		
		//Case testcase = new Case("Test Case from mobile client", "Mobile client", "CREATED");
		
		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//		restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
		ResponseEntity<String> msg = restTemplate.exchange(REST_URL+"/uploadcasefile", HttpMethod.POST, requestEntity,String.class);
		
		System.out.println(msg);
		
	}
	
	private static void testCreateCase()
	{
		System.out.println("Testing create Case");
		
		//Case testcase = ;

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Case> request = new HttpEntity<Case>(new Case("Sakappa Saaku", "Tale novu", "Assigned"));
		Case result = restTemplate.postForObject(REST_URL + "/createcasejson", request, Case.class); 
		 //URI uri = restTemplate.postForLocation(REST_URL + "/createcasejson", testcase, Case.class);
		//restTemplate.getForEntity(url, responseType, urlVariables)
		 
		System.out.println("Successfully created case" + result.getCase_id());
		uploadCaseImage(result.getCase_id());
	}
	
	private void testGetAllCases()
	{
		System.out.println("Testing View All Cases");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String result = restTemplate.getForObject(REST_URL+"/viewcases.json", String.class);
		
		System.out.println(result);

	}
	
}
