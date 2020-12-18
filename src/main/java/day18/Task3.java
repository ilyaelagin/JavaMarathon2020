package day18;

/**
 * Вам необходимо создать двоичное дерево поиска, изображенное на картинке выше.
 * Для этого создайте класс “Узел” (англ. Node), объекты которого будут содержать само значение узла
 * и поля-ссылки на два других узла (левый и правый сын).
 * Затем, создайте корневой (англ. root) узел (со значением 20).
 * После этого, необходимо реализовать метод, который будет добавлять новые узлы в ваше дерево.
 * Этот метод должен принимать в качестве аргументов добавляемое значение и ссылку на корень дерева.
 * Проходясь по дереву, он должен вставлять новый узел в правильное место дерева.
 * Когда двоичное дерево, изображенное выше, будет создано, необходимо используя рекурсию вывести в
 * консоль все числа из этого двоичного дерева поиска в отсортированном виде. Ваше рекурсивное решение
 * должно работать для любого корректного двоичного дерева поиска. Этот алгоритм называется “обход в глубину”
 * (иногда называют “поиск в глубину”).
 * Ваш рекурсивный метод (пусть он будет называться dfs) должен в качестве единственного аргумента принимать
 * ссылку на корень дерева (root).
 * Вызов: dfs(root);
 * Вывод в консоль: 5 8 11 14 15 16 18 20 22 23 24 27 150
 */
public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        addNewNode(14, root);
        addNewNode(23, root);
        addNewNode(22, root);
        addNewNode(27, root);
        addNewNode(24, root);
        addNewNode(150, root);
        addNewNode(11, root);
        addNewNode(5, root);
        addNewNode(8, root);
        addNewNode(16, root);
        addNewNode(15, root);
        addNewNode(18, root);

        dfs(root);
    }

    public static void addNewNode(int value, Node node) {
        if (value < node.value) {
            if (node.left != null) {
                addNewNode(value, node.left);
            } else {
                node.left = new Node(value);
            }
        } else {
            if (node.right != null) {
                addNewNode(value, node.right);
            } else {
                node.right = new Node(value);
            }
        }
    }

    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(" " + node.value);
            dfs(node.right);
        }
    }

}