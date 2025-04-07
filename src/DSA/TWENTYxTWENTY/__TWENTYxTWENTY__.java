package DSA.TWENTYxTWENTY;

import java.util.HashMap;
import java.util.Map.Entry;

public class __TWENTYxTWENTY__ {

    private static int xAxisLabel = 10;
    private static int yAxisLabel;
    private static int widthX;
    private static int heightY;
    private static String[][] graph;
    private static HashMap<Integer, Integer> data;

    public static void main(final String[] args) {
        initialise();
        populateGraph();
        plotData();
        displayGraph();
    }

    private static void initialise() {
        data = new HashMap<>();
        data.put(10, 1);
        data.put(20, 2);
        data.put(30, 2);
        data.put(40, 3);
        data.put(50, 4);
        data.put(60, 5);
        data.put(70, 4);
        data.put(80, 3);
        data.put(90, 2);
        data.put(100, 2);
        data.put(110, 1);

        heightY = data.values().stream().max(Integer::compare).get();
        widthX = data.keySet().stream().max(Integer::compare).get();

        yAxisLabel = heightY;

        graph = new String[heightY + 1][widthX + 1];
    }

    private static void populateGraph() {
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

    private static void plotData() {
        for(final Entry<Integer, Integer> entry: data.entrySet()) {
            graph[entry.getValue()][entry.getKey()] = "*";
        }
    }

    private static void displayGraph() {
        for(int i = heightY; i >= 0; i--) {
            for(int j = 0; j <= widthX; j+=10) {
                System.out.print(padString(graph[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static String padString(final String input) {
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
