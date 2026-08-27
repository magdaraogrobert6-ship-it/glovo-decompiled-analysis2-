package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaArOHHDRou134ziY3uMxObWCm_j0 {
    private final ArrayList IconCompatParcelizer = new ArrayList();

    public final ArrayList read() {
        return this.IconCompatParcelizer;
    }

    public static final class IconCompatParcelizer {
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final long write;

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String serializer() {
            return this.IconCompatParcelizer;
        }

        public final long write() {
            return this.write;
        }

        public IconCompatParcelizer(String str, int i, long j) {
            str.getClass();
            this.IconCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = i;
            this.write = j;
        }
    }

    public final long IconCompatParcelizer(long j) {
        ArrayList arrayList = this.IconCompatParcelizer;
        Iterator it = arrayList.iterator();
        long jWrite = 0;
        while (it.hasNext()) {
            jWrite += ((IconCompatParcelizer) it.next()).write();
        }
        return j + 8 + jWrite + ((long) (arrayList.size() * 8));
    }

    public final int serializer() {
        return this.IconCompatParcelizer.size();
    }

    public final void write(r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw r8lambda8fze8wecod2wkcwbnycfxmvefxw) {
        this.IconCompatParcelizer.add(new IconCompatParcelizer(r8lambda8fze8wecod2wkcwbnycfxmvefxw.MediaBrowserCompatMediaItem(), r8lambda8fze8wecod2wkcwbnycfxmvefxw.serializer().getValue(), r8lambda8fze8wecod2wkcwbnycfxmvefxw.read()));
    }
}
