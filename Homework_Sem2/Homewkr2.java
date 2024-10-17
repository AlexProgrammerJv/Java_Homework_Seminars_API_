//Задача 2. Создание CSV-строки из массива объектов
//Дан массив объектов, где каждый объект представляет собой строку данных, и
//массив заголовков. Создайте строку CSV, где строки данных разделяются новой
//строкой, а значения в строках разделяются запятыми.

package Homework_Sem2;

public class Homewkr2
{
    public static void main(String[] args)
    {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
                {"John", "30", "New York"},
                {"Alica", "25", "Los Angeles"},
                {"Bob", "35", "Chicago"}
        };
        System.out.println(sortedArray(headers,data));
    }

    public static String sortedArray(String[] headers, String[][] data)
    {
        StringBuilder sorting = new StringBuilder();
        StringBuilder sorting2 = new StringBuilder();
        for (int i = 0; i < data.length; i++)
        {
            if(i > 0) sorting2.append(", ");
            sorting2.append(headers[i]);
            for (int j = 0; j < data[i].length; j++)
            {
                if(j > 0) sorting.append(", ");
                sorting.append(data[i][j]);
            }
            sorting.append("\n");

        }
        return sorting2.append("\n"+sorting).toString();
    }

}
