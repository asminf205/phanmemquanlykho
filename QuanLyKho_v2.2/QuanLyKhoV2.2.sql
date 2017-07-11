use master
go
if exists(Select * from sys.databases where name=N'QuanLyKhoV2')
	Drop database QuanLyKhoV2
Go

Create database QuanLyKhoV2
Go

Use QuanLyKhoV2
Go

Create table NhanVien(
MaNV int IDENTITY(1,1) Primary Key not null, 
TenDN varchar(30) not null, 
MatKhau varchar (30) not null, 
QuanTri bit not null, 
HoTenNV Nvarchar(100) not null, 
NgaySinh Date not null, 
DiaChi Nvarchar(255) not null, 
SDT varchar(20) not null, 
GioiTinh int not null,
NgayVaoLam Date,
TrangThai int
);
GO

Create table QuocGia(
MaQuocGia int IDENTITY(1,1) Primary Key not null, 
TenQuocGia varchar(30) not null
);
GO

Create table LoaiSanPham(
MaLoaiSP int IDENTITY(1,1) Primary Key not null, 
TenLoaiSP nvarchar(30) not null
);
GO

Create table NSX (
MaNSX int IDENTITY(1,1) Primary Key not null, 
TenNSX Nvarchar(50) not null, 
Email nvarchar(30) not null, 
Website varchar(30) not null, 
Logo varchar(255) not null
);
GO

Create table SanPham(
MaSP int IDENTITY(1,1) Primary Key not null, 
TenSP nvarchar(30) not null, 
MaNSX int not null references NSX(MaNSX),
MaQuocGia int not null references QuocGia(MaQuocGia),
MaLoaiSP int not null references LoaiSanPham(MaLoaiSP),
MoTa nvarchar(255) not null, 
TonKho int not null,
NgayNhap Date not null,
TrangThai int null,
Gia int not null
);
GO

Create table PhieuNX(
MaPhieu int IDENTITY(1,1) Primary Key not null, 
NgayLap Date not null, 
LoaiPhieu nvarchar(30) not null, 
MaNV int not null  REFERENCES NhanVien(MaNV) ,
GhiChu nvarchar(255)
);
GO

Create table PhieuNXCT(
MaPhieu int not null references PhieuNX(MaPhieu),
MaSP int not null references SanPham(MaSP),
SoLuong int not null, 
GhiChu nvarchar(255)
primary key (MaPhieu,MaSP)
);
GO

INSERT INTO NhanVien VALUES ('admin', 'admin', 0, 'admin', '01-01-1984', 'admin', 11300000, 1, '01-01-2016',0);
INSERT INTO NhanVien VALUES ('user', 'user', 1, 'user', '01-01-1993', 'user', 11311311, 0, '01-01-2016',0);
INSERT INTO NhanVien VALUES ('test', 'test', 1, 'test', '01-01-1993', 'test', 11311311, 0, '01-01-2016',1);
GO

INSERT INTO LoaiSanPham VALUES ('Chuot');
INSERT INTO LoaiSanPham VALUES ('Ban Phim');
INSERT INTO LoaiSanPham VALUES ( 'Man hinh');
INSERT INTO LoaiSanPham VALUES ( 'Smartphone');
INSERT INTO LoaiSanPham VALUES ( 'Loa');
INSERT INTO LoaiSanPham VALUES ( 'Laptop');
INSERT INTO LoaiSanPham VALUES ( 'USB');
INSERT INTO LoaiSanPham VALUES ( 'Phu kien');
GO

INSERT INTO QuocGia VALUES ( 'Viet Nam');
INSERT INTO QuocGia VALUES ( 'Phap');
INSERT INTO QuocGia VALUES ( 'Ha Lan');
INSERT INTO QuocGia VALUES ( 'Trung quoc');
INSERT INTO QuocGia VALUES ( 'My');
INSERT INTO QuocGia VALUES ( 'Canada');
INSERT INTO QuocGia VALUES ( 'Nhat Ban');
INSERT INTO QuocGia VALUES ( 'Han Quoc');
GO

Insert into NSX values('Asus','asus@gmail.com','asus.com','logo\Asus.jpg');
Insert into NSX values('Dell','dell@gmail.com','dell.com','logo\Dell.jpg');
Insert into NSX values('Sony','sony@gmail.com','sony.com','logo\Sony.jpg');
Insert into NSX values('HP','hp@gmail.com','hp.com','logo\HP.jpg');
Insert into NSX values('Acer','acer@gmail.com','acer.com','logo\Acer.jpg');
Insert into NSX values('Lenovo','lenovo@gmail.com','lenovo.com','logo\Lenovo.jpg');
Insert into NSX values('SamSung','samsung@gmail.com','samsung.com','logo\SamSung.jpg');
Insert into NSX values('Apple','apple@gmail.com','apple.com','logo\Apple.jpg');
GO

INSERT INTO SanPham values('Chuot Lenovo',6,01,1,'chuot danh cho gamer',0,'10/01/2016',0,11111);
INSERT INTO SanPham values('Chuot Acer',5,01,1,'chuot danh cho gamer',0,'10/01/2016',0,12342);
INSERT INTO SanPham values('Sam Sung Galaxy',7,08,4,'smartphone cao cap',0,'10/01/2016',0,321553);
INSERT INTO SanPham values('Iphone 7',8,05,4,'smartphone cao cap',0,'10/01/2016',0,43144);
INSERT INTO SanPham values('Dell Inspiron',2,05,6,'Laptop cau hinh cao',0,'10/01/2016',1,5265);
INSERT INTO SanPham values('Man Hinh sony',3,07,3,'Man hinh may tinh',0,'10/01/2016',2,54343);
INSERT INTO SanPham values('USB HP',4,06,7,'USB',0,'10/01/2016',3,76546);
GO

/****** Không nên thêm nhé.. bị lỗi hệ thống  ******/
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','N',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
INSERT INTO PhieuNX values('10/01/2016','X',2,'');
GO


/****** Không nên thêm nhé.. bị lỗi hệ thống  ******/
INSERT INTO PhieuNXCT values(15,1,100,'da nhap');
INSERT INTO PhieuNXCT values(15,2,150,'da nhap');
INSERT INTO PhieuNXCT values(15,3,200,'da nhap');
INSERT INTO PhieuNXCT values(20,2,200,'da nhap');
INSERT INTO PhieuNXCT values(21,2,100,'da nhap');
INSERT INTO PhieuNXCT values(21,5,100,'da nhap');
INSERT INTO PhieuNXCT values(21,7,100,'da nhap');
INSERT INTO PhieuNXCT values(23,5,100,'da xuat');
INSERT INTO PhieuNXCT values(23,7,100,'da xuat');
INSERT INTO PhieuNXCT values(24,5,100,'da xuat');
INSERT INTO PhieuNXCT values(24,7,100,'da xuat');
GO
