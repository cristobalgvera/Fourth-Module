package data;

import java.util.ArrayList;
import java.util.List;

public class Registry {
	private List<List<String>> data = new ArrayList<>();

	public Registry(List<List<String>> data) {
		this.data = data;
	}

	public Registry() {

	}

	public List<List<String>> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data.add(new ArrayList<>(data));
	}

}
