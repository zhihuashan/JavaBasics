package UnionFind;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/15 19:31
 * @Version 1.0
 */
// 并查集
public class UnionFind1 {
    // 数组
    private int[] id;
    // 数据个数
    private int count;
    public UnionFind1(int n){
        count = n;
        id = new int[n];
        // 初始化,每个id[i]指向自己,没有合并的元素
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }
}
