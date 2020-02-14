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
