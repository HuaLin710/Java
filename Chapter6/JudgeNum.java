class JudgeNum {
    static boolean isNumber(String str) {
        if(str==null || str=="")
            return false;
        else
        {
            for(int i=0; i<str.length(); i++)
            {
                if (str.charAt(i) < '0' || str.charAt(i) > '9')
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println("Is "+str+" a number? "+isNumber(str));
        str = "1234o";
        System.out.println("Is "+str+" a number? "+isNumber(str));


    }
}
