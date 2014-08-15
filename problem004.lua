function isPalindrom(n)
  s = tostring(n)  
  for i=1,(#s/2) do
    if string.byte(s,i) ~= string.byte(s,-i) then
      return false
    end
  end
  return true
end

local fourDigits = false
local g = 1
while not fourDigits do
  g = g + 1
  if #tostring(g) == 4 then
    g = g -1
    fourDigits = true
  end
end

local max = 0
for i = 100,g do
  for j = 100,g do
    if isPalindrom(i*j) and i*j > max then
      max = i*j
    end
  end
end

print(max)