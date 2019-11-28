# zbri = ZIO Bloop Run Issue

Reproduces ZIO issue with bloop run.

ZIO works well when started from sbt:
```
$ echo anything | sbt run 
[info] Loading settings for project global-plugins from updates.sbt ...
[info] Loading global plugins from /home/ruslan/.sbt/1.0/plugins
[info] Loading settings for project zbri-build from metals.sbt ...
[info] Loading project definition from /home/ruslan/workshop/zbri/project
[info] Loading settings for project zbri from build.sbt ...
[info] Set current project to zbri (in build file:/home/ruslan/workshop/zbri/)
[info] running zbri.Main 
Enter anything:
You entered: anything
[success] Total time: 1 s, completed Nov 28, 2019, 5:16:35 PM
[warn] Thread[Thread-2,5,run-main-group-0] loading zio/App$$anon$1.class after test or run has completed. This is a likely resource leak
```

ZIO hangs when started from bloop:
```
$ ~/.bloop/bloop about
bloop v1.3.5

Using Scala v2.12.8 and Zinc v1.3.0-M4+26-045d2c8c
Running on Java JDK v11.0.5 (/usr/lib/jvm/java-11-openjdk-amd64)
  -> Supports debugging user code, Java Debug Interface (JDI) is available.
Maintained by the Scala Center (Martin Duhem, Jorge Vicente Cantero)

$ echo anything | ~/.bloop/bloop run zbri
Enter anything:
```