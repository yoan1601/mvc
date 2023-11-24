package yoan.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import yoan.mvc.model.Personne;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        List<Personne> lPersonnes = new ArrayList();
        Personne p1 = new Personne();
        p1.setNom("Harena");
        p1.setPrenom("Juan");
        Personne p2 = new Personne();
        p2.setNom("God");
        p2.setPrenom("Good");
        lPersonnes.add(p1);
        lPersonnes.add(p2);
        model.addAttribute("word", "hello world");
        model.addAttribute("lPersonnes", lPersonnes);
        return "hello-view";
    }
}
