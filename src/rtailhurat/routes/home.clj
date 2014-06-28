(ns rtailhurat.routes.home
  (:require [compojure.core :refer :all]
            [rtailhurat.views.layout :as layout]))

(defn home []
  (layout/common
    [:h1 "_this is romain internet hub_"]
    [:a {:href "http://twitter.com/romaintailhurat"} "twitter : @romaintailhurat"]
  ))

(defroutes home-routes
  (GET "/" [] (home)))
