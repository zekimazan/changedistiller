import java.util.*;

/***  the case : "if there are only doc_update" ***/

/**
*
* update
*DOC1
*/
public class Parameter_Type_Change_Left{
  Book book1;


  /**
  *   update
  *DOC2
  *
  */
  public static void main (String[] args){

  }

  public void foo(int a, String b){

  }

  /**
  * update
  * DOC3
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
