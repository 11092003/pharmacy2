package com.example.JPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


	@Entity
	public class additionalmod {

		@Id
		private int id;
		private int price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	}

