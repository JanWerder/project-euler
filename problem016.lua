inspect = require "modules.inspect"

bbn= {}
bbn.__index = bbn

function bbn:create(var)
	local number = bbn.new(var);

	local t = setmetatable(
		number, bbn
		)
	return t;
end

function bbn.new(var)
	local var = tostring(var) or "0";
	local array = {};
	for i = 1, string.len(var) do
		table.insert(array, string.sub(var, i, i))
	end
	return array;
end

function bbn:print()
	return table.concat(self)
end

function bbn:__tostring()
	return table.concat(self)
end

function bbn:add(num)
  local decoy = bbn:create(tostring(self));
	local tabLen = #decoy
	local numLen = string.len(tostring(num))
	num = tostring(num)
	if numLen < tabLen then
		for i = 1, tabLen - numLen do
			num = "0"..num
		end
	end
	if tabLen < numLen then
		for i = 1, numLen - tabLen do
			table.insert(decoy, 1, 0)
		end
	end
	numLen = string.len(tostring(num))
	tabLen = #decoy
	num = string.reverse(num)
	for i = tabLen, tabLen - numLen + 1, -1 do
		local subbedNum = tonumber(string.sub(num, numLen - i + 1, numLen - i + 1 ))
		if decoy[i] + subbedNum then
			decoy[i] = decoy[i] + subbedNum
		end
	end
	for i = #decoy, 1, -1 do
		if decoy[i] > 9 then
			decoy[i] = decoy[i] - 10
			if decoy[i - 1] ~= nil then
				decoy[i - 1] = decoy[i - 1] + 1
			elseif decoy[i - 1] == nil then
				table.insert(decoy, 1, 1)
			end
		end
	end
	return decoy
end


function bbn:mult(num)
	local decoy = bbn:create(tostring(self))
	local ex = tostring(self)
	for i = 2, tonumber(tostring(num)) do
	decoy = decoy:add(ex)
	end
	return decoy
end

function bbn:pow(num)
	local decoy = bbn:create(tostring(self))
	local ex = tostring(self)
	for i = 2, tonumber(tostring(num)) do
		decoy = decoy:mult(ex);
	end
	return decoy
end

m = bbn:create(2)
str = tostring(m:pow(1000))
sum = 0
for i = 1, #str do
    sum = sum + tonumber(str:sub(i, i))
end

print(sum)