for i=1,998 do
  for j=1,998 do
    for k=1,998 do
      if i+j+k == 1000 then
        if (i*i + j*j) == k*k then
          print(i*j*k .. "("..i..","..j..","..k..")")
          os.exit()
        end
      end
    end
  end
end