knownPrimes = {2, 3, 5, 7, 11, 13}
allPrimes = knownPrimes

function checkPrime(n)
  for _, v in ipairs(knownPrimes) do
    if n%v == 0 then
      return false
    end
  end
  return true
end

local n = 14
while #allPrimes < 10001 do
  if checkPrime(n) then
    table.insert(allPrimes, n)
  end
  n = n + 1
end

print(allPrimes[10001])