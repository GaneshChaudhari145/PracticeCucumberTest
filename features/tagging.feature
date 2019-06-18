@FunctionalTest
Feature: Timesheet - Data Table Login Feature with multiple tags

@SmokeTest @RegressionTest
Scenario: Timesheet - correct Login Title
Given Open chrome and start Application
When title of Login Page is Timesheet

@RegressionTest
Scenario: Timesheet - incorrect Login Title
Given Open chrome and start Application
When title of Login Page is Mail

@RegressionTest
Scenario: Timesheet - infostretch Login Title
Given Open chrome and start Application
When title of Login Page is Infostretch

@SmokeTest
Scenario: Timesheet - infostretch jira Login Title
Given Open chrome and start Application
When title of Login Page is Infostretch jira

@SmokeTest
Scenario: Timesheet - infostretch nest Login Title
Given Open chrome and start Application
When title of Login Page is Infostretch nest

@SmokeTest @RegressionTest
Scenario: Timesheet - Persistent Login Title
Given Open chrome and start Application
When title of Login Page is Persistent

@SmokeTest @RegressionTest
Scenario: Timesheet - Persistent mail Login Title
Given Open chrome and start Application
When title of Login Page is Persistent mail

