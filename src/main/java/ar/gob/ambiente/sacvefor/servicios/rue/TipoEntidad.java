
package ar.gob.ambiente.sacvefor.servicios.rue;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase para manipular los Tipos de Entidad provenientes del servicio de RUE
 * Empresa de Transporte
 * Productor
 * Transformador
 * Empresa Exportadora
 * Transportista
 * Varios
 * etc
 * @author rincostante
 */
@XmlRootElement
public class TipoEntidad implements Serializable {

    private Long id;
    private String nombre;

    /******************
     * Constructores **
     ******************/   
    public TipoEntidad(){
        this.id = Long.valueOf(0);
        this.nombre = "default";
    }
    
    public TipoEntidad(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
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
        if (!(object instanceof TipoEntidad)) {
            return false;
        }
        TipoEntidad other = (TipoEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id: ").append(id).
                append(" nombre: ").append(nombre).toString();
    }
}
