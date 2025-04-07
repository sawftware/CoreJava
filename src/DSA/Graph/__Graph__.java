package DSA.Graph;

public class __Graph__ {

    private static final int HEIGHT = 5;
    private static final int WIDTH = 5;
    private static final String DEFAULT = ".";
    public static void main(final String[] args) {

        int axisCounter = 5;

        final String[][] graph = new String[HEIGHT + 1][WIDTH + 1];

        for(int i = 0; i < HEIGHT + 1; i++) {
            for(int j = 0; j < WIDTH + 1; j++) {
                if(i == HEIGHT) {
                    graph[i][j] = Integer.toString(axisCounter);
                    axisCounter++;
                }
                else if(j == 0) {
                    graph[i][j] = Integer.toString(axisCounter);
                    axisCounter--;
                }
                else {
                    graph[i][j] = DEFAULT;
                }
            }
        }

        for(int i = 0; i < HEIGHT + 1; i++) {
            for(int j = 0; j < WIDTH + 1; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
