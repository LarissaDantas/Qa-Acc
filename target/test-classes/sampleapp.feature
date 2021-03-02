
  Feature: SampleApp

    Scenario Outline: : Vehicle Insurance Application
      Given I make a vehicle insurance request
      And I fill out the Insert Vehicle Data form <kw>, <ListPrice>, <AnnualMileage>
      And I fill out the Enter Insurance Data form <FirstName>, <LastName>, <DateofBirth>, <Country>, <ZipCode>
      And I fill out the Enter Product Data form <StartDate>
      And I fill out the Select Price Option form
      And I fill out the Send Quote form <Email>, <Usarname>, <Password>, <ConfirmPassword>
      Then I see the message <messageSucess>

      Examples:
      | kw  | ListPrice | AnnualMileage | FirstName | LastName | DateofBirth | Country | ZipCode  | StartDate  | Email                   | Usarname     | Password   | ConfirmPassword | messageSucess           |
      | 100 | 45000     | 1000          | Camila    | Silva    | 10/29/1993  | Brazil  | 09210200 | 04/27/2021 | camilla.silva@gmail.com | camillaSilva | 123@Ab5678 | 123@Ab5678      | Sending e-mail success! |


