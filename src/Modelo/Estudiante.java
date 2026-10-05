/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisc
 */
public class Estudiante {
    
    private Integer idEstudiante;
    private String Carnet;
    private String FirstName;
    private String SecondName;
    private String LastName;
    private String Direccion;
    private int Telefono;
    private String Carrera;
    private String FechaNacimiento;
    private String FechaIngreso;
    private Double CuotaMensual;
    
    
    public Estudiante() {
        
    this.idEstudiante=0;
    this.Carnet="";
    this.FirstName="";
    this.SecondName="";
    this.LastName="";
    this.Direccion="";
    this.Telefono=0;
    this.Carrera="";
    this.FechaNacimiento="";
    this.FechaIngreso="";
    this.CuotaMensual=0.0;
    }

    public Estudiante(Integer idEstudiante, String Carnet, String FirstName, String SecondName, String LastName, String Direccion, int Telefono, String Carrera, String FechaNacimiento, String FechaIngreso, Double CuotaMensual) {
        this.idEstudiante = idEstudiante;
        this.Carnet = Carnet;
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.LastName = LastName;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Carrera = Carrera;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaIngreso = FechaIngreso;
        this.CuotaMensual = CuotaMensual;
    }

    public Estudiante(String Carnet, String FirstName, String SecondName, String LastName, String Direccion, int Telefono, String Carrera, String FechaNacimiento, String FechaIngreso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Double getCuotaMensual() {
        return CuotaMensual;
    }

    public void setCuotaMensual(Double CuotaMensual) {
        this.CuotaMensual = CuotaMensual;
    }
    
   
    
    
}
