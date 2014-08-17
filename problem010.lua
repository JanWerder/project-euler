knownPrimes = {2, 3, 5, 7}

function isPrime(x)
	if (x%3 == 0) then return false
	else
		for n = 5, math.floor(math.sqrt(x)), 2 do
			if (x % n) == 0 then return false end
		end
	end
  table.insert(knownPrimes,x)
	return true
end

for i=9,2000000,2 do
  isPrime(i)
end

sum = 0
for _,v in ipairs(knownPrimes) do
  sum = sum + v
end
print(sum)