import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        runGame();
    }
    public static void runGame() {
        Room currentRoom = World.buildWorld();
        Scanner input = new Scanner(System.in);

        String command;
        do {
            System.out.println(currentRoom);
            System.out.print("Where do you want to go? ");
            command = input.nextLine();

            switch(command) {
                case "e":
                case "w":
                case "n":
                case "s":
                case "u":
                case "d":
                    currentRoom = currentRoom.getExit(command.charAt(0));
                    break;
                case "x":
                    System.out.println("Bye! Thanks for walking through my game.");
                    break;
                default:
                System.out.println("I don't know what you mean.");
                }
            } while(!command.equals("x"));

            input.close();
        }
     }

//System.out.println(currentRoom);
//System.out.println("\nNow we'll move east!");
//currentRoom = currentRoom.getExit('e');
//System.out.println(currentRoom);
//System.out.println("\nNow we'll move west!");
//currentRoom = currentRoom.getExit('w');
//System.out.println(currentRoom);