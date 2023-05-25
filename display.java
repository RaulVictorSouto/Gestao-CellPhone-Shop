package telaUsuario;

import java.util.function.Consumer;
import gestao.iphone;
import gestao.xiaomi;

public class display {

	public static void main(String[] args) {
		xiaomi xicel = new xiaomi();
		double xiaomipreco = xicel.preco;
		int xiaomiquantidade = xicel.quantidade;
		
		iphone ipcel = new iphone();
		double iphonepreco = ipcel.preco;
		int iphonequantidade = ipcel.quantidade;
		
		
		System.out.println("Celulares: \n \n");
		
		System.out.println("Xiaomi: ");
		System.out.println("Preço: ");
		Consumer<Integer> px = a -> System.out.println(a);
		px.accept((int) xiaomipreco);
		System.out.println("Quantidade: ");
		Consumer<Integer> qx = b -> System.out.println(b);
		qx.accept((int) xiaomiquantidade);
	
		System.out.println("\n\nIphone: ");
		System.out.println("Preço: ");
		Consumer<Integer> pi = c -> System.out.println(c);
		pi.accept((int) iphonepreco);
		System.out.println("Quantidade: ");
		Consumer<Integer> qi = d -> System.out.println(d);
		qi.accept((int) iphonequantidade);
	}
}
