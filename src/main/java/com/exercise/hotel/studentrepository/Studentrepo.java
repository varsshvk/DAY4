package com.exercise.hotel.studentrepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.hotel.studententity.Studententity;
//import org.springframework.stereotype.Repository;



public interface Studentrepo extends JpaRepository<Studententity, Integer>{
	

}
