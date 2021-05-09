Feature: Cancelling a booking
  In order to cancel the booking
  As a registered user
  The user have to Sign In with valid Credentials and able to cancel the booking

  Background:
    Given The user navigates to "https://ebt3-evidence.janeapp.com/"
    And The user is successfully logged In and on account page


  Scenario: Cancelling a booked appointment
    Given The user clicks on Upcoming Appointments
    When The user sees a booked appointment for 7:05PM on NOvember 11,2020 and want to cancel it
    And clicks on the cancel button

    Then The user should get a message saying "Sorry, this appointment is no longer cancellable online. Please call to cancel."
