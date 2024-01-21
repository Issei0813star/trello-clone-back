package org.app.trellocloneback.repository;

import org.app.trellocloneback.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
