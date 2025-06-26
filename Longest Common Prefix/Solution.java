class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String prefix = strs[0];
        for (int i=0; i<prefix.length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if ((strs[j].length() == i) || (strs[j].charAt(i) != prefix.charAt(i))) {
                    if (i == 0) return "";
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
}
