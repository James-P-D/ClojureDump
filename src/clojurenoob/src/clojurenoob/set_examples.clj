;;;;;;;;;;;;;;;;;;
;; Set Examples ;;
;;;;;;;;;;;;;;;;;;

(defn set-examples
  []
  
  (println "----------------------------------------------------------------")
  
  (println "Sets contain unique values")
  (println (set '(1 1 2 2 3 4 5 6 6)))
  
  (println "Note that sets are randomly ordered")
  (println (set '(1 2 3 4 5 6 7 8 9 10)))
 
  (println "If we need the set sorted we use sorted-set")
  (println (sorted-set 1 2 3 4 5 6 7 8 9 10))
 
  ; Get an index
  (println "we can still get (1-indexed) values")
  (println "5th:")
  (println (get (set '(1 2 3 4 5 6 7 8 9 10)) 5)) ; returns 5
  (println "1st:")
  (println (get (set '(1 2 3 4 5 6 7 8 9 10)) 1)) ; returns 1
  (println "0th:")
  (println (get (set '(1 2 3 4 5 6 7 8 9 10)) 0)) ; returns nil
 
  ; Append a value
  (println "Append 5")  
  (println (conj (set '(1 2 3 4)) 5))
 
  (println "Is 3 in the set?")
  (println (contains? (set '(1 2 3 4)) 3))
  (println "Is 5 in the set?")
  (println (contains? (set '(1 2 3 4)) 5))
 
  (println "Remove 3 from the set")
  (println (disj (set '(1 2 3 4 5)) 3))
  
  (println "We can also create sets with the #{} syntax (but note that duplicate entries will raise an exception!)")
  (println #{1 2 3 4})
  
)
