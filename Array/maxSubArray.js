var maxSubArray = function (nums) {
  let max = nums[0];
  let sum = 0;
  for (let i = 0; i < nums.length; i++) {
    sum += nums[i];
    if (sum > max) {
      max = sum;
    }
    if (sum < 0) {
      sum = 0;
    }
  }
  return max;
};
const number = [5, 4, -1, 7, 8];
majorNumber = maxSubArray(number);
console.log(majorNumber);
