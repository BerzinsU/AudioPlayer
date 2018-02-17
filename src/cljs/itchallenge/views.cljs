(ns itchallenge.views
  (:require [re-frame.core :as re-frame]
            [itchallenge.subs :as subs]))

(defn title []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name]))

(defn body []
  [:div {:style {:position :relative}}
   [title]])

(defn background []
  (let [current-background (re-frame/subscribe [::subs/background])]
    [:div {:style {:background-image (str "url(\"" @current-background "\")")
                   :background-size  :cover
                   :position         :absolute
                   :width            "100%"
                   :height           "100%"}}]))

(defn main-panel []
  [:div
   [background]
   [body]])
