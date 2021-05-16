function greatestDigit(num) {
    if (typeof num !== 'number') {
        console.error('Please enter a number.');
        return undefined;
    }

    return String(num)
        .split('')
        .filter((d) => Number.isInteger(Number.parseInt(d))) // Remove - and . from numbers
        .reduce((a, b) => Math.max(a, b));
}

module.exports = greatestDigit;

console.log(greatestDigit(123)); // 3
console.log(greatestDigit(321)); // 3
console.log(greatestDigit(12903)); // 9
