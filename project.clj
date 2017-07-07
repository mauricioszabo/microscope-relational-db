(defproject microscope/relational-db "0.1.1-SNAPSHOT"
  :description "Microservice architecture for Clojure"
  :url "https://github.com/acessocard/microscope"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [microscope "0.1.3"]
                 [com.mchange/c3p0 "0.9.5.1"]
                 [org.clojure/java.jdbc "0.6.1"]]

  :profiles {:dev {:src-paths ["dev"]
                   :dependencies [[org.hsqldb/hsqldb "2.4.0"]
                                  [midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]]}})
