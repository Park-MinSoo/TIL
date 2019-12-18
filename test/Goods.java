package test;

public class Goods {
	String prodId; 	// 상품 아이디 
	String prodName; // 상품 이름 
	int price; 	// 상품 가격 
	char asYn; 	// AS 가능 여부 

	Goods(String prodId, String prodName, int price){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	Goods(String prodId, String prodName, int price, char asYn){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = asYn;
	}
	
	String getGoodsInfo()	{
		if (asYn == 'N' ){
		return  "상품 ID : " + prodId + ", 상품명 : " + prodName + ", 가격 : " + price + ", As가능여부 : 불가";
		}
		else {
			return  "상품 ID : " + prodId + ", 상품명 : " + prodName + ", 가격 : " + price + ", As가능여부 : 가능";
		}
	}
}
