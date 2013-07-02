(ns clangband.core-test
  (:require [midje.sweet :refer :all]
            [clangband.core :as core]))

(fact "This app uses midje for testing"
  (+ 2 2) => 4)
