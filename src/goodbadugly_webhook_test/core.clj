(ns goodbadugly-webhook-test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  :this-is-a-warning
  (println x "Hello, World!"))

(-> 1
 (= 2))

(defn bar
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
