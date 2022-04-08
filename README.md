# Custom Maven Plugin
> Simple Showing Current Date Maven Plugin

[![Java Version](https://img.shields.io/badge/java-v8-red)](https://www.java.com/tr/)

## Installation

For Windows you can clone the repo:
```
https://github.com/172-Norma-Java-Spring-Bootcamp/mb-unverdi-first-homework.git```
Then you can open via IntelliJ IDEA:
```
code .
```
Go to terminal
Run 'mvn clean' command.
Goto pom.xml build->plugins section and Add this code lines.
            <plugin>
                <groupId>org.patika</groupId>
                <artifactId>bootcamp-mbu-plugin</artifactId>
                <version>1.0-SNAPSHOT</version>
                <executions>
                    <execution>
                        <phase>install</phase>
                        <goals>
                            <goal>
                                getTime
                            </goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
Run 'mvn install' command.
If you run into a problem, you can let me know here or on my Linked.in account. - https://www.linkedin.com/in/batuhanunverdi/