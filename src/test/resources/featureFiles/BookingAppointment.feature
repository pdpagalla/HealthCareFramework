Feature: Booking an Appointment
  In order Book an Appointment
  As a registered user
  The user have to Sign In with valid Credentials and then book an appointment

  Background:
    Given a patient is logged in and is in home page
    And The user clicks on Book an Appointment tab

  @booking
  Scenario Outline: Booking an appointment through Book By selecting a session
    When patient selects "<Session>" session
    Then he should be navigated to "Intake Coordinator Sessions" page
    When patient select any available slot and book that appointment
    Then the booking should be successfull

    Examples:

      | Session                     |
      | Intake phone call           |
      | I just have some questions! |



#
#  Scenario: Booking an appointment through Availability by Month button
#    When The user clicks on availability by month button
#    Then The user should be navigated to availability by months Page displaying calender with availability
#    When The user clicks on the available Dr's Name
#    Then The user should get navigated to the availability calender of the doctors page
#    When The user selects the available date
#    Then The user should get a dialogue box saying "Select a visit time:"
#    When The user clicks on the available time
#    Then The user should get a message saying "Thanks for Booking"

