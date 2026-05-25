class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if(s.length()==1)
            return false;
        for(int i =0; i<s.length();i++){
            if(!stack.isEmpty()){
            char top = stack.peek();
            }
            if(s.charAt(i)=='('){
                stack.push(')');
            }
            else if(s.charAt(i)=='['){
                stack.push(']');
            }
            else if(s.charAt(i)=='{'){
                stack.push('}');
            }
            else {
                if (stack.isEmpty()) return false;   
                char top = stack.pop();              
                if (s.charAt(i) != top) return false;
            }
            
        }
        return stack.isEmpty();
        
    }
}
