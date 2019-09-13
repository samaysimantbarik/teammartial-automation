@Smoke
Feature: Validate the Smoke Tests

Scenario: Validate Edit Profile Functionality
	Given I have logged in to the teammartial portal
	And I am on the homepage
	When I edit my profile
	Then My details must get updated 