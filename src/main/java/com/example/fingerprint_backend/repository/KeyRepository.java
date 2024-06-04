package com.example.fingerprint_backend.repository;

import com.example.fingerprint_backend.entity.KeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyRepository extends JpaRepository<KeyEntity, String> {
}
