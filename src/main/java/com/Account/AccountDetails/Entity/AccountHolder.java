package com.Account.AccountDetails.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account_holder")
public class AccountHolder {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "balance")
  private String balance;

}