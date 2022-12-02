# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * convert the number to a string thren use .substring() and .length() to get the ending of the number, then convert back to int to see if the last number is equal to 7, 8 or 9 or 0, 1 or 2 by using If Else then add the + or - to the letter

2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * check the length of the number, if the length is greter then 2 add + 


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * check to see if the number is greater then or less then 70 to see if its a + or - 
