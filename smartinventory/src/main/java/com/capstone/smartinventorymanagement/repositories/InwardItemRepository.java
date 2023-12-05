package com.capstone.smartinventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.smartinventorymanagement.entity.InwardItem;

@Repository
public interface InwardItemRepository extends JpaRepository<InwardItem, String>{

}