var sortColors = function (nums) {
    let n0 = 0, n1 = 0, n2 = 0;

    for (let n of nums) {
        n == 0 ? n0++ : n == 1 ? n1++ : n2++;}

    for (let i = 0; i < nums.length; i++) {
        i < n0 ? (nums[i] = 0) : i < n0 + n1 ? (nums[i] = 1) : (nums[i] = 2);

    }

    return nums;
};


const colors = [2, 0, 2, 1, 1, 0];
const sortedColors = sortColors(colors);
console.log(sortedColors);