#!/bin/sh 
# ----------------------------------------
# Script for starting the following application:
# Analyse de logs Apache
# Author : Matthieu VINCENT
# date : Fev 2017
# ---------------------------------------
# Example of usage:
# > run

# -----------------------------------------
# Change here
# -----------------------------------------
# --->1) project root name
PROJ_HOME="`dirname $0`/.."

# --->2) lib dir (where *.jar are stored)
LIB_DIR="$PROJ_HOME/lib"

# --->3) classes dir (where *.class are stored)
CLASSES_DIR="$PROJ_HOME/build/classes"


# --->4) the name of class to launch
CLASS_NAME=fr.ul.miage.logs.Main

# -->5) extra paramaters of the command
PARAMS=""

# -----------------------------------------
# Dont' change below
# -----------------------------------------

# ---->Classpath automatique 
PROJ_CP="$PROJ_HOME/build/classes"
for x in `ls "$LIB_DIR"`
do
PROJ_CP="$PROJ_CP:$LIB_DIR/$x"
done

# ---->java command
COMMAND="java -Xmx512m -classpath \"$PROJ_CP\" $CLASS_NAME $PARAMS $@"
#echo $COMMAND
eval $COMMAND

# ----------------------------------------
#                  END
# ----------------------------------------
