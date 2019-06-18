Feature: Timesheet - AQM Technologies Ltd Login Feature



#Withhout Examples Keyword
#Scenario: Timesheet - AQM Technologies Ltd Login Test Scenario
#
#   Given Open chrome and start Application
#    When title of Login Page is Timesheet
#    Then user enters valid "abc" & "abc"
#    And user clicks on Login Button

#Withh Examples Keyword
Scenario Outline:: Timesheet - AQM Technologies Ltd Login Test Scenario

   Given Open chrome and start Application
    When title of Login Page is Timesheet
    Then user enters valid "<username>" & "<password>"
    And user clicks on Login Button
    
Examples:
		|username|password|
		|abc	 |abc	  |
		|acb	 |acb	  |
