# TP Analyse de logs d'un serveur Apache

TD de Compilation CUP/LEX - Miage 2017

#Mode d'emploi : 

##Ajouter le projet à Eclipse : 
- Requis : Ajouter au préalable le plugin disponible à cette adresse : http://www2.cs.tum.edu/projekte/cup/eclipse.php
- File -> New Java Project -> Décocher "Use default location" -> Indiquer le chemin du répertoire du projet, ici par exemple : RATH_CLADT_LOGSCOMPILATION -> Puis FINISH 

##Pour que le projet compile : 
- Clique droit sur le projet dans Eclipse -> Properties -> Builders -> Vérifier/Ajouter ANT en faisaint soit :

(Pour un nouveau ANT) 		- New -> Ant Builder -> OK -> Dans l'onglet Main , Buildfile, Cliquez sur "Browse Workspace..." et choisir le build.xml du projet.
	  			Allez dans l'onglet "Targets" et faire : 
				 - "After a 'Clean' :" Set Targets... , Décocher tout et cocher Cup 
				 - "Manual Build :" Set Targets... , Décocher tout et cocher Cup
				 - "Auto Build :" NE RIEN FAIRE
				 - "During a 'Clean' :" Set Targets..., Décocher tout et cocher Clean

(Si ANT est déjà présent)	- Cliquez sur "ANT", Edit... puis vérifier que tout correspond a la partie d'au dessus.

Validez puis fermez la fenêtre propriété.

##Lancer le projet : 
- Cliquez sur l'onglet "Projet" dans le menu en haut d'Eclipse, "Build Project.."
- Il faut ensuite spécifier le fichier à utiliser pour analyser ses logs
	Pour cela cliquez sur l'onglet "Run" puis "Run Configurations", Dans l'onglet arguments spécifier le chemin du fichier .log ( Ici samples/exemple.log )
- Puis Run

Le projet devrait fonctionner et afficher le nombre d'utilisateurs différents ainsi que le temps moyen d'une session
	 
