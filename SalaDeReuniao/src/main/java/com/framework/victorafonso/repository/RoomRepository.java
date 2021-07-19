package com.framework.victorafonso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.framework.victorafonso.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
