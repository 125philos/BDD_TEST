package shifr;

public class ConDescrypt {

    //constructor
    public ConDescrypt() {

    }

    public static final int A = 100; //символ
    public static final int B = 101; //символ
    public static final int C = 110; //символ
    public static final int D = 111; //символ
    public static final int E = 1001; //символ
    public static final int G = 1010; //символ

    /**
     * Получить расшифрованный коэффициент из массива по его индексу
     * @param index наименование шифрованного значения, тип int
     * @return коэффициент расшифрованого значения
     */
    public static double getValuesDes(int index) {
        if(index == 101) return 5;
        else if(index == 110) return 6;
        else if(index == 111) return 7;
        else if(index == 1001) return 9;
        else if(index == 1010) return 10;
        return 4;
    }
}