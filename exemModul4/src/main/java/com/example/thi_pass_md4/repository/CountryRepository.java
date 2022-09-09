package com.example.thi_pass_md4.repository;

import com.example.thi_pass_md4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
