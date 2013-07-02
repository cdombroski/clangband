(defproject clangband "0.1.0-SNAPSHOT"
  :description "Angband clone in clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :dev-dependencies [[lein-midje "3.0.0"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}}
  :main clangband.core)
