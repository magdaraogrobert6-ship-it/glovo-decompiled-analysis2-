package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class configurePaintswdJneE implements getPrimaries {
    public static final String[] read = {"_data"};
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public Object write;

    @Override // o.getPrimaries
    public final void read() {
    }

    public /* synthetic */ configurePaintswdJneE(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            byte[] bArr = (byte[]) obj;
            getinversetransformui_graphics.serializer(((configureStrokePaintho4zsrM) this.write).IconCompatParcelizer != 2 ? new ByteArrayInputStream(bArr) : ByteBuffer.wrap(bArr));
            return;
        }
        if (i != 1) {
            try {
                ByteArrayInputStream byteArrayInputStreamSerializer = configureStrokePaintho4zsrM.serializer((String) obj);
                this.write = byteArrayInputStreamSerializer;
                getinversetransformui_graphics.serializer(byteArrayInputStreamSerializer);
                return;
            } catch (IllegalArgumentException e) {
                getinversetransformui_graphics.write(e);
                return;
            }
        }
        Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.write, read, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            getinversetransformui_graphics.serializer(new File(string));
            return;
        }
        getinversetransformui_graphics.write(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.write)));
    }

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL : r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
        }
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final void write() {
        int i = this.serializer;
        if (i == 0 || i == 1) {
            return;
        }
        try {
            ((ByteArrayInputStream) this.write).close();
        } catch (IOException unused) {
        }
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? InputStream.class : File.class;
        }
        return ((configureStrokePaintho4zsrM) this.write).serializer();
    }

    public configurePaintswdJneE(String str, configureStrokePaintho4zsrM configurestrokepaintho4zsrm) {
        this.serializer = 2;
        this.RemoteActionCompatParcelizer = str;
    }
}
