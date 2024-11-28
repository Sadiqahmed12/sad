package com.Account.AccountDetails.Repository;

import com.Account.AccountDetails.Entity.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<AccountHolder, Long> {
}
