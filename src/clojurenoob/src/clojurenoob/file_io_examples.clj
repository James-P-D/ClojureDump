;;;;;;;;;;;;;;;;;;;;;;;;
;; File I/O  Examples ;;
;;;;;;;;;;;;;;;;;;;;;;;;

(use 'clojure.java.io)

(defn write-to-file
  [file text]
 
  ;; with-open opens and closes the file
  ;; and then writes a string to a file
  (with-open [wrtr (writer file)]
    (.write wrtr text)))
 
(defn read-from-file
  [file]
 
  ;; We can catch a potential file not found error
  ;; with exception handling
 
  (try
    ;; Read from a file to a single string
    (println (slurp file))
 
    ;; Catch the error and print it
    (catch Exception e (println "Error : " (.getMessage e)))))
 
;; Append text to a file
(defn append-to-file
  [file text]
 
  (with-open [wrtr (writer file :append true)]
    (.write wrtr text)))
 
;; Read 1 line at a time
(defn read-line-from-file
  [file]
 
  (with-open [rdr (reader file)]
    (doseq [line (line-seq rdr)]
      (println line))))
      
(defn file-io-examples
  []

  (println "----------------------------------------------------------------")

  (println "Writing to file")
  (write-to-file "test.txt" "This is a sentence\n")
  
  (println "Reading from file")
  (read-from-file "test.txt")
  
  (println "Appending to file")
  (append-to-file "test.txt" "This is another sentence\n")
  
  (println "Reading from file")
  (read-line-from-file "test.txt")
)
