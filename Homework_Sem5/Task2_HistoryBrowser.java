//Задача 2. История посещения веб-сайтов
//Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
//Используйте Deque для хранения истории.
//● visitSite(String site): Добавляет сайт в историю посещений.
//● back(int steps): Возвращает название сайта, который был посещен
//        steps назад, или null, если таких шагов нет.
// ● getHistory(): Возвращает список сайтов в истории посещений, от
//последнего посещенного к первому.

package Homework_Sem5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2_HistoryBrowser {
    private Deque<String> historyBrowser = new ArrayDeque<>();

    void visitSite(String site) {
        historyBrowser.add(site);
    }

    void back(int steps) {

        if (historyBrowser.size() < steps) throw new RuntimeException("Error! The size of the browser " +
                "history is less than a step");
        int count = 0;
        for (String s : historyBrowser) {
            count++;
            if (count == steps) System.out.println(s);
        }
    }

    StringBuilder getHistory(){
        if (historyBrowser.size() == 0) throw new RuntimeException("Error! The size of history browser is empty!");
        StringBuilder listHistory = new StringBuilder();
        int count = 0;
        while (count != historyBrowser.size()) {
            if (count != 0) listHistory.append("\n");
            listHistory.append(historyBrowser.peekLast());
            historyBrowser.addFirst(historyBrowser.pollLast());
            count++;
        }
        return listHistory;
    }
}
