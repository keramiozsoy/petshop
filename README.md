# petshop
a blueprint for petshop


# gitignore file
A gitignore file includes java,maven and eclipse gitignore files.

 - https://github.com/github/gitignore/blob/master/Java.gitignore
 - https://github.com/github/gitignore/blob/master/Global/Eclipse.gitignore
 - https://github.com/github/gitignore/blob/master/Maven.gitignore

# code formatter
You should use this code formatter before contribute
 - https://github.com/keramiozsoy/petshop/blob/master/codeFormatter/codeFormatterEclipseKeramiOzsoy.xml



# how can i create this project ?
```
mvn archetype:generate -DgroupId=com.keramiozsoy.petshop -DartifactId=petshop -Dversion=0.0.1-SNAPSHOT -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
---- if you want to use with eclipse after that above command use
mvn eclipse:eclipse
```
