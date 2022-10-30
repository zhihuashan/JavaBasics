package UnionFind;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/15 17:14
 * @Version 1.0
 */
// 并查集
public class UnionFind {
    private int[] id;
    private int count;
    public UnionFind(int n){
        count = n;
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }
}
