

Intuition
This can be done in O(m+n) using hash table but what if , someone ask you to do it using Binary Search only.
1.So we can do it by sorting both vectors and looking for one's element in another by binary search.

The problem with normal binary search is it would give repeated answer.
We can improve it by when element found replace it with -1 and we have to sort it again to apply binary search for futher elements
this would be a lot of time consuming process to sort vector again and again
Can we made the vector to be remain sorted after updating just one updation of element.
Yes , we can
Approach
Sort both vectors
iterarte through nums2 while looking its element in nums1.
if found pushback the value in answer vectors along with updation of nums1 to avoid collision or repetation. This can be done as
update nums1 element with its previos one
i.e. new nums1[mid] <= nums1[mid]-1
because here we are dealing with lower bound of element
it makes sure the sorted property remains un affected
and also the next element to serch would always be greater than the updated element
Illustration
image.png

Complexity
Time complexity:

size of nums1 = n

size of nums2 = m
sorting = nlog(n) + mlog(m)
serching = mlog(n)
Total = O(nlog(n) + mlog(m))

Space complexity:
constant space O(1)

Code
