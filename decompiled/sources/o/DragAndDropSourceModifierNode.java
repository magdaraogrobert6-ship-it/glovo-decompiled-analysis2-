package o;

import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.stickyfooter.HomeStickyFooterContentKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DragAndDropSourceModifierNode implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ DragAndDropSourceModifierNode(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
        this.MediaBrowserCompatMediaItem = obj5;
        this.MediaMetadataCompat = obj6;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 115;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj3 = this.MediaMetadataCompat;
        Object obj4 = this.MediaBrowserCompatMediaItem;
        Object obj5 = this.serializer;
        Object obj6 = this.read;
        Object obj7 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        Object obj8 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            if (i4 != 1) {
                ((Integer) obj2).getClass();
                InstantShiftsKt.InstantShifts((InstantShiftsUiModel) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
                return createfromparcel;
            }
            ((Integer) obj2).getClass();
            HomeStickyFooterContentKt.HomeStickyFooterContent((List) obj8, (accessstripNonMetricAffectingCharacterStyleSpans) obj7, (HomeFragment$initPopupLayer$1) obj6, (androidx.compose.ui.Modifier) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
        ((DragAndDropTargetModifierNode) obj8).IconCompatParcelizer(this.IconCompatParcelizer, this.read, this.serializer, this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer | 1);
        int i6 = MediaSessionCompatQueueItem + 23;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return createfromparcel;
    }
}
