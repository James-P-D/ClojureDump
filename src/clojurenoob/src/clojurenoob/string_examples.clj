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
