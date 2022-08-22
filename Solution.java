class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<List<String>>();
        Arrays.sort(products); //sort
        List<String> range = new ArrayList<String>();//range that acceptable for searchword start with the contents of input array
        Collections.addAll(range, products);
        
        for(int i = 0; i < searchWord.length(); i++) {
            ArrayList<String> trans = new ArrayList<String>();// filtered from range
            for(int j = 0; j < range.size(); j++) {
                
                String s = range.get(j);
                
                if(s.length() > i && s.charAt(i) == searchWord.charAt(i)){
                    trans.add(s);
                }
                
            } // filtering process
            List<String> visible = new ArrayList<String>(); // will store value from filtered list and less than or equal to 3
            for(int q = 0; q < 3; q++) {
                if( q >= trans.size())
                    break;
                visible.add(trans.get(q));
                
            }
            
            ans.add(visible); // add to final list
            range = trans; // range get value filtered by trans
        }
        return ans;
    }
}
