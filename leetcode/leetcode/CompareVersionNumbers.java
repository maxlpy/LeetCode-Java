package leetcode;


public class CompareVersionNumbers {
	public static int compareVersion(String version1, String version2) {
		if (version1 == null || version2 == null)
			return -1;
		String[] str1 = version1.split("\\.");
		String[] str2 = version2.split("\\.");
		int i = 0, j = 0;
		while (i < str1.length && j < str2.length) {
			if (Integer.valueOf(str1[i]) > Integer.valueOf(str2[j])) {
				return 1;
			} else if (Integer.valueOf(str1[i]) < Integer.valueOf(str2[j]))
				return -1;
			else {
				i++; j++;
			}
		}
		if (i < str1.length && Integer.valueOf(str1[i]) > 0)
			return 1;
		else if (i < str2.length && Integer.valueOf(str2[i]) > 0)
			return -1;
		else 
			return 0;
	}
	public int compareVersion2(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        for(int i=0; i<a.length || i<b.length; ++i){
            if(i<a.length && i<b.length){
                if(Integer.valueOf(a[i]) > Integer.valueOf(b[i])) return 1;
                if(Integer.valueOf(a[i]) < Integer.valueOf(b[i])) return -1;
            }
            else if(i<a.length){
                if(Integer.valueOf(a[i]) > 0 ) return 1;
            }
            else{
                if(Integer.valueOf(b[i]) > 0) return -1;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		String version1 = "01";
		String version2 = "1";
		System.out.println(compareVersion(version1, version2));
	}
}
