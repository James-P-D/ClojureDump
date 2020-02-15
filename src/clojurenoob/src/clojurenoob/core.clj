(ns clojurenoob.core
  (:require [clojure.string :as str])
  (:gen-class))

  (load "variable_examples")
  (load "string_examples")
  (load "list_examples")
  (load "set_examples")
  (load "vector_examples")
  (load "map_examples")
  (load "maths_examples")
  (load "atom_examples")
  (load "agent_examples")
  (load "function_examples")
  (load "conditional_examples")
  (load "loop_examples")
  (load "file_io_examples")
  (load "destructing_examples")
  (load "structure_map_examples")
  (load "anonymous_function_examples")

(defn -main
  ; This is just for documentation generation
  "I don't do a whole lot ... yet."
  
  [& args]
 
  ; Basic printing to console
  ;(variable-examples)
  
  ; Basic string operators
  ;(string-examples)
  
  ; Basic list examples
  ;(list-examples)
  
  ; Basic set examples
  ;(set-examples)
  
  ; Basic vector examples
  ;(vector-examples)
  
  ; Basic map examples
  ;(map-examples)
  
  ; Basic maths examples
  ;(math-examples)
  
  ; Basic atom example
  ;(atom-example)
  
  ; Basic agent example
  ;(agent-example)
  
  ; Basic function examples
  ;(function-examples)
  
  ; Basic conditional examples
  ;(conditional-examples)
  
  ; Basic loop examples
  ;(loop-examples)
  
  ; Basic file i/o examples
  ;(file-io-examples)
  
  ; Destructing examples
  (destructing-examples)
  
  ; Struct-map examples
  ;(struct-map-examples)
  
  ; Anonymous function examples
  ;(anonymous-functions-examples)
)
