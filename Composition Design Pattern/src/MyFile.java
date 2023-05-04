public class MyFile implements Component {
	
	private String name;
	private long size;
	private String extension;

	public MyFile(String name, long size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	//@Override
	public long getSize() {
		return size;
	}

	//@Override
	public String getExtension() {
		return extension;
	}

	@Override
	public void add(Component component) throws Exception {
		throw new Exception("Cannot add to a file");
	}
	
	@Override
	public void remove(Component component) throws Exception {
		throw new Exception("Cannot remove from a file");
	}

	@Override
	public void print(int depth) {
		for(int i = 0; i < depth; i++) {
			System.out.print(" |");
		}
		System.out.println("-- " + getName() + " " + getSize() + "kb extension: " + getExtension());
	}

	@Override
	public long calculateSize() {
		return getSize();
	}

}
