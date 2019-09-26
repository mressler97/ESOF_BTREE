/* Michael Ressler And Chris Tompkins
 * ESOF 322 / Homework #3
 * 9/26/19
 */

public class Node {

    public int key;
    public Node left, right;

    public Node(int item)
    {
        /* new node created with integer
         * sent from BinaryTree with children set to null
         */
        key = item;
        left = right = null;
    }


}
