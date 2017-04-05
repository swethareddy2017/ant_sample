import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Additiontest{

@Test
public void testResult1(){
Addition sum=new Addition();
int addition=sum.add(3,2);
assertEquals(5,addition);
}


@Test
public void testResult2(){
Addition sum=new Addition();
int addition=sum.add(15,20);
assertEquals(5,addition);
}

@Test
public void testResult(){
Addition sum=new Addition();
int addition=sum.add(45,3);
assertEquals(48,addition);
}
}
