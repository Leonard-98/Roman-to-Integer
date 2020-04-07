import java.util.*;    
public class Roman_To_Integer{
    public static int RTI(String a){
        int nr=0;
        switch(a){
            case "I":
            nr=1;
            break;
            case "IV":
            nr=4;
            break;
            case "V":
            nr=5;
            break;
            case "IX":
            nr=9;
            break;
            case "X":
            nr=10;
            break;
            case "L":
            nr=50;
            break;
            case "C":
            nr=100;
            break;
            case "D":
            nr=500;
            break;
            case "M":
            nr=1000;
            break;
            case "XL":
            nr=40;
            break;
            case "XC":
            nr=90;
            break;
            case "CD":
            nr=400;
            break;
            case "CM":
            nr=900;
            break;
        }
        return nr;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String nr_rom = s.next();
        ArrayList<String> list =  new ArrayList<>();
        for(int i=0;i<nr_rom.length();i++){
            list.add(String.valueOf(nr_rom.charAt(i)));
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("I")){
                if(list.get(i+1).equals("V")||list.get(i+1).equals("X")){
                    list.set(i,list.get(i)+list.get(i+1));
                    list.remove(i+1);
                }
            }else if(list.get(i).equals("X")){
                if(list.get(i+1).equals("L")||list.get(i+1).equals("C")){
                    list.set(i,list.get(i)+list.get(i+1));
                    list.remove(i+1);
                }
            }else if(list.get(i).equals("C")){
                if(list.get(i+1).equals("D")||list.get(i+1).equals("M")){
                    list.set(i,list.get(i)+list.get(i+1));
                    list.remove(i+1);
                }
            }
        }
        int a=0;
        for(String f:list){
            a+=RTI(f);
        }
        System.out.println(a);
    }
}
