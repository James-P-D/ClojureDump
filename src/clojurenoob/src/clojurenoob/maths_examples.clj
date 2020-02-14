;;;;;;;;;;;;;;;;;;;
;; Math Examples ;;
;;;;;;;;;;;;;;;;;;;

(defn math-examples
  []

  (println "----------------------------------------------------------------")


  (println (+ 1 2 3))          ;; Add values together
  (println (- 5 3 2))          ;; Subtract values
  (println (* 2 5))            ;; Multiply Values
  (println (/ 10 5))           ;; Divide Values
  (println (mod 12 5))         ;; Modulus
  (println (inc 5))            ;; Increment 
  (println (dec 5))            ;; Decrement
 
  (println (Math/abs -10))     ;; Absolute Value
  (println (Math/cbrt 8))      ;; Cube Root
  (println (Math/sqrt 4))      ;; Square Root
  (println (Math/ceil 4.5))    ;; Round up
  (println (Math/floor 4.5))   ;; Round down
  (println (Math/exp 1))       ;; e to the power of 1
  (println (Math/hypot 2 2))   ;; sqrt(x^2 + y^2)
  (println (Math/log 2.71828)) ;; Natural logarithm
  (println (Math/log10 100))   ;; Base 10 log
  (println (Math/max 1 5))     ;; Max of two values
  (println (Math/min 1 5))     ;; Min of two values
  (println (Math/pow 2 2))     ;; Power
  (println (Math/PI))
 
  ;; Generate random number
  (println (rand-int 20))
 
  ;; cos, sin, tan acos, asin, atan, cosh, sinh, tanh
  
  ;; Perform an operation on a collection
  (println(reduce + [1 2 3]))
  (println(reduce - [1 2 3]))
)
