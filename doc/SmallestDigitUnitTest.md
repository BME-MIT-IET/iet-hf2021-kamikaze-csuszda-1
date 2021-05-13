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
