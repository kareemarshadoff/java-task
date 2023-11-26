class School{
	void talk(){
		System.out.println("Hello!");
	}
}
class Students extends InheritanceExample{
	void talk(String name){
		System.out.println("Hello "+name);
	}
}
class InheritanceExample{
	public static void main(String args[]){
		School scObj = new School();
		Students stuObj = new Students();
		//School obj = new Students();
		scObj.talk();
		stuObj.talk("Venni");
	}
	
}