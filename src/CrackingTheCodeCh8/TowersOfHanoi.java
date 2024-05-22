package CrackingTheCodeCh8;

public class TowersOfHanoi {
    public static void tower(int n, char fromTower, char toTower, char auxTower){
        if (n == 1) { // Base case: only one disk to move
            System.out.println("Move disk 1 from " + fromTower + " to " + toTower);
            return;
        }
        // Move top n-1 disks from source to auxiliary, so they are out of the way
        tower(n - 1, fromTower, auxTower, toTower);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);

        // Move the n-1 disks from auxiliary to destination
        tower(n - 1, auxTower, toTower, fromTower);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        tower(n, 'A', 'C', 'B'); // Names of the towers A, B, C
    }
}
