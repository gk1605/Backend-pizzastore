package com.abc.pizza.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.abc. pizza.entity.PizzaAccount;

@Entity
public class PizzaAccount implements Comparable<PizzaAccount>
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int pizzaId;
	public String pizzaName;
	public String pizzaType;
	public int pizzaAmount;
	public String picture;

	public PizzaAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PizzaAccount(int pizzaId, String pizzaName, String pizzaType, int pizzaAmount, String picture) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.pizzaType = pizzaType;
		this.pizzaAmount = pizzaAmount;
		this.picture = picture;
	}

	public int getpizzaId() {
		return pizzaId;
	}

	public void set pizzaId (int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getpizzaName() {
		return pizzaName;
	}

	public void setpizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getpizzaType() {
		return pizzaType;
	}

	public void setpizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getpizzaAmount() {
		return pizzaAmount;
	}

	public void setpizzaAmount(int pizzaAmount) {
		this.pizzaAmount = pizzaAmount;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public int hashCode() {
		return Objects.hash(picture, pizzaAmount, pizzaId, pizzaName, pizzaType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaAccount other = (PizzaAccount) obj;
		return Objects.equals(picture, other.picture) && pizzaAmount == other.pizzaAmount && pizzaId == other.pizzaId
				&& Objects.equals(pizzaName, other.pizzaName) && Objects.equals(pizzaType, other.pizzaType);
	}

	@Override
	public String toString() {
		return "PizzaAccount [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", pizzaType=" + pizzaType
				+ ", pizzaAmount=" + pizzaAmount + ", picture=" + picture + "]";
	}

	@Override
	public int compareTo(PizzaAccount o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
