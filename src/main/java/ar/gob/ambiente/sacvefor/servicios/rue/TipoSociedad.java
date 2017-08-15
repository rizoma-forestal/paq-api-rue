
package ar.gob.ambiente.sacvefor.servicios.rue;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Tipos de Sociedad provenientes del servicio de RUE
 * Sociedad Anónima
 * Sociedad de Responsabilidad Limitada
 * Sociedad de hecho
 * etc
 * @author rincostante
 */

@XmlRootElement
public class TipoSociedad implements Serializable {

    private Long id;
    private String nombre;
    private String sigla;    
    
    /******************
     * Constructores **
     ******************/   
    public TipoSociedad(){
        this.id = Long.valueOf(0);
        this.nombre = "default";
        this.sigla = "default";
    }
    
    public TipoSociedad(Long id, String nombre, String sigla){
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
    }

    /**********************
     * Métodos de acceso **
     **********************/     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoSociedad)) {
            return false;
        }
        TipoSociedad other = (TipoSociedad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" nombre: ").append(nombre).
                append(" sigla: ").append(sigla).toString();
    }
    
}
