# UNIDEB MINORZ
## Rendszerterv  

### Bevezetés

Manapság egyre nagyobb teret hódítanak a különböző társasjátékok.
Új mechanikák, új történetek, új témák. Viszont valamiért teljesen
elkülönülnek a számítógépes játékok és a klassikus társasjátékok.
Nyilván két teljesen más pilléreken alapuló játéktípusról van szó,
azonban az utóbbit egyszerűen, meg lehet valósítani modern, számítógépes
környezetben.
Léteznek az interneten különböző oldalak, ahol fellelhető egy-két
társasjáték, viszont sokszor ezek hibásan vannak implementálva.
Ez teljesen elrontja a játékélményt.
Az általunk bemutatott szoftvercsomag tartalmazná idővel a lehető
legtöbb ismert társasjátékot, illetve olyan egyszerű kis játékokat,
amelyeket legtöbbször az emberek egy papíron játszanak.
A szostvercsomag egy hely lenne, ahol könnyedén kereshetünk a 
játékok között, ranglistákat állíthatunk fel, illetve fejlesztőként
lehetőségünk van játékok implementálására és beillesztésére 
a csomagba. A szoftvercsomag mindenki számára egy nagyszerű lehetőség,
aki valamilyen módon kötődik az egyszerű vagy épp a nagyon bonyolult
társasjátékokhoz.

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
