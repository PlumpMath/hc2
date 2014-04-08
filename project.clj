(def LAYOUTS {:PREVIEW {:x 20 :y 20 :w 800 :h 600}})

(defn screen [tag] (reduce #(str %1 "." %2)
                           (map #(% (tag LAYOUTS)) [:x :y :w :h])))

(defproject eu.cassiel/hc2 "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-midje "3.1.1"]
            [lein-field "0.3.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [midje "1.5.1"]]
                   :source-paths ["dev"]}}
  :field-arguments {:noHistory 0
                    ;; :timer.interval 0.033
                    :editorFont "Courier"
                    :editorFontSize 12
                    :editorTabSize 4
                    :rect ~(screen :PREVIEW)
                    :field.scratch "hc2.field"})
