package com.whebsys.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whebsys.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
