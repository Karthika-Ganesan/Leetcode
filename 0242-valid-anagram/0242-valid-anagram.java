class Solution {
    public boolean isAnagram(String s, String t) {
    /*char[] schar=s.toCharArray();
    char[] tchar=t.toCharArray();
    if (s.length() != t.length())
    return false;

    Arrays.sort(schar);
    Arrays.sort(tchar);
    for(int i=0;i<schar.length;i++){
    if(schar[i]==tchar[i])
    continue;
    else
    return false;
    }
    return true;
    */
    if (s.length() != t.length())
    return false;

    int count[]=new int[26];
    for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
    }
    for (int i = 0; i < 26; i++) {
    if (count[i] != 0)
        return false;
}
return true;
}
}