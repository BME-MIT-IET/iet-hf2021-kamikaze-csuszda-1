/* Part of Cosmos by OpenGenus Foundation */
function factorial(n) {
    if (n < 0 || n % 1 != 0) return undefined;
    return factorialHelper(n);
}

function factorialHelper(n) {
    return n === 0 ? 1 : n * factorial(n - 1);
}

const num = 3;
console.log(factorial(num));

module.exports = factorial;
