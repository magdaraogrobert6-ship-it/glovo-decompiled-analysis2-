package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class execThirdPartySharingSettingsCallbackCommand implements androidx.compose.ui.layout.MeasurePolicy {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final /* synthetic */ androidx.compose.ui.Alignment.Horizontal IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public execThirdPartySharingSettingsCallbackCommand(int i, int i2, int i3, androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.write = i3;
        this.IconCompatParcelizer = horizontal;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, final List list, long j) {
        androidx.compose.ui.layout.Measurable measurable;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        measureScope.getClass();
        list.getClass();
        int i5 = this.RemoteActionCompatParcelizer;
        if (i5 <= 0) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new BrazeInAppMessageManagerExternalSyntheticLambda45(9), 4, null);
        }
        boolean zM3622getHasBoundedWidthimpl = androidx.compose.ui.unit.Constraints.m3622getHasBoundedWidthimpl(j);
        int iRemoteActionCompatParcelizer = this.write;
        int i6 = this.serializer;
        int i7 = 0;
        if (zM3622getHasBoundedWidthimpl) {
            int i8 = MediaDescriptionCompat + 79;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iRemoteActionCompatParcelizer = i8 % 2 != 0 ? RangesKt.RemoteActionCompatParcelizer((androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) >>> ((i5 - 1) >> i6)) << i5, 0, iRemoteActionCompatParcelizer) : RangesKt.RemoteActionCompatParcelizer((androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) - ((i5 - 1) * i6)) / i5, 1, iRemoteActionCompatParcelizer);
        }
        final int i9 = iRemoteActionCompatParcelizer;
        List listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list);
        final ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
        Iterator it = listIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            int i10 = read + 57;
            MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                measurable = (androidx.compose.ui.layout.Measurable) it.next();
                i = 0;
                i2 = 0;
                i3 = 1;
            } else {
                measurable = (androidx.compose.ui.layout.Measurable) it.next();
                i = 0;
                i2 = 0;
                i3 = 12;
            }
            arrayList.add(measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(i9, i9, i, i2, i3, null)));
        }
        final int height = ((androidx.compose.ui.layout.Placeable) onContentCardDismissed.read((List) arrayList)).getHeight();
        final int i11 = ((i5 - 1) * i6) + (i5 * i9);
        int iM3626getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m3622getHasBoundedWidthimpl(j) ? androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) : i11;
        androidx.compose.ui.Alignment.Companion companion = androidx.compose.ui.Alignment.Companion;
        androidx.compose.ui.Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        androidx.compose.ui.Alignment.Horizontal horizontal = this.IconCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{horizontal, centerHorizontally}, getCieXyz.write())).booleanValue()) {
            i7 = (iM3626getMaxWidthimpl - i11) / 2;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{horizontal, companion.getEnd()}, getCieXyz.write())).booleanValue()) {
                i7 = iM3626getMaxWidthimpl - i11;
            }
        }
        final int i12 = i7;
        final int i13 = this.serializer;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, iM3626getMaxWidthimpl, height, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.execSingleValueCallback
            private static int MediaDescriptionCompat = 1;
            private static int MediaMetadataCompat;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i14 = 2 % 2;
                int i15 = MediaMetadataCompat + 21;
                MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                placementScope.getClass();
                Iterator it2 = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    int i18 = i12;
                    if (!zHasNext) {
                        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, ((androidx.compose.ui.layout.Measurable) onContentCardDismissed.MediaDescriptionCompat(list)).mo2209measureBRTryo0(androidx.compose.ui.unit.Constraints.Companion.m3636fixedJhjzzOo(i11, height)), i18, 0, 0.0f, 4, null);
                        return createFromParcel.INSTANCE;
                    }
                    int i19 = MediaDescriptionCompat + 103;
                    MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    Object obj2 = null;
                    if (i19 % 2 != 0) {
                        it2.next();
                        obj2.hashCode();
                        throw null;
                    }
                    Object next = it2.next();
                    if (i17 < 0) {
                        androidx.sqlite.SQLite.serializer();
                        throw null;
                    }
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) next, i18 + ((i9 + i13) * i17), 0, 0.0f, 4, null);
                    i17++;
                }
            }
        }, 4, null);
    }
}
