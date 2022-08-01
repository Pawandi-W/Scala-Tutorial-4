print("Enter Integer : ");
var n = scala.io.StdIn.readInt();

def output(n:Int):Any= n match{
    case n if n<0 => println("Negative");
    case n if n==0 =>println("Zero");
    case n if n%2==0 =>println("Even");
    case n if n%2==1 =>println("Odd");
}
output(n);
