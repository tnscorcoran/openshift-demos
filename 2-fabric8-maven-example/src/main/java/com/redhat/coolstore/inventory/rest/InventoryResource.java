package com.redhat.coolstore.inventory.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.redhat.coolstore.inventory.model.Inventory;
import com.redhat.coolstore.inventory.service.InventoryService;

@Path("/inventory")

public class InventoryResource {
	
	@Inject
	private InventoryService inventoryService;
	
	@GET
	@Produces("application/json")
	@Path("/{itemId}")
	public Inventory getInventory(@PathParam("itemId") String itemId) {
		Inventory inv = inventoryService.getInventory(itemId);
		if(inv == null){
			throw new NotFoundException();
		}
		return inv;
	}
}
