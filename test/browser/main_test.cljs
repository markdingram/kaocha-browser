(ns browser.main-test
  (:require [cljs.test :refer-macros [deftest is]]
            ;[kaocha.cljs.websocket]
            [browser.main :as m]))

(deftest test-sum
  (is (= 2 (m/sum))))
