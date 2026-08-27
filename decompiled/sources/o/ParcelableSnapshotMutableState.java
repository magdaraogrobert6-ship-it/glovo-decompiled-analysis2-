package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ParcelableSnapshotMutableState implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ParcelableSnapshotMutableState(int i, ArrayList arrayList) {
        this.serializer = i;
        this.IconCompatParcelizer = arrayList;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int iM3802getYimpl;
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ArrayList arrayList = this.IconCompatParcelizer;
        if (i != 0) {
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, (androidx.compose.ui.layout.Placeable) arrayList.get(i2), 0, 0, 0.0f, 4, null);
            }
            return createfromparcel;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.foundation.pager.MeasuredPage measuredPage = (androidx.compose.foundation.pager.MeasuredPage) arrayList.get(i3);
            List list = measuredPage.MediaSessionCompatQueueItem;
            boolean z = measuredPage.write;
            if (measuredPage.MediaDescriptionCompat == Integer.MIN_VALUE) {
                TriStateCheckbox.read("position() should be called first");
            }
            int size3 = list.size();
            int i4 = 0;
            while (i4 < size3) {
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) list.get(i4);
                int[] iArr = measuredPage.MediaMetadataCompat;
                int i5 = i4 * 2;
                int i6 = size2;
                long jM3795constructorimpl = androidx.compose.ui.unit.IntOffset.m3795constructorimpl((((long) iArr[i5]) << 32) | (((long) iArr[i5 + 1]) & 4294967295L));
                if (measuredPage.PlaybackStateCompat) {
                    int iM3801getXimpl = androidx.compose.ui.unit.IntOffset.m3801getXimpl(jM3795constructorimpl);
                    if (!z) {
                        iM3801getXimpl = (measuredPage.MediaDescriptionCompat - iM3801getXimpl) - (z ? placeable.getHeight() : placeable.getWidth());
                    }
                    if (z) {
                        int iM3802getYimpl2 = androidx.compose.ui.unit.IntOffset.m3802getYimpl(jM3795constructorimpl);
                        iM3802getYimpl = (measuredPage.MediaDescriptionCompat - iM3802getYimpl2) - (z ? placeable.getHeight() : placeable.getWidth());
                    } else {
                        iM3802getYimpl = androidx.compose.ui.unit.IntOffset.m3802getYimpl(jM3795constructorimpl);
                    }
                    jM3795constructorimpl = androidx.compose.ui.unit.IntOffset.m3795constructorimpl((((long) iM3802getYimpl) & 4294967295L) | (((long) iM3801getXimpl) << 32));
                }
                long jM3805plusqkQi6aY = androidx.compose.ui.unit.IntOffset.m3805plusqkQi6aY(jM3795constructorimpl, measuredPage.MediaSessionCompatToken);
                if (z) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.m2284placeWithLayeraW9wM$default(placementScope2, placeable, jM3805plusqkQi6aY, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 6, (Object) null);
                } else {
                    androidx.compose.ui.layout.Placeable.PlacementScope.m2282placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM3805plusqkQi6aY, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 6, (Object) null);
                }
                i4++;
                size2 = i6;
            }
        }
        return createfromparcel;
    }
}
