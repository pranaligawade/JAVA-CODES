package basic;

public class ByteCode {
    static  byte  byte_var;
    public static void main(String[] args) {
        System.out.println("byte bydefault value:"+byte_var);
        for (int i=0;i<5;i++){
            System.out.println("byte new value:"+(byte_var+i));
        }
    }
}
