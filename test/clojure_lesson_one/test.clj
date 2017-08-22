(ns clojure-lesson-one.test
  (:require [midje.sweet :refer :all]
            [clojure.string :as str]))
(defn greeting
  "Returns a greeting of the form 'Hello, username'"
  ([] (greeting "world"))
  ([username] (str"Hello, " username)))

(defn date [person-1, person-2 & chaperones]
  (println person-1 "and" person-2
           "went out with" (count chaperones) "chaperones."))

(defn indexable-word? [word]
  (> (count word) 1))

;(filter indexable-word? (str/split "A magic day it is" #"\W+"))
;(filter (fn [w] (> (count w) 2)) (str/split "A magic day" #"\W+"))
;(filter #(> (count %) 2) (str/split "A magic day" #"\W+"))


(defn indexable-words [text]
  (let [indexable-word? (fn [w] (> (count w) 2))]
    (filter indexable-word? (str/split text #"\W+"))
    ))
;(indexable-words "a magic day is")

(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))
(def hello-greeting (make-greeter "Hello"))
;(hello-greeting "wold")
;((make-greeter "Howdy") "magic")

(defn triple [number] (* 3 number))
;(triple 10)

(defn square-corners [bottom left size]
  (let [top (+ bottom size)
        right (+ left size)]
    [[bottom left] [top left] [top right] [bottom right]]))
;(square-corners 10 5 2)

(defn greet-author-1 [author]
  (println "Hello, " (:first-name author)))
;(greet-author-1 {:first-name "Miro" :last-name "Wengner"})

(defn greet-author-2 [{fname :first-name}]
  (println "Hello, " fname))
; (greet-author-2 {:first-name "Miro" :last-name "Wengner"})

;(let [[x y] [1 2 3]] [x y])
;(let [[_ _ z] [1 2 3] _) ;not idiomatic _ is bounded from left to right _ is bounded twice

;(let [[x y :as coords] [1 2 3 4 5 6]]
;  (str "x: " x ", y: " y ", total dimensions " (count coords)))

(require '[clojure.string :as str])
(defn ellipsize [words]
  (let [[w1 w2 w3] (str/split words #"\s+")]
    (str/join " " [w1 w2 w3 "..."])))
