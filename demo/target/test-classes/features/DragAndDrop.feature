Feature: DragAndDrop
@RadionButtons
    Scenario: Long Click Action
        When a user tap on views link
        And the user tap on Drag and Drop link
        And the user drag and drop on the textless circle in the corner
        Then the message "Dropped!" should be displayed