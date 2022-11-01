# Proje 1
[22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
2. Big-O gösterimini yazınız.
3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
5. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

1. Dizinin en küçük elemanı bulunarak başa yazılır, kalan dizide de en küçük eleman bulunup başa yazılır. Bu işlem dizi bitene kadar tekrarlanır.
2. o(n^2)  n + (n-1) + (n-2) + ... + 1 = n.(n+1)/2 , ilk işlemde worst case durumunda n tane elemana bakılır (en küçük elemanın sonda olması), sonraki işlemde n-1 elemanlı dizide arama yapılır.
3. Average case = n/2 işlem , worst case = n işlem, best case = 1 işlem
4. sıralı dizi şöyledir [2,6,16,18,22,27] 18 dizinin ortalarında olduğu için average case e girer.

5. 
i.  [2,3,5,8,7,9,4,15,6]
ii. [2,3,5,8,7,9,4,15,6]
iii.[2,3,4,8,7,9,5,15,6]
iv. [2,3,5,6,7,9,4,15,8]