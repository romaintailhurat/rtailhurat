(ns rtailhurat.routes.home
  (:require [compojure.core :refer :all]
            [rtailhurat.views.layout :as layout]))

(defn home []
  (layout/common
    [:div {:class "container"}
      [:h1 "_this is romain internet hub_"]

      [:div
        [:p "nearly : a software engineer / a game designer / a musician"]
        [:p "totally : a father of two / a 10+ year lover"]]

      [:div
        [:i {:class "fa fa-twitter fa-2x"}][:a {:href "http://twitter.com/romaintailhurat"} "@romaintailhurat"]]
      [:div
         [:i {:class "fa fa-github fa-2x"}][:a {:href "https://github.com/romaintailhurat"} "/romaintailhurat"]]
    ]

  ))

(defroutes home-routes
  (GET "/" [] (home)))
