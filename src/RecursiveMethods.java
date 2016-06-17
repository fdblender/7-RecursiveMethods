import java.io.File;

public class RecursiveMethods {

	public static void main(String[] args) {
		walkin(new File("/home/user")); // Replace this with a suitable
										// directory
		for (int i=1;i<=20;i++) {
			System.out.print(Fibinacci(i)+" ");
		}
	}
	
	public static int Fibinacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return Fibinacci(n-1) + Fibinacci(n-2);
		}
		}
	
	/**
	 * Recursive function to descend into the directory tree and find all the
	 * files that end with ".mp3"
	 * 
	 * @param dir
	 *            A file object defining the top directory
	 **/
	
	
	public static void walkin(File dir) {
		String pattern = ".mp3";

		File listFile[] = dir.listFiles();
		if (listFile != null) {
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].isDirectory()) {
					walkin(listFile[i]);
				} else {
					if (listFile[i].getName().endsWith(pattern)) {
						System.out.println(listFile[i].getPath());
					}
				}
			}
		}
	}
}
