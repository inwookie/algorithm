import java.util.*;

public class BaekJoon_20647 {

	public static int n;
	public static ArrayList<Integer>[] g;
	
	public static void main(String[] args) {
	
		// Set up the graph.
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		g = new ArrayList[n];
		for (int i=0; i<n; i++) g[i] = new ArrayList<Integer>();
		
		// Read in the graph.
		for (int i=0; i<n-1; i++) {
			int u = stdin.nextInt()-1;
			int v = stdin.nextInt()-1;
			g[u].add(v);
			g[v].add(u);
		}
		
		// Go!
		long res = go(0, new boolean[n]);
		System.out.println(res);
	}
	
	// Solves the problem for the tree rooted at v.
	public static long go(int v, boolean[] used) {
	
		// Mark this vertex.
		long res = 0;
		int deg = 0;
		used[v] = true;
		
		// Go to all children - used indicates the parent node.
		for (Integer x: g[v]) {
			if (used[x]) continue;
			deg++;
			res += go(x, used);
		}
		
		// We must multiply enough sick cows at v so that we have 1 we can keep here
		// and 1 we can send to each child down.
		int mult = 0;
		while ((1<<mult) < deg+1) mult++;
		
		// Ta da!
		return res+mult+deg;
	}
}