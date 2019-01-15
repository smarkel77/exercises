package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int initalNumberOfRaccoons = 3;
		int raccoonsLeftForDinner = 2;
		int raccoonsLeftInWoods = initalNumberOfRaccoons - raccoonsLeftForDinner;

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int flowers = 5;
        int bees = 3;
        int differenceBetweenFlowersAndBees = flowers - bees;
        

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int lonelyPigeon = 1;
        int friendlyPigeon = 1;
        int numberOfPigeonsEatingBreadcrumbs = lonelyPigeon + friendlyPigeon;

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int initalOwls = 3;
        int moreOwls = 2;
        int totalOwls = initalOwls + moreOwls;
        

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        
        int beaversWorking = 2;
        int beaversLeftForSwim = 1;
        int remainingBeavers = beaversWorking - beaversLeftForSwim;

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        
        int initalToucans = 2;
        int moreToucans = 1;
        int totalToucans = initalToucans + moreToucans;

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int squirrels = 4;
        int nuts = 2;
        int differenceBetweenSquirrelsAndNuts = squirrels - nuts;

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        double quarter = 0.25;
        double dime = 0.1;
        double nickel = 0.05;
        double moneyFound = quarter + dime + (nickel * 2);
        

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        
        int brierMuffins = 18;
        int MacAdamMuffins = 20;
        int FlanneryMuffins = 17;
        int totalMuffins = brierMuffins + MacAdamMuffins + FlanneryMuffins;

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        
        float yoyoCost = 0.14f;
        float whistleCost = 0.14f;
        float totalCost = yoyoCost + whistleCost;

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int totalRiceKrispiesTreats = 5;
        int miniMarshmellows = 10;
        int largeMarshmellows = 8;
        int totalMarshmellowUsed = (miniMarshmellows + largeMarshmellows) * totalRiceKrispiesTreats;
        

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        
        int snowHiltHouse = 29;
        int snowBrecknockHouse = 17;
        int differenceInSnowTotals = snowHiltHouse - snowBrecknockHouse;

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        
        int initalMoney = 10;
        int toyTruckCost = 3;
        int pencilCost = 2;
        int moneyLeft = initalMoney - toyTruckCost - pencilCost;

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int joshInitalMarbleCollection = 16;
        int joshLostMarbles = 7;
        int joshCurrentMarbleCollection = joshInitalMarbleCollection - joshLostMarbles;

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int currentSeashellCollection = 19;
        int completeSeashellCollection = 25;
        int seashellNeeded = completeSeashellCollection - currentSeashellCollection;

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBallons = 17;
        int redBallons = 8;
        int greenBallons = totalBallons - redBallons;

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int initalBooksOnBookshelf = 38;
        int martaBooks = 10;
        int currentBooksOnBookshelf = initalBooksOnBookshelf + martaBooks;
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legsOnBee = 6;
        int numberOfBees = 8;
        int totalLegs = legsOnBee * numberOfBees;

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
        float iceCreamConeCost = 0.99f;
        int numberOfIceCreamCones = 2;
        float totalCostOfIceCreamCones = iceCreamConeCost * numberOfIceCreamCones;

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
        int totalRocksToCompleteBorder = 125;
        int rocksOnHand = 64;
        int rocksNeeded = totalRocksToCompleteBorder - rocksOnHand;

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int hiltInitalMarbleCollection = 38;
        int hiltLostMarbles = 15;
        int hiltCurrentMarbleCollection = hiltInitalMarbleCollection - hiltLostMarbles;
        

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
        int totalDistanceToConcert = 78;
        int distanceDriven = 32;
        int distanceLeftToDrive = totalDistanceToConcert - distanceDriven;

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
        float timeShovelingSaturday = 1.5f;
        float timeShovelingSunday = .75f;
        float totalTimeShoveling = timeShovelingSaturday + timeShovelingSunday;
        
        System.out.println(totalTimeShoveling);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
        int numberOFHotDogs = 6;
        float costOFHotDog = 0.5f;
        float totalCostOfAllHotDogs = numberOFHotDogs + costOFHotDog;

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
        float hiltMoney = .5f;
        float costOfPencil = .07f;
        float floatNumberOfPencilsHiltCanBuy = hiltMoney / costOfPencil;
        int intNumberOfPencilsHilCanBuy;
        intNumberOfPencilsHilCanBuy = (int)floatNumberOfPencilsHiltCanBuy;
        
        System.out.println(intNumberOfPencilsHilCanBuy);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
        int totalButterflies = 33;
        int orangeButterflies = 20;
        int redButterflies = totalButterflies - orangeButterflies;

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
        double costOfCandy = .54;
        double amountPaid = 1.0;
        double changeDue = amountPaid - costOfCandy;

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
        int currentNumberOfTrees = 13;
        int numberOfTreesToAdd = 12;
        int newTotalNumberOfTrees = currentNumberOfTrees + numberOfTreesToAdd;

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        
        int numberOfDays = 2;
        int hoursInDay = 24;
        int timeUntil = numberOfDays * hoursInDay;

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
        int numberOfCousins = 4;
        int piecesOfGumToEachPerson = 5;
        int totalPiecesOfGumNeeded = numberOfCousins * piecesOfGumToEachPerson;

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        
        double moneyDanHas = 3.00;
        double costOfCandyBar = 1.00;
        double moneyLeftOver = moneyDanHas - costOfCandyBar;

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
        int boatsOnLake = 5;
        int peopleInEachBoat = 3;
        int totalNumberOfPeople = boatsOnLake * peopleInEachBoat;

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        
        int legosHad = 380;
        int legosLost = 57;
        int legosHave = legosHad - legosLost;

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
        int currentTotal = 35;
        int numberOfMuffinsWanted = 83;
        int differenceBetween = numberOfMuffinsWanted - currentTotal;

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int differenceBetweenWillyAnsLucy = willyCrayons - lucyCrayons;

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        
        int stickersPerPage = 10;
        int numberOfPages = 22;
        int totalStickers = stickersPerPage * numberOfPages;

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        
        double totalCupcakes = 96;
        double totalChildren = 8;
        double cupcakesPerChild = totalCupcakes / totalChildren;
        
        System.out.println(cupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
        int totalCookies = 47;
        int cookiesPerJar = 6;
        int cookiesLeftOver = totalCookies % cookiesPerJar;
        
        System.out.println(cookiesLeftOver);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        
        int totalCroissants = 59;
        int numberOfNeighbors = 8;
        int croissontsLeftOver = totalCroissants % numberOfNeighbors;
        
        System.out.println(croissontsLeftOver);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        
        int cookiesPerTray = 12;
        int totalNumberOfCookies = 276;
        int totalTraysNeeded = totalNumberOfCookies / cookiesPerTray;
        
        System.out.println(totalTraysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
        int totalPretzels = 480;
        int servingSize = 12;
        int totalServings = totalPretzels / servingSize;

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        
        int totalLemonCupcakes = 53;
        int cupcakesLeftAtHome = 2;
        int cupcakesPerBox = 3;
        int boxesOfCupcakesGivenAway = (totalLemonCupcakes - cupcakesLeftAtHome) / cupcakesPerBox;
        
        System.out.println(boxesOfCupcakesGivenAway);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
        int totalCarrotSticks = 74;
        int nuberOfPeople = 12;
        int carrotSticksLeftOver = totalCarrotSticks % nuberOfPeople;
        
        System.out.println(carrotSticksLeftOver);
        

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        
        int totalBears = 98;
        int bearsPerShelf = 7;
        int shelfsUsed = totalBears / bearsPerShelf;
        
        System.out.println(shelfsUsed);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        
        int totalPictures = 480;
        int picturesPerAlbum = 20;
        int numberOfAlbums = totalPictures / picturesPerAlbum;
        
        System.out.println(numberOfAlbums);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        
        int totalCards = 94;
        int cardsPerBox = 8;
        int boxesFilled = totalCards / cardsPerBox;
        int cardsLeftOver = totalCards % cardsPerBox;
        
        System.out.println(boxesFilled);
        System.out.println(cardsLeftOver);
        
        

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        
        int totalBooks = 210;
        int totalShelves = 10;
        int booksPerShelf = totalBooks / totalShelves;
        
        System.out.println(booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        
        int totalCroissantsBaked = 17;
        int numberOfGuests = 7;
        int croissantsPerGuest = totalCroissantsBaked / numberOfGuests;
        
        System.out.println(croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        
        double billHourlyRate = 1 / 2.15;
        double jillHourlyRate = 1 / 1.9;
        double totalHourlyRate = billHourlyRate + jillHourlyRate;
        int numberOfRooms = 5;
        double totalTime = numberOfRooms * totalHourlyRate;
        System.out.println(totalTime);
        

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
        
        String firstName = "Steven";
        String lastName = "Markel";
        String middleInital = "R;";
        String fullName = lastName + ", " + firstName + " " + middleInital;
        
        
        

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
        
        float totalMiles = 800f;
        float milesTraveled = 537f;
        float percentTraveled = (milesTraveled / totalMiles) * 100;
        int castPercent = (int)percentTraveled;
        
        
        


	}

}
