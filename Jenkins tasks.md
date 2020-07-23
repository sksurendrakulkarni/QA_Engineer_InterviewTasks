**Jenkins tasks**  

**Steps**:  
1. Download and Install Jenkins: https://www.jenkins.io/download/  
2. Make sure Jenkins is installed:  
-Open Jenkins location (for me it is `C:\Program Files (x86)\Jenkins`)  
-Open Jenkins folder from the command prompt (`cd C:\Program Files (x86)\Jenkins`) and tun the following command: `jenkins version` (for me it is `WinSW 2.3.0.0`).  
3. Run Jenkins in your browser and sign up with new credentials  
4. Creaete new Jenkins slave node (Jenkins -> Nodes -> New Node) step by step:  
-Give a name and set as Permanent Agent  
-Give it a Name
-In Launch method select `Launch agent by connecting it to the master`  
-Underneath in 'Run service as' field make sure `Use Local System User` specified  
-Save node  
5. Create new Jenkins job (Jenkins -> New Item) step by step:  
-Give it a name and select `Freestyle project`  
-Check `Restrict where this project can be run` checkbox and in `Label Expression` specify name of the Jenkins slave node created in the previous step  
-In Source Code Management select '`Git` radio-button and specify valid repository URL in order to connect to it's tests: `https://github.com/Marselje/QA_Engineer_InterviewTasks`  
-In Build Triggers check `Build periodically` and write cron expression in `Schedule` field = `0 0 * * *` in order to run test every midnight  
-In Post-build Actions add `Publish TestNG Results` option  
-Also may add `Publish Selenium Html Report`
-Save node  
6. Open Jenkins -> Manage Jenkins -> Global Tool Configuration and add git to Global Tool Configuration, specify name and  path to git executable, for me it is: `C:\Program Files\Git\cmd\git.exe`  
7. Also in Global Tool add maven installation:  
-Make sure Maven is installed on your local PC by the command in the command line: mvn -version, for me it gives the version of maven as 3.6.3  
-Provide Maven Name and MAVEN_HOME (for me it is `C:\Program Files (x86)\apache-maven-3.6.3`) to required fields.  
-Save changes  
8. Go to created in p.5 Jenkins job, Build section, and click on `Add build step` drop-down  
-Select `Invoke top-level Maven targets`  
-Select actual Maven Version  
-Save  changes
9. Open Jenkins folder from the command prompt (`cd C:\Program Files (x86)\Jenkins`) and run the sollowing command:  
-`jenkins status`: to check whether or not it is running; if no, run the command `jenkins start`  
-In browser open Jenkins node created in p.4 ((Jenkins -> Nodes -> `NodeForAutomation`) and run the proposed command in the command line (`java -jar agent.jar -jnlpUrl http://localhost:8081/computer/NodeForAutomation/slave-agent.jnlp -secret b53064bd9c4a0b10418843d79c4af8ff3ae93e85c3e5e6d4c86f5dd467c19cbb -workDir ""`)  
-Verify that the last record of the output is `INFO: Connected`  
-Reload page with opened `NodeForAutomation` node details => Status became `Agent is connected.`  
10. Go to job created in p.5 (`AutomatedTests job`) and click on `Build now`  
39. Open running build and see Console Output. After build is completed generated test results reports can be seen  