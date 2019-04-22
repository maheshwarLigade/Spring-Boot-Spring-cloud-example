package com.sbcloudoauth.oauthservice.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.sbcloudoauth.oauthservice.repository")
public class MongoConfig {

}