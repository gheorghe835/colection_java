package buble;

public class Queue {
    char[] q;
    int putloc, getloc; // индексы для позиций помещения и извлечения
    Queue(int size) {
        q = new char[size]; // выделение памяти под очередь
        putloc = getloc = 0;
// массив, хранящий данные очереди
    }
//182 Java: руководство для начинающих, 9-е издание
    // Поместить символ в очередь,
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }
        q[putloc++] = ch;
    }
    // Извлечь символ из очереди,
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }

}
