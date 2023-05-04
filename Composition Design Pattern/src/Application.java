import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a directory path: ");
//		File directory = new File(input.nextLine());
		
		String path = "C:\\Users\\Khalid\\Desktop\\222\\ics353\\olds";
		File f = new File(path);
		
		Folder root = new Folder(f.getName());
		traverse(root, f, true);
		System.out.println("Size: " + root.calculateSize() + "kb\n");
		root.print();
		
	}
	
	public static void traverse(Folder root, File f, boolean isFirst) {
		
		if(f.isDirectory()) {
			Folder folder = new Folder(f.getName());
			
			if(!isFirst) {
				root.add(folder);
			}
			else {
				folder = root;
			}
			
			File[] files = f.listFiles();
			for(int i = 0; files != null && i < files.length; i++) {
				traverse(folder, files[i], false);
			}
		}
		else {
			String name = f.toString();
			int index = name.lastIndexOf('.');
			String extension = name.substring(index + 1);
			
			root.add(new MyFile(f.getName(), f.length()/1024, extension));
		}
		
	}

}
