package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
}
