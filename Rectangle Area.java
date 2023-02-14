class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // calculate the overlap only by the x axis
        int xOverlap = Math.max(ax1, bx1) - Math.min(ax2, bx2);
        if(Math.max(ax1, bx1) > Math.min(ax2, bx2)) xOverlap = 0;

        // calculate the overlap only by the y axis      
        int yOverlap = Math.max(ay1, by1) - Math.min(ay2, by2);
        if(Math.max(ay1, by1) > Math.min(ay2, by2)) yOverlap = 0;

        int overlapAr = xOverlap * yOverlap, // calculate the overlap area
            areaA = (ax2 - ax1) * (ay2 - ay1), 
            areaB = (bx2 - bx1) * (by2 - by1);

        return areaA + areaB - overlapAr; // substract the overlap area so we don't count it twice
    }
}