package com.abc.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.pizza.entity.VegetableAccount;
import com.abc.pizza.exceptions.InvalidUserException;


@Service

public interface PizzaAccountService 
{
	
	public List<PizzaAccount> getAllvegetable();
	public List<PizzaAccount> filterByCostHtoL();
	public List<PizzaAccount> filterByCostLtoH();	
	public boolean insertvegetable(PizzaAccount p);
	public PizzaAccount searchvegetable(int pizzaId);
	 
}
