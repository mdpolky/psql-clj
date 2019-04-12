(ns psql-clj.core
  (:require [clojure.java.jdbc :as j]))

(def pg-db {:dbtype "postgresql"
            :dbname "pgguide"
            :host "localhost"})

(defn get-users []
  (j/query pg-db ["select * from users"]))