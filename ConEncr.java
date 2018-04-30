package shifr;

public class ConEncr {
    
	//constructor
	public ConEncr()
	{
		
	}
	
	public static final int SYMBOL = 6; //символ
	public static final int A = 4; //символ
	public static final int B = 5; //символ
	public static final int C = 6; //символ
	public static final int D = 7; //символ
	public static final int E = 9; //символ
	public static final int G = 10; //символ
	public static final int J = 11; //символ
	public static final int T = 12; //символ

	//Массив коэффициентов конвертирования
	private static int[] shifrov = {
			100, //A
			101, //B
			110, //C
			111, //D
			1001, //E
			1010, //G
			1011, //J
			1100 //T
	};

	/**
	 * Шифрование символа с ключом
	 * @param index символ для шифрования, из которой будем зашифровывать, тип int
	 * @param key ключ, тип double
	 * @return полученная в результате зашифрованный символ с ключом, тип double
	 */
	public static double encrFromKey(int index, double key) {
		return 1010100;
	}

	/**
	 * Получаем зашифрованный символ из массива по его индексу
	 * @param index индекс в массиве, тип int
	 * @return зашифрованный символ, записанный по данному индексу, тип int
	 * @throws return -1 в случае, если передается индекс, выходящий за пределы массива
	 */
    public static double getValues(int index) {
		if (index < 0 || index > shifrov.length)
			return -1;
		else
			return shifrov[index];
	}
    }
}