(ns bib-parser.core
  (:gen-class))

(defn parse-entry
  "Parses a single .bib entry"
  [s]
    (reduce
      (fn [a b] (assoc a (b 1) (b 2)))
      {}
      (re-seq #"(?s)(\w+)=\{(.*?)\},?" s)))

(defn parse-many
  "Parses many entries"
  [s]
  (map 
     #(parse-entry (get % 1 ""))
     (re-seq #"(?s)@\w+\{(.*?)\}\s\}" s)))

(defn parse-file
  "Parses a .bib file"
  [fp]
  (parse-many (slurp fp)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
