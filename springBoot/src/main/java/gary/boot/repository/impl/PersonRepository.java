package gary.boot.repository.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gary.boot.model.Person;

@Repository
@Transactional
public interface PersonRepository extends CrudRepository<Person,Long> {

}