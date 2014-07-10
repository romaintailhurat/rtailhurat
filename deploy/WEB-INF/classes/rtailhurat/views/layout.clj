(ns rtailhurat.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to rtailhurat"]
     [:link {:rel "stylesheet" :href "//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"}]
     [:link {:rel "stylesheet" :href "//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"}]]
     ;;(include-css "/css/screen.css")]
    [:body body]))
