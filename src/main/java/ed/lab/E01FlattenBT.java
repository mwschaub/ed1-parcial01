package ed.lab;

public class E01FlattenBT {
    public void flatten(TreeNode<Integer> root) {
        if (root == null) return;

        // Recorrer el árbol en preorden para facilitar el ordenamiento
        TreeNode<Integer> current = root;
        while (current != null) {
            if (current.left != null) {
                // Encontrar el anterior del nodo
                TreeNode<Integer> anterior = current.left;
                while (anterior.right != null) {
                    anterior = anterior.right;
                }

                //decirle el anterior
                anterior.right = current.right;

                current.right = current.left; // mover el arbol
                current.left = null;
            }

            // Avanza para enlistar
            current = current.right;
        }
    }
}