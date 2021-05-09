Feature: Registration and Login Successfully
  In order to Register and then Login
  As a new user
  User have to enter all the new details on the registration page and then Login

  Background: The user navigates to Home Page and then goes on Sign In Page
    Given The user navigates to "https://ebt3-evidence.janeapp.com/"
    When The user clicks on SignIn button
    Then The user should be navigated to Sign In Page

    Scenario: Registering as a new user
      When The user enters a wrong username, Email Adress or Phone Number "testing@gmail.com"
      Then The user should be moved to next page saying "We couldn't locate your profile."
      When The user clicks on Create an Account button
      Then The user should be navigated to Registration Page confirming text "Let us know your contact information"
      When The user enters firstName prefferedName lastName email dropDownCountry mobilePhone homePhone
    |firstName | prefferedName | lastName |  email              |dropDownCountry| mobilePhone | homePhone |
    | Chetan   |    Chetan     |  Sharma  |chetanss79@gmail.com |   country     |  7446856274 |  20856856 |
      And The user clicks on Continue button
      Then The user should be navigated to enter registrationPasswords page confirmingText "Password"
      When The user enters password conformPassword
        |password   | confirmPassword |
        | Chetans79 |    Chetans79    |
      And The user clicks on Next button
      Then The user should be successfully Registered Confirming Text "You are Ready to go"


    Scenario Outline: As a registered user trying to sign in Successfully
      When The user enters a usernameOrEmailAddress "<value>" or PhoneNumber "<value>"
      Then The user should be moved to passwords page
      When The user enters password as "<password>"
      And  The user clicks on Sign in button
      Then The user should be successfully Signed In confirmingPageTitle "My Account"
      Examples:
        | value                    |     password    |
        | chetanss79@gmail.com     |    Chetans79    |
        | 7446856274               |    Chetans79    |

