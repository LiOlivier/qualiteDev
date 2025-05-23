# qualiteDev

#EXERCICE 3 

Pour répondre à l'exercice 3, 

On peut interpréter les résultats que les tests ne couvrent pas entièrement le code. 
mult(float, float) : 0 % de couverture donc aucune instruction ni ligne testée.
div(float, float), add(float, float), et Calculatrice() : 100 % de couverture donc elles sont entièrement testées.

D'après Jacoco, elle nous montre que seule la méthode mult() n’est pas testée (0 % de couverture). Les autres méthodes, dont div(), sont totalement couvertes. Pour améliorer le résultat, il faut écrire une ou plusieurs tests unitaires pour la méthode mult().
