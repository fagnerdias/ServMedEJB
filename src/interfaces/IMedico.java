package interfaces;

import javax.ejb.Local;

import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

@Local
public interface IMedico {
	void iniciarConsulta(Paciente paciente, Consultorio consultorio);
}
