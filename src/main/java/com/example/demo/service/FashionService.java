package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fashion;


@Service
public class FashionService {
	@Autowired
	com.example.demo.repo.FashionRepo fashionrepo;
	
	public Fashion addFashionToDB(Fashion fashion) {
		return fashionrepo.save(fashion);
		
	}
	

	public  List<Fashion> getAllFashion() {
		// TODO Auto-generated method stub
		return fashionrepo.findAll();
	}
	public Fashion getFashionbyID(int id) {
		return fashionrepo.findById(id).orElse(new Fashion());
		
	}
	public List <Fashion> addAllFashiontoDB(List<Fashion>fashionList){
		return fashionrepo.saveAll(fashionList);
	}
	

}
