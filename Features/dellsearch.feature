Feature: dellsearch 

Scenario Outline: dell search 

Given user visit dell home page
When user type "<dell_laptop>" and click search icon
Then User will be able to redirect to the page


Examples:
| dell_laptop |
| Dell lalitude |