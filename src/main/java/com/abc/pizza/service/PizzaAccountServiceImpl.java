package com.abc.pizza.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.Normalizer.Form;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.abc.pizza.entity.*;
import com.abc.pizza.exceptions.*;
import com.abc.pizza.repository.*;
import com.abc.pizza.service.*;


@Service
public class PizzaAccountServiceImpl implements PizzaAccountService{
	
	@Autowired
	PizzaAccountRepository PizzaAccountRepository;

	

	@Override
	public List<PizzaAccount> getAllpizza () {
		// TODO Auto-generated method stub

	    return PizzaAccountRepository.findAll();
	}
	@Override
	public List<PizzaAccount> filterByCostLtoH(){
		List<PizzaAccount> ls =   PizzaAccountRepository.findAll();
		Collections.sort(ls, new Comparator<PizzaAccount>() {

			@Override
			public int compare(PizzaAccount o1, PizzaAccount o2) {
				
				return o1.getpizzaAmount()-o2.getpizzaAmount();
			}
		});
		return ls;
	
	}
	public List<PizzaAccount> filterByCostHtoL(){
		List<PizzaAccount> ls = PizzaAccountRepository.findAll();
		Collections.sort(ls, Collections.reverseOrder(new Comparator<PizzaAccount>() {

			@Override
			public int compare(PizzaAccount o1, PizzaAccount o2) {
				
				return o1.getpizzaAmount()-o2.getpizzaAmount();
			}
		}));
	
		return ls;
	}
	@Override
	public boolean insertpizza (PizzaAccount p) {
		PizzaAccount savedObject =   PizzaAccountRepository.save(p);
		
		return savedObject!=null?true:false;
	}
	@Override
	public PizzaAccount searchpizza (int vegetableId) {
		PizzaAccount obj1 =  PizzaAccountRepository.findById(pizzaId).get();
		return obj1;
	
	}
	
	
	
}

