package in.harshita.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPk {
	private String AccType;
	private Integer AccNum;

}
