package com.cg.iba.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iba.entities.Admin;
import com.cg.iba.exception.DetailsNotFoundException;
import com.cg.iba.exception.EmptyListException;
import com.cg.iba.exception.InvalidDetailsException;
import com.cg.iba.repository.IAdminRepository;
import com.cg.iba.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminRepository adminRepo;

	@Override
	public Admin addAdmin(Admin admin) throws InvalidDetailsException {
		if (validateAdmin(admin)) {
			adminRepo.save(admin);
			return admin;
		} else {
			throw new InvalidDetailsException("Invalid Details for admin");
		}

	}

	@Override
	public Admin findAdminById(long userId) throws DetailsNotFoundException {

		Optional<Admin> admin = adminRepo.findById(userId);
		if (admin.isPresent())
			return admin.get();
		else
			throw new DetailsNotFoundException("No Record Found for adminId " + userId);
	}

	@Override
	public Admin updateAdmin(Admin admin) throws InvalidDetailsException {
		if (validateAdmin(admin)) {
			adminRepo.save(admin);
			return admin;
		} else {
			throw new InvalidDetailsException("Invalid Details for admin " + admin.toString());
		}

	}

	@Override
	public boolean removeAdmin(long userId) throws DetailsNotFoundException {
		Optional<Admin> admin = adminRepo.findById(userId);
		if (admin.isPresent()) {
			adminRepo.deleteById(userId);
			return true;
		} else {
			throw new DetailsNotFoundException("No record found for admin" + admin.toString());
		}
	}

	@Override
	public List<Admin> listAllAdmins() throws EmptyListException {
		
		if(adminRepo.findAll().isEmpty()) {
			
			throw new EmptyListException("Did not find records for admins");
		}else {
			return adminRepo.findAll();
		}
		
	}

	public boolean validateAdmin(Admin admin) {

		Pattern digit = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

		if (admin.getUserId() > 0) {
			Matcher hasDigit = digit.matcher(admin.getAdminName());
			Matcher hasSpecial = special.matcher(admin.getAdminName());

			System.out.println(!hasDigit.find());
			System.out.println(!hasSpecial.find());

			return !hasDigit.find() && !hasSpecial.find() && admin.getAdminEmailId().contains("@");
		} else {

			return false;
		}

	}

}
