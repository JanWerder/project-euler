local sumsquare = 0
local squaresum = 0

for i=1,100 do
  sumsquare = sumsquare + (i*i)
end

for i=1,100 do
  squaresum = squaresum + i
end
squaresum = squaresum * squaresum

print(squaresum-sumsquare)