(defproject clojure-lesson-one "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.7.0"]
                 [org.clojure/data.json "0.2.6"]
                 [cconf/cconf "1.2.0"]
                 [org.clojure/tools.logging "0.4.0"]]
  :profiles {:dev {:plugins [[lein-midje/lein-midje "3.2.1"]
                             [lein-cljfmt/lein-cljfmt "0.5.7"]]
                   :dependencies[[midje/midje "1.8.3"]]}}
  :main ^:skip-aot clojure-lesson-one.core
  :target-path "target/%s"
  :cljfmt {:indents {fact [[:inner 0]]
                    facts [[:inner 0]]
                    provided [[:inner 0]]
                    against-background [[:inner 0]]
                    => [[:inner 0]]}}
  :aliases {"fmt" ["cljfmt" "fix" "test" "project.clj"]}
  )
