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

A rendszer célja egy olyan, bárki számára elérhető szoftvercsomag,
mely egy részben leváltja a klasszikus értelemben vett társasjátékokat.

* Sokak nem tudják eldönteni, hogy milyen játékot is válasszanak.
A szoftver ebben is seítséget nyújt, mivel a későbbi verziójában
lehetőség nyílik, hogy segítséget vegyünk igénybe. Társasjátékok
kategorizálása (kor, nehézség, játékosok száma, téma szerint).
Ez nagyszerű lehetőség, mivel a legtöbb társasjátékboltban a 
játékok kiadó szerint vannak csoportosítva, így megnehezítve 
a döntést. A szoftver keresője is segít a választásban, illetve
később az általunk már játszott játékok alapján is ajánlást tesz.

* Ha meghozza az ember a döntést, akkor sem biztos, hogy számára
megfelelő lesz a játék (lehetséges, hogy tetszik a játék témája
valakinek, viszont lehet, hogy a mechanikája nem fog tetszeni,
így rossz következtetést von le az ember). A megoldás a kirpóbálási
lehetőség, amely már több játékboltban is elérhető, viszont ez sokszor
macerás lehet: el kell mennünk a boltba, lehet, hogy nem lesz hely,
nincs meg az adott játék, pénzbe kerül, stb.
A szoftvercsomag segítségével a saját otthonunkban tudjuk kipróbálni
a játékokat, mindenféle korlátozottság nélkül (nincs hangzavar, nem vár
senki más ránk, nem fogdosta senki össze a táblát, stb).

* A kiválasztás után, ha olyan játékról van szó, amelyik nem ingyenes,
lehetőségünk nyílik megvásárolni a játék teljes verzióját, amelyben
mindent megtalálhatunk. Nagy előny egy klassikus társasjátékkal szemben,
hogy itt nem kell "felesleges" plusz költségekre pénzt kiadnunk. Ezek
a játék alkotóelemei, amelyeknek az anyagköltsége sok esetben elég magas
tud lenni.

### Projekt terv

A szoftver célja a klasszikus értelemben vett társasjátékok
egy részében történő leváltása, megváltoztatása:

* Analóg társasjátékok gépesítése, ezen módon is növelve 
népszerűségüket

###  Projektszerepkörök és felelősségeik

A projektben résztvevő felek minden tekintetben egyenrangúak,
viszont a scrum módszert követve megválasztásra került az ún.
Teamleader, aki a projekt koordinálását végzi, viszont a fejlesztői
szerepkörben is ugyanúgy kiveszi a részét.

Név |   Szerepkör
-----------|---------
Magyar Zsolt | Teamleader, szoftverfejlesztő, szoftvertesztelő
Ferenczi Péter  | szoftverfejlesztő, szoftvertesztelő
Czibere Tamás    | szoftverfejlesztő, szoftvertesztelő

### Ütemterv 

Négy részre bontjuk a menetet

* Dokumentációk megírása
- Követelményspecifikáció
- Funkcionális specifikáció
- Rendszerterv
- Tesztelési terv
* Szoftver megírása
* Tesztelés
* Hibák javítása

A négy rész elkülöníthető, de hatással vannak egymásra, így
maguk után vonhatják a folyamatok a többi folyamat frissítését.

### Mérföldkövek

Főbb mérföldkövek:

- Trello tábla létrehozása a csapatban
- Git repo letrehozása, kollaborátorok hozzáadása
- Discord szerver létrehozása
- Doksik megfelelő elkészítése
- Program elkészítése
- Program tesztelése
- Program esetleges hibáinak javítása

###  Üzleti szereplők

A programot bárki ingyenesen használhatja, hiszen ezzel
célunk a számítógépes társasjátékok népszerűsítése.
A program használatához
semmiféle előképzettség nem szükséges, minden funkciója
felhasználó közeli, egyszerűsége megkönnyíti a használatát.
A felhasználókon kívül további célcsoport azon személyek,
akik az ideológiánkat követve fejlesztenek további játékokat
a csomagba. Fejlesztő lehet bárki, aki olyan társasjátékot
valósít meg számítógépes vagy telefonos környezetben, amelyek
nem szerepelnek még a csomagban.

###  Üzleti folyamatok

Példa üzleti folyamatra:
* A felhasználó előzetes ismeretek alapján vagy ajánlatok
segítégével megkeresi a kigondolt játékot, majd elindítja 
(esetleg letölti)
* Játék használata
* Visszatérés a menübe, esetleg kilépés

###  Üzleti entitások  
  
Az üzletben lévő entitások:
- A szoftvercsomagot fejlesztők
- Játékfejlesztők
- A csomagot használó játékosok

### Fejlesztő eszközök  

IntelliJ IDEA, SceneBuilder, standard linux terminal
