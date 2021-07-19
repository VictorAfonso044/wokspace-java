package bol.com; 
import org.springframework.context.annotation.Configuration;

import bol.com.metadados.MetadadosUtil;

@Configuration
public class GenericAppConfig {

	public MetadadosUtil getMetadados() {
		return new MetadadosUtil();
	}

}
