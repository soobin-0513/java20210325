package p13.textbook.s140402;

public class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value){
		this.key=key;
		this.value=value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}
	public K getKey() {
		return key;
	}
	
}
