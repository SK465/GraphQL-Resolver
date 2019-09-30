package com.example.graphQLResolver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.graphQLResolver.domain.Activity;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

}