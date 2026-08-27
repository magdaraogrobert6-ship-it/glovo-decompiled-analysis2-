package o;

import java.util.Iterator;
import java.util.List;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustBridgeInstance13 implements androidx.compose.ui.layout.MeasurePolicy {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ float serializer;

    public AdjustBridgeInstance13(float f) {
        this.serializer = f;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, final long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            measureScope.getClass();
            list.getClass();
            list.iterator();
            throw null;
        }
        measureScope.getClass();
        list.getClass();
        List<androidx.compose.ui.layout.Measurable> list2 = list;
        for (androidx.compose.ui.layout.Measurable measurable : list2) {
            int i3 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "navigationIcon"}, getCieXyz.write())).booleanValue()) {
                int i5 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    measurable.mo2209measureBRTryo0(j);
                    list2.iterator();
                    throw null;
                }
                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
                Iterator it = list2.iterator();
                while (!(!it.hasNext())) {
                    androidx.compose.ui.layout.Measurable measurable2 = (androidx.compose.ui.layout.Measurable) it.next();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "actionIcons"}, getCieXyz.write())).booleanValue()) {
                        int i6 = IconCompatParcelizer + 123;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo1 = measurable2.mo2209measureBRTryo0(j);
                        int iM3626getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) - (Math.max(placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo1.getWidth()) * 2);
                        if (iM3626getMaxWidthimpl < 0) {
                            iM3626getMaxWidthimpl = 0;
                        }
                        for (androidx.compose.ui.layout.Measurable measurable3 : list2) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY}, getCieXyz.write())).booleanValue()) {
                                final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo2 = measurable3.mo2209measureBRTryo0(androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(j, 0, iM3626getMaxWidthimpl, 0, 0, 13, null));
                                final int iWrite = MathKt.write(this.serializer);
                                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), iWrite, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.AdjustBridgeInstance6
                                    private static int MediaDescriptionCompat = 0;
                                    private static int MediaMetadataCompat = 1;

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj) {
                                        int i8 = 2 % 2;
                                        int i9 = MediaMetadataCompat + 95;
                                        MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i10 = i9 % 2;
                                        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                                        placementScope.getClass();
                                        androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo0;
                                        int height = placeable.getHeight();
                                        int i11 = iWrite;
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i11 - height) / 2, 0.0f, 4, null);
                                        long j2 = j;
                                        int iM3626getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j2);
                                        androidx.compose.ui.layout.Placeable placeable2 = placeableMo2209measureBRTryo2;
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (iM3626getMaxWidthimpl2 - placeable2.getWidth()) / 2, (i11 - placeable2.getHeight()) / 2, 0.0f, 4, null);
                                        int iM3626getMaxWidthimpl3 = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j2);
                                        androidx.compose.ui.layout.Placeable placeable3 = placeableMo2209measureBRTryo1;
                                        int width = placeable3.getWidth();
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iM3626getMaxWidthimpl3 - width, (i11 - placeable3.getHeight()) / 2, 0.0f, 4, null);
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        int i12 = MediaDescriptionCompat + 105;
                                        MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i12 % 2 == 0) {
                                            int i13 = 89 / 0;
                                        }
                                        return createfromparcel;
                                    }
                                }, 4, null);
                            }
                        }
                        DrawableTransformation.write("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                DrawableTransformation.write("Collection contains no element matching the predicate.");
                return null;
            }
        }
        DrawableTransformation.write("Collection contains no element matching the predicate.");
        return null;
    }
}
