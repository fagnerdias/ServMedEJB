package interfaces;

import javax.ejb.Local;

import modelo.Medico;

@Local
public interface IMedico {
	void adicionarMedico(Medico medico);
	void removerMedico(Medico medico);
	void listarMedico();
	void atualizarMedico(Medico medico);
}
