interface Component {
	public void add(Component component) throws Exception;
	public void remove(Component component) throws Exception;
	public void print(int depth);
	public String getName();
	public long calculateSize();
}
