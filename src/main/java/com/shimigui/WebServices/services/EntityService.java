package com.shimigui.WebServices.services;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;

import com.shimigui.WebServices.entities.BaseEntity;
import com.shimigui.WebServices.repositories.EntityRepository;
import com.shimigui.WebServices.services.exceptions.DatabaseException;
import com.shimigui.WebServices.services.exceptions.NotFoundException;

import jakarta.persistence.EntityNotFoundException;

public abstract class EntityService<E extends BaseEntity<E>> {
	protected EntityRepository<E> repository;

	public EntityService(EntityRepository<E> repository) {
		this.repository = repository;
	}

	public List<E> findAll() {
		try {
			return repository.findAll();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return null;
	}

	public E findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}

	public E insert(E obj) {
		return repository.save(obj);
	}

	public void delete(Integer id) {
		if (!repository.existsById(id))
			throw new NotFoundException(id);
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public E update(Integer id, E obj) {
		if (!repository.existsById(id))
			throw new NotFoundException(id);
		try {
			E entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new NotFoundException(id);
		}
	}

	protected abstract void updateData(E entity, E obj);
}
