(ns exercise2)

(defn only-greater-than-five
  "Returns greater than five elements of the given array."
  [arr]
  (filter
   (fn [x] (> x 5))
   arr
   )
  )