package com.SafetyNet.SafetyNet.repository;

import com.SafetyNet.SafetyNet.model.Person;
import org.springframework.stereotype.Component;
import com.SafetyNet.SafetyNet.repository.DataHandler;


import java.util.List;

@Component
public class PersonRepository {

    private final DataHandler dataHandler;

    public PersonRepository (DataHandler dataHandler) {this.dataHandler = dataHandler;}

    public List< Person > findAllPersons() {

        return dataHandler.getData().getPersons();
    }

}
