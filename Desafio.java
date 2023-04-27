import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Desafio {

    public static void main(String[] args) {
        
    
        // CONDIÇÕES DO DESAFIO: Criar 2  Filter e um Map
    
        //Criando os Videos Games
        VideoGame v1 = new VideoGame("Play2","Sony",200.0);
        VideoGame v2 = new VideoGame("Play4","Sony",1500.0);
        VideoGame v3 = new VideoGame("Play5","Sony",4000.0);
        VideoGame v4 = new VideoGame("Xbox 360","Microsoft",500.0);
        VideoGame v5 = new VideoGame("Xbox Serie S","Microsoft",1800.0);
        VideoGame v6 = new VideoGame("Xbox Serie X","Microsoft",4000.0);
    
        //Adicionando Video Game na lista
        List<VideoGame> console = Arrays.asList(v1,v2,v3,v4,v5,v6);
    
        //FILTER 1: Filtar por marca
        Predicate<VideoGame> marca = a-> "Microsoft".equals(a.marca); 
    
    
        //FILTER 2: Valor do Video Game
        Predicate<VideoGame> valor = a -> a.valor<=2000;
    
    
        //Usando o Map para exibir uma mensagem
        Function<VideoGame,String> msg = a -> a.nome
                +" tem as maiores ofertas!!!";
    
        //Exibir
        System.out.println("Video Game com menores preços\n\n");
        
        console.stream()
               .filter(marca)
               .filter(valor)
               .map(msg)
               .forEach(System.out::println);
  
    }
}
