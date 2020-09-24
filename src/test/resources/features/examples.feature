@teknolojikarama
  Feature: Amazonda Birden Fazla Arama
    Scenario Outline: TC05_Kullanici amazonda urun arar
      Given kullanici amazon sayfasina gider
      And kullanici aramakutusuna "<urunler>" yazar ve arar
      Then kac tane sonuc oldugunu ekrana yazdirir

      #yazdiginiz urun sayisinca senaryo calisir.
      Examples: Urun isimleri
        | urunler    |
        | headphones |
        | camera     |
        | drone      |
        | pencil     |
        | tv         |

