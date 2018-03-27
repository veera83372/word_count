(ns wc.util)

(defn isOption
  [arg]
  (.startsWith arg "-"))

(defn filter-not-option
  [elements]
  (filter
    (fn [x] (not (.startsWith x "-")))
    elements))

(defn get-first-file [elements]
  (first
    (filter-not-option elements)))