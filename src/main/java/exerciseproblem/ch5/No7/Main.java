package exerciseproblem.ch5.No7;
/*
다음 코드를 보자. 위의 코드가 밑의 코드보다 낳은 이유를 설명하라.
밑의 코드는 실행이 되지 않음. 둘의 차이는 try 괄호 안에서 선언과 초기화를 동시에 한 것이고, 두번 째는 위에서 선언과 초기화를 한 후에 변수를 헤더에 넣어주고 있는데
차이가 뭘까 ..?
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {
       //만약에 in이 열리고, out에서 문제가 생기면 in은 close하고 out은 예외를 던짐.
       try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
            PrintWriter out = new PrintWriter("output.txt")) {
           out.println("aa");

           System.out.println("Gg");
           while(in.hasNext())
               out.println(in.next().toLowerCase());
       }

       ////////////////////////////////////////////////////////

//           Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
//           PrintWriter out = new PrintWriter("file");
//           try (out) {
//               while (in.hasNext())
//                   out.println(in.next().toLowerCase());
//           }catch (IOException e) {
//
//           }
   }
}
