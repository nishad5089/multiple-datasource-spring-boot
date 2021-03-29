package com.multipledatasource.repository.user;

import com.multipledatasource.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdur Rahim Nishad
 * @since 2021/28/03
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
