/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) 
            return "";

        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node == null){
                result.append("#$");
            }else{
                result.append(node.val+"$");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return result.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;

        String[] Snodes = data.split("\\$");
        Queue<TreeNode> q = new LinkedList<>();

        TreeNode root = new TreeNode(Integer.parseInt(Snodes[0]));
        q.offer(root);

        for(int index = 1; index < Snodes.length; index++){
            TreeNode parent = q.poll();

            if(!Snodes[index].equals("#")){
                TreeNode left = new TreeNode(Integer.parseInt(Snodes[index]));
                parent.left = left;
                q.offer(left);
            }

            if(++index < Snodes.length && !Snodes[index].equals("#")){
                TreeNode right = new TreeNode(Integer.parseInt(Snodes[index]));
                parent.right = right;
                q.offer(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));