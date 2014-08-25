numDiv = 0
i = 0

function triangleNumber(n)
	k = 0
	for i=1,n do
		k = k + i
	end
	return k
end

function divisors(number)
	nod = 0;
	sqrt = math.sqrt(number)

	for i = 1,sqrt do
		if number % i == 0 then
			nod = nod + 2
		end
	end

	if sqrt * sqrt == number then
		nod = nod - 1
	end

	return nod;
end

n = 0
while not solution do
	n = n + 1
	if divisors(triangleNumber(n)) > 500 then
		solution = true
	end
end

print(n .. "th - " ..triangleNumber(n) .. "(" .. divisors(triangleNumber(n)) .. ")")
