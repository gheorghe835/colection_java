package operator_information;

public class Help {
    public void helpOn(char choice){
        switch (choice){
            case '1':
                System.out.println(" Operator IF :: ");
                System.out.println(" if(condition) { block code; }" + "\n else { block code; }");
                break;
            case '2':
                System.out.println("  Operator SWITCH :: ");
                System.out.println(" switch(expression) { \n case constant_1: block code ; \n break; " +
                        " \n case constant_N: block code ; \n break; \n default: block code; ");
                break;
            case '3':
                System.out.println("  Operator FOR :: ");
                System.out.println("  for(initialization; condition; iteration) { \n   block code; \n  } ");
                break;
            case '4':
                System.out.println(" Operator WHILE ::");
                System.out.println("  while(condition){ \n   block code; \n  }");
                break;
            case '5':
                System.out.println(" Operator DO-WHILE ::");
                System.out.println(" do { \n block code; \n } \n while(condition); ");
                break;
            default: System.out.println("The selected option was not found.");

        }
        System.out.println();
    }
    public void showMenu(){
        System.out.println("    Reference by:");
        System.out.println("  1. IF");
        System.out.println("  2. SWITCH");
        System.out.println("  3. FOR");
        System.out.println("  4. WHILE");
        System.out.println("  5. DO-WHILE");
        System.out.println("  Select an option:");
    }

    boolean isvalid(int num){
        if (num < '1' | num > '5' & num != 'q')return false;
        else return true;
    }

}

