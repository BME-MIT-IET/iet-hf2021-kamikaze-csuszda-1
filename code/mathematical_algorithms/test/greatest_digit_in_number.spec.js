const greatestDigit = require('../src/greatest_digit_in_number/greatest_digit_in_number');

test('Positive Integer', () => {
    expect(greatestDigit(741963)).toBe(9);
});

test('Negative Integer', () => {
    expect(greatestDigit(-85263)).toBe(8);
});

test('Positive Floating point', () => {
    expect(greatestDigit(54.01)).toBe(5);
});

test('Negative Floating point', () => {
    expect(greatestDigit(-0.12)).toBe(2);
});

test('Invalid input', () => {
    expect(greatestDigit()).toBe(undefined);
});
