Feature: VirginGames GBP API Test

  Scenario: Verify currency us GBP
    Given User is on Virgin Games API
    When User sends a request to get all GBP data
    Then Verify currency is GBP