/* Steve Weon
*  Sept 20, 2021
*  Problem Set 1-A
*/

class ProblemSet_1A {
    public static void main (String[] args) {
        //QUARDATIC FORMULA
        
        //Variables
        double a = 1;
        double b = 5;
        double c = 6;
        double solution1 = (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a;
        double solution2 = (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a;
        
        //Print
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+(int)a+"x^2 + "+(int)b+"x + "+(int)c+" are "+solution1+" and "+solution2+".");
        System.out.println();

        
        //SLOPE FORMULA
        
        //Variables
        double x1 = 0;
        double y1 = 0;
        double x2 = 2;
        double y2 = 3;
        double slope = (y2-y1)/(x2-x1);
        
        //Print
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of "+slope);
        System.out.println();
        
        //MIDPOINT FORMULA
        
        //Variables
        double midpointx = (x1+x2)/2;
        double midpointy = (y1+y2)/2;
        
        //Print
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is ("+midpointx+", "+midpointy+")");
        System.out.println();
        
        
        //SUM OF AN ARITHMETIC SERIES
        
        //Variables
        int nAri = 5;
        double a1Ari = 1;
        double d = 1.0;
        double an = a + (double)(nAri-1)*d;
        double sumAr = (double)nAri*(a1Ari+an)/2;
        
        //Print
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first "+nAri+" terms of an arithmetic series that starts with "+a1Ari);
        System.out.println("and increases by "+d+" is "+sumAr);
        System.out.println();
        
        
        //SUM OF A FINITE GEOMETRIC SERIES
        
        //Variable
        int nGeo = 3;
        double a1Geo = 3.0;
        double r = 2.0;
        double sumGeo = (a1Geo*(1-(Math.pow(r,nGeo)))/(1-r));
        
        //Print
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+nGeo+" terms of a finite geometric series that starts with "+a1Geo);
        System.out.println("and increases by a rate of "+r +" is "+sumGeo);
        System.out.println();
    }
}