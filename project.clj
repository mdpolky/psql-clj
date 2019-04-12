(defproject psql-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
  				 [org.clojure/java.jdbc "0.7.9"]
  				 [org.postgresql/postgresql "42.2.1"]]
  :main ^:skip-aot psql-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
