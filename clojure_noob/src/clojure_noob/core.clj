(ns clojure-noob.core
  (:gen-class))

(defn -main
  "Simple Calculator App"
  [& args]

  (println "Enter a number to pick operation: ")
  (println "1. Addition")
  (println "2. Subtraction")
  (println "3. Multiplication")
  (println "4. Division")

  (let [operation (read-line)]
    (println "Enter first number:")
      (let [num1 (Integer/parseInt(read-line))]
        (println "Enter second number:")
        (let [num2 (Integer/parseInt(read-line))]
          (cond
            (= operation "1") (println "Result: " (+ num1 num2))
            (= operation "2") (println "Result: " (- num1 num2))
            (= operation "3") (println "Result: " (* num1 num2))
            (= operation "4") (println "Result: " (/ num1 num2))
            :else (println "Invalid operation")
          )
        )
      )
    )
)
