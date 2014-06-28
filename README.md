# rtailhurat

romain personal site using clojure on appengine, see http://flowa.fi/blog/2014/04/25/clojure-gae-howto.html

lein ring uberwar at the root of the project

unzip -d <destination dir> <war path>
  ==> dest dir is named "deploy" here

copy the appengine-web.xml that is in util to WEB-INF in deploy

gae deploy script : ./appcfg.sh update /Users/romaintailhurat/code/rtailhurat/deploy/
  ==> need to be call in <appengine sdk dir>/bin


## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2014 FIXME
