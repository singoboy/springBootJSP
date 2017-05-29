package gary.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import gary.boot.model.User;
import gary.boot.repository.impl.UserRepository;

@Service
public class UserService {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private UserRepository userRepository;
    
	public void deleteUserByName(String name){
		String deleteStatement = "DELETE FROM USERS WHERE NAME=?";
		jdbcTemplate.update(deleteStatement, name);		
	}

	public void save(User user) {
		userRepository.save(user);
	}

	public void delete(User user) {
		userRepository.delete(user);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public User findOne(long id) {
		return userRepository.findOne(id);
	}

}
