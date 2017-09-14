USE [QLYHS]
GO

INSERT INTO [dbo].[BangDiem]
           ([mahs]
           ,[hocky]
           ,[tenmh]
           ,[diem15]
           ,[diem1t])
     VALUES
           ('123456',1,N'Toán',5,5)
GO

select * from BangDiem