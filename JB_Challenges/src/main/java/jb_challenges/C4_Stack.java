package jb_challenges;

import java.util.ArrayList;
import java.util.List;

public class C4_Stack<T> {
    private List<T> stackList;

    public C4_Stack() {
        this.stackList = new ArrayList<>();
    }

    public void push(T item) {
        this.stackList.add(item);
    }

    public T pop () {
        int lastItemIdx = stackList.toArray().length - 1;
        if (lastItemIdx >= 0) {
            T lastItem = this.stackList.get(lastItemIdx);
            this.stackList.remove(lastItemIdx);
            return lastItem;
        }
        return null;
    }

    public T peek () {
        int lastItemIdx = stackList.toArray().length - 1;
        if (lastItemIdx >= 0) {
            return this.stackList.get(lastItemIdx);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stackList.toArray().length; i++) {
            sb.append(this.stackList.get(i));
            sb.append(", ");
        }

        return sb.toString();
    }

    public int getLength() {
        return stackList.toArray().length;
    }
}
