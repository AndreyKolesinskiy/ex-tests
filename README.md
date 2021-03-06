## UI tests for https://exadel.com
### Used technologies and tools:
| GitHub | IntelliJ IDEA | Java | Gradle | Junit5 | Selenide |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/GitHub.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/IDEA.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/JAVA.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/Gradle.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/Junit5.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/Selenide.svg" width="40" height="40"> |

| Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:--------:|:-------------:|:---------:|:-------:|:--------:|
| <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/Jenkins.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/64fc9f701b325cfc520ee86240394ce8d72dd195/images/Selenoid.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/f0701c966586c26ed7491d721ff90d9b650ce1b6/images/Allure%20Report.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/f0701c966586c26ed7491d721ff90d9b650ce1b6/images/Allure%20TestOps.svg" width="40" height="40"> | <img src="https://raw.githubusercontent.com/AndreyKolesinskiy/repo-for-data/f0701c966586c26ed7491d721ff90d9b650ce1b6/images/Telegram.svg" width="40" height="40"> |

### :gear: Tests can be started with different parameters:
* browser (default chrome)
* browserVersion (default 91.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

### :gear: Build can be started with selected parameters in Jenkins ([link to Jenkins](https://jenkins.autotests.cloud/job/AndreiK_UItests_ex/)):
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Jenkins.png?raw=true" >

### :bar_chart: Results of test run in Allure report:
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Allure%20overview.png?raw=true" >

### :clipboard: Allure report with steps and attachments:
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Allure%20with%20steps.png?raw=true" >

### :bell: Notifications are sent to Telegram group:
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Testrun%20notifications%20in%20Telegram.png?raw=true" >

### :chart_with_upwards_trend: Dashboard in Allure TestOps ([link to TestOps](https://allure.autotests.cloud/project/307/dashboards)):
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Dashboard.png?raw=true" >

### :file_cabinet: Test cases in Allure TestOps:
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Test%20cases%20in%20TestOps.png?raw=true" >

### :gear: Test cases and results of launches are added to Jira ([link to Jira](https://jira.autotests.cloud/browse/HOMEWORK-267)):
<img src="https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/Jira.png?raw=true" >

### :movie_camera: Video of test execution in Selenoid:
![alt text](https://github.com/AndreyKolesinskiy/repo-for-data/blob/master/images/testVideo.gif?raw=true "Tests execution recorded")
### To run tests locally:
```bash
gradle clean test
```
### To create Allure report:
```bash
allure serve build/allure-results
```