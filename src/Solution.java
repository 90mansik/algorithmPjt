
public class Solution {

    public static int N,M;
    public static int[][] graph;

	public static void main(String[] args) {
		
		int[][] v = {{1,1,0,1,1}, {0,1,1,0,0}, {0,0,0,0,0}, {1,1,0,1,1}, {1,0,1,1,1}, {1,0,1,1,1}};
		

		
	}
	
	
	
	public int[] solution(int[][] v) {
		int[] answer = {4,8};
		
        N = v.length;  			// 행
        M = v[0].length;		// 열
        
        
        graph = new int[N][M];
        int count =0;               // 아이스크림 갯수

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(v[i][j] != 1) {
                    if (dfs(i, j)) {
                        count++;
                    }
                }
            }
        }

        System.out.println("count : " + count);
		
		return answer;
	}
	
    // DFS로 특정 노드를 방문하고 상하좌우로 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y){
        // 주어진 범위를 벗어나는 경우에는 종료
        if(x <= -1 || x>= N || y <= -1 || y >= M) {
            return false;
        }

        //현재 노드를 아직 방문하지 않았다면
        if(graph[x][y] == 0){
            //해당 노드 방문 처리
            graph[x][y] = 1;
            dfs(x -1, y);   // 상
            dfs(x + 1, y);  // 하
            dfs(x, y-1);    // 좌
            dfs(x, y + 1);  // 우
            return true;
        }
        return false;
    }

}
