package interfaces;

import javax.ejb.Local;

import modelo.Consulta;
import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

@Local
public interface IConsulta {
	
	void adicionarConsulta(Medico medico, Paciente paciente, Consultorio consultorio);
	void avaliar(Consulta consulta);
	void listarConsulta();
	
}
