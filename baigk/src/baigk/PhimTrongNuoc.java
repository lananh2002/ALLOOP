package baigk;

public class PhimTrongNuoc extends Phim {
	private String theLoai;
		public PhimTrongNuoc() {
		super();
		// TODO Auto-generated constructor stub
	}



		public PhimTrongNuoc(String theLoai) {
			super();
			this.theLoai = theLoai;
		}



		

		public PhimTrongNuoc(String maPhim, String tenPhim, String loaiPhim, String tenDaoDien, int soSuatChieu,
				double giaSuatChieu, String theLoai) {
			super(maPhim, tenPhim, loaiPhim, tenDaoDien, soSuatChieu, giaSuatChieu);
			this.theLoai = theLoai;
		}



		public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
public double doanhThuPhimTrongNuoc() {
	return getSoSuatChieu()*getGiaSuatChieu();
	
}



@Override
public String toString() {
	return "PhimTrongNuoc [theLoai=" + theLoai + ", doanhThuPhimTrongNuoc()=" + doanhThuPhimTrongNuoc()
			+ ", getMaPhim()=" + getMaPhim() + ", getTenPhim()=" + getTenPhim() + ", getLoaiPhim()=" + getLoaiPhim()
			+ ", getTenDaoDien()=" + getTenDaoDien() + ", getSoSuatChieu()=" + getSoSuatChieu() + "]";
}


		
		
}
