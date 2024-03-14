Feature: DateAndTime
@RadionButtons
Scenario: Check DateAndTime

When a user tap on views link
And the user taps on the date and widgets link
And the user taps on the dialog link
And the user change the date
Then the user changed date should visible 
And click Ok or Cancel
And the user taps change time Button
And the user changes the time
Then the user taps on Ok button or Cancel
And the user taps on spinner time button
And the user sets the spinner time
And the user taps on Ok button
Then the spinner timer should be updated