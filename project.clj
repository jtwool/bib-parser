(defproject bib-parser "0.0.1"
  :description ""
  :url ""
  :license {:name "Mozilla Public License 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot bib-parser.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
