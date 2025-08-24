class Solution {
    public String frequencySort(String s) {
       
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (char i : map.keySet()) {
            list.add(map.get(i));
        }

        Collections.sort(list, Collections.reverseOrder());

        String res = "";

        // loop over the sorted frequencies
        for (int freq : list) {
            for (char key : map.keySet()) {
                if (map.get(key) == freq) {
                    for (int j = 0; j < freq; j++) { // repeat key freq times
                        res += key;
                    }
                    map.put(key, -1); // mark as used to avoid duplicates
                    break;
                }
            }
        }

        System.out.print(map);
        System.out.print(list);
        return res;
    }
}
