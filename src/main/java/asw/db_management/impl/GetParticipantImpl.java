package asw.db_management.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.db_management.GetParticipant;
import asw.db_management.model.Participant;
import asw.db_management.repository.ParticipantRepository;


@Service
public class GetParticipantImpl implements GetParticipant {
	
	private ParticipantRepository repository;
	
	@Autowired
	public GetParticipantImpl(ParticipantRepository repository) {
		this.repository = repository;
	}
	
	
	/**
	 * Método que devuelve el Participante buscado por email
	 * Hace uso del método findByEmail (mapeador)
	 */
	@Override
	public Participant getParticipant(String email) {
		
		return this.repository.findByEmail(email);
	}

}
