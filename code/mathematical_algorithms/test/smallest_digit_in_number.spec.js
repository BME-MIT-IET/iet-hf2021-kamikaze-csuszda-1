const smallest_digit_in_number = require('../src/smallest_digit_in_number/smallest_digit_in_number');

test('Positive Integer', () => {
    expect(smallest_digit_in_number(741963)).toBe(1);
});

test('Negative Integer', () => {
    expect(smallest_digit_in_number(-852963)).toBe(2);
});

test('Positive Floating point', () => {
    expect(smallest_digit_in_number(54.01)).toBe(0);
});

test('Negative Floating point', () => {
    expect(smallest_digit_in_number(-89.98)).toBe(8);
});
