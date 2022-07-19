USE [PRJ_G10]
GO
/****** Object:  Table [dbo].[Application]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Application](
	[appid] [int] IDENTITY(1,1) NOT NULL,
	[appName] [nvarchar](max) NULL,
	[noidungapp] [nvarchar](max) NULL,
	[idsv] [int] NULL,
	[timeguidon] [nvarchar](50) NULL,
	[timeduyetdon] [nvarchar](50) NULL,
	[tinhtrangdonid] [int] NULL,
	[lido] [nvarchar](max) NULL,
 CONSTRAINT [PK_Application] PRIMARY KEY CLUSTERED 
(
	[appid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[canBo]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[canBo](
	[canBoId] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](max) NULL,
	[lastName] [nvarchar](max) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [nvarchar](11) NULL,
	[soDienThoai] [nvarchar](15) NULL,
	[gmail] [nvarchar](max) NULL,
	[diaChi] [nvarchar](max) NULL,
	[idCoSo] [int] NULL,
	[taiKhoanId] [int] NULL,
	[codeCB] [nvarchar](50) NULL,
	[activeCB] [bit] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[chuyenNganh]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chuyenNganh](
	[idChuyenNganh] [int] IDENTITY(1,1) NOT NULL,
	[tenChuyenNganh] [nvarchar](100) NULL,
	[codeChuyenNganh] [nvarchar](50) NULL,
	[dateStartCN] [date] NULL,
	[dateEndCN] [date] NULL,
 CONSTRAINT [PK_chuyenNganh] PRIMARY KEY CLUSTERED 
(
	[idChuyenNganh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[coSo]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[coSo](
	[idCoSo] [int] IDENTITY(1,1) NOT NULL,
	[tenCoSo] [nvarchar](100) NULL,
	[diaChiCoSo] [nvarchar](max) NULL,
	[dateStartCS] [date] NULL,
	[dateEndCS] [date] NULL,
 CONSTRAINT [PK_coSo] PRIMARY KEY CLUSTERED 
(
	[idCoSo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[giangVien]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[giangVien](
	[giangVienId] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [nvarchar](50) NULL,
	[ngayBatDauLamViec] [nvarchar](50) NULL,
	[ngayNghiLam] [nvarchar](50) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[gmail] [nvarchar](200) NULL,
	[diaChi] [nvarchar](100) NULL,
	[maGiangVien] [nvarchar](10) NULL,
	[idCoSo] [int] NULL,
	[taiKhoanId] [int] NULL,
	[activeGV] [bit] NULL,
 CONSTRAINT [PK_giangVien] PRIMARY KEY CLUSTERED 
(
	[giangVienId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[phuHuynh]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[phuHuynh](
	[phuHuynhId] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [nvarchar](50) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[gmail] [nvarchar](200) NULL,
	[diaChi] [nvarchar](100) NULL,
	[idCoSo] [int] NULL,
	[taiKhoanId] [int] NULL,
	[sinhVienId] [int] NULL,
	[codePH] [nchar](10) NULL,
	[acctivePH] [bit] NULL,
 CONSTRAINT [PK_phuHuynh] PRIMARY KEY CLUSTERED 
(
	[phuHuynhId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[quanTri]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[quanTri](
	[quanTriId] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [nvarchar](50) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[gmail] [nvarchar](200) NULL,
	[diaChi] [nvarchar](100) NULL,
	[idCoSo] [int] NULL,
	[taiKhoanId] [int] NULL,
	[maCodeQT] [nvarchar](10) NULL,
 CONSTRAINT [PK_quanTri] PRIMARY KEY CLUSTERED 
(
	[quanTriId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sinhVien]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sinhVien](
	[sinhVienId] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [nvarchar](50) NULL,
	[lastName] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [nvarchar](50) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[gmail] [nvarchar](max) NULL,
	[diaChiSV] [nvarchar](max) NULL,
	[idChuyenNganh] [int] NULL,
	[idCoSo] [int] NULL,
	[trangThaiId] [int] NULL,
	[taiKhoanId] [int] NULL,
	[batDauTuSV] [date] NULL,
	[ketThucNgaySV] [nvarchar](50) NULL,
	[imgData] [image] NULL,
	[MSSV] [nvarchar](20) NULL,
	[acctiveSV] [bit] NULL,
 CONSTRAINT [PK_sinhVien] PRIMARY KEY CLUSTERED 
(
	[sinhVienId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[taiKhoan]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[taiKhoan](
	[taiKhoanId] [int] IDENTITY(1,1) NOT NULL,
	[taiKhoan] [nvarchar](100) NULL,
	[matKhau] [nvarchar](100) NULL,
	[vaiTroId] [int] NULL,
 CONSTRAINT [PK_taiKhoan] PRIMARY KEY CLUSTERED 
(
	[taiKhoanId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[trangThai]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[trangThai](
	[trangThaiId] [int] IDENTITY(1,1) NOT NULL,
	[tenTrangThai] [nvarchar](100) NULL,
 CONSTRAINT [PK_trangThai] PRIMARY KEY CLUSTERED 
(
	[trangThaiId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[vaiTro]    Script Date: 7/19/2022 10:46:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vaiTro](
	[vaiTroId] [int] IDENTITY(1,1) NOT NULL,
	[tenVaiTro] [nvarchar](100) NULL,
	[codeRo] [nchar](10) NULL,
 CONSTRAINT [PK_vaiTro] PRIMARY KEY CLUSTERED 
(
	[vaiTroId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Application] ON 

INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (1, N'MoveClass', N'MAS291SE1629SE1630', 43, N'2022-07-14', N'2022-07-19', 1, N'Khong')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (2, N'MoveClass', N'MAS291SE1629SE1630', 43, N'2022-07-14', N'2022-07-18', 1, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (3, N'MoveClass', N'MAS291SE1629SE1630', 43, N'2022-07-14', N'2022-07-18', 1, N'Con lau moi cho')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (4, N'MoveClass', N'MAS291SE1629SE1630', 30, N'2022-07-14', N'2022-07-18', 0, N'no')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (5, N'MoveClass', N'MAS291SE1629SE1630', 43, N'2022-07-14', N'2022-07-18', 1, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (6, N'MoveClass', N'Môn: MAS291 From SE1629 to classSE1630', 30, N'2022-07-14', N'2022-07-18', 0, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (7, N'MoveClass', N'Môn: MAS291 From SE1629 to classSE1630', 30, N'2022-07-14', N'2022-07-18', 1, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (8, N'MoveClass', N'Môn: MAS291 from SE1629 to class SE1630', 30, N'2022-07-14', N'2022-07-18', 1, N'meo méo meo')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (9, N'MoveClass', N'Môn: MAS291 from SE1629 to class SE1630', 30, N'2022-07-14', N'2022-07-19', 0, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (10, N'MoveClass', N'Môn: MAS291 from SE1629 to class SE1630', 30, N'2022-07-14', N'2022-07-19', 1, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (11, N'Move Class With Other Student', N'Môn: MAS291 Student: HE163544Exchange With Student: HE160542 from SE1629 to class SE1630', 30, N'2022-07-14', N'2022-07-19', 1, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (12, N'Register Extra Courses', N'Môn: MAS291 Class: SE1639 Time: 2022-07-29', 30, N'2022-07-14', N'2022-07-19', 1, N'gthfdhdf')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (13, N'Register To Improve Mark', N'Subject: MAS291 Class: SE1639 Time study: 2022-07-23', 30, N'2022-07-14', N'2022-07-19', 1, N'vuaaa')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (14, N'Register To Improve Mark', N'Subject: MAS291 Class: SE1639 Time study: 2022-07-23', 30, N'2022-07-14', N'2022-07-19', 1, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (15, N'Đăng kí thi cải thiện điểm', N'Nội dung đơn: Cho em xin đăng kí', 30, N'2022-07-15', N'2022-07-19', 1, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (16, N'Đăng kí thi cải thiện điểm', N' Nội dung đơn: hello', 30, N'2022-07-15', N'2022-07-19', 1, N'')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (17, N'Move Class With Other Student', N'Subject: PRJ Student: 124 Exchange With Student: 123 from SE33 to class SE44', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (18, N'Register Extra Courses', N'Subject: PRJ Class: SE11 Time study: 2022-07-28', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (19, N'Register Extra Courses', N'Subject: PRJ Class: SE11 Time study: ', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (20, N'Register Extra Courses', N'Subject: PRJ33333, Class: heelo, Time study: null', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (21, N'Register Extra Courses', N'Subject: PRJ, Class: helonow, Time study: 2022-07-29', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (22, N'Move Class', N' Subject: massss from SE33 to class SE44', 30, N'2022-07-18', N'2022-07-18', 1, N'hello')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (23, N'Move Class With Other Student', N' Subject: PRJJJJJJJJJ, Student: SE123, Exchange With Student: SE131 from WERFWEFWE to class REVGQERGQ', 30, N'2022-07-18', N'2022-07-18', 1, N'FERFSDS')
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (24, N'Register Extra Courses', N'Subject: , Class: , Time study: 2022-07-29', 30, N'2022-07-18', NULL, NULL, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (25, N'Move Class', N' Subject: PRJ33333 from 11111 to class 222222', 30, N'2022-07-18', NULL, 3, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (26, N'Move Class With Other Student', N' Subject: viet, Student: hieu, Exchange With Student: thu from 1629 to class 1630', 43, N'2022-07-19', NULL, 3, NULL)
INSERT [dbo].[Application] ([appid], [appName], [noidungapp], [idsv], [timeguidon], [timeduyetdon], [tinhtrangdonid], [lido]) VALUES (27, N'Move Class', N' Subject: viet from 1629 to class 1630', 43, N'2022-07-19', N'2022-07-19', 1, N'OK THU')
SET IDENTITY_INSERT [dbo].[Application] OFF
SET IDENTITY_INSERT [dbo].[canBo] ON 

INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (20, N'nam', N'tung', 0, N'2001-11-11', N'0589659865', N'nam@gmail.com', N'so123', 1, 53, N'CB1111', 0)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (17, N'hiu', N'luoi', 1, N'2001-12-12', N'0785696325', N'hiu@gmail.com', N'ha noi', 1, 3, N'CB1114', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (12, N'tung11', N'nguyen1', 0, N'1999-06-06', N'08586969591', N'tung@gmail.com', N'ha noi1', 2, 34, N'CB1115', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (21, N'cong121', N'thanh1', 0, N'1888-04-02', N'02562369561', N'levietaqbangbang1@gmail.com', N'ha noi1', 1, 54, N'CB1118', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (23, N'cong', N'nguyen', 0, N'1999-03-03', N'0896578542', N'levietaqbangbang1@gmail.com', N'ha noi', 1, 57, N'CB1119', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (22, N'nam', N'tung', 0, N'2001-11-11', N'0589659865', N'nam@gmail.com', N'so123', 1, 55, N'CB1120', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (24, N'hiu1122', N'thanh', 0, N'1997-11-22', N'0895689656', N'hiu1@gmail.com', N'ha noi', 1, 58, N'CB11211', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (17, N'hiu', N'luoi', 1, N'2001-12-12', N'0785696325', N'hiu@gmail.com', N'ha noi', 1, 3, N'CB0004    ', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (12, N'tung11', N'nguyen1', 0, N'1999-06-06', N'08586969591', N'tung@gmail.com', N'ha noi1', 2, 34, N'CB0005    ', 1)
SET IDENTITY_INSERT [dbo].[canBo] OFF
SET IDENTITY_INSERT [dbo].[chuyenNganh] ON 

INSERT [dbo].[chuyenNganh] ([idChuyenNganh], [tenChuyenNganh], [codeChuyenNganh], [dateStartCN], [dateEndCN]) VALUES (1, N'Kỹ Thuật Phần Mềm', N'SE', NULL, NULL)
INSERT [dbo].[chuyenNganh] ([idChuyenNganh], [tenChuyenNganh], [codeChuyenNganh], [dateStartCN], [dateEndCN]) VALUES (2, N'An Toàn Thông Tin', N'AT', NULL, NULL)
INSERT [dbo].[chuyenNganh] ([idChuyenNganh], [tenChuyenNganh], [codeChuyenNganh], [dateStartCN], [dateEndCN]) VALUES (3, N'Quản Trị Kinh Doanh', N'QT', NULL, NULL)
SET IDENTITY_INSERT [dbo].[chuyenNganh] OFF
SET IDENTITY_INSERT [dbo].[coSo] ON 

INSERT [dbo].[coSo] ([idCoSo], [tenCoSo], [diaChiCoSo], [dateStartCS], [dateEndCS]) VALUES (1, N'Hòa Lạc', N'Đất Thổ Cư Hòa Lạc, Km29 Đường Cao Tốc 08, Thạch Hoà, Thạch Thất, Hà Nội 10000', NULL, NULL)
INSERT [dbo].[coSo] ([idCoSo], [tenCoSo], [diaChiCoSo], [dateStartCS], [dateEndCS]) VALUES (2, N'Hồ Chí Minh', NULL, NULL, NULL)
INSERT [dbo].[coSo] ([idCoSo], [tenCoSo], [diaChiCoSo], [dateStartCS], [dateEndCS]) VALUES (3, N'Đà Nẵng', NULL, NULL, NULL)
INSERT [dbo].[coSo] ([idCoSo], [tenCoSo], [diaChiCoSo], [dateStartCS], [dateEndCS]) VALUES (4, N'Cần Thơ', NULL, NULL, NULL)
INSERT [dbo].[coSo] ([idCoSo], [tenCoSo], [diaChiCoSo], [dateStartCS], [dateEndCS]) VALUES (5, N'Quy Nhơn', NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[coSo] OFF
SET IDENTITY_INSERT [dbo].[giangVien] ON 

INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (31, N'viet', N'le', 0, N'2001-11-11', N'2022-07-18', NULL, N'+84858050311', N'levietaqviet21@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', N'GV4', 5, 69, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (32, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV5', 1, 70, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (33, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV6', 1, 71, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (34, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV7', 1, 72, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (35, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV8', 1, 73, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (36, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV9', 1, 74, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (37, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-18', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV10', 1, 75, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (38, N'cong121', N'thanh1', 0, N'1888-04-02', N'2022-07-18', NULL, N'02562369561', N'thanh@gmail.com', N'ha noi1', N'GV10', 1, 76, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (39, N'thu', N'lam', 0, N'2000-01-03', N'2022-07-18', NULL, N'0896543217', N'thu@gmail.com', N'ha noi', N'GV10', 4, 85, 1)
SET IDENTITY_INSERT [dbo].[giangVien] OFF
SET IDENTITY_INSERT [dbo].[phuHuynh] ON 

INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId], [codePH], [acctivePH]) VALUES (20, N'hiu11', N'pheo', 1, N'1980-04-16', N'0896596121', N'khidotthanhtinh11@gmail.com', N'ha noi1', 4, 81, 43, N'PH3       ', 1)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId], [codePH], [acctivePH]) VALUES (21, N'hong', N'anh le', 1, N'1980-04-16', N'0896116321', N'khidotthanhtinh1@gmail.com', N'ha noi1', 5, 83, 42, N'PH4       ', 1)
SET IDENTITY_INSERT [dbo].[phuHuynh] OFF
SET IDENTITY_INSERT [dbo].[quanTri] ON 

INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (1, N'viet', N'le', 0, N'2001-04-16', N'0858050379', N'levietaqviet2001@gmail.com', N'ha noi', 1, 14, N'QT1')
INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (3, N'kinh', N'ba1', 1, N'2001-05-02', N'0856896535', N'kinh@gmail.com', N'ha noi', 1, 89, N'QT2')
INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (4, N'kinh1', N'ba2', 1, N'2001-05-06', N'0856963214', N'kinh1@gmail.com', N'ha noi', 2, 90, N'QT3')
INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (5, N'kinh2', N'ba3', 0, N'2000-01-01', N'0854789658', N'kinh2@gmail.com', N'ha noi', 3, 91, N'QT4')
INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (6, N'hiu11', N'le1', 0, N'2001-04-16', N'0973064838', N'vietldhe1533951@fpt.edu.vn', N'ha noi1', 1, 92, N'QT5')
INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [maCodeQT]) VALUES (7, N'thu', N'tran', 0, N'2001-04-16', N'0896596321', N'vietldhe153395@fpt.edu.vn', N'ha noi1', 1, 93, N'QT6')
SET IDENTITY_INSERT [dbo].[quanTri] OFF
SET IDENTITY_INSERT [dbo].[sinhVien] ON 

INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (42, N'le', N'viet', 0, N'2000-06-02', N'0865932567', N'anh@gmail.com', N'ha noi', 1, 5, 1, 82, CAST(N'2022-07-18' AS Date), N'', NULL, N'SE3', 1)
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (43, N'viet', N'le', 0, N'2001-04-16', N'0858051179', N'khidotthanhtinh@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 1, 1, 2, 84, CAST(N'2022-07-18' AS Date), N'', NULL, N'SE4', 1)
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (44, N'cong121', N'thanh1', 0, N'1888-04-02', N'0858458963', N'thanh@gmail.com', N'ha noi1', 1, 1, 1, 88, CAST(N'2022-07-18' AS Date), N'', NULL, N'SE5', 1)
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (45, N'cong121', N'thanh1', 0, N'1888-04-02', N'0858050349', N'thanh@gmail.com', N'ha noi1', 1, 1, 1, 94, CAST(N'2022-07-19' AS Date), N'', NULL, N'SE6', 1)
SET IDENTITY_INSERT [dbo].[sinhVien] OFF
SET IDENTITY_INSERT [dbo].[taiKhoan] ON 

INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (3, N'giangVien1', N'123456', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (6, N'test', N'123456', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (8, N'60edfc2b9106ffb764b67d61386608602afeb71cd1cdf981e3d1b1f08f30882d', N'd54e2e5239b5d7ce831b67ff8fa8b211bf85abff28c235edfca6f4e132f6cd42', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (9, N'0eec933681d88cc8a79698d563d68643a3084eadb3014c85fdfcf62769ec5e56', N'a4baa1cc48fd24c043d99cc293e454bfec43f29819901fb37549b24f8671cf81', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (10, N'fe1b28799005365207c7bcb9c272490b67c7a0dd9f637e7fc3b20df4fc96e14a', N'b612f5681e10774a9a94115b41585e878fc9be80000727f2810ca8e56f8f4b67', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (14, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (19, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'a849f2e35ee56f99c41d3d0fb77fac01e1d4848c0960d38f5e184ea46c723f41', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (20, N'bbecfabb865032bcae4afe3e658a06e2324ea7694597c6af294fe6dfab9aba29', N'92bf57c65eb264aad9f49590e76c944ac83385b1e3b6a2ae13dde116463c846d', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (28, N'069a22dbc493ca5b9cd324a6c0c57763a73c11681cd4b914ccb15065e30e2d74', N'0066ceef1e7aae0dff7f6be544f96f922b702884f833cb90d4782efe49211de7', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (30, N'e07b7836006776659bf145e0fae2f47c7c1793c88997740f79874196d299fddf', N'6bed8a2c2ee4d2214d66533f3f1e06b26bce8eb62cc1a0322ed5f156f88e3d50', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (32, N'cdfe0644ac0e0d452adad96506e988c8921e576d1bb443f9d23d5dd8eba80659', N'c4d0e140ac46ade80c20ecf742c0ee4e5b90c569c198f41decea9b91c1035e20', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (33, N'7a0b6e359b2f028ffb2a444cb8bc6ae2cc65d8e4507527f7c8aef767e57eeb53', N'f27a5677b16626bb6efe1dcff9e15a0a22b1a3dc1c60d93c6af05ef33173bb72', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (34, N'5f6336026182f1241d59221e9c9bef34e53fe8b56931933610a6fab1e369a607', N'8a0ba02c51efd1a2773b8de028331b1e90624f3eb6fd690eddfe232345f00547', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (35, N'316390f5232259f52184a6ea42f0629527647df8a2088fa1abac3e5c6b20d603', N'39293a0e948546cd26c767726e1d5ae1fc3173596049a08ed5925cb5b01094fe', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (36, N'cdfe0644ac0e0d452adad96506e988c8921e576d1bb443f9d23d5dd8eba80659', N'a6b4f61325aebb5829680669693a8685141cf8934dee8fbb2ed12cf1d6c9a5d4', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (37, N'908298d21c78fa4901d2f77de54bc7d709cfb4b1187af30ef52f2300226d8b20', N'c4d0e140ac46ade80c20ecf742c0ee4e5b90c569c198f41decea9b91c1035e20', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (38, N'd7fef5af0ef4ea28d97dd4f5a2baf71130fef546fdd0664a7ece964ec45cc5e0', N'1563f2698935f93f3294d4f83f7b6ffaad359075468441b5ecaa610ee139373c', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (41, N'b', N'b', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (42, N'03e42df86355720be5c890ea418eb75b97a51ab55e3ec2836fc8a2047f580743', N'2765dfea554494544abafeab93aba2144a984fed18b8eea81d7ab703b39f7b67', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (43, N'9f61746fa7821312383a2a6b31eb1c76dbdf8ecd9012c83bbc8f117b99ce5c14', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (44, N'6c0ddc98bda61e378fa14437e657f8773d6f0855e499e6c9a3159f259189a68a', N'861a8f0f621d3438522b274929c4f2de88e389c0867674b13c654646cbf68b07', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (46, N'aa5e51da5ffefe3d14be64f9b42a30a572caaf29e7fad16098d6464baee73cc9', N'8ffca41549e1e0f1d8f422080a0e52714877aa99ba6eddb3a6af63c5a5c66f99', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (49, N'3d87823156cacd96e7a81de78a04397a1b75a1507865494948f0481d568592cc', N'351086abb690639433954dd8d28ad3a828a523376245dce3e9bf7248df0e284c', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (53, N'd0f8a63c76ca6a0889f5945ca4569e33ff4a2884caf278cb95a6e37e58ba9f9b', N'08df715f6643287d4bcc6efcf867ace625bd5706936d19608ce26f6cb2b92675', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (54, N'a047fc3aac8e1563db116ec550786b800d94c5f3a2dba79ee452c3ef3f648dba', N'acb0d65b999574ebe9d13c5a037a0e0795829e74fe82b17f05e3a7be78e42fce', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (55, N'd0f8a63c76ca6a0889f5945ca4569e33ff4a2884caf278cb95a6e37e58ba9f9b', N'71b8bb2e745694573d0825ef8db6a94914e2e931f9b56357afb7adb4a93180b7', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (57, N'777e394682e95715fbb746c8e58008b607dc459d1f14f28c5bcb331e6b5eb55d', N'eb02f0d3a1486fedbe69742a483fa40b8dfa05efc59edf37f4ed6835a293347b', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (58, N'9d04b791dd2d279d3bc7f3cfa3d67d972a341b98e2dc793679febd6bce8cdd27', N'5334180571e51cd75ce80875710da81a946f520078eb7409ae7c01183ab1d09a', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (59, N'ae4a31e08780238d63a639265960a27d431bb8c67025ff87d05a4f3691300346', N'c93dff993ef4f8c69ef6dd1e1206491e01fdb2debe5405800bdb7e4d7fbfb63a', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (60, N'a0987681cdc59781ca1fe3976058faf7ee54066c321254dbd22e8371e16ce35e', N'174cec048ad8a051d4495c19eb2172246491858f03a936fae39aa324f02aa5c1', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (61, N'753b7836a27f8f07a090949e3c2f5e71bae8144511acf8268dfa8c9406737bad', N'fa7648ee5a8049c734447853c2ac5017a4887260aaef5499cb3dc7adff74dee6', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (62, N'372ff86c62ddfaa2d42be06e137e87c09b26a638ea470b1005b3afa9cad6db36', N'4a2adf5a7fc7242d8c8315b9cf843cc7a85aa352dfd8482d030c8673043802e5', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (63, N'b0242ba076a958a333b08534b51282b760a9f92347c693f229e62dd15c4cba44', N'77aa3dbd641bf32d470069d146cd11d0de48c4acccdff0ed907d911ff082819f', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (64, N'd9b34ff127e582b6391d6098f83ed48ff9e4bca75cae21d1aaed20fe853a0fff', N'6223970f73dd940a363e344765cee66be9f140a43ec986c7efc0c7c66f65b02f', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (65, N'78415aabdaa26634cb8554abc89f1acede2b92c80bd127aafde8a3d31959b90e', N'93e71c87ce48d5f7aa6652b6ba383186ecfaf597c81dafe727b2cf098d19c24a', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (69, N'c3a75b9c278b0ebdf5dc32dfbf34373df9e43a46ccf61e462515849293430fd6', N'faf4bca7024b3d2a1732bf09c685dbf1eb85605a093bd5c9356510d509248ea3', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (70, N'ba8904412415829915bda937ed52d00a9b1ad6de9d2c0c11083bd29af37d168b', N'c7f460d910f071c6d900d0a2e582c37518caff99cd43ec23a06710ff092e9947', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (71, N'852c00a75e83a13eac767a5c4fdd91c86597e73918ebf5aabddaa0bf2ff341a3', N'23e21f448a39de6b72ebfed8221e285b3016070fa7f7da1eb226b653c30816d6', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (72, N'c6eeec5f831b21506d9f79ba30fb8c76b451b72689358ed6a485298d6bc98db6', N'1cc43493ad58f8cd7effbd610a62ed4e2d30a7ffd7e9856c5fd59a314c50b089', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (73, N'2bcc717c5eb7cefd69004af82f5595a18caa448402c13d7b9145f4ec4b349ee4', N'2052e8bffc779722f9802a3775d51b6459510555c56fd407a5952f9aea401d37', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (74, N'7a68166390e3143b71a5a36aa2c142d98c8d7479ffeef1303c7ac7e774ff3a83', N'1da444decac3c573ea4b3e2402b719e003183da579860927ccf7d26ff9fd19d8', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (75, N'44bf28e78ea541678ae0c79d413ceee38398395087c2c8eac7bf3e4a5d3f5b49', N'a3d49e05b54345e7dc55621e720a31c801d521b2274ea1576cf3a4349c975429', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (76, N'02bc14a6c31a5fa74370a9594a6a99fbc41a6fb74b122d039a53d129fd7dd4a5', N'cd219064fd8f0163a42372229eb9847da74b6807132fd9604aff73cc9b10604c', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (78, N'd809884337359fa77b5defdea2ee4f86ff973543ea403ef4ee1c5bca136d7ece', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (80, N'da1852dfafe0d1cc0dc8a135d15abc1529e6222994b494f4f312c5fd09ff2d74', N'5ccfceeffd55a29c1b75f047c51a11880e4a660a187ae3d8a8c322245cf17c7c', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (81, N'd7490b587148fe9a3c2b323a288af4c05dee88e51d968e0028f15962a921cbfb', N'fd2622747d3f0c0b80a720254e369d9d5e2aadc48500fd5a5ec44aa620e90718', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (82, N'bb4ffacead618fbef1a13e2f3e7887146888ba9e4119c55925242a1cc225b850', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (83, N'fc0045a5981b261578f7436bb39e345df9ee54325bb05c3b016ceec24aeb776c', N'4e78c5aeab5720abf71ddef4c8ef9f580af51569e2b08cef1437aa804d510983', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (84, N'5b53997a83717ee4a90a6aa74659da0c3e77f276ecaf34a66b93ccddbbac825c', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (85, N'4aaab28655181ddae174e8c34a6058b51d23c9f93f712f7bf92eed026bca58f4', N'0f4d0e091c3599e6ed3092558c73215e4bd8c2ace6538be738650411ab307682', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (88, N'd8cfece69ccb132acbdd3688a7a5c6fcec336325ca88e46f70b053b5dd6ec63e', N'bb63bb9c088dd913c3ade63b9f130565540b8afbc80b3e8ecfeb97a0fb866f9b', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (89, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (90, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (91, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (92, N'3c672108944f3641305b38c3950cd054958d77deede824d26ecf0f4fc87294a4', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (93, N'80b92aa4fb7882ff1972c6005b74d6189b2194e47ef82da12eb29c382c72558c', N'8fdc1b6d9b79d7dd96c70616e64a707e372f3201fb4982d0675a770afd4b6572', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (94, N'c58998f0f5a2b875fc056e7d059b455ed17fe53f109425b973eb8aef7df53202', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
SET IDENTITY_INSERT [dbo].[taiKhoan] OFF
SET IDENTITY_INSERT [dbo].[trangThai] ON 

INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (1, N'Đang chờ duyệt')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (2, N'Đang hoạt động')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (3, N'Bị đuổi học')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (4, N'Bị từ chối')
SET IDENTITY_INSERT [dbo].[trangThai] OFF
SET IDENTITY_INSERT [dbo].[vaiTro] ON 

INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro], [codeRo]) VALUES (1, N'BQT', N'BQ        ')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro], [codeRo]) VALUES (2, N'Sinh viên', N'SV        ')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro], [codeRo]) VALUES (3, N'Giảng viên', N'GV        ')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro], [codeRo]) VALUES (4, N'Cán bộ ĐH-FPT', N'CB        ')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro], [codeRo]) VALUES (5, N'Phụ huynh', N'PH        ')
SET IDENTITY_INSERT [dbo].[vaiTro] OFF
ALTER TABLE [dbo].[canBo]  WITH CHECK ADD  CONSTRAINT [FK_canBo_coSo] FOREIGN KEY([idCoSo])
REFERENCES [dbo].[coSo] ([idCoSo])
GO
ALTER TABLE [dbo].[canBo] CHECK CONSTRAINT [FK_canBo_coSo]
GO
ALTER TABLE [dbo].[canBo]  WITH CHECK ADD  CONSTRAINT [FK_canBo_taiKhoan] FOREIGN KEY([taiKhoanId])
REFERENCES [dbo].[taiKhoan] ([taiKhoanId])
GO
ALTER TABLE [dbo].[canBo] CHECK CONSTRAINT [FK_canBo_taiKhoan]
GO
ALTER TABLE [dbo].[giangVien]  WITH CHECK ADD  CONSTRAINT [FK_giangVien_coSo] FOREIGN KEY([idCoSo])
REFERENCES [dbo].[coSo] ([idCoSo])
GO
ALTER TABLE [dbo].[giangVien] CHECK CONSTRAINT [FK_giangVien_coSo]
GO
ALTER TABLE [dbo].[giangVien]  WITH CHECK ADD  CONSTRAINT [FK_giangVien_taiKhoan] FOREIGN KEY([taiKhoanId])
REFERENCES [dbo].[taiKhoan] ([taiKhoanId])
GO
ALTER TABLE [dbo].[giangVien] CHECK CONSTRAINT [FK_giangVien_taiKhoan]
GO
ALTER TABLE [dbo].[phuHuynh]  WITH CHECK ADD  CONSTRAINT [FK_phuHuynh_coSo] FOREIGN KEY([idCoSo])
REFERENCES [dbo].[coSo] ([idCoSo])
GO
ALTER TABLE [dbo].[phuHuynh] CHECK CONSTRAINT [FK_phuHuynh_coSo]
GO
ALTER TABLE [dbo].[phuHuynh]  WITH CHECK ADD  CONSTRAINT [FK_phuHuynh_sinhVien] FOREIGN KEY([sinhVienId])
REFERENCES [dbo].[sinhVien] ([sinhVienId])
GO
ALTER TABLE [dbo].[phuHuynh] CHECK CONSTRAINT [FK_phuHuynh_sinhVien]
GO
ALTER TABLE [dbo].[phuHuynh]  WITH CHECK ADD  CONSTRAINT [FK_phuHuynh_taiKhoan] FOREIGN KEY([taiKhoanId])
REFERENCES [dbo].[taiKhoan] ([taiKhoanId])
GO
ALTER TABLE [dbo].[phuHuynh] CHECK CONSTRAINT [FK_phuHuynh_taiKhoan]
GO
ALTER TABLE [dbo].[quanTri]  WITH CHECK ADD  CONSTRAINT [FK_quanTri_coSo] FOREIGN KEY([idCoSo])
REFERENCES [dbo].[coSo] ([idCoSo])
GO
ALTER TABLE [dbo].[quanTri] CHECK CONSTRAINT [FK_quanTri_coSo]
GO
ALTER TABLE [dbo].[quanTri]  WITH CHECK ADD  CONSTRAINT [FK_quanTri_taiKhoan] FOREIGN KEY([taiKhoanId])
REFERENCES [dbo].[taiKhoan] ([taiKhoanId])
GO
ALTER TABLE [dbo].[quanTri] CHECK CONSTRAINT [FK_quanTri_taiKhoan]
GO
ALTER TABLE [dbo].[sinhVien]  WITH CHECK ADD  CONSTRAINT [FK_sinhVien_chuyenNganh] FOREIGN KEY([idChuyenNganh])
REFERENCES [dbo].[chuyenNganh] ([idChuyenNganh])
GO
ALTER TABLE [dbo].[sinhVien] CHECK CONSTRAINT [FK_sinhVien_chuyenNganh]
GO
ALTER TABLE [dbo].[sinhVien]  WITH CHECK ADD  CONSTRAINT [FK_sinhVien_coSo] FOREIGN KEY([idCoSo])
REFERENCES [dbo].[coSo] ([idCoSo])
GO
ALTER TABLE [dbo].[sinhVien] CHECK CONSTRAINT [FK_sinhVien_coSo]
GO
ALTER TABLE [dbo].[sinhVien]  WITH CHECK ADD  CONSTRAINT [FK_sinhVien_taiKhoan] FOREIGN KEY([taiKhoanId])
REFERENCES [dbo].[taiKhoan] ([taiKhoanId])
GO
ALTER TABLE [dbo].[sinhVien] CHECK CONSTRAINT [FK_sinhVien_taiKhoan]
GO
ALTER TABLE [dbo].[sinhVien]  WITH CHECK ADD  CONSTRAINT [FK_sinhVien_trangThai] FOREIGN KEY([trangThaiId])
REFERENCES [dbo].[trangThai] ([trangThaiId])
GO
ALTER TABLE [dbo].[sinhVien] CHECK CONSTRAINT [FK_sinhVien_trangThai]
GO
ALTER TABLE [dbo].[taiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_taiKhoan_vaiTro] FOREIGN KEY([vaiTroId])
REFERENCES [dbo].[vaiTro] ([vaiTroId])
GO
ALTER TABLE [dbo].[taiKhoan] CHECK CONSTRAINT [FK_taiKhoan_vaiTro]
GO
