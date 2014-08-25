function collatz(n)
    currStreak = currStreak + 1
    if n == 1 then
      return 1
    end
    if n%2 == 0 then
      collatz(n/2)  
    else
      collatz(3*n+1)
    end
end

maxInteger = 0
maxStreak = 0
for i=1,999999 do
  currStreak = 0
  collatz(i)
  if currStreak > maxStreak then
    maxInteger = i
    maxStreak = currStreak
  end
end

print(maxInteger)