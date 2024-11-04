package ua.edu.ucu.apps.lab8.appuser;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser>findUserByEmail(String email);

    List<AppUser> findAll();
}