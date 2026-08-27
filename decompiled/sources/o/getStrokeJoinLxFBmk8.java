package o;

import com.roadrunner.home.floatinglayer.FloatingContentKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkKt;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getStrokeJoinLxFBmk8 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getStrokeJoinLxFBmk8(StaggeredGridLayoutManager staggeredGridLayoutManager, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 2;
        this.write = staggeredGridLayoutManager;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = modifier;
        this.MediaBrowserCompatMediaItem = i;
    }

    public /* synthetic */ getStrokeJoinLxFBmk8(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.serializer = i2;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.RemoteActionCompatParcelizer = obj4;
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaBrowserCompatMediaItem;
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = this.read;
        Object obj6 = this.write;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            RangesKt.write((Boolean) obj6, this.IconCompatParcelizer, (accessisRenderNodeCompatiblecp) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            FloatingContentKt.FloatingRow((androidx.compose.ui.Modifier) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = MediaMetadataCompat + 21;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        if (i2 == 2) {
            ((Integer) obj2).getClass();
            InstantShiftsKt.InstantShiftsColumn((StaggeredGridLayoutManager) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (androidx.compose.ui.Modifier) obj5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i5 = RatingCompat + 125;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        if (i2 != 3) {
            ((Integer) obj2).intValue();
            RangesKt.IconCompatParcelizer((StartWorkingNavigationUiModelImpl) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        OfferToWorkKt.OfferToWork((OfferToWorkUiModel) obj6, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (logPushStoryPageClickedlambda11) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        return createfromparcel;
    }
}
