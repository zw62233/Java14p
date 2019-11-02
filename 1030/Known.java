public class Known {
	public static void main(String[] args) {
	i_am_here:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 3 && j == 4) {
					continue i_am_here;
				}
			}
		}
	}
}