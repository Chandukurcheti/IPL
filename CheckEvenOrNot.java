class CheckEvenOrNot{

public static void main(String[] args){
String stringNumber = args[0];
int intNumber = Integer.parseInt(stringNumber);
if(intNumber == 2){
System.out.println("The Even number is .....:: " + intNumber);
}else{
System.out.println("The Odd number is .....:: " + intNumber);
}
}
}