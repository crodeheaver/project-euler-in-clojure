(ns scratch.euler1)

(def under1000
  (take 1001 (range)))

(defn div-by-three
  "Checks to see if number is divisible by three"
  [x]
  (if (= (mod x 3) 0)
    true
    false))

(defn div-by-five
  "Checks to see if number is divisible by five"
  [x]
  (if (= (mod x 5) 0)
    true
    false))

(defn div-by-three-or-five
  [x]
  (if (or (div-by-three x) (div-by-five x))
    x
    0))

(defn euler1
  []
  (reduce + (map div-by-three-or-five  under1000)))
