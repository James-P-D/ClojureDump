;;;;;;;;;;;;;;;;;;
;; Map Examples ;;
;;;;;;;;;;;;;;;;;;

(defn map-examples
  []
  
  (println "----------------------------------------------------------------")
  
  (println "We can create hash-maps (unsorted)")
  (def my-hash-map (hash-map "Name" "James" "Age" 38 "Height" 183))
  (println my-hash-map)

  (println "We can create sorted-hash-maps")
  (def my-sorted-hash-map (sorted-map 1 "foo" 2 "bar" 3 "baz"))  
  (println my-sorted-hash-map)
 
  (println "We can get values from hash-maps by key")
  (println (get my-hash-map "Name"))
  (println "We can get values from sorted-hash-maps by key")
  (println (get my-sorted-hash-map 2))
 
  ; we can also return default values if the key cannot be resolved
  (println "We can return default values when we query a key that doesn't exist")
  (println (get my-hash-map "Sex") "UNKNOWN")
 
  (println "We can get the key/value from hash-maps")
  (println (find my-hash-map "Name"))
  (println "We can get the key/value from sorted-hash-maps")
  (println (find my-sorted-hash-map 2))
 
  (println "We can check hash-maps for certain keys. E.g. Name")
  (println (contains? my-hash-map "Name"))
  (println "We can check sorted-hash-maps for certain keys. E.g. 2")
  (println (contains? my-sorted-hash-map 2))
 
  (println "We can get the keys for a hash-map")
  (println (keys my-hash-map))
  (println "We can get the keys for a sorted-hash-map")
  (println (keys my-sorted-hash-map))
 
  (println "We can get the values for a hash-map")
  (println (vals my-hash-map))
  (println "We can get the values for a sorted-hash-map")
  (println (vals my-sorted-hash-map))
 
  (println "We can add entries to existing hash-maps")
  (def my-new-hash-map (merge-with + my-hash-map (hash-map "Weight" 82)))
  (println my-new-hash-map) 
  (println "We can add entries to existing sorted-hash-maps")
  (def my-new-sorted-hash-map (merge-with + my-sorted-hash-map (sorted-map 4 "moo")))
  (println my-new-sorted-hash-map) 
  
  ; We can also create hash-maps with {} syntax
  (println "using {} syntax...")
  (def another-hash-map {:Name "john" :Age 21})
  (println (get another-hash-map :Name))
  
  ; We can also store functions in maps
  (println "Storing functions in maps...")
  (def math-has-map {"plus" + "minus" -})
  (println "5 plus 6 = " ((get math-has-map "plus") 5 6))
  (println "5 plus 6 = " ((get math-has-map "minus") 5 6))
  
  ; We can have maps in maps
  (println "We can create maps in maps")
  (def map-in-map {:Name "John" :Age 23 :Pets {:Cats 0 :Dogs 2}})
  (println map-in-map)
  (println (get-in map-in-map [:Pets :Dogs]))
  
  ; We also have a shorthand for getting values from maps
  (println "We can also get values without using 'get'")
  (println (:Name map-in-map))
)
