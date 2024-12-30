//package listo.medlink.service;
//
//import listo.medlink.dto.DoctorDTO;
//import listo.medlink.model.Doctor;
//import listo.medlink.model.Doctor;
//import listo.medlink.repository.DoctorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class DoctorServiceImpl implements DoctorService {
//    @Autowired
//    private DoctorRepository doctorRepository;
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Override
//    public Doctor register(DoctorDTO doctorDTO) {
//        Doctor doctor = new Doctor();
//
//        doctor.setName(doctorDTO.getName());
//        doctor.setEmail(doctorDTO.getEmail());
//        doctor.setPhone(doctorDTO.getPhone());
//        doctor.setClinic(doctorDTO.getClinic());
//        doctor.setSpeciality(doctorDTO.getSpeciality());
//        String password = passwordEncoder.encode(doctorDTO.getPassword());
//        doctor.setPassword(password);
//        doctorRepository.save(doctor);
//
//        return doctor;
//    }
//
//    @Override
//    public Doctor login(DoctorDTO doctorDTO) {
//        return null;
//    }
//}
