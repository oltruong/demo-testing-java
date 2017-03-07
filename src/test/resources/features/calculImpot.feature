Feature: Calcul d'impôt sur le revenu
  On teste ici le traitement de bout en bout

  Scenario: Célibataire
    Given Un revenu annuel de 30000 euros avec 1 parts
    When L'impot est calculé
    Then Le fisc demande 2449.72 euros


  Scenario: Couple enfants
    Given Un revenu annuel de 40000 euros avec 3 parts
    When L'impot est calculé
    Then Le fisc demande 961.8 euros


  Scenario Outline: Valeurs multiples
    Given Un revenu annuel de <revenuBrut> euros avec <nombreDePart> parts
    When L'impot est calculé
    Then Le fisc demande <impot> euros

    Examples:
      | revenuBrut | nombreDePart | impot   |
      | 30000      | 1            | 2449.72 |
      | 40000      | 3            | 961.9     |
