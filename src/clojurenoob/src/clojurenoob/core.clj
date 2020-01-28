(ns clojurenoob.core
  (:gen-class))

(defn -main
  ; This is just for documentation generation
  "I don't do a whole lot ... yet."
  
  [& args]
  
  ; Basic printing to console
  (println "Hello, World!")
  
  ; First element of vector
  (println (first [10 20 30]))

  ; Print Nth element of (zero-indexed) vector
  (println (nth [10 20 30 40] 2))
  
  ; We can concatonate strings with str
  (println (str "foo, " "bar and " "moo"))
  
  ; If statements
  (if true 
    (println "its true")
    (println "its false"))
    
  (if (nil? [10 20 30])
    (println "nil!")
    (println "not nil!"))

  
  
)
