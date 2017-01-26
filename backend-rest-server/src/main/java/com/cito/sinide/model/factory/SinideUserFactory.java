package com.cito.sinide.model.factory;

import org.springframework.security.core.authority.AuthorityUtils;

import com.cito.sinide.domain.entity.User;
import com.cito.sinide.model.security.SinideUser;

public class SinideUserFactory {
	public SinideUser create(User user){
		//TODO: Actualizar esto a medida que se vayan agregando atributos a los usuarios
		SinideUser salida = new SinideUser(user.getId(),
			      user.getUsername(),
			      user.getPassword(),
			      user.getEmail(),
			      user.getLastPasswordReset(),
			      AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities()));
		return salida ;
	}
}
