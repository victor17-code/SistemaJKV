package Controlador;

import Dao.Crud;
import Modelo.Conexion;
import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        List<Categoria> listaCategoria = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIA";
        try {
            con = cn.getConnection();
            System.out.println(con);
            sp = con.prepareStatement(sql);
            rs = sp.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setIdCategoria(rs.getInt(1));
                cat.setCategoria(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
                
                listaCategoria.add(cat);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
        return listaCategoria;
    }

}
