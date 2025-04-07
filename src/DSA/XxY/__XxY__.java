package DSA.XxY;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class __XxY__ {

    private static int widthX;
    private static int heightY;
    private static String[][] graph;
    private static HashMap<Integer, Integer> data;
    private static int xAxisLabel;
    private static int yAxisLabel;

    public static void main(final String[] args) {
        initialise();
        populateGraph();
        plotData();
        displayGraph();
    }

    public static void initialise() {
        data = new HashMap<>();
        data.put(10, 1);
        data.put(20, 2);
        data.put(30, 2);
        data.put(40, 3);
        data.put(50, 4);
        data.put(60, 3);
        data.put(70, 2);
        data.put(80, 2);
        data.put(90, 1);
        data.put(100, 2);
        data.put(110, 3);
        data.put(120, 4);
        data.put(130, 5);
        data.put(140, 4);
        data.put(150, 3);
        data.put(160, 2);
        data.put(170, 1);

        heightY = Collections.max(data.values());
        widthX = Collections.max(data.keySet());

        graph = new String[heightY + 1][widthX + 1];

        yAxisLabel = heightY;
        xAxisLabel = 10;
    }

    public static void populateGraph() {
        for(int i = heightY; i >= 0; i--) {
            for(int j = 0; j <= widthX; j+=10) {
                if(i == 0 && j == 0) {
                    graph[0][0] = "0";
                    continue;
                }

                if(i == 0) {
                    graph[i][j] = Integer.toString(xAxisLabel);
                    xAxisLabel += 10;
                }
                else if(j == 0) {
                    graph[i][j] = Integer.toString(yAxisLabel);
                    yAxisLabel -= 1;
                }
                else {
                    graph[i][j] = ".";
                }
            }
        }
    }

    public static void plotData() {
        for(final Map.Entry<Integer, Integer> d: data.entrySet()) {
            graph[d.getValue()][d.getKey()] = "*";
        }
    }

    public static void displayGraph() {
        for(int i = heightY; i >= 0; i--) {
            for(int j = 0; j <= widthX; j+=10) {
                System.out.print(padString(graph[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static String padString(final String input) {
        if(input.length() >= 3) {
            return input;
        }
        String output = input;
        while(output.length() < 3) {
            output = String.format(" %s", output);
        }
        return output;
    }

}
