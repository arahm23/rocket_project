SPACE PILOT README
This "readme" is a simplified version of the SPACE PILOT DESIGN DOCUMENT PDF. Please consult that for the best look at the design of the project.



Space Pilot contains a total of 7 classes. This document is intended to be used as a reference to understand their implementation and relationships. It is also intended to disclose the usage of AI tools and the 3 flourishes included in the project.

Group Members:
Ashaz Rahman
Mira Belanger 
Joyce Jiang



RocketGame 
This class can be thought of as the heart of the program. It contains the timer/gameloop and is where we make the JPanel and the paintComponent. This is where we make things visible to the user. We draw a RocketShip object here, which contains the ship itself and its properties, and we also draw Level1, Level2, Level3, MainMenu, and Scoreboard objects here. Score is also calculated here and the user is prompted to enter their name for the ScoreBoard class.

We implement sound effects here, satisfying one flourish requirement. 

AI DISCLOSURE: Artificial intelligence (ChatGPT)  was used to create the original ame loop system. This game loop system did not make it into the final project. It was just used to create a quick prototype for the project.


RocketShip
This class allows us to create the actual rocket ship. As in, the ship flying on the screen that can accelerateand decelerate. We specify how to draw the ship, we do the ship position and acceleration physics, and we create its hitbox system here using rectangular hitboxes for the stone structures in the level and use the .interescts() method. We also keep track of things such as fuel and lives here, associating them with the creation of a RocketShip object.  A RocketShip object is created within RocketGame so we can see the rocket and process what the user chooses to do with it.




AI DISCLOSURE: Artificial intelligence (ChatGPT)  was used to inquire about the best way to implement hitboxes, which was using .intersects() and to simply use an array of rectangles. It was also used to help with the physics calculations (specifically those having to do with the angle of a rocket) and the suggestion to use AffineTransform. 



MainMenu
This class is used by RocketGame to allow the user to select a difficulty level for their playthrough of the game. There are 3 difficulty settings: easy, medium, and hard. Easy corresponds with the Level1 class, medium corresponds with the Level2 class, and hard corresponds with the Level3 class.  RocketGame loads in the correct level depending on what the user clicks (using a simple mouse interface). 



Level1 (easy), Level2 (medium), Level3 (hard)
Note that all of these levels work about the same way. They load in a “space background” that is randomly generated stars on a black background and then proceed to draw obstacles that work with the aforementioned hitbox code (see RocketShip). Level1 was created as a template for level creation, allowing for the possibility of creating more levels in the future. Each of these levels is loaded by RocketGame when selected by the user. We also see that the obstacles are given textures, with the final obstacle being a “portal” that grants the player a win.


When we generate the obstacles as rectangles, we generate them randomly based on some constraints to maintain the difficulty requirements. This satisfies the random stationary obstacles flourish requirement.


Scoreboard
The scoreboard displays the top 10 high scores using the player names that were inputted when the program launched. It does so using File IO. It creates a .txt file stored locally on the user’s computer to hold the scores from their plays, ensuring that they are persistent. The creation of a scoreboard satisfies the scoreboard flourish requirement.



AI DISCLOSURE: AI (ChatGPT) was referenced to incorporate the Collections sorting method for the highScores ArrayList, as the syntax is rather complex and was not explored in depth during lectures. The syntax for splitting the input for the highScores list to read was also explained using AI.
