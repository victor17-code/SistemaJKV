
package Modelo;


public class Categoria {
    private int IdCategoria;
    private String Categoria;
    private String Descripcion;
    private int Estado;

    public Categoria() {
    }

    public Categoria(int IdCategoria, String Categoria, String Descripcion, int Estado) {
        this.IdCategoria = IdCategoria;
        this.Categoria = Categoria;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
