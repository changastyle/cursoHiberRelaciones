package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion implements Serializable
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCalle()
    {
        return calle;
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        return "Direccion{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
}
