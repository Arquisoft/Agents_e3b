package asw.participants;

import org.springframework.http.ResponseEntity;

import asw.participants.web_service.request.PeticionInfoREST;
import asw.participants.web_service.responses.RespuestaInfoREST;

public interface GetParticipantInfo {

	public ResponseEntity<RespuestaInfoREST> getPOSTpetition(PeticionInfoREST peticion);

}
