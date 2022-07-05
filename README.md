# ZadatakObjekti

(део за праг):
а) Написати класу  Stan и обезбедити следеће методе:
- конструктор класе Stan ако је познато да се стан карактерише својом површином (типа double) и бројем    станара (типа int)
- конструктор копије
- одговарајуће set*() и get*() методе
- метод toString() – који враћа String-репрезентацију стана у формату:
Povrsina stana je povrsina m^2.
Broj stanara je br_stanara.
У тест-класи TestStambeniObjekat креирати објекат класе  Stan  на основу података који се учитавају са улаза а затим исписати податке о стану. Пример улаза:
-------------PRAG------------------
Unesite povrsinu stana:
65.5
Unesite broj stanara u stanu:
4
Povrsina stana je 65.5 m^2.
Broj stanara je 4.
----------------------------------------

б) Написати апстрактну базну класу StambeniObjekat и из ње изведене класе Zgrada и Kuca.  
 Класа StambeniObjekat  се карактерише адресом типа String. Написати одговарајући конструктор и set*() и get*() методе за ову класу. 

в) Класа Kuca садржи као податак члан један објекат класе Stan. Обезбедити следеће методе:
•	конструктор класе Kuca за задату адресу и објекат класе Stan.
•	конструктор класе Kuca за задату адресу, површину стана и број станара.
•	метод toString()који враћа String-репрезентацију објекта ове класе у одговарајућем формату:
Kuca:
Adresa: adresa
Povrsina stana je povrsina m^2.
Broj stanara je br_stanara.

г) Класа Zgrada садржи као податак члан низ станова. Обезбедити следеће методе:
•	конструктор класе Zgrada за задату адресу и низ објеката класе  Stan.
•	метод toString()који враћа String-репрезентацију објекта ове класе у одговарајућем формату (видети тест пример на другој страни):
Zgrada:
Adresa: adresa
1. stan:
Povrsina stana je povrsina m^2.
Broj stanara je br_stanara.
2. stan:
Povrsina stana je povrsina m^2.
Broj stanara je br_stanara.
...

д) Обезбедити да се полиморфно позива следећи метод: 
•	double porez(double cena_po_kvadratu) 
који за стамбени објекат исписује износ годишњег пореза који се добија тако што се површина стана помножи ценом пореза по квадрату, али ако је број станара већи од 2, добијена цена се умањује за 5% на сваког прекобројног станара. У случају зграде израчунати укупан порез који треба да плате сви станари зграде за све станове. Порез за један стан се израчунава по следећој формули:


ђ) Написати тест класу у којој се учитавају подаци о једном стамбеном објекту. Од корисника се очекује да у једном реду унесе адресу стамбеног објекта а затим слово „k“ ако жели да унесе податке о кући а „z“ ако жели да унесе податке о згради (подразуме се да корисник неће унети неку трећу опцију). Учитати неопходне податке за формирање траженог објекта. Корисник затим уноси цену пореза по квадрату на основу које се израчунава укупан порез који треба да буде плаћен за унети стамбени објекат и његова вредност се исписује  на стандардни излаз. Погледати тест пример!!!  	

Тест пример:
Unesite adresu stambenog objekta:
Jurija Gagarina 289/14
Unesite stambeni objekat koji zelite (k-kuca, z-zgrada):
z
Unesite broj stanova zgrade:
2
Unesite povrsinu 1. stana:
65.5
Unesite broj stanara 1. stana:
4
Unesite povrsinu 2. stana:
32
Unesite broj stanara 2. stana:
2
Unesite cenu poreza po kvadratu:
1000
Zgrada:
Adresa: Jurija Gagarina 289/14
1. stan:
Povrsina stana je 65.5 m^2.
Broj stanara je 4.
2. stan:
Povrsina stana je 32.0 m^2.
Broj stanara je 2.

Ukupni porez koji treba da bude placen je 90950.0. 

