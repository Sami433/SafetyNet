package com.SafetyNet.SafetyNet.service;
import com.SafetyNet.SafetyNet.repository.FirestationRepository;
import com.SafetyNet.SafetyNet.repository.MedicalRecordsRepository;
import com.SafetyNet.SafetyNet.repository.PersonRepository;


import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    private final FirestationRepository firestationRepository;
    private final PersonRepository personRepository;
    private final MedicalRecordsRepository medicalRecordsRepository;


    public PersonService (PersonRepository personRepository, MedicalRecordsRepository medicalRecordsRepository, FirestationRepository firestationRepository) {
        this.personRepository = personRepository;
        this.medicalRecordsRepository= medicalRecordsRepository;
        this.firestationRepository=firestationRepository;
    }


    public List<String> findAllEmailsByCity(String city) {

        return this.personRepository.findAllPersons().stream().filter(p -> p.getCity().equals(city)).map(p -> p.getEmail()).collect(Collectors.toList());
    }






}
