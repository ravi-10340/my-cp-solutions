import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<List<Integer>> g = new ArrayList<>();
            for (int i = 0; i < n; i++) g.add(new ArrayList<>());
            int[] in = new int[n];
            for (int i = 0; i < n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken()) - 1;
                int v = Integer.parseInt(st.nextToken()) - 1;
                long x = Long.parseLong(st.nextToken());
                long y = Long.parseLong(st.nextToken());
                if (x > y) {
                    g.get(v).add(u);
                    in[u]++;
                } else {
                    g.get(u).add(v);
                    in[v]++;
                }
            }
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < n; i++) if (in[i] == 0) q.add(i);
            int[] p = new int[n];
            int val = 1;
            while (!q.isEmpty()) {
                int c = q.poll();
                p[c] = val++;
                for (int nx : g.get(c)) {
                    if (--in[nx] == 0) q.add(nx);
                }
            }
            for (int i = 0; i < n; i++) sb.append(p[i]).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
