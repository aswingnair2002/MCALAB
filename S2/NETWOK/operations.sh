echo "Please enter the first no."
read a
echo "Please enter the second no."
read b
echo "Please enter the third no."
read c
echo "Please enter the forth no."
read d
m=$(($a*$b*$c*$d))
echo "product="$m
s=$(($a+$b+$c+$d))
echo "sum="$s
v=$(echo "scale=2;($s)/4"|bc)
echo "average="$v

