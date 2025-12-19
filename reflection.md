Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
- It's a good way to check correctness of code. 

What worked, what didn't, what advice would you give someone taking this course in the future?
- One advice I would give is that start with testing existing methods, then move to running more complex tests. 

Tests

1. testsetOS() - Tests the setOS() method by attempting to change the operating system to "Windows 10"

2. testResaleShop() - Tests the ResaleShop() constructor by adding a default MacBook to the inventory, so the inventory size is 1 instead of the expected 0. 

3. testbuy() - Tests the buy() method by expecting the passed computer to be in inventory. 

4. testsell() - Tests the sell() method by buying a computer and then selling it

5. testrefurbish() - Tests the refurbish() method to verify if it updates the OS and price. 

6. testComputerMemory() - Tests the Computer constructor by setting the memory attribute.

7. testComputerPrice() - Tests that the Computer constructor by setting the price attribute.

8. testSellComputerNotInInventory() - Tests that sell() throws an exception when trying to sell a computer which is not in the inventory.

9. testRefurbishWithNoneString() - Tests the refurbish() method on the "None" string parameter to ensure the OS doesn't change.
 
10. testBuyAddsCorrectComputer() - Tests that the buy() method adds the exact computer passed as parameter, not a different one.