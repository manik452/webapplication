package com.primebank.sslrequest;


import com.primebank.sslrequest.PBLHttpRequest.PBLRestTemplate;
import com.primebank.sslrequest.model.LoginModel;
import com.primebank.sslrequest.model.LoginResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SSLRequestController {

    @Autowired
    PBLRestTemplate restTemplate;

    @GetMapping("/ssl-login")
    public String greeting(Model model) {
        LoginModel loginModel = new LoginModel();
        model.addAttribute("loginModel", loginModel);
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "sslLogin";
    }

    @PostMapping("/ssl-login")
    public String postSSL(@ModelAttribute LoginModel loginModel, ModelMap model) {
        //LoginResponseModel response = restTemplate.postUserModel(loginModel);
        LoginResponseModel response = new LoginResponseModel();
        response.setTransactionId("dfwioejdsvfs");
        model.addAttribute("transactionId", response.getTransactionId());
        return "ibLogin";
    }

    @GetMapping("/ibs_payment/billLogin")
    public String iblogin(Model model) {
        return "sslLogin";
    }
}
