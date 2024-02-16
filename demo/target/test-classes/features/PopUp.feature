Feature: PopUpScreen

    Scenario: Handle PopUp Screen Action
        When a user tap on preferences link
        And the user tap on preferences dependancies link
        And the user check the checkbox to allow the wifiSettings
        And the user taps on wifiSettings
        And the user enters the wifiSettings name as "Amina"
        And the user clicks on Ok button
        Then the wifiSettings should be updated.
