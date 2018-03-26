import java.util.*;

/***  the case : "if there are changes other than doc_update" ***/

/**
*
*DOC1
*/
public class Parameter_Type_Change_Left{
  Book book1;


  /**
  *
  *DOC2
  *
  */
  public static void main (String[] args){

  }

  public void foo(int a, String b){

  }

  /**
  * DOC2
  */

  public void setBook(int book){
    book1 = book;
  }

}

class Book{
  String name;
  int numberOfPages;
  String writer;

  public Book(String name, int numberOfPages, String writer){
    this.name = name;
    this.numberOfPages = numberOfPages;
    this.writer = writer;
  }
}
