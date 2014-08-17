function even20(n)
  for i = 2,20 do
    if n%i ~= 0 then
      return false
    end 
  end
  return true
end  

n = 20
result = false
while not result do
  if even20(n) then
    result = true
    print(n)
  end
  n = n + 20
end