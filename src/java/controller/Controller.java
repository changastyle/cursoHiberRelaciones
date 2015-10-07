
package controller;

import java.util.ArrayList;
import model.*;

public class Controller
{
    public static ArrayList<Usuario>findAllUsuarios()
    {
        return daos.UsuariosDAO.findAll();
    }
}
