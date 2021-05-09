const get2sum = require('../src/2sum/2sum');

test('First two', () => {
    expect(get2sum([1, 9, 13, 20, 47], 10)).toBe([0, 1]);
});

test('First and last', () => {
    expect(get2sum([3, 2, 4, 1, 9], 12)).toBe([0, 4]);
});

test('No sum found', () => {
    expect(get2sum([], 10)).toBe([]);
});

test('Zero twice', () => {
    expect(get2sum([0, 4, 3, 0], 0)).toBe([0, 3]);
});

test('Negative numbers', () => {
    expect(get2sum([1, -2, 5, 10], -1).toBe([0, 1]));
});
