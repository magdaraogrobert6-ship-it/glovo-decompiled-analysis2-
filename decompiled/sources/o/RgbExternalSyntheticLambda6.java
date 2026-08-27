package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class RgbExternalSyntheticLambda6 implements getPrimaries {
    public final ContentResolver IconCompatParcelizer;
    public final Uri read;
    public final boolean serializer;
    public Object write;

    public abstract void IconCompatParcelizer(Object obj);

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final void read() {
    }

    public abstract Object write(Uri uri, ContentResolver contentResolver);

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        try {
            Object objWrite = write(this.read, this.IconCompatParcelizer);
            this.write = objWrite;
            getinversetransformui_graphics.serializer(objWrite);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            getinversetransformui_graphics.write(e);
        }
    }

    public RgbExternalSyntheticLambda6(ContentResolver contentResolver, Uri uri, boolean z) {
        this.IconCompatParcelizer = contentResolver;
        this.read = uri;
        this.serializer = z;
    }

    @Override // o.getPrimaries
    public final void write() {
        Object obj = this.write;
        if (obj != null) {
            try {
                IconCompatParcelizer(obj);
            } catch (IOException unused) {
            }
        }
    }
}
