package com.crud.loader.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.crud.loader.config.model.EnvConfig;
import lombok.Getter;

import java.io.File;

/**
 *
 * @author Virag Tripathi
 *
 */

@Getter
public enum LoaderConfig {
    INSTANCE;
    final String CONFIG_LOCATION_PROPERTY = "crud.loader.configLocation";
    final ObjectMapper yamlObjectMapper;
    final ObjectMapper objectMapper;

    @Getter
    EnvConfig envConfig;

    LoaderConfig() {
        objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false).configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
        yamlObjectMapper = new ObjectMapper(new YAMLFactory()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false).configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);

        try {
            envConfig = yamlObjectMapper.readValue(new File(System.getProperty(CONFIG_LOCATION_PROPERTY).concat(File.separator).concat("config.yml")), EnvConfig.class);
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }

}