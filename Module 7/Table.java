package module7;


class Table {
	synchronized void print_table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		System.out.println();
	}
}

class TableDemo extends Thread{
	public static void main(String[] args) {
		Table t = new Table();
		new Thread() {
			public void run() {
				t.print_table(5);
			}
		}.start();
		new Thread() {
			public void run() {
				t.print_table(6);
			}
		}.start();
		new Thread() {
			public void run() {
				t.print_table(7);
			}
		}.start();
		new Thread() {
			public void run() {
				t.print_table(8);
			}
		}.start();
		new Thread() {
			public void run() {
				t.print_table(9);
			}
		}.start();
	}
}
