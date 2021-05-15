# Nem-funkcionális jellemzők vizsgálatának eredménye

## N-királynő probléma
### Használhatóság

A használhatóság ellenőrzésére a 8 királynő probléma megoldási lehetőségét vizsgáltam.
A probléma megoldásához felhasználtam a könyvtár által tartalmazott példakódot, ezt kisebb módosításokkal át lehetett alakítani úgy, hogy a számomra kívánt eredményt adja.
A teszt eredménye alapján megállaptottam, hogy jól felhasználható, és jó minőségű példa van a könyvtárban. Viszont adott bemenetre mindig csupán egyetlen megoldást ad.

### Felmerült problémák
A tesztelés során a következő problémákat találtam:

- Negatív szám esetén a program kezeletlen kivételt dob.


### Teljesítmény

A teljesítmény méréséhez a különböző bemeneti értékekre vizsgáltam az algoritmus futási idejét. Az alábbi grafikon ábrázolja, hogy 29 fölött jelentősen nőtt az algoritmus lefutási ideje, 33 fölött pedig nagyságrendekkel megnőtt. Ez alapján megfigyelhető, hogy az algoritmus kis bemenetekre hatékony, vagyis gyakorlatban a teljesítmény jó.

![](nqueenperformancetime.png)