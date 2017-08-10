
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
        if (arr[y][x] != 0 || arr[y][x] != c ) return false;
        arr[y][x] = c;
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
        int x0 = x;
        int y0 = y;
        if (((landScape ? y0 : x0) + str.length()) > (landScape ?  height : width)) return false;
        for (int i = 0 ; i < str.length() ; i++) {
            x = landScape ? x0+i/width : x0+i%width;
            y = landScape ? y0+i%height : y0+i/height;
            add(x,y,str.charAt(i));
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
