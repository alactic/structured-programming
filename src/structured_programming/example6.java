package structured_programming;
public class example6 {
static int temp;
static void writej(int j)
{
    System.out.print(j);
}

static void inner()
{
    for(int j=temp; j<=temp+2;j++)
    {
        writej(j);
    }
    System.out.println();
}

static void outer()
{
    for(int i=1; i<=4; i++)
    {
        temp=i;
        inner();
    }
}

public static void main(String arg[])
{
    outer();
}
}
