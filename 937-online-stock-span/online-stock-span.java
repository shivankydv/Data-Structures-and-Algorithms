class StockSpanner {
    Stack<int[]> st;
    int day;
    public StockSpanner() {
        st = new Stack<>();
        day = 0;
    }

    public int next(int price) {
        day++;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            st.pop();
        }

        int span;

        if (st.isEmpty()) {
            span = day;
        } else {
            span = day - st.peek()[1];
        }

        st.push(new int[]{price, day});

        return span;
    }
}