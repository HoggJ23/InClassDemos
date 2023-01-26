ADT List
+createList() - create an empty list (constructor)

+isEmpty(): boolean - determines wheter the list is emty

+getSize(): int - returns number of items that are in the list 

+addL(index: int, item: ListitemType)

Insert the given item at the postion given by the index. A preconditon is that 
the index is >= 0 , and <= getSize(). If the index is < getSize() then the time at 
index moves to index +1, the item at index + 1 moves to index + 2, and so on.
Note: throw an exception if index is out of range or if the list is full.

+remove(index: int)

Removes the item at the postition given at the index. a precondition is that the index 
is >= 0 and < getSize(). Note: If the index < getSize() - 1, then items must be shifted as
follows: the items at index +2 moves to index + 1, and so on. Note: thrown an exception if index is 
out of range or if the list is full.

+removeAll(void) - removes all the items in the list.

+get(index: int) : returns ListItemType

this returns the item at position index of the list. A preconditon is that 
the index is >= 0 , and <= getSize(). Note: trow in a exception if the precondition
is not met.