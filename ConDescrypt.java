package shifr;

public class ConDescrypt {

    //constructor
    public ConDescrypt() {

    }

    public static final int A = 100; //символ
    public static final int B = 101; //символ

    /**
     * Получить расшифрованный коэффициент из массива по его индексу
     * @param index наименование шифрованного значения, тип int
     * @return коэффициент расшифрованого значения
     */
    public static double getValuesDes(int index) {
        if(index == 101) return 5;
        else if(index == 110) return 6;
        return 4;
    }
}