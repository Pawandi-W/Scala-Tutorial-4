def intrest(p:Int): Double = p match {
  case p if p<= 20000 => p* 0.02f;
  case p if p <= 200000 => p* 0.04f;
  case p if p <= 2000000 => p * 0.035f;
  case p if p <= 20000000 => p * 0.065f;}

print("Intrest for Rs.2000 is Rs."+intrest(4000001));
