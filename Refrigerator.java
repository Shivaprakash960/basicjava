class Refrigerator{
static String inTheBox;
static String type;
static String refrigeratorType;
static String defrostingType;
static String compressorType;
static String capacity ;
static String numberofDoors;
static String starRating;
static String coolpad;
static String toughenedGlass;
static String builtinStabilizer;
public static void main(String shiva[]){
String inTheBox="1RefrigeratorUnit,UserManual,WarrantyCard";
type="SingleDoor";
refrigeratorType ="TopFreezerRefrigerator";
defrostingType = "DirectCool";
compressorType = "LinearCompressor";
capacity  = "192L";
numberofDoors = "1";
starRating= "2";
coolpad = "NO";
toughenedGlass="Yes";
builtinStabilizer="Yes";
System.out.println("InTheBox          : "+inTheBox);
System.out.println("Type              : "+type);
System.out.println("RefrigeratorType  : "+refrigeratorType);
System.out.println("DefrostingType    : "+defrostingType);
System.out.println("CompressorType    : "+compressorType);
System.out.println("Capacity          : "+capacity);
System.out.println("NumberofDoors     : "+numberofDoors);
System.out.println("StarRating        : "+starRating);
System.out.println("Coolpad           : "+coolpad);
System.out.println("ToughenedGlass    : "+toughenedGlass);
System.out.println("BuiltinStabilizer : "+builtinStabilizer);
}
}