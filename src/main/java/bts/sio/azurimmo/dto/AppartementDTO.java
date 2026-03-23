package bts.sio.azurimmo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppartementDTO {
	 private Long id;
	 private String numero;
	 private String description;
	 private Float surface;
	 private Integer nbPieces;

}