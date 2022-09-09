package com.example.thi_pass_md4.service.impl;

import com.example.thi_pass_md4.model.Country;
import com.example.thi_pass_md4.repository.CountryRepository;
import com.example.thi_pass_md4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CountryService implements ICountryService {

    @Autowired
    public CountryRepository countryRepository;
    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
