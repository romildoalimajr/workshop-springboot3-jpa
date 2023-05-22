package net.kalangos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kalangos.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
