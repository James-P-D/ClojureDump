;;;;;;;;;;;;;;;;;;;;;;;
;; Function Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;

(defn output-number
  [x]
  (println "Number: " x)
)

(defn say-hello
  [first-name surname]
 
  (println "Hello " first-name surname)
)

(defn square-number
  [x]
  
  ; Result of last operation is returned to caller
  (* x x)
)

(defn sum-numbers
  ; Two parameters
  ([a b]
    (+ a b))
	
  ; Three parameters
  ([a b c]
    (+ a b c))
	
  ; Four parameters
  ([a b c d]
    (+ a b c d))
)

(defn output-numbers
  [& numbers]

  (map output-number numbers)  
)

(defn function-examples
  []
  
  (println "----------------------------------------------------------------")

  (say-hello "John" "Doe")
  
  (println "3 squared is " (square-number 3))
  (println "1 + 2 is " (sum-numbers 1 2))
  (println "1 + 2 + 3 + 4 is " (sum-numbers 1 2 3 4))
  
  (output-numbers 1 2 3)
  (output-numbers 1 2 3 4 5 6)
  
  (println "We can also get functions at runtime")
  (println "4 + 5 = " ((first [+ -]) 4 5))
  (println "4 - 5 = " ((nth [+ -] 1) 4 5))
)
