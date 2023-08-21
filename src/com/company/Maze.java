package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        int[][] path = new int[3][3];

        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        Wayprint("",maze,0,0,path,1);
    }
    static int Ways(int c , int r){
        if(c==1 || r==1 ){
            return 1;
        }
        int left = Ways(c-1,r);
        int right = Ways(c,r-1);
        return left+right;
    }

    static void Way(String p , int c, int r){
        if(c==1 && r ==1){
            System.out.print(p+" ");
            return;
        }
        if (r>1){
            Way(p+"D",c,r-1);
        }
        if (c>1){
            Way(p+"R",c-1,r);
        }
    }

    static ArrayList<String> WayArr(String p , int c, int r){
        if(c==1 && r ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (r>1){
            ans.addAll(WayArr(p+"D",c,r-1));
        }
        if (c>1){
            ans.addAll(WayArr(p+"R",c-1,r));
        }
        return ans;
    }
    static void Wayprint(String p , boolean [][] maze,int c, int r,int[][] path, int step){
        if(c==maze[0].length-1 && r == maze.length-1){
            path[r][c] =step;
            for(int[] i : path)
                System.out.println(Arrays.toString(i));
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) return;
        path[r][c] = step;
        maze[r][c] = false;
        if (r< maze.length-1){
            Wayprint(p+"D",maze,c,r+1,path,step+1);
        }
        if (c< maze[0].length-1){
            Wayprint(p+"R",maze,c+1,r,path,step+1);
        }
        if (r>0){
            Wayprint(p+"U",maze,c,r-1,path,step+1);
        }
        if (c>0){
            Wayprint(p+"L",maze,c-1,r,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] =0;
    }
}
