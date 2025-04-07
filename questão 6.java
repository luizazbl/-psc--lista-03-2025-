import java.util.scanner;
imp0rt java.util.Random;
public class testel
Run | Debug
public static void main (String[] args) E
Scanner leia = new Scanner (System. in);
Random random = new Random
int numi, num2, aleatorio, maior, menor;
System.out.println(x:"primeiro numero: ");
numl = leia.nextInt);
System. out-println(x:"segundo numero: ");
num2 = leia.nextInt();
if
(numi > num2) (
maior = num1;
menor = num2;
mai
else or = num2;
menor = num1;
}
aleatorio = random.nextInt(maior - menor + 1)
+ menor;
System.out.println("o numero sorteado foi: " + (aleatorio));
if (aleatorio % 2 == 0)(
System.out.println(x:"par");
30
}
elsef
System. out-println(x:"impar");
34
}
leia close();
