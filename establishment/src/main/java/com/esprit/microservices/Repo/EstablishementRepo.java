package com.esprit.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservices.entity.Establishement;

@Repository
public interface EstablishementRepo extends JpaRepository<Establishement, Long> {


}
