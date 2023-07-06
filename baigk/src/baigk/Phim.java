package baigk;

public abstract class Phim {
	private String maPhim;
	private String tenPhim;
	private String loaiPhim;
	private String tenDaoDien;
	private int soSuatChieu;
	private double giaSuatChieu;
	public Phim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phim(String maPhim, String tenPhim, String loaiPhim, String tenDaoDien, int soSuatChieu,
			double giaSuatChieu) {
		super();
		this.maPhim = maPhim;
		setTenPhim(tenPhim);
		setLoaiPhim(loaiPhim);
		this.tenDaoDien = tenDaoDien;
		this.soSuatChieu = soSuatChieu;
		this.giaSuatChieu = giaSuatChieu;
	}
	public String getMaPhim() {
		return maPhim;
	}
	public void setMaPhim(String maPhim) {
		this.maPhim = maPhim;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		if (!tenPhim.trim().equals("")) {
			this.tenPhim = tenPhim;			
		} else {
			this.tenPhim = "chua cap nhat";
		}
	}
	public String getLoaiPhim() {
		return loaiPhim;
	}
	public void setLoaiPhim(String loaiPhim) {
		if (loaiPhim=="nuoc ngoai" || loaiPhim=="trong nuoc") {
			this.loaiPhim = loaiPhim;
			
		} else {
			this.loaiPhim = "";

		}
	}
	public String getTenDaoDien() {
		return tenDaoDien;
	}
	public void setTenDaoDien(String tenDaoDien) {
		this.tenDaoDien = tenDaoDien;
	}
	public int getSoSuatChieu() {
		return soSuatChieu;
	}
	public void setSoSuatChieu(int soSuatChieu) {
		this.soSuatChieu = soSuatChieu;
	}
	public double getGiaSuatChieu() {
		return giaSuatChieu;
	}
	public void setGiaSuatChieu(double giaSuatChieu) {
		this.giaSuatChieu = giaSuatChieu;
	}
}
