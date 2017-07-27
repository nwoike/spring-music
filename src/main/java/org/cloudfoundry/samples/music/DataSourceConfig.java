package org.cloudfoundry.samples.music;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class DataSourceConfig extends AbstractCloudConfig {

	@Bean
	public DataSource cloudDataSource() {
		return connectionFactory().dataSource();
	}
}
