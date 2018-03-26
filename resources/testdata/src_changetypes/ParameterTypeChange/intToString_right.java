import java.util.*;

/**
* case : "change int to String and vice versa"
*/

public class Parameter_Type_Change_Left{
  Book book1;

  public static void main (String[] args){

  }

  public void foo(int a, String b){

  }

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
