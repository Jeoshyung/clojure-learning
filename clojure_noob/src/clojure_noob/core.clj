(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (def value
  (+ 1 2 3 4 5 6 7 8 9 10)
  )

  (println "The value is: " value)

  (if (> value 10)
    (do
      (println "Value is greater than 10")
      (println "The bool is: " (> value 10)))
    (do
    (println "Value is less than or equal to 10")
    (println "The bool is: " (> value 10)))
  )
)
