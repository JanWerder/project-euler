function primeFactors(n)
  factors = {}
  d = 2
    while n > 1 do
      while n % d == 0 do
        table.insert(factors, d)
        n = n/d
      end
      d = d + 1
    end
  
  local max = 0
  for i = 1,#factors do
    if factors[i] > max then
      max = factors[i]
    end
  end
  return max
end

print(primeFactors(600851475143))