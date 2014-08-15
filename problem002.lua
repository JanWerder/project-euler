function fib(n)
  if n == 1 then
    return 1
  elseif n == 2 then
    return 2
  else
    return (fib(n-1) + fib(n-2))
  end
end

local i = 1
local sum = 0
while fib(i) < 4000000 do
  if fib(i)%2 == 0 then
    sum = sum + fib(i)
  end
  i = i + 1
end
print(sum)