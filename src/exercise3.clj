(ns exercise3)

(defn fibonacci
  "Returns the fibonacci number given an index."
  [x]
  (if
    (or (= x 0) (= x 1))
    x
    (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
   )
 )