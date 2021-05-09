/*Part of cosmos by OpenGenus Foundation*/
function get2sum(nums, target) {
    let dic = {};
    for (let i = 0; i < nums.length; i++) {
        if (target - nums[i] in dic) {
            return [dic[target - nums[i]], i];
        }
        dic[nums[i]] = i;
    }
    // If the sum is not found return an empty array
    return [];
}

console.log(get2sum(2, 3));

module.exports = get2sum;
