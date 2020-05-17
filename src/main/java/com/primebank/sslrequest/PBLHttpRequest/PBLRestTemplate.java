package com.primebank.sslrequest.PBLHttpRequest;


import com.primebank.sslrequest.model.LoginModel;
import com.primebank.sslrequest.model.LoginResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PBLRestTemplate<T> {

    private final String sslRequestUrl = "https://jsonplaceholder.typicode.com/posts";

    RestTemplate restTemplate = new RestTemplate();

    public LoginResponseModel postUserModel(LoginModel request) {
        ResponseEntity<LoginResponseModel> responseModel = restTemplate.postForEntity(sslRequestUrl, request, LoginResponseModel.class);
        return responseModel.getBody();

    }





   /* public UserResponse getModel() {
//        String fullUrl = baseUrl.concat(authUrl);
        String fullUrl = "https://jsonplaceholder.typicode.com/todos/1";
//        HttpHeaders httpHeaders = restTemplate.headForHeaders(baseUrl + authUrl);
//        assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));
        UserResponse responseModel = restTemplate.getForObject(fullUrl, UserResponse.class);
        System.out.println(responseModel);
        return responseModel;
    }*/

}
