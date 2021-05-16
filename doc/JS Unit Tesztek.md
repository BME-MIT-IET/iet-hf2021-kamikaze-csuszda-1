# 2 Sum

### Végrehajtott lépések

Elkészítettem az egységteszteket amik ellenőrzik, hogy különböző bemenetekre, hogyan viselkedik az algoritmus. A Unit tesztek mindegyikén elbukott a meglévő implementáció. A függvényt újra implementáltam, majd újra teszteltem. Az eredmények lejjebb láthatók.

Hasznos tanulság volt, hogy érdemes előre elkészíteni a teszteket a kívánt viselkedés ellenőrzésére,
mert így hamar fel lehet ismerni a véletlen hibákat.

### Teszt Eredmények

---

PASS code/mathematical_algorithms/test/2sum.spec.js

√ First two (3 ms)

√ First and last

√ No sum found (1 ms)

√ Zero twice

√ Negative numbers

---

| File      | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s |
| --------- | ------- | -------- | ------- | ------- | ----------------- |
| All files | 100     | 100      | 100     | 100     |
| 2sum.js   | 100     | 100      | 100     | 100     |

---

Test Suites: 1 passed, 1 total

Tests: 5 passed, 5 total

Snapshots: 0 total

Time: 5.201 s

# Factorial

### Elvégzett lépések

Elkészítettem a teszteket, amik ellenőrzik az algoritmus kívánt viselkedését akár szélsőséges, vagy nem valid bemenetekre is. A függvény az egyszerű esetekben jól működött, de nem kezelte megfelelően a negatív és a lebegőpontos számokat. Ezekben az esetekben Stack Overflow error miatt leállt a futás. Könnyen javítható volt a hiba azzal, hogy csak 0-nál nagyobb egész számokra szabad futtatni a függvényt, a többire csak vissza kell térni undefined értékkel.

### Teszt Eredmények

---

PASS code/mathematical_algorithms/test/factorial_recursion.spec.js

√ 0 Factorial (2 ms)

√ 1 Factorial

√ 15 Factorial (1 ms)

√ 25 Factorial

√ -1 Factorial (1 ms)

√ 14564.67 Factorial

---

| File                   | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s |
| ---------------------- | ------- | -------- | ------- | ------- | ----------------- |
| All files              | 100     | 100      | 100     | 100     |
| factorial_recursion.js | 100     | 100      | 100     | 100     |

---

Test Suites: 1 passed, 1 total

Tests: 6 passed, 6 total

Snapshots: 0 total

Time: 2.094 s

# Greatest Digit

### Elvégzett lépések

Elkészítettem a teszteket, amikre ellenőrzik az algoritmus kívánt viselkedését. A függvény csak pozitív egész számokon működött, pedig a legnagyobb számjegy értelmezhető bármilyen valós szám esetén. Kiegészítettem a függvényt, így egy sorral ki tudtam bővíteni a működést negatív és lebegőpontos számokra is.

### Teszt Eredmények

---

PASS code/mathematical_algorithms/test/greatest_digit_in_number.spec.js

√ Positive Integer (2 ms)

√ Negative Integer

√ Positive Floating point

√ Negative Floating point

√ Invalid input (6 ms)

---

| File                        | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s |
| --------------------------- | ------- | -------- | ------- | ------- | ----------------- |
| All files                   | 100     | 100      | 100     | 100     |
| greatest_digit_in_number.js | 100     | 100      | 100     | 100     |

---

Test Suites: 1 passed, 1 total

Tests: 5 passed, 5 total

Snapshots: 0 total

Time: 2.528 s

# Smallest Digit

### Elvégzett lépések

Elkészítettem a teszteket, amikre ellenőrzik az algoritmus kívánt viselkedését. A függvény csak pozitív egész számokon működött, pedig a legkisebb számjegy értelmezhető bármilyen valós szám esetén. A jelenlegi implementáció nem csak hibás, de túlságosan átláthatatlan és hosszú volt. Refaktoráltam a kódot, kihasználva az ES6 lehetőségeit. A refaktorált kód rövidebb lett, mindössze pár sor, és ehhez egy .filter() hozzáfűzésével javítható volt a hiányzó funkcionalitás is.

### Teszt Eredmények

---

PASS code/mathematical_algorithms/test/smallest_digit_in_number.spec.js

√ Positive Integer (2 ms)

√ Negative Integer

√ Positive Floating point

√ Negative Floating point (1 ms)

√ Invalid input (5 ms)

---

| File                        | % Stmts | % Branch | % Funcs | % Lines | Uncovered Line #s |
| --------------------------- | ------- | -------- | ------- | ------- | ----------------- |
| All files                   | 100     | 100      | 100     | 100     |
| smallest_digit_in_number.js | 100     | 100      | 100     | 100     |

---

Test Suites: 1 passed, 1 total

Tests: 5 passed, 5 total

Snapshots: 0 total

Time: 1.896 s, estimated 2 s
