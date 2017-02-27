(ns with-test-test.core
  (:require [clojure.test :refer :all]))

(with-test
  (defn my-add [x y] (+ x y))
  (testing "adding two zeros"
    (is (= 0 (my-add 0 0))))
  (testing "adding one and zero"
    (is (= 1 (my-add 0 1)))))
