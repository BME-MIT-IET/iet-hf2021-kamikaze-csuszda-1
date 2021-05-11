const automorphic = require('../src/automorphic_numbers/automorphic_numbers');

test('Returns true for 5', () => {
    expect(automorphic(5)).toBe(true);
});

test('Returns false for 67', () => {
    expect(automorphic(67)).toBe(false);
});

test('Returns true for 0', () => {
    expect(automorphic(0)).toBe(true);
});

test('Returns false for -1', () => {
    expect(automorphic(-1)).toBe(false);
});

test('Returns false for automorphic looking double 2.1', () => {
    expect(automorphic(2.1)).toBe(false);
});

test('Returns false non automorphic looking double 2.0', () => {
    expect(automorphic(2.0)).toBe(false);
});
