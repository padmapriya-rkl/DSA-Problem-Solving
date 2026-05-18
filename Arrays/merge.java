class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        ans.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            int[] lastInterval = ans.get(ans.size() - 1);

            if (start <= lastInterval[1]) {

                lastInterval[1] =
                        Math.max(lastInterval[1], end);

            } else {

                ans.add(new int[]{start, end});
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
