package in.harshita;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.harshita.entity.Account;
import in.harshita.entity.AccountPk;
import in.harshita.repo.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctx =
		SpringApplication.run(Application.class, args);
		AccountRepository repo = cctx.getBean(AccountRepository.class);
		
		/*AccountPk pk = new AccountPk();
		pk.setAccNum(122334432);
		pk.setAccType("savings");
		
		Account acc = new Account();
		acc.setHolderName("Harshita");
		acc.setBranch("Bangalore btm");
		acc.setAccountPk(pk);
		
		repo.save(acc);
		System.out.println("record saved...");
		*/
		AccountPk pk = new AccountPk();
		pk.setAccNum(122334432);
		pk.setAccType("savings");
		
		Optional<Account> er = repo.findById(pk);
		if(er.isPresent()) {
			System.out.println("record found");
		}
		
	}

}
