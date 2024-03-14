package com.crud.loader.connections;

/**
 *
 * @author Virag Tripathi
 *
 */

public interface ConnectionProvider<Connection> {
    Connection getConnection(String connectionId);
}