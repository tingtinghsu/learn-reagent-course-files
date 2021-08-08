(ns giggin.core
  (:require [reagent.core :as r]))

;; function app() { return (<div className="container"></div>)}
(defn app
  []
  [:div.container])

(defn app
  []
  [:div {:class "container"}])

(defn plus
  [x y]
  (+ x y))

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
