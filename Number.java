public class Number {
    public static void main(String[] args) {
        MyNumber ob = new MyNumber();
        //Example:----
        System.out.println("Is 3025 a Tech Number? " + ob.isTechNumber(3025));
        boolean isSpy = ob.isSpyNumber(3025);
        System.out.println("IS 3025 a spy number " + isSpy);
        boolean isDuck = ob.isDuckNumber(3025);
        System.out.println("IS 3025 a Duck number " + isDuck);
        boolean isBuzz = ob.isBuzzNumber(3025);
        System.out.println("IS 3025 a Buzz number " + isBuzz);
        boolean isDisarium = ob.isDisariumNumber(3025);
        System.out.println("IS 3025 a Disarium number " + isDisarium);
        long isTribonacci = ob.TribonacciNumber(3025);
        System.out.println(" 3025 a Tribonacci number " + isTribonacci);
        boolean isMagic = ob.isMagicNumber(3025);
        System.out.println("IS 3025 a Magic number " + isMagic);
        boolean isAbundant = ob.isAbundantNumber(3025);
        System.out.println("IS 3025 a Abundant number " + isAbundant);
        boolean isNeon = ob.isNeonNumber(3025);
        System.out.println("IS 3025 a Neon number " + isNeon);
        boolean isArmstrong = ob.isArmstrongNumber(3025);
        System.out.println("IS 3025 a Armstrong number " + isArmstrong);
        boolean isPronic = ob.isPronicNumber(3025);
        System.out.println("IS 3025 a Pronic number " + isPronic);
        boolean isHarshad = ob.isHarshadNumber(3025);
        System.out.println("IS 3025 a Harshad number " + isHarshad);
        boolean isHarshadMagic = ob.isHarshadMagicNumber(3025);
        System.out.println("IS 3025 a Harshad magic number " + isHarshadMagic);
        boolean isDudeney = ob.isDudeneyNumber(3025);
        System.out.println("IS 3025 a Dudeney number " + isDudeney);
        boolean isNiven = ob.isNivenNumber(3025);
        System.out.println("IS 3025 a Niven number " + isNiven);
        boolean isBouncy = ob.isBouncyNumber(3025);
        System.out.println("IS 3025 a Bouncy number " + isBouncy);


    }
}

class MyNumber {
    boolean isSpyNumber(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    boolean isDuckNumber(int n) {
        String str = String.valueOf(n);
        if (str.charAt(0) == '0') 
            return false;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0') 
                return true;
        }
        return false;
    }

    boolean isTechNumber(int n) {
        String str = String.valueOf(n);
        if (str.length() % 2 != 0) 
            return false;
        
        int halfLength = str.length() / 2;
        int firstHalf = Integer.parseInt(str.substring(0, halfLength));
        int secondHalf = Integer.parseInt(str.substring(halfLength));
        int sum = (firstHalf + secondHalf) * (firstHalf + secondHalf);

        return sum == n;
    }

    boolean isBuzzNumber(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    boolean isDisariumNumber(int n) {
        int sum = 0, temp = n;
        int count = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count--);
            temp /= 10;
        }
        return sum == n;
    }

    long TribonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        long a = 0, b = 1, c = 1, result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b + c;
            a = b;
            b = c;
            c = result;
        }
        return result;
    }

    boolean isMagicNumber(int num) {
        while (num >= 10) {
            int sumOfSquares = 0;
            while (num > 0) {
                int digit = num % 10;
                sumOfSquares += digit * digit;
                num /= 10;
            }
            num = sumOfSquares;
        }
        return (num == 1);
    }

    boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) 
                sum += i;
        }
        return sum > n;
    }

    boolean isNeonNumber(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        return n == sum;
    }

    boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n;
        int count = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == n;
    }

    boolean isPronicNumber(int n) {
        int k = (int) Math.sqrt(n);
        return k * (k + 1) == n;
    }

    boolean isHarshadNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return n % sum == 0;
    }

    boolean isHarshadMagicNumber(int n) {
        return isHarshadNumber(n) && isMagicNumber(n);
    }

    boolean isDudeneyNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        int cubeRoot = (int) Math.cbrt(n);
        return sum == cubeRoot;
    }

    boolean isNivenNumber(int n) {
        return isHarshadNumber(n);
    }

    boolean isBouncyNumber(int n) {
        String str = String.valueOf(n);
        boolean hasIncreasing = false, hasDecreasing = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) 
                hasIncreasing = true;
            else if (str.charAt(i) > str.charAt(i + 1)) 
                hasDecreasing = true;
        }
        return hasIncreasing && hasDecreasing;
    }
}