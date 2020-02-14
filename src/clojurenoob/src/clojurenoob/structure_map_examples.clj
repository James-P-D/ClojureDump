;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Structure Map Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn struct-map-examples
  []
 
  (println "----------------------------------------------------------------")
  ;; Define a Struct
  (defstruct Customer :Name :Phone)
 
  ;; Define a Struct Object
  (def cust1 (struct Customer "Doug" 4125551212))
 
  ;; You can also assign to specific keys
  (def cust2 (struct-map Customer :Name "Sally" :Phone 5551122))
 
  (println cust1)
 
  ;; Access individual fields
  (println (:Name cust2))
)
