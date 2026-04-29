class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i].charAt(tokens[i].length()-1))) st.push(Integer.parseInt(tokens[i]));
            else {
                int b = st.pop();
                int res = apply(st.pop(), b, tokens[i]);
                st.push(res);
            }
        }

        return st.peek();
    }

    int apply(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default  -> throw new IllegalArgumentException("Unknown op: " + op);
        };
    }
}
