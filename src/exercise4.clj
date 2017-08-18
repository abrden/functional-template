(ns exercise4)

(defn summary
  "Returns the sum of elements of the given sequence."
  [seq]
  (reduce
   (fn [x, y] (+ x y))
   seq
   )
  )




