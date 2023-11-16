print("print leap year between two given years")
print("enter the start year: ")
startYear=int(input())
print("enter the last year: ")
endYear=int(input())
print("list of leap years :")
for year in range(startYear,endYear):
	if(0==year%4)and(0!=year%100)or(0==year%400):
		print(year)


