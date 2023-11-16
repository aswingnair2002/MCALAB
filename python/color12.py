color_names=input("Enter comma-seperated color name: ")
colors=color_names.split(',')
colors=[color.strip() for color in colors]
if len(colors)>=2:
	print("first colour",colors[0])
	print("last colour",colors[1])
else:
	print("Please enter atleast 2 color names.")

	
