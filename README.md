# TD Analyse de logs d'un serveur Apache 

Le but de ce TD était d'utiliser CUP et JFlex afin d'analyser un fichier de logs Apache et d'effectuer un traitement Java sur ces logs. Le sujet de ce TD est disponible dans le dossier "/doc".
Le projet est construit avec Ant (http://ant.apache.org).

TD L3 - Miage 2017

#Mode d'emploi : 

Vous pouvez également consulter la documentation qui se trouve dans le dossier "/doc". Elle reprendra l'ensemble des éléments ci-dessous.

##Téléchargement : 

Télécharger le fichier "Analyse_logs-0.1-src.tar.gz" qui se trouve dans le dossier "/dist". 
Une fois télécharer, décompressez-le 

##Utilisation : 

Lancer un terminal à la racine du dossier décompressé. Puis lancer la commande `ant`. Elle permettra de compiler le projet. 
Ensuite, aller dans le dossier "/bin" (`cd /bin`) et lancer la commande `sh run.sh ../samples/sample.txt` ou `./run.sh ../samples/sample.txt` suivant votre OS. 

Il est également possible de changer le fichier de logs en ajoutant vos fichiers dans le dossier "/samples" et de modifier le nom du fichier lors du lancement du programme run.sh.

##Résultats :

Le programme calculera le nombres d'utilisateur différents, la durée moyenne d'une session et le nombre totale de sessions. 

NB : Nous considérons qu'une session dure 10 minutes.
