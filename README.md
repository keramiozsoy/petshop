[![Build Status](https://travis-ci.org/keramiozsoy/petshop.svg?branch=develop)](https://travis-ci.org/keramiozsoy/petshop)
[![codecov](https://codecov.io/gh/keramiozsoy/petshop/branch/develop/graph/badge.svg)](https://codecov.io/gh/keramiozsoy/petshop)
[![GitHub issues](https://img.shields.io/github/issues/keramiozsoy/petshop.svg)](https://github.com/keramiozsoy/petshop/issues)
[![GitHub license](https://img.shields.io/github/license/keramiozsoy/petshop.svg)](https://github.com/keramiozsoy/petshop/blob/develop/LICENSE)
![Version 0.0.5](https://img.shields.io/badge/version-0.0.5-yellow.svg)

[![Twitter](https://img.shields.io/twitter/url/https/github.com/keramiozsoy/petshop.svg?style=social)](https://twitter.com/intent/tweet?text=Wooow:&url=https%3A%2F%2Fgithub.com%2Fkeramiozsoy%2Fpetshop)





# petshop
a blueprint for petshop

https://github-petshop.herokuapp.com

# requirement environments
- Apache Maven    3.0.5
- Java JDK        1.7.80 or above :blush:
- Eclipse (Kepler) or Netbeans :camel:
# it has used 
- Apache Derby (Embedded DB :floppy_disk: https://db.apache.org/derby)
- Service Layer Design Pattern ( Thank you :sunglasses: http://java-design-patterns.com/patterns/service-layer  )
- Semantic Versioning   ( :ghost: https://semver.org)
- Flyway   ( :microscope: https://flywaydb.org )
- Travis-CI ( :umbrella: https://travis-ci.org - free-edition )
- Codecov  (:thought_balloon:  https://codecov.io)

# Development Setup
## how to begin everything this project ?
```
mvn archetype:generate -DgroupId=com.keramiozsoy.petshop -DartifactId=petshop -Dversion=0.0.1-SNAPSHOT -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

## Linux
```
git clone https://github.com/keramiozsoy/petshop.git
cd petshop/petshop
ls -l
src pom.xml
```

## if you get errors
```
mvn clean
mvn package
```
## if you want to use eclipse
#### how to open this project with eclipse ?
```
Eclipse  >  File  > Import...  > General > Existing Project into Workspace  >  Browser > Select petshop project  > Finish
```
## gitignore files
A gitignore file includes java,maven and eclipse gitignore files.

 - https://github.com/github/gitignore/blob/master/Java.gitignore
 - https://github.com/github/gitignore/blob/master/Global/Eclipse.gitignore
 - https://github.com/github/gitignore/blob/master/Maven.gitignore

## code formatter
#### You should use this code formatter before contributing.
 - https://github.com/keramiozsoy/petshop/blob/master/codeFormatter/codeFormatterEclipseKeramiOzsoy.xml
