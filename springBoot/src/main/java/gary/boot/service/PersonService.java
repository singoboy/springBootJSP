package gary.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gary.boot.model.Person;
import gary.boot.repository.impl.PersonRepository;

@Service
public class PersonService {
 
    @Autowired
    private PersonRepository personRepository;
 
    public Object findAll(){
        return personRepository.findAll();
    }
 
    public Person findById(Long id){
        return personRepository.findOne(id);
    }
 
    public Person save(Person person){
        return personRepository.save(person);
    }
 
}