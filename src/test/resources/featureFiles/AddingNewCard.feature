Feature: Adding a new card to the account
  In order Add a new card
  As a registered user
  The user have to go on to the Add a new cards page and enter valid card details

  Background:
    Given The user navigates to "https://ebt3-evidence.janeapp.com/"
    When The user clicks on SignIn button
    Then The user should be navigated to Sign In Page

  Scenario: Adding a new card
    Given The user is successfully logged In and on account page
    When The user clicks on Credit Cad on Files and then clicks on Add new Cards tab
    Then The user should be navigated to Add new cards page

    When The user enters cardNo ExpDate CVC streetAddress city state postalCode selectCountry
      |cardNo             |ExpDate| CVC |streetAddress|city| state | postalCode |selectCountry|
      |0000000000000000   | 0623  | 123 |19, London   |Lon |  Har  |  LK12HG    |     Con     |

    And The user clicks on Save credit card BUtton
    Then The user should be able to save the card
