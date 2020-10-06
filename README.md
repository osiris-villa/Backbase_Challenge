

## Execution Strategy
### Pre - requisites
- **IDE** (Preferred Eclipse with Maven, TestNG and Cucumber plugins)
- **Java SDK 1.8**
- **Maven 3.6.3 or newer**
- 
## UI automation setup
### Downloading and setting the project
- Please clone or download the project from [https://github.com/osiris-villa/Backbase_Challenge](https://github.com/osiris-villa/Backbase_Challenge)
- Install project as a new Maven project so we do not have to worry for manage dependencies, Maven takes care for all of this:  File > Import > Maven > Existing Maven Projects

### Executing project

- If everything is set up correctly then we need to open the terminal and navigate to our project folder and then enter: **mvn clean install**

This will run our entire suite of tests and will generate a report for our execution

### Report

-   A series of advance reports in html format can be found in Backbase > target > cucumber-reports > advanced-reports > cucumber-html-reports:
(You will need to refresh you project to be able the updated reports of the execution)

This is an awesome way to visualize all of our execution results, we can even have screenshots if a test fail (we can due that by setting 2 lines of code)

https://www.dropbox.com/s/g9okwif2xj2mm0y/report.jpg?dl=0


### Project Structure
-  The project is using the Page Object Model design pattern. I am creating a class for each of the pages that I'm testing so we can have a beter mantiance of the code.
- I'm using the TestNG library for assertions 
- I also used a BDD approach with Cucumber, this offer better readability on the test cases for people that is not than involved with coding
- Maven is used for managing all the dependencies
- This porject can run on Chrome, FireFox and IE, you just need to change the parameter "browser" in the global.properties file
