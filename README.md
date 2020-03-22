## Make Change Project - Week 1 Skill Distillery

### Overview

The program starts by asking for the total billed amount and then asking for the payment issued. With if and else statements, it first checks to see if exact change was given, then if the payment is not enough, and then finally to see how much change needs to be issued back.

It does this by first looking at the dollar amounts. The amount of change due is cast into an integer in order to look at only the whole dollar amount due and ignore the cents for the time being. It then goes through a check to see if the dollar amount due is divisible by 20, 10, 5, and 1. If that value is greater than or equal to one, then it will issue that amount of bills and subtract however ma ny bills were issued from the running total of whole dollars.

To examine the cents due, it first isolates cents by subtracting the whole dollars due from the change on line 25. It then conducts the same procedure of checking to see if cents are divisible by 25, 10, 5, and 1.

Finally, change is issued at the bottom with the denominations needed.

### Technologies Used
- Eclipse
- Java
- GitHub

### Lessons Learned

I learned that a simple mistake is easy to make and can throw off the rest of your program. The way I caught my mistake this time around
was to actually write out on paper what calculation and steps my computer was doing as it ran through my program.

I learned I make things too complicated if I don't take the time to just think about it. I need to take the time to map things out.

I learned I should explore all avenues before I commit myself to one thing.

I think I forced myself to learn to navigate nested statements and what the output will be. I was going to submit this version of my project until I found a situation in which it didn't work. The error was due to the overwhelming amount of nested if statements. It was very confusing to read and understand, so in the end I scrapped it and reformatted the whole dollars section to be structured like the cents section of code.

From this I learned that even if I have code that works, or mostly works, I should reformat it if I know there's a cleaner and better way to do it.

Next time, I'll remember if it feels too complicated, then it probably is and maybe I should take a step back and re-evaluate my life choices.