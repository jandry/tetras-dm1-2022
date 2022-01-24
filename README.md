Exercice Design Pattern session 1 / 3

Nous allons modéliser un labyrinthe pour Pacman (classe « Labyrinthe »). 
Ce labyrinthe ne pourra avoir qu’un et un seul « Pacman ». 
Le labyrinthe contient des pac-gommes qui devront toutes respecter l’interface « IPacGomme » avec deux propriétés : couleur et taille.
Il existe deux types de pac-gommes : les « PacGommeNormale» de taille 5 et de couleur jaune et les « PacGommeBoost » de taille 10 et de couleur bleue.
Les pac-gommes seront mises dans le labyrinthe au travers d’une seule et unique classe. Toutes les 15 pac-gommes normales, c’est une pac-gomme boost qui est créée par cette classe.

- Quels design patterns allez-vous utiliser ?
- Proposez le diagramme UML en utilisant PlantUML
  - Si besoin, indiquez les design patterns à l’aide de commentaires
- Proposez une implémentation en java
- Créer les tests vérifiant que
  - Que toutes les seize pac-gommes, il s’agit d’un boost
  - Que l’on ne peut créer qu’un seul Pacman
  - Qu’une pac-gomme normale est de taille 5 et de couleur jaune
  - Qu’une pac-gomme boost est de taille 10 et de couleur bleue

Votre projet doit m’être rendu :
- sous forme de projet github
- qui compile avec gradle
- dont les tests passent
Vous pouvez évidemment partir du projet du cours. Je prendrais votre projet avec les commits du lundi 24 janvier 2022 maximum.
