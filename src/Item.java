
public class Item {
	private String iname;
	private String idescrip;
	
	public Item (String iname, String idescrip) {
		this.iname = iname;
		this.idescrip = idescrip;
	}
		
		public String toString(String iname) {
			return iname;
		}
		
		public String get() {
			return iname;
		}
		
		public void set(String i) {
			i = iname;
		}
		
		public String dget() {
			return idescrip;
		}
		
		public void dset(String i) {
			i = idescrip;
		}
		
		public static void main(String [] args) {
			Item sword = new Item("sword", " A sword");
			System.out.println(sword.get());
		}
}


