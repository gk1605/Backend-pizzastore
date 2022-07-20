package com.abc.pizza.dto;

import java.util.Objects;

public class PizzaAdminResponseDTOClient 
{
	private int pizzaId;
	private String userName;
	private String phoneNumber;
	private String userAddress;
	private String emailId;
	private String pizzaName;
	private boolean pizzastatus;	
	private int pizzaAmount;
	public VegetableAdminResponseDTOClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PizzaAdminResponseDTOClient(int pizzaId, String userName, String phoneNumber, String userAddress,
			String emailId, String pizzaName, boolean pizzastatus, int pizzaAmount) {
		super();
		this.pizzaId = pizzaId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.userAddress = userAddress;
		this.emailId = emailId;
		this.pizzaName =pizzaName;
		this.pizzastatus = pizzastatus;
		this.pizzaAmount = pizzaAmount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailId, phoneNumber,pizzaAmount,pizzaId, pizzaName, pizzastatus, userAddress, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaAdminResponseDTOClient other = (PizzaAdminResponseDTOClient) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(phoneNumber, other.phoneNumber)
				&& pizzaAmount == other.pizzaAmount && pizzaId == other.pizzaId
				&& Objects.equals(pizzaName, other.pizzaName) && pizzastatus == other.pizzastatus
				&& Objects.equals(userAddress, other.userAddress) && Objects.equals(userName, other.userName);
	}
	
}

