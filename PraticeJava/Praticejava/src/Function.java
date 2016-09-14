
class Function {
	static int width;
	static int height;
	
//Function(int w, int h){
//	
//	width = w;
//	height = h;
//	
//}
	
public void setArea(int w,int h){
	width = w;
	height = h;
}
	
	
 public int getArea(){
	 return width * height;
 }
 
 public void display(){
	 System.out.println(getArea());
 
 }
}
