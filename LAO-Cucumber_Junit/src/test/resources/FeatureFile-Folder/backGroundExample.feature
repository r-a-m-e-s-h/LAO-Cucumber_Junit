@BackGround-Practise
Feature: To Test BackGround in this Feature

  Background: student completed school education
    Given student completed high-school education
    Given student completed Higher secondary education

  Scenario: To Study Medical
    Given student appliad for medical course
    When student cleared the enterance exam
    Then student is eligible for entering medical college

  Scenario: To study Engineering
    Given student applied for engineering
    When student has the  cutoff mark
    Then student is eligible for entering engineering college
