# ClojureDump
Dumping ground for learning Clojure

## Instructions

Download [Leiningen](https://leiningen.org/) batch file (Windows) and put somewhere `%PATH%` accessible.

Then from a command-prompt run:

```
lein self-install
```

Change to directory you want to create the new Clojure project and run..

```
lein new app PROJECT_NAME
```

And finally, to run a project, change to it and run..

```
lein run
```

If we want the nREPL server up..

```
lein repl
```