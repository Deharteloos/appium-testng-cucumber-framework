Feature: Connection
  Scenario Outline: Logging in with wrong credentials
    Given I am on the home page
    And I click on the user account button
    When I click on the connection button
    And I type in the email field my "<email>"
    And I type in the password field my "<password>"
    And I click on the button "Me connecter"
    Then A dialog box with the message "<message>" is displayed
    Examples:
      | email                 | password   | message                                                                 |
      | calvinbijog@gmail.com | C@l20bijog | Votre courriel ou votre mot de passe est incorrect. Veuillez réessayer. |