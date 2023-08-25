package com.exercise.hotel.studentservice;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.hotel.studententity.Studententity;
import com.exercise.hotel.studentrepository.Studentrepo;

@Service
public class Studentserv {
	@Autowired
	Studentrepo repository;
	
	public Studententity saveinfo(Studententity ss) {
		return repository.save(ss);
	}
	public List<Studententity> savedetails(List<Studententity> ss){
		return (List<Studententity>)sr.saveAll(ss);
	}
	public List<Studententity> showinfo(){
		return repository.findAll();
	}
	public Optional<Studententity> showinfo(int id){
		return repository.findById(id);
	}
	//get by id
	public Optional<Studententity> showbyid(int id){
		return repository.findById(id);
	}
	public Studententity changeinfo(Studententity ss) {
		return repository.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int id,Studententity ss) {
		repository.saveAndFlush(ss);
		if(repository.existsById(id)) {
			return "UPDATED";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteinfo(Studententity ss) {
		repository.delete(ss);
	}
	
	public void deleteid(int id) {
		repository.deleteById(id);
	}
	
	public void deletepid(int id) {
		repository.deleteById(id);
	}
	

}