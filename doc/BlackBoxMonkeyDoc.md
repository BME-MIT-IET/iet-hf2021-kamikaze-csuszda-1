# Black Box/Monkey Tesztek Dokumentációja
## Tesztek tervezési fázisa
A tesztelésre kiválasztottam két matematikai algoritmust a gyűjteményben tároltak közül, ezek egyikére azért esett a választás, mert másik nyelvű implementációja már másik tesztcsoporttal vizsgálat alá lett vonva.
A kiválasztott tesztelési forma a Monkey Testing és a Black Box testing lett.

### Monkey Testing
Az eredetileg ide tervezett tesztek a Dumb Monkey kategóriába estek volna, viszont a tesztelt termék típusa (függvénykönyvtár, nem teljes alkalmazás) és az ebből következő felhasználási felület (IntelliJ IDE) ezt megakadályozták, hiszen az IDE kikényszerítette a függvények hívásakor a típushelyes paraméterek használatát. 
Ennek következtében a Monkey kénytelen volt Smart Monkey-vá fejlődni és véletlenszerű, de specifikáció szerint helyes adatokkal elárasztani a tesztelt függvényeket. 

### További Black Box tesztek
A Black Box tesztelés módszertanához híven a tesztek úgy készültek, mintha a függvény hívásakor futó kódot nem ismerném. Ennek egyenes következménye, hogy a tesztek ennek a kódnak a belső működését nem célozhatják meg. Maradt tehát az olyan szituációk szimulálása, amik előfordulhatnak éles használat közben.

Ebben az esetben is a körülmények (IDE, függvénykönyvtár, külső tesztelő alkalmazás/keretrendszer hiánya) kikényszerítették a típushelyes függvényhívásokat.
