(ns bib-parser.core
  (:gen-class))

(defn parse
  "Parses a .bib file"
  [s]
  (let [entry (re-find #"(?s)@(?<bibtype>\w+?)\{(?<body>.*)\}" s)]
    (reduce (fn [a b] (assoc a (b 1) (b 2))) {}
    (re-seq #"(?s)(\w+)=\{(.*?)\},?" (entry 2))
)))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
