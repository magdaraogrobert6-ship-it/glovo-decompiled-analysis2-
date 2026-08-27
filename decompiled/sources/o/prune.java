package o;

/* JADX INFO: loaded from: classes2.dex */
public final class prune {
    public int IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public prune(String str) {
        this.read = 2;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = str;
    }

    public String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public int read() {
        return this.IconCompatParcelizer;
    }

    public String IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.substring(i, this.IconCompatParcelizer);
    }

    public String MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer.substring(this.IconCompatParcelizer);
    }

    public boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer < this.RemoteActionCompatParcelizer.length();
    }

    public int serializer() {
        int iCodePointAt = this.RemoteActionCompatParcelizer.codePointAt(this.IconCompatParcelizer);
        this.IconCompatParcelizer = Character.charCount(iCodePointAt) + this.IconCompatParcelizer;
        return iCodePointAt;
    }

    public int write() {
        return this.RemoteActionCompatParcelizer.codePointAt(this.IconCompatParcelizer);
    }

    public boolean write(char c) {
        return this.RemoteActionCompatParcelizer.charAt(this.IconCompatParcelizer) == c;
    }

    public void write(int i) {
        this.IconCompatParcelizer += i;
    }

    public String toString() {
        return this.read != 2 ? super.toString() : MediaMetadataCompat();
    }

    public /* synthetic */ prune(int i, int i2, String str) {
        this.read = i2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public prune(String str, int i) {
        this.read = 4;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
    }

    public boolean write(String str) {
        return MediaMetadataCompat().startsWith(str);
    }
}
