# UNIDEB MINORZ
# Követelményspecifikáció

## Bevezetés

A mai világban egyre nagyobb teret hódítanak a társasjátékok,
különböző régről ismert játékokhoz jelennek meg új kiadások,
kiegészítők, illetve sok-sok új és új játék jelenik meg.
Új mechanikák, új élmények, rengeteg szórakozás.
Viszont ezeknek a játékoknak a száma, illetve fejlődése
minden értelemben eltörpül a mai világban a számítógép és az
okostelefonok fejlődése mellett. Egyre több cég foglalkozik
játékok fejlesztésével számítógépre, egyre jobb, illetve
már-már teljesen élethű grafikájú játékok jelennek meg.
Természetesen ezen van a nagyobb hangsúly, viszont nem szabad
elfelejteni azokat a játékokat sem, amelyekkel mindig is játszottunk,
vagy amelyekkel bármikor meg tudunk mérkőzni egy barátunkkal,
ki is a nagyobb taktikus.
Szoftverünk egy játékcsomagot kínál, amelynek az alap verziójában
teljesen egyszerű játékokat találhatunk meg, olyanokat, mint
például a klasszikus Négy a nyerő, vagy például a híres Snake.
Ebben a csomagba szeretnénk implementálni minél több
társasjátékot.
Ennek több célja is van: már manapság lehetőségünk nyílik
arra, hogy egy társasjátékot ki tudjunk próbálni boltokban,
bárokban. Ez a csomag kínálni tudna egy próbalehetőséget,
amely után el tudnánk dönteni, hogy szeretnénk-e megvenni a
teljes verziót, vagy esetleg a klasszikus társasjátékot.
A legegyszerűbb játékok ingyenesen játszhatóak bárkinek,
bármikor.

## Jelenlegi helyzet

Tudomásunk szerint jelenleg a piacon nem létezik olyan szoftver,
amely csakis kizárólag társasjátékokat tartalmazna.
Kétféleképpen találkozhatunk ezzel a néhánnyal:
- Néhány társasjátét megtalálható nagyobb szoftverekben,
ilyen pl. a Steam
- A többi játékot az interneten böngészve tudjuk megtalálni.
Ezekkel a legnagyobb baj, hogy némelyikük játszhatatlan,
a játéknak a mechanikáját teljes egészében nem teljesen 
sikerül implementálni, sok esetben nagyon csúnyák ezek a játékok.

Akárhogyan is nézzük a témát, nem találunk az interneten
sehol sem olyan szoftvert, amelyben csakis kizárólag társasjátékok
találhatók meg, illetve viszonylag új és nagyszerű társasjátékoknak
a számítógépes reprezentációja nincsen.

## Vágyálom rendszer

Az Inline3 nevezetű játékot szeretnénk fejleszteni.
A játekot két ember tudsz játszani és az a lényege, hogy 3 megadott bábút
kell egy sorba rendezni a 4x5ös táblan.Minden körben egyszer léphetünk egy bábúval
egy üres mezőre le,fel,jobbra vagy balra.Ezt a jatékot probájuk lefutási idő 
szempontjából a leggyorsabb módon tekintettel a piacon lévő konkuresn
játékokhoz viszonyítva.A játékokat elmentjük egy adatbázisba ahol lépesek 
alapján rangsoroljuk a játékosokat.A demo verzió egyelőre csak terminálban tettük a játékot 
játszhatóvá de tervben van egy UserInterface is ami hibátlanul el tud érni minden opciót.

## Jelenlegi üzleti folyamatok

A jelelegi piacon az általunk tervezett(remastered) játéknak
több verziója is megtalálható. Más verzió alatt akár a tába
méretére is gondolhatunk vagy a kirakandó bábuk számára esetleg.
Az általunk létrehozott verzió egy úgymond egyszerüsített változat
mivel az átlós lépést kivettük belőle. Amennyiben sikerül a játékot 
népszerüsíteni a mi verziónk lesz a standard ami annyit tesz, hogy 
a mi általunk létrehozott játek lesz az amire minden hasolno játék 
utalni tud majd.

## Igényelt üzleti folyamatok

Klasszikus társasjáték nem klasszikus verziójának implementálása egy modern környezetben. Minden előnyével az adott 
technológiának. Konzolos formában a játék nem túl impresszív de ennek megszokása informatikában tanulóknak szükséges.










