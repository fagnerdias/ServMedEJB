package ejb;

import dao.ConsultaDao;
import dao.PacienteDao;
import interfaces.IMedico;
import modelo.Consulta;
import modelo.Consultorio;
import modelo.Medico;
import modelo.Paciente;

public class MedicoEJB implements IMedico {

	@EJB PacienteDao pDao;
	@EJB ConsultaDao cDao;
	boolean finalizada;
	
	@Override
	public void iniciarConsulta(Paciente paciente, Consultorio consultorio) {
		String historico = pDao.historicoPaciente(paciente, consultorio);
		this.finalizada = false;
		
	}
	
	@Override
	public void atualizarAvaliacao(Consulta consulta) {
		cDao.editar(consulta);
	}
	
	@Override
	public void finalizarConsulta(Paciente paciente) {
		this.finalizada = true;
	}

	
}
