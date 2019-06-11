# wordcut-x-clj
A wordcut-x wrapper for Clojure

## Usage example

````Clojure
(require '[rocks.veer66.wordcut :refer :all])
(def wordcut (create-wordcut-from-url "https://file.veer66.rocks/dix/tdict-std.txt"))
(wordseg wordcut "กากาก")
(build-dag wordcut "กากาก")
````
## Install

### Lein

````
[rocks.veer66/wordcut-x-clj "0.1.4-SNAPSHOT"]
````
