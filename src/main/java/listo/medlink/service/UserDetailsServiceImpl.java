//package listo.medlink.service;
//
//import listo.medlink.model.Patient;
//import listo.medlink.repository.DoctorRepository;
//import listo.medlink.repository.PatientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private final PatientRepository patientRepository;
//    private final DoctorRepository doctorRepository;
//
//    public UserDetailsServiceImpl(PatientRepository patientRepository, DoctorRepository doctorRepository) {
//        this.patientRepository = patientRepository;
//        this.doctorRepository = doctorRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) {
//
//        Patient patient = patientRepository.findByEmail(email); //.orElseThrow(() ->
////                new NotFoundException(String.format("User does not exist, email: %s", email)));
//
//        return org.springframework.security.core.userdetails.User.builder()
//                .username(patient.getEmail())
//                .password(patient.getPassword())
//                .build();
//    }
//}
