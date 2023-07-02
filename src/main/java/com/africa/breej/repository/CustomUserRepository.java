package com.africa.breej.repository;

import com.africa.breej.model.user.User;

import java.util.Optional;

public interface CustomUserRepository {
//    Page<User> findUserByFilters(HashMap<String, Object> filters, LocalDateTime from, LocalDateTime to, Pageable pageable);

//    List<UserReport> userOverviewAggregation(LocalDateTime from, LocalDateTime to);

    Optional<User> findByUsername(String username);

}
