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
