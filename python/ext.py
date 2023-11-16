filename=input("enter a file name: ")
if "."in filename:
	#using the split()method
	name,extension=filename.split(".")
	print("the extension of the file is: "+extension)
else:
	print("invalid file name format. Please include the file extension(e.g,filename.txt)")
