public class Words {
    private String[] words;

    public Words(String[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0 ; i < words.length ; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) sb.append(",");
        }
        sb.append(']');
        return sb.toString();
    }

    public String getWord(int index) {
        if (index > words.length || index < 0 ) return null;
        return words[index];
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

