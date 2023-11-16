#include<stdio.h>
void main()
{
int a[10],i,m,max,min;
printf("enter the size of first array: ");
scanf("%d",&m);
printf("enter the %d array elements ",m);
for(i=0;i<m;i++)
scanf("%d",&a[i]);
max=a[0];
for(i=0;i<m;i++)
{
	if(max<a[i])
	max=a[i];
}
printf("largest element %d\n",max);
min=a[0];
for(i=0;i<m;i++)
{
	if(min>a[i])
	min=a[i];
}
printf("\nsmallest element %d",min);
}
