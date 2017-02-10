/*
 * analyseur lexical du langage exemple-expr:
 * (voir support de cours CUP)
 *
 * auteur : azim.roussanaly@univ-lorraine.fr
 * (c) 2013
 */

package fr.ul.miage.logs.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cup

/* macros */
IP		= 	([0-9]{1,3}\.){3}[0-9]{1,3}
METHOD	=	\".*\"
SEP     =   [ \t]
DECAL   =   ("+"|"-")[0-9]+
NUM     =   [0-9]+
FINLIGNE=   \n

%%

/* regles */
"Jan"		{ return new Symbol(sym.JAN); }
"Feb"		{ return new Symbol(sym.FEV); }
"Mar"		{ return new Symbol(sym.MAR); }
"Apr"		{ return new Symbol(sym.AVR); }
"May"		{ return new Symbol(sym.MAI); }
"Jun"		{ return new Symbol(sym.JUIN); }
"Jul"		{ return new Symbol(sym.JUIL); }
"Aug"		{ return new Symbol(sym.AOU); }
"Sep"		{ return new Symbol(sym.SEP); }
"Oct"		{ return new Symbol(sym.OCT); }
"Nov"		{ return new Symbol(sym.NOV); }
"Dec"		{ return new Symbol(sym.DEC); }
":"         { return new Symbol(sym.DP); }
"/"         { return new Symbol(sym.SL); }
"["         { return new Symbol(sym.CO); }
"]"         { return new Symbol(sym.CF); }
"-"         { return new Symbol(sym.TIRET); }
{IP}		{ return new Symbol(sym.IP); }
{METHOD}	{ return new Symbol(sym.METHOD); }
{DECAL}     { return new Symbol(sym.DECAL); }
{NUM}       { return new Symbol(sym.NUM); }
{SEP}       { ; }
{FINLIGNE}		{ return new Symbol(sym.FINLIGNE); }
.			{ return null; }

