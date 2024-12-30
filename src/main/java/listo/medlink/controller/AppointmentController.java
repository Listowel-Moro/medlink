package listo.medlink.controller;

//import listo.medlink.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
//    @Autowired
//    private PatientService patientService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello you";
    }

}
