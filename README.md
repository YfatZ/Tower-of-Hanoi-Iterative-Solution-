# Tower-of-Hanoi-Iterative-Solution-
An iterative solution to the riddle of the Hanoi Towers (Using Java)

#### Background Story: 
The tower of Hanoi (also called the tower of Brahma or the Lucas tower) was invented by a French mathematician Édouard Lucas in the 19th century. <br/>
It is associated with a legend of a Hindu temple where the puzzle was supposedly used to increase the mental discipline of young priests. <br/>
In the legend the young priests were given 64 gold disks stacked neatly on one of three posts. Each disk rested on a slightly larger disk. <br/>
The priests' goal was to re-create the stack on a different post by moving disks, one at a time, to another post with the rule that a larger disk could never be placed on top of a smaller disk. <br/>

![image](https://miro.medium.com/max/670/1*4fIwfKZCHzKGgPanAeWUnA.gif)


#### Solution:
There are several ways to solve this puzzle, I used an Iterative solution (where the same sequence of instructions is repeated over and over).<br/>
I wrote a plan which will make the series of transitions required for n rings. In the position of the 3 towers, 3 cartridges will be used: s1, s2, s3, where the numbers 1,2, 3,…, n (the highest number at the bottom of the cartridge) are first in s1 and the other two cartridges are empty.<br/>
This iterative solution is characterized by the following distinctions:
*	I arranged the 3 towers in a circle
*	 At each odd step I moved the small ring clockwise.
*	In each even step I made the possible move that does not involve the small ring

![image](https://user-images.githubusercontent.com/66127805/170842417-fcac64d2-0ae7-4ac4-9b20-37652e3377e6.png)

In the main part I set the number of rings, assigned 3 cartridges and inserted entries first, and finally turned to the Hanoi routine.<br/>
Routine will transfer the rings from S1 to one of the other towers.<br/>
After each pass of the ring the contents of the 3 cartridges will be printed.


#### Enjoy :)


