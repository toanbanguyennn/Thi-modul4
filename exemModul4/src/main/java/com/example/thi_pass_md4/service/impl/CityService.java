package com.example.thi_pass_md4.service.impl;

import com.example.thi_pass_md4.model.City;
import com.example.thi_pass_md4.repository.CityRepository;
import com.example.thi_pass_md4.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CityService implements ICityService {
    @Autowired
    public CityRepository cityRepository;
    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
