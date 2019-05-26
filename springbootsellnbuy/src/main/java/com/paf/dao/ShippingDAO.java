package com.paf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import com.paf.model.Shipping;
import com.paf.repository.ShippingRepository;

public class ShippingDAO {
	@Autowired
	ShippingRepository shippingRepository;
	
	/* SAVE A Shipping */
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	public Shipping save(Shipping ship) {
		return shippingRepository.save(ship);
	}
	
	/* SEARCH ALL Shipping */
	public List<Shipping> findAll(){
		return shippingRepository.findAll();
	}
	
	/* GET A Shipping */
	public Shipping findOne(int id) {
		Optional<Shipping> op = shippingRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		else {
			return null;
		}
	}
	
	/* DELETE A Shipping by id */
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	public void delete(Shipping ship) {
	shippingRepository.delete(ship);
	}
}
