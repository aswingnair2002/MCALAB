#program to check if a year is leap year or not
year=2019
if(year%400==0)and(year%100==0):
	print("{0}is a leap year".format(year))
elif(year%4==0)and(year%100!=0):
	print("{0}is a leap year".format(year))
else:
	print("{0}is not leap year".format(year))

