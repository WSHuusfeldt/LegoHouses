/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author APC
 */
public class DataSourceMySql {
    private MysqlDataSource dataSource = new MysqlDataSource();
    private MysqlDataSource localDataSource = new MysqlDataSource();

    public DataSourceMySql() {
        {
            try {
                dataSource.setServerName("jdbc:mysql://138.68.77.14:3306/legohouse");
                dataSource.setPort(3306);
                dataSource.setDatabaseName("legohouse");
                dataSource.setUser("transformer");
                dataSource.setPassword("pass");
                dataSource.setUseSSL(false);
                
                localDataSource.setServerName("localhost");
                localDataSource.setPort(3306);
                localDataSource.setDatabaseName("legohouse");
                localDataSource.setUser("transformer");
                localDataSource.setPassword("pass");
                localDataSource.setUseSSL(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public MysqlDataSource getDataSource() {
        return dataSource;
    }
    
}
