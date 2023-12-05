package algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int m;
    static int v;
    static int[][] map;
    static boolean[] isVisit4Dfs;
    static boolean[] isVisit4Bfs;

    public void initArrays() {
        map = new int[n+1][n+1];
        isVisit4Dfs = new boolean[n+1];
        isVisit4Bfs = new boolean[n+1];
    }

    public void setMap() throws IOException {
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
    }

    public void bfs() {
        // Queue
    }

    public void dfs() {
        // Stack

    }

    public static void main(String[] args) throws IOException {
        Test1260 app = new Test1260();
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // cnt No.
        m = Integer.parseInt(st.nextToken()); // road No.
        v = Integer.parseInt(st.nextToken()); // start No.
        app.initArrays();
        app.setMap();





    }
}