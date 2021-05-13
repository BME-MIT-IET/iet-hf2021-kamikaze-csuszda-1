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
