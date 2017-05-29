package gary.boot.repository.impl;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gary.boot.model.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public User findByEmail(String email);

} // class UserDao