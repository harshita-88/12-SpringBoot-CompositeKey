package in.harshita.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harshita.entity.Account;
import in.harshita.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
