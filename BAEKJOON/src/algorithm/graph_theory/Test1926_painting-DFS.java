package algorithm.graph.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
    1. 아이디어
     - dfs로 그림 갯수 +1, 최대사이즈 갱신
     - 2중 for문 => 값 1 && 방문 x => dfs

    2. 시간 복잡도
     - DFS :O(V+E) = 5V = 5*500*500 = 1,250,000
        1초에 연산 2억개정도를 할 수 있음. 2억보다 작으므로 OK
     - V : M*N
     - E : V*4

    3. 자려구조
     - 그래프 전체 지도 : int[][]
     - 방문여부 : boolean[][]
     - Stack(DFS)
*/
public class Test1926 {

    static int m, n;
    static int[][] map;
    static boolean[][] isVisit;
    static int cntPhoto;
    static int maxSizePhoto;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public void initArrays() {
        isVisit = new boolean[n][m];
        map = new int[n][m];
    }

    public void setMap() throws IOException {
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public int dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        isVisit[x][y] = true;
        int size = 1;
        while(!stack.isEmpty()) {
            int[] current = stack.pop();
            int currentX = current[0];
            int currentY = current[1];

            for(int i=0; i<4; i++) {
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny< m && !isVisit[nx][ny] && map[nx][ny] == 1) {
                    isVisit[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
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
                    maxSizePhoto = Math.max(maxSizePhoto, app.dfs(i, j));
                    cntPhoto++;
                }
            }
        }
        System.out.println(cntPhoto);
        System.out.println(maxSizePhoto);
    }
}