;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Destructing Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn destructing-examples
  []

  (println "----------------------------------------------------------------")
  (def vectVals [1 2 3 4])
 
  ;; Assign values to symbols
  ;; the-rest stores remaining values
  (let [[one two & the-rest] vectVals]
    (println one)
    (println two)
    (println the-rest))
)
