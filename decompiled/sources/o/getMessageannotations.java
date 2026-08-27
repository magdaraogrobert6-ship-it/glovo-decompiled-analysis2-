package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getMessageannotations {
    public float IconCompatParcelizer;
    public float MediaMetadataCompat;
    public float read;
    public float serializer;
    public float write;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final ArrayList MediaDescriptionCompat = new ArrayList();

    public final void IconCompatParcelizer(android.graphics.Matrix matrix, android.graphics.Path path) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((accessgetSlotReusePolicyp) arrayList.get(i)).serializer(matrix, path);
        }
    }

    public final void serializer(float f, float f2) {
        SubcomposeLayoutState subcomposeLayoutState = new SubcomposeLayoutState();
        subcomposeLayoutState.serializer = f;
        subcomposeLayoutState.write = f2;
        this.RemoteActionCompatParcelizer.add(subcomposeLayoutState);
        accessset_statep accessset_statepVar = new accessset_statep(subcomposeLayoutState, this.read, this.serializer);
        float fWrite = accessset_statepVar.write();
        float fWrite2 = accessset_statepVar.write();
        serializer(fWrite + 270.0f);
        this.MediaDescriptionCompat.add(accessset_statepVar);
        this.write = fWrite2 + 270.0f;
        this.read = f;
        this.serializer = f2;
    }

    public final void write(float f, float f2, float f3) {
        this.MediaMetadataCompat = f;
        this.read = 0.0f;
        this.serializer = f;
        this.write = f2;
        this.IconCompatParcelizer = (f2 + f3) % 360.0f;
        this.RemoteActionCompatParcelizer.clear();
        this.MediaDescriptionCompat.clear();
    }

    public getMessageannotations() {
        write(0.0f, 270.0f, 0.0f);
    }

    public final void serializer(float f) {
        float f2 = this.write;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.read;
        float f5 = this.serializer;
        accessgetState accessgetstate = new accessgetState(f4, f5, f4, f5);
        accessgetstate.write = this.write;
        accessgetstate.MediaSessionCompatQueueItem = f3;
        this.MediaDescriptionCompat.add(new SubcomposeLayoutKtSubcomposeLayout5(accessgetstate));
        this.write = f;
    }
}
