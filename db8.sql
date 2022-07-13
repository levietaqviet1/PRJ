USE [PRJ_G10]
GO
/****** Object:  Table [dbo].[canBo]    Script Date: 7/14/2022 12:23:37 AM ******/
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
	[taiKhoanId] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[chuyenNganh]    Script Date: 7/14/2022 12:23:37 AM ******/
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
/****** Object:  Table [dbo].[coSo]    Script Date: 7/14/2022 12:23:37 AM ******/
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
/****** Object:  Table [dbo].[giangVien]    Script Date: 7/14/2022 12:23:37 AM ******/
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
	[idCoSo] [int] NULL,
	[taiKhoanId] [int] NULL,
 CONSTRAINT [PK_giangVien] PRIMARY KEY CLUSTERED 
(
	[giangVienId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[phuHuynh]    Script Date: 7/14/2022 12:23:37 AM ******/
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
 CONSTRAINT [PK_phuHuynh] PRIMARY KEY CLUSTERED 
(
	[phuHuynhId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[quanTri]    Script Date: 7/14/2022 12:23:37 AM ******/
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
 CONSTRAINT [PK_quanTri] PRIMARY KEY CLUSTERED 
(
	[quanTriId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sinhVien]    Script Date: 7/14/2022 12:23:37 AM ******/
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
 CONSTRAINT [PK_sinhVien] PRIMARY KEY CLUSTERED 
(
	[sinhVienId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[taiKhoan]    Script Date: 7/14/2022 12:23:37 AM ******/
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
/****** Object:  Table [dbo].[trangThai]    Script Date: 7/14/2022 12:23:37 AM ******/
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
/****** Object:  Table [dbo].[vaiTro]    Script Date: 7/14/2022 12:23:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vaiTro](
	[vaiTroId] [int] IDENTITY(1,1) NOT NULL,
	[tenVaiTro] [nvarchar](100) NULL,
 CONSTRAINT [PK_vaiTro] PRIMARY KEY CLUSTERED 
(
	[vaiTroId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[canBo] ON 

INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (14, N'trinh', N'kieu', 0, N'2001-06-06', N'0869563268', N'trinh@gmail.com', N'ha noi', 3, 8)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (15, N'thu', N'lam', 0, N'2000-01-03', N'0896543217', N'thu@gmail.com', N'ha noi', 4, 7)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (16, N'anh', N'ngoc', 0, N'2000-06-02', N'0865932567', N'anh@gmail.com', N'ha noi', 5, 5)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (17, N'hiu', N'luoi', 1, N'2001-12-12', N'0785696325', N'hiu@gmail.com', N'ha noi', 1, 3)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (12, N'tung11', N'nguyen1', 0, N'1999-06-06', N'08586969591', N'tung@gmail.com', N'ha noi1', 2, 34)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (13, N'viet', N'le', 0, N'2001-04-16', N'0858050322', N'levietaqviet20011@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 1, 13)
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

INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (21, N'hiu2', N'thanh2', 0, N'1997-11-22', N'2022-07-06', NULL, N'0868956268', N'levietaqviet2001@gmail.com', N'ha noi', 5, 38)
SET IDENTITY_INSERT [dbo].[giangVien] OFF
SET IDENTITY_INSERT [dbo].[phuHuynh] ON 

INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (6, N'nam', N'le', 1, N'1988-05-05', N'0896596326', N'nam@gmail.com', N'ha noi', 1, 40, 3)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (7, N'nguyen', N'tuan', 0, N'1999-03-01', N'0785469563', N'tuan@gmail.com', N'ha noi', 1, 41, 4)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (8, N'nguyen1', N'tuan', 1, N'1999-03-01', N'0569865536', N'tuan1@gmail.com', N'ha noi', 1, 28, 18)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (9, N'nguyen2', N'tuan', 0, N'1999-03-01', N'0569568956', N'tuan2@gmail.com', N'ha noi', 1, 20, 20)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (10, N'nguyen3', N'tuan', 1, N'1999-03-01', N'0567426842', N'tuan3@gmail.com', N'ha noi', 1, 19, 21)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (11, N'nguyen4', N'tuan', 0, N'1999-03-01', N'0256963256', N'tuan4@gmail.com', N'ha noi', 1, 14, 23)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (12, N'nguyen5', N'tuan', 0, N'1999-03-01', N'0158954492', N'tuan5@gmail.com', N'ha noi', 1, 10, 24)
INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId]) VALUES (13, N'nguyen6', N'tuan', 1, N'1999-03-01', N'0179545616', N'tuan6@gmail.com', N'ha noi', 1, 9, 25)
SET IDENTITY_INSERT [dbo].[phuHuynh] OFF
SET IDENTITY_INSERT [dbo].[quanTri] ON 

INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (1, N'vietba', N'le', 1, N'2001-04-16', N'0858050379', N'levietaqviet2001@gmail.com', N'ha noi', 1, 14)
SET IDENTITY_INSERT [dbo].[quanTri] OFF
SET IDENTITY_INSERT [dbo].[sinhVien] ON 

INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (3, N'lan', N'nam', 1, N'2001-06-07', N'0896532697', N'lan@gmail.com', N'ha noi', 1, 1, 1, 4, NULL, NULL, NULL, N'HE153408')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (4, N'cong', N'nguyen', 0, N'1999-03-03', N'0896578542', N'cong@gmail.com', N'ha noi', 1, 1, 1, 6, NULL, NULL, NULL, N'HE151400')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (18, N'cong121', N'thanh1', 0, N'1888-04-02', N'02562369561', N'thanh@gmail.com', N'ha noi1', 2, 1, 2, 30, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (20, N'viet', N'le', 0, N'2001-04-16', N'0858054449', N'levietaqviet2001@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 3, 5, 2, 32, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (21, N'cao', N'van', 0, N'1890-01-05', N'0789658965', N'van@gmail.com', N'ha noi', 1, 1, 1, 33, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (23, N'nam', N'tung', 1, N'2001-11-11', N'0589659865', N'nam@gmail.com', N'so123', 1, 1, 1, 35, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (24, N'viet', N'le', 0, N'2001-11-11', N'+84858050311', N'levietaqviet21@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 1, 5, 1, 36, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (25, N'hiu1122', N'thanh', 0, N'1997-11-22', N'0895689656', N'hiu1@gmail.com', N'ha noi', 1, 1, 1, 37, CAST(N'2022-07-06' AS Date), N'', NULL, N'SE001116')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (28, N'viet111', N'le1', 0, N'2001-04-16', N'08580504491', N'levietaqviet2011@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi1', 1, 1, 2, 42, CAST(N'2022-07-13' AS Date), N'', NULL, N'SE001117')
SET IDENTITY_INSERT [dbo].[sinhVien] OFF
SET IDENTITY_INSERT [dbo].[taiKhoan] ON 

INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (3, N'giangVien1', N'123456', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (4, N'sinhvien1', N'123456', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (5, N'BQT1', N'123456', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (6, N'test', N'123456', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (7, N'8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', N'66ae94f9cb832388a8c62b8dc6cd2b851dca0639e2ea9fc809b5c4572c64fafd', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (8, N'60edfc2b9106ffb764b67d61386608602afeb71cd1cdf981e3d1b1f08f30882d', N'd54e2e5239b5d7ce831b67ff8fa8b211bf85abff28c235edfca6f4e132f6cd42', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (9, N'0eec933681d88cc8a79698d563d68643a3084eadb3014c85fdfcf62769ec5e56', N'a4baa1cc48fd24c043d99cc293e454bfec43f29819901fb37549b24f8671cf81', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (10, N'fe1b28799005365207c7bcb9c272490b67c7a0dd9f637e7fc3b20df4fc96e14a', N'b612f5681e10774a9a94115b41585e878fc9be80000727f2810ca8e56f8f4b67', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (13, N'8e4cfa301499eb1ec7090735ad004f28694241881be774bfbd39ed4727c7f9ab', N'926bdec150218aff0d4b3940d2452d27874dd518ec2a948983c61419be4356fc', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (14, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'4c10b02c977fa781c8119504b8f639234aa916502d939811d86f1afe932e8cff', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (19, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'a849f2e35ee56f99c41d3d0fb77fac01e1d4848c0960d38f5e184ea46c723f41', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (20, N'bbecfabb865032bcae4afe3e658a06e2324ea7694597c6af294fe6dfab9aba29', N'92bf57c65eb264aad9f49590e76c944ac83385b1e3b6a2ae13dde116463c846d', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (28, N'069a22dbc493ca5b9cd324a6c0c57763a73c11681cd4b914ccb15065e30e2d74', N'0066ceef1e7aae0dff7f6be544f96f922b702884f833cb90d4782efe49211de7', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (30, N'e07b7836006776659bf145e0fae2f47c7c1793c88997740f79874196d299fddf', N'6bed8a2c2ee4d2214d66533f3f1e06b26bce8eb62cc1a0322ed5f156f88e3d50', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (32, N'cdfe0644ac0e0d452adad96506e988c8921e576d1bb443f9d23d5dd8eba80659', N'c4d0e140ac46ade80c20ecf742c0ee4e5b90c569c198f41decea9b91c1035e20', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (33, N'7a0b6e359b2f028ffb2a444cb8bc6ae2cc65d8e4507527f7c8aef767e57eeb53', N'f27a5677b16626bb6efe1dcff9e15a0a22b1a3dc1c60d93c6af05ef33173bb72', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (34, N'5f6336026182f1241d59221e9c9bef34e53fe8b56931933610a6fab1e369a607', N'8a0ba02c51efd1a2773b8de028331b1e90624f3eb6fd690eddfe232345f00547', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (35, N'316390f5232259f52184a6ea42f0629527647df8a2088fa1abac3e5c6b20d603', N'39293a0e948546cd26c767726e1d5ae1fc3173596049a08ed5925cb5b01094fe', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (36, N'cdfe0644ac0e0d452adad96506e988c8921e576d1bb443f9d23d5dd8eba80659', N'a6b4f61325aebb5829680669693a8685141cf8934dee8fbb2ed12cf1d6c9a5d4', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (37, N'908298d21c78fa4901d2f77de54bc7d709cfb4b1187af30ef52f2300226d8b20', N'b3b1f2a536f6fb596cb1623d5918a0f23b82882e789650cd3c2b24eacf384771', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (38, N'd7fef5af0ef4ea28d97dd4f5a2baf71130fef546fdd0664a7ece964ec45cc5e0', N'1563f2698935f93f3294d4f83f7b6ffaad359075468441b5ecaa610ee139373c', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (40, N'a', N'a', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (41, N'b', N'b', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (42, N'03e42df86355720be5c890ea418eb75b97a51ab55e3ec2836fc8a2047f580743', N'0a595eb2e1e2295cb1f0eb383ed5a1c3752e0d0104d8375c5672047526b22b04', 2)
SET IDENTITY_INSERT [dbo].[taiKhoan] OFF
SET IDENTITY_INSERT [dbo].[trangThai] ON 

INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (1, N'Đang chờ duyệt')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (2, N'Đang hoạt động')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (3, N'Bị đuổi học')
INSERT [dbo].[trangThai] ([trangThaiId], [tenTrangThai]) VALUES (4, N'Bị từ chối')
SET IDENTITY_INSERT [dbo].[trangThai] OFF
SET IDENTITY_INSERT [dbo].[vaiTro] ON 

INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro]) VALUES (1, N'BQT')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro]) VALUES (2, N'Sinh viên')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro]) VALUES (3, N'Giảng viên')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro]) VALUES (4, N'Cán bộ ĐH-FPT')
INSERT [dbo].[vaiTro] ([vaiTroId], [tenVaiTro]) VALUES (5, N'Phụ huynh')
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
