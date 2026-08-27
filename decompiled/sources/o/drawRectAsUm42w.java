package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class drawRectAsUm42w implements getPrimaries {
    public final /* synthetic */ int read;
    public final Object write;

    @Override // o.getPrimaries
    public final void read() {
    }

    @Override // o.getPrimaries
    public final void write() {
    }

    public /* synthetic */ drawRectAsUm42w(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        int i = this.read;
        Object obj = this.write;
        if (i == 0) {
            getinversetransformui_graphics.serializer(obj);
            return;
        }
        try {
            getinversetransformui_graphics.serializer(DrawScopeMarker.write((File) obj));
        } catch (IOException e) {
            Log.isLoggable("ByteBufferFileLoader", 3);
            getinversetransformui_graphics.write(e);
        }
    }

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return this.read != 0 ? r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL : r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return this.read != 0 ? ByteBuffer.class : this.write.getClass();
    }
}
