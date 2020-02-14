;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Anonymouse Function Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 
(defn anonymous-functions-examples
  []
  
  (println "----------------------------------------------------------------")
  (println (map (fn [x] (* x x)) (range 1 10)))
 
  ;; Compact anonymous function multiplies everything by 3
  (println (map #(* % 3) (range 1 10)))
 
  ;; Compact anon with 2 arguments
  (println (#(* %1 %2) 2 3))
)
