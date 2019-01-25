#include<stdio.h>
struct student
{
  char name[20];
  int rno;
  int mark1;
  int mark2;
  int total;

}s[10];

int main()
{
	int i,n;
	printf("enter total No student\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	printf("\nenter student%d deatails\n",i+1);
	printf("enter student name\n");
	scanf("%s",s[i].name);                                                                                                                                                                                       z
	printf("enter student R.No\n");
	scanf("%d",&s[i].rno);
	printf("enter student mark1\n");
	scanf("%d",&s[i].mark1);
	printf("enter student mark2\n");
	scanf("%d",&s[i].mark2);
	}
    printf("--------------------------------------------------------");
    printf("STUDENT DETAILS\n");
	for(i=0;i<n;i++)
	{
    printf("--------------------------------------------------------");
	printf("\nstudent name  :%s\n",s[i].name);	
	printf("student R.No  :%d\n",s[i].rno);	
	printf("student mark1 :%d\n",s[i].mark1);	
	printf("student mark2 :%d\n",s[i].mark2);	
	printf("student total :%d \n",s[i].mark1+s[i].mark2);
	printf("-----------------------------------------------------\n");
	}
	return 0;
}
