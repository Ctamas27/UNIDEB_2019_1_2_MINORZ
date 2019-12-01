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

- Olyan szoftvert szeretnénk, amelyben minden játék egyszerűen
elérhető, és minden játék úgy van implementálva, ahogyan
azok a klasszikus társasjáték formában vannak jelen.
Minden szabály jelen van és betartható, ezeken belül a 
játékosok tudjanak mindent megtenni.
- Balanszolt pontrendszer: játékoktól függően mindegyikhez
tartozzon egy pontszámrendszer. A nyertesek az egyes játékokban
kapjanak pontot a játék nehézségéhez mérten, így nem csak
játékonként lehet majd egy pontozó tabellát felállítani,
hanem az összesre nézve is. (Minden játékhoz egyértelműen
tartozik egy nehézségi szint, ezt a játékszabály mérete,
illetve a játékok hossza is meghatározza, hiszen minél
tovább tart a játék, annál tovább kell folyamatosan
koncentrálnia a játékosoknak).
- Legyen lehetőség kipróbálbi a fizetős játékokat, hiszen
senki sem szeret előre fizetni egy olyan dologért, ami lehet,
hogy nem is tetszik az adott illetőnek, mivel még nem volt
lehetősége kipróbálnia azt saját szemszögéből.
- Játékok kategorizálása különféle témák szerint:
-- Nehézség
-- Korosztály
-- A játék témája, játékvilága
-- Időtartam
-- Játékosok száma

## Jelenlegi üzleti folyamatok

Mivel jelenleg nem létezik konkrétan ilyen szoftvercsomag,
az alábbiakban felsorolt üzleti folyamatokat tudjuk
megkülönböztetni:
1. Ki kell találnunk, mit szeretnénk játszani (mivel nincs
lehetőség egy tárházban keresni)
2. Meg kell keresnünk az interneten. Ha nincs számítógépes
verzió, akkor egy másik játékot kell választanunk.
3. Le kell tölteni (esetleg meg kell vásárolni, nincs
kipróbálás), sok esetben bajlódni kell a telepítéssel.


## Igényelt üzleti folyamatok

Az igényelt üzleti folyamatok modellje az alábbiakból épül fel:
1. Játék megválasztása. Ebben segítséget nyújthat a szoftver,
amely ajánlásokat tesz, esetleg előző játékok alapján.
A kategóriák szerinti keresés is nagy segítségünkre lehet
a kiválasztás során.
2. A játék megkeresése egyszerű, illetve már lehet, hogy
meg is találtuk a megválasztás során.
3. A játék indítása, esetleg letöltése, megvásárlása egyetlen
gombnyomással










