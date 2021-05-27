package com.ust.pms.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description ="what I have mentionplz tell me plz ???")

public class Product {
	
	@ApiModelProperty(position=0,notes="product id is unnique and pk")
		private int productId;
	
	@ApiModelProperty(position=1,notes="product Name is Dog ")
		private String productName;
	
	@ApiModelProperty(position=2,notes="product quantityOnHand 1200")
		private int quantityOnHand;
	
	@ApiModelProperty(position=3,notes="product id is price",value="100")
		private int price;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(int productId, String productName, int quantityOnHand, int price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.quantityOnHand = quantityOnHand;
			this.price = price;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getQuantityOnHand() {
			return quantityOnHand;
		}

		public void setQuantityOnHand(int quantityOnHand) {
			this.quantityOnHand = quantityOnHand;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand="
					+ quantityOnHand + ", price=" + price + "]";
		}
		
		
		
}
