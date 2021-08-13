class sample
{
final int t=5;
void display()
{
t=10;//error because t is constant declared which never be changed
System.out.print(t);
}
}
class finalvar
{
public static void main(String geetu[])
{
sample t=new sample();
t.display();
}
}
