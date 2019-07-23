package com.kss.dataimport.repository;


import com.arangodb.springframework.repository.ArangoRepository;
import com.kss.dataimport.entity.ChildOf;

public interface ChildOfRepository extends ArangoRepository<ChildOf, String> {

}
