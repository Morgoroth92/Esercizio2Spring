package com.example.SpringEsercizio2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v2/")
public class JSONCreate {

    @GetMapping(path= "ciao/{provincia}")
    public User Oggetto(@PathVariable String provincia,@RequestParam String nome){
        String saluto = "Ciao " + nome + " com'è il tempo in " + provincia;
        return new User(nome,provincia,saluto);
    }




}
