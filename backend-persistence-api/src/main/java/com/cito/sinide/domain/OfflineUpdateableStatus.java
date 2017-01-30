package com.cito.sinide.domain;

/**
 * Posibles estados de las entidades que pueden actualizarse offline.
 * @author jmbalmaceda
 *
 */
public enum OfflineUpdateableStatus {
	/** Sin cambios para sincronizar */
	NO_CHANGES,
	/** Instancia creada pero no sincronizada al server. Requiere que se la cree en el server. */
	CREATED,
	/** Instancia actualizada luego de haber sido sincronizada con el server. Requiere que se actualice en el server. */
	UPDATED,
	/** Instancia eliminada luego de haber sido sincronizada con el server. Requiere que se elimine también en el server. */
	DELETED
}
