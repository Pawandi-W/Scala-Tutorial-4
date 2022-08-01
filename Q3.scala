def toUpper(s:String):String={
    s.toUpperCase();
  }

 def toLower(s:String):String={
    s.toLowerCase();
  }

 def formatNames(name:String)(func:String =>String):String={
    func(name);
  }

 println(formatNames("Benny")(toUpper(_)));
 println(formatNames("Ni")(toUpper(_))+formatNames("roshan")(toLower(_)));
 println(formatNames("Saman")(toLower(_)));
 println(formatNames("K")(toUpper(_))+formatNames("umar")(toLower(_))+formatNames("a")(toUpper(_)));
