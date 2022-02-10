(ns cursive-test-issue.core-test
  (:require [clojure.test :refer :all]
            [cursive-test-issue.other-test :refer :all]
            [cursive-test-issue.core :refer :all]))

; This test fails and this shows up as expected in the gutter.
(deftest times2-test1
  (is (= 3
         (times2 2))))

; This test fails but there is no visual clue (in this file) that the assertion in
; f-is has failed.
(deftest times2-test2
  (f-is (= 3
           (times2 2))))
