package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
}
