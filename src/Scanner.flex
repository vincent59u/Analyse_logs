/*
 * analyseur lexical d'un fichier de logs Apache :
 * (voir support de cours CUP)
 *
 * auteur : Matthieu VINCENT
 * (c) 2017
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
"Jan"		{ return new Symbol(sym.JAN, yytext()); }
"Feb"		{ return new Symbol(sym.FEV, yytext()); }
"Mar"		{ return new Symbol(sym.MAR, yytext()); }
"Apr"		{ return new Symbol(sym.AVR, yytext()); }
"May"		{ return new Symbol(sym.MAI, yytext()); }
"Jun"		{ return new Symbol(sym.JUIN, yytext()); }
"Jul"		{ return new Symbol(sym.JUIL, yytext()); }
"Aug"		{ return new Symbol(sym.AOU, yytext()); }
"Sep"		{ return new Symbol(sym.SEP, yytext()); }
"Oct"		{ return new Symbol(sym.OCT, yytext()); }
"Nov"		{ return new Symbol(sym.NOV, yytext()); }
"Dec"		{ return new Symbol(sym.DEC, yytext()); }
":"         { return new Symbol(sym.DP); }
"/"         { return new Symbol(sym.SL); }
"["         { return new Symbol(sym.CO); }
"]"         { return new Symbol(sym.CF); }
"-"         { return new Symbol(sym.TIRET); }
{IP}		{ return new Symbol(sym.IP, yytext()); }
{METHOD}	{ return new Symbol(sym.METHOD); }
{DECAL}     { return new Symbol(sym.DECAL); }
{NUM}       { return new Symbol(sym.NUM, yytext()); }
{SEP}       { ; }
{FINLIGNE}	{ return new Symbol(sym.FINLIGNE); }
.			{ return null; }

