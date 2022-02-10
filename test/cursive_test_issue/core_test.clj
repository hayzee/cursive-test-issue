(ns cursive-test-issue.core-test
  (:require [clojure.test :refer :all]
            [cursive-test-issue.other-test :refer :all]
            [cursive-test-issue.core :refer :all]))

(deftest times2-test
  (is (= 4
         (times2 2)))
  (is-some-other-thing? false))
