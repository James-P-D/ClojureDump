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
)

(defn -main
  ; This is just for documentation generation
  "I don't do a whole lot ... yet."
  
  [& args]
  
  (println "Hello, world!")
  
  ; Basic printing to console
  (variable-examples)
  
  ; Basic string operators
  (string-examples)
  
  ; First element of vector
  ; (println (first [10 20 30]))

  ; Print Nth element of (zero-indexed) vector
  ; (println (nth [10 20 30 40] 2))
  
  ; We can concatonate strings with str
  ; (println (str "foo, " "bar and " "moo"))
  
  ; If statements
  ;(if true 
  ;  (println "its true")
  ;  (println "its false"))
    
  ;(if (nil? [10 20 30])
  ;  (println "nil!")
  ;  (println "not nil!"))

  
  
)
