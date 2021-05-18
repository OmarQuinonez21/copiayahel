/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class persona {
String nombre;
String apellido;
String correo;
int tel;

public persona(){
    this.nombre="";
    this.apellido="";
    this.correo="";
    this.tel=0;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getApellido(){
    return apellido;

}
public void setApellido(String apellido){
    this.apellido=apellido;
}
public String getCorreo(){
    return correo;
}
public void setCorreo(String correo){
    this.correo=correo;
}
public int getTel(){
    return tel;
}
public void setTel(int tel){
    this.tel=tel;
}
}