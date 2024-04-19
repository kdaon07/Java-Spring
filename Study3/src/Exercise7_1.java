class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        int num;
        boolean isKwang = false;
        for(int i=1;i<CARD_NUM+1;i++) {
            if(i == 1 || i == 3 || i == 8)
                isKwang = true;
            else
                isKwang = false;
            num = i%10;
            if(num == 0)
                num = 10;
            cards[i-1] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        int n;
        SutdaCard temp;
        for(int i=0; i<CARD_NUM; i++) {
            n = (int)(Math.random()*CARD_NUM);
            temp = cards[i];
            cards[i] = cards[n];
            cards[n] = temp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int)(Math.random()*CARD_NUM)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());

        deck.shuffle();
        for(int i=0; i<deck.cards.length;i++) {
            System.out.print(deck.cards[i]+", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));


    }
}
