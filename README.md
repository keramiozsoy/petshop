# petshop
a blueprint for petshop

# requirement environments
- Apache Maven    3.0.5
- Java JDK        1.7.80
- Eclipse (Kepler) or Netbeans
# it has used 
- Apache Derby (Embedded DB)
- Service Layer Design Pattern (http://java-design-patterns.com/patterns/service-layer/ Thank you :) )

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
