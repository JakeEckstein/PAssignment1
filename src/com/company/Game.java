package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Position> players = new ArrayList<>();
    private Team userTeam;

    // method to allow user to pick their team, given these names
    public void pickTeam() {
        Team Heat = new Team("Heat");
        Team Celtics = new Team("Celtics");
        Team Lakers = new Team("Lakers");
        Team Bucks = new Team("Bucks");
        Team Suns = new Team("Suns");
        Team Bulls = new Team("Bulls");
        Team Jazz = new Team("Jazz");
        Team Hawks = new Team("Hawks");
        Team Hornets = new Team("Hornets");
        Team Knicks = new Team("Knicks");
// adding teams to the ArrayList teams
        teams.add(Heat);
        teams.add(Celtics);
        teams.add(Lakers);
        teams.add(Bucks);
        teams.add(Suns);
        teams.add(Bulls);
        teams.add(Jazz);
        teams.add(Hawks);
        teams.add(Hornets);
        teams.add(Knicks);

        // initial print statements
        System.out.println("Welcome to NBA manager");
        System.out.println("Please select a team name");
        System.out.println("-------------------------------");
        System.out.println("Heat, Celtics, Lakers, Bucks, Suns, Bulls, Jazz, Hawks, Hornets, Knicks");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Team teamForRemoval = null;
        // enhanced for loop for setting users team and taking it off team list
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                teamForRemoval = team;
                userTeam = new Team(name);
                Position manager = new Position(0, 0, "Manager", "user");
                userTeam.players.add(manager);
            }
        }
        teams.remove(teamForRemoval);


    }

    // prints instructions for user to follow
    public void printInstructions() {
        System.out.println("Instructions:");
        System.out.println("------------------");
        System.out.println("please select five players, one per position, the total value of players picked must be under $100");
        System.out.println("The team you have selected is the: " + userTeam.getName());
        System.out.println("");
    }

    // creates the print player experience for user
    public void pickPlayers() {

        //instanciating players
        Position DamianLilard = new Position(40, 100, "Point Guard", "Damian Lilard");
        Position StephenCurry = new Position(40, 100, "Point Guard", "Stephen Curry");
        Position KyrieIrving = new Position(30, 90, "Point Guard", "Kyrie Irving");
        Position ChrisPaul = new Position(30, 90, "Point Guard", "Chris Paul");
        Position SteveNash = new Position(20, 80, "Point Guard", "Steve Nash");
        Position JasonKidd = new Position(20, 80, "Point Guard", "Jason Kidd");
        Position CollinSexton = new Position(10, 70, "Point Guard", "Collin Sexton");
        Position KyleLowry = new Position(10, 70, "Point Guard", "Kyle Lowry");
        Position LukaDoncic = new Position(5, 60, "Point Guard", "Luka Doncic");
        Position MagicJohnson = new Position(5, 60, "Point Guard", "Magic Johnson");
        Position JrueHoliday = new Position(5, 60, "Point Guard", "Jrue Holiday");

        Position JimmyButler = new Position(40, 100, "Shooting Guard", "Jimmy Butler");
        Position DwayneWade = new Position(40, 100, "Shooting Guard", "Dwayne Wade");
        Position DonovanMitchell = new Position(30, 90, "Shooting Guard", "Donovan Mitchell");
        Position JRSmith = new Position(30, 90, "Shooting Guard", "JR Smith");
        Position ZachLavine = new Position(20, 80, "Shooting Guard", "Zach Lavine");
        Position JaysonTatum = new Position(20, 80, "Shooting Guard", "Jason Tatum");
        Position DevinBooker = new Position(10, 70, "Shooting Guard", "Devin Booker");
        Position JamesHarden = new Position(10, 70, "Shooting Guard", "James Harden");
        Position ShaiAlexander = new Position(5, 60, "Shooting Guard", "Shai Alexander");
        Position DemarDeRozan = new Position(5, 60, "Shooting Guard", "Demar DeRozan");
        Position DerickRose = new Position(5, 60, "Shooting Guard", "Derick Rose");


        Position GiannisAntetokoumpo = new Position(40, 100, "Samll Forward", "Giannis Antetokoumpo");
        Position KwahiLeonard = new Position(40, 100, "Small Forward", "Kwahi Leonard");
        Position LebronJames = new Position(30, 90, "Small Forward", "Lebron James");
        Position PaulGeorge = new Position(30, 90, "Small Forward", "Paul George");
        Position JeramiGrant = new Position(20, 80, "Small Forward", "Jerami Grant");
        Position JuliusRandle = new Position(20, 80, "Small Forward", "Julius Randle");
        Position JaylenBrown = new Position(10, 70, "Small Forward", "Jaylen Brown");
        Position ChristianWood = new Position(10, 70, "Small Forward", "Christian Wood");
        Position GordonHayWord = new Position(5, 60, "Small Forward", "Gordon Hayward");
        Position DamontasSabonis = new Position(5, 60, "Small Forward", "Damontas Sabonis");

        Position JohnCollins = new Position(40, 100, "Power Forward", "John Collins");
        Position ZionWilliamson = new Position(40, 100, "Power Forward", "Zion Williamson");
        Position BamAdebayo = new Position(30, 90, "Power Forward", "Bam Adebayo");
        Position KarlTowns = new Position(30, 90, "Power Forward", "Karl Towns");
        Position AndrewWiggins = new Position(20, 80, "Power Forward", "Andrew Wiggins");
        Position BojanBogdanovic = new Position(20, 80, "Power Forward", "Bojan Bogdanovic");
        Position BrandonIngram = new Position(10, 70, "Power Forward", "Brandon Ingram");
        Position JoelAnthony = new Position(10, 70, "Power Forward", "Joel Anthony");
        Position PascalSiakam = new Position(5, 60, "Power Forward", "Pascal Siakam");
        Position TobiasHarris = new Position(5, 60, "Power Forward", "Tobias Harris");

        Position JoelEmbiid = new Position(40, 100, "Center", "Joel Embiid");
        Position RudyGobert = new Position(40, 100, "Center", "Rudy Gobert");
        Position ClintCapela = new Position(30, 90, "Center", "Clint Capela");
        Position HassanWhiteSide = new Position(30, 90, "Center", "Hassan WhiteSide");
        Position JaredAllen = new Position(20, 80, "Center", "Jared Allen");
        Position DeandreAyton = new Position(20, 80, "Center", "Deandre Ayton");
        Position AndreDrummond = new Position(10, 70, "Center", "Andre Drummond");
        Position AnthonyDavis = new Position(10, 70, "Center", "Anthony Davis");
        Position MarcGasol = new Position(5, 60, "Center", "Marc Gasol");
        Position PauGasol = new Position(5, 60, "Center", "Pau Gasol");

        //Adding players to list

        //PointGuards
        players.add(DamianLilard);
        players.add(StephenCurry);
        players.add(KyrieIrving);
        players.add(ChrisPaul);
        players.add(SteveNash);
        players.add(JasonKidd);
        players.add(CollinSexton);
        players.add(KyleLowry);
        players.add(LukaDoncic);
        players.add(MagicJohnson);
        players.add(JrueHoliday);

        //Shooting guards
        players.add(JimmyButler);
        players.add(DwayneWade);
        players.add(DonovanMitchell);
        players.add(JRSmith);
        players.add(ZachLavine);
        players.add(JaysonTatum);
        players.add(DevinBooker);
        players.add(JamesHarden);
        players.add(ShaiAlexander);
        players.add(DemarDeRozan);
        players.add(DerickRose);

        //Small Forwards
        players.add(GiannisAntetokoumpo);
        players.add(KwahiLeonard);
        players.add(LebronJames);
        players.add(PaulGeorge);
        players.add(JeramiGrant);
        players.add(JuliusRandle);
        players.add(JaylenBrown);
        players.add(ChristianWood);
        players.add(DamontasSabonis);
        players.add(GordonHayWord);

        //Power Forwards
        players.add(JohnCollins);
        players.add(ZionWilliamson);
        players.add(BamAdebayo);
        players.add(KarlTowns);
        players.add(AndrewWiggins);
        players.add(BojanBogdanovic);
        players.add(BrandonIngram);
        players.add(JoelAnthony);
        players.add(TobiasHarris);
        players.add(PascalSiakam);

        //Centers
        players.add(JoelEmbiid);
        players.add(RudyGobert);
        players.add(ClintCapela);
        players.add(HassanWhiteSide);
        players.add(JaredAllen);
        players.add(DeandreAyton);
        players.add(AndreDrummond);
        players.add(AnthonyDavis);
        players.add(MarcGasol);
        players.add(PauGasol);


        Scanner scan = new Scanner(System.in);

        // while loop continues to ask user for players until 5 players are on the team
        while (userTeam.players == null || userTeam.players.size() < 6) {
            boolean playerPicked = true;
            // ask user for a player until user selection meets requirements
            do {
                System.out.println("Would you like to pick a player or Remove a player (Write pick or remove)");
                String userDirections = scan.nextLine();

                //asks user if they would like to pick or adjust there team by typing pick or remove
                if (userDirections.equalsIgnoreCase("pick")) {
                    System.out.println("Pick a player from the following list to add to your team");
                    System.out.println("----------------------------------------------------------");

                    // prints list of players from players list
                    for (int i = 0; i < players.size(); i++) {
                        System.out.println("Position: " + players.get(i).getPosition() + " Name: " + players.get(i).getName() + " Rating: " + players.get(i).getRating() + " Cost: $" + players.get(i).getValue());
                    }
                    System.out.println("Please spell the name of the player as spelled in the list");
                    System.out.println("----------------------------------------------------------------");
                    String usersPlayerName = scan.nextLine();
                    Position playerToRemove = null;
                    // for loop checks if users selection met the requirements
                    for (Position player : players) {
                        if (player.getName().equalsIgnoreCase(usersPlayerName)) {
                            userTeam.setCapSpace(player.getValue());
                            // for loop with branches printing statements if certain conditions are not met
                            for (int i = 0; i < userTeam.players.size(); i++) {
                                if (userTeam.players.get(i).getName() == usersPlayerName || userTeam.players.get(i).getPosition() == player.getPosition() || userTeam.getCapSpace() < 0) {
                                    playerPicked = false;
                                    System.out.println("You cant pick this player.");
                                    userTeam.addCapSpace(player.getValue());
                                    if (userTeam.players.get(i).getName() == usersPlayerName) {
                                        System.out.println("You already have him on your team.");
                                    }
                                    if (userTeam.players.get(i).getPosition() == player.getPosition()) {
                                        System.out.println("You cannot have two players of the same position");
                                    }
                                    if (userTeam.getCapSpace() < 0) {
                                        System.out.println("You do not have enough money to pay for this player. The cost is $" + player.getValue() + ", but your current cap space is $" + userTeam.getCapSpace());
                                    }
                                    break;
                                }
                            }
                            //if user requirements are met prints users current team and capspace available as well as selection to team
                            if (playerPicked) {
                                userTeam.players.add(player);
                                System.out.println(userTeam.getName() + ":");
                                System.out.println("-------------------------------------------------------------------------------------");
                                for (Position userTeamPlayer : userTeam.players) {
                                    System.out.println(userTeamPlayer.getPosition() + " " + userTeamPlayer.getName() + " " + userTeamPlayer.getRating() + " $" + userTeamPlayer.getValue());
                                }
                                System.out.println("Your current Cap Space (Buying power) is: $" + userTeam.getCapSpace());
                                playerToRemove = player;
                            }
                        }
                    }
                    if (playerToRemove != null) {
                        players.remove(playerToRemove);
                    }
                    // if user selects remove prompts player for removal selection
                } else if (userDirections.equalsIgnoreCase("remove")) {
                    System.out.println("Pick a player to remove from your team. Please type the name as spelled in the team");
                    String userPicked = scan.nextLine();
                    Position playerToRemove = null;
                    // loops through users team to find player for removal
                    for (Position player : userTeam.players) {
                        if (player.getName().equalsIgnoreCase(userPicked)) {
                            playerToRemove = player;
                            players.add(player);
                        }
                    }
                    userTeam.players.remove(playerToRemove);
                    // prints users team after removal
                    for (Position userTeamPlayer : userTeam.players) {
                        System.out.println(userTeamPlayer.getPosition() + " " + userTeamPlayer.getName() + " " + userTeamPlayer.getRating() + " " + userTeamPlayer.getValue());
                    }
                    System.out.println("Your current Cap Space (Buying power) is: $" + userTeam.getCapSpace());
                }
                playerPicked = true;
            } while (!playerPicked);
        }
    }

    // displays team after user has selected 5 players
    public void displayTeam() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Your Current team:");
        System.out.println(userTeam.getName() + ":");
        System.out.println("--------------------------------------------------");
        // for loop to print user team until the size is met
        for (int i = 1; i < userTeam.players.size(); i++) {
            System.out.println(userTeam.players.get(i).getPosition() + " " + userTeam.players.get(i).getName() + " " + userTeam.players.get(i).getRating());
        }


    }

    // assigns CPU teams players randomly
    public void randomizeTeams() {

        // loops through teams
        for (int i = 0; i < teams.size(); i++) {
            // loops through player list
            for (int j = 0; j < players.size(); j++) {
                int randNumber = (int) Math.floor(Math.random() * (players.size()));
                teams.get(i).players.add(players.get(randNumber));
                // removes player from player list after added to a team
                players.remove(players.get(randNumber));
                if (teams.get(i).players.size() == 5) {
                    break;
                }
            }
        }

// loops through teams and prints players on them
        for (Team team : teams) {
            System.out.println(team.getName() + ":");
            for (Position player : team.players) {
                System.out.println(player.getName());
            }
            System.out.println("------------------------------------------------");
            System.out.println("");
        }
    }

    // simulates games vs the user team
    public void gameSimulation() {
        int game = 1;

        // loops through each team in team list
        for (Team team : teams) {
            // loops through each player on current looped team
            for (Position players : team.players) {
                // uses set Points scored to assign player a random value
                players.setPointsScored();
                // adds the players points to that teams total
                team.setTotalPoints(players.getPointsScored());
            }
            // loops through players on users team
            for (Position userPlayers : userTeam.players) {
                // assigns random point for each player
                userPlayers.setPointsScored();
                // adds points to total user team score
                userTeam.setTotalPoints(userPlayers.getPointsScored());
            }
            // compares user team score to CPU selected team score to see who won and who lost
            if (team.getTotalPoints() > userTeam.getTotalPoints()) {
                userTeam.setLosses(1);
            } else {
                userTeam.setWins(1);
            }
            //  prints  game number of season and results of game
            System.out.println("Game" + game + ": " + userTeam.getName() + " Score: " + userTeam.getTotalPoints() + " " + team.getName() + " Score: " + team.getTotalPoints());
            userTeam.clearPoints();
            game++;
        }
    }

    // prints final record and based on record tells user how good they are
    public void printRecord() {
        System.out.println("Your record was " + userTeam.getWins() + "-" + userTeam.getLosses());
        if (userTeam.getWins() > userTeam.getLosses()) {
            System.out.println("You are a great manager");
        } else {
            System.out.println("Stick to your daily job");
        }
    }
}
