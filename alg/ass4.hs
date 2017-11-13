main = do
       mmult :: Num a => [[a]] -> [[a]] -> [[a]] 
       mmult a b = [[ sum $ zipWith (*) ar bc | bc <- (transpose b)] | ar <- a ]
