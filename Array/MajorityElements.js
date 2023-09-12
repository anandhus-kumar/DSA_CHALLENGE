var majorityElements = function (nums) {

    // better approach

    let len = nums.length;
    //     const map = new Map();

    //     for (let i = 0; i < len; i++){
    //         const num = nums[i];
    //         if (map.has(num)) {
    //             map.set(num, map.get(num) + 1);
    //         }
    //         else {
    //             map.set(num, 1);
    //         }
    //     }

    //     for (const [num, count] of map) {
    //         if (count > Math.floor(len / 2)) {
            
    //             return num;
    //         }
    //     }
    //     return -1;
    // }

    //---------------------------------------------------------------------------------- optimal Approach ---------------------------------------------------------------------------------
    
    // alg name: moores voting algorithm


    let element;
    let count = 0;

    for (let i = 0; i < len; i++) {
        if (count === 0) {
            count = 1;
            element = nums[i];
        } else if (element === nums[i]) {
            count ++;
        } else {
            count --;
        }

    }

    
    let cnt1 = 0;
    for (let i = 0; i < len; i++) {
        if (element === nums[i])
            cnt1 +=1 ;
    }
 
    
    if (cnt1 > Math.floor(len / 2)) {
        return element;
    }
}
    
const number = [2, 2, 1, 1, 1, 2, 2,1,1,1,1];
majorNumber = majorityElements(number);
console.log(majorNumber);