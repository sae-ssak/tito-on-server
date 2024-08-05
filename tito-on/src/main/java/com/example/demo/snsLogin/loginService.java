//package com.example.demo.snsLogin;
//
//import java.io.UnsupportedEncodingException;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//import java.net.URLEncoder;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.util.UriComponents;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class loginService {
//
//	 @Value("${login.naver.getToken.baseUrl}")
//	    private String baseUrl;
//
//	    @Value("${login.naver.clientId}")
//	    private String clientId;
//
//	    @Value("${login.naver.redirectUrl}")
//	    private String redirectUrl;
//
//	
//	public String getNaverAuthorizeUrl(String type)
//			throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
//
//		UriComponents uriComponents = UriComponentsBuilder.fromUriString(baseUrl + "/" + type)
//				.queryParam("response_type", "code").queryParam("client_id", clientId)
//				.queryParam("redirect_uri", URLEncoder.encode(redirectUrl, "UTF-8"))
//				.queryParam("state", URLEncoder.encode("1234", "UTF-8")).build();
//
//		return "aaaaaaaaaaaaa"; 
//				
////				uriComponents.toString();
//		
//	}
//}
