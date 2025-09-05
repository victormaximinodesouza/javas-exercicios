package entities;

import java.util.Date;

public class Order {
	
	
	private Date data;
	private Javas product;
	
	
	
	
	public Order(Date date, Javas product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}




	public Date getData() {
		return data;
	}




	public void setData(Date data) {
		this.data = data;
	}




	public Javas getProduct() {
		return product;
	}




	public void setProduct(Javas product) {
		this.product = product;
	}
	
	
}
