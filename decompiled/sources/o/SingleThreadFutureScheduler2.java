package o;

import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose.LastStopSelectionLocationContentKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.PicturesCounterKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SingleThreadFutureScheduler2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ SingleThreadFutureScheduler2(androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = 1;
        this.write = modifier;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ SingleThreadFutureScheduler2(int i, int i2, int i3, Object obj) {
        this.IconCompatParcelizer = i3;
        this.serializer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.write;
        int i5 = this.serializer;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            TagsKt.m5044TagImageZLcQsz0(i5, (androidx.compose.ui.graphics.Color) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            int i6 = read + 37;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            androidx.compose.foundation.text.AndroidCursorHandle_androidKt.read((androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), i4);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            mergeZ1GrekI.write((androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, i5, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 != 3) {
            ((Integer) obj2).getClass();
            PicturesCounterKt.PicturesCounter((androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, i5, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        LastStopSelectionLocationContentKt.LastStopBottomSheetLoadingContent((androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, i5, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i8 = RatingCompat + 25;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return createfromparcel2;
    }
}
