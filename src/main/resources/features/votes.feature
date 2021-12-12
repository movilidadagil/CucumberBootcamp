# Initially I have 2 votes
# I will create one more vote
# SO I have 3 votes
# Check whether I have 3 votes.


Feature: List votes
  Background:
    Given x-api-key and baseURI are already acquired.

  @votes
  Scenario: Creating votes and Listing for all votes
    When I check number of votes for this "my-user-1234"
    Then I see numbers
    When I will create one more vote for this "my-user-1234"
    Then I have numbers plus one votes for this "my-user-1234"
