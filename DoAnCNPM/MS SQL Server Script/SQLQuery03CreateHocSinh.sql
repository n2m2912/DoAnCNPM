USE [QLYHS]
GO

/****** Object:  Table [dbo].[HocSinh]    Script Date: 14/09/2017 21:31:35 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[HocSinh](
	[mahs] [varchar](10) NOT NULL,
	[hoten] [nvarchar](50) NULL,
	[malop] [varchar](5) NULL,
	[ngaysinh] [datetime] NULL,
	[gioitinh] [nvarchar](5) NULL,
	[diachi] [nvarchar](250) NULL,
	[email] [varchar](50) NULL,
 CONSTRAINT [PK_HocSinh] PRIMARY KEY CLUSTERED 
(
	[mahs] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


