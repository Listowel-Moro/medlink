//package listo.medlink.service;
//
//import listo.medlink.dto.PatientDTO;
//import listo.medlink.model.Patient;
//import listo.medlink.repository.PatientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PatientServiceImpl implements PatientService {
//    @Autowired
//    private PatientRepository patientRepository;
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public Patient register(PatientDTO patientDTO) {
//        Patient patient = new Patient();
//
//        patient.setName(patientDTO.getName());
//        patient.setEmail(patientDTO.getEmail());
//        patient.setPhone(patientDTO.getPhone());
//        patient.setBirthdate(patientDTO.getBirthdate());
//        String password = passwordEncoder.encode(patientDTO.getPassword());
//        patient.setPassword(password);
//        patientRepository.save(patient);
//
//        return patient;
//    }
//
//    @Override
//    public Patient login(PatientDTO patientDTO) {
//        return null;
//    }
//}
