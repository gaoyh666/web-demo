

http://localhost:8080/web-demo/product

http://localhost:8080/web-demo/product/1


DROP TABLE IF EXISTS t_app_config;
CREATE TABLE t_app_config (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  param_key varchar(255) DEFAULT NULL,
  param_name varchar(255) DEFAULT NULL,
  param_value varchar(255) DEFAULT NULL,
  is_deleted tinyint DEFAULT '0' COMMENT '1 表示删除，0 表示未删除。',
  remark varchar(255) DEFAULT NULL,
  create_time datetime DEFAULT CURRENT_TIMESTAMP,
  update_time datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.dialect', 'demo_app_config', 'org.hibernate.dialect.MySQLDialect' );
INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.show_sql', 'demo_app_config', 'true' );
INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.jdbc.batch_size', 'demo_app_config', '200' );
INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.jdbc.fetch_size', 'demo_app_config', '50' );
INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.hbm2ddl.auto', 'demo_app_config', 'update' );
INSERT INTO t_app_config (param_key, param_name, param_value) values ( 'hibernate.format_sql', 'demo_app_config', 'true' );




<Resource name="jdbc/exampleDB"
    auth="Container"
    type="javax.sql.DataSource"
    factory="org.apache.tomcat.jdbc.pool.DataSourceFactory"
    testWhileIdle="true"
    testOnBorrow="true"
    testOnReturn="false"
    validationQuery="SELECT 1"
    validationInterval="30000"
    timeBetweenEvictionRunsMillis="30000"
    maxActive="100"
    minIdle="10"
    maxWait="10000"
    initialSize="10"
    removeAbandonedTimeout="60"
    removeAbandoned="true"
    logAbandoned="true"
    minEvictableIdleTimeMillis="30000"
    jmxEnabled="true"
    jdbcInterceptors="org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;
        org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer"
    username="springuser"
    password="ThePassword"
    driverClassName="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost:3306/db_example" />


mvn mybatis-generator:generate


