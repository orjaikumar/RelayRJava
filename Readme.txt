Assumptions:
Your machine has a maven and java installed. 

Steps:
1. Download the project repo to you local directory
2. Traverse to project location containing "pom.xml"
3. From terminal run "mvn clean test-compile install"

Sample compile and test execution from my local machine. 
C:\Users\jravikumar\eclipse-workspace\RelayR>mvn clean test-compile install
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------------------< RelayR:ReleyR >----------------------------
[INFO] Building ReleyR 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ ReleyR ---
[INFO] Deleting C:\Users\jravikumar\eclipse-workspace\RelayR\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ ReleyR ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ ReleyR ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 1 source file to C:\Users\jravikumar\eclipse-workspace\RelayR\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ ReleyR ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ ReleyR ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 1 source file to C:\Users\jravikumar\eclipse-workspace\RelayR\target\test-classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ ReleyR ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ ReleyR ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ ReleyR ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ ReleyR ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ ReleyR ---
[INFO] Surefire report directory: C:\Users\jravikumar\eclipse-workspace\RelayR\target\surefire-reports
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom (2.4 kB at 1.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom (2.3 kB at 4.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar (37 kB at 32 kB/s)

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running FinderTest
[conclusion]
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.182 sec

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ ReleyR ---
[INFO] Building jar: C:\Users\jravikumar\eclipse-workspace\RelayR\target\ReleyR-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ ReleyR ---
[INFO] Installing C:\Users\jravikumar\eclipse-workspace\RelayR\target\ReleyR-0.0.1-SNAPSHOT.jar to C:\Users\jravikumar\.m2\repository\RelayR\ReleyR\0.0.1-SNAPSHOT\ReleyR-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\jravikumar\eclipse-workspace\RelayR\pom.xml to C:\Users\jravikumar\.m2\repository\RelayR\ReleyR\0.0.1-SNAPSHOT\ReleyR-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.392 s
[INFO] Finished at: 2018-12-17T19:33:07+05:30
[INFO] ------------------------------------------------------------------------
