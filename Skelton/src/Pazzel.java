
public class Pazzel {
    char[][] arr;
    int width,height;
    final char filler = '0';

    public Pazzel(int width, int height) {
        arr = new char[height][width];
        this.width = width;
        this.height = height;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = filler;
            }
        }
    }

    private boolean add(int x, int y, char c) {
        if (arr[y][x] != filler || arr[y][x] == c ) return false;
        arr[y][x] = c;
        return true;
    }

    public String toString() {
        String str="";
        for (char[] crr : arr) {
            for(char c : crr) {
                str += c+"";
            }
            str += '\n';
        }
        return str;
    }
    public boolean addWord(int x, int y,String str,boolean landScape) {
        int length = str.length();
        int x0 = x;
        int y0 = y;
        int x1 = landScape ? x0 : x0 + length;
        int y1 = landScape ? y0 + length : y0;
        if (x1 > width || y1 > height) return false;

        validateLocation(x0,y0,x1,y1,str);

        for (int i = 0 ; i < str.length() ; i++) {
            x = landScape ? x0 : x0 + i ;
            y = landScape ? y0 + i : y0;
            add(x,y,str.charAt(i));
        }
        return true;
    }

    public boolean validateLocation(int x0,int y0,int x1,int y1,String str) {
        for (int i = y0 ; i < y1 ; i++) {
         for (int j = x0; i < x1 ; j++) {

         }
        }
        return true;
    }

    // shell overite it ??
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // shell overite it ??
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
