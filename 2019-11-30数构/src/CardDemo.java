import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDemo {
      public static final String[] colors = {"红桃","梅花","方片","黑桃"};
      private static List<Card> buyDeck(){
          List<Card> deck = new ArrayList<>(52);
          for(int i = 0;i < 4 ; i++){
              for(int j = 0;j < 13;j++){
                  String color = colors[i];
                  int rank = j;
                    Card card = new Card();
                    card.rank = rank;
                    card.color = color;

                    deck.add(card);
              }
          }
          return deck;
    }
    private static void swap(List<Card> deck,int i ,int j){
          Card tmp = deck.get(i);
          deck.set(i,deck.get(j));
          deck.set(j,tmp);
    }
    private static void shuffle(List<Card> deck){
        Random rand = new Random();
        for(int i = deck.size()-1;i > 0;i--){
            int r = rand.nextInt(i);
            swap(deck,i,r);
        }
    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println("新牌：");
        System.out.println(deck);
        shuffle(deck);
        System.out.println("洗过的牌：");
        System.out.println(deck);

        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());

        for (int i = 0; i < 5; i++ ){
            for (int j = 0; j< 3 ;j++){
                hands.get(j).add(deck.remove(0));
            }
        }
        System.out.println("剩余的牌：");
        System.out.println(deck);
        System.out.println("A手中的牌：");
        System.out.println(hands.get(0));
        System.out.println("B手中的牌：");
        System.out.println(hands.get(1));
        System.out.println("C手中的牌：");
        System.out.println(hands.get(2));
    }
}
