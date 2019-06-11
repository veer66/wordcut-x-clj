(defproject rocks.veer66/wordcut-x-clj "0.1.4-SNAPSHOT"
  :description "A wordcut-x wrapper for Clojure"
  :url "https://github.com/veer66/wordcut-x-clj"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [rocks.veer66/wordcut-x "1.1-SNAPSHOT"]]
  :profiles {:uberjar {:aot :all}})
