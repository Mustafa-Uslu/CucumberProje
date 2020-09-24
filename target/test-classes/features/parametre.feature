@urunarama1 @amazon
Feature: Amazon Urun Arama
  Scenario: TC04_kullanici amazonda aramasi yapar
    Given kullanici amazon sayfasina gider
    And kullanici "drone" aramasi yapar
    Then kac tane sonuc oldugunu ekrana yazdirir
