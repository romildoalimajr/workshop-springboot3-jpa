package net.kalangos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kalangos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
