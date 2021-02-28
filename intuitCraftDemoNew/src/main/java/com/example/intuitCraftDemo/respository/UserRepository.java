package com.example.intuitCraftDemo.respository;

import com.example.intuitCraftDemo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Account, Integer> {

    Account findAccountByEmailAddress(String emailAddress);
}
