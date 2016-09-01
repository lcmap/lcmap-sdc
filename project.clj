(defproject lcmap-sdc "0.5.1-SNAPSHOT"
 :parent-project {
                  :coords [gov.usgs.eros/lcmap-system "1.0.0-SNAPSHOT"]
                  :inherit [
                            :deploy-repositories
                            :license
                            :managed-dependencies
                            :plugins
                            :pom-addition
                            :repositories
                            :target-path]}
  :description "Source Data Curator for LCMAP"
  :url "http://github.com/USGS-EROS/lcmap-sdc"
  :dependencies [[org.clojure/clojure]
                 [org.clojure/core.match]
                 [org.clojure/data.json]
                 [org.clojure/core.memoize]
                 [com.stuartsierra/component]
                 [gov.usgs.eros/lcmap-config]
                 [gov.usgs.eros/lcmap-logger]
                 [gov.usgs.eros/lcmap-event]
                 [gov.usgs.eros/lcmap-data]]
  :plugins [[lein-parent "0.3.0"]]
  :source-paths ["src"]
  :repl-options {:init-ns lcmap.sdc.dev}
  :main lcmap.sdc.app
  :codox {:project {:name "lcmap.sdc"
                    :description "The Source Data Curator Component for the USGS Land Change Monitoring Assessment and Projection (LCMAP) Computation and Analysis Platform"}
          :namespaces [#"^lcmap.sdc\."]
          :output-path "docs/master/current"
          :doc-paths ["docs/source"]
          :metadata {:doc/format :markdown
                     :doc "Documentation forthcoming"}}
  :main ^:skip-aot lcmap-sdc.core
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             :dev {}
             :testing {}})
