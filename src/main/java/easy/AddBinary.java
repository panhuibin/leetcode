package easy;

class AddBinary {
    public String addBinary(String a, String b) {
        int carryOver = 0;
        String added = "";
        for(int i=0;i<Math.max(a.length(),b.length());i++){
            int intB = (i>=b.length()) ? 0 : (b.charAt(b.length()-i-1) == '0' ? 0:1);
            int intA = (i>=a.length()) ? 0 : (a.charAt(a.length()-i-1) == '0' ? 0:1);
            int addedS = (intA + intB + carryOver )% 2;
            carryOver = (intA + intB + carryOver )/2;
            added = addedS + added;
        }
        if(carryOver == 1) return "1"+added;
        else return added;
    }
}
