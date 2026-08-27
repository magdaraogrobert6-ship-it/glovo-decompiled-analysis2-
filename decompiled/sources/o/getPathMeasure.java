package o;

import android.content.Context;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getPathMeasure {
    public static final TrackingDatabase IconCompatParcelizer;
    public static final isAdapterPositionOnScreen serializer;
    public static final isAdapterPositionOnScreen write;

    static {
        Context context = pauseWebviewIfNecessarylambda10.IconCompatParcelizer;
        if (context == null) {
            removeNodeAtDepth.serializer("applicationContext");
            throw null;
        }
        clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(context, TrackingDatabase.class, "pandora.db.perseus");
        cliprectmtrddeRemoteActionCompatParcelizer.read();
        int i = 1;
        int i2 = 2;
        int i3 = 6;
        reflectiveQuadTo reflectivequadto = new reflectiveQuadTo(i, i2, i3);
        int i4 = 3;
        reflectiveQuadTo reflectivequadto2 = new reflectiveQuadTo(i2, i4, i2);
        int i5 = 4;
        int i6 = 8;
        reflectiveQuadTo reflectivequadto3 = new reflectiveQuadTo(i4, i5, i6);
        int i7 = 5;
        int i8 = 7;
        reflectiveQuadTo reflectivequadto4 = new reflectiveQuadTo(i5, i7, i8);
        reflectiveQuadTo reflectivequadto5 = new reflectiveQuadTo(i7, i3, i4);
        int i9 = 9;
        reflectiveQuadTo reflectivequadto6 = new reflectiveQuadTo(i3, i8, i9);
        reflectiveQuadTo reflectivequadto7 = new reflectiveQuadTo(i8, i6, i5);
        int i10 = 12;
        reflectiveQuadTo reflectivequadto8 = new reflectiveQuadTo(i6, i9, i10);
        int i11 = 10;
        reflectiveQuadTo reflectivequadto9 = new reflectiveQuadTo(i9, i11, i);
        int i12 = 11;
        reflectiveQuadTo reflectivequadto10 = new reflectiveQuadTo(i11, i12, i12);
        reflectiveQuadTo reflectivequadto11 = new reflectiveQuadTo(i12, i10, i7);
        int i13 = 13;
        cliprectmtrddeRemoteActionCompatParcelizer.write(reflectivequadto, reflectivequadto2, reflectivequadto3, reflectivequadto4, reflectivequadto5, reflectivequadto6, reflectivequadto7, reflectivequadto8, reflectivequadto9, reflectivequadto10, reflectivequadto11, new reflectiveQuadTo(i10, i13, i11), new reflectiveQuadTo(i13, 14, 0));
        IconCompatParcelizer = (TrackingDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
        serializer = new isAdapterPositionOnScreen(new onAddedToParentLayer(22));
        write = new isAdapterPositionOnScreen(new onAddedToParentLayer(23));
    }
}
