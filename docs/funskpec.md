# UNIDEB MINORZ
# Funkcionális specifikáció

## Bevezetés

Egy unalmas délutánt misem dobhatna jobban fel mint egy egészséges kis versengés a barátokkal. Sőt mi több ezt úgy
hogy közben az agyadat is tornáztatod ezálltal nem lustul el. Kellemeset a hasznossal, sokszor elfelejtik az emberek, 
hogy a játék nem csak a versengésről hanem sokszor csak a kikapcsolódás miatt ül le az ember játszani.
Mi mind két opcióval tudunk szolgálni hisz olyan játék is megtalálható a szoftverünkbe melyet teljesen egyedül is 
játszat a játékos ezáltal nem számít miképp teljesít hisz senkivel sem játszik. Azt sem szabad elfelejteni, ezeknek a játékok is 
nyújthatnak versengést hisz a globális pontrendszerben még mindig lehet az első helyre pályázni.

## Helyes felhasználási esetek

a) Program elsődleges célja a felhasználó szórakoztatása, hogy
minél nagyobb sikert érjen el a játékban, későbbiekben két
vagy több játékos hálózaton többszemélyes jatékmenetben
akár egymással való versengés kialakulása.

b) Játékosnak egy célja van: Másik játékosnál hamarabb rakja a bábúit egy sorba.

c) Érdemes figyelni a másik lépéseit ez álltal olyan helyre tudunk lépni ahol meggátoljuk az ellenfél
esetleges nyerő lépését, érdemes kereszt irányú nyerő poziciót kialakítani mivel azt hamarabb és könnyebben el lehet érni.

d) Játékosok felváltva lépnek, céljuk hogy másik játékostól hamarabb rakják az ő bábuikat egy sorba. Játék
kezdetekor helyes és könnyen beazonosítható név megadása nem kötelező de nem árt. Több menetet is játszhatnak ugyan abban
a játékmenetben ugyan azon a néven a játékosok így könnyen nyomon tudják követni az egymás közötti állást.


## Jelenlegi helyzet

A klasszikus négy a nyerő játék egy igen elterjedt és kedvelt táblajáték, bár szórakoztató ezt a játék logikát
több féle képpen is lehet implementálni, circle.javaünak ez a célja egy hasonló logikán alapuló
de mégis más irányból megközelített szemlélettel állítani kihívást a leendő játékosok elé.
Ma már kevésbé szeretett terminál kezelés megszerettetése és megismertetése a játékossal az esetleg jövőbeni 
használatakor.


## A játéknak nem célja

- Játékosok közötti konfliktus teremtés.
- Több mint 2 játékos bevonása.
- Bármiféle konfliktus keltés lokális hálózatonmás programokkal.
- Játéknak nem célja bevételt termelni.
- Nem célja a játéknak a klasszikus négy a nyerőt leváltani hanem módosítása és népszerűsítése a cél

## Jelenlegi üzleti folyamatok modellje

A játéknak nem célja bevételt termelni, viszont annál inkább a terjedése. Célja minél több felhasználó bevonása
ezálltal a felhasználók visszajelzésének köszönhetően a további fejlesztések megkönnyítése.

## Igényelt üzleti folyamatok

- Játékos állások mentése
- Gyors egyértelmű kezelőfelület
- Újrajátszhatóság
- Lokális gépen való kétszemélyes játékmenet

## Követelménylista

* egyszerű kezelés
* élvezhető játékélmény
* fejleszthetőség
* mobilitás(bármilyen arra alkalmas eszközon való elérés)

## Használati esetek

* Unalom esetén remenk szórakoztatási lehetőség 


## Megfeleltetés, hogyan fedik le a használati esetek a követelményeket

 Mivel egy könnyen hozzáférhető játékról van szó és a kezelése is egyszerű nem vesz sok időt a játék
 indítása és kezelése. Emellett mivel egy élvezetes játékról van szó unalom űzésre tökéletesen megfelel.
