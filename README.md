Kaocha Browser Test
===================

`npm install && clojure -m kaocha.runner :node-cljs` works as expected so the basic setup appears 
correct.

`clojure -m kaocha.runner :browser-cljs` works sporadically:

[browser-working.txt](./browser-working.txt)

However more often it fails with output [browser-failing.txt](./browser-failing.txt)

Rerunning without closing all Chromium windows often succeeds.

Browser is: Chromium Version 78.0.3904.108 (Developer Build) Fedora Project (64-bit)


