import java.sql.SQLException;
import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		AccountDAO consultData = new AccountDAO();
		
		// Valores Aleatórios para os dados: número e agência
		
		Account person1 = new Account(19543464412l, 12343212332l, "Fernanda", 10000.00, 1200.00);
		Account person2 = new Account(12131415161l, 11615141312l, "Marcos Paulo", 1000.00, 120.00);
		Account person3 = new Account(98088484229l, 21028483409l, "Murillo Isidoro", 10000.00, 120000.00);
		Account person4 = new Account(49484030939l, 22838393803l, "Carol", 4000.00, 3500.00);
		Account person5 = new Account(43030434948l, 82800493930l, "Fernando", 2000.00, 8000.00);
	
		
		int count = 0;
		boolean flag = true;
		
		try {
			do {
				System.out.println("\nEscolha uma das opções: ");
				System.out.println("1 - Inserir dados na tabela e listar");
				System.out.println("2 - Atualizar conta de ID 1 e listar");
				System.out.println("3 - Deletar conta de ID 2 e listar");
				System.out.print("Opção escolhida: ");
				int option = input.nextInt();
				
				count++;
				if (option == 1) {
					// Inserir dados na tabela
					consultData.insert(person1);
					consultData.insert(person2);
					consultData.insert(person3);
					consultData.insert(person4);
					consultData.insert(person5);
				} else if (option == 2) {
					// Atualizar conta de ID 1
					// Update do objeto person1
					Account person1Update = new Account(23232323423l, 23232323423l, "Fernanda Soares", 900.00, 1.00);
					consultData.update(person1Update, 1);
				} else if (option == 3) {
					// Deletar conta de ID 2
					consultData.delete(2);
				}
				
				// Listagem
				consultData.listing();
				
				if (count >= 3 || (option < 0 && option > 3)) {
					flag = false;
					break;
				}
			} while (flag);
			
			System.out.println("\nPrograma finalizado.");		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		input.close();
	}
	
}
