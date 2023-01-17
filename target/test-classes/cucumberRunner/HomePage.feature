
@tag
Feature: HomePage Functionality Test
  I want to use this template for my feature file

  
   @tag1
   Scenario Outline: Verify Book Search Functionality
    Given I launched Odyssey application
    When Searched book with book Name <book Name>
    Then Cost <cost> of the book

    Examples: 
      | book Name       |cost|
      | Best of Friends |Rs. 549|
      
      
      @tag1
   Scenario Outline: Verify Add to Cart Functionality
    Given I launched Odyssey application
    When Add book to cart with book Name <book Name>
    Then Cart count is <count>

    Examples: 
      | book Name       |count|
      | Best of Friends |1|
      
      
       @tag1
   Scenario Outline: Verify account Creation Functionality
    Given I launched Odyssey application
    When Enter account details with FirstName <FirstName> LastName <LastName> Email <Email> and Password <Password>
    Then "This email address is already associated with an account." message is displayed on confirmation page

    Examples: 
      | FirstName | LastName |Email           |Password |
      | ftest1    | ltest2   |test2@gmail.com |Test@124 |
      
      
       @tag1
   Scenario Outline: Verify store Location functionality
    Given I launched Odyssey application
    And scroll the browser down
    When Find store location
    Then Location is <location>

    Examples: 
      | location|
      | Chennai |
      
      
        @tag1
    Scenario: Verify contact us functionality
    Given I launched Odyssey application
    And scroll the browser down
    When Find contact us details
    Then It opens "Between 10am and 6.30pm on weekdays"
    
    
       @tag1
    Scenario: Verify return and refund functionality
    Given I launched Odyssey application
    And scroll the browser down
    When Find return and refund details
    Then It opens for "7 days"
    
      @tag1
    Scenario: Verify term of service feature
    Given I launched Odyssey application
    And scroll the browser down
    When Find term of service details
    Then verify "Terms of Service"
    
    
    
      @tag1
    Scenario: Verify non returnable items functionality
    Given I launched Odyssey application
    And scroll the browser down
    When Find non returnable item details
    Then verify the "non-returnable items:"
    And  verify is "Gift cards" returnable

      
      
      
      