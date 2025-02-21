/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
        
        char alphabet = new char[26];

        alphabet[1] = 'A';
        alphabet[2] = 'B';
        alphabet[3] = 'C';
        alphabet[4] = 'D';
        alphabet[5] = 'E';
        alphabet[6] = 'F';
        alphabet[7] = 'G';
        alphabet[8] = 'H';
        alphabet[9] = 'I';
        alphabet[10] = 'J';
        alphabet[11] = 'K';
        alphabet[12] = 'L';
        alphabet[13] = 'M';
        alphabet[14] = 'N';
        alphabet[15] = 'O';
        alphabet[16] = 'P';
        alphabet[17] = 'Q';
        alphabet[18] = 'R';
        alphabet[19] = 'S';
        alphabet[20] = 'T';
        alphabet[21] = 'U';
        alphabet[22] = 'V';
        alphabet[23] = 'W';
        alphabet[24] = 'X';
        alphabet[25] = 'Y';
        alphabet[26] = 'Z';
    }

    public CaesarCipher(int num){
        char[] alphabet = new char[26];
        char[] shifted = new char[26];

        for(int i=0; i<alphabet.length; i++)
        {
            if(shifted[i]+num%26 == shifted[i])
            shifted[i] = alphabet[i+num];
            else{
                shifted[i] = alphabet[shifted[i] + num % 26];
            }
        }
        System.out.println(shifted);
    }

    public String encrypt(String message){

        String encrypted = "";
        boolean original = false;
        int sum = 0;

        for(int i=0; i<message.length(); i++)
        {
            for(int j=0; j<alphabet.length; j++)
            {
                if(alphabet[j]==message.charAt(i))
                {
                    char enchar = shifted[j];
                    encrypted += enchar;
                }
                if(message.charAt(i) != alphabet[j])
                {
                    for(int x = 0; x<alphabet.length; x++)
                    {
                        sum++;
                        if(sum>=26)
                        {
                            original = true;
                            if(original == true;)
                            {
                                char y = message.charAt(i);
                                encrypted += y;
                                sum = 0;
                            }
                        }
                    }
                }
            }
        }
        return "" + encrypted;
    }

    public String decrypt(String message){
        String decrypted = "";
        boolean original = false;
        int sum = 0;

        for(int i=0; i<message.length(); i++)
        {
            for(int j=0; j<alphabet.length; j++)
            {
                if(alphabet[j]==message.charAt(i))
                {
                    char enchar = shifted[j];
                    encrypted += enchar;
                }
                if(message.charAt(i) != alphabet[j])
                {
                    for(int x = 0; x<alphabet.length; x++)
                    {
                        sum++;
                        if(sum>=26)
                        {
                            original = true;
                            if(original == true;)
                            {
                                char y = message.charAt(i);
                                encrypted += y;
                                sum = 0;
                            }
                        }
                    }
                }
            }
        }
        return "" + decrypted;

    }

    public void shifter(int num){
        char[] shiftedText = new char[alphabet.length];

        for(int i=0; i<alphabet.length; i++)
        {
            shiftedText[i] = alphabet[i+num % 26];
        }

    }


}
