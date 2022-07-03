USE [PRJ_G10]
GO
/****** Object:  Table [dbo].[canBo]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[chuyenNganh]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[coSo]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[giangVien]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[phuHuynh]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[quanTri]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[sinhVien]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[taiKhoan]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[trangThai]    Script Date: 7/4/2022 12:46:20 AM ******/
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
/****** Object:  Table [dbo].[vaiTro]    Script Date: 7/4/2022 12:46:20 AM ******/
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

INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (2, N'la', N'le duc', 0, N'1998-06-30', NULL, NULL, N'0857968632', N'lan@gmail.com', N'ha noi', 1, 8)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (4, N'cong', N'thanh', 1, N'1888-04-02', NULL, NULL, N'0256236956', N'thanh@gmail.com', N'ha noi', 1, 15)
INSERT [dbo].[giangVien] ([giangVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [ngayBatDauLamViec], [ngayNghiLam], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (7, N'lan', N'nguyen', 0, N'1999-08-09', NULL, NULL, N'0969636986', N'lanng@gmail.com', N'ha noi', 1, 18)
SET IDENTITY_INSERT [dbo].[giangVien] OFF
SET IDENTITY_INSERT [dbo].[quanTri] ON 

INSERT [dbo].[quanTri] ([quanTriId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChi], [idCoSo], [taiKhoanId]) VALUES (1, N'vietba', N'le', 1, N'2001-04-16', N'0858050379', N'leviet@gmail.com', N'ha noi', 1, 14)
SET IDENTITY_INSERT [dbo].[quanTri] OFF
SET IDENTITY_INSERT [dbo].[sinhVien] ON 

INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (1, N'viet', N'le', 1, N'2001-04-16', N'0858050379', N'levietaqviet1@gmail.com', N'ha noi', 1, 1, 1, 4, CAST(N'2019-05-05' AS Date), NULL, NULL, N'HE153395')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'HE153408')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'HE151400')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (6, N'viet1', N'le', 1, N'2001-04-16', N'0858010379', N'levi1etaqviet1@gmail.com', N'ha noi', 1, 1, 1, 5, CAST(N'2022-06-25' AS Date), NULL, NULL, N'HE53395')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (7, N'viet', N'le duc', 0, N'2001-12-04', N'0858510379', N'viet1ldhe1533q95@fpt.1edu.vn', N'123 ton fjod jdojs cosj', 1, 1, 1, 8, CAST(N'2022-06-25' AS Date), N'1', NULL, N'SE1111')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (10, N'viet', N'le', 0, N'2001-11-11', N'+84858050311', N'levietaqviet21@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 3, 5, 1, 11, CAST(N'2022-06-27' AS Date), N'5', NULL, N'QT000001')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (11, N'viet', N'le', 1, N'2001-04-16', N'0858050449', N'levietaqviet2011@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 1, 1, 1, 12, CAST(N'2022-06-28' AS Date), N'1', NULL, N'SE1114')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (12, N'viet', N'le', 0, N'2001-04-16', N'0858050322', N'levietaqviet20011@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 1, 1, 3, 13, CAST(N'2022-06-28' AS Date), N'1', NULL, N'SE1115')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (14, N'viet1111', N'le', 1, N'2001-04-16', N'0858050444', N'levietaqviet200221@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 3, 1, 1, 20, CAST(N'2022-07-04' AS Date), N'1', NULL, N'QT2')
INSERT [dbo].[sinhVien] ([sinhVienId], [firstName], [lastName], [gioiTinh], [ngaySinh], [soDienThoai], [gmail], [diaChiSV], [idChuyenNganh], [idCoSo], [trangThaiId], [taiKhoanId], [batDauTuSV], [ketThucNgaySV], [imgData], [MSSV]) VALUES (15, N'viet', N'le', 1, N'2001-04-16', N'0858054449', N'levietaqviet2001@gmail.com', N'so 123 nguyen chi thanh donf chung ha loi', 3, 1, 1, 21, CAST(N'2022-07-04' AS Date), N'1', NULL, N'QT3')
SET IDENTITY_INSERT [dbo].[sinhVien] OFF
SET IDENTITY_INSERT [dbo].[taiKhoan] ON 

INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (3, N'giangVien1', N'123456', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (4, N'sinhvien1', N'123456', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (5, N'BQT1', N'123456', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (6, N'test', N'123456', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (7, N'8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', N'66ae94f9cb832388a8c62b8dc6cd2b851dca0639e2ea9fc809b5c4572c64fafd', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (8, N'60edfc2b9106ffb764b67d61386608602afeb71cd1cdf981e3d1b1f08f30882d', N'd54e2e5239b5d7ce831b67ff8fa8b211bf85abff28c235edfca6f4e132f6cd42', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (9, N'0eec933681d88cc8a79698d563d68643a3084eadb3014c85fdfcf62769ec5e56', N'a4baa1cc48fd24c043d99cc293e454bfec43f29819901fb37549b24f8671cf81', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (10, N'fe1b28799005365207c7bcb9c272490b67c7a0dd9f637e7fc3b20df4fc96e14a', N'b612f5681e10774a9a94115b41585e878fc9be80000727f2810ca8e56f8f4b67', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (11, N'9c59efc9dc66f45ba51fae18fb6ffa28a2892ebfea1423404c0d1c11e493d4f6', N'd7ceabe9cd1be54d04c9255399d16b9e8e466aa61ef1ae94afec4df227956c1a', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (12, N'6b5e83bba69eeafe222de2c05d7d247f2973893f58848fa83f1a234df0742315', N'd57bdc8f4fbae044db68f155d21f91673f6e24eb56f92f4fd32684cc04dc581d', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (13, N'8e4cfa301499eb1ec7090735ad004f28694241881be774bfbd39ed4727c7f9ab', N'926bdec150218aff0d4b3940d2452d27874dd518ec2a948983c61419be4356fc', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (14, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'd0c2a87403b875806a0abd0af2b8fe6e356cf1ce85ad816fa0e518a61155daa1', 1)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (15, N'a', N'b', 3)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (18, N'a3', N'b', 4)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (19, N'991e0ff65e14fbaf393d1318222d28d4dc1c2256a6b2a6d28852252b9987788b', N'a849f2e35ee56f99c41d3d0fb77fac01e1d4848c0960d38f5e184ea46c723f41', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (20, N'bbecfabb865032bcae4afe3e658a06e2324ea7694597c6af294fe6dfab9aba29', N'92bf57c65eb264aad9f49590e76c944ac83385b1e3b6a2ae13dde116463c846d', 2)
INSERT [dbo].[taiKhoan] ([taiKhoanId], [taiKhoan], [matKhau], [vaiTroId]) VALUES (21, N'c0eb460d36c293ef9093f65fce21ee4a85a539f6e6fb20ec2b584599c5243097', N'54773ad0cdd59bbd5f988ce456c0aaaee446e4144d940dc40f3d2da49917ffe7', 2)
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
