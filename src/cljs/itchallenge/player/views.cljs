(ns itchallenge.player.views
  (:require [re-frame.core :as re-frame]
            [itchallenge.subs :as subs]))


(defn audio []
  [:audio])

(defn song-time []
  [:div {:style {:font-weight   400
                 :font-size     42
                 :margin-bottom 20}}
   "00:34"])

(defn song-title []
  [:div {:style {:font-size   14
                 :line-height "22px"}}
   "Mazurka in D major, B. 71"])

(defn author []
  [:div {:style {:font-size   13
                 :font-weight 100}}
   "Frédéric Chopin"])



(defn song-info []
  [:div {:style {:color           :white
                 :flex-direction  :column
                 :align-items     :center
                 :justify-content :center
                 :text-align      :center}}
   [song-time]
   [song-title]
   [author]])


(defn inner-circle []
  [:div {:style {:border-radius   "50%"
                 :border          "1px solid white"
                 :height          250
                 :width           250
                 :display         :flex
                 :flex-direction  :column
                 :align-items     :center
                 :justify-content :center}}
   [song-info]])

(defn outer-circle []
  [:div {:style {:border-radius   "50%"
                 :border          "1px solid white"
                 :height          350
                 :width           350
                 :position        :absolute
                 :top             0
                 :left            0
                 :display         :flex
                 :align-items     :center
                 :justify-content :center}}
   [inner-circle]])

(defn player []
  [:div {:style {:position        :relative
                 :height          350
                 :width           350
                 :display         :flex
                 :align-items     :center
                 :justify-content :center}}
   [audio]
   [outer-circle]])


