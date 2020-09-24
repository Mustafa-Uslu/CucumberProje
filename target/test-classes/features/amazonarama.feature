@urunarama
Feature: Amazon Arama

    #Ortak olan adimlari buraya yasilabilir. Her seneryodan önce calistirir, mesela sisteme giris yapmak.
  Background: Oncesinde calisacak Method (BeforeClass)
     Given kullanici amazon sayfasina gider

  @amazon @arama @smoketest
  Scenario: TC02_kullanici amazonda arama yapar
    And headphones aramasi yapar
    Then kac tane sonuc oldugunu ekrana yazdirir

#Yorum satırı için # ifadesini kullanıyoruz

  @amazon
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici camera aramasi yapar
    Then kac tane sonuc oldugunu ekrana yazdirir

