/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doancnpm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author manng
 */
public class DBConnect {
    Connection conn = null;
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Vector data = null;

    String dbURL = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=STDMNGT;user=sa;password=sa";
}
