public class DiameterOfTree {
    static int diameter;
    static int height(String[] arr,int i){
        if(i>=arr.length||arr[i].equals("N")){
            return 0;
        }
        int left=height(arr,2*i+1);
        int right=height(arr,2*i+2);
        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }
    public static int diameterOfBinaryTree(String treeStr){
        String[] arr=treeStr.split(" ");
        diameter=0;
        height(arr,0);
        return diameter;
    }
    public static void main(String[] args){
        String treeStr=args[0];
        System.out.println(diameterOfBinaryTree(treeStr));
    }
}
