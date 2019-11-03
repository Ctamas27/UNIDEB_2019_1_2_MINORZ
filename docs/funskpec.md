# UNIDEB MINORZ
# Funkcionális specifikáció

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
a játlkmenetben ugyan azon a néven a játékosok így könnyen nyomon tudják követni az egymás közötti állást.


## Jelenlegi helyzet

A klasszikus négy a nyerő játék egy igen elterjedt és kedvelt táblajáték, bár szórakoztató ezt a játék logikát
több féle képpen is lehet implementálni, circle.javaünak ez a célja egy hasonló logikán alapuló
de mégis més irányból megközelített szemlélettel állítani kihívást a leendő játékosok elé.


## A játéknak nem célja

- Játékosok közötti konfliktus teremtés.
- Több mint 2 játékos bevonása.
- Bármiféle konfliktus keltés lokális hálózatonmás programokkal.
- Játéknak nem célja bevételt termelni.
- Nem célja a játéknak a klasszikus négy a nyerőt leváltani hanem módosítása és népszerűsítése a cél