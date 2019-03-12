package pilhaex2;


public class PilhaEx2 {


    public static void main(String[] args) {
        
        Pilha p = new Pilha("ababcbaba");
        
        System.out.println( p.verificar());
        
        System.out.println(p.isEmpty());
        p.pop();
        p.push('f');
        System.out.println(p.isFull());
        System.out.println(p.size());
        System.out.println(p.top());
    }
    
}
