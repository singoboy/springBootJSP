package gary.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gary.boot.service.UserService;

@Controller
@RequestMapping("/user")
public class TestJdbcCtrl {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/dUser")
	@ResponseBody
	public String deleteUserById(String name) {
		try {
			userService.deleteUserByName(name);
		} catch (DataAccessException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "delete user fail";
		}
		return "delete user sucess";
	}
	

}