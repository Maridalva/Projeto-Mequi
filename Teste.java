package projetoMequi;

 

import java.util.Scanner; 

public class Teste{
	
public static void main(String[] args) { 

	Scanner sc = new Scanner(System.in); 

	System.out.println("-------------------------"); 

	System.out.println("-------------------------"); 

	System.out.println("------PROJETO MEQUI------"); 

	System.out.println("-------------------------"); 

	System.out.println("-------------------------"); 

	System.out.println(""); 

	System.out.println(""); 

	System.out.println("--SELECIONE UMA OPÇÃO --"); 

	System.out.println(""); 

	System.out.println(" **** CARDÁPIO****"); 

	System.out.println(""); 

	System.out.println(" 1 - Lançamentos"); 

	System.out.println(" 2 - Brabos do Mequi"); 

	System.out.println(" 3 - Sanduíche de Carne Bovina"); 

	System.out.println(" 4 - Família Tasty"); 

	System.out.println(" 5 - Sanduíche de Frango"); 

	System.out.println(" 6 - Mc Lanche Feliz"); 

	System.out.println(" 7 - Mequi 1000"); 

	System.out.println(" 8 - Acompanhamentos"); 

	System.out.println(" 9 - Sobremesa"); 

	System.out.println("10 - Bebidas Frias"); 

	System.out.println("11 - Café da Manhã "); 

	System.out.println("12 - Bebidas Quentes"); 

	System.out.println("13 - Mc Ofertas"); 

	System.out.println("14 - Mequi Box "); 

	System.out.println("15 - Mequi Café"); 

	int opcaoMenu1 = sc.nextInt(); 

	switch (opcaoMenu1) { 

	case 1: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 1--- "); 

	System.out.println(" "); 

	System.out.println(" *******LANÇAMENTOS*******"); 

	System.out.println(" "); 

	System.out.println("1 - Mccrispy Chicken Legend"); 

	System.out.println("2 - Mcflurry Trufa Lingua de Gato DUO Kopenhagen Chocolate"); 

	System.out.println("3 - Mcflurry Trufa Lingua de Gato DUO Kopenhagen Morango"); 

	System.out.println("4 - Mcflurry Trufa Lingua de Gato DUO Kopenhagen Caramelo"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu1 = sc.nextInt(); 

	switch (opcaoMenuSubMenu1) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**  Mccrispy Chicken Legend**"); 

	System.out.println(""); 

	System.out.println("Calorias :926 kcal"); 

	System.out.println(""); 

	System.out.println("Composto por pão tipo brioche com batata," + " molho do CBO," 

	+ " cebola crispy, bacon em fatias, alface americana," 

	+ " queijo sabor cheddar e carne 100% de peito de frango, " 

	+ "temperada e empanada."); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("** McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :319 kcal"); 

	System.out.println(""); 

	System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e " 

	+ "a Kopenhagen podem oferecer! A sobremesa é composta por" 

	+ " espetaculares trufas Língua de Gato DUO Kopenhagen," 

	+ " bebida láctea sabor baunilha e cobertura sabor chocolate."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :479 kcal kcal"); 

	System.out.println(""); 

	System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a" 

	+ " Kopenhagen podem oferecer!" 

	+ " A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, " 

	+ "bebida láctea sabor baunilha e cobertura de morango.."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :325 kcal"); 

	System.out.println(""); 

	System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e \"\r\n" 

	+ "+ \"a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas \"\r\n" 

	+ "+ \"Língua de Gato DUO Kopenhagen,\"\r\n" 

	+ "+ \" bebida láctea sabor baunilha e cobertura de caramelo"); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 2: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 2--- "); 

	System.out.println(" "); 

	System.out.println(" *******BRABOS DO MEQUI*******"); 

	System.out.println(" "); 

	System.out.println("1 Brabo Melt Crispy"); 

	System.out.println("2 Brabo Bacon Salad"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu2 = sc.nextInt(); 

	switch (opcaoMenuSubMenu2) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("** Brabo Melt Crispy**"); 

	System.out.println(""); 

	System.out.println("Calorias :1057 kcal"); 

	System.out.println(""); 

	System.out.println("Delicioso molho lácteo cremoso sabor cheddar, hambúrguer de carne " 

	+ "100% bovina, a nova Méquinese, exclusiva maionese especial com sabor de carne" 

	+ " defumada, cebola crispy, fatias de bacon, queijo sabor cheddar, " 

	+ "tudo isso no pão tipo brioche trazendo uma explosão de sabores a cada mordida! "); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**Brabo Bacon Salad**"); 

	System.out.println(""); 

	System.out.println("Calorias :1064 kcal"); 

	System.out.println(""); 

	System.out.println("Composto pelo nosso pão tipo brioche, hambúrguer de carne" 

	+ " 100% bovina, a nova Méquinese, " 

	+ "exclusiva maionese especial com sabor de carne defumada, alface, tomate," 

	+ " fatias de bacon e queijo sabor cheddar."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 3: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 3--- "); 

	System.out.println(" "); 

	System.out.println(" *******SANDUÍCHES DE CARNE BOVINA*******"); 

	System.out.println(" "); 

	System.out.println("1 Big Mac"); 

	System.out.println("2 Duplo Quarterão"); 

	System.out.println("3 Quarterão com Queijo"); 

	System.out.println("4 McNífico Bacon"); 

	System.out.println("5 Duplo Cheddar McMelt"); 

	System.out.println("6 Cheddar McMelt"); 

	System.out.println("7 Duplo Burger Bacon"); 

	System.out.println("8 Duplo Burguer com Queijo"); 

	System.out.println("9 Triplo Burger"); 

	System.out.println("10 McFiesta"); 

	System.out.println("11 Cheeseburger"); 

	System.out.println("12 Hamburger"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu3 = sc.nextInt(); 

	switch (opcaoMenuSubMenu3) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Big Mac**"); 

	System.out.println(""); 

	System.out.println("Calorias:503 kcal"); 

	System.out.println(""); 

	System.out.println("Dois hambúrgueres (100% carne bovina), " 

	+ "alface americana, queijo sabor cheddar," 

	+ " molho especial, cebola, picles e pão com gergelim."); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**Duplo Quarterão**"); 

	System.out.println(""); 

	System.out.println("Calorias :762 kcal"); 

	System.out.println(""); 

	System.out.println("Dois hambúrgueres (100% carne bovina), " 

	+ "mostarda, ketchup, cebola, queijo sabor cheddar" 

	+ " e pão com gergelim."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**Quarterão com Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias :523 kcal"); 

	System.out.println(""); 

	System.out.println("Um hambúrguer (100% carne bovina), queijo sabor cheddar, " 

	+ "picles, cebola, ketchup, mostarda e pão com gergelim."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**McNífico Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :571 kcal"); 

	System.out.println(""); 

	System.out.println("Um hambúrguer (100% carne bovina), bacon, alface" 

	+ " americana, cebola, queijo sabor cheddar, " 

	+ "tomate, maionese, ketchup, mostarda e pão com gergelim."); 

	break; 

	case 5: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 5**"); 

	System.out.println("**Duplo Cheddar McMelt**"); 

	System.out.println(""); 

	System.out.println("Calorias :786 kcal"); 

	System.out.println(""); 

	System.out.println("Dois hambúrgueres (100% carne bovina), " 

	+ "molho lácteo cremoso sabor" 

	+ " cheddar, cebola ao molho shoyu e pão escuro com gergelim."); 

	break; 

	case 6: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 6**"); 

	System.out.println("**Cheddar McMelt**"); 

	System.out.println(""); 

	System.out.println("Calorias :474 kcal"); 

	System.out.println(""); 

	System.out.println("Um hambúrguer (100% carne bovina)," 

	+ " molho lácteo cremoso sabor cheddar, cebola ao molho shoyu " 

	+ "e pão escuro com gergelim."); 

	break; 

	case 7: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 7**"); 

	System.out.println("**Duplo Burger Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :447 kcal"); 

	System.out.println(""); 

	System.out.println("Dois hambúrgueres (100% carne bovina), " 

	+ "queijo sabor cheddar, cebola, fatias de bacon, ketchup," 

	+ " mostarda e pão com gergelim."); 

	break; 

	case 8: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 8**"); 

	System.out.println("**Duplo Burguer com Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias :478 kcal"); 

	System.out.println(""); 

	System.out.println("Dois hambúrgueres, uma explosão de sabor. " 

	+ "Dois deliciosos hambúrgueres de carne 100% bovina, queijo sabor cheddar derretido, " 

	+ "picles, cebola picada, ketchup, mostarda e pão com gergelim."); 

	break; 

	case 9: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 9**"); 

	System.out.println("**Triplo Burger**"); 

	System.out.println(""); 

	System.out.println("Calorias :559 kcal"); 

	System.out.println(""); 

	System.out.println("Três hambúrgueres (100% carne bovina), queijo sabor cheddar," 

	+ " cebola, picles," 

	+ " ketchup, mostarda e pão com gergelim."); 

	break; 

	case 10: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 10**"); 

	System.out.println("**McFiesta**"); 

	System.out.println(""); 

	System.out.println("Calorias :271 kcal"); 

	System.out.println(""); 

	System.out.println("Hambúrguer de carne 100% bovina, " 

	+ "alface, tomate e maionese no pão quentinho."); 

	break; 

	case 11: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 11**"); 

	System.out.println("**Cheeseburger**"); 

	System.out.println(""); 

	System.out.println("Calorias :302"); 

	System.out.println(""); 

	System.out.println("Um hamburguer (100% carne bovina), queijo sabor cheddar, " 

	+ "cebola, picles, ketchup, mostarda e pão sem gergelim."); 

	break; 

	case 12: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 12**"); 

	System.out.println("**Hamburger**"); 

	System.out.println(""); 

	System.out.println("Calorias :247 kcal"); 

	System.out.println(""); 

	System.out.println("Um Hamburguer (100% carne bovina)" 

	+ ", cebola, picles, ketchup, mostarda e pão sem gergelim."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 4: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 4--- "); 

	System.out.println(" "); 

	System.out.println(" *******FAMÍLIA TESTY*******"); 

	System.out.println(" "); 

	System.out.println("1 Big Tasty"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu4 = sc.nextInt(); 

	switch (opcaoMenuSubMenu4) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Big Tasty**"); 

	System.out.println(""); 

	System.out.println("Calorias :944 kcal"); 

	System.out.println(""); 

	System.out.println("Um hambúrguer (100% carne bovina), queijo sabor emental, " 

	+ "tomate, alface americana, cebola, molho Tasty e pão com gergelim."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 5: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 5--- "); 

	System.out.println(" "); 

	System.out.println(" *******SANDUÍCHES DE FRANGO*******"); 

	System.out.println(" "); 

	System.out.println("1 McCrispy Chicken Legend"); 

	System.out.println("2 McCrispy Chicken Deluxe"); 

	System.out.println("3 McCrispy Chicken Melt & Bacon"); 

	System.out.println("4 McChicken Bacon"); 

	System.out.println("5 McChicken"); 

	System.out.println("6 Chicken Jr."); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu5 = sc.nextInt(); 

	switch (opcaoMenuSubMenu5) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**McCrispy Chicken Legend**"); 

	System.out.println(""); 

	System.out.println("Calorias :926 kcal"); 

	System.out.println(""); 

	System.out.println("Composto por pão tipo brioche com batata, molho do CBO," 

	+ "cebola crispy, bacon em fatias, alface americana, queijo sabor cheddar " 

	+ "e carne 100% de peito de frango, temperada e empanada."); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**McCrispy Chicken Deluxe**"); 

	System.out.println(""); 

	System.out.println("Calorias :497 kcal"); 

	System.out.println(""); 

	System.out.println("Sanduiche composto por tipo brioche com batata, " 

	+ "carne 100% de peito de frango," 

	+ " temperada e empanada, maionese, alface americana e tomate."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**McCrispy Chicken Melt & Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :628 kcal"); 

	System.out.println(""); 

	System.out.println("Sanduiche composto por pão tipo brioche com batata, " 

	+ "carne 100% de peito de frango, temperada e empanada, " 

	+ "molho lácteo cremoso sabor cheddar e fatias de bacon."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**McChicken Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :430 kcal"); 

	System.out.println(""); 

	System.out.println("Frango empanado, maionese, bacon, alface americana" 

	+ " e pão com gergelim."); 

	break; 

	case 5: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 5**"); 

	System.out.println("**McChicken**"); 

	System.out.println(""); 

	System.out.println("Calorias :396 kcal"); 

	System.out.println(""); 

	System.out.println("Frango empanado, maionese, alface americana e pão com gergelim."); 

	break; 

	case 6: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 6**"); 

	System.out.println("**Chicken Jr.**"); 

	System.out.println(""); 

	System.out.println("Calorias :352 kcal"); 

	System.out.println(""); 

	System.out.println("Frango empanado, maionese, alface americana e pão com gergelim."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 6: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 6--- "); 

	System.out.println(" "); 

	System.out.println(" *******MC LANCHE FELIZ *******"); 

	System.out.println(" "); 

	System.out.println("1 Chicken McNuggets 4 unidades"); 

	System.out.println("2 McFiesta"); 

	System.out.println("3 Hamburger"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu6 = sc.nextInt(); 

	switch (opcaoMenuSubMenu6) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Chicken McNuggets 4 unidades**"); 

	System.out.println(""); 

	System.out.println("Calorias :155 Kcal"); 

	System.out.println(""); 

	System.out.println("Açúcares totais\r\n" + "0.5g\r\n" + "Açúcares adicionados\r\n" + "0g\r\n" 

	+ "Carboidratos\r\n" + "10g\r\n" + "Proteínas\r\n" + "9.1g\r\n" + "Gordura total\r\n" 

	+ "8.6g\r\n" + "Gorduras saturadas\r\n" + "2g\r\n" + "Gordura trans\r\n" + "0.1g\r\n" 

	+ "Fibra alimentar\r\n" + "0.77g\r\n" + "Sódio\r\n" + "300.2mg"); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**McFiesta**"); 

	System.out.println(""); 

	System.out.println("Calorias :271 Kcal"); 

	System.out.println(""); 

	System.out.println("Açúcares totais\r\n" + "5.1g\r\n" + "Açúcares adicionados\r\n" + "4.3g\r\n" 

	+ "Carboidratos\r\n" + "27g\r\n" + "Proteínas\r\n" + "13g\r\n" + "Gordura total\r\n" 

	+ "12.1g\r\n" + "Gorduras saturadas\r\n" + "4g\r\n" + "Gordura trans\r\n" + "0.3g\r\n" 

	+ "Fibra alimentar\r\n" + "1.99g\r\n" + "Sódio\r\n" + "423.5mg"); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**Hamburguer**"); 

	System.out.println(""); 

	System.out.println("Calorias :249 Kcal"); 

	System.out.println(""); 

	System.out.println("Açúcares totais\r\n" + "7.2g\r\n" + "Açúcares adicionados\r\n" + "5.3g\r\n" 

	+ "Carboidratos\r\n" + "30g\r\n" + "Proteínas\r\n" + "13.1g\r\n" + "Gordura total\r\n" 

	+ "8.4g\r\n" 

	+ "Gorduras saturadas\r\n" + "3.4g\r\n" + "Gordura trans\r\n" + "0.2g\r\n" 

	+ "Fibra alimentar\r\n" + "1.83g\r\n" 

	+ "Sódio\r\n" + "470.8mg"); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 7: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 7--- "); 

	System.out.println(" "); 

	System.out.println(" *******MC 1000*******"); 

	System.out.println(" "); 

	System.out.println("1 SuperMc"); 

	System.out.println("2 McRings Cheddar Bacon"); 

	System.out.println("3 Caldo&Freddo Chocolate"); 

	System.out.println("4 Caldo&Freddo Morango"); 

	System.out.println("5 Caldo&Freddo Caramelo"); 

	System.out.println("6 McRings Bacon"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu7 = sc.nextInt(); 

	switch (opcaoMenuSubMenu7) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**SuperMc**"); 

	System.out.println(""); 

	System.out.println("Calorias :475 kcal"); 

	System.out.println(""); 

	System.out.println("Um hamburguer (100% bovino), alface americana, cebola, ketchup, molho tasty, " 

	+ "maionese, picles, queijo sabor cheddar, tomate e pão com gergelim"); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**McRings Cheddar Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :1089 kcal"); 

	System.out.println(""); 

	System.out.println("A crocante e deliciosa cebola empanada do Méqui," 

	+ "agora com melt sabor cheddar e bacon crispy. Não dá para resistir, experimente!" 

	+ "Produto exclusivo da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo - SP)."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**Caldo&Freddo Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :495 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa composta por mix de baunilha, " 

	+ "cobertura sabor chocolate e torta de maçã."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**Caldo&Freddo Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :478 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa composta por mix de baunilha, " 

	+ "cobertura de morango e torta de maçã."); 

	break; 

	case 5: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 5**"); 

	System.out.println("**Caldo&Freddo Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :502 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa composta por mix de baunilha," 

	+ " cobertura de caramelo e torta de maçã."); 

	break; 

	case 6: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 6**"); 

	System.out.println("**McRings Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :959 kcal"); 

	System.out.println(""); 

	System.out.println("Esse delicioso sanduiche é composto por um hambúrguer (100% carne bovina), " 

	+ "queijo sabor emental, bacon, cebola frita empanada, maionese, ketchup e pão tipo brioche. Produto exclusivo" 

	+ " da loja Méqui 1000 (Avenida Paulista, 1811 –São Paulo -SP.)"); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 8: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 8--- "); 

	System.out.println(" "); 

	System.out.println(" *******ACOMPANHAMENTOS*******"); 

	System.out.println(" "); 

	System.out.println("1 McFritas Cheddar Bacon"); 

	System.out.println("2 McFritas Grande"); 

	System.out.println("3 McFritas Média"); 

	System.out.println("4 McFritas Pequena"); 

	System.out.println("5 McFritas Kids"); 

	System.out.println("6 Chicken McNuggets 6 unidades"); 

	System.out.println("7 Chicken McNuggets 4 unidades"); 

	System.out.println("8 Chicken McNuggets 10 unidades"); 

	System.out.println("9 Molho Agridoce"); 

	System.out.println("10 Molho Barbecue"); 

	System.out.println("11 Molho Ranch"); 

	System.out.println("12 Molho Caipira"); 

	System.out.println("13 Mega McNuggets"); 

	System.out.println("14 Ketchup"); 

	System.out.println("15 Mostarda"); 

	System.out.println("16 Tomatinho"); 

	System.out.println("17 Mega McFritas"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu8 = sc.nextInt(); 

	switch (opcaoMenuSubMenu8) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**McFritas Cheddar Bacon**"); 

	System.out.println(""); 

	System.out.println("Calorias :377 kcal"); 

	System.out.println(""); 

	System.out.println("A batata frita mais famosa do mundo, agora com melt sabor cheddar" 

	+ " e bacon crispy." 

	+ " Não dá para resistir, experimente!"); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**McFritas Grande**"); 

	System.out.println(""); 

	System.out.println("Calorias :422 kcal"); 

	System.out.println(""); 

	System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas," 

	+ " fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, " 

	+ "e todos os outros adjetivos positivos que você quiser dar."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**McFritas Média**"); 

	System.out.println(""); 

	System.out.println("Calorias :295 kcal"); 

	System.out.println(""); 

	System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas," 

	+ " fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, " 

	+ "e todos os outros adjetivos positivos que você quiser dar."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**McFritas Pequena**"); 

	System.out.println(""); 

	System.out.println("Calorias :211 kcal"); 

	System.out.println(""); 

	System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas," 

	+ " fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, " 

	+ "famosas, e todos os outros adjetivos positivos que você quiser dar."); 

	break; 

	case 5: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 5**"); 

	System.out.println("**McFritas Kids**"); 

	System.out.println(""); 

	System.out.println("Calorias :90 kcal"); 

	System.out.println(""); 

	System.out.println("Nossas clássicas McFritas douradas e crocantes" 

	+ " com toque ideal de sal em uma porção perfeita pras crianças."); 

	break; 

	case 6: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 6**"); 

	System.out.println("**Chicken McNuggets 6 unidades**"); 

	System.out.println(""); 

	System.out.println("Calorias :249 kcal"); 

	System.out.println(""); 

	System.out.println("Crocantes, leves e deliciosos. " 

	+ "Os frangos empanados mais irresistíveis do McDonald’s."); 

	break; 

	case 7: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 7**"); 

	System.out.println("**Chicken McNuggets 4 unidades**"); 

	System.out.println(""); 

	System.out.println("Calorias :155 kcal"); 

	System.out.println(""); 

	System.out.println("4 Chicken McNuggets saborosos e crocantes de peito de frango."); 

	break; 

	case 8: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 8**"); 

	System.out.println("**Chicken McNuggets 10 unidades**"); 

	System.out.println(""); 

	System.out.println("Calorias :414 kcal"); 

	System.out.println(""); 

	System.out.println("Crocantes, leves e deliciosos." 

	+ "Os frangos empanados mais irresistíveis do McDonald’s."); 

	break; 

	case 9: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 9**"); 

	System.out.println("**Molho Agridoce**"); 

	System.out.println(""); 

	System.out.println("Calorias :46 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets!" 

	+ " Para hoje que tal o molho agridoce?"); 

	break; 

	case 10: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 10**"); 

	System.out.println("**Molho Barbecue**"); 

	System.out.println(""); 

	System.out.println("Calorias :44 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets! " 

	+ "Para hoje que tal o molho barbecue?"); 

	break; 

	case 11: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 11**"); 

	System.out.println("**Molho Ranch**"); 

	System.out.println(""); 

	System.out.println("Calorias :111 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets! " 

	+ "Para hoje que tal o molho ranch?"); 

	break; 

	case 12: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 12**"); 

	System.out.println("**Molho Caipira**"); 

	System.out.println(""); 

	System.out.println("Calorias :52 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets! " 

	+ "Para hoje que tal o molho caipira?"); 

	break; 

	case 13: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 13**"); 

	System.out.println("**Mega McNuggets**"); 

	System.out.println(""); 

	System.out.println("Calorias :622 kcal"); 

	System.out.println(""); 

	System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do " 

	+ "McDonald’s agora na versão Mega, ideal para compartilhar. " 

	+ "Composto por 15 unidades de Chicken McNuggets."); 

	break; 

	case 14: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 14**"); 

	System.out.println("**Ketchup**"); 

	System.out.println(""); 

	System.out.println("Calorias :9 kcal"); 

	System.out.println(""); 

	System.out.println("Sachê de ketchup do Méqui"); 

	break; 

	case 15: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 15**"); 

	System.out.println("**Mostarda**"); 

	System.out.println(""); 

	System.out.println("Calorias :4 kcal"); 

	System.out.println(""); 

	System.out.println("Sachê de mostarda do Méqui"); 

	break; 

	case 16: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 16**"); 

	System.out.println("**Tomatinho**"); 

	System.out.println(""); 

	System.out.println("Calorias :11 kcal"); 

	System.out.println(""); 

	System.out.println("Mais um opção leve de acompanhamento: tomatinhos fresquinhos."); 

	break; 

	case 17: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 17**"); 

	System.out.println("**Mega McFritas**"); 

	System.out.println(""); 

	System.out.println("Calorias :890 kcal"); 

	System.out.println(""); 

	System.out.println("A batata frita mais famosa do mundo, agora no tamanho Mega. " 

	+ "Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar.A batata frita mais famosa do mundo, agora no tamanho Mega. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, " 

	+ "famosas, e todos os outros adjetivos positivos que você quiser dar."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 9: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 9--- "); 

	System.out.println(" "); 

	System.out.println(" *******SOBREMESAS*******"); 

	System.out.println(" "); 

	System.out.println("1 Casquinha Baunilha"); 

	System.out.println("2 Casquinha Chocolate"); 

	System.out.println("3 Casquinha Mista"); 

	System.out.println("4 Sundae Morango"); 

	System.out.println("5 Sundae Chocolate"); 

	System.out.println("6 Sundae Caramelo"); 

	System.out.println("7 Top Sundae Morango"); 

	System.out.println("8 Top Sundae Chocolate"); 

	System.out.println("9 Top Sundae Caramelo"); 

	System.out.println("10 McColosso Chocolate"); 

	System.out.println("11 McColosso Caramelo"); 

	System.out.println("12 Petit Suisse Sabor Morango"); 

	System.out.println("13 Torta de Maçã"); 

	System.out.println("14 Torta de Banana"); 

	System.out.println("15 McShake Morango"); 

	System.out.println("16 McShake Ovomaltine"); 

	System.out.println("17 McShake Kopenhagen"); 

	System.out.println("18 McFlurry Ovomaltine"); 

	System.out.println("19 McFlurry Prestígio Chocolate"); 

	System.out.println("20 McFlurry Prestígio Morango"); 

	System.out.println("21 McFlurry Prestígio Caramelo"); 

	System.out.println("22 McFlurry Ovomaltine Morango"); 

	System.out.println("23  McFlurry Ovomaltine Caramelo"); 

	System.out.println("24 McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate"); 

	System.out.println("25 McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango"); 

	System.out.println("26 McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu9 = sc.nextInt(); 

	switch (opcaoMenuSubMenu9) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Casquinha Baunilha**"); 

	System.out.println(""); 

	System.out.println("Calorias :177 kcal"); 

	System.out.println(""); 

	System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, " 

	+ "com bebida láctea sabor baunilha que vai bem a qualquer hora."); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**Casquinha Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :189 kcal"); 

	System.out.println(""); 

	System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, " 

	+ "com bebida láctea sabor chocolate que vai bem a qualquer hora."); 

	break; 

	case 3: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 3**"); 

	System.out.println("**Casquinha Mista**"); 

	System.out.println(""); 

	System.out.println("Calorias :183 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com bebida láctea mista (sabor baunilha e chocolate)" 

	+ " que vai bem a qualquer hora."); 

	break; 

	case 4: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 4**"); 

	System.out.println("**Sundae Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :297 kcal"); 

	System.out.println(""); 

	System.out.println("A medida certa entre cobertura de morango " 

	+ "e bebida láctea sabor baunilha que pode fazer você viver uma experiência explosiva," 

	+ " além de amendoins crocantes. Desfrute dessa combinação perfeita!"); 

	break; 

	case 5: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 5**"); 

	System.out.println("**Sundae Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :313 kcal"); 

	System.out.println(""); 

	System.out.println("A medida certa entre cobertura " 

	+ "sabor chocolate e bebida láctea sabor baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes. " 

	+ "Desfrute dessa combinação perfeita!"); 

	break; 

	case 6: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 6**"); 

	System.out.println("**Sundae Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :315 kcal"); 

	System.out.println(""); 

	System.out.println("A medida certa entre cobertura de caramelo e bebida láctea sabor baunilha que" 

	+ " pode fazer você viver uma experiência explosiva, além de amendoins crocantes. " 

	+ "Desfrute dessa combinação perfeita!"); 

	break; 

	case 7: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 7**"); 

	System.out.println("**Top Sundae Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :394 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de" 

	+ " cobertura de morango e ainda por cima com farofa de paçoca. " 

	+ "O canudo completa a tentação."); 

	break; 

	case 8: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 8**"); 

	System.out.println("**Top Sundae Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :377 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de cobertura" 

	+ " sabor chocolate e ainda por cima com farofa de paçoca. " 

	+ "O canudo completa a tentação."); 

	break; 

	case 9: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 9**"); 

	System.out.println("**Top Sundae Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :411 kcal"); 

	System.out.println(""); 

	System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de cobertura de" 

	+ " caramelo e ainda por cima com farofa de paçoca. " 

	+ "O canudo completa a tentação."); 

	break; 

	case 10: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 10**"); 

	System.out.println("**McColosso Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :272 kcal"); 

	System.out.println(""); 

	System.out.println("Não é uma sobremesa qualquer, é um verdadeiro colosso. " 

	+ "Uma supercasquinha de biscoito em forma de cone, recheada com bebida láctea sabor baunilha e" 

	+ " uma sensacional cobertura sabor chocolate." 

	+ " E, além de todo esse sabor, um canudinho de biscoito supercrocante."); 

	break; 

	case 11: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 11**"); 

	System.out.println("**McColosso Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :275 kcal"); 

	System.out.println(""); 

	System.out.println("Não é uma sobremesa qualquer, é um verdadeiro colosso. " 

	+ "Uma supercasquinha de biscoito em forma de cone, recheada com bebida láctea sabor baunilha e uma sensacional cobertura de caramelo." 

	+ " E, além de todo esse sabor, um canudinho de biscoito supercrocante."); 

	break; 

	case 12: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 12**"); 

	System.out.println("**Petit Suisse Sabor Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :42 kcal"); 

	System.out.println(""); 

	System.out.println("O mais delicioso iogurte desnatado sabor morango."); 

	break; 

	case 13: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 13**"); 

	System.out.println("**Torta de Maçã**"); 

	System.out.println(""); 

	System.out.println("Calorias :251 kcal"); 

	System.out.println(""); 

	System.out.println("Boa demais. Parece a receita lá de casa. Massa quentinha e crocante " 

	+ "envolvendo deliciosos recheios de banana ou maçã com gostinho de doce caseiro."); 

	break; 

	case 14: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 14**"); 

	System.out.println("**Torta de Banana**"); 

	System.out.println(""); 

	System.out.println("Calorias :222 kcal"); 

	System.out.println(""); 

	System.out.println("Boa demais! Parece a receita lá de casa. Massa quentinha e crocante envolvendo" 

	+ " um delicioso recheio de banana com gostinho de doce caseiro."); 

	break; 

	case 15: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 15**"); 

	System.out.println("**McShake Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :463 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosamente cremoso. " 

	+ "O novo McShake Morango é feito com leite e batido na hora. Uma delícia!"); 

	break; 

	case 16: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 16**"); 

	System.out.println("**McShake Ovomaltine**"); 

	System.out.println(""); 

	System.out.println("Calorias :548 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosamente cremoso. " 

	+ "O novo McShake Ovomaltine é feito com leite e batido na hora. Uma delícia!"); 

	break; 

	case 17: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 17**"); 

	System.out.println("**McShake Kopenhagen**"); 

	System.out.println(""); 

	System.out.println("Calorias :628 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosamente cremoso. O novo McShake Chocolate Kopenhagen é" 

	+ " feito com leite e batido na hora. Uma delícia!"); 

	break; 

	case 18: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 18**"); 

	System.out.println("**McFlurry Ovomaltine**"); 

	System.out.println(""); 

	System.out.println("Calorias :426 kcal"); 

	System.out.println(""); 

	System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine," 

	+ " com bebida láctea sabor baunilha, " 

	+ "flocos de ovomaltine e cobertura sabor chocolate."); 

	break; 

	case 19: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 19**"); 

	System.out.println("**McFlurry Prestígio Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :480 kcal"); 

	System.out.println(""); 

	System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio " 

	+ "com bebida láctea sabor baunilha, cobertura sabor chocolate e " 

	+ "bombom recheado com coco coberto com chocolate ao leite Prestígio "); 

	break; 

	case 20: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 20**"); 

	System.out.println("**McFlurry Prestígio Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :463 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Prestígio com bebida láctea sabor baunilha, " 

	+ "cobertura de morango" 

	+ " e bombom recheado com coco coberto com chocolate ao leite Prestígio "); 

	break; 

	case 21: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 21**"); 

	System.out.println("**McFlurry Prestígio Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :487 kcal"); 

	System.out.println(""); 

	System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso" 

	+ " McFlurry Prestígio com bebida láctea sabor baunilha, cobertura de caramelo " 

	+ "e bombom recheado com coco coberto com chocolate ao leite Prestígio "); 

	break; 

	case 22: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 22**"); 

	System.out.println("**McFlurry Ovomaltine Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :438 kcal"); 

	System.out.println(""); 

	System.out.println(" Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine," 

	+ " com bebida láctea sabor baunilha, flocos de ovomaltine e cobertura de morango."); 

	break; 

	case 23: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 23**"); 

	System.out.println("**McFlurry Ovomaltine Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :462 kcal"); 

	System.out.println(""); 

	System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine, " 

	+ "com bebida láctea sabor baunilha, flocos de ovomaltine e cobertura de caramelo. "); 

	break; 

	case 24: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 24**"); 

	System.out.println("**McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias :319 kcal"); 

	System.out.println(""); 

	System.out.println(" O novo McFlurry promete toda qualidade que só o Méqui e a " 

	+ "Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, " 

	+ "bebida láctea sabor baunilha e cobertura sabor chocolate."); 

	break; 

	case 25: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 25**"); 

	System.out.println("**McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias :479 kcal"); 

	System.out.println(""); 

	System.out.println("O novo McFlurry promete toda qualidade que só o Méqui " 

	+ "e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen," 

	+ " bebida láctea sabor baunilha e cobertura de morango. "); 

	break; 

	case 26: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 26**"); 

	System.out.println("**McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo**"); 

	System.out.println(""); 

	System.out.println("Calorias :325 kcal"); 

	System.out.println(""); 

	System.out.println("O novo McFlurry promete toda qualidade que só o" 

	+ " Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, " 

	+ "bebida láctea sabor baunilha e cobertura de caramelo. "); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 10: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 10--- "); 

	System.out.println(" "); 

	System.out.println(" *******BEBIDAS FRIAS*******"); 

	System.out.println(" "); 

	System.out.println("1 Coca-Cola 300mL"); 

	System.out.println("2 Fanta Laranja 500ml"); 

	System.out.println("3 Fanta Laranja 700ml"); 

	System.out.println("4 Coca-Cola 500ml"); 

	System.out.println("5 Coca-Cola 700ml"); 

	System.out.println("6 Coca-Cola Zero 300ml"); 

	System.out.println("7 Coca-Cola Zero 500ml"); 

	System.out.println("8 Coca-Cola Zero 700ml"); 

	System.out.println("9 Fanta Laranja 300ml"); 

	System.out.println("10 Fanta Guaraná 300ml"); 

	System.out.println("11 Fanta Guaraná 500ml"); 

	System.out.println("12 Fanta Guaraná 700ml"); 

	System.out.println("13 Del Valle Laranja 300ml"); 

	System.out.println("14 Del Valle Laranja 500ml"); 

	System.out.println("15 Del Valle Laranja 700ml"); 

	System.out.println("16 Del Valle Uva 300ml"); 

	System.out.println("17 Del Valle Uva 500ml"); 

	System.out.println("18 Del Valle Uva 700ml"); 

	System.out.println("19 Água Mineral"); 

	System.out.println("20 Del Valle 100% Uva (McLanche Feliz)"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu10 = sc.nextInt(); 

	switch (opcaoMenuSubMenu10) { 

	case 1: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Coca-Cola 300mL**"); 

	System.out.println(""); 

	System.out.println("Calorias :129 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja. "); 

	break; 

	case 2: 

	System.out.println("**VOCÊ SELECIONOU A OPÇÃO 2**"); 

	System.out.println("**Fanta Laranja 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :155 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida." 

	+ " Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja. "); 

	break; 

	case 3: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 3 **"); 

	System.out.println("**Fanta Laranja 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :217 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja. "); 

	break; 

	case 4: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 4 **"); 

	System.out.println("**Coca-Cola 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :215 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja. "); 

	break; 

	case 5: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 5 **"); 

	System.out.println("**Coca-Cola 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :301 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 6: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 6 **"); 

	System.out.println("**Coca-Cola Zero 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :0 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida." 

	+ " Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 7: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 7 **"); 

	System.out.println("**Coca-Cola Zero 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :0 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida." 

	+ " Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 8: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 8 **"); 

	System.out.println("**Coca-Cola Zero 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :0 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida." 

	+ " Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 9: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 9 **"); 

	System.out.println("**Fanta Laranja 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :93 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 10: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 10 **"); 

	System.out.println("**Fanta Guaraná 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :126 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 11: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 11 **"); 

	System.out.println("**Fanta Guaraná 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :210 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 12: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 12 **"); 

	System.out.println("**Fanta Guaraná 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :294 kcal"); 

	System.out.println(""); 

	System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. " 

	+ "Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja."); 

	break; 

	case 13: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 13 **"); 

	System.out.println("**Del Valle Laranja 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :243 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 14: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 14 **"); 

	System.out.println("**Del Valle Laranja 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :205 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 15: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 15 **"); 

	System.out.println("**Del Valle Laranja 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :287 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 16: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 16 **"); 

	System.out.println("**Del Valle Uva 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :120 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 17: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 17 **"); 

	System.out.println("**Del Valle Uva 500ml**"); 

	System.out.println(""); 

	System.out.println("Calorias : 200 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 18: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 18 **"); 

	System.out.println("**Del Valle Uva 700ml**"); 

	System.out.println(""); 

	System.out.println("Calorias : 280 kcal"); 

	System.out.println(""); 

	System.out.println("Deliciosos sabores à sua escolha." 

	+ " Néctar de fruta nos sabores uva ou laranja."); 

	break; 

	case 19: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 19 **"); 

	System.out.println("**Água Mineral**"); 

	System.out.println(""); 

	System.out.println("Calorias : 0 kcal"); 

	System.out.println(""); 

	System.out.println("Água sem gás."); 

	break; 

	case 20: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 20 **"); 

	System.out.println("**Del Valle 100% Uva (McLanche Feliz)**"); 

	System.out.println(""); 

	System.out.println("Calorias : 78 kcal"); 

	System.out.println(""); 

	System.out.println("100% Suco de uva, sem açúcar adicionado, sem corante e sabores artificiais."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 11: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 11--- "); 

	System.out.println(" "); 

	System.out.println(" *******CAFÉ DA MANHÃ *******"); 

	System.out.println(" "); 

	System.out.println("1 Queijo Quente"); 

	System.out.println("2 Croissant de Presunto e Queijo"); 

	System.out.println("3 Pão de Queijo"); 

	System.out.println("4 Capuccino 300ml"); 

	System.out.println("5 Capuccino 200ml"); 

	System.out.println("6 Café com Leite 200ml"); 

	System.out.println("7 Café com Leite 300ml"); 

	System.out.println("8 Café Premium 300ml"); 

	System.out.println("9 Café Premium 100ml"); 

	System.out.println("10 Café Premium 200ml"); 

	System.out.println("11 Chocolate Quente 300ml"); 

	System.out.println("12 Chocolate Quente 200ml"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu11 = sc.nextInt(); 

	switch (opcaoMenuSubMenu11) { 

	case 1: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 1 **"); 

	System.out.println("**Queijo Quente**"); 

	System.out.println(""); 

	System.out.println("Calorias : 247 kcal"); 

	System.out.println(""); 

	System.out.println("Composto por pão" 

	+ " sem gergelim e duas fatias do delicioso queijo sabor cheddar."); 

	break; 

	case 2: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 2 **"); 

	System.out.println("**Croissant de Presunto e Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias : 270 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Nem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa." 

	+ " O recheio é de presunto quentinho com queijo derretido. Impossível resistir!"); 

	break; 

	case 3: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 3 **"); 

	System.out.println("**Pão de Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias : 132 kcal"); 

	System.out.println(""); 

	System.out.println("Impossível de resistir. " 

	+ "Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual."); 

	break; 

	case 4: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 4 **"); 

	System.out.println("**Capuccino 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :114 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó."); 

	break; 

	case 5: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 5 **"); 

	System.out.println("**Capuccino 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :71 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó."); 

	break; 

	case 6: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 6 **"); 

	System.out.println("**Café com Leite 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :50 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo?" + " E os nossos grãos " 

	+ "selecionados deixam esse clássico do café da manhã ainda mais especial."); 

	break; 

	case 7: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 7 **"); 

	System.out.println("**Café com Leite 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :74 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados" 

	+ " deixam esse clássico do café da manhã ainda mais especial."); 

	break; 

	case 8: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 8 **"); 

	System.out.println("**Café Premium 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :12 kcal"); 

	System.out.println(""); 

	System.out.println("O dia só começa depois de um McCafé. " 

	+ "A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 9: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 9 **"); 

	System.out.println("**Café Premium 100ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :4 kcal"); 

	System.out.println(""); 

	System.out.println("O dia só começa depois de um McCafé. " 

	+ "A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 10: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 10 **"); 

	System.out.println("**Café Premium 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :8 kcal"); 

	System.out.println(""); 

	System.out.println("O dia só começa depois de um McCafé. " 

	+ "A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 11: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 11**"); 

	System.out.println("**Chocolate Quente 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :173 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado e chocolate em pó."); 

	break; 

	case 12: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 12**"); 

	System.out.println("**Chocolate Quente 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :114 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado e chocolate em pó."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 12: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 12--- "); 

	System.out.println(" "); 

	System.out.println(" *******BEBIDAS QUENTES *******"); 

	System.out.println(" "); 

	System.out.println("1 Café Premium 100ml"); 

	System.out.println("2 Café Premium 200ml"); 

	System.out.println("3 Café Premium 300ml"); 

	System.out.println("4 Café com Leite 200ml"); 

	System.out.println("5 Café com Leite 300ml"); 

	System.out.println("6 Capuccino 200ml"); 

	System.out.println("7 Capuccino 300ml"); 

	System.out.println("8 Chocolate Quente 200ml"); 

	System.out.println("9 Chocolate Quente 300ml"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu12 = sc.nextInt(); 

	switch (opcaoMenuSubMenu12) { 

	case 1: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 1**"); 

	System.out.println("**Café Premium 100ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :4 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 2: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 2 **"); 

	System.out.println("**Café Premium 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :8 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 3: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 3 **"); 

	System.out.println("**Café Premium 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :12 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. " 

	+ "Mas não dá para chamar um café de grãos selecionados de cafezinho."); 

	break; 

	case 4: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 4 **"); 

	System.out.println("**Café com Leite 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :50 kcal"); 

	System.out.println(""); 

	System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos " 

	+ "selecionados deixam esse clássico do café da manhã ainda mais especial."); 

	break; 

	case 5: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 5 **"); 

	System.out.println("**Café com Leite 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :74 kcal"); 

	System.out.println(""); 

	System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos " 

	+ "selecionados deixam esse clássico do café da manhã ainda mais especial."); 

	break; 

	case 6: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 6 **"); 

	System.out.println("**Capuccino 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :71 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó."); 

	break; 

	case 7: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 7 **"); 

	System.out.println("**Capuccino 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :114 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó."); 

	break; 

	case 8: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 8 **"); 

	System.out.println("**Chocolate Quente 200ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :114 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado e chocolate em pó."); 

	break; 

	case 9: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 9 **"); 

	System.out.println("**Chocolate Quente 300ml**"); 

	System.out.println(""); 

	System.out.println("Calorias :173 kcal"); 

	System.out.println(""); 

	System.out.println("Feito com leite semidesnatado e chocolate em pó."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 13: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 13--- "); 

	System.out.println(" "); 

	System.out.println(" *******MC OFERTA *******"); 

	System.out.println(" "); 

	System.out.println("1 McChicken"); 

	System.out.println("2 Chicken McNuggets 10 unidades"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu13 = sc.nextInt(); 

	switch (opcaoMenuSubMenu13) { 

	case 1: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 1 **"); 

	System.out.println("**McChicken**"); 

	System.out.println(""); 

	System.out.println("Calorias :396 Kcal"); 

	System.out.println(""); 

	System.out.println("Calorias\r\n" + "396g\r\n" + "Açúcares totais\r\n" + "6g\r\n" 

	+ "Açúcares adicionados\r\n" 

	+ "5g\r\n" + "Carboidratos\r\n" + "37g\r\n" + "Proteínas\r\n" + "17g\r\n" + "Gordura total\r\n" 

	+ "20g\r\n" + "Gorduras saturadas\r\n" + "3g\r\n" + "Gordura trans\r\n" + "0.1g\r\n" 

	+ "Fibra alimentar\r\n" 

	+ "3g\r\n" + "Sódio\r\n" + "693mg"); 

	break; 

	case 2: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 2 **"); 

	System.out.println("**Chicken McNuggets 10 unidades**"); 

	System.out.println(""); 

	System.out.println("Calorias :414 Kcal"); 

	System.out.println(""); 

	System.out.println("Calorias\r\n" + "414g\r\n" + "Carboidratos\r\n" + "24g\r\n" + "Proteínas\r\n" 

	+ "23g\r\n" + "Gordura total\r\n" + "25g\r\n" + "Gorduras saturadas\r\n" + "1.9g\r\n" 

	+ "Gordura trans\r\n" 

	+ "0g\r\n" + "Fibra alimentar\r\n" + "1g\r\n" + "Sódio\r\n" + "770mg"); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta.!"); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 14: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 14--- "); 

	System.out.println(" "); 

	System.out.println(" ******* MÉQUI BOX *******"); 

	System.out.println(" "); 

	System.out.println("1 Family Box para 2"); 

	System.out.println("2 Family Box para 3"); 

	System.out.println("3 Méqui Box Clássico para 4"); 

	System.out.println("4 Méqui Box Clássico para 3"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu14 = sc.nextInt(); 

	switch (opcaoMenuSubMenu14) { 

	case 1: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 1 **"); 

	System.out.println("**Family Box para 2**"); 

	System.out.println(""); 

	System.out.println("Composto por 01 McLanche Feliz " 

	+ "e 01 McOferta média Big Mac, Quarterão," 

	+ " Cheddar McMelt ou McChicken."); 

	break; 

	case 2: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 2 **"); 

	System.out.println("**Family Box para 2**"); 

	System.out.println(""); 

	System.out.println("Composto por 01 McLanche Feliz " 

	+ "e 01 McOferta média Big Mac, Quarterão," 

	+ " Cheddar McMelt ou McChicken."); 

	break; 

	case 3: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 3 **"); 

	System.out.println("**Méqui Box Clássico para 4**"); 

	System.out.println(""); 

	System.out.println("Méqui Box Clássico para 4 Composto por 04 McOfertas médias:" 

	+ " Big Mac, Quarterão, Cheddar McMelt ou McChicken."); 

	break; 

	case 4: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 4 **"); 

	System.out.println("**Méqui Box Clássico para 3**"); 

	System.out.println(""); 

	System.out.println("Méqui Box Clássico para 3 Composto por 03 McOfertas médias:" 

	+ " Big Mac, Quarterão, Cheddar McMelt ou McChicken."); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor digite uma opção correta."); 

	break; 

	} 

	} 

	switch (opcaoMenu1) { 

	case 15: 

	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 15--- "); 

	System.out.println(" "); 

	System.out.println(" ******* MC CAFÉ *******"); 

	System.out.println(" "); 

	System.out.println("1 Cookie de Baunilha com Gotas de Chocolate"); 

	System.out.println("2 Pão de Queijo"); 

	System.out.println("3 Croissant de Presunto e Queijo"); 

	System.out.println("4 Mini Pão de Queijo"); 

	System.out.println("5 Quiche de Palmito"); 

	System.out.println("6 Tartelete de Cheesecake com Cobertura de Morango"); 

	System.out.println("7 Muffin de Blueberry"); 

	System.out.println("8 Bolo de laranja"); 

	System.out.println(""); 

	System.out.println("----SELECIONE UMA OPÇÃO----"); 

	System.out.println(""); 

	int opcaoMenuSubMenu15 = sc.nextInt(); 

	switch (opcaoMenuSubMenu15) { 

	case 1: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 1 **"); 

	System.out.println("**Cookie de Baunilha com Gotas de Chocolate**"); 

	System.out.println(""); 

	System.out.println("Calorias: 169 kcal"); 

	System.out.println(""); 

	System.out.println("A combinação da massa de baunilha com gotas de chocolate " 

	+ "é tudo o que você precisa junto ao cafézinho."); 

	break; 

	case 2: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 2 **"); 

	System.out.println("**Pão de Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias: 132 kcal"); 

	System.out.println(""); 

	System.out.println("Impossível de resistir. " 

	+ "Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.."); 

	break; 

	case 3: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 3 **"); 

	System.out.println("**Croissant de Presunto e Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias:270 kcal"); 

	System.out.println(""); 

	System.out.println( 

	"Nem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa." 

	+ " O recheio é de presunto quentinho com queijo derretido. Impossível resistir!"); 

	break; 

	case 4: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 4 **"); 

	System.out.println("**Mini Pão de Queijo**"); 

	System.out.println(""); 

	System.out.println("Calorias:264 kcal"); 

	System.out.println(""); 

	System.out.println("Impossível de resistir. " 

	+ "Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual."); 

	break; 

	case 5: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 5 **"); 

	System.out.println("**Quiche de Palmito**"); 

	System.out.println(""); 

	System.out.println("Calorias:369 kcal"); 

	System.out.println(""); 

	System.out.println("Uma deliciosa quiche de palmito."); 

	break; 

	case 6: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 6 **"); 

	System.out.println("**Tartelete de Cheesecake com Cobertura de Morango**"); 

	System.out.println(""); 

	System.out.println("Calorias:517 kcal"); 

	System.out.println(""); 

	System.out.println("As tarteletes podem ser servidas com as coberturas sabor" 

	+ " chocolate, morango e caramelo. Experimente!."); 

	break; 

	case 7: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 7 **"); 

	System.out.println("**Muffin de Blueberry**"); 

	System.out.println(""); 

	System.out.println("Calorias:225 kcal"); 

	System.out.println(""); 

	System.out.println("Sabor único e experiencia deliciosa que " 

	+ "só o muffin de blueberry pode te proporcionar."); 

	break; 

	case 8: 

	System.out.println("** VOCÊ SELECIONOU A OPÇÃO 8 **"); 

	System.out.println("**Bolo de laranja**"); 

	System.out.println(""); 

	System.out.println("Calorias:172 kcal"); 

	System.out.println(""); 

	System.out.println("Impossivel de recusar um pedaço generoso do bolo de laranja." 

	+ " Já tentou com um cafézinho?"); 

	break; 

	default: 

	System.out.println(""); 

	System.out.println("Erro!por favor,tente novamente."); 

	break; 

	} 

	} 

	sc.close(); 

	} 

	} 

