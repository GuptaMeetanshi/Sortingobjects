public class Student {
    private String name;
    private int rollno;
    private String grade;
    public Student(String name,int rollno,String grade)
    {
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
    }
    public void displayStudent()
    {
        System.out.println("the name is :"+name);
        System.out.println("The roll no :"+rollno);
        System.out.println("The grade is :"+grade);
    }
    public int getRollno()
    {
        return  rollno;
    }

}

class Sortedobjects
{
    private Student[] list;
    private int size;
   public Sortedobjects(int max)
   {
       list=new Student[max];
       size=0;
   }
   public void insert(String name,int rollno,String grade)
   {
       list[size]=new Student(name,rollno,grade);
       size++;
   }
   public void display()
   {
       for(int i=0;i<size;i++)
       {
           list[i].displayStudent();
           System.out.println();
       }
   }
   public void insertionsort()
   {
       int i,j;
       for(i=1;i<size;i++)
       {
           Student temp=list[i];
           j=i;
           while(j>0 && list[i-1].getRollno()>=temp.getRollno())
           {
               list[i]=list[i-1];
               --j;
           }
           list[j]=temp;
       }
   }

    public static void main(String[] args) {
        int maxsize=100;
        Sortedobjects obj=new Sortedobjects(maxsize);
        obj.insert("Meetanshi",44,"A");
        obj.insert("Megha",36,"A");
        obj.insert("Heeena",56,"A");
        obj.display();
        obj.insertionsort();
        obj.display();
    }
}