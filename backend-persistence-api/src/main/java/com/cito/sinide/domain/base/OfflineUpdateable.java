package com.cito.sinide.domain.base;

import com.cito.sinide.domain.OfflineUpdateableStatus;

public interface OfflineUpdateable{
	/**
	 * Código generado al momento de la creación y actualización de entidad.
	 * Al momento de crearse una instancia de una clase OfflineUpdateable, o de modificarse una,
	 * se debe actualizar este código.
	 * @return
	 */
	String getCreationCode();
	/**
	 * Código devuelto por el server cuando se actualiza una entidad actualizable offline
	 * @return
	 */
	String getConfirmationCode();
	/**
	 * Estado de la entidad. Instancia del enumerado {@link OfflineUpdateableStatus}.
	 * @return
	 */
	String getStatus();
}
