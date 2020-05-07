import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendedorTests {
    //Enumerator
    //Test-per-method
    @Test
    public void test1(){
        Vendedor vendedor = new Vendedor("Joao", 20,"Peixaria");
        vendedor.setName("Afonso");
        assertEquals("Afonso", vendedor.getName());

    }

    //Enumerator
    //Test-per-method
    @Test
    public void test2(){
        Vendedor vendedor = new  Vendedor("Bruno", 15,"Nasa");
        vendedor.setAge(21);
        assertEquals((Integer)21, vendedor.getAge());
    }
    //Test-per-method

    @Test
    public void testName_Car(){
        Vendedor vendedor = new  Vendedor("Bruno", 15,"Nasa");
        vendedor.setLocal_trabalho("Nasa");
        assertEquals("Nasa", vendedor.getLocal_trabalho());
    }
}
