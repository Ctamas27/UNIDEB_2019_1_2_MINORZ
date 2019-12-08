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

b) Játékosnak két célja van: Minnél több játékban sikereket érjen el akar rekordot allítson vagy egyszerűen csak pihenés képp 
   játszon egy jót a haverokkal

c) Az általaunk létrehozott szoftver jelenleg tartalamz Snaket,connet4-t és 4inrow-ot

d) A program elindítasakor kitudja a fehasználó választani, hogy melyikkel szeretne játszani.



## Jelenlegi helyzet

A klasszikus négy a nyerő játék egy igen elterjedt és kedvelt táblajáték, bár szórakoztató ezt a játék logikát
több féle képpen is lehet implementálni, circle.javaünak ez a célja egy hasonló logikán alapuló
de mégis más irányból megközelített szemlélettel állítani kihívást a leendő játékosok elé.
Ma már kevésbé szeretett terminál kezelés megszerettetése és megismertetése a játékossal az esetleg jövőbeni 
használatakor.


## A szoftvernek nem célja

- Játékosok közötti konfliktus teremtés.
- Több mint 2 játékos bevonása.
- Bármiféle konfliktus keltés lokális hálózatonmás programokkal.
- Játéknak nem célja bevételt termelni.
- Nem célja versenybeszálni a külön külön megtalálható játékokokkal.

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
