package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DataSyncPayloadUploadTask")
public final class r8lambdaBX0K18oVB3ZRhd56sW0Hu0Xl5_Y extends createOrGetDataStorelambda00 implements r8lambdaIjjabuCberp_OniFCG6l1POUzMI {
    private r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 IconCompatParcelizer;
    private final r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 read;
    private final r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI serializer;
    private final parseLonglambda0 write;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("DataSyncPayloadUploadTask");
        publishexceptionlambda0.read(28800000L);
        publishexceptionlambda0.write(600000L);
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    static {
        new serializer(null);
    }

    public r8lambdaBX0K18oVB3ZRhd56sW0Hu0Xl5_Y(parseLonglambda0 parselonglambda0, r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 r8lambdajfe_chld2jqnyqvpk_1hyhn04, r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi) {
        parselonglambda0.getClass();
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.getClass();
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        this.write = parselonglambda0;
        this.read = r8lambdajfe_chld2jqnyqvpk_1hyhn04;
        this.serializer = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        context.getClass();
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4 = new r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4("DataSyncPayloadUploadTask", false, this, null, 8, null);
        this.IconCompatParcelizer = r8lambda8nvscop5x9zktelkhscw8l8y0f4;
        this.read.write(r8lambda8nvscop5x9zktelkhscw8l8y0f4);
        r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi = this.serializer;
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        Object objSerializer = r8lambda43c3j9_07_y35qq6grmdmadkbhi.serializer(instance_delegatelambda0.write, new r8lambda45sMPFaVnatCFSfwbZadDvq5miU(r8lambda43c3j9_07_y35qq6grmdmadkbhi, 1));
        objSerializer.getClass();
        List list = (List) objSerializer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r8lambda8fzE8wecOd2wkcWBNYCFXmVefxw) it.next()).MediaBrowserCompatMediaItem());
        }
        ArrayList arrayListIconCompatParcelizer = migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(r8lambda43c3j9_07_y35qq6grmdmadkbhi.IconCompatParcelizer(), true);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListIconCompatParcelizer) {
            File file = (File) obj;
            file.getClass();
            String name = file.getName();
            name.getClass();
            int iWrite = hideCurrentlyDisplayingInAppMessage.write(6, name, ".");
            if (iWrite != -1) {
                name = name.substring(0, iWrite);
            }
            if (!arrayList.contains(name)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        return true;
    }

    public final void RemoteActionCompatParcelizer(r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4, String str, Exception exc) {
        r8lambda8nvscop5x9zktelkhscw8l8y0f4.getClass();
        str.getClass();
        parseLonglambda0 parselonglambda0 = this.write;
        if (exc == null) {
            parselonglambda0.RemoteActionCompatParcelizer(str, new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer(false, exc, "DataSyncPayloadUploadTask failed.", new Object[0]);
        }
        this.IconCompatParcelizer = null;
        serializer(true);
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        context.getClass();
        this.write.IconCompatParcelizer("DataSyncPayloadUploadTask is stopping...", new Object[0]);
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4 = this.IconCompatParcelizer;
        if (r8lambda8nvscop5x9zktelkhscw8l8y0f4 != null) {
            this.read.IconCompatParcelizer(r8lambda8nvscop5x9zktelkhscw8l8y0f4);
            this.IconCompatParcelizer = null;
        }
        return false;
    }

    public final void serializer(r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
        r8lambda8nvscop5x9zktelkhscw8l8y0f4.getClass();
        this.write.serializer("DataSyncPayloadUploadTask finished successfully.", new Object[0]);
        this.IconCompatParcelizer = null;
        serializer(false);
    }
}
