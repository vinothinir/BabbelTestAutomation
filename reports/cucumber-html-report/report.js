$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Verification",
  "description": "",
  "id": "homepage-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Launching HomePage",
  "description": "",
  "id": "homepage-verification;launching-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I can see the option for login and register",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "I verify the logo Babbel",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageSteps.homePage()"
});
formatter.result({
  "duration": 14591195257,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.homePageVerification()"
});
formatter.result({
  "duration": 116962999,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.homeLogoVerification()"
});
formatter.result({
  "duration": 1208110669,
  "status": "passed"
});
formatter.uri("loginPage.feature");
formatter.feature({
  "line": 1,
  "name": "LoginPage Verification",
  "description": "",
  "id": "loginpage-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Page",
  "description": "",
  "id": "loginpage-verification;login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the Babbel login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I verify the login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "I enter invalid credentials to login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Verify the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPageSteps.homePage()"
});
formatter.result({
  "duration": 10903086134,
  "status": "passed"
});
formatter.match({
  "location": "loginPageSteps.loginScreenVerification()"
});
formatter.result({
  "duration": 206833669,
  "status": "passed"
});
formatter.match({
  "location": "loginPageSteps.loginCheck()"
});
formatter.result({
  "duration": 948831354,
  "status": "passed"
});
formatter.match({
  "location": "loginPageSteps.loginFailedVerification()"
});
formatter.result({
  "duration": 1216652938,
  "status": "passed"
});
});