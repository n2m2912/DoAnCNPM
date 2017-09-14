USE [QLYHS]
GO

INSERT INTO [dbo].[HocSinh]
           ([mahs],[hoten],[malop],[ngaysinh],[gioitinh],[diachi],[email]
           )
     VALUES
           ('123456',N'Nguyễn Văn A','10a1','12/22/2016',N'Nam',N'TPHCM','asd@gmail.com')
GO

select * from HocSinh