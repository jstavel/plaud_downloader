(ns plaud-downloader.plaud-downloader-test
  (:require [clojure.test :refer [deftest is testing]]
            [plaud-downloader.plaud-downloader :as sut])) ; system under test

(deftest login-and-check-test
  (testing "Test the login-and-check capability - workflow login-and-check"
    (let [input {:port 9222}
          output (sut/login-and-check input)]
      (is (string? (:title output)))
      (is (not (empty? (:title output)))))))
