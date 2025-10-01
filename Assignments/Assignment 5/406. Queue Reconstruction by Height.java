class Solution {
    public int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
	List<int[]> ll = new LinkedList<>();
	for (int[] p: people) ll.add(p[1], p);

	return ll.toArray(new int[people.length][2]);
    }
}