package com.RestAPI1.controllers;

import com.RestAPI1.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

//Esta es la anotación principal para mapear solicitudes HTTP a métodos de controlador
@RequestMapping("/clientes")

public class CustomerRestController {


    private ArrayList<Customer> clientes = new ArrayList<>(Arrays.asList(
            new Customer(123,"Juan", "Juan123","contra1"),
            new Customer(456, "Pedro", "Pedro456","contra2"),
            new Customer(789,"Carlos","Carlos789","contra3"),
            new Customer(12,"Alfredo","Alfredo012","contra4")
    ));


    //@GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getClientes(){

        return clientes;

    }

    //@GetMapping("/{username}")
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public ResponseEntity<?> getClientesUsername(@PathVariable String username){
        for (Customer c : clientes){
            if(c.getUsername().equalsIgnoreCase(username)){

                return ResponseEntity.ok(c);
                //return c;1
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado: "+ username);
        //return null;
    }

    //añadir datos
    @PostMapping
    //@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postCliente(@RequestBody Customer cliente){
        clientes.add(cliente);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}").buildAndExpand(cliente.getUsername())
                .toUri();
        //return ResponseEntity.created(location).build();
        return ResponseEntity.created(location).body(cliente);
        //return ResponseEntity.status(HttpStatus.CREATED).body("Cliente creado exitosamente: "+cliente.getUsername());
        //return cliente;
    }

    /**
     *  Actualizar datos
     * @param clienteU
     * @return
     */
    @PutMapping
    public ResponseEntity<?> putCliente(@RequestBody Customer clienteU){
        for (Customer c: clientes ){
            if (c.getID() == clienteU.getID()){
                c.setName(clienteU.getName());
                c.setUsername(clienteU.getUsername());
                c.setPassword(clienteU.getPassword());
                //c.setID(clienteU.getID());

                return ResponseEntity.noContent().build();
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado: "+clienteU.getID());
    }

    @RequestMapping(value = "/{ide}", method = RequestMethod.DELETE)
    //@DeleteMapping("/{ide}")
    public ResponseEntity<?> deleteMA(@PathVariable int ide){
        for(Customer a: clientes){
            if(a.getID()==ide){
                clientes.remove(a);
               return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                // return a;
            }
        }

       return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado: "+ ide);
    }

    /**
     * actualiza 1 dato o mas
     * @param clientePathc
     * @return
     */

    @PatchMapping
    public ResponseEntity<?> update1dato(@RequestBody Customer clientePathc){
        for(Customer l :clientes){

            if(l.getID() == clientePathc.getID()) {

                if (clientePathc.getName() != null) {
                    l.setName(clientePathc.getName());
                }
                if (clientePathc.getUsername() != null) {
                    l.setUsername(clientePathc.getUsername());
                }
                if (clientePathc.getPassword() != null) {
                    l.setPassword(clientePathc.getPassword());
                }
                return ResponseEntity.ok("Cliente modificado satisafatoramiente: "+ clientePathc.getID());
            }

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado: "+ clientePathc.getID());
    }




}
