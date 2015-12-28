package springbook.user.sqlservice.updatable;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import springbook.user.sqlservice.UpdatableSqlRegistry;

public class EmbeddedDbSqlRegistryTest extends AbstractUpdatableSqlRegistryTest {
	
	EmbeddedDatabase db;
	
	@Override
	protected UpdatableSqlRegistry createUpdatableSqlRegistry() {
		db = new EmbeddedDatabaseBuilder()
			.setType(HSQL)
			.addScript().build();
		
			
		return null;
	}

}
