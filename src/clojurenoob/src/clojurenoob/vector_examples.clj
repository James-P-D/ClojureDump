;;;;;;;;;;;;;;;;;;;;;;
;; Vectors Examples ;;
;;;;;;;;;;;;;;;;;;;;;;

(defn vector-examples
  []
  
  (println "----------------------------------------------------------------")
  
  (println "Vectors can contain multiple types of data")
  (println (vector 1 "Dog" 3.1415 99))
 
  (println "Get the 1st element")
  (println (get (vector 1 "Dog" 3.1415 99) 1)) ; Returns "Dog"
  (println "Get the 0th element")
  (println (get (vector 1 "Dog" 3.1415 99) 0)) ; Returns 1
  
  (println "Appent 100")
  (println (conj (vector 1 "Dog" 3.1415 99) 100))
 
  (println "remove the last element")
  (println (pop (vector 1 "Dog" 3.1415 99)))
 
  (println "Get a range")
  (println (subvec (vector 1 2 3 4 5 6 7 8) 3 6)) ; [ 4 5 6]
)
