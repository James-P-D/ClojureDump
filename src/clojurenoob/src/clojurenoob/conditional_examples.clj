;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Conditional Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn conditional-examples
  []
  
  (println "----------------------------------------------------------------")

  (def age 17)
  (def is-male true)
  
  (if (>= age 18)
    (println "You can Vote")
    (println "You can't Vote"))

  ; We can use = not= < <= > >= and or not
  (if (and (>= age 18) is-male)
    (println "You can Vote in Saudia Arabia")
    (println "You can't Vote in Saudi Arabia"))

  ; If we want to do more than one thing then we can use do
  (if (>= age 18)
    (do
      (println "You can vote")
      (println "You can drink"))
    (do
      (println "You can't vote")
      (println "You can't drink")))

  ; If we only want to do something when true (and have no else case) we can use 'when'
  (when (and (>= age 13) (<= age 18))
    (println "You are a teenager")
    (println "Pretty soon you can drink and vote"))
	
  (cond
    (< age 5) (println "Preschool")
    (= age 5) (println "Kindergarten")
    (and (> age 5) (<= age 18)) (println "Normal school")
    :else (println "Go to College"))
)
