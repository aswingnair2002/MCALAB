#include<stdio.h>
void main()
{
int m,n,a[10],b[10],c[20],i,j,k=0,t;
printf("enter the size of the array A: ");
scanf("%d",&m);
printf("array elements: ");
for(i=0;i<m;i++)
scanf("%d",&a[i]);
printf("enter the size of the array B: ");
scanf("%d",&n);
printf("array elements: ");
for(i=0;i<n;i++)
scanf("%d",&b[i]);
for(i=0;i<m;i++)
for(j=i+1;j<m;j++)
if(a[i]>a[j])
{	
	t=a[i];
	a[i]=a[j];
	a[j]=t;
}
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
if(b[i]>b[j])
{
	t=b[i];
	b[i]=b[j];
	b[j]=t;
}
i=j=0;
while(i<m&&j<n)
{
if(a[i]<=b[j])
	{
	 c[k]=a[i];
	 i++;
	 k++;
	}
else
{
c[k]=b[j];
j++;
k++;
}
}
while(i<m)
{
c[k]=a[i];
k++;
i++;
}
while(j<n)
{
c[k]=b[j];
k++;
j++;
}
printf("\n array is A: ");
for(i=0;i<m;i++)
printf("\t%d",a[i]);
printf("\n array is B: ");
for(i=0;i<n;i++)
printf("\t%d",b[i]);
printf("\n array is C: ");
for(i=0;i<m+n;i++)
printf("\t%d",c[i]);
}


