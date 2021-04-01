package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	private int pid;
	@Column(name = "productname")
	private String productName;
	private int price;
	@Column(name = "imagepath")
	private String imagePath;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String toString() {
		return "{\"pid\":" + pid + ",\"productname\":\"" + productName + "\",\"price\":" + price + ",\"imagepath\":\""
				+ imagePath + "\"}";
	}

}
