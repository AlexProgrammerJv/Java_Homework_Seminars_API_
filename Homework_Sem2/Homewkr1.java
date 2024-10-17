//Задание 1. Формирование URL с параметрами
//Дана строка базового URL:
//https://example.com/search?
//Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
//передаются в виде строки, где ключи и значения разделены =, а пары
//ключ-значение разделены &. Если значение null, то параметр не должен
//попадать в URL.

package Homework_Sem2;

public class Homewkr1
{
    public static void main(String[] args)
    {
        String params = "query=java&sort=null&filter=desc&query=java&sort=null";
        String url = "https://example.com/search?";
        System.out.println(addParamsURL(url, params));

    }
    public static String addParamsURL(String url, String params) {

        String[] param = params.split("&");
        StringBuilder addParams = new StringBuilder(url);
        for (int i = 0; i < param.length; i++) {
            if (!param[i].contains("null"))
            {
                if (i > 0) addParams.append("&");
                addParams.append(param[i]);
            }
        }
        return addParams.toString();
    }
}


