# Proje 3

[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

***
Önce dizi sıralama algoritmalarının biri ile sıralanır. [0,1,2,3,4,5,6,7,8,9] sıralanmış dizidir. root 4 veya 5 alınabilir. 5 alınırsa 5'ten küçük sayılar için sol düğümlere, büyük sayılar için sağ düğümlere bakılır.

Örneğin, 9 arandığı durumda root olan 5 ten büyük olduğu için sağa bakılır . Dengeli dağılmış bir binary search tree olması durumunda 5 in sağındaki eleman 7 olmalıdır. Aranan sayı 7 den de büyük olduğu için yine sağ düğüme bakılır ve 9 bulunur, algoritma sonlanır.

                       root

                        5
                        ^
                    3       7
                    ^       ^
                1     4   6     9
                ^               ^
            0       2       8