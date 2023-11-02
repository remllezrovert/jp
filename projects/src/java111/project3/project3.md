Display using Github markdown


<details> <summary>client object</summary>

Instance Variables
- final int seasonWeeks = 22;
- String name
- private int lawnLength;
- private int lawnWidth;
- private int paymentQuantity;
- private double seasonCharge;
- private double serviceCharge;
- private double clientCost


Getter & Setter methods
- get all relivant instance variables
- set all relivant instance variables

Charge calculation method
- serviceCharge calculation, *use switch case*
- seasonCharge calculation
- clientCost = seasonCharge + serviceCharge;


</summary> </details>





<details> <summary>Summary object</summary>

Instance Variables
- ArrayList customers containing client objects
- integer totalSquareYards
- double revenue


create client method
- give error message if input bad, *use try catch*
- prompt user for input and set input, *use input helper*
- create client objects using the input and add them to "customeres" ArrayList
- prompt user 'type y to enter another user' 
- repeat while loop until user stops pressing 'y'

display summary method
- use a for loop and the client.get methods to get information about each client
- calculate revenue by looping through customers and calling getClientCost()
- calculate totalSquareYards by looping through customers and multilying getClientLawnLength(), and getClientLawnWidth()

</summary> </details>




