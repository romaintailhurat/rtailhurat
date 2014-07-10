#!/bin/bash
lein ring uberwar rtailhurat.war
unzip -d /deploy /target/rtailhurat.war
cp util/appengine-web.xml deploy/WEB-INF/
/Users/romaintailhurat/code/appengine-java-sdk-1.9.5/bin/appcfg.sh update /Users/romaintailhurat/code/rtailhurat/deploy/
