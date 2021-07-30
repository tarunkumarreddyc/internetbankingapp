package com.cg.iba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iba.entities.Admin;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.service.IAdminService;

@RestController
public class AdminController {

	@Autowired
	IAdminService adminService;

	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin) throws InvalidDetailsException {

		return adminService.addAdmin(admin);
	}
	
	@PutMapping("/admin")
	public Admin UpdateAdmin(@RequestBody Admin admin) throws InvalidDetailsException {

		return adminService.updateAdmin(admin);
	}
	
	@GetMapping("/admin")
	public Admin getAdmin(long adminId) throws DetailsNotFoundException {
		
		return adminService.findAdminById(adminId);
	}
	
	@DeleteMapping("/admin")
	public boolean deleteAdmin(long adminId) throws DetailsNotFoundException {
		
		return adminService.removeAdmin(adminId);
	}
	
	@GetMapping("/admins")
	public List<Admin> GetAllAdmins() throws EmptyListException {
		
		return adminService.listAllAdmins();
	}
	

}
