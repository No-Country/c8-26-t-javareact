package com.nocountry.entidades;

public class Service {

    @NotNull(message = "No puede ser nulo")
	@NotEmpty(message = "No puede ser vacío")
	@Column(name = "nombre_usuario", nullable = false, length = 60)
	private String typeOfService;

    private boolean serviceIsActive;
	
    private Service(){
        String s;
        
    }
    //TODO Methods to be made
}
