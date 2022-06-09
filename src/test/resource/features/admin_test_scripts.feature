@admin_flow
Feature: UI-HRM admin scripts

  @admin_flow_test01
  Scenario Outline: create a new admin with company info
    Given user logins to orange hrm application
    When user navigates to company info from dashboard
    And user selects general
    And user edit the company info
    And user enters company name : "<company name>", tax id: "<tax id>",phone:"<phone>",naics:"<naics>",fax:"<fax>"
    And user select the country: "<country>"
    And user enters addressone :"<address1>", city:"<city>", zipcode:"<zipcode>",addresstwo:"<address2>",state:"<state>"
    And  user save the company info




    Examples:
      | company name | tax id | phone       | naics | fax   | country | address1          | city | zipcode | address2 | state     |
      | Wipro        | 12541  | 58799988558 | 1444  | 00000 | India   | Addagutta sec-bad | HYD  | 500026  | sec-bad  | Telangana |





