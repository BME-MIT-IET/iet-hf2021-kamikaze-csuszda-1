const smallest_digit_in_number = (input) => {
    if (typeof input !== 'number') {
        console.error('Please enter a number.');
        return undefined;
    }

    return String(input)
        .split('')
        .filter((d) => Number.isInteger(Number.parseInt(d))) // Remove - and . from numbers
        .reduce((a, b) => Math.min(a, b));
};

module.exports = smallest_digit_in_number;

console.log(smallest_digit_in_number(243245));
