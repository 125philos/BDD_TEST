package shifr;

public class ConEncr {
    
	//constructor
	public ConEncr()
	{
		
	}
	
	public static final int SYMBOL = 6; //символ
	public static final int A = 4; //символ
    /**
     * Получить зашифрованный коэффициент из массива по его индексу
     * @param index наименование шифрованного значения, тип int
     * @return коэффициент шифрования
     */
    public static double getValues(int index) {
        if(index == A) return 100;
    	return 110;
    }
}