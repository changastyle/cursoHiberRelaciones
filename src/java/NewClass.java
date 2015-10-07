
import hibernate.HibernateUtil;
import model.Direccion;
import model.Usuario;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NICOLAS
 */
public class NewClass
{
    public static void main(String args[])
    {
        model.Usuario usuario = new Usuario();
        usuario.setNombre("Pepe");
        usuario.setContrasena("123456");
        
        Direccion direccion = new Direccion();
        direccion.setNumero(2);
        direccion.setCalle("Vilcapugio");
        
        usuario.setDireccion(direccion);

        System.out.println( usuario.toString() );
        
//        Session sesion = HibernateUtil.getSessionFactory().openSession();
//        sesion.beginTransaction();
//        sesion.persist(usuario);
//        sesion.getTransaction().commit();
        
        daos.AbstractDAO.persist(usuario);
        
        for(Usuario usuarios : controller.Controller.findAllUsuarios())
        {
            System.out.println("" + usuarios.toString());
        }
    }
}
