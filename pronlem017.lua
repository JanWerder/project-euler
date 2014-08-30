dic = {}
dic[1]="one"
dic[2]="two"
dic[3]="three"
dic[4]="four"
dic[5]="five"
dic[6]="six"
dic[7]="seven"
dic[8]="eight"
dic[9]="nine"
dic[10]="ten"
dic[11]="eleven"
dic[12]="twelve"
dic[13]="thirteen"
dic[14]="fourteen"
dic[15]="fifteen"
dic[16]="sixteen"
dic[17]="seventeen"
dic[18]="eighteen"
dic[19]="nineteen"
dic[20]="twenty"
dic[30]="thirty"
dic[40]="forty"
dic[50]="fifty"
dic[60]="sixty"
dic[70]="seventy"
dic[80]="eighty"
dic[90]="ninety"
dic[100]="hundred"

function countHundred(s)
  return dic[tonumber(s)] .. dic[100]
end

function countTen(s)
  return dic[tonumber(s)*10] 
end

sum = 0
for i=1,1000 do
  a = i
  word = ""
  
  if i == 1000 then
    word = "onethousand"
  end
  
  if #tostring(a) == 3 then
    word = word .. countHundred(tostring(a):sub(1, 1))
    a = a - tonumber(tostring(a):sub(1, 1))*100
    if a ~= 0 then
      word = word .. "and"
    end
  end
  
  if #tostring(a) == 2  and a > 19 then
    word = word .. countTen(tostring(a):sub(1, 1))
    a = a - tonumber(tostring(a):sub(1, 1))*10
  end
  
  if a < 20 and a > 0 then
    word = word .. dic[a]
  end
  --print(word)
  sum = sum + #word
end

print(sum)

