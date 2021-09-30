package Controlador;

import Dao.Crud;
import Modelo.Conexion;
import Vista.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SYSTEMKEL
 */
public class ControladorCtaegoria implements Crud {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement sp;
    ResultSet rs;

    @Override
    public List Listar() {
        List<Categoria> listarCategoria = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIA";
        try {
            con = cn.conexcion();
            sp = con.prepareStatement(sql);
            rs = sp.executeQuery();
            while (rs.next()) {
                Modelo.Categoria cat = new Modelo.Categoria();
                cat.setIdCategoria(rs.getInt(1));
                cat.setCategoria(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
                cat.setEstado(rs.getInt(4));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return listarCategoria;
    }

}
