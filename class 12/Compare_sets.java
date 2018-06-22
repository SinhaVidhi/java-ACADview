import java.util.*;
class Compare_sets{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("INDIA");
		hs.add("SRI_LANKA");
        hs.add("AFGANISTAN");
        hs.add("NEPAL");
        hs.add("BHUTAN");
        hs.add("BANGLADESH");
        hs.add("MALDIVES");
        hs.add("PAKISTAN"); 
    System.out.println("SARC_COUNTRIES :"+hs);
       HashSet<String> subset=new HashSet<String>();
             subset.add("AFGANISTAN");
             subset.add("ARMENIA");
             subset.add("BHUTAN");
             subset.add("BAHRAN");
             subset.add("CHINA");
             subset.add("INDIA");
             subset.add("MAYANMAAR");
             subset.add("JAPAN");
             subset.add("RUSSIYA");
             subset.add("KUWAIT");
    System.out.println("ASIA_COUNTRIES:"+subset);
           hs.retainAll(subset);
     System.out.println(hs);
	}
}

