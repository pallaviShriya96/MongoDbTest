package com.example.SpringMongoExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMongoExample.Repository.SoftwaresRepository;
import com.example.SpringMongoExample.model.Softwares;

@RestController
public class SoftwaresController {
	
	@Autowired
	private SoftwaresRepository repository;
	
	@PostMapping("/AddUser")
	private Softwares AddSoftware(@RequestParam("Name")String Name,@RequestParam("Salary")int Salary) {
		Softwares ob1= new Softwares( Name, Salary);
		
		return repository.save(ob1);
		
	}
	
	@GetMapping("/User")
	private List<Softwares> GetSoftware() {
		
		return repository.findAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
            repository.deleteById(id);
            return "User with id " + id + "has been deleted";
        }
	

}
