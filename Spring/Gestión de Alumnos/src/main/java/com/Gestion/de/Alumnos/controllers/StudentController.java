package com.Gestion.de.Alumnos.controllers;

import com.Gestion.de.Alumnos.domain.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

@RequestMapping("/estudiantes")

public class StudentController {

    private List<Student> estudiantes = new ArrayList<>(Arrays.asList(
            new Student(1, "Alberto", "Alb1@gmail.com", 21, "CTA"),
            new Student(2, "Berto", "Berto2@gmail.com", 22, "Matematica"),
            new Student(3, "Cesar", "Cesar3@gmail.com", 23, "Calculo"),
            new Student(4, "David", "David4@gmail.com", 24, "Comunica")

    ));

    @GetMapping
    public ResponseEntity<List<Student>> getAlumnos() {

        return ResponseEntity.ok(estudiantes);
        //return estudiantes;
    }

    @GetMapping("/{email}")
    public Student getAlumno(@PathVariable String email) {
        for (Student a : estudiantes) {
            if (a.getEmail().equalsIgnoreCase(email)) {
                return a;
            }
        }
        return null;
    }

    @PostMapping
    public Student addEstudiante(@RequestBody Student estudianteP) {
        estudiantes.add(estudianteP);
        return estudianteP;
    }

    /**
     * Modificacion total
     *
     * @param estudianteput
     * @return
     */
    @PutMapping
    public Student putestu(@RequestBody Student estudianteput) {
        for (Student q : estudiantes) {
            if (q.getId() == estudianteput.getId()) {
                q.setAge(estudianteput.getAge());
                q.setEmail(estudianteput.getEmail());
                q.setName(estudianteput.getName());
                q.setCourse(estudianteput.getCourse());
                return q;
            }
        }
        return null;
    }


    //modificaion parcial
    @PatchMapping
    public Student patchStudent(@RequestBody Student alumpatch){
        for(Student s: estudiantes){
            if(s.getId() == alumpatch.getId()){

                if (alumpatch.getName() != null ){
                    s.setName(alumpatch.getName());
                }if(alumpatch.getEmail() != null){
                    s.setName(alumpatch.getEmail());
                }if (alumpatch.getAge() != 0){
                    s.setAge(alumpatch.getAge());
                }if (alumpatch.getCourse() != null){
                    s.setCourse(alumpatch.getCourse());
                }
                return s;

            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Student deleStu(@PathVariable int id){
        for (Student s:estudiantes){
            if(s.getId() == id){
                estudiantes.remove(s);
                return s;
            }
        }
        return null;
    }


}
