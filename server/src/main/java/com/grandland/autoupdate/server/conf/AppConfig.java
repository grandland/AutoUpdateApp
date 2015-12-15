package com.grandland.autoupdate.server.conf;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * AppConfig
 *
 * @author Allen Jin
 * @date 2015-11-06
 */

@Configuration
@ComponentScan({"com.grandland.autoupdate.server.persist",
        "com.grandland.autoupdate.server.service",
        "com.grandland.autoupdate.server.manage"})
@Import({ MvcConfig.class})
public class AppConfig {

    @Resource
    @Autowired
    private Environment env;


}
