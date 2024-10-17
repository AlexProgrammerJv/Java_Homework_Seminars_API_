//Задача 3. Удаление пустых строк из текста
//Дана строка с несколькими строками текста, разделенными переводами строки.
//        Напишите метод, который удаляет все пустые строки из текста.

package Homework_Sem2;
public class Homewkr3 {
    public static void main(String[] args) {
        String text = "line\n\nline2\n\nline3";
        System.out.println(deleteEmptyLines(text));

    }
    public static String deleteEmptyLines(String text)
    {
        StringBuilder sb = new StringBuilder();
        String[] splitText = text.split("\n");
        for (int i = 0; i < splitText.length ; i++)
        {
            if(!splitText[i].isEmpty())
            {
                sb.append(splitText[i]+"\n");
            }
        }
        return sb.toString();
    }
}


