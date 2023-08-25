package com.exercise.hotel.studentcontroller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.hotel.studententity.Studententity;
import com.exercise.hotel.studentservice.Studentserv;

@RestController
public class Strudentcontroller {
	@Autowired
	Studentserv service;
	
	@PostMapping("addstudent")
	public Studententity add(@RequestBody Studententity ss) {
		return service.saveinfo(ss);
	}
	@PostMapping("addnstudent")
	public List<Studententity> addndetails(@RequestBody List<Studententity> ss){
		return service.savedetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<Studententity> show(){
		return service.showinfo();
		
	}
	//show by id
	@GetMapping("showdetbyid/{id}")
		public Optional<Studententity> showid(@PathVariable int id){
			return service.showbyid(id);
		}
	
	@PutMapping("update")
	public Studententity modify(@RequestBody Studententity ss ) {
		return service.changeinfo(ss);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Studententity ss) {
		return service.updateinfobyid(id,ss);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody Studententity ss) {
			service.deleteinfo(ss);
			return "Deleted successfully";
		}
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		service.deleteid(id);
	}
	
	@DeleteMapping("delparamid")
	public void deletemyparamid (@RequestParam int id) {
		service.deletepid(id);
	}}
