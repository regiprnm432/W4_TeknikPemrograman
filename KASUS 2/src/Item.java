
public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		this();	//statement ini ditambahkan sehingga constructor tanpa argument bisa terpanggil
		
		System.out.println(this.name);
	}
}

