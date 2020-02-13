(ns clojurenoob.core
  (:require [clojure.string :as str])
  (:gen-class))

;;;;;;;;;;;;;;;;;;;;;;;
;; Variable Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;

(defn variable-examples
  ; function has no paramters
  []
  
  (println "----------------------------------------------------------------")
  
  (def someBigInteger 1234)
  
  (def someDouble 123.456)
  
  (def someString "Hello")
  
  (def someBoolean true)
  
  (println (format "someBigInteger = %d" someBigInteger))
  (println (format "someBigInteger (padded) = %8d" someBigInteger))
  (println (format "someBigInteger (leading zeros) = %08d" someBigInteger))
  
  (println (format "someDouble = %f" someDouble))
  (println (format "someDouble (1 d.p.) = %.1f" someDouble))

  (println (format "someString = %s" someString))

  ; We can get the type of variables
  (println (type someBigInteger))
  
  ; We can test if they are nil
  (println (nil? someBigInteger))
  
  ; We can check if positive
  (println (pos? someBigInteger))
 
  ;; Check if a number is negative
  (println (neg? -5))
 
  ;; Check if even
  (println (even? someBigInteger))
 
  ;; Check if odd
  (println (odd? someBigInteger))
 
  ;; Check if number
  (println (number? someDouble))
 
  ;; Check if integer
  (println (integer? someDouble))
 
  ;; Check if float
  (println (float? someDouble))
 
  ;; Check if zero
  (println (zero? someBigInteger))
)

;;;;;;;;;;;;;;;;;;;;;
;; String Examples ;;
;;;;;;;;;;;;;;;;;;;;;

(defn string-examples
  []

  (println "----------------------------------------------------------------")
  
  (def someString "This is an example of a string")
  
  (println "Check if string is empty")
  (println (str/blank? someString))

  (println "Check if string contains substring")
  (println (str/includes? someString "example"))
 
  (println "Check for index of substring")
  (println (str/index-of someString "example"))
 
  (println "Split string on spaces")
  (println (str/split someString #" "))

  (println "Create new string with join")
  (println (str/join "and" ["foo" "bar" "moo"]))
 
  (println "Trim whitespace")
  (println (str/trim "  something  "))

  (println "Make uppercase")
  (println (str/upper-case someString))  

  (println "Make lowercase")
  (println (str/lower-case someString))  

  (println "Concatonate")
  (println (str "foo, " "bar and " "moo"))  
)

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
  
  (println "Prepend items")
  (println (cons -1 (list "Dog" 1 3.4 true)))
)

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
)

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

;;;;;;;;;;;;;;;;;;;;;;
;; Map Examples ;;
;;;;;;;;;;;;;;;;;;;;;;

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
)

(defn -main
  ; This is just for documentation generation
  "I don't do a whole lot ... yet."
  
  [& args]
  
  (println "Hello, world!")
  
  ; Basic printing to console
  ;(variable-examples)
  
  ; Basic string operators
  (string-examples)
  
  ; Basic list examples
  ;(list-examples)
  
  ; Basic set examples
  ;(set-examples)
  
  ; Basic vector examples
  ;(vector-examples)
  
  ; Basic map examples
  ; (map-examples)
  
  
  
)
