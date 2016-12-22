package action;

import com.opensymphony.xwork2.ActionSupport;
import modelo.Persona;

public class Registro extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Persona personBean;

	public String execute() throws Exception {

		// call Service class to store personBean's state in database

		return SUCCESS;

	}

	public Persona getPersonBean() {

		return personBean;

	}

	public void setPersonBean(Persona person) {

		personBean = person;

	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "Nombre es obligatorio.");
		}
		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "correo electrónico es obligatorio.");
		}
		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "La edad es obligatorio y debe ser mayor de 18 años");
		}
		if(personBean.getPasword().length()==0){
			addFieldError("personBean.age", "La contraseña es obligatorio ");
		}
	}

}
