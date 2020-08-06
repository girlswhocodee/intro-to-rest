package com.stayready.poll_application.repositories;

import com.stayready.poll_application.domain.Poll;

import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
    
}