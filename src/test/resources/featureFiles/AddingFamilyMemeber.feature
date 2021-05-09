Feature: Adding a new Member
  In order add a new member
  As a registered user
  The user have to Sign In with valid Credentials and then add a member

  Background:
    Given The user navigates to "https://ebt3-evidence.janeapp.com/"
    And The user is successfully logged In and on account page


    Scenario: Adding a new member as a registered user
      Given The user clicks on Family Members tab
      And The user clicks on Add family member tab
      Then The user should be navigated to Add new members Page
      When The user enters selectsRelation firstName PrefName lastName
      |selectRelation|firstName|PrefName|lastName|
      |Child         |Kav      |Kav     |Sharma  |
      And The user clicks on Save button
      Then The user should be able to successfully add the member






