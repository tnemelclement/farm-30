#!/bin/bash

javac -d build src/ferme/*.java
java -cp build ferme.AppMain