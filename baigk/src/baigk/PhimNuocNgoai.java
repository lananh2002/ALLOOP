package baigk;

public class PhimNuocNgoai extends Phim {
	private String quocGia;
	private String chauLuc;
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	public String getChauLuc() {
		return chauLuc;
	}
	public void setChauLuc(String chauLuc) {
		this.chauLuc = chauLuc;
	}
	public PhimNuocNgoai(String maPhim, String tenPhim, String loaiPhim, String tenDaoDien, int soSuatChieu,
			double giaSuatChieu, String quocGia, String chauLuc) {
		super(maPhim, tenPhim, loaiPhim, tenDaoDien, soSuatChieu, giaSuatChieu);
		this.quocGia = quocGia;
		this.chauLuc = chauLuc;
	}
	public PhimNuocNgoai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double doanhThuPhimNuocNgoai() {
		return getSoSuatChieu()*getGiaSuatChieu()*1.5;
		
		
	}
	@Override
	public String toString() {
		return "PhimNuocNgoai [quocGia=" + quocGia + ", chauLuc=" + chauLuc + ", doanhThuPhimNuocNgoai()="
				+ doanhThuPhimNuocNgoai() + ", getMaPhim()=" + getMaPhim() + ", getTenPhim()=" + getTenPhim()
				+ ", getLoaiPhim()=" + getLoaiPhim() + ", getTenDaoDien()=" + getTenDaoDien() + ", getSoSuatChieu()="
				+ getSoSuatChieu() + ", getGiaSuatChieu()=" + getGiaSuatChieu() + "]";
	}

}
