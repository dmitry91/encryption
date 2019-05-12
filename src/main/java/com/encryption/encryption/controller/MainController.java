package com.encryption.encryption.controller;

import com.encryption.encryption.entities.Data;
import com.encryption.encryption.services.security.Crypter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private Crypter crypter =  new Crypter();

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = { "/encrypt" }, method = RequestMethod.POST)
    public String encrypt(@ModelAttribute("data")Data data, Model model) {

        if (data.getText().isEmpty()){
            model.addAttribute("message", "You must fill in the input field.");
        }else {
            model.addAttribute("message", crypter.encrypt(data.getText()));
        }
        return "result";
    }

    @RequestMapping(value = { "/decrypt" }, method = RequestMethod.POST)
    public String decrypt(@ModelAttribute("data")Data data, Model model) {
        if (data.getText().isEmpty()){
            model.addAttribute("message", "You must fill in the input field.");
        }else {

            String result = crypter.decrypt(data.getText());

            if(result != null){
                model.addAttribute("message", result);
            }else {
                model.addAttribute("message", "error data");
            }
        }
        return "result";
    }
}
