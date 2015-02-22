#!/bin/sh
mkdir -p build/classes
javac -d build/classes src/main/java/slow/internal/Main.java src/main/java/slow/Accumulator.java src/main/java/slow/Worker.java src/main/java/slow/Cache.java src/main/java/slow/internal/Source.java
java -cp build/classes slow.internal.Main