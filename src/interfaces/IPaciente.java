package interfaces;

import javax.ejb.Local;

import modelo.Paciente;

@Local
public interface IPaciente {
	
	void adicionarPaciente(Paciente paciente);
	void removerPaciente(Paciente paciente);
	void listarPaciente();
	void atualizarPaciente(Paciente paciente);
}
