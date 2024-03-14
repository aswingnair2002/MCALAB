class product{
	String pname;
	String pcode;
	int price;
product(String n_pname,String n_pcode,int n_price)
{
	pname=n_pname;
	pcode=n_pcode;
	price=n_price;
	}
int price(){
	return price();
}
public static void main(String[] args){
	product p1=new product("cheriyan","CJ47",111);
	product p2=new product("Manasi","MS23",222);
	product p3=new product("Alwin","AJ56",333);
if(p1.price<=p3.price&&p1.price<=p2.price)
System.out.println("Lowest product ID is: "+p1.pcode);
if(p2.price<=p1.price&&p2.price<=p3.price)
System.out.println("Lowest product ID is: "+p2.pcode);
if(p3.price<=p2.price&&p3.price<=p1.price)
System.out.println("Lowest product ID is: "+p3.pcode);
}
}

