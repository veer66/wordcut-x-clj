# wordcut-x-clj
A wordcut-x wrapper for Clojure

## Usage example

````Clojure
(def wordcut (create-wordcut-from-url "http://file.veer66.rocks/dix/tdict-std.txt"))
(wordseg wordcut "กากาก")
(build-dag wordcut "กากาก")
````
