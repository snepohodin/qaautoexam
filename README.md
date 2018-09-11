Java/WebDriver sample project 

**Environment setup:**

 1. Download and install the latest versionIntelijIdea 
 2. Download and install the latest JDK from Oracle website
 3. Download and install the latest version of FireFox browser
 4. Download and install the latest version of [geckodriver](https://github.com/mozilla/geckodriver/releases/) for your system
 5. Unzip downloaded [geckodriver](https://github.com/mozilla/geckodriver/releases/) to your _system32_ folder
 6. Download and install the latest version of Chrome driver  [chromedriver](http://chromedriver.chromium.org/downloads) for your system
 7. Unzip downloaded [chromedriver](http://chromedriver.chromium.org/downloads) to your _system32_ folder

**Project description:**

page package - folder with pageObjects for each page where BasePage is a parent class for Page classes.
test package - folder with test classes where BaseTest is a parent class for Test classes.

**ToDo list if you want to run test from console:**

Write next command in Terminal from intelijIdea:
D:\apache-maven-3.5.4\bin\mvn clean install

If you will have an error please do next:
Go to PC > properties > advanced system settings -> Add properties -> and create new variable here:

Variable name: JAVA_HOME

Variable value: C:\Program Files\Java\jdk-10.0.1
