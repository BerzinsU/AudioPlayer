(ns itchallenge.player.views
  (:require [re-frame.core :as re-frame]
            [itchallenge.subs :as subs]))


(defn audio []
  [:audio])

(defn song-time []
  [:div {:style {:font-weight   400
                 :font-size     48
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


(defn playlist-btn []
  [:object {:type  "image/svg+xml"
            :data  "icons/playlist.svg"
            :class "icon"}])

(defn play-pause-btn []
  [:object {:type  "image/svg+xml"
            :data  "icons/playpause.svg"
            :class "icon"}])

(defn next-btn []
  [:object {:type  "image/svg+xml"
            :data  "icons/next.svg"
            :class "icon"}])

(defn prev-btn []
  [:object {:type  "image/svg+xml"
            :data  "icons/prev.svg"
            :class "icon"}])

(defn inner-circle []
  [:div {:style {:border-radius   "50%"
                 :border          "1px solid white"
                 :height          290
                 :width           290
                 :display         :flex
                 :flex-direction  :column
                 :align-items     :center
                 :justify-content :center
                 :margin          "15px 10px"}}
   [song-info]])

(defn outer-circle []
  [:div {:style {:border-radius   "50%"
                 :border          "1px solid white"
                 :height          400
                 :width           400
                 :position        :absolute
                 :top             0
                 :left            0
                 :display         :flex
                 :flex-direction  :column
                 :align-items     :center
                 :justify-content :center}}
   [playlist-btn]
   [:div {:style {:display :flex}}
    [prev-btn]
    [inner-circle]
    [next-btn]]
   [play-pause-btn]])

(defn player []
  [:div {:style {:position        :relative
                 :height          350
                 :width           350
                 :display         :flex
                 :align-items     :center
                 :justify-content :center}}
   [audio]
   [outer-circle]])


