package test;

public class Goods {
	String prodId; 	// ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; 	// ��ǰ ���� 
	char asYn; 	// AS ���� ���� 

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
		return  "��ǰ ID : " + prodId + ", ��ǰ�� : " + prodName + ", ���� : " + price + ", As���ɿ��� : �Ұ�";
		}
		else {
			return  "��ǰ ID : " + prodId + ", ��ǰ�� : " + prodName + ", ���� : " + price + ", As���ɿ��� : ����";
		}
	}
}
