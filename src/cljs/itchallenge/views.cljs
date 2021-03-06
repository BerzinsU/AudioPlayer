(ns itchallenge.views
  (:require [re-frame.core :as re-frame]
            [itchallenge.subs :as subs]
            [itchallenge.player.views :refer [player]]))

(defn body []
  [:div {:style {:position        :absolute
                 :width           "100%"
                 :height          "100%"
                 :display         :flex
                 :align-items     :center
                 :justify-content :center}}
   ;[title]
   [player]])

(defn background []
  (let [current-background (re-frame/subscribe [::subs/background])]
    [:div {:style {:background-image    (str "url(\"" @current-background "\")")
                   :background-size     :cover
                   :background-position :center
                   :position            :absolute
                   :width               "100%"
                   :height              "100%"
                   :filter              "grayscale(35%) brightness(60%) contrast(110%)"}}]))

(defn main-panel []
  [:div {:style {:font-family "'Roboto', sans-serif"}}
   [background]
   [body]])
