package com.shimigui.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimigui.WebServices.entities.BaseEntity;

public interface EntityRepository<P extends BaseEntity<P>> extends JpaRepository<P, Integer> {

}
