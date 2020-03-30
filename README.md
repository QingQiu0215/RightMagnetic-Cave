# RightMagnetic-Cave

RightMagnetic Cave is a 1-player game consisting of a row of squares of any sizes each containing an
integer, like this:
please check pdf file.
The rules of the game are simple. The circle on the initial square is a marker that can move to other
squares along the row. At each step in the game, you may move the marker the number of squares
indicated by the integer in the square it currently occupies divided by 2 if the number is even, and
moved (n/2+1) if the number is odd. The marker may move either left or right along the row but may
not move past either end. For example, the only legal first move is to move the marker four squares
(8/2) to the right because there is no room to move four spaces to the left.
The goal of the game is to move the marker to the magnetic cave, the “0” at the far end of the row. In
this configuration, you can solve the game by making the following set of moves:
please check pdf file.
Though the RightMagnetic Cave game is solvable, actually with more than one solution—some
configurations of this form may be impossible, such as the following one:
please check pdf file.
In this configuration, you will bounce between the two 10’s, but you cannot reach any other square
