
public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;	//mengubah modifier menjadi private
	
	public void tambahStok(int stk) {	//methode ini digunakan sebagai operator penambahan
		this.stok += stk;	
	}
	
	public int getStok() {	//ditambahkan method getter
		return this.stok;
	}
	
	public Barang (String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}

}
