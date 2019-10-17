package spring;

public class VersionCheck {
	
	public int compareVersion(String version1, String version2) 
    {
		if(version1 == "" || version2 == "")
		{
			System.out.println("Invalid");
		}
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
 
    int i=0;
    while(i<arr1.length || i<arr2.length)
    {
        if(i<arr1.length && i<arr2.length)
        {
            if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]))
            {
                return -1;
            }
            
            else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
            {
                return 1;
            }
        } 
        
        else if(i<arr1.length)
        {
            if(Integer.parseInt(arr1[i]) != 0)
            {
                return 1;
            }
        } 
        
        else if(i<arr2.length)
        {
           if(Integer.parseInt(arr2[i]) != 0)
           {
                return -1;
            }
        }
 
        i++;
    }
 
    return 0;
}

	public static void main(String[] args) 
	{
		VersionCheck vc = new VersionCheck();
		String version1 = "0.1";
		String version2 = "1.1";
		System.out.println("Version : " + vc.compareVersion(version1, version2));
		
		String version3 = "1.0.1";
		String version4 = "1";
		System.out.println("Version : " + vc.compareVersion(version3, version4));
		
		String version5 = "1.01";
		String version6 = "1.0001";
		System.out.println("Version : " + vc.compareVersion(version5, version6));
		
		String version7 = "";
		String version8 = "1.0001";
		System.out.println("Version : " + vc.compareVersion(version7, version8));
		
		
		
		

	}

}
