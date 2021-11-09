Feature: Ticket booking
  User can book ticket
  Background:
    Given User already on tokopedia ticket web page
  Scenario Outline: Choosing departure station
    When '<actor>' click on departure station box
    Then s?he can see the origin station option
    And s?he select '<station>' as departure station
    Then s?he should see that her?his departure station '<expected>' is selected

    Examples:
      | actor   | station                | expected     |
      | Syahrul | Jakarta - Gambir (GMR) | Gambir (GMR) |

  Scenario Outline: Choosing arrival station
    When '<actor>' click on arrival station box
    Then s?he can see the destination station option
    And s?he select '<station>' as arrival station
    Then s?he should see that her?his arrival station '<expected>' is selected

    Examples:
      | actor   | station              | expected    |
      | Syahrul | Malang - Malang (ML) | Malang (ML) |