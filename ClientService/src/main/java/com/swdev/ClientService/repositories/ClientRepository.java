package com.swdev.ClientService.repositories;

import com.swdev.ClientService.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
