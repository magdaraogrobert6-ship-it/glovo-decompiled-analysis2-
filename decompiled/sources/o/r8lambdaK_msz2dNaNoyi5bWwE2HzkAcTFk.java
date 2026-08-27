package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk extends r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4<Long> {
    private final r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o read;

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Class serializer() {
        return Long.class;
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final void write(Object obj, int i, Object obj2) {
        ((long[]) obj)[i] = ((Long) obj2).longValue();
    }

    private long write(int i) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        return ((long[]) this.IconCompatParcelizer.get(iRemoteActionCompatParcelizer))[serializer(i)];
    }

    public r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk() {
        this.read = new r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk)) {
            return false;
        }
        r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk = (r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk) obj;
        if (size() != r8lambdak_msz2dnanoyi5bwwe2hzkactfk.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (write(i) != r8lambdak_msz2dnanoyi5bwwe2hzkactfk.write(i)) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint
    public final long read(int i) {
        if (i < size()) {
            return write(i);
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Index ", size(), " is out of bounds. List size is "));
        return 0L;
    }

    public final long write() {
        long jWrite = 0;
        if (size() == 0) {
            return 0L;
        }
        for (int i = 0; i < size(); i++) {
            jWrite += write(i);
        }
        return jWrite / ((long) size());
    }

    public r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk(List<Long> list) {
        super(list);
        this.read = new r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o(this);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Long read(Object obj, int i) {
        return Long.valueOf(((long[]) obj)[i]);
    }

    public final void serializer(long j) {
        this.read.RemoteActionCompatParcelizer(j);
    }

    public r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk(List<Long> list, int i) {
        super(list, i);
        this.read = new r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o(this);
    }

    public r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk(int i) {
        super(i);
        this.read = new r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o(this);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Object IconCompatParcelizer(int i) {
        return new long[i];
    }
}
