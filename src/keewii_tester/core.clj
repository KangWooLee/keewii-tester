(ns keewii-tester.core
  (:use [seesaw.core :only (show!)]
        [keewii-tester.gui_rendering :only (make-frame)])
  (:gen-class))

(defn -main [& args]
  (show! make-frame))

(-main)


