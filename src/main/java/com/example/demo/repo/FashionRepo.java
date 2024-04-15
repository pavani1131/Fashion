package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Fashion;
public interface FashionRepo extends JpaRepository<Fashion, Integer> {

}
