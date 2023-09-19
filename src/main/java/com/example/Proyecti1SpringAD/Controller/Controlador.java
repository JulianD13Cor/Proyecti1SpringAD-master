package com.example.Proyecti1SpringAD.Controller;

import com.example.Proyecti1SpringAD.Model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value ="/api")
public class Controlador {

    List<Estudiante> lstEstudiante = new ArrayList<>();

    @GetMapping("/inicio")
    public String index(Model modelo){
        modelo.addAttribute("titulo","Clase spring");

        return "inicio";
    }

    @GetMapping("/estudiante")
    public String estudiante(Model modelo){
        Estudiante estu = new Estudiante();

        estu.setCodigo("ASD1234");
        estu.setNombre("Andrea");
        estu.setApellido("Cortes");

        modelo.addAttribute("titulo","Clase spring");
        modelo.addAttribute("titulo1","Datos Estudiante");
        modelo.addAttribute("estudiante",estu);

        return "inicio";
    }
    @GetMapping("/estudiantes")
    public String estudiante1(Model modelo){

        lstEstudiante.add(new Estudiante("1010", "pedro", "Gil"));
        lstEstudiante.add(new Estudiante("2020", "juan", "Perez"));
        lstEstudiante.add(new Estudiante("3030", "andres", "Rodriguez"));
        lstEstudiante.add(new Estudiante("4040", "carlos", "Martinez"));
        modelo.addAttribute("titulo","Datos Estudiantes");
        modelo.addAttribute("List",lstEstudiante);
        return "persona";
    }
    @GetMapping("/listar")
    public String listar(Model modelo){

        return "persona";
    }

}
