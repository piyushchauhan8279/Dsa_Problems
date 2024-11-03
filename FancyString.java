class Solution {
    public String makeFancyString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        int count=0;
        map.put(s.charAt(0),count+=1);
        q.add(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) != s.charAt(i)){
                map.clear();
                count=0;

            }
            map.put(s.charAt(i),count+=1);
            if(map.get(s.charAt(i))<3 ){

                q.add(s.charAt(i));
            }
        }

        StringBuffer newStr=new StringBuffer("");
        int size=q.size();
        for(int i=0;i<size;i++){
            newStr.append(q.remove());
        }
        return newStr.toString();
    }
}
