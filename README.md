## Make Change Project - Week 1 Skill Distillery

### Overview

The program starts by asking for the total billed amount and then asking for the payment issued. With if and else statements, it first checks to see if exact change was given, then if the payment is not enough, and then finally to see how much change needs to be issued back.

It does this by first looking at the dollar amounts. The amount of change is due is cast into an integer in order to look at only the whole dollar amount due and ignore the cents for the time being. It then goes through a check to see if the dollar amount due is divisible by 20, 10, 5, and 1. If that value is greater than or equal to one, then it will issue that amount of bills and continue the same procedure with the remainder.

To examine the cents due, it first isolates cents by subtracting the whole dollars due from the change on line 22. Then it conducts the same procedure as above but this time utilizing while loops instead of an overwhelming amount of nested if statements.

Finally, change is issued at the bottom with the denominations needed.

### Technologies Used
- Eclipse
- Java
- GitHub

### Lessons Learned

I learned that simple mistake is easy to make and can throw off the rest of your program. The way I caught my mistake this time around
was to actually write out on paper what calculation and steps my computer was doing as it ran through my program.

I learned I make things too complicated if I don't take the time to just think about it. I need to take the time to map things out.

I learned I should explore all avenues before I commit myself to one thing.

I think I forced myself to learn to navigate nested statements and what the output will be. 

Next time, I'll remember if it feels too complicated, then it probably is and maybe I should take a step back and re-evaluate my life choices.