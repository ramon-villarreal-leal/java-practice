package rpgGame;



public class Logic {
    int digitsManipulations(int n) {
        int product =1;
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;

        }
        return product - sum;
    }
}

