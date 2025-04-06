class Solution {
    public int divide(int di, int div) {
        if(di==Integer.MIN_VALUE && div==-1) return Integer.MAX_VALUE;
        return di/div;
    }
}