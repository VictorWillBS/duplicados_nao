import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, vamos achar os itens duplicados nos array de string?");
        Scanner sc = new Scanner(System.in);
        boolean firstIsEnd = false;
        boolean secondIsEnd = true;
        List<String> array1 = new ArrayList<>();
        List<String> array2= new ArrayList<>();

        while(firstIsEnd== false){
        System.out.println("Insira o valor no primeiro array:");
        String valor = sc.nextLine();
        array1.add(valor);
        System.out.println("Deseja continuar? (S ou N)");
        String res = sc.nextLine();
        if(res.equals("N")||res.equals("n")){
            firstIsEnd= true;
            secondIsEnd= false;
        }
        }
        
        while(secondIsEnd== false){
            System.out.println("Insira o valor no segundo array:");
            String valor = sc.nextLine();
            array2.add(valor);
            System.out.println("Deseja containuar? (S ou N)");
            String res = sc.nextLine();
            if(res.equals("N")||res.equals("n")){
                secondIsEnd= true;
            }
        }

        System.out.println("Procurando duplicados...");
        var duplicates = findDuplicates(array1,array2);
        System.out.println(duplicates);
        

    }


public static  List<String> findDuplicates(List<String> array1, List<String> array2){
    List<String> result = new ArrayList<>();
    for(int i = 0 ; i< array1.size(); i++){
        for(int j = 0 ; j <array2.size(); j++){
            if(array1.get(i).equals(array2.get(j))){
                result.add(array1.get(i));
            }
        }
    }
    return result;
}
}
