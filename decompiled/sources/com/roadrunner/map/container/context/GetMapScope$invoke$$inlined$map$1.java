package com.roadrunner.map.container.context;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl$special$$inlined$map$1$2;
import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.GetOnPauseUiState;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.rider.state.provider.domain.GetWorkOpportunitiesImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import io.sentry.CombinedScopeView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.AttributionHandler5;
import o.ColumnAdapter;
import o.ImageHeaderParserImageType;
import o.ShortNewsContentCardView;
import o.Worker;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDeviceType;
import o.getHuaweiAdsReferrer;
import o.x1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetMapScope$invoke$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Flow write;

    public /* synthetic */ GetMapScope$invoke$$inlined$map$1(Flow flow, Object obj, int i) {
        this.serializer = i;
        this.write = flow;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r9 r10 r11
  0x0037: PHI (r9v38 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r10v37 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r11v28 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r9 r10 r11
  0x0048: PHI (r9v36 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r10v35 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r11v27 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[PHI: r9 r10 r11
  0x0062: PHI (r9v34 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r10v33 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r11v25 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080 A[PHI: r9 r10 r11
  0x0080: PHI (r9v32 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r10v31 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r11v24 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091 A[PHI: r9 r10 r11
  0x0091: PHI (r9v30 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r10v29 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r11v23 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[PHI: r9 r10 r11
  0x00a2: PHI (r9v28 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r10v27 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r11v22 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[PHI: r9 r10 r11
  0x00c3: PHI (r9v26 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r10v25 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v21 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[PHI: r9 r10 r11
  0x00e4: PHI (r9v24 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r10v23 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r11v19 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[PHI: r9 r10 r11
  0x00f7: PHI (r9v22 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r10v21 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r11v17 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a A[PHI: r9 r10 r11
  0x010a: PHI (r9v20 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r10v19 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r11v15 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[PHI: r9 r10 r11
  0x011d: PHI (r9v18 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r10v17 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r11v14 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e A[PHI: r9 r10 r11
  0x013e: PHI (r9v16 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r10v15 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r11v13 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151 A[PHI: r9 r10 r11
  0x0151: PHI (r9v14 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0151: PHI (r10v13 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0151: PHI (r11v11 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166 A[PHI: r9 r10 r11
  0x0166: PHI (r9v11 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0166: PHI (r10v11 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0166: PHI (r11v10 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x0182  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x0192 A[PHI: r9 r10 r11
  0x0192: PHI (r9v9 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r10v9 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0192: PHI (r11v9 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4 A[PHI: r9 r10 r11
  0x01a4: PHI (r9v7 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r10v7 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01a4: PHI (r11v7 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8 A[PHI: r9 r10 r11
  0x01b8: PHI (r9v5 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01b8: PHI (r10v5 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01b8: PHI (r11v5 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cb A[PHI: r9 r10 r11
  0x01cb: PHI (r9v3 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01cb: PHI (r10v3 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01cb: PHI (r11v3 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01df A[PHI: r9 r10 r11
  0x01df: PHI (r9v1 java.lang.Object) = (r9v0 java.lang.Object), (r9v40 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r10v1 java.lang.Object) = (r10v0 java.lang.Object), (r10v39 java.lang.Object) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r11v1 kotlinx.coroutines.flow.Flow) = (r11v0 kotlinx.coroutines.flow.Flow), (r11v29 kotlinx.coroutines.flow.Flow) binds: [B:8:0x0032, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj;
        Object obj2;
        Flow flow;
        Object objCollect;
        Object objCollect2;
        Object objCollect3;
        Object objCollect4;
        Object objCollect5;
        Object objCollect6;
        int i;
        Object objCollect7;
        Object objCollect8;
        Object objCollect9;
        int i2;
        Object objCollect10;
        Object objCollect11;
        Object objCollect12;
        Object objCollect13;
        int i3;
        Object objCollect14;
        int i4;
        Object objCollect15;
        Object objCollect16;
        Object objCollect17;
        Object objCollect18;
        Object objCollect19;
        int i5 = 2 % 2;
        int i6 = read + 69;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = 18;
        int i8 = 17;
        int i9 = 15;
        int i10 = 14;
        int i11 = 19;
        int i12 = 0;
        Object obj3 = null;
        if (i6 % 2 == 0) {
            int i13 = this.serializer;
            obj = createFromParcel.INSTANCE;
            obj2 = this.IconCompatParcelizer;
            flow = this.write;
            switch (i13) {
                case 0:
                    objCollect2 = ((FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 6, (getContentViewGroupParentLayout) obj2), shortNewsContentCardView);
                    if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect2;
                    }
                    return obj;
                case 1:
                    objCollect3 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new RiderStateRepositoryImpl$special$$inlined$map$1$2(flowCollector, (RiderStateRepositoryImpl) obj2, i12), shortNewsContentCardView);
                    if (objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect3;
                    }
                    return obj;
                case 2:
                    objCollect4 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 4, (Worker) obj2), shortNewsContentCardView);
                    if (objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect4;
                    }
                    return obj;
                case 3:
                    objCollect5 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 5, (ColumnAdapter) obj2), shortNewsContentCardView);
                    if (objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect5;
                    }
                    return obj;
                case 4:
                    objCollect6 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 8, (x1) obj2), shortNewsContentCardView);
                    if (objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        i = RemoteActionCompatParcelizer + 23;
                        read = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            obj3.hashCode();
                            throw null;
                        }
                        obj = objCollect6;
                    }
                    int i14 = RemoteActionCompatParcelizer + 99;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    return obj;
                case 5:
                    objCollect7 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 10, (GetStatusUseCaseImpl) obj2), shortNewsContentCardView);
                    if (objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect7;
                    }
                    return obj;
                case 6:
                    objCollect8 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 12, (AttributionHandler5) obj2), shortNewsContentCardView);
                    if (objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect8;
                    }
                    return obj;
                case 7:
                    objCollect9 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 13, (getDeviceType) obj2), shortNewsContentCardView);
                    if (objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    i2 = RemoteActionCompatParcelizer + 25;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        int i16 = 66 / 0;
                    }
                    return objCollect9;
                case 8:
                    objCollect10 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i10, (GetOnPauseUiState) obj2), shortNewsContentCardView);
                    if (objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect10;
                    }
                    return obj;
                case 9:
                    objCollect11 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (ImageHeaderParserImageType) obj2, i10), shortNewsContentCardView);
                    if (objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect11;
                    }
                    return obj;
                case 10:
                    objCollect12 = ((FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1) flow).collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetShiftInfoImpl) obj2, i9), shortNewsContentCardView);
                    if (objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect12;
                    }
                    return obj;
                case 11:
                    objCollect13 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i9, (GetWorkOpportunitiesImpl) obj2), shortNewsContentCardView);
                    if (objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    i3 = read + 117;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        return objCollect13;
                    }
                    obj3.hashCode();
                    throw null;
                case 12:
                    objCollect14 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetCourierShiftInfoImpl) obj2, i8), shortNewsContentCardView);
                    if (objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    i4 = read + 67;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return objCollect14;
                    }
                    obj3.hashCode();
                    throw null;
                case 13:
                    objCollect15 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (getHuaweiAdsReferrer) obj2, i7), shortNewsContentCardView);
                    if (objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect15;
                    }
                    return obj;
                case 14:
                    objCollect16 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetCourierStatusUseCaseImpl) obj2, i11), shortNewsContentCardView);
                    if (objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect16;
                    }
                    return obj;
                case 15:
                    objCollect17 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 16, (CombinedScopeView) obj2), shortNewsContentCardView);
                    if (objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    int i17 = read + 101;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    return objCollect17;
                case 16:
                    objCollect18 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i8, (ComponentRegistry$Builder) obj2), shortNewsContentCardView);
                    if (objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return obj;
                    }
                    int i19 = RemoteActionCompatParcelizer + 7;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    return objCollect18;
                case 17:
                    objCollect19 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i7, (CombinedScopeView) obj2), shortNewsContentCardView);
                    if (objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect19;
                    }
                    return obj;
                default:
                    objCollect = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i11, (UserPropertiesDataStore) obj2), shortNewsContentCardView);
                    if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect;
                    }
                    return obj;
            }
        }
        int i21 = this.serializer;
        obj = createFromParcel.INSTANCE;
        obj2 = this.IconCompatParcelizer;
        flow = this.write;
        int i22 = 88 / 0;
        switch (i21) {
            case 0:
                objCollect2 = ((FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 6, (getContentViewGroupParentLayout) obj2), shortNewsContentCardView);
                if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect2;
                }
                return obj;
            case 1:
                objCollect3 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new RiderStateRepositoryImpl$special$$inlined$map$1$2(flowCollector, (RiderStateRepositoryImpl) obj2, i12), shortNewsContentCardView);
                if (objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect3;
                }
                return obj;
            case 2:
                objCollect4 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 4, (Worker) obj2), shortNewsContentCardView);
                if (objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect4;
                }
                return obj;
            case 3:
                objCollect5 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 5, (ColumnAdapter) obj2), shortNewsContentCardView);
                if (objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect5;
                }
                return obj;
            case 4:
                objCollect6 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 8, (x1) obj2), shortNewsContentCardView);
                if (objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    i = RemoteActionCompatParcelizer + 23;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        obj3.hashCode();
                        throw null;
                    }
                    obj = objCollect6;
                }
                int i110 = RemoteActionCompatParcelizer + 99;
                read = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                return obj;
            case 5:
                objCollect7 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 10, (GetStatusUseCaseImpl) obj2), shortNewsContentCardView);
                if (objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect7;
                }
                return obj;
            case 6:
                objCollect8 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 12, (AttributionHandler5) obj2), shortNewsContentCardView);
                if (objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect8;
                }
                return obj;
            case 7:
                objCollect9 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 13, (getDeviceType) obj2), shortNewsContentCardView);
                if (objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                i2 = RemoteActionCompatParcelizer + 25;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i112 = 66 / 0;
                }
                return objCollect9;
            case 8:
                objCollect10 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i10, (GetOnPauseUiState) obj2), shortNewsContentCardView);
                if (objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect10;
                }
                return obj;
            case 9:
                objCollect11 = ((FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1) flow).collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (ImageHeaderParserImageType) obj2, i10), shortNewsContentCardView);
                if (objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect11;
                }
                return obj;
            case 10:
                objCollect12 = ((FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1) flow).collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetShiftInfoImpl) obj2, i9), shortNewsContentCardView);
                if (objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect12;
                }
                return obj;
            case 11:
                objCollect13 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i9, (GetWorkOpportunitiesImpl) obj2), shortNewsContentCardView);
                if (objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                i3 = read + 117;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return objCollect13;
                }
                obj3.hashCode();
                throw null;
            case 12:
                objCollect14 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetCourierShiftInfoImpl) obj2, i8), shortNewsContentCardView);
                if (objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                i4 = read + 67;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return objCollect14;
                }
                obj3.hashCode();
                throw null;
            case 13:
                objCollect15 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (getHuaweiAdsReferrer) obj2, i7), shortNewsContentCardView);
                if (objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect15;
                }
                return obj;
            case 14:
                objCollect16 = flow.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, (GetCourierStatusUseCaseImpl) obj2, i11), shortNewsContentCardView);
                if (objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect16;
                }
                return obj;
            case 15:
                objCollect17 = ((GetMapScope$invoke$$inlined$map$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, 16, (CombinedScopeView) obj2), shortNewsContentCardView);
                if (objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i113 = read + 101;
                RemoteActionCompatParcelizer = i113 % Fields.SpotShadowColor;
                int i114 = i113 % 2;
                return objCollect17;
            case 16:
                objCollect18 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i8, (ComponentRegistry$Builder) obj2), shortNewsContentCardView);
                if (objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i115 = RemoteActionCompatParcelizer + 7;
                read = i115 % Fields.SpotShadowColor;
                int i23 = i115 % 2;
                return objCollect18;
            case 17:
                objCollect19 = flow.collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i7, (CombinedScopeView) obj2), shortNewsContentCardView);
                if (objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect19;
                }
                return obj;
            default:
                objCollect = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new HomeStickyFooterUiModelImpl$1$1$1$1$1(flowCollector, i11, (UserPropertiesDataStore) obj2), shortNewsContentCardView);
                if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objCollect;
                }
                return obj;
        }
    }
}
