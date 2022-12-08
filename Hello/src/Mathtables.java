class Mathtables {
	public static void main(String[] args) {
		MyMatha mm = new MyMatha();
		mm.tables(9);
	}
}


class MyMatha {
		void tables(int column) {
			if(!(2<=column && column <=9))
				return;
			for(int i=1;i <=9;i++) {
				System.out.printf("%d * %d = %d%n", column, i, column * i);
			}
			return;
		}
}