import java.util.ArrayList;

public class Folder implements Component {
	
	private ArrayList<Component> children = new ArrayList<Component>();
	private String name;
	
	public Folder(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}
	
	@Override
	public void remove(Component component){
		children.remove(component);
	}

	@Override
	public long calculateSize() {
	    return calculateSize(0);	
	}
	
	public long calculateSize(long size) {
		
		for(Component component : children) {
			size += component.calculateSize();
		}
		return size;
		
	}
	
	public void print() {
		print(0);
	}

	@Override
	public void print(int depth) {
		if(depth > 0) {
			for(int i = 0; i < depth; i++) {
				System.out.print(" |");
			}
			System.out.print("-- ");
		}
		System.out.println(getName() + " " + calculateSize() + "kb");
		
		for(Component component : children) {
			component.print(depth + 1);
		}
	}

}
