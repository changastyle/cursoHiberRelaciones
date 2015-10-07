package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario  implements java.io.Serializable 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="password")
    private String contrasena;
    @OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private Direccion direccion;

    public Usuario() 
    {
    }

    public Usuario(Integer id, String nombre, String contrasena, Direccion direccion)
    {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getContrasena()
    {
        return contrasena;
    }

    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }
    
  
    

    @Override
    public String toString()
    {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", direccion=" + direccion + '}';
    }

    
}


