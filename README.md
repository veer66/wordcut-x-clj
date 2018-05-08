# wordcut-x-clj
A wordcut-x wrapper for Clojure

## Usage example

````Clojure
(def wordcut (create-wordcut-from-url "http://file.veer66.rocks/dix/tdict-std.txt"))
(wordseg wordcut "กากาก")
(build-dag wordcut "กากาก")
````
## Install

### Lein

````
[rockers.veer66/wordcut-x-clj "0.1.1-SNAPSHOT"]
````
