package co.com.ceiba.parqueadero.repositorio;

import co.com.ceiba.parqueadero.dominio.Vehiculo;
import co.com.ceiba.parqueadero.entidad.VehiculoEntity;

public class VehiculoRepositorio {
	public static VehiculoEntity convertirAEntity(Vehiculo vehiculo) {
		VehiculoEntity entity = new VehiculoEntity();
		entity.setId(vehiculo.getId());
		entity.setTipo(vehiculo.getTipo());
		entity.setPlaca(vehiculo.getPlaca());
		entity.setCilindrada(vehiculo.getCilindrada());
		
		return entity;
	}
	
	public static Vehiculo convertirADominio(VehiculoEntity entity) {
		Vehiculo vehiculo = null;
		
		if(entity != null) {
			vehiculo = new Vehiculo(entity.getId(), entity.getTipo(), entity.getPlaca(), entity.getCilindrada()); 
		}
		
		return vehiculo;
	}
}