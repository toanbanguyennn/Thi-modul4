package com.example.thi_pass_md4.common;

import java.util.List;
import java.util.Optional;

public interface ICRUDService<E> {
    E save(E e);

    void deleteById(Long id);

    Optional<E> findById(Long id);

    List<E> findAll();
}
