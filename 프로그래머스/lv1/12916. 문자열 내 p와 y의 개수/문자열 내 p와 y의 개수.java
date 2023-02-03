class Solution {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;
        String[] arr = s.toLowerCase().split("");
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].equals("p")) {
                pCnt++;
            } else if (arr[i].equals("y")) {
                yCnt++;
            }
        }
        if (pCnt == yCnt) return true;
        else if(pCnt != yCnt) return false;
        else return false;
    }
}