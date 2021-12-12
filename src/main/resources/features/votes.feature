# Initially I have 2 votes
# I will create one more vote
# SO I have 3 votes
# Check whether I have 3 votes.


Feature: List votes
  Background:
    Given x-api-key is already acquired.

  @votes
  Scenario: Creating votes and Listing for all votes
    When I check number of votes for this "sub_id"
    Then I see "numbers"
    When I will create one more vote
    Then I have numbers plus one votes for this "sub_id"
