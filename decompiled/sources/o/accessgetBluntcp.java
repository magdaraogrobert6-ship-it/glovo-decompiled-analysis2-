package o;

import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetBluntcp implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ int write = 2;

    public /* synthetic */ accessgetBluntcp(float f, androidx.compose.ui.Modifier modifier, long j, int i) {
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = modifier;
        this.serializer = j;
        this.read = i;
    }

    public /* synthetic */ accessgetBluntcp(androidx.compose.ui.Modifier modifier, float f, long j, int i) {
        this.IconCompatParcelizer = modifier;
        this.RemoteActionCompatParcelizer = f;
        this.serializer = j;
        this.read = i;
    }

    public /* synthetic */ accessgetBluntcp(androidx.compose.ui.Modifier modifier, long j, float f, int i) {
        this.IconCompatParcelizer = modifier;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = f;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 7;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.read;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            accessgetCoarsecp.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, this.serializer, (getBirthDateFull) obj, this.IconCompatParcelizer);
            return createfromparcel2;
        }
        if (i3 != 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            TaskStatusIndicatorKt.write(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, this.serializer, (getBirthDateFull) obj, this.IconCompatParcelizer);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        DividerKt.serializer(this.RemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, this.serializer, (getBirthDateFull) obj, this.IconCompatParcelizer);
        int i5 = MediaSessionCompatQueueItem + 119;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
