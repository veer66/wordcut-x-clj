(ns rocks.veer66.wordcut
  (:require [clojure.string :as str])
  (:import rocks.veer66.Wordcut
           rocks.veer66.EdgeType)
  (:gen-class)) 

(defn create-wordcut-from-url [dix-url-text]
  (let [dix-url (.toURL (java.net.URI/create dix-url-text))]
    (Wordcut/fromDixUrl dix-url)))

(defn convert-etype [etype]
  (->> etype
       .toString
       str/capitalize
       keyword))

(defn convert-edge [edge]
  {:s (.s edge)
   :e (.e edge)
   :etype (-> edge
              .etype
              convert-etype)})

(defn convert-edges [edges]
  (map convert-edge edges)) 


(defn build-dag [wordcut text]
  (->> (.buildDag wordcut text)
       (map convert-edges)))

(defn wordseg [wordcut text]
  (.segmentToStrList wordcut text))


;; (def wordcut (create-wordcut-from-url "http://file.veer66.rocks/dix/tdict-std.txt"))
;; (wordseg wordcut "กากาก")
;; (build-dag wordcut "กากาก")
