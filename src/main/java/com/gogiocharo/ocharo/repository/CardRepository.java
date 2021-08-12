package com.gogiocharo.ocharo.repository;

import com.gogiocharo.ocharo.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
