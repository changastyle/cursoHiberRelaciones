package daos;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO
{
    public static ArrayList<model.Usuario> findAll()
    {
        ArrayList<model.Usuario> arr = new ArrayList<model.Usuario>();
        List<Object> listaProvisoria = daos.AbstractDAO.findAll(model.Usuario.class);
        
        for(Object o : listaProvisoria)
        {
            model.Usuario aux = (model.Usuario) o;
            arr.add(aux);
        }
        return arr;
    }
}
