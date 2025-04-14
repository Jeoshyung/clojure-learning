(ns clojure-noob.core
  (:gen-class))

(defn add [a b]
  (+ a b))
(defn subtract [a b]
  (- a b))
(defn multiply [a b]
  (* a b))
(defn divide [a b]
  (if (not= b 0)
    (/ a b)
    (throw (IllegalArgumentException. "Cannot divide by zero"))))

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
            (= operation "1") (println "Result: " (add num1 num2))
            (= operation "2") (println "Result: " (subtract num1 num2))
            (= operation "3") (println "Result: " (multiply num1 num2))
            (= operation "4") (println "Result: " (divide num1 num2))
            :else (println "Invalid operation")
          )
        )
      )
    )
)
