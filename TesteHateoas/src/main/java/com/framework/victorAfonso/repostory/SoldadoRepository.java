package com.framework.victorAfonso.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.framework.victorAfonso.entity.SoldadoEntity;

@Repository
public interface SoldadoRepository extends JpaRepository<SoldadoEntity, Long> {
}
