package com.redhat.coolstore.inventory.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PRODUCT_INVENTORY", uniqueConstraints = @UniqueConstraint(columnNames = "itemId"))
public class Inventory {

    private static final long serialVersionUID = -7304814219819778382L;

    @Id
    private String itemId;

    private String location;

    private int quantity;

    private String link;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
    
    
}
