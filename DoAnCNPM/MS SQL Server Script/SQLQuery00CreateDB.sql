USE master;  
GO  
IF DB_ID (N'QLYHS') IS NOT NULL  
DROP DATABASE QLYHS;  
GO  
CREATE DATABASE QLYHS ;
  
GO  
 
SELECT name, collation_name  
FROM sys.databases  
WHERE name = N'QLYHS';  
GO  