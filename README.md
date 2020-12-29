# QueueViaStacks
Exercise related with Stacks and Queues.

## Exercise Challenge
Implement a QueueViaStacks class which implements a Queue using two Stacks.

### Solution
Basically what I do is that I have a stack that has the actual queue, and an auxiliary stack. 
Whenever I want to add an element to My Queue, I push all the elements of the queue to the aux, then I push the new element to the queue, and then I push the elements back from the aux stack.
It can be done in other ways, but are more or less the same.
