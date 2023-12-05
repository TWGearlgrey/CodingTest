package algorithm.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
    1. 아이디어
     - 2중 for문 => 값 1 && 방문 X => BFS
     - BFS 돌면서 그림 갯수 +1, 최댓값 갱신

    2. 시간 복잡도
     - BFS : O(V+E) = 5V = 5*500*500 = 1,250,000
        1초에 연산 2억개정도를 할 수 있음. 2억보다 작으므로 OK
     - V : M*N
     - E : V*4

    3. 자료구조
     - 그래프 전체 지도 : int[][]
     - 방문여부 : boolean[][]
     - Queue(BFS)
 */
public class Test1926 {
    static int n, m;
    static int[][] map;
    static boolean[][] isVisit;
    static int cntPhoto = 0;
    static int maxSize  = 0;
    static int[] dx = {1, 0, -1 ,0};
    static int[] dy = {0, 1, 0, -1};
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public void initArrays() {
        isVisit = new boolean[n][m];
        map = new int[n][m];
    }

    public void setMap() throws IOException {
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        isVisit[x][y] = true;
        int size = 1;
        while(!queue.isEmpty()) {
            int[] p = queue.poll();
            int px = p[0];
            int py = p[1];

            for(int d=0; d<4; d++) {
                int nx = px + dx[d];
                int ny = py + dy[d];
                if(nx<0 && ny<0 && nx>n-1 && ny>m-1) continue;
                if(isVisit[nx][ny]) continue;
                if(map[nx][ny] == 1) {
                    isVisit[nx][ny] = true;
                    queue.add(new int[] {nx,ny});
                    size++;
                }
            }
        }
        return size;
    }

    public static void main(String[] args) throws IOException {
        Test1926 app = new Test1926();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        app.initArrays();
        app.setMap();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 1 && !isVisit[i][j]) {
                    maxSize = Math.max(maxSize, app.bfs(i, j));
                    cntPhoto++;
                }
            }
        }
        System.out.println(cntPhoto);
        System.out.print(maxSize);
    }
}