package com.web.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.web.api.entities.User;
import com.web.api.repositories.UserRepository;
import com.web.api.services.exceptions.DatabaseException;
import com.web.api.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Long id) {
		if (!userRepository.existsById(id)) {
			throw new ResourceNotFoundException(id);
		}
		try {
			userRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
