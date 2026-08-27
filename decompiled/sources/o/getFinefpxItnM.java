package o;

import com.roadrunner.rrds.compose.component.layouts.DividerKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getFinefpxItnM implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getFinefpxItnM(androidx.compose.ui.Modifier modifier, float f, long j, int i, int i2) {
        this.serializer = 0;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = j;
        this.write = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ getFinefpxItnM(float f, androidx.compose.ui.Modifier modifier, long j, int i, int i2, int i3) {
        this.serializer = i3;
        this.RemoteActionCompatParcelizer = f;
        this.read = modifier;
        this.IconCompatParcelizer = j;
        this.write = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ getFinefpxItnM(androidx.compose.ui.Modifier modifier, long j, float f, int i, int i2, int i3) {
        this.serializer = i3;
        this.read = modifier;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = f;
        this.write = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 67;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.write;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            accessgetCoarsecp.serializer(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, this.MediaMetadataCompat, this.IconCompatParcelizer, (getBirthDateFull) obj, this.read);
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            DividerKt.serializer(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, this.MediaMetadataCompat, this.IconCompatParcelizer, (getBirthDateFull) obj, this.read);
            int i5 = MediaSessionCompatQueueItem + 119;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            DividerKt.m5057DividerVerticalDashedDt02yhY(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, this.MediaMetadataCompat, this.IconCompatParcelizer, (getBirthDateFull) obj, this.read);
            return createfromparcel2;
        }
        if (i3 != 3) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            DividerKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer4, this.MediaMetadataCompat, this.IconCompatParcelizer, (getBirthDateFull) obj, this.read);
            int i7 = MediaDescriptionCompat + 3;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        DividerKt.read(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer5, this.MediaMetadataCompat, this.IconCompatParcelizer, (getBirthDateFull) obj, this.read);
        int i9 = MediaSessionCompatQueueItem + 99;
        MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return createfromparcel2;
    }
}
