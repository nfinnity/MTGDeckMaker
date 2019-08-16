package com.cabralduo.mtgdeckmaker.repository;

import com.cabralduo.mtgdeckmaker.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepository extends CrudRepository<Card, String> {

    Optional<List<Card>> findAllByNameContaining(String name);
}
