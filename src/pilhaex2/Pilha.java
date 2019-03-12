package pilhaex2;

import java.util.EmptyStackException;

public class Pilha implements Interface{
    private char palavras[];
    private int topo;

    
    public Pilha(String frase){
        palavras = frase.toCharArray();
        topo = palavras.length-1;
    }

    
    public boolean verificar(){
        int tamanho = (palavras.length - 1)/2;
        
        char [] w = new char[tamanho];
        char [] m = new char[tamanho];
        
        for(int i = 0; i <= tamanho-1; i++){
            w[i] = palavras[i];
        }
        int x = tamanho-1;
        for(int i = palavras.length-1; i > tamanho; i--){
            m[x] = palavras[i];
            x--;
        }
        System.out.println(w);
        System.out.println(m);
        
        int diferente = 0;
        
        for(int i = 0; i <= tamanho-1; i++){
            if(w[i] != m[i]){
                diferente++;
            }
        }
        return diferente == tamanho;       
    }
    
    
    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo == palavras.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public void push(char elemento) {
        if (!isFull()) {
            topo++;
            palavras[topo] = elemento;
        }
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()) {
            int retorno = palavras[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    @Override
    public char top() throws EmptyStackException {
        if (!isEmpty()) {
            return palavras[topo];
        }
        throw new EmptyStackException();
    }
    
    
}
