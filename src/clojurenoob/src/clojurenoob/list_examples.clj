;;;;;;;;;;;;;;;;;;;
;; List Examples ;;
;;;;;;;;;;;;;;;;;;;

(defn list-examples
  []
  
  (println "----------------------------------------------------------------")
  
  ; Lists can contain multiple types
  (println "List of different types")
  (println (list "Dog" 1 3.4 true))
  
  (println "Display the first item")
  (println (first (list "Dog" 1 3.4 true)))
 
  (println "Display the rest of the itema")
  (println (rest (list "Dog" 1 3.4 true)))
 
  (println "Display the Nth item (zero-indexed, so '1st' item will actually be second")
  (println (nth (list "Dog" 1 3.4 true) 1))
 
  (println "Append items") ; note the square brackets!
  (println (list* 99 100 ["Dog" 1 3.4 true]))
  
  (println "Prepend items with cons")
  (println (cons -1 (list "Dog" 1 3.4 true)))
  
  (println "Prepend with conj")
  (println (conj (list "Dog" 1 3.4 true) -99))
)
