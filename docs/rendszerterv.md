# UNIDEB MINORZ
## Rendszerterv  

### Bevezetés

A program céjai:

* Egy egyszerű szabályokon alapuló játék megvalósítása
számítógépen. A játék egyszerű: egy 4X5 nagyságú táblára 
előre felhelyezett korongokat kell pakolgatni úgy, hogy 
előre vigyük magunkat a győzelem felé, viszont ezzel egyszerre
meg kell akadályoznunk azt is, hogy az ellenfelünk győzzön.
Az győz, aki a négy korongjából hármat egy sorba tud rakni
a másik előtt.

* Klasszikus társasjáték számítógépes reprezentációja:
Ha valaki megemlíti a társasjáték szót, egyből valamiféle
dobozra gondolunk, amelyben különböző játékrészek vannak,
sok esetben egy tábláról van szó, amelyet körül ülhetünk,
közben beszélgetés, evés, ivás, jó hangulat.
Ennek a kibővítése, ez esetben teljes mértékű leváltása
a számítógépes verzió. Nem kell elhagynunk az otthon melegét,
ha betegek a barátaink vagy esetleg mi vagyunk azok, akkor
sem kell megtagadnunk a játékot senkitől sem, mert ezt
nyugodtan tudjuk játszani, bárhol, bármikor.

* Egy nagy sajátosság: TERMINAL
Ez a játék a tervezett verziójában nagy hangsúlyt fektet
a számítógépes terminál használatára. Ne váljunk olyanokká,
felhasználóként sem, aki teljesen megveti a terminált.
Ne legyen elég mindenhez akár csak egy kattintás.
A játék használatával könnyedén hozzá tudunk szokni ahhoz,
hogy miként is tudunk programokat irányítani szavakkal,
mi történik a háttérben akkor, amikor lenyomjuk az egérnek
valamelyik gombját. A játék során használt tudást később
nagyon hasznosnak találhatjuk, ha csak a terminál áll lehetőségünkre.

### A rendszer célja

A rendszer célja, hogy népszerűsítse, illetve részben
leváltsa a klasszikus társasjátékokat. Ennek a játéknak
az említésekor érdemes definiálni a klasszikus társasjátékot.
Klasszikus társasjáték a táblás társasjáték, illetve a
számítógépesek közül az, amelyiket egyszerűen, egér segítségével
tudunk irányítani.
Egy táblás játékot képes leváltani (nem csak táblásat,
bármilyen kézzel fogható játékot) annak köszönhetően, hogy
nem kell sehová sem mennünk, hogy jétszani tudjunk. Nem kell
nagy összegeket fizetnünk anyagköltségre és hasonlókra, a
számítógépes játékok nagy előnye, hogy nem kell fizetnünk
a felhasznált anyagokért és a sokszorosításért sem.
Ezen felül egy klasszikus számítógépes társasjátékot is
képes leváltani úgy, hogy itt játszva tanul az ember és
megismerkedik a számítógép legnagyobb mumusának titulált
eszküzével, a terminállal. Fiatalabbak generációk fogékonyabbak
arra, ha játszva tanulnak, így az oktatásba könnyebben
lehetne implementálni a terminál használatának tanítását.

### Projekt terv

A szoftver célja a klasszikus értelemben vett társasjáték
egy részében történő leváltása, megváltoztatása:

* Analóg társasjáték gépesítése

* Számítógépes társasjáték terminál alapú megvalósítása,
ösztönzés a tanulásra