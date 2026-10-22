(ns plaud-downloader.plaud-downloader
  (:require [clj-chrome-devtools.core :as cdt]))

(defn login-and-check
  "Connects to the local browser via the CDP protocol, navigates to www.plaud.ai,
  and returns a map with the page title."
  [{:keys [port]}]
  (try
    (let [url (str "http://localhost:" port)
          session (cdt/connect url)]
      (cdt/navigate session "http://www.plaud.ai")
      (Thread/sleep 2000) ;; wait for 2 seconds to allow the page to load
      (let [title (cdt/get-title session)]
        {:title title}))
    (catch Exception e
      {:title "Error retrieving title"})))
