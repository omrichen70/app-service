package com.appservice.all.Postgres;

import com.appservice.all.Entities.Course;
import com.appservice.all.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
