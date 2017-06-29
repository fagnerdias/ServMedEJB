package interfaces;

import javax.ejb.Local;

import modelo.Consultorio;
import modelo.Medico;

@Local
public interface IConsultorio {
	
	void adicionarConsultorio(Consultorio consultorio);
	void adicionarMedico(Medico medico);
	void listarMedicos();
	void removerMedico();
	void removerConsultorio(Consultorio consultorio);
	void atualizarConsultorio(Consultorio consultorio);

}
