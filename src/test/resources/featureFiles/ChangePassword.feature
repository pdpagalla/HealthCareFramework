Feature: Change Password
  In order Change Password
  As a registered user after logging In
  The user have to Sign In with valid Credentials and then Change the Password

  Background:
    Given The user navigates to "https://ebt3-evidence.janeapp.com/"
    When The user clicks on SignIn button
    Then The user should be navigated to Sign In Page

  Scenario: Signing In and changing password
    Given The user is successfully logged In and on account page
    When The user clicks on Username/Password
    And The user enters newPassword confirmPassword
      |newPassword   | confirmPassword |
      | Chetans79    |    Chetans79    |
    And The user clicks on Save Username/Password button
    Then The user has successfully changed the password and get a text "You have successfully changed the password"


