# Reflection on my Intended Design
My Class Diagram does not have a HumanPlayer class. 
HumanPlayer is the class which represents the players. 
I missed the HumanPlayer class because I did not antecipate their need and also I could not understand the assignment´s requirements.
There are no extra classes on my design. From my point of view these were the classes that I should create for the game. 
The first difference that I notice regarding the names of the classes is on Game class which on my diagram is Monopoly. Also, ConsoleUI I named UserInterface. A class is a template that defines attributes, operations and behaviours that an object created from the class will have. It is a way to organize related data and functions in a single entity. Said that, a class name should be descriptive about the purpose of the class. 
On my Class Diagram I only used Association because I was not sure about how and where to use the other types of relations. However, I notice that on your Class Diagram there are different types of objects relations, per example Dependency.
I only used Association to connect the objects. Though, I should have used Dependency. 
Regarding ID-connection, it is a way to establisj a relationship between objects based on their unique identifiers. I could have used but I was not confortable with this topic in order to use it in this assignment. 
From my point of view, I think I have divided the complexity and behaviour into different classes. With this approach, the reusability, understanding and maintenance of the code is easier. 
I created the Board class which represents the spaces where the players move around. The Tile class contains information of the type, price or if it is owned. 
Player class contains information about the player´s position, amount of money, what they own, if the player wins among other methods. 
In general I have created different classes in order to simplify the entire code. 
When comparing the Objects Diagrams I noticed that I only have one Dice with the sum of the rolls. Also, I created objects with the different names of the Tiles and inside them with the names of the roads. I addeed the methods to my Object Diagram and I could have simplified this part. 
First difference that I noticed is that I did not have comments which I think it would be easier if I had. I can also see some differences in the Objects - Dice, Player and Tiles. 
I don´t have Objects sending messages to themselves which I consider an error that I have done.
The fact that I did not create differente Objects for each Tile creates a confusion when I try to understand my Sequence Diagram. It is not easy to "read". It would be much easier if I had different objects for each property. 
I think my Class Diagram was more or less correct, with some differences of course, but I could see which classes I needed to create and some of the methods. However, my Sequence Diagram was not really good and easy to read. The problem was the way I imagine the diagram. 
In future Sequence Diagrams I will start identifying all the objects that would be involved and a detailed description of their interactions. With this I can easily identify the messages exchanged between the objects.
Moreover, for future Diagrams I should be careful with behaviour allocations. https://creately.com/blog/meeting-visual-collaboration/10-common-mistakes-to-avoid-in-sequence-diagrams/

