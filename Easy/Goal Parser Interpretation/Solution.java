class Solution {
    public String interpret(String command) {
        for(int i=0; i<command.length(); i++)
        {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                command = command.substring(0,i)+'o'+command.substring(i+2,command.length());
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
            {
                command = command.substring(0,i)+'a'+'l'+command.substring(i+4,command.length());
            }
        }
        return command;
    }
}
