;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Destructing Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn destructing-vector-params
  [[one two & the-rest]]

  (println one)
  (println two)
  (println the-rest)  
)

(defn destructing-map-params
  [{name :name age :age}]
  (println name)
  (println age)
)

(defn destructing-examples
  []

  (println "----------------------------------------------------------------")
  
  (println "We can destruct vectors using let")
  (def vectVals [1 2 3 4]) 
  ;; Assign values to symbols
  ;; the-rest stores remaining values
  (let [[one two & the-rest] vectVals]
    (println one)
    (println two)
    (println the-rest))
    
  (println "We can also destruct parameter vectors")
  (destructing-vector-params vectVals)

  (println "We can destruct maps using let")
  (def mapVals {:name "John" :age 21})
  (let [{name :name age :age} mapVals]
    (println name)
    (println age)
  )  

  (println "We can also destruct parameter maps")
  (destructing-map-params mapVals)
  
  (println "Finished")
)
