package collection;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if(o != null && o instanceof Product) {
			Product obj = (Product)o;
			if(productID.equals(obj.productID))
				//&& productName.equals(obj.productName) && productPrice.equals(obj.productPrice)
				result = true;
		}
		return result;
	}
	@Override	// -----> 컴파일러에게 오버라이드 한다고 알려주는 것이다. 이경우 조상에 없으면 에러처리가 나타나서 보여주게된다.
	public int hashCode() {
		return productID.hashCode();
		//+ productName.hashCode() + productPrice.hashCode()
	}
	
	public String toString() {
		return String.format("%-10s\t%-10s\t%-10s\t", productID, productName, productPrice);
	}
}
