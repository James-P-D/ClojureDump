;;;;;;;;;;;;;;;;;;;
;; Atom Examples ;;
;;;;;;;;;;;;;;;;;;;

(defn atom-example
  []
 
  (println "----------------------------------------------------------------")

  ;; Define the atoms value
  (def atomEx (atom 5))
 
  ;; Watchers can be attached to atoms and agents
  ;; to run functions when a value changes
  (add-watch atomEx :watcher
             (fn [key atom old-state new-state] ; Anonymous function
               (println "atomEx changed from " old-state " to " new-state)))
 
  ;; Print the value
  (println "1st value" @atomEx)
 
  ;; Change the value
  (reset! atomEx 10)
  (println "2nd value" @atomEx)
 
  ;; Change the value using a function
  (swap! atomEx inc)
  (println "Incremented value" @atomEx)
)
