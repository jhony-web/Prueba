package com.example.SpringPrueba.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@RequestMapping("/A")  //Siempre va primero en el navegador
public class HelloWorldRestController  {

    @GetMapping("/hola")
    public String Saludar(){
        return "Hola Mundo";

    }

    //variables en el navegador
    @GetMapping("holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre,
                                  @PathVariable int edad){
        return "Hola "+ nombre+" tu edad es "+edad;
    }
}
