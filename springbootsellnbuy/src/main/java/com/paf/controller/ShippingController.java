package com.paf.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.paf.dao.ShippingDAO;
import com.paf.model.Shipping;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
	@Autowired
	ShippingDAO shippingDAO;
	
	/* SAVE A Shipping*/
	@PostMapping("/shipping")
	public Shipping createShipping(@Valid @RequestBody Shipping ship) {
		return shippingDAO.save(ship);
	}
	
	/* GET ALL Shipping*/
	@GetMapping("/shipping")
	public List<Shipping> getAllEmployees(){
	return shippingDAO.findAll();
	}
	
	/* GET Shipping BY ID */
	@GetMapping("/shipping/{id}")
	public ResponseEntity<Shipping> getShippingById(@PathVariable(value="id") int shipId){
		Shipping ship = shippingDAO.findOne(shipId);

		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(ship);
	}
	
	/* UPDATE A Shipping BY ID */
	@PutMapping("/shipping/{id}")
	public ResponseEntity<Shipping> updateShipping(@PathVariable(value="id") int shipId, @Valid @RequestBody Shipping shipDetails){
		Shipping ship=shippingDAO.findOne(shipId);
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		ship.setId(shipDetails.getId());
		ship.setMid(shipDetails.getMid());
		ship.setAddress(shipDetails.getAddress());
		ship.setCost(shipDetails.getCost());
		Shipping updaShipping=shippingDAO.save(ship);
		return ResponseEntity.ok().body(updaShipping);
	}
	
	/*DELETE A Shipping*/
	@DeleteMapping("/shipping/{id}")
	public ResponseEntity<Shipping> deleteShipping(@PathVariable(value="id") int shipId){
		Shipping ship = shippingDAO.findOne(shipId);
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		shippingDAO.delete(ship);
		return ResponseEntity.ok().build();
	}
}
