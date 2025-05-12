# parameterized

def parameterizedSum(i, sum=0):
	if i == 0:
		print(sum)
		return sum
	parameterizedSum(i-1, sum+i)

parameterizedSum(3)

# functional

def functionalSum(i):
	if i == 1:
		return 1
	return i + functionalSum(i-1)

print(functionalSum(3))