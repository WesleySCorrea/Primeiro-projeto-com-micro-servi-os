package com.wesleyscorrea.hrworker.repositories;

import com.wesleyscorrea.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
