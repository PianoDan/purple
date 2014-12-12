/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.purple;
import java.util.ArrayList;

/**
 *
 * @author Dan
 * 
 * Version History: 1.3 - added Cut and Paste context menu
 * 
 */
public class PurpleUI extends javax.swing.JFrame {
    int[][] sixesDecryptData = 
            {{2, 1, 3, 5, 4, 6},
            {6, 3, 5, 2, 1, 4},
            {1, 5, 4, 6, 2, 3},
            {4, 3, 2, 1, 6, 5},
            {3, 6, 1, 4, 5, 2},
            {2, 1, 6, 5, 3, 4},
            {6, 5, 4, 2, 1, 3},
            {3, 6, 1, 4, 5, 2},
            {5, 4, 2, 6, 3, 1},
            {4, 5, 3, 2, 1, 6},
            {2, 1, 4, 5, 6, 3},
            {5, 4, 6, 3, 2, 1},
            {3, 1, 2, 6, 4, 5},
            {4, 2, 5, 1, 3, 6},
            {1, 6, 2, 3, 5, 4},
            {5, 4, 3, 6, 1, 2},
            {6, 2, 5, 3, 4, 1},
            {2, 3, 4, 1, 5, 6},
            {1, 2, 3, 5, 6, 4},
            {3, 1, 6, 4, 2, 5},
            {6, 5, 1, 2, 4, 3},
            {1, 3, 6, 4, 2, 5},
            {6, 4, 5, 1, 3, 2},
            {4, 6, 1, 2, 5, 3},
            {5, 2, 4, 3, 6, 1}};
    
    int[][] twentiesDecryptData1=
            {{6, 19, 14, 1, 10, 4, 2, 7, 13, 9, 8, 16, 3, 18, 15, 11, 5, 12, 20, 17},
            {4, 5, 16, 17, 14, 1, 20, 15, 3, 8, 18, 11, 12, 13, 10, 19, 2, 6, 9, 7},
            {17, 1, 13, 6, 15, 11, 19, 12, 16, 18, 10, 3, 7, 14, 8, 20, 4, 9, 2, 5},
            {3, 14, 20, 4, 6, 16, 8, 19, 2, 12, 17, 9, 5, 1, 11, 10, 7, 13, 15, 18},
            {19, 6, 8, 20, 13, 5, 18, 4, 10, 3, 16, 15, 14, 12, 7, 2, 17, 11, 1, 9},
            {2, 11, 9, 14, 7, 19, 6, 3, 18, 13, 12, 8, 10, 15, 16, 17, 20, 4, 5, 1},
            {16, 7, 6, 18, 9, 10, 13, 1, 17, 2, 5, 4, 11, 19, 20, 14, 8, 15, 3, 12},
            {1, 20, 7, 16, 12, 14, 5, 18, 15, 10, 13, 6, 8, 3, 4, 9, 11, 17, 19, 2},
            {17, 9, 11, 8, 20, 18, 7, 14, 1, 16, 15, 5, 19, 2, 6, 12, 4, 10, 13, 3},
            {12, 8, 17, 9, 3, 20, 4, 10, 14, 5, 7, 18, 2, 16, 13, 6, 1, 19, 15, 11},
            {20, 1, 16, 11, 2, 17, 9, 4, 8, 15, 10, 13, 3, 18, 14, 5, 6, 7, 12, 19},
            {5, 4, 15, 2, 13, 19, 6, 16, 12, 14, 8, 7, 17, 10, 18, 3, 9, 1, 11, 20},
            {15, 17, 10, 19, 16, 2, 11, 8, 9, 7, 3, 14, 18, 13, 12, 1, 5, 20, 6, 4},
            {11, 12, 7, 3, 8, 15, 16, 6, 4, 20, 2, 5, 1, 9, 19, 18, 10, 14, 17, 13},
            {12, 16, 2, 7, 4, 8, 15, 19, 5, 1, 11, 9, 20, 17, 6, 14, 13, 3, 18, 10},
            {8, 15, 18, 1, 12, 11, 17, 14, 20, 16, 13, 19, 9, 7, 3, 4, 2, 5, 10, 6},
            {7, 3, 5, 18, 17, 13, 19, 20, 14, 11, 9, 10, 2, 6, 1, 15, 12, 16, 4, 8},
            {10, 13, 4, 14, 18, 3, 2, 17, 11, 19, 20, 1, 6, 12, 9, 7, 15, 8, 5, 16},
            {13, 7, 9, 12, 20, 16, 14, 10, 19, 6, 1, 2, 11, 4, 5, 3, 18, 17, 8, 15},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {9, 20, 12, 5, 10, 17, 1, 13, 7, 15, 4, 3, 16, 8, 18, 11, 19, 2, 14, 6},
            {18, 15, 2, 13, 1, 7, 10, 5, 19, 17, 6, 20, 9, 11, 12, 8, 3, 4, 16, 14},
            {16, 18, 19, 10, 11, 20, 5, 9, 1, 4, 12, 13, 7, 6, 17, 2, 14, 15, 3, 8},
            {5, 8, 1, 15, 19, 9, 12, 2, 6, 3, 14, 17, 4, 20, 16, 13, 18, 10, 7, 11},
            {14, 10, 4, 8, 9, 12, 3, 11, 17, 20, 19, 6, 15, 5, 2, 18, 16, 7, 1, 13}};
    
    int[][] twentiesDecryptData2=
            {{15, 9, 1, 5, 17, 19, 3, 2, 10, 8, 11, 18, 12, 16, 6, 13, 20, 4, 14, 7},
            {12, 6, 15, 2, 4, 9, 8, 16, 19, 17, 5, 11, 20, 7, 10, 18, 1, 14, 13, 3},
            {4, 18, 5, 8, 16, 1, 12, 15, 20, 14, 13, 17, 11, 2, 7, 9, 6, 3, 10, 19},
            {6, 11, 2, 20, 14, 7, 18, 12, 15, 3, 8, 5, 10, 1, 17, 19, 9, 16, 4, 13},
            {7, 2, 13, 3, 9, 4, 17, 14, 1, 12, 18, 20, 6, 11, 16, 15, 5, 8, 19, 10},
            {5, 17, 14, 7, 10, 9, 19, 20, 8, 13, 1, 2, 16, 3, 4, 12, 11, 18, 6, 15},
            {8, 4, 3, 11, 19, 13, 2, 9, 12, 16, 10, 17, 14, 15, 20, 6, 18, 1, 7, 5},
            {20, 1, 16, 10, 15, 8, 14, 11, 18, 5, 3, 7, 13, 17, 19, 4, 2, 9, 12, 6},
            {9, 8, 7, 15, 5, 2, 4, 13, 17, 1, 11, 6, 19, 18, 14, 10, 3, 20, 16, 12},
            {10, 12, 11, 18, 8, 16, 20, 17, 5, 6, 9, 3, 4, 19, 13, 7, 1, 14, 15, 2},
            {11, 7, 14, 4, 18, 20, 6, 1, 13, 19, 12, 15, 5, 9, 16, 2, 17, 10, 8, 3},
            {2, 3, 9, 10, 13, 14, 15, 16, 7, 11, 20, 12, 18, 6, 1, 5, 8, 17, 19, 4},
            {16, 10, 15, 1, 17, 3, 13, 9, 4, 7, 6, 8, 2, 14, 5, 11, 12, 19, 18, 20},
            {19, 16, 18, 12, 3, 13, 9, 10, 6, 2, 17, 14, 11, 4, 7, 20, 15, 5, 1, 8},
            {18, 14, 12, 19, 1, 7, 10, 6, 11, 15, 5, 9, 8, 20, 17, 4, 3, 13, 2, 16},
            {20, 3, 19, 2, 4, 5, 11, 14, 9, 10, 18, 16, 15, 12, 8, 7, 13, 6, 17, 1},
            {3, 6, 4, 14, 2, 12, 16, 5, 18, 20, 7, 19, 1, 15, 9, 8, 10, 11, 13, 17},
            {5, 15, 20, 9, 10, 17, 1, 19, 13, 12, 4, 2, 7, 6, 11, 14, 16, 8, 3, 18},
            {14, 20, 13, 17, 5, 18, 8, 4, 2, 15, 16, 1, 9, 19, 3, 6, 7, 10, 12, 11},
            {8, 11, 1, 6, 19, 14, 5, 18, 17, 3, 10, 13, 12, 20, 15, 16, 4, 2, 7, 9},
            {17, 19, 6, 1, 12, 15, 20, 7, 16, 9, 3, 11, 13, 10, 2, 18, 8, 4, 5, 14},
            {1, 5, 12, 20, 6, 11, 14, 8, 9, 7, 19, 4, 3, 13, 10, 17, 18, 16, 15, 2},
            {16, 8, 10, 13, 11, 6, 19, 5, 3, 4, 15, 20, 17, 2, 18, 1, 14, 7, 9, 12},
            {19, 13, 8, 16, 20, 10, 7, 1, 2, 18, 14, 6, 9, 5, 12, 3, 17, 15, 11, 4},
            {13, 1, 17, 15, 7, 4, 16, 3, 14, 5, 2, 10, 18, 8, 11, 9, 19, 12, 20, 6}};
    
    int[][] twentiesDecryptData3=
            {{7, 19, 11, 3, 20, 1, 10, 6, 16, 12, 17, 13, 8, 9, 4, 18, 5, 14, 15, 2},
            {15, 17, 14, 2, 12, 13, 8, 3, 1, 19, 9, 4, 10, 7, 11, 20, 16, 6, 18, 5},
            {2, 11, 20, 12, 1, 19, 4, 10, 9, 14, 6, 15, 13, 3, 7, 16, 18, 8, 5, 17},
            {16, 3, 12, 9, 4, 20, 6, 19, 18, 2, 5, 8, 14, 11, 10, 1, 15, 17, 13, 7},
            {12, 18, 16, 4, 9, 3, 15, 13, 6, 20, 8, 2, 7, 10, 5, 19, 14, 1, 17, 11},
            {13, 9, 5, 6, 8, 7, 12, 17, 14, 18, 20, 10, 2, 19, 11, 15, 4, 3, 1, 16},
            {4, 7, 2, 15, 17, 10, 19, 5, 8, 16, 1, 12, 3, 13, 6, 14, 20, 9, 11, 18},
            {9, 6, 4, 10, 18, 16, 8, 14, 5, 12, 17, 1, 20, 15, 13, 19, 2, 11, 7, 3},
            {5, 14, 18, 17, 13, 15, 11, 12, 7, 8, 3, 6, 1, 2, 20, 4, 9, 10, 16, 19},
            {11, 16, 9, 18, 3, 12, 5, 15, 10, 1, 14, 17, 2, 4, 19, 6, 8, 7, 13, 20},
            {19, 8, 3, 15, 14, 5, 1, 11, 2, 10, 12, 16, 18, 20, 17, 7, 13, 4, 9, 6},
            {1, 12, 17, 13, 9, 7, 14, 2, 15, 4, 5, 11, 6, 16, 3, 8, 18, 19, 20, 10},
            {3, 4, 10, 12, 1, 18, 2, 8, 14, 13, 19, 7, 16, 6, 15, 9, 17, 20, 5, 11},
            {9, 11, 6, 5, 10, 4, 17, 19, 13, 15, 7, 2, 12, 18, 14, 20, 1, 16, 8, 3},
            {8, 13, 14, 16, 19, 12, 20, 7, 10, 3, 15, 9, 4, 17, 1, 11, 5, 2, 6, 18},
            {18, 16, 15, 4, 2, 17, 13, 12, 6, 11, 20, 19, 14, 5, 9, 1, 8, 7, 3, 10},
            {14, 1, 7, 20, 6, 13, 16, 18, 12, 9, 4, 17, 5, 11, 2, 3, 10, 15, 19, 8},
            {17, 19, 1, 11, 7, 2, 18, 4, 3, 8, 10, 5, 15, 12, 16, 9, 6, 13, 20, 14},
            {10, 15, 2, 14, 11, 6, 7, 1, 16, 20, 13, 3, 9, 8, 18, 17, 19, 5, 12, 4},
            {20, 9, 8, 6, 12, 11, 2, 5, 4, 7, 16, 14, 17, 3, 15, 10, 13, 19, 18, 1},
            {11, 20, 13, 8, 16, 10, 18, 14, 19, 6, 15, 4, 1, 17, 7, 5, 3, 9, 2, 12},
            {16, 5, 10, 19, 4, 18, 15, 17, 1, 3, 2, 20, 11, 6, 8, 13, 7, 12, 14, 9},
            {6, 10, 19, 16, 5, 9, 1, 20, 17, 4, 11, 18, 7, 14, 13, 2, 12, 8, 3, 15},
            {8, 7, 5, 1, 15, 14, 9, 16, 11, 17, 18, 6, 19, 20, 3, 12, 4, 2, 10, 13},
            {13, 2, 17, 7, 14, 8, 3, 9, 20, 5, 16, 10, 6, 1, 12, 15, 11, 18, 4, 19}};
    
    int[][] sixesEncryptData=
            {{2,1,3,5,4,6},
            {5,4,2,6,3,1},
            {1,5,6,3,2,4},
            {4,3,2,1,6,5},
            {3,6,1,4,5,2},
            {2,1,5,6,4,3},
            {5,4,6,3,2,1},
            {3,6,1,4,5,2},
            {6,3,5,2,1,4},
            {5,4,3,1,2,6},
            {2,1,6,3,4,5},
            {6,5,4,2,1,3},
            {2,3,1,5,6,4},
            {4,2,5,1,3,6},
            {1,3,4,6,5,2},
            {5,6,3,2,1,4},
            {6,2,4,5,3,1},
            {4,1,2,3,5,6},
            {1,2,3,6,4,5},
            {2,5,1,4,6,3},
            {3,4,6,5,2,1},
            {1,5,2,4,6,3},
            {4,6,5,2,3,1},
            {3,4,6,1,5,2},
            {6,2,4,3,1,5}};
    
    int[][] twentiesEncryptData1=
            {{4,7,13,6,17,1,8,11,10,5,16,18,9,3,15,12,20,14,2,19},
            {6,17,9,1,2,18,20,10,19,15,12,13,14,5,8,3,4,11,16,7},
            {2,19,12,17,20,4,13,15,18,11,6,8,3,14,5,9,1,10,7,16},
            {14,9,1,4,13,5,17,7,12,16,15,10,18,2,19,6,11,20,8,3},
            {19,16,10,8,6,2,15,3,20,9,18,14,5,13,12,11,17,7,1,4},
            {20,1,8,18,19,7,5,12,3,13,2,11,10,4,14,15,16,9,6,17},
            {8,10,19,12,11,3,2,17,5,6,13,20,7,16,18,1,9,4,14,15},
            {1,20,14,15,7,12,3,13,16,10,17,5,11,6,9,4,18,8,19,2},
            {9,14,20,17,12,15,7,4,2,18,3,16,19,8,11,10,1,6,13,5},
            {17,13,5,7,10,16,11,2,4,8,20,1,15,9,19,14,3,12,18,6},
            {2,5,13,8,16,17,18,9,7,11,4,19,12,15,10,3,6,14,20,1},
            {18,4,16,2,1,7,12,11,17,14,19,9,5,10,3,8,13,15,6,20},
            {16,6,11,20,17,19,10,8,9,3,7,15,14,12,1,5,2,13,4,18},
            {13,11,4,9,12,8,3,5,14,17,1,2,20,18,6,7,19,16,15,10},
            {10,3,18,5,9,15,4,6,12,20,11,1,17,16,7,2,14,19,8,13},
            {4,17,15,16,18,20,14,1,13,19,6,5,11,8,2,10,7,3,12,9},
            {15,13,2,19,3,14,1,20,11,12,10,17,6,9,16,18,5,4,7,8},
            {12,7,6,3,19,13,16,18,15,1,9,14,2,4,17,20,8,5,10,11},
            {11,12,16,14,15,10,2,19,3,8,13,4,1,7,20,6,18,17,9,5},
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            {7,18,12,11,4,20,9,14,1,5,16,3,8,19,10,13,6,15,17,2},
            {5,3,17,18,8,11,6,16,13,7,14,15,4,20,2,19,10,1,9,12},
            {9,16,19,10,7,14,13,20,8,4,5,11,12,17,18,1,15,2,3,6},
            {3,8,10,13,1,9,19,2,6,18,20,7,16,11,4,15,12,17,5,14},
            {19,15,7,3,14,12,18,4,5,2,8,6,20,1,13,17,9,16,11,10}};
    
    int[][] twentiesEncryptData2=
            {{3,8,7,18,4,15,20,10,2,9,11,13,16,19,1,14,5,12,6,17},
            {17,4,20,5,11,2,14,7,6,15,12,1,19,18,3,8,10,16,9,13},
            {6,14,18,1,3,17,15,4,16,19,13,7,11,10,8,5,12,2,20,9},
            {14,3,10,19,12,1,6,11,17,13,2,8,20,5,9,18,15,7,16,4},
            {9,2,4,6,17,13,1,18,5,20,14,10,3,8,16,15,7,11,19,12},
            {11,12,14,15,1,19,4,9,6,5,17,16,10,3,20,13,2,18,7,8},
            {18,7,3,2,20,16,19,1,8,11,4,9,6,13,14,10,12,17,5,15},
            {2,17,11,16,10,20,12,6,18,4,8,19,13,7,5,3,14,9,15,1},
            {10,6,17,7,5,12,3,2,1,16,11,20,8,15,4,19,9,14,13,18},
            {17,20,12,13,9,10,16,5,11,1,3,2,15,18,19,6,8,4,14,7},
            {8,16,20,4,13,7,2,19,14,18,1,11,9,3,12,15,17,5,10,6},
            {15,1,2,20,16,14,9,17,3,4,10,12,5,6,7,8,18,13,19,11},
            {4,13,6,9,15,11,10,12,8,2,16,17,7,14,3,1,5,19,18,20},
            {19,10,5,14,18,9,15,20,7,8,13,4,6,12,17,2,11,3,1,16},
            {5,19,17,16,11,8,6,13,12,7,9,3,18,2,10,20,15,1,4,14},
            {20,4,2,5,6,18,16,15,9,10,7,14,17,8,13,12,19,11,3,1},
            {13,5,1,3,8,2,11,16,15,17,18,6,19,4,14,7,20,9,12,10},
            {7,12,19,11,1,14,13,18,4,5,15,10,9,16,2,17,6,20,8,3},
            {12,9,15,8,5,16,17,7,13,18,20,19,3,1,10,11,4,6,14,2},
            {3,18,10,17,7,4,19,1,20,11,2,13,12,6,15,16,9,8,5,14},
            {4,15,11,18,19,3,8,17,10,14,12,5,13,20,6,9,1,16,2,7},
            {1,20,13,12,2,5,10,8,9,15,6,3,14,7,19,18,16,17,11,4},
            {16,14,9,10,8,6,18,2,19,3,5,20,4,17,11,1,13,15,7,12},
            {8,9,16,20,14,12,7,3,13,6,19,15,2,11,18,4,17,10,1,5},
            {2,11,8,6,10,20,5,14,16,12,15,18,1,9,4,7,3,13,17,19}};

    int [][] twentiesEncryptData3=
            {{6,20,4,15,17,8,1,13,14,7,3,10,12,18,19,9,11,16,2,5},
            {9,4,8,12,20,18,14,7,11,13,15,5,6,3,1,17,2,19,10,16},
            {5,1,14,7,19,11,15,18,9,8,2,4,13,10,12,16,20,17,6,3},
            {16,10,2,5,11,7,20,12,4,15,14,3,19,13,17,1,18,9,8,6},
            {18,12,6,4,15,9,13,11,5,14,20,1,8,17,7,3,19,2,16,10},
            {19,13,18,17,3,4,6,5,2,12,15,7,1,9,16,20,8,10,14,11},
            {11,3,13,1,8,15,2,9,18,6,19,12,14,16,4,10,5,20,7,17},
            {12,17,20,3,9,2,19,7,1,4,18,10,15,8,14,6,11,5,16,13},
            {13,14,11,16,1,12,9,10,17,18,7,8,5,2,6,19,4,3,20,15},
            {10,13,5,14,7,16,18,17,3,9,1,6,19,11,8,2,12,4,15,20},
            {7,9,3,18,6,20,16,2,19,10,8,11,17,5,4,12,15,13,1,14},
            {1,8,15,10,11,13,6,16,5,20,12,2,4,7,9,14,3,17,18,19},
            {5,7,1,2,19,14,12,8,16,3,20,4,10,9,15,13,17,6,11,18},
            {17,12,20,6,4,3,11,19,1,5,2,13,9,15,10,18,7,14,8,16},
            {15,18,10,13,17,19,8,1,12,9,16,6,2,3,11,4,14,20,5,7},
            {16,5,19,4,14,9,18,17,15,20,10,8,7,13,3,2,6,1,12,11},
            {2,15,16,11,13,5,3,20,10,17,14,9,6,1,18,7,12,8,19,4},
            {3,6,9,8,12,17,5,10,16,11,4,14,18,20,13,15,1,7,2,19},
            {8,3,12,20,18,6,7,14,13,1,5,19,11,4,2,9,16,15,17,10},
            {20,7,14,9,8,4,10,3,2,16,6,5,17,12,15,11,13,19,18,1},
            {13,19,17,12,16,10,15,4,18,6,1,20,3,8,11,5,14,7,9,2},
            {9,11,10,5,2,14,17,15,20,3,13,18,16,19,7,1,8,6,4,12},
            {7,16,19,10,5,1,13,18,6,2,11,17,15,14,20,4,9,12,3,8},
            {4,18,15,17,3,12,2,1,7,19,9,16,20,6,5,8,10,11,13,14},
            {14,2,7,19,10,13,4,6,8,12,17,15,1,5,16,11,3,18,20,9}};


    /**
     * Creates new form PurpleUI
     */
    public PurpleUI() {
        initComponents();
        bulkInputTextArea.addMouseListener(new ContextMenuMouseListener()); 
        outputTextArea.addMouseListener(new ContextMenuMouseListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encryptDecryptButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sixesStartBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        twentiesStartBox1 = new javax.swing.JComboBox();
        twentiesStartBox2 = new javax.swing.JComboBox();
        twentiesStartBox3 = new javax.swing.JComboBox();
        motionOrderComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alphabetTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sixesBox = new javax.swing.JTextField();
        twentiesBox1 = new javax.swing.JTextField();
        twentiesBox2 = new javax.swing.JTextField();
        twentiesBox3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        charactersTyped = new javax.swing.JTextField();
        freezeCheckBox = new javax.swing.JCheckBox();
        decryptButton = new javax.swing.JRadioButton();
        encryptButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bulkInputTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        bulkTranslateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        inputTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTextAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(inputTextArea);

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        jLabel1.setText("Input Text (\"Typewriter\" Entry)");

        jLabel2.setText("Output Text");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Starting Conditions"));

        sixesStartBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        sixesStartBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixesStartBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Sixes:");

        jLabel4.setText("Twenties:");

        twentiesStartBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        twentiesStartBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentiesStartBox1ActionPerformed(evt);
            }
        });

        twentiesStartBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        twentiesStartBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentiesStartBox2ActionPerformed(evt);
            }
        });

        twentiesStartBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        twentiesStartBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twentiesStartBox3ActionPerformed(evt);
            }
        });

        motionOrderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FMS", "FSM", "SMF", "SFM", "MFS", "MSF" }));

        jLabel5.setText("Motion Order");

        jLabel6.setText("Alphabet:");

        alphabetTextField.setText("AEIOUYBCDFGHJKLMNPQRSTVWXZ");
        alphabetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alphabetTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(alphabetTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(sixesStartBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(twentiesStartBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(twentiesStartBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(twentiesStartBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(motionOrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixesStartBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentiesStartBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentiesStartBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentiesStartBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motionOrderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alphabetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Machine State"));

        jLabel7.setText("Sixes:");

        jLabel8.setText("Twenties:");

        sixesBox.setEditable(false);
        sixesBox.setText("1");

        twentiesBox1.setEditable(false);
        twentiesBox1.setText("1");

        twentiesBox2.setEditable(false);
        twentiesBox2.setText("1");

        twentiesBox3.setEditable(false);
        twentiesBox3.setText("1");

        jLabel9.setText("Valid Characters:");

        charactersTyped.setEditable(false);
        charactersTyped.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        charactersTyped.setText("0");
        charactersTyped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charactersTypedActionPerformed(evt);
            }
        });

        freezeCheckBox.setText("Freeze Switches");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(charactersTyped, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sixesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(twentiesBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentiesBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twentiesBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(freezeCheckBox)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentiesBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentiesBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twentiesBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(freezeCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(charactersTyped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        encryptDecryptButtonGroup.add(decryptButton);
        decryptButton.setSelected(true);
        decryptButton.setText("Decrypt");

        encryptDecryptButtonGroup.add(encryptButton);
        encryptButton.setText("Encrypt");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Purple Cypher Machine v. 1.3 by Daniel Alt");

        bulkInputTextArea.setColumns(20);
        bulkInputTextArea.setRows(5);
        jScrollPane3.setViewportView(bulkInputTextArea);

        jLabel11.setText("Input Text (Bulk Translate)");

        bulkTranslateButton.setText("Translate Now");
        bulkTranslateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulkTranslateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bulkTranslateButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decryptButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(encryptButton)
                                .addGap(105, 105, 105)
                                .addComponent(resetButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(bulkTranslateButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(encryptButton)
                                .addComponent(decryptButton)
                                .addComponent(resetButton))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void inputTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextAreaKeyPressed
        //Process data entered character-by-character
        
        /* Retrieve and declare variables */
        char inputkey=evt.getKeyChar(); //key typed in input box
        int totalcharacters=Integer.parseInt(charactersTyped.getText()); //total number of characters typed
        int sixes=Integer.parseInt(sixesBox.getText()); //value of the sixes switch
        int fasttwenties, medtwenties, slowtwenties;
        String alphabet=alphabetTextField.getText();
        String outputstring=outputTextArea.getText();
        boolean decrypt=decryptButton.isSelected();
        char outputchar;
        /*For reference, list of switching options: FMS,FSM,SMF,SFM,MFS,MSF
        The speedOptions array specifies, in order, the positions
        of the fast, medium, and slow twenties wheel */
        int[][] speedOptions={{0,1,2},{0,2,1},{2,1,0},{1,2,0},{1,0,2},{2,0,1}};
        int[] speedSettings=speedOptions[motionOrderComboBox.getSelectedIndex()];
        ArrayList<javax.swing.JTextField> boxList = new ArrayList<javax.swing.JTextField>();
        boxList.add(twentiesBox1);
        boxList.add(twentiesBox2);
        boxList.add(twentiesBox3);
        fasttwenties=Integer.parseInt(boxList.get(speedSettings[0]).getText());
        medtwenties=Integer.parseInt(boxList.get(speedSettings[1]).getText());
        slowtwenties=Integer.parseInt(boxList.get(speedSettings[2]).getText());
        
        
        if (alphabet.indexOf(Character.toUpperCase(inputkey)) != -1){
            /*If typed input is a letter, process it */
            int letterIndex=alphabet.indexOf(Character.toUpperCase(inputkey))+1; //Letter index 1=first, 2=second
            //Determine Output Letter
            if (letterIndex<=6){
                if (decrypt) {
                    outputchar=alphabet.charAt(sixesDecryptData[sixes-1][letterIndex-1]-1);
                } else {
                    outputchar=alphabet.charAt(sixesEncryptData[sixes-1][letterIndex-1]-1);
                }
                outputstring=outputstring + outputchar;
            } else {
                if (decrypt) {
                    int tSwitch3Out=twentiesDecryptData3[Integer.parseInt(twentiesBox3.getText())-1][letterIndex-7];
                    int tSwitch2Out=twentiesDecryptData2[Integer.parseInt(twentiesBox2.getText())-1][tSwitch3Out-1];
                    int tSwitch1Out=twentiesDecryptData1[Integer.parseInt(twentiesBox1.getText())-1][tSwitch2Out-1];
                    outputchar=alphabet.charAt(tSwitch1Out+5);
                } else {
                    int tSwitch1Out=twentiesEncryptData1[Integer.parseInt(twentiesBox1.getText())-1][letterIndex-7];
                    int tSwitch2Out=twentiesEncryptData2[Integer.parseInt(twentiesBox2.getText())-1][tSwitch1Out-1];
                    int tSwitch3Out=twentiesEncryptData3[Integer.parseInt(twentiesBox3.getText())-1][tSwitch2Out-1];
                    outputchar=alphabet.charAt(tSwitch3Out+5);
                }
                outputstring=outputstring + outputchar;}
            
            outputTextArea.setText(outputstring);
            
            /*Advance Switches*/
            totalcharacters++;
            charactersTyped.setText(String.valueOf(totalcharacters));
            
            if (!freezeCheckBox.isSelected()){ //Only if machine is not frozen
                if (sixes == 24 && medtwenties==25){
                    slowtwenties=1+(slowtwenties)%25;
                    boxList.get(speedSettings[2]).setText(Integer.toString(slowtwenties));
                } else if (sixes==25) {
                    medtwenties=1+(medtwenties)%25;
                    boxList.get(speedSettings[1]).setText(Integer.toString(medtwenties));
                } else {
                    fasttwenties=1+(fasttwenties)%25;
                    boxList.get(speedSettings[0]).setText(Integer.toString(fasttwenties));
                }
                sixes=1+(sixes)%25;

                sixesBox.setText(Integer.toString(sixes));
            }

            
        } else if (evt.getKeyCode()== java.awt.event.KeyEvent.VK_BACK_SPACE){
            /*If it's a backspace, back up*/
            if (totalcharacters==0) return;
            if ("\n".equals(outputstring.substring(outputstring.length()-1,outputstring.length())) ||
                   " ".equals(outputstring.substring(outputstring.length()-1,outputstring.length())) ){
                outputstring=outputstring.substring(0,outputstring.length()-1);
                outputTextArea.setText(outputstring);
                return;
            }
            outputstring=outputstring.substring(0,outputstring.length()-1);
            outputTextArea.setText(outputstring);
            totalcharacters--;
            charactersTyped.setText(String.valueOf(totalcharacters));

            if (sixes==1 && medtwenties==1) {
                medtwenties=25;
                boxList.get(speedSettings[1]).setText(Integer.toString(medtwenties));
            } else if (sixes==25 && medtwenties==25){
                if (slowtwenties==1){slowtwenties=25;} else {slowtwenties--;}
                boxList.get(speedSettings[2]).setText(Integer.toString(slowtwenties));
            } else {
                if (fasttwenties==1) {fasttwenties=25;} else {fasttwenties--;}
                boxList.get(speedSettings[0]).setText(Integer.toString(fasttwenties));
            }
            if (sixes==1){sixes=25;} else {sixes--;}
            sixesBox.setText(Integer.toString(sixes));
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            //Process returns in typewriter style input
            outputstring=outputstring + "\n";
            outputTextArea.setText(outputstring);
        } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE) {
            //Process spaces
            outputstring=outputstring + " ";
            outputTextArea.setText(outputstring);
        }
        
    }//GEN-LAST:event_inputTextAreaKeyPressed

    private void alphabetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alphabetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alphabetTextFieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        outputTextArea.setText("");
        inputTextArea.setText("");
        sixesBox.setText(Integer.toString(sixesStartBox.getSelectedIndex()+1));
        twentiesBox1.setText(Integer.toString(twentiesStartBox1.getSelectedIndex()+1));        
        twentiesBox2.setText(Integer.toString(twentiesStartBox2.getSelectedIndex()+1));        
        twentiesBox3.setText(Integer.toString(twentiesStartBox3.getSelectedIndex()+1));
        charactersTyped.setText("0");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void charactersTypedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charactersTypedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charactersTypedActionPerformed

    private void sixesStartBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixesStartBoxActionPerformed
        sixesBox.setText(Integer.toString(sixesStartBox.getSelectedIndex()+1));
    }//GEN-LAST:event_sixesStartBoxActionPerformed

    private void twentiesStartBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentiesStartBox1ActionPerformed
        twentiesBox1.setText(Integer.toString(twentiesStartBox1.getSelectedIndex()+1));
    }//GEN-LAST:event_twentiesStartBox1ActionPerformed

    private void twentiesStartBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentiesStartBox2ActionPerformed
        twentiesBox2.setText(Integer.toString(twentiesStartBox2.getSelectedIndex()+1));
    }//GEN-LAST:event_twentiesStartBox2ActionPerformed

    private void twentiesStartBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twentiesStartBox3ActionPerformed
        twentiesBox3.setText(Integer.toString(twentiesStartBox3.getSelectedIndex()+1));
    }//GEN-LAST:event_twentiesStartBox3ActionPerformed
   
    private void bulkTranslateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulkTranslateButtonActionPerformed
       //Process bulk text data
        
        /*Retrieve and declare variables*/
        int sixes=Integer.parseInt(sixesBox.getText()); //value of the sixes switch
        int fasttwenties, medtwenties, slowtwenties;
        String alphabet=alphabetTextField.getText();
        boolean decrypt=decryptButton.isSelected();
        int totalcharacters=0;
        int[][] speedOptions={{0,1,2},{0,2,1},{2,1,0},{1,2,0},{1,0,2},{2,0,1}};
        int[] speedSettings=speedOptions[motionOrderComboBox.getSelectedIndex()];
        ArrayList<javax.swing.JTextField> boxList = new ArrayList<javax.swing.JTextField>();
        boxList.add(twentiesBox1);
        boxList.add(twentiesBox2);
        boxList.add(twentiesBox3);
        fasttwenties=Integer.parseInt(boxList.get(speedSettings[0]).getText());
        medtwenties=Integer.parseInt(boxList.get(speedSettings[1]).getText());
        slowtwenties=Integer.parseInt(boxList.get(speedSettings[2]).getText());
        String inputstring=bulkInputTextArea.getText();
        String outputstring="";
        char outputchar;
        char inputkey;
        
        for (int i=0; i<inputstring.length(); i++){
            inputkey=inputstring.charAt(i);
            if (alphabet.indexOf(Character.toUpperCase(inputkey)) != -1){
                /*If input character is a letter in the source alphabet, process it*/
                int letterIndex=alphabet.indexOf(Character.toUpperCase(inputkey))+1;
                //Determine Output Letter
                if (letterIndex<=6){
                    if (decrypt) {
                        outputchar=alphabet.charAt(sixesDecryptData[sixes-1][letterIndex-1]-1);
                    } else {
                        outputchar=alphabet.charAt(sixesEncryptData[sixes-1][letterIndex-1]-1);
                    }
                    outputstring=outputstring+outputchar;
                } else {
                    if (decrypt) {
                        int tSwitch3Out=twentiesDecryptData3[Integer.parseInt(twentiesBox3.getText())-1][letterIndex-7];
                        int tSwitch2Out=twentiesDecryptData2[Integer.parseInt(twentiesBox2.getText())-1][tSwitch3Out-1];
                        int tSwitch1Out=twentiesDecryptData1[Integer.parseInt(twentiesBox1.getText())-1][tSwitch2Out-1];
                        outputchar=alphabet.charAt(tSwitch1Out+5);
                    } else {
                        int tSwitch1Out=twentiesEncryptData1[Integer.parseInt(twentiesBox1.getText())-1][letterIndex-7];
                        int tSwitch2Out=twentiesEncryptData2[Integer.parseInt(twentiesBox2.getText())-1][tSwitch1Out-1];
                        int tSwitch3Out=twentiesEncryptData3[Integer.parseInt(twentiesBox3.getText())-1][tSwitch2Out-1];
                        outputchar=alphabet.charAt(tSwitch3Out+5);
                    }
                outputstring=outputstring + outputchar;
                }
                
                /*Advance Switches*/
                totalcharacters++;
                if (!freezeCheckBox.isSelected()){ //Only if machine is not frozen
                    if (sixes == 24 && medtwenties==25){
                        slowtwenties=1+(slowtwenties)%25;
                        boxList.get(speedSettings[2]).setText(Integer.toString(slowtwenties));
                    } else if (sixes==25) {
                        medtwenties=1+(medtwenties)%25;
                        boxList.get(speedSettings[1]).setText(Integer.toString(medtwenties));
                    } else {
                        fasttwenties=1+(fasttwenties)%25;
                        boxList.get(speedSettings[0]).setText(Integer.toString(fasttwenties)); 
                    }
                    sixes=1+(sixes)%25;
                    sixesBox.setText(Integer.toString(sixes));

                }
            } else if (inputkey=='\n'){
                outputstring=outputstring+"\n";
            } else if (inputkey==' '){
                outputstring=outputstring+" ";
            }
            
        }
        outputTextArea.setText(outputstring);
        charactersTyped.setText(String.valueOf(totalcharacters));
        
    }//GEN-LAST:event_bulkTranslateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PurpleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurpleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurpleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurpleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurpleUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alphabetTextField;
    private javax.swing.JTextArea bulkInputTextArea;
    private javax.swing.JButton bulkTranslateButton;
    private javax.swing.JTextField charactersTyped;
    private javax.swing.JRadioButton decryptButton;
    private javax.swing.JRadioButton encryptButton;
    private javax.swing.ButtonGroup encryptDecryptButtonGroup;
    private javax.swing.JCheckBox freezeCheckBox;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox motionOrderComboBox;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField sixesBox;
    private javax.swing.JComboBox sixesStartBox;
    private javax.swing.JTextField twentiesBox1;
    private javax.swing.JTextField twentiesBox2;
    private javax.swing.JTextField twentiesBox3;
    private javax.swing.JComboBox twentiesStartBox1;
    private javax.swing.JComboBox twentiesStartBox2;
    private javax.swing.JComboBox twentiesStartBox3;
    // End of variables declaration//GEN-END:variables

}
