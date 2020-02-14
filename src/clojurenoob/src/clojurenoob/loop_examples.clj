;;;;;;;;;;;;;;;;;;;
;; Loop Examples ;;
;;;;;;;;;;;;;;;;;;;

(defn loop-examples
  []

  (println "----------------------------------------------------------------")

  (def counter (atom 1))
  
  (println "While loop to count to 10")
  ;; Loop while true
  (while (<= @counter 10)
    (do
      (println @counter)
 
      ;; Increment value
      (swap! counter inc)))

  ; Reset the counter to 1 again
  (reset! counter 1)

  (println "dotimes loop to count to 10, doubling output")
  (dotimes [counter 10]
    (println (* counter 2)))

  (println "Loop from start to end with 'loop'")
  (loop [counter 1]
    (when (< counter 10)
      (println (* counter 3))
      ;; Increment the value
      (recur (+ counter 1))))


  ; Cycle through list (foreach) of integers, assigning to x each time
  (println "Cycle through list with doseq")
  (doseq [x '(1 2 3 4)]
    (println x))
)
