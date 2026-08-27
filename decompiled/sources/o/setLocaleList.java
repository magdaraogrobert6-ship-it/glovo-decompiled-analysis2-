package o;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class setLocaleList extends BufferedInputStream {
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public setLocaleList(InputStream inputStream) {
        super(inputStream);
    }
}
