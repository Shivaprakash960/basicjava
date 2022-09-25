class EcommerceTester{

	public static void main(String [] a){
		Ecommerce.setECommerceWebsite("Amazon, Flipkart, Snapdeal, Alibaba");
		Ecommerce.setECommerceUsedto("Selling and Buying Product");
		Ecommerce.setECommerceTopWebsite("Amazon");
	
		System.out.println("Types of ECommerce Website are:-"+Ecommerce.getECommerceWebsite());
		System.out.println("ECommerce are Used for:-"+Ecommerce.getECommerceUsedto());
		System.out.println("Top ECommerce Website is:-"+Ecommerce.getECommerceTopWebsite());
	}


}