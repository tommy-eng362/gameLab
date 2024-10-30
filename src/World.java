
	public class World {
    // Builds the game world.
    // Returns the room the player starts in.
    public static Room buildWorld() {

    Room entrRoom = new Room("You are at the entrance.");
    Room livRoom = new Room("You are in the living room.");
    Room diningRoom = new Room("You are in the dining room.");
    Room kitchenRoom = new Room("You are in the kitchen.");
    Room bathRoom = new Room("You are in the bathroom");
    Room basementRoom = new Room("You are in the basement");
    Room upStairs = new Room("You are upstairs");
    Room bedRoom = new Room("You are in the bedroom");
    
    entrRoom.addExit('e',livRoom);
    entrRoom.addExit('w',diningRoom);
    entrRoom.addExit('u',upStairs);

    livRoom.addExit('w',entrRoom);
    livRoom.addExit('n',kitchenRoom);

    diningRoom.addExit('e',entrRoom);
    diningRoom.addExit('n',bathRoom);

    bathRoom.addExit('s', diningRoom);

    kitchenRoom.addExit('s',livRoom);
    kitchenRoom.addExit('d',basementRoom);

    basementRoom.addExit('u', kitchenRoom);

    upStairs.addExit('n',bedRoom);
    upStairs.addExit('d',entrRoom);

    bedRoom.addExit('s',upStairs);

    return entrRoom;
    }
}

