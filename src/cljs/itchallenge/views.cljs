(ns itchallenge.views
  (:require [re-frame.core :as re-frame]
            [itchallenge.subs :as subs]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name]))
