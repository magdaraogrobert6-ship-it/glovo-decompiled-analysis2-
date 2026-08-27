package o;

import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class setTypeBoundingRectsMap implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ setSystemUiVisibility read;

    public /* synthetic */ setTypeBoundingRectsMap(setSystemUiVisibility setsystemuivisibility, int i) {
        this.IconCompatParcelizer = i;
        this.read = setsystemuivisibility;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b3 A[PHI: r2
  0x00b3: PHI (r2v20 o.f4) = (r2v19 o.f4), (r2v31 o.f4) binds: [B:19:0x00b0, B:16:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        f4 f4Var;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        setSystemUiVisibility setsystemuivisibility = this.read;
        if (i2 == 0) {
            setsystemuivisibility.IconCompatParcelizer.IconCompatParcelizer((f9) obj);
            return createfromparcel;
        }
        f1 f1Var = (f1) obj;
        getRootStableInsets getrootstableinsets = setsystemuivisibility.read;
        v4 v4Var = setsystemuivisibility.serializer;
        vg vgVar = setsystemuivisibility.MediaSessionCompatQueueItem;
        if (!(f1Var instanceof eh)) {
            if (f1Var instanceof f4) {
                int i3 = RemoteActionCompatParcelizer + 9;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (((sc) vgVar.write.read()) == sc.START_NOW) {
                    int i5 = serializer + 69;
                    int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 31;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        int i9 = 5 / 3;
                    }
                    int i10 = i6 + 91;
                    serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        f4Var = (f4) f1Var;
                        int i11 = 25 / 0;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{f4Var.write(), "work_now_pin"}, getCieXyz.write())).booleanValue()) {
                            CoreComponentFactory coreComponentFactory = setsystemuivisibility.MediaDescriptionCompat;
                            Map mapSingletonMap = Collections.singletonMap("pin_type", "work_now_pin");
                            mapSingletonMap.getClass();
                            coreComponentFactory.IconCompatParcelizer("pin_on_map_clicked", mapSingletonMap);
                        }
                    } else {
                        f4Var = (f4) f1Var;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{f4Var.write(), "work_now_pin"}, getCieXyz.write())).booleanValue()) {
                            CoreComponentFactory coreComponentFactory2 = setsystemuivisibility.MediaDescriptionCompat;
                            Map mapSingletonMap2 = Collections.singletonMap("pin_type", "work_now_pin");
                            mapSingletonMap2.getClass();
                            coreComponentFactory2.IconCompatParcelizer("pin_on_map_clicked", mapSingletonMap2);
                        }
                    }
                    if (v4Var.RemoteActionCompatParcelizer()) {
                        String strIconCompatParcelizer = f4Var.IconCompatParcelizer();
                        strIconCompatParcelizer.getClass();
                        getCurrentInterruptionFilter getcurrentinterruptionfilter = getrootstableinsets.MediaSessionCompatToken;
                        getcurrentinterruptionfilter.write.IconCompatParcelizer((Integer) getcurrentinterruptionfilter.IconCompatParcelizer.get(strIconCompatParcelizer));
                    } else if (setsystemuivisibility.write.read()) {
                        String strIconCompatParcelizer2 = f4Var.IconCompatParcelizer();
                        strIconCompatParcelizer2.getClass();
                        GetWorkNowOpportunity getWorkNowOpportunity = getrootstableinsets.MediaSessionCompatQueueItem;
                        String str = (String) getWorkNowOpportunity.RatingCompat.get(strIconCompatParcelizer2);
                        getWorkNowOpportunity.MediaSessionCompatQueueItem.IconCompatParcelizer(str != null ? new onPopulateAccessibilityEvent(str) : sendAccessibilityEventUnchecked.serializer);
                        int i12 = serializer + 69;
                        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                }
            }
        } else if (((sc) vgVar.write.read()) == sc.START_NOW && v4Var.RemoteActionCompatParcelizer()) {
            int i14 = serializer + 115;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getrootstableinsets.PlaybackStateCompat.write.write(Boolean.TRUE);
            getCurrentInterruptionFilter getcurrentinterruptionfilter2 = getrootstableinsets.MediaSessionCompatToken;
            getcurrentinterruptionfilter2.write.IconCompatParcelizer(null);
            getcurrentinterruptionfilter2.IconCompatParcelizer.clear();
            int i16 = serializer + 73;
            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int i17 = 2 / 4;
            }
        }
        return createfromparcel;
    }
}
