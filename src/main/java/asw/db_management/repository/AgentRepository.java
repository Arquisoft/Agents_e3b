package asw.db_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asw.db_management.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
	
	/**
	 * Método que devuelve el Participante el cual es buscado por email
	 * en la base de datos
	 * @param email del agente
	 * @return El Participante con dicho email
	 */
	public Agent findByEmail(String email);
	
	/**
	 * Método que devuelve el Agente el cual es buscado por ident
	 * en la base de datos
	 * @param ident del agente
	 * @return El agente con dicho ident
	 */
	public Agent findByIdent(String ident);
	
}
