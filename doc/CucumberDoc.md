# BDD - Cucumber dokumentáció

## Eszköz feltérképezése
A Behaviour Driven Testing egy rendkívül érdekes koncepció, melynek bővebben utánaolvasva tudtam, hogy ezt ki akarom próbálni.
A Cucumber pedig egyből megtetszett, a Gherkin szintaxis remekül olvasható, és könnyen elsajátítható.

## Cucumber és a projekt összehangolása
Ez már fogósabb feladat volt, mivel a Cucumber oldalán található tutorial (számomra) nem volt elég részletes, illetve sok részletet ki is hagyott az IntelliJ-vel kapcsolatban, ami utána sok fejfájást okozott.
Találtam egy jó videós tutorialt, ami adott egyszerű példákat a fájlok létrehozására, de akárhogy próbálkoztam, egyszerűen nem ismerte fel, hogy én már megírtam a step definitionöket.
Kis kutatómunka után kiderült, hogy a Cucumber a működéshez fix projektstruktúrát vár el, ami itt természetesen hiányzott, tekintve, hogy többnyelvű a projekt. 
Így létre kellett hoznom az src mappát, és alá a standard Java struktúrát, majd az src/main/java mappába átmásolni a tesztelni kívánt fájlokat. Ez nyilván nem a legjobb megoldás, de akármit próbáltam (pl.: run configurationsben glue beállítása), nem működött.
A pom.xml-be való felvételnél sajnos nem figyeltem, és egyből a mainre pusholtam, úgyhogy az sajnos nincs benne a pull requestben.

## Tesztek írása

#### CheckIsSquare.java   
Ez egy szuperül tesztelhető osztály, egyedül annyit kellett rajta módosítani, hogy a tesztelést végző függvényt publikussá kellett tenni. Ugyanis az az eredeti kódban privát, így csak a main függvényéből hívható, ami pedig user inputból dolgozik. Ez pedig nem a legjobban tesztelhető megoldás.
* Feature: A feature fájl itt két scenarioból áll, megvizsgáljuk a visszatérési értéket egy négyzet, illetve egy nem négyzet szám esetén. Ezek a scenariok paraméterezett, ezáltal újrafelhasználható step definitionöket használnak, így könnyedén bővíthetőáek a tesztek a követelmények változásakor.
* Step Definition: Ebben a fájlban definiáljuk a feature fájlban Gherkin szintaxissal leírt viselkedést, hogy az kód szinten mit jelent. Ennél az osztálynál ez csak két függvényt jelent, az egyik a viselkedést viszi véghez, a másik pedig annak az eredményét ellenőrzi.

#### AnagramSearch.java
Ezt szintén azért választottam, mert különösebb nehézségek nélkül tesztelhető. Ezt is kellett minimálisan módosítani, mert eredetileg nem jól tesztelhető módon volt megírva, ugyanis az eredményt a standard outputra írta. Ezt orvosoltam azzal, hogy a függvény végén visszaadom a státuszt, ami azt reprezentálja, hogy a két string anagramma-e vagy sem.
* Feature: Itt is két scenario van, az egyikben két anagramma stringet tesztelünk, a másikban pedig kettő olyat, amik nem egymás anagrammái. Itt is törekedtem az újrafelhasználható lépések írására, melyeket paraméterezéssel tudtam megvalósítani.
* Step Definition: Itt vannak definiálva a lépések, szintén csak két függvény kellett, ugyanolyan logikával mint az előző tesztnél.

## Tesztek futtatása
A tesztek futtatása egészen egyszerű, tudjuk külön-külön is futtatni a scenariokat, illetve egyben is az egész feature fájlt. 
A futás végén pedig láthatjuk, hogy hány scenario futott, ebből hány ment át, majd ezt stepekre lebontva is mutatja, illetve a futási időt.


## Összefoglalás
A Cucumber használat során nagyon tetszett, szerintem egy nagyon jó módszer arra, hogy bezárjuk a fejlesztők és az üzleti oldal közötti szakadékot. Lehet vele könnyen olvasható követelményeket definiálni, melyhez nem kell kódolási háttér, és csak pár szintaxisbeli elem van, amiket egyszerűen el lehet sajátítani. 
A step definitionök írása is magától értetődő, és a projekt nyelvén lehetséges.
Egyedül az elindulás volt nehézkes, az sok időt és energiát felemésztett, de ez egy normálisan felépített projektben nem okozott volna problémát. 
Így összefoglalva, szerintem ez egy szuper módszer, amit már a projekt indulásakor lehet használni, és sok félreértést el lehet kerülni. 