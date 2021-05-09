const get2sum = require('../src/2sum/2sum');

test('First two', () => {
    expect(get2sum([1, 9, 13, 20, 47], 10)).toStrictEqual([0, 1]);
});

test('First and last', () => {
    expect(get2sum([3, 2, 4, 1, 9], 12)).toStrictEqual([0, 4]);
});

test('No sum found', () => {
    expect(get2sum([], 10)).toStrictEqual([]);
});

test('Zero twice', () => {
    expect(get2sum([0, 4, 3, 0], 0)).toStrictEqual([0, 3]);
});

test('Negative numbers', () => {
    expect(get2sum([1, -2, 5, 10], -1)).toStrictEqual([0, 1]);
});
