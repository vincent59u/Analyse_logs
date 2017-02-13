
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package fr.ul.miage.logs.generated;

import fr.ul.miage.logs.session.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserCup extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\003\011\000\002\005\020\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\004\004\006\001\002\000\004\002\051\001" +
    "\002\000\004\007\047\001\002\000\004\005\007\001\002" +
    "\000\004\005\010\001\002\000\004\010\012\001\002\000" +
    "\004\006\044\001\002\000\004\031\013\001\002\000\004" +
    "\012\014\001\002\000\032\014\015\015\021\016\023\017" +
    "\025\020\030\021\020\022\022\023\031\024\024\025\017" +
    "\026\026\027\027\001\002\000\004\012\ufffc\001\002\000" +
    "\004\012\032\001\002\000\004\012\ufff3\001\002\000\004" +
    "\012\ufff7\001\002\000\004\012\ufffb\001\002\000\004\012" +
    "\ufff6\001\002\000\004\012\ufffa\001\002\000\004\012\ufff4" +
    "\001\002\000\004\012\ufff9\001\002\000\004\012\ufff2\001" +
    "\002\000\004\012\ufff1\001\002\000\004\012\ufff8\001\002" +
    "\000\004\012\ufff5\001\002\000\004\031\033\001\002\000" +
    "\004\013\034\001\002\000\004\031\035\001\002\000\004" +
    "\013\036\001\002\000\004\031\037\001\002\000\004\013" +
    "\040\001\002\000\004\031\041\001\002\000\004\030\042" +
    "\001\002\000\004\011\043\001\002\000\004\006\ufffd\001" +
    "\002\000\004\031\045\001\002\000\004\031\046\001\002" +
    "\000\004\007\ufffe\001\002\000\006\002\uffff\004\006\001" +
    "\002\000\004\002\000\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\010\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\002\047\003\004\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserCup$actions {

//@@CUPDBG0

	Table table = new Table();
	IP ip;
	long dateMilli;
	Date date;
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");

  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action_part00000000(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= x EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // x ::= log FINLIGNE x 
            {
              Object RESULT =null;
		//@@CUPDBG1
 table.ajouter(ip, dateMilli); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("x",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // x ::= log FINLIGNE 
            {
              Object RESULT =null;
		//@@CUPDBG2
 table.ajouter(ip, dateMilli); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("x",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // log ::= IP TIRET TIRET timestamp METHOD NUM NUM 
            {
              Object RESULT =null;
		int ipleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).left;
		int ipright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).right;
		Object ip = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).value;
		int dateleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).left;
		int dateright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).right;
		Object date = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)).value;
		//@@CUPDBG3
 ip = new IP("ip"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("log",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // timestamp ::= CO NUM SL mois SL NUM DP NUM DP NUM DP NUM DECAL CF 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-12)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-12)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-12)).value;
		int moleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-10)).left;
		int moright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-10)).right;
		Object mo = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-10)).value;
		int yleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).left;
		int yright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).right;
		Object y = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-8)).value;
		int hleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).left;
		int hright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).right;
		Object h = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)).value;
		int mileft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)).left;
		int miright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)).right;
		Object mi = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		//@@CUPDBG4
 date = format.parse("d/mo/y:h:mi:s");
																				     long dateMilli = date.getTime();
																				  
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("timestamp",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-13)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // mois ::= JAN 
            {
              Object RESULT =null;
		//@@CUPDBG5
 RESULT = new String("01"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // mois ::= FEV 
            {
              Object RESULT =null;
		//@@CUPDBG6
 RESULT = new String("02"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // mois ::= MAR 
            {
              Object RESULT =null;
		//@@CUPDBG7
 RESULT = new String("03"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // mois ::= AVR 
            {
              Object RESULT =null;
		//@@CUPDBG8
 RESULT = new String("04"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // mois ::= MAI 
            {
              Object RESULT =null;
		//@@CUPDBG9
 RESULT = new String("05"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // mois ::= JUIN 
            {
              Object RESULT =null;
		//@@CUPDBG10
 RESULT = new String("06"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // mois ::= JUIL 
            {
              Object RESULT =null;
		//@@CUPDBG11
 RESULT = new String("07"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // mois ::= AOU 
            {
              Object RESULT =null;
		//@@CUPDBG12
 RESULT = new String("08"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // mois ::= SEP 
            {
              Object RESULT =null;
		//@@CUPDBG13
 RESULT = new String("09"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // mois ::= OCT 
            {
              Object RESULT =null;
		//@@CUPDBG14
 RESULT = new String("10"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mois ::= NOV 
            {
              Object RESULT =null;
		//@@CUPDBG15
 RESULT = new String("11"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // mois ::= DEC 
            {
              Object RESULT =null;
		//@@CUPDBG16
 RESULT = new String("12"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("mois",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserCup$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
              return CUP$ParserCup$do_action_part00000000(
                               CUP$ParserCup$act_num,
                               CUP$ParserCup$parser,
                               CUP$ParserCup$stack,
                               CUP$ParserCup$top);
    }
}

}
