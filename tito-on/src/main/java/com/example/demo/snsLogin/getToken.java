//package com.example.demo.snsLogin;
//
//import java.io.UnsupportedEncodingException;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@RestController
//@CrossOrigin(origins = "*")
//@RequestMapping("/naver")
//public class getToken {
//
//	   private loginService loginService;
//
//	    @GetMapping("/naver-login")
//	    public void naverLogin(HttpServletRequest request, HttpServletResponse response) throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
//	        String url = loginService.getNaverAuthorizeUrl("authorize");
//	        System.out.println(url); 
//	        try {
//	        	System.out.println("성공");
////	            response.sendRedirect(url);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }
//	
//}
