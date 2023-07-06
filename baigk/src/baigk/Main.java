package baigk;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PhimNuocNgoai> nuocNgoais = new ArrayList<>();
		
		PhimNuocNgoai phimNuocNgoai = new PhimNuocNgoai("s","PHIM HOLO","s","s",2,70000,"angola","chau phi");
		PhimNuocNgoai phimNuocNgoai2 = new PhimNuocNgoai("s","PHIM HOLO2","s","s",254,370000,"angola","chau phi");
		PhimNuocNgoai phimNuocNgoai3 = new PhimNuocNgoai("s","PHIM HOLO3","s","s",25,270000,"queti","chau phi");
		nuocNgoais.add(phimNuocNgoai);
		nuocNgoais.add(phimNuocNgoai2);
		nuocNgoais.add(phimNuocNgoai3);
		for (PhimNuocNgoai nuocNgoai : nuocNgoais) {
            System.out.println(nuocNgoai+"\n");
        }
		 System.out.println("Test xóa phimNuocNgoai2 \n");
		nuocNgoais.remove(phimNuocNgoai2);
		for (PhimNuocNgoai nuocNgoai : nuocNgoais) {
            System.out.println(nuocNgoai+"\n");
        }
		
//		PhimTrongNuoc phimTrongNuoc = new  PhimTrongNuoc("F", "D", "D", "v", 5, 5, "hoat hinh");
//		System.out.println(phimTrongNuoc);
		
	

	}

}
