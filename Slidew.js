Fixed Window
let sum = 0, max = 0;

for (let i = 0; i < k; i++) sum += arr[i];
max = sum;

for (let i = k; i < arr.length; i++) {
  sum += arr[i] - arr[i - k];
  max = Math.max(max, sum);
}

Variable Window

let set = new Set();
let l = 0, max = 0;

for (let r = 0; r < s.length; r++) {
  while (set.has(s[r])) {
    set.delete(s[l]);
    l++;
  }
  set.add(s[r]);
  max = Math.max(max, r - l + 1);
}
