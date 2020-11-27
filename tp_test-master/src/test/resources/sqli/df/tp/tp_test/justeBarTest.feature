#author : Wided LABANNE
#Mr Pignon et Mr Le blanc vont au bar le Juste qui est un bar à coktail. 
#Il y a dans le bar seulement 10 places assises.
#Première histoire : Ils arrivent mais il y a déjà 9 personnes dans le bar 
#donc ils se font refuser le droit d’entrée, le bar affiche complet

#Deuxième histoire : Il arrivent, il y a déjà 8 personnes dans le bar. 
#La personne derrière eux ne peut pas rentrer, 
#le bar affiche complet Ils commandent chacun un cokatil du mois à 10€ 
#C’est Mr Le blanc qui paie l’ensemble 
#A la fin de leur verre, on vérifie la note, et Mr Le blanc paie. 
#Mr Pignon est heureux car ils n’ont consommé qu’un verre (problème de foie de Mr Pignon)

#Troisième histoire Ils arrivent, il y a 3 personnes dans le bar. 
#Ils commandent chacun un cokatil du mois à 10€ 
#Personne ne paie le verre de l’autre A la fin de leur verre, 
#ils vérifient chacun leur note, Mr Pignon paie mais Mr Leblanc insiste pour payer un autre coktail du mois. 
#Il commande donc 2 autres coktails du mois pour sa note. 
#A la fin de leur verre, Mr Leblanc vérifie la note et paie. 
#Mr Pignon est triste car il sait qu’au dessus d’un cokatil ce dernier va passer une très mauvaise nuit 
#(problème de foie de Mr Pignon)

Feature: JusteBar Test story

  Scenario Outline: Mr Leblanc and Mr Pignon arrive to the bar but they cannot seat because it is full
    Given The bar is full at <maxcap> persons
    And <b> persons are in the bar
    When Mr Leblanc and Mr Pignon <c> persons arrive
    And the status of the bar is <status>
    Then they cannot enter into the bar <entry>
    But They order <NbCocktail> cocktail
    And Mister Pignon is <HumeurP> 
    
   
Examples:
      |  maxcap |  b  |  c  | status   | entry | NbCocktail | HumeurP        |
      |    10   |  9  |  2  | "NoFull" | "No"  |  0         |    "N/A"       |
      |    10   |  8  |  2  | "NoFull" | "Yes" |  1			    |    "Happy"     |
      |    10   |  3  |  2  | "NoFull" | "Yes" |  2			    |     "Sad"      |

