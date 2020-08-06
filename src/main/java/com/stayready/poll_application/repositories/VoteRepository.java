package com.stayready.poll_application.repositories;

import com.stayready.poll_application.domain.Vote;

import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
    
}