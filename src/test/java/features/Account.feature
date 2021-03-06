Feature: Application Login
  #Multiple scenario

  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    #Same thing
    When User login into application with "jin" and "1234"
    #Common code with diff data
    #Oh, it's dynamic
    Then Home page is populated
    And Cards displayed are "true"

  @PortalTest
  Scenario: Home page default login when blocked
    Given User is on NetBanking landing page
    #Same thing
    When User login into application with "john" and "4321"
    #Common code with diff data
    #Oh, it's dynamic
    #".." two places for regular expressions
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default login when blocked
    Given User is on NetBanking landing page
    #Same thing
    When User login into application with "john" and "4321"
    #Common code with diff data
    #Oh, it's dynamic
    #".." two places for regular expressions
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default login with many parameters
    Given User is on NetBanking landing page
    #Same thing
    When User sign up with following details
      | jenny | absd | john@abcd.ru | Australia | 124234 |
    #Many parameters in one step
    Then Home page is populated
    And Cards displayed are "true"

  # Want multiple times repeat with diff dataset
  @PortalTest
  Scenario Outline: Home page default login with many parameters
    Given User is on NetBanking landing page
    When User login into with <username> and <password>
    #Many parameters and many cycles
    #10 usernames and 10 passwords
    Then Home page is populated
    And Cards displayed are "true"
    Examples:
      | username | password |
      | user1    |   pass1  |
      | user2    |   pass2  |
      | user3    |   pass3  |

