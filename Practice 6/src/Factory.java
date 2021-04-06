class main
{
    public static void main(String[] args) {
        Factory factory = new Factory();
        game PCgame = factory.create("computerGame");
        game PS5game = factory.create("consoleGame");
        PCgame.play();
        PS5game.play();
    }
}

interface game
{
    void play();
}

class computerGame implements game
{
    @Override
    public void play() {
        System.out.println("playing on PC");
    }
}

class consoleGame implements game
{
    @Override
    public void play() {
        System.out.println("playing on console");
    }
}

class Factory
{
    public game create(String typeOfGame)
    {
     switch (typeOfGame)
     {
         case "computerGame" : return new computerGame();
         case "consoleGame" : return new consoleGame();
         default: return null;
     }
    }
}
