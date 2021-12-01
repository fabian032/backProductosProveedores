package co.edu.unbosque.backSucursal2.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proveedores")
public class Proveedores {
	@Id
	private String _id;
	
	private String nit_proveedor;
	private String ciudad_proveedor;
	private String direccion_proveedor;
	private String nombre_proveedor;
	private String telefono_proveedor;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(String nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
	

}
