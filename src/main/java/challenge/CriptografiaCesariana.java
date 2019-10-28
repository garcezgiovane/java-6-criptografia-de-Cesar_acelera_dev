package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar( String texto ) {
    	
    	if( texto.equals("") ) {
			throw new IllegalArgumentException();
		}
    	
    	String textoCriptografado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			textoCriptografado += encriptar(texto.toLowerCase().charAt(i), 3);
	    }

	    return textoCriptografado;
    }
    
    public static char encriptar(char charOriginal, int chave) {
	    char charCifrado;

	    if (charOriginal >= 97 && charOriginal <= 122) {
	        charCifrado = (char) ((charOriginal - 97 + chave) % 26 + 97);
	    } else {
	        charCifrado = charOriginal;
	    }

	    return charCifrado;
	}

    @Override
    public String descriptografar( String texto ) {
    	
    	if( texto.equals("") ) {
			throw new IllegalArgumentException();
		}

    	String textoDescriptografado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			textoDescriptografado += decriptar(texto.toLowerCase().charAt(i), 3);
	    }

	    return textoDescriptografado;
    }
    
    public static char decriptar(char charOriginal, int chave) {
	    char charCifrado;

	    if (charOriginal >= 97 && charOriginal <= 122) {
	        charCifrado = (char) ((charOriginal - 97 - chave) % 26 + 97);
	    } else {
	        charCifrado = charOriginal;
	    }

	    return charCifrado;
	}
}
