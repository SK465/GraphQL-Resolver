package com.example.graphQLResolver.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQLResolver.domain.Activity;
import com.example.graphQLResolver.repository.ActivityRepository;

@Component
public class Query implements GraphQLQueryResolver{
    @Autowired
	ActivityRepository activityRepository;



	Activity findActivity(String id) {
		
		return find(id);

	}
	
	Activity find(String id) {
		Optional<Activity> activityOptional = activityRepository.findById(id);
		if (!activityOptional.isPresent() || activityOptional.toString().isEmpty()) {
			System.out.println("activity not found getActivityByID  :" + id);
		}
		return activityOptional.get();

	}
}
