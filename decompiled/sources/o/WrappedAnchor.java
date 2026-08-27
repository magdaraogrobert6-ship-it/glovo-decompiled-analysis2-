package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.ImageLoadingKt;
import com.roadrunner.heatmap.presentation.info.HeatmapInformationDialogKt;
import com.roadrunner.rrds.compose.component.screenstate.ErrorScreenKt;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WrappedAnchor implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ WrappedAnchor(int i, Integer num, androidx.compose.ui.Modifier modifier, int i2) {
        this.write = 4;
        this.IconCompatParcelizer = i;
        this.serializer = num;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ WrappedAnchor(Object obj, int i, Object obj2, int i2, int i3) {
        this.write = i3;
        this.serializer = obj;
        this.IconCompatParcelizer = i;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ WrappedAnchor(Object obj, Object obj2, int i, int i2, int i3) {
        this.write = i3;
        this.serializer = obj;
        this.read = obj2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.read;
        int i4 = this.IconCompatParcelizer;
        Object obj4 = this.serializer;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            ((BasicTooltipKtanchorSemantics111) obj4).RemoteActionCompatParcelizer(i4, obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            ((GapComposerKtExternalSyntheticLambda0) obj4).RemoteActionCompatParcelizer(i4, obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i5 = MediaDescriptionCompat + 97;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            ((Integer) obj2).getClass();
            ImageLoadingKt.ImageError((androidx.compose.ui.Modifier) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i3);
            int i7 = MediaSessionCompatQueueItem + 93;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 30 / 0;
            }
            return createfromparcel;
        }
        if (i2 == 3) {
            ((Integer) obj2).getClass();
            HeatmapInformationDialogKt.HeatmapDemandInformationRow((String) obj4, (String) obj3, i4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        if (i2 == 4) {
            ((Integer) obj2).getClass();
            setTargetOffsetTopAndBottom.serializer(i4, (Integer) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i9 = MediaSessionCompatQueueItem + 83;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return createfromparcel;
        }
        if (i2 != 5) {
            ((Integer) obj2).getClass();
            TaskStatusIndicatorKt.IconCompatParcelizer((fieldToDouble) obj4, i4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        ErrorScreenKt.ErrorScreen((fieldToInteger) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), i3);
        return createfromparcel;
    }
}
