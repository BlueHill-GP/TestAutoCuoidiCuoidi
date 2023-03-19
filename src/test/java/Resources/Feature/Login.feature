Feature: Cuoidi Cuoidi web

#  Login
  Scenario Outline: Login with valid credentials
    Given User navigates to Login page
    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on Login button
    Then The message is displayed
    Examples:
      | email                    | password  |
      | photographer@yopmail.com | 123456q!  |

  Scenario Outline: Login with invalid credentials
    Given User navigates to Login page
    When User enters invalid email address <email>
    And Enters invalid password <password>
    And Clicks on Login button
    Then The message is displayed
    Examples:
      | email               | password  |
      | hanhvan             | Van       |

# Register
  Scenario Outline: Register with mandatory fields
    Given User navigates to Register Account page
    When User enters valid name <name>
    And Enters valid email <email>
    And Enters valid phone_number <phone_number>
    And Enters valid the password <password>
    And Choose the type of user
    And Clicks on SignUp button
    Then The message is displayed
    Examples:
      | name | email                   | phone_number  | password  |
      | HanhMy | myahnhyopmail@gmail.com | 0964261001    | 123456q! |


  Scenario: Register without providing any fields
    Given User navigates to Register Account page
    When User do not enter details into any fields
    And Clicks on SignUp button
    Then The message is displayed

#    Post
  Scenario Outline: Create the post in profile page
    Given User navigates to Login page
    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on Login button
    And Clicks on Profile page
    And User enter the valid content into content box
    And User click to choose the image
    And Click on the Create button
    Then The message is displayed
    Examples:
      | email                    | password  |
      | photographer@yopmail.com | 123456q!  |