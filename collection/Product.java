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
	@Override	// -----> �����Ϸ����� �������̵� �Ѵٰ� �˷��ִ� ���̴�. �̰�� ���� ������ ����ó���� ��Ÿ���� �����ְԵȴ�.
	public int hashCode() {
		return productID.hashCode();
		//+ productName.hashCode() + productPrice.hashCode()
	}
	
	public String toString() {
		return String.format("%-10s\t%-10s\t%-10s\t", productID, productName, productPrice);
	}
}
