package com.example.demo_testing.repo;
import com.example.demo_testing.entity.*;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Human,String> {
}
