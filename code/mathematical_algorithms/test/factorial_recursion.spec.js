const factorial = require('../src/factorial/factorial_recursion');

test('0 Factorial', () => {
    expect(factorial(0)).toBe(1);
});

test('1 Factorial', () => {
    expect(factorial(1)).toBe(1);
});

test('15 Factorial', () => {
    expect(factorial(20)).toBe(2432902008176640000);
});

test('25 Factorial', () => {
    expect(factorial(25)).toBe(15511210043330985984000000);
});

test('-1 Factorial', () => {
    expect(factorial(-1)).toBe(undefined);
});

test('14564.67 Factorial', () => {
    expect(factorial(-1)).toBe(undefined);
});
