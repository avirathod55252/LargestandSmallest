class  largeandsmall
{
    public static double average (int [] salary)
    {
        double largest =Integer.MIN_VALUE;
        double smallest =Integer.MAX_VALUE;
        int n =salary.length;
        for (int i=0;i<n;i++)
        {
            if (salary[i]>largest)
            {
                largest=salary[i];
            }

        }
        for (int i=0;i<n;i++)
        {
           if (salary[i]<smallest)
           {
               smallest=salary[i];
           }
        }
        System.out.println("large"+largest);
        System.out.println("smallest"+smallest);
        return (largest+smallest)/2;
    }
    public static void main (String args[])
    {
        int arr[]= {4000,3000,1000,2000};
       System.out.println(average(arr));
    }
}
