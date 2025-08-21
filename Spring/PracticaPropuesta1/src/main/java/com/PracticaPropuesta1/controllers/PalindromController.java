package com.PracticaPropuesta1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para palindromos
 */
@RestController
public class PalindromController {

    /**
     * endpoit palabra palidromo
     * @param words es la parabra a verificar
     * @return
     */
    @GetMapping("/validar/{words}")
    public String Palimdromo(@PathVariable String words){
        if(isPalindrome(words)== true){
            return "La palabra "+ words+ " es palindromo";
        } else {
            return "La palabra "+ words+ " No es palindromo";
        }
    }


    /**
     * Metodo para verificar si una palabra es palindromo
     * @param word
     * @return
     */
    private boolean isPalindrome(String word){
        int length = word.length();
        for (int i = 0; i< length/2 ; i++){
            if(word.charAt(i) != word.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

}
