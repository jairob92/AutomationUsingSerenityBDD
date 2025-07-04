Feature: Register User

  Scenario: Register a new user successfully
    Given Client launch the browser and visit the web application
    Then Client verifies that home page is visible succesfully
    When Client clicks on Login button
    Then Client verifies that Login page is visible
    Then Client enter name email address and do click on Signup button
      | name  |      email       |
      | John  | test001@mail.com |
