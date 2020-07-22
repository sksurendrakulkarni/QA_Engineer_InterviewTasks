# Web testing project

## Prerequisites:  

1) First - install JDK for your OS  
2) Create JAVA_Home variable: `https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html`
3) Add to 'Path' environmental variable the path to the 'bin' folder of JDK, for example: `C:\Program Files\Java\jdk-12.0.1\bin`  
4) Install Maven:

* Download maven BIN archive
* Extract downloaded archive to system folder like: C:\Program Files
* Set up M2_HOME environment variable
* Set up additional link to Path variable with path to 'bin' of Maven folder `https://docs.wso2.com/display/IS323/Installing+Apache+Maven+on+Windows`  
5) Install Git  
6) Add TestNG as plugin into IDE (it can be already added by default)  
7) Install Selenium WebDriver for Java  
8) Install Java IDE (IntelliJ IDEA / Eclipse)  
9) Download browser driver(s) (located in the drivers folder)

## Software:
   
**Java:** java.version: '12'  
**Browser:**  
browserName: chrome, browserVersion: 84.0.4147.89  
browserName: firefox, browserVersion: 78.0.2
IDE: IntelliJ IDEA

## Hardware:
### Minimal Requirements
**OS:** Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 10  
**Processor:** Intel Core 2 Quad CPU Q6600 @ 2.40GHz (4 CPUs) / AMD Phenom 9850 Quad-Core Processor (4 CPUs) @ 2.5GHz  
**Memory:** 4GB  
**Video Card:** NVIDIA 9800 GT 1GB / AMD HD 4870 1GB

## How to run tests
1. Clone git repository to the local machine
2. Open it with Java IDE
3. Agree to download all maven dependencies it is offering in order to see this project structure as maven project
4. Set Java project SDK to 12 in project structure settings and language level to `12 - No new language features`
5. Right click on [testng.xml](https://github.com/Marselje/QA_Engineer_InterviewTasks/blob/master/web_testing/src/test/java/tests/testng.xml) file (located at `...\web_testing\src\test\java\tests\testng.xml`) => Run
6. All tests should run one after another
