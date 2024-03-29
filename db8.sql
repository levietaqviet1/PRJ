USE [PRJ_G10]
GO
/****** Object:  Table [dbo].[Application]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[canBo]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[chuyenNganh]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[coSo]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[giangVien]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[phuHuynh]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[quanTri]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[sinhVien]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[taiKhoan]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[trangThai]    Script Date: 7/20/2022 12:35:02 PM ******/
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
/****** Object:  Table [dbo].[vaiTro]    Script Date: 7/20/2022 12:35:02 PM ******/
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
SET IDENTITY_INSERT [dbo].[canBo] ON 

INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (29, N'cong121', N'thanh1', 0, N'1888-04-02', N'0858693657', N'levietaqbangbang1@gmail.com', N'ha noi1', 1, 121, N'CB1', 1)
INSERT [dbo].[canBo] ([canBoId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [codeCB], [activeCB]) VALUES (30, N'cong', N'nguyen', 0, N'1999-03-03', N'0858965741', N'levietaqbangbang1@gmail.com', N'ha noi', 1, 122, N'CB2', 1)
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

INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (43, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-20', N'', N'0896578542', N'cong1@gmail.com', N'ha noi', N'GV1', 1, 106, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (44, N'cong', N'nguyen', 0, N'1999-03-03', N'2022-07-20', NULL, N'0896578542', N'cong@gmail.com', N'ha noi', N'GV2', 1, 107, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (45, N'viet', N'le', 0, N'2001-11-11', N'2022-07-20', NULL, N'+84858050311', N'levietaqviet21@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', N'GV3', 5, 108, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (46, N'le', N'viet', 0, N'2000-06-02', N'2022-07-20', NULL, N'0865932567', N'anh@gmail.com', N'ha noi', N'GV4', 5, 109, 1)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [maGiangVien], [idCoSo], [taiKhoanId], [activeGV]) VALUES (47, N'cong121', N'thanh1', 0, N'1888-04-02', N'2022-07-20', NULL, N'0858050349', N'thanh@gmail.com', N'ha noi1', N'GV5', 1, 110, 1)
SET IDENTITY_INSERT [dbo].[giangVien] OFF
SET IDENTITY_INSERT [dbo].[phuHuynh] ON 

INSERT [dbo].[phuHuynh] ([phuHuynhId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId], [sinhVienId], [codePH], [acctivePH]) VALUES (22, N'hiu11', N'le1', 1, N'1980-04-16', N'0986326589', N'khidotthanhtinh@gmail.com', N'ha noi1', 1, 123, 53, N'PH1       ', 1)
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

INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (53, N'cong121', N'thanh1', 0, N'2001-04-02', N'0858458963', N'thanh@gmail.com', N'ha noi1', 1, 1, 1, 113, CAST(N'2022-07-20' AS Date), N'', NULL, N'SE1', 1)
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV], [acctiveSV]) VALUES (54, N'nam', N'tung', 0, N'2001-11-11', N'0889659865', N'nam@gmail.com', N'so123', 1, 1, 1, 114, CAST(N'2022-07-20' AS Date), N'', NULL, N'SE2', 1)
SET IDENTITY_INSERT [dbo].[sinhVien] OFF
SET IDENTITY_INSERT [dbo].[taiKhoan] ON 

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
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (59, N'ae4a31e08780238d63a639265960a27d431bb8c67025ff87d05a4f3691300346', N'c93dff993ef4f8c69ef6dd1e1206491e01fdb2debe5405800bdb7e4d7fbfb63a', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (60, N'a0987681cdc59781ca1fe3976058faf7ee54066c321254dbd22e8371e16ce35e', N'174cec048ad8a051d4495c19eb2172246491858f03a936fae39aa324f02aa5c1', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (61, N'753b7836a27f8f07a090949e3c2f5e71bae8144511acf8268dfa8c9406737bad', N'fa7648ee5a8049c734447853c2ac5017a4887260aaef5499cb3dc7adff74dee6', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (62, N'372ff86c62ddfaa2d42be06e137e87c09b26a638ea470b1005b3afa9cad6db36', N'4a2adf5a7fc7242d8c8315b9cf843cc7a85aa352dfd8482d030c8673043802e5', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (63, N'b0242ba076a958a333b08534b51282b760a9f92347c693f229e62dd15c4cba44', N'77aa3dbd641bf32d470069d146cd11d0de48c4acccdff0ed907d911ff082819f', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (64, N'd9b34ff127e582b6391d6098f83ed48ff9e4bca75cae21d1aaed20fe853a0fff', N'6223970f73dd940a363e344765cee66be9f140a43ec986c7efc0c7c66f65b02f', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (65, N'78415aabdaa26634cb8554abc89f1acede2b92c80bd127aafde8a3d31959b90e', N'93e71c87ce48d5f7aa6652b6ba383186ecfaf597c81dafe727b2cf098d19c24a', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (78, N'd809884337359fa77b5defdea2ee4f86ff973543ea403ef4ee1c5bca136d7ece', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (80, N'da1852dfafe0d1cc0dc8a135d15abc1529e6222994b494f4f312c5fd09ff2d74', N'5ccfceeffd55a29c1b75f047c51a11880e4a660a187ae3d8a8c322245cf17c7c', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (81, N'd7490b587148fe9a3c2b323a288af4c05dee88e51d968e0028f15962a921cbfb', N'fd2622747d3f0c0b80a720254e369d9d5e2aadc48500fd5a5ec44aa620e90718', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (82, N'bb4ffacead618fbef1a13e2f3e7887146888ba9e4119c55925242a1cc225b850', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (83, N'fc0045a5981b261578f7436bb39e345df9ee54325bb05c3b016ceec24aeb776c', N'4e78c5aeab5720abf71ddef4c8ef9f580af51569e2b08cef1437aa804d510983', 5)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (84, N'5b53997a83717ee4a90a6aa74659da0c3e77f276ecaf34a66b93ccddbbac825c', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (88, N'd8cfece69ccb132acbdd3688a7a5c6fcec336325ca88e46f70b053b5dd6ec63e', N'bb63bb9c088dd913c3ade63b9f130565540b8afbc80b3e8ecfeb97a0fb866f9b', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (89, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (90, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (91, N'a', N'b', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (92, N'3c672108944f3641305b38c3950cd054958d77deede824d26ecf0f4fc87294a4', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (93, N'80b92aa4fb7882ff1972c6005b74d6189b2194e47ef82da12eb29c382c72558c', N'8fdc1b6d9b79d7dd96c70616e64a707e372f3201fb4982d0675a770afd4b6572', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (94, N'c58998f0f5a2b875fc056e7d059b455ed17fe53f109425b973eb8aef7df53202', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (98, N'648be20cc6f9cef34331a5b10fc54d7571f483f24204e0beb76d55ec51fbe814', N'd96a7eda77e613e7024ecc546b7e3ab13b06f9848e6ca5bb88e506f12e8a22e5', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (99, N'65204bc332997aa04059da07bd816b3de7930ec56254096473cd586605675539', N'26e08f23d8ec527d5e2871f60a6a676c49861c17195e958c097e9c6a17c678b3', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (100, N'c771f340df66d714605f807aebffec1b056db04d34a35066af135025ebad00ef', N'78a8a392ab025daca5eef00af7420826025135fd42bf0e043f93aaa0526fc30b', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (101, N'e531f6f2d2d1d0b9a1f886e18853ddce340c6219b25eb66230889fd6f00e0bc3', N'3e63a33f2f9c9a84a4c36770c75d4a45f1ee4e3038f3376e6903a9040eafb287', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (102, N'0dcadc7e9d290b1e9663026147c88e520d178bb6294715b5a95a9ce84262f01f', N'0ac508fa4dc4cb410f84b2d1741affaa578a83f7d70fc8366f6266f68604a115', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (103, N'0dcadc7e9d290b1e9663026147c88e520d178bb6294715b5a95a9ce84262f01f', N'973824879aac1122715479152fa3c44744a9ed67ba7455d7f620b02cdb422faf', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (105, N'0dcadc7e9d290b1e9663026147c88e520d178bb6294715b5a95a9ce84262f01f', N'829316d1da87036b9812b43533593407ea43ec0acc1836078dccb6c6b77d0cd0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (106, N'542d19ec4969cab325a5fd77f1b57211c509b197118cdee46202d25ada288159', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (107, N'8a382d76c00c562dfb585626f691999dac77a7380a3ab17570ecad98f0236ca7', N'3464a553f1f0f18996ef77bbbc39e2e9b6e9ba30f26ccd57ae9570045a1a72d9', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (108, N'c7a299cc23f3b2ed09ef6231baf1ab328609fb60d232cb89b1dba12d50564b30', N'87f31d4def2b40ee120b143f4e4ad821043ef25e8ca8cd36aeb340ce5f998ec5', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (109, N'2e36c1a46bdfc1231524ff5dbd4452ac4d6f26881c3d778052f393ff3d509d20', N'da3d4464cf527be2d47368c47a2bcfc6a99045d6dac46e6368f9cd32b5be98b7', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (110, N'1d3a8fc74dc593c4c05195571e2232c6387f3e98a33e064427aa6d15615e6dbc', N'4e97688973fa1f34232dce7465e9169a371f88394ffb0616dd8108a5d1f293d4', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (113, N'1e0d1b464631cfacce05896d48d22678b451bda2824033aefa7937eb6ae63e2b', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (114, N'75e8dffa24957ad7c3968b0ed849195fe5bb854824568dabd635faaebc82aa32', N'3d0bffe3863de1c22919d7d2d46e4744c2e36c33bbd6365c8bf060a909551f76', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (117, N'8e40475cfab858052183ddd5a0a8ad032bd88b8a6e2507fda42dc798fadd8889', N'd970d304f3ad664cf8e3cd242d71e9021ae1c569552c48e336a1e39071b3d882', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (119, N'7139b9ef814e594f4cbcce28e516ac1541250b056d6d5189e5b58cba3f5bc408', N'039d791b733cd11709f8a2cb3a2a5586873c0dfbd220d764ad8a27f622645eb8', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (120, N'33240357921e672710a6bfdb921b73266f41216478b6b66b08d13e7cb1226e17', N'29be7bf7966cd3536dcf966369a4a156cf8772187de03d20bd8479b43e5c2a8c', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (121, N'557b1178ded4fb27639bedaccb02df5daa04f46a72b474da759046d0cac0d8f7', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (122, N'e7d5fa65062c2b44585ba1aa92dd081ec499611aec422a55032d9a17ce0c4dc3', N'4eb00fadb279500da690a63f2b3e37023d2d01e0c30a09d9b67ef14bcd050da6', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (123, N'8c346a28d5a8a5d27e27245815b78fb961c843743ce3c968383546eb8cd5d48a', N'e7be515c65716c158191f3bb75e35093b5943b3d6c38c470711eddae96649db0', 5)
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
ALTER TABLE [dbo].[Application]  WITH CHECK ADD  CONSTRAINT [FK_Application_sinhVien] FOREIGN KEY([idsv])
REFERENCES [dbo].[sinhVien] ([sinhVienId])
GO
ALTER TABLE [dbo].[Application] CHECK CONSTRAINT [FK_Application_sinhVien]
GO
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
