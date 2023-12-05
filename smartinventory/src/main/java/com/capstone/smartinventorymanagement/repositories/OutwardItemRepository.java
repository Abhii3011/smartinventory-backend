package com.capstone.smartinventorymanagement.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.smartinventorymanagement.entity.OutwardItem;

@Repository
public interface OutwardItemRepository extends JpaRepository<OutwardItem, String>{

}
