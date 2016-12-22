package modelo;

public class Persona {
	private String firstName;
    private String lastName;
    private String lastName2;
    private String email;
    private int age;
    private String pasword;
    private String direccion;
 
    public String getFirstName()
    {
        return firstName;
    }
 
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
 
    public String getLastName()
    {
        return lastName;
    }
 
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
 
    public String getEmail()
    {
        return email;
    }
 
    public void setEmail(String email)
    {
        this.email = email;
    }
 
    public int getAge()
    {
        return age;
    }
 
    public void setAge( int age)
    {
        this.age = age;
    }
    public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 
    public String toString()
    {
        return "Nombre: " + getFirstName() + " Primer apellido:  " + getLastName() +"SEgundo Apellido:    "+getLastName2()+ 
        "Direccion:  "	+getDireccion()+ " Email:      " + getEmail() + " Age:      " + getAge()+"Contraseá" ;
    }

	

	
}
