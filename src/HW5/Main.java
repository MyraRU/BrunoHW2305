package HW5;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        System.out.println(tree.height + " " + tree.wight);
        tree.grow();
        System.out.println(tree.height + " " + tree.wight + "\n");

        Bush bush = new Bush();
        System.out.println(bush.height + " " + bush.wight);
        bush.grow();
        System.out.println(bush.height + " " + bush.wight + "\n");

        Plant[] plants = new Plant[2];
        plants[0] = tree;
        plants[1] = bush;

        for (int i = 0; i < plants.length; i++) {
            plants[i].grow();
        }

    }
}
