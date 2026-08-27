package com.mapbox.navigation.core;

import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.FirestoreGrpc;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.directions.session.DirectionsSessionRoutes;
import com.mapbox.navigation.core.directions.session.IgnoredRoute;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.directions.session.Utils;
import com.mapbox.navigation.core.trip.session.NativeSetRouteError;
import com.mapbox.navigation.core.trip.session.NativeSetRouteValue;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.I$b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCutText;
import o.getExpand;
import o.getGetScrollViewportLength;
import o.getScrollByOffset;
import o.onAnimationEndlambda1;
import o.onContentCardDismissed;
import o.onMove;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$internalSetNavigationRoutes$job$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 $callback;
    public final /* synthetic */ List $routes;
    public final /* synthetic */ getCutText $setRoutesInfo;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Serializable L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 L$7;
    public int label;
    public final /* synthetic */ MapboxNavigation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxNavigation$internalSetNavigationRoutes$job$1(List list, getCutText getcuttext, MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1, MapboxNavigation mapboxNavigation, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$routes = list;
        this.$setRoutesInfo = getcuttext;
        this.$callback = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
        this.this$0 = mapboxNavigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        MapboxNavigation$internalSetNavigationRoutes$job$1 mapboxNavigation$internalSetNavigationRoutes$job$1 = new MapboxNavigation$internalSetNavigationRoutes$job$1(this.$routes, this.$setRoutesInfo, this.$callback, this.this$0, shortNewsContentCardView);
        mapboxNavigation$internalSetNavigationRoutes$job$1.L$0 = obj;
        int i2 = serializer + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return mapboxNavigation$internalSetNavigationRoutes$job$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 103;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((MapboxNavigation$internalSetNavigationRoutes$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = serializer + 47;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x033a  */
    /* JADX WARN: Code duplicated, block: B:105:0x036f A[Catch: all -> 0x01cd, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x03ae A[Catch: all -> 0x0600, TRY_LEAVE, TryCatch #13 {all -> 0x0600, blocks: (B:111:0x0397, B:113:0x03ae), top: B:263:0x0397 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x03f2 A[Catch: all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x05f5, blocks: (B:120:0x03d6, B:125:0x03f2, B:128:0x041b, B:131:0x044b), top: B:259:0x03d6 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x041b A[Catch: all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x05f5, blocks: (B:120:0x03d6, B:125:0x03f2, B:128:0x041b, B:131:0x044b), top: B:259:0x03d6 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x044b A[Catch: all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x05f5, blocks: (B:120:0x03d6, B:125:0x03f2, B:128:0x041b, B:131:0x044b), top: B:259:0x03d6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0472  */
    /* JADX WARN: Code duplicated, block: B:138:0x048f  */
    /* JADX WARN: Code duplicated, block: B:141:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x04b2 A[Catch: all -> 0x05e6, LOOP:0: B:143:0x04ac->B:145:0x04b2, LOOP_END, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x04df A[Catch: all -> 0x05e6, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x04e4 A[Catch: all -> 0x05e6, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x050d  */
    /* JADX WARN: Code duplicated, block: B:159:0x054b A[Catch: all -> 0x05e6, TRY_LEAVE, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0554  */
    /* JADX WARN: Code duplicated, block: B:165:0x0562 A[Catch: all -> 0x05e6, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x056a A[Catch: all -> 0x05e6, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x057d A[Catch: all -> 0x05e6, TRY_LEAVE, TryCatch #2 {all -> 0x05e6, blocks: (B:137:0x048b, B:139:0x0490, B:142:0x04a3, B:143:0x04ac, B:145:0x04b2, B:146:0x04c7, B:163:0x055e, B:165:0x0562, B:166:0x056a, B:167:0x0571, B:169:0x057d, B:150:0x04df, B:152:0x04e4, B:153:0x0507, B:156:0x0517, B:157:0x0523, B:159:0x054b), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:184:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:199:0x0617 A[Catch: all -> 0x062a, TRY_LEAVE, TryCatch #5 {all -> 0x062a, blocks: (B:185:0x05ef, B:186:0x05f4, B:199:0x0617), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0683 A[Catch: all -> 0x0706, TRY_LEAVE, TryCatch #18 {all -> 0x0706, blocks: (B:232:0x0677, B:234:0x0683, B:238:0x06ab, B:239:0x06b5, B:242:0x06c3, B:244:0x06cf, B:248:0x06fb, B:249:0x0705), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x069f  */
    /* JADX WARN: Code duplicated, block: B:237:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:244:0x06cf A[Catch: all -> 0x0706, TryCatch #18 {all -> 0x0706, blocks: (B:232:0x0677, B:234:0x0683, B:238:0x06ab, B:239:0x06b5, B:242:0x06c3, B:244:0x06cf, B:248:0x06fb, B:249:0x0705), top: B:257:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:246:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:247:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:253:0x0713  */
    /* JADX WARN: Code duplicated, block: B:269:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197 A[Catch: all -> 0x0288, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x0288, blocks: (B:47:0x016e, B:56:0x0197), top: B:273:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3 A[Catch: all -> 0x01cd, TRY_ENTER, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c6 A[Catch: all -> 0x01cd, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb A[Catch: all -> 0x01cd, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0224 A[Catch: all -> 0x01cd, LOOP:2: B:71:0x021e->B:73:0x0224, LOOP_END, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0250  */
    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
    /* JADX WARN: Code duplicated, block: B:85:0x028b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0297  */
    /* JADX WARN: Code duplicated, block: B:91:0x02af A[Catch: all -> 0x01cd, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9 A[Catch: all -> 0x01cd, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x030b A[Catch: all -> 0x01cd, LOOP:3: B:94:0x0305->B:96:0x030b, LOOP_END, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0337 A[Catch: all -> 0x01cd, TryCatch #24 {all -> 0x01cd, blocks: (B:62:0x01c3, B:68:0x01d5, B:70:0x01fb, B:71:0x021e, B:73:0x0224, B:74:0x0230, B:77:0x025a, B:79:0x025e, B:89:0x02a1, B:91:0x02af, B:93:0x02e9, B:94:0x0305, B:96:0x030b, B:97:0x0317, B:99:0x0337, B:101:0x033b, B:105:0x036f, B:63:0x01c6, B:64:0x01cc), top: B:277:0x0195 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x036f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x03f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x041b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x044b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x057d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.Serializable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v76, types: [o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.ImageOnlyContentCardViewViewHolder, o.onAnimationEndlambda1] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v102, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v104, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v106, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112, types: [o.onAnimationEndlambda1] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.ImageOnlyContentCardViewViewHolder] */
    /* JADX WARN: Type inference failed for: r6v30, types: [o.ImageOnlyContentCardViewViewHolder] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v5, types: [o.ImageOnlyContentCardViewViewHolder] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        String str;
        ?? r9;
        ?? r8;
        Object obj3;
        ?? r6;
        ?? r2;
        Object obj4;
        ?? r10;
        ?? r11;
        ?? r7;
        String str2;
        String str3;
        ?? r17;
        ?? r15;
        ?? r12;
        ?? r16;
        ?? r13;
        ?? r5;
        ?? r14;
        ?? r18;
        ?? r19;
        ?? r20;
        String str4;
        ?? r21;
        ?? r22;
        ?? r3;
        ?? r23;
        ?? r110;
        ?? r111;
        ?? r24;
        ?? r25;
        ?? r26;
        ?? r4;
        boolean z;
        boolean z2;
        MapboxNavigation mapboxNavigation;
        getCutText getcuttext;
        List list;
        MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
        List list2;
        ?? r27;
        int i;
        ?? r28;
        LoggingLevel loggingLevelLogLevel;
        LoggingLevel loggingLevel;
        ?? r29;
        ?? r33;
        HistoryRecordingStateHandler historyRecordingStateHandler;
        boolean z3;
        MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2;
        Object objAccess$setRoutesToTripSession;
        MapboxDirectionsSession mapboxDirectionsSession;
        ArrayList arrayList;
        Iterator it;
        NavigationRoute navigationRoute;
        String str5;
        ?? r34;
        String str6;
        MapboxDirectionsSession mapboxDirectionsSession2;
        NavigationRoute navigationRoute2;
        String str7;
        ArrayList arrayList2;
        Iterator it2;
        NavigationRoute navigationRoute3;
        String str8;
        int i2;
        Object obj5;
        ?? r30;
        createFromParcel createfromparcel;
        LoggingLevel loggingLevelLogLevel2;
        LoggingLevel loggingLevel2;
        getScrollByOffset getscrollbyoffset;
        ArrayList arrayList3;
        Iterator it3;
        HistoryRecordingStateHandler historyRecordingStateHandler2;
        boolean z4;
        LoggingLevel loggingLevelLogLevel3;
        LoggingLevel loggingLevel3;
        long jElapsedRealtime;
        long jElapsedRealtime2;
        boolean z5;
        int iRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap;
        Iterator it4;
        ?? r31 = 2;
        r31 = 2;
        ?? r32 = 2;
        int i3 = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r35 = this.label;
        ?? r36 = onAnimationEndlambda1.RemoteActionCompatParcelizer;
        ?? r37 = "; Job: ";
        ?? r112 = 1;
        r112 = 1;
        try {
            try {
                try {
                    if (r35 != 0) {
                        try {
                            try {
                                if (r35 == 1) {
                                    int i4 = this.I$0;
                                    mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 = this.L$7;
                                    MapboxNavigation mapboxNavigation2 = (MapboxNavigation) this.L$6;
                                    List list3 = (List) this.L$5;
                                    getCutText getcuttext2 = (getCutText) this.L$4;
                                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) this.L$3;
                                    String str9 = (String) this.L$2;
                                    List list4 = (List) this.L$1;
                                    r32 = (getContentViewGroupParentLayout) this.L$0;
                                    try {
                                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                                        r8 = r32;
                                        r31 = setcustominappmessageanimationfactorylambda0;
                                        r112 = str9;
                                        mapboxNavigation = mapboxNavigation2;
                                        list = list3;
                                        str = "; hasCallback=";
                                        getcuttext = getcuttext2;
                                        r27 = i4;
                                        list2 = list4;
                                        obj2 = "; Job: ";
                                        i = write + 21;
                                        r17 = r36;
                                        serializer = i % Fields.SpotShadowColor;
                                        if (i % 2 == 0) {
                                            LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO);
                                            Object obj6 = null;
                                            obj6.hashCode();
                                            throw null;
                                        }
                                        try {
                                            loggingLevelLogLevel = LoggerProviderKt.logLevel();
                                            loggingLevel = LoggingLevel.INFO;
                                            if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel, loggingLevel)) {
                                                try {
                                                    ?? sb = new StringBuilder();
                                                    str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                                    try {
                                                        sb.append('[');
                                                        sb.append(r112);
                                                        sb.append("] Mutex acquired, starting route processing; IDs: ");
                                                        sb.append(list2);
                                                        LoggerProviderKt.logI(sb.toString(), "MapboxNavigation");
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = r27 == true ? 1 : 0;
                                                        str2 = "[";
                                                        r29 = obj;
                                                        r28 = r17;
                                                        r35 = str3;
                                                        r36 = str2;
                                                        r31 = r31;
                                                        r30 = r8;
                                                        r112 = r112;
                                                        obj5 = obj2;
                                                        r37 = 1;
                                                        r7 = r28;
                                                        r11 = r30;
                                                        r10 = r29;
                                                        obj4 = obj5;
                                                        obj3 = null;
                                                        r2 = r31;
                                                        r35 = r35;
                                                        r36 = r36;
                                                        r37 = r37;
                                                        r6 = r7;
                                                        r8 = r11;
                                                        r9 = r10;
                                                        r112 = r112;
                                                        obj2 = obj4;
                                                        r2.write(obj3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                                    obj = r27 == true ? 1 : 0;
                                                    str2 = "[";
                                                    r29 = obj;
                                                    r28 = r17;
                                                    r35 = str3;
                                                    r36 = str2;
                                                    r31 = r31;
                                                    r30 = r8;
                                                    r112 = r112;
                                                    obj5 = obj2;
                                                    r37 = 1;
                                                    r7 = r28;
                                                    r11 = r30;
                                                    r10 = r29;
                                                    obj4 = obj5;
                                                    obj3 = null;
                                                    r2 = r31;
                                                    r35 = r35;
                                                    r36 = r36;
                                                    r37 = r37;
                                                    r6 = r7;
                                                    r8 = r11;
                                                    r9 = r10;
                                                    r112 = r112;
                                                    obj2 = obj4;
                                                    r2.write(obj3);
                                                    throw th;
                                                }
                                            } else {
                                                str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (getcuttext instanceof SetRoutes$Alternatives) {
                                                                    str6 = ((NavigationRoute) onContentCardDismissed.read(list)).id;
                                                                    str2 = "[";
                                                                    try {
                                                                        mapboxDirectionsSession2 = mapboxNavigation.directionsSession;
                                                                        navigationRoute2 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession2.getRoutes());
                                                                        if (navigationRoute2 != null) {
                                                                            i2 = write + 27;
                                                                            serializer = i2 % Fields.SpotShadowColor;
                                                                            if (i2 % 2 == 0) {
                                                                                String str10 = navigationRoute2.id;
                                                                                Object obj7 = null;
                                                                                obj7.hashCode();
                                                                                throw null;
                                                                            }
                                                                            str7 = navigationRoute2.id;
                                                                        } else {
                                                                            str7 = null;
                                                                        }
                                                                        r33 = r27;
                                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, str7}, getCieXyz.write())).booleanValue()) {
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("Alternatives ");
                                                                            List listSerializer = onContentCardDismissed.serializer(list, 1);
                                                                            arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                                                                            it2 = listSerializer.iterator();
                                                                            while (it2.hasNext()) {
                                                                                arrayList2.add(((NavigationRoute) it2.next()).id);
                                                                            }
                                                                            sb2.append(arrayList2);
                                                                            sb2.append(" are outdated. Primary route has changed from ");
                                                                            sb2.append(((NavigationRoute) onContentCardDismissed.read(list)).id);
                                                                            sb2.append(" to ");
                                                                            navigationRoute3 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession2.getRoutes());
                                                                            if (navigationRoute3 != null) {
                                                                                int i5 = write + 75;
                                                                                serializer = i5 % Fields.SpotShadowColor;
                                                                                int i6 = i5 % 2;
                                                                                str8 = navigationRoute3.id;
                                                                            } else {
                                                                                str8 = null;
                                                                            }
                                                                            sb2.append(str8);
                                                                            ExpectedFactory.createError(new RoutesSetError(sb2.toString())).getClass();
                                                                            mapboxDirectionsSession2.setNavigationRoutesFinished(new DirectionsSessionRoutes(mapboxDirectionsSession2.getRoutes(), mapboxDirectionsSession2.getIgnoredRoutes(), getcuttext));
                                                                            r34 = r27;
                                                                        }
                                                                        r9 = r34;
                                                                        mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                                        r37 = 1;
                                                                        r31 = r31;
                                                                        r8 = r8;
                                                                        r112 = r112;
                                                                        r17 = r17;
                                                                        obj2 = obj2;
                                                                        createfromparcel = createFromParcel.INSTANCE;
                                                                        if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                                                            int i7 = write + 59;
                                                                            serializer = i7 % Fields.SpotShadowColor;
                                                                            int i8 = i7 % 2;
                                                                            if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                                                                ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                            } else {
                                                                                ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                            }
                                                                        }
                                                                        loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                                                        loggingLevel2 = LoggingLevel.INFO;
                                                                        if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                                                            LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                                                                        }
                                                                        r31.write(null);
                                                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                                                            int i9 = serializer + 111;
                                                                            write = i9 % Fields.SpotShadowColor;
                                                                            int i10 = i9 % 2;
                                                                            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                                                            sbM.append(r8.getCoroutineContext().get(r17));
                                                                            LoggerProviderKt.logI(sbM.toString(), "MapboxNavigation");
                                                                        }
                                                                        return createfromparcel;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        obj = r27 == true ? 1 : 0;
                                                                        r29 = obj;
                                                                        r28 = r17;
                                                                        r35 = str3;
                                                                        r36 = str2;
                                                                        r31 = r31;
                                                                        r30 = r8;
                                                                        r112 = r112;
                                                                        obj5 = obj2;
                                                                        r37 = 1;
                                                                        r7 = r28;
                                                                        r11 = r30;
                                                                        r10 = r29;
                                                                        obj4 = obj5;
                                                                        obj3 = null;
                                                                        r2 = r31;
                                                                        r35 = r35;
                                                                        r36 = r36;
                                                                        r37 = r37;
                                                                        r6 = r7;
                                                                        r8 = r11;
                                                                        r9 = r10;
                                                                        r112 = r112;
                                                                        obj2 = obj4;
                                                                        r2.write(obj3);
                                                                        throw th;
                                                                    }
                                                                }
                                                                mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                                r33 = r27 == true ? 1 : 0;
                                                                str2 = "[";
                                                                if (getcuttext instanceof getGetScrollViewportLength) {
                                                                    int i11 = serializer + 113;
                                                                    write = i11 % Fields.SpotShadowColor;
                                                                    int i12 = i11 % 2;
                                                                    mapboxDirectionsSession = mapboxNavigation.directionsSession;
                                                                    if (!mapboxDirectionsSession.getRoutes().isEmpty()) {
                                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) onContentCardDismissed.read(list)).id, ((NavigationRoute) onContentCardDismissed.read(mapboxDirectionsSession.getRoutes())).id}, getCieXyz.write())).booleanValue()) {
                                                                            StringBuilder sb3 = new StringBuilder();
                                                                            sb3.append("Refresh routes ");
                                                                            List list5 = list;
                                                                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                                                                            it = list5.iterator();
                                                                            while (it.hasNext()) {
                                                                                arrayList.add(((NavigationRoute) it.next()).id);
                                                                            }
                                                                            sb3.append(arrayList);
                                                                            sb3.append(" are outdated. Primary route has changed from ");
                                                                            sb3.append(((NavigationRoute) onContentCardDismissed.read(list)).id);
                                                                            sb3.append(" to ");
                                                                            navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession.getRoutes());
                                                                            if (navigationRoute != null) {
                                                                                str5 = navigationRoute.id;
                                                                            } else {
                                                                                str5 = null;
                                                                            }
                                                                            sb3.append(str5);
                                                                            ExpectedFactory.createError(new RoutesSetError(sb3.toString())).getClass();
                                                                            mapboxDirectionsSession.setNavigationRoutesFinished(new DirectionsSessionRoutes(mapboxDirectionsSession.getRoutes(), mapboxDirectionsSession.getIgnoredRoutes(), getcuttext));
                                                                            r34 = r33;
                                                                            r9 = r34;
                                                                            mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                                            r37 = 1;
                                                                            r31 = r31;
                                                                            r8 = r8;
                                                                            r112 = r112;
                                                                            r17 = r17;
                                                                            obj2 = obj2;
                                                                            createfromparcel = createFromParcel.INSTANCE;
                                                                            if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                                                                int i13 = write + 59;
                                                                                serializer = i13 % Fields.SpotShadowColor;
                                                                                int i14 = i13 % 2;
                                                                                if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                                                                    ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                                } else {
                                                                                    ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                                }
                                                                            }
                                                                            loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                                                            loggingLevel2 = LoggingLevel.INFO;
                                                                            if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                                                                LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                                                                            }
                                                                            r31.write(null);
                                                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                                                                int i15 = serializer + 111;
                                                                                write = i15 % Fields.SpotShadowColor;
                                                                                int i16 = i15 % 2;
                                                                                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                                                                sbM2.append(r8.getCoroutineContext().get(r17));
                                                                                LoggerProviderKt.logI(sbM2.toString(), "MapboxNavigation");
                                                                            }
                                                                            return createfromparcel;
                                                                        }
                                                                    }
                                                                }
                                                                this.I$0 = r9 == true ? 1 : 0;
                                                                this.label = 2;
                                                                objAccess$setRoutesToTripSession = MapboxNavigation.access$setRoutesToTripSession(mapboxNavigation, list, getcuttext, this);
                                                                r31 = r31;
                                                                r8 = r8;
                                                                r9 = r9;
                                                                r112 = r112;
                                                                r17 = r17;
                                                                obj2 = obj2;
                                                                if (objAccess$setRoutesToTripSession == coroutineSingletons) {
                                                                    return coroutineSingletons;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                r28 = r17;
                                                                r35 = str3;
                                                                r36 = str2;
                                                                r31 = r31;
                                                                r30 = r8;
                                                                r29 = r9;
                                                                r112 = r112;
                                                                obj5 = obj2;
                                                                r37 = 1;
                                                                r7 = r28;
                                                                r11 = r30;
                                                                r10 = r29;
                                                                obj4 = obj5;
                                                                obj3 = null;
                                                                r2 = r31;
                                                                r35 = r35;
                                                                r36 = r36;
                                                                r37 = r37;
                                                                r6 = r7;
                                                                r8 = r11;
                                                                r9 = r10;
                                                                r112 = r112;
                                                                obj2 = obj4;
                                                                r2.write(obj3);
                                                                throw th;
                                                            }
                                                            historyRecordingStateHandler.getClass();
                                                            list.getClass();
                                                            historyRecordingStateHandler.savedHasRoutes = historyRecordingStateHandler.hasRoutes;
                                                            z3 = !list.isEmpty();
                                                            if (historyRecordingStateHandler.hasRoutes != z3) {
                                                                historyRecordingStateHandler.hasRoutes = z3;
                                                                historyRecordingStateHandler.updateStateAndNotifyObservers();
                                                            }
                                                            this.L$0 = r8;
                                                            this.L$1 = r112;
                                                            this.L$2 = r31;
                                                            this.L$3 = getcuttext;
                                                            this.L$4 = list;
                                                            this.L$5 = mapboxNavigation;
                                                            mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                            this.L$6 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2;
                                                            this.L$7 = null;
                                                            r9 = r33 == true ? 1 : 0;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            r9 = r33 == true ? 1 : 0;
                                                        }
                                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                                                            LoggerProviderKt.logI('[' + r112 + "] Setting routes to history recording handler", "MapboxNavigation");
                                                        }
                                                        historyRecordingStateHandler = mapboxNavigation.historyRecordingStateHandler;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        r9 = r33 == true ? 1 : 0;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                r36 = "[";
                                                r28 = r17;
                                                r35 = str3;
                                                r31 = r31;
                                                r30 = r8;
                                                r29 = r27;
                                                r112 = r112;
                                                obj5 = obj2;
                                                r37 = 1;
                                                r7 = r28;
                                                r11 = r30;
                                                r10 = r29;
                                                obj4 = obj5;
                                                obj3 = null;
                                                r2 = r31;
                                                r35 = r35;
                                                r36 = r36;
                                                r37 = r37;
                                                r6 = r7;
                                                r8 = r11;
                                                r9 = r10;
                                                r112 = r112;
                                                obj2 = obj4;
                                                r2.write(obj3);
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            r35 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                            r36 = "[";
                                            r28 = r17;
                                            r31 = r31;
                                            r30 = r8;
                                            r29 = r27;
                                            r112 = r112;
                                            obj5 = obj2;
                                        }
                                    } catch (CancellationException e) {
                                        e = e;
                                        r21 = r36;
                                        r18 = "; Job: ";
                                        str4 = "; hasCallback=";
                                        r20 = i4;
                                        r22 = 1;
                                        r3 = r32;
                                        r19 = str9;
                                    } catch (Exception e2) {
                                        e = e2;
                                        r13 = i4;
                                        r5 = 1;
                                        str = "; hasCallback=";
                                        r16 = str9;
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                            ?? sb4 = new StringBuilder();
                                            sb4.append('[');
                                            sb4.append(r16);
                                            sb4.append("] Coroutine threw exception: ");
                                            sb4.append(e);
                                            sb4.append(str);
                                            if (r13 != 0) {
                                                int i17 = serializer + 63;
                                                write = i17 % Fields.SpotShadowColor;
                                                int i18 = i17 % 2;
                                                r14 = r5;
                                            } else {
                                                r14 = 0;
                                            }
                                            sb4.append(r14);
                                            LoggerProviderKt.logE(sb4.toString(), "MapboxNavigation");
                                        }
                                        throw e;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        r12 = r36;
                                        r35 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                        r36 = "[";
                                        r15 = str9;
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                            StringBuilder sbM3 = c8$$ExternalSyntheticOutline0.m((String) r36, (String) r15, (String) r35);
                                            sbM3.append(r32.getCoroutineContext().get(r12));
                                            LoggerProviderKt.logI(sbM3.toString(), "MapboxNavigation");
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (r35 != 2) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    int i19 = this.I$0;
                                    MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$3 = (MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1) this.L$6;
                                    mapboxNavigation = (MapboxNavigation) this.L$5;
                                    list = (List) this.L$4;
                                    getCutText getcuttext3 = (getCutText) this.L$3;
                                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) this.L$2;
                                    String str11 = (String) this.L$1;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
                                    try {
                                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                                        r17 = r36;
                                        obj2 = "; Job: ";
                                        str = "; hasCallback=";
                                        getcuttext = getcuttext3;
                                        str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                        str2 = "[";
                                        r9 = i19;
                                        mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$3;
                                        objAccess$setRoutesToTripSession = obj;
                                        r31 = setcustominappmessageanimationfactorylambda1;
                                        r8 = getcontentviewgroupparentlayout;
                                        r112 = str11;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        r9 = i19;
                                        r6 = r36;
                                        obj2 = "; Job: ";
                                        str = "; hasCallback=";
                                        obj3 = null;
                                        r35 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                        r36 = "[";
                                        r37 = 1;
                                        r2 = setcustominappmessageanimationfactorylambda1;
                                        r8 = getcontentviewgroupparentlayout;
                                        r112 = str11;
                                        try {
                                            r2.write(obj3);
                                            throw th;
                                        } catch (CancellationException e3) {
                                            e = e3;
                                            r4 = r8;
                                            r111 = r112;
                                            r26 = r37;
                                            r25 = r6;
                                            r24 = r9;
                                            r110 = obj2;
                                            str4 = str;
                                            r3 = r4;
                                            r22 = r26;
                                            r21 = r25;
                                            r20 = r24;
                                            r19 = r111;
                                            r18 = r110;
                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                                ?? sb5 = new StringBuilder();
                                                sb5.append('[');
                                                sb5.append(r19);
                                                sb5.append("] Coroutine CANCELLED: ");
                                                sb5.append(e);
                                                sb5.append(r18);
                                                sb5.append(r3.getCoroutineContext().get(r21));
                                                sb5.append(str4);
                                                if (r20 != 0) {
                                                    r23 = r22;
                                                } else {
                                                    r23 = 0;
                                                }
                                                sb5.append(r23);
                                                LoggerProviderKt.logE(sb5.toString(), "MapboxNavigation");
                                            }
                                            throw e;
                                        } catch (Exception e4) {
                                            e = e4;
                                            r16 = r112;
                                            r5 = r37;
                                            r13 = r9;
                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                                ?? sb6 = new StringBuilder();
                                                sb6.append('[');
                                                sb6.append(r16);
                                                sb6.append("] Coroutine threw exception: ");
                                                sb6.append(e);
                                                sb6.append(str);
                                                if (r13 != 0) {
                                                    int i110 = serializer + 63;
                                                    write = i110 % Fields.SpotShadowColor;
                                                    int i111 = i110 % 2;
                                                    r14 = r5;
                                                } else {
                                                    r14 = 0;
                                                }
                                                sb6.append(r14);
                                                LoggerProviderKt.logE(sb6.toString(), "MapboxNavigation");
                                            }
                                            throw e;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            r32 = r8;
                                            r15 = r112;
                                            r12 = r6;
                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                                StringBuilder sbM4 = c8$$ExternalSyntheticOutline0.m((String) r36, (String) r15, (String) r35);
                                                sbM4.append(r32.getCoroutineContext().get(r12));
                                                LoggerProviderKt.logI(sbM4.toString(), "MapboxNavigation");
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                r31.write(null);
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                    int i112 = serializer + 111;
                                    write = i112 % Fields.SpotShadowColor;
                                    int i113 = i112 % 2;
                                    StringBuilder sbM5 = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                    sbM5.append(r8.getCoroutineContext().get(r17));
                                    LoggerProviderKt.logI(sbM5.toString(), "MapboxNavigation");
                                }
                                return createfromparcel;
                            } catch (CancellationException e5) {
                                e = e5;
                                r6 = r17;
                                r4 = r8;
                                r111 = r112;
                                r26 = r37;
                                r25 = r6;
                                r24 = r9;
                                r110 = obj2;
                                str4 = str;
                                r3 = r4;
                                r22 = r26;
                                r21 = r25;
                                r20 = r24;
                                r19 = r111;
                                r18 = r110;
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                    ?? sb7 = new StringBuilder();
                                    sb7.append('[');
                                    sb7.append(r19);
                                    sb7.append("] Coroutine CANCELLED: ");
                                    sb7.append(e);
                                    sb7.append(r18);
                                    sb7.append(r3.getCoroutineContext().get(r21));
                                    sb7.append(str4);
                                    if (r20 != 0) {
                                        r23 = r22;
                                    } else {
                                        r23 = 0;
                                    }
                                    sb7.append(r23);
                                    LoggerProviderKt.logE(sb7.toString(), "MapboxNavigation");
                                }
                                throw e;
                            } catch (Exception e6) {
                                e = e6;
                                r16 = r112;
                                r5 = r37;
                                r13 = r9;
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                    ?? sb8 = new StringBuilder();
                                    sb8.append('[');
                                    sb8.append(r16);
                                    sb8.append("] Coroutine threw exception: ");
                                    sb8.append(e);
                                    sb8.append(str);
                                    if (r13 != 0) {
                                        int i114 = serializer + 63;
                                        write = i114 % Fields.SpotShadowColor;
                                        int i115 = i114 % 2;
                                        r14 = r5;
                                    } else {
                                        r14 = 0;
                                    }
                                    sb8.append(r14);
                                    LoggerProviderKt.logE(sb8.toString(), "MapboxNavigation");
                                }
                                throw e;
                            } catch (Throwable th13) {
                                th = th13;
                                r6 = r17;
                                r35 = str3;
                                r36 = str2;
                                r32 = r8;
                                r15 = r112;
                                r12 = r6;
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                    StringBuilder sbM6 = c8$$ExternalSyntheticOutline0.m((String) r36, (String) r15, (String) r35);
                                    sbM6.append(r32.getCoroutineContext().get(r12));
                                    LoggerProviderKt.logI(sbM6.toString(), "MapboxNavigation");
                                }
                                throw th;
                            }
                            getscrollbyoffset = (getScrollByOffset) objAccess$setRoutesToTripSession;
                            if (getscrollbyoffset instanceof NativeSetRouteValue) {
                                int i20 = serializer + 53;
                                write = i20 % Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                                try {
                                    loggingLevelLogLevel3 = LoggerProviderKt.logLevel();
                                    loggingLevel3 = LoggingLevel.INFO;
                                    if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel3, loggingLevel3)) {
                                        LoggerProviderKt.logI('[' + r112 + "] TripSession accepted routes, creating DirectionsSessionRoutes", "MapboxNavigation");
                                    }
                                    DirectionsSessionRoutes directionsSessionRoutesCreateDirectionsSessionRoutes = Utils.createDirectionsSessionRoutes(list, (NativeSetRouteValue) getscrollbyoffset, getcuttext);
                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel3)) {
                                        LoggerProviderKt.logI('[' + r112 + "] Notifying observers via setNavigationRoutesFinished - STARTING (this may block if observers do sync work)", "MapboxNavigation");
                                    }
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                    mapboxNavigation.directionsSession.setNavigationRoutesFinished(directionsSessionRoutesCreateDirectionsSessionRoutes);
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel3)) {
                                        LoggerProviderKt.logI('[' + r112 + "] Observer notification COMPLETED in " + (jElapsedRealtime2 - jElapsedRealtime) + "ms", "MapboxNavigation");
                                    }
                                    if (getcuttext instanceof getExpand) {
                                        int i22 = serializer + 97;
                                        write = i22 % Fields.SpotShadowColor;
                                        int i23 = i22 % 2;
                                        E$b e$b = mapboxNavigation.routeRefreshController;
                                        e$b.getClass();
                                        I$b i$b = (I$b) e$b.RemoteActionCompatParcelizer;
                                        i$b.pause();
                                        i$b.MediaSessionCompatQueueItem = list;
                                        z5 = true;
                                        i$b.resume(true);
                                    } else {
                                        z5 = true;
                                    }
                                    List list6 = directionsSessionRoutesCreateDirectionsSessionRoutes.ignoredRoutes;
                                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list6, 10));
                                    if (iRemoteActionCompatParcelizer < 16) {
                                        iRemoteActionCompatParcelizer = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                                    it4 = list6.iterator();
                                    while (it4.hasNext()) {
                                        linkedHashMap.put(((IgnoredRoute) it4.next()).navigationRoute.id, new RoutesSetError("invalid alternative"));
                                    }
                                    ExpectedFactory.createValue(new RoutesSetSuccess(linkedHashMap)).getClass();
                                    r31 = r31;
                                    r37 = z5;
                                    r8 = r8;
                                    r9 = r9;
                                    r112 = r112;
                                    r17 = r17;
                                    obj2 = obj2;
                                } catch (Throwable th14) {
                                    th = th14;
                                    r37 = 1;
                                    r7 = r17;
                                    r35 = str3;
                                    r36 = str2;
                                    r11 = r8;
                                    r10 = r9;
                                    obj4 = obj2;
                                    obj3 = null;
                                    r2 = r31;
                                    r35 = r35;
                                    r36 = r36;
                                    r37 = r37;
                                    r6 = r7;
                                    r8 = r11;
                                    r9 = r10;
                                    r112 = r112;
                                    obj2 = obj4;
                                    r2.write(obj3);
                                    throw th;
                                }
                            } else {
                                r37 = 1;
                                r37 = 1;
                                if (getscrollbyoffset instanceof NativeSetRouteError) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ?? sb9 = new StringBuilder();
                                sb9.append('[');
                                sb9.append(r112);
                                sb9.append("] Routes with IDs ");
                                List list7 = list;
                                arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                                it3 = list7.iterator();
                                while (it3.hasNext()) {
                                    int i24 = write + 61;
                                    serializer = i24 % Fields.SpotShadowColor;
                                    int i25 = i24 % 2;
                                    arrayList3.add(((NavigationRoute) it3.next()).id);
                                }
                                sb9.append(arrayList3);
                                sb9.append(" will be ignored as they are not valid");
                                LoggerProviderKt.logE(sb9.toString(), null);
                                ExpectedFactory.createError(new RoutesSetError(((NativeSetRouteError) getscrollbyoffset).error)).getClass();
                                historyRecordingStateHandler2 = mapboxNavigation.historyRecordingStateHandler;
                                z4 = historyRecordingStateHandler2.savedHasRoutes;
                                r31 = r31;
                                r8 = r8;
                                r9 = r9;
                                r112 = r112;
                                r17 = r17;
                                obj2 = obj2;
                                if (historyRecordingStateHandler2.hasRoutes != z4) {
                                    historyRecordingStateHandler2.hasRoutes = z4;
                                    historyRecordingStateHandler2.updateStateAndNotifyObservers();
                                    r31 = r31;
                                    r8 = r8;
                                    r9 = r9;
                                    r112 = r112;
                                    r17 = r17;
                                    obj2 = obj2;
                                }
                            }
                            createfromparcel = createFromParcel.INSTANCE;
                            if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                int i116 = write + 59;
                                serializer = i116 % Fields.SpotShadowColor;
                                int i117 = i116 % 2;
                                if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                    ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                } else {
                                    ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                }
                            }
                            loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                            loggingLevel2 = LoggingLevel.INFO;
                            if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            r28 = r17;
                            r35 = str3;
                            r36 = str2;
                            r31 = r31;
                            r30 = r8;
                            r29 = r9;
                            r112 = r112;
                            obj5 = obj2;
                            r37 = 1;
                            r7 = r28;
                            r11 = r30;
                            r10 = r29;
                            obj4 = obj5;
                            obj3 = null;
                            r2 = r31;
                            r35 = r35;
                            r36 = r36;
                            r37 = r37;
                            r6 = r7;
                            r8 = r11;
                            r9 = r10;
                            r112 = r112;
                            obj2 = obj4;
                            r2.write(obj3);
                            throw th;
                        }
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.L$0;
                        List list8 = this.$routes;
                        List list9 = list8;
                        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list9, 10));
                        Iterator it5 = list9.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((NavigationRoute) it5.next()).id);
                        }
                        getCutText getcuttext4 = this.$setRoutesInfo;
                        String strMapToReason = FirestoreGrpc.mapToReason(getcuttext4);
                        MapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 mapboxNavigation$prepareNavigationForRoutesParsing$2$1$4 = this.$callback;
                        boolean z6 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$4 != null;
                        str = "; hasCallback=";
                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                            StringBuilder sbM7 = af$$ExternalSyntheticOutline0.m("[", strMapToReason, "] Coroutine launched, waiting to acquire routeUpdateMutex; hasCallback=", "; IDs: ", z6);
                            sbM7.append(arrayList4);
                            sbM7.append("; Job: ");
                            sbM7.append(getcontentviewgroupparentlayout2.getCoroutineContext().get(r36));
                            LoggerProviderKt.logI(sbM7.toString(), "MapboxNavigation");
                        }
                        try {
                            try {
                                MapboxNavigation mapboxNavigation3 = this.this$0;
                                try {
                                    MutexImpl mutexImpl = mapboxNavigation3.routeUpdateMutex;
                                    this.L$0 = getcontentviewgroupparentlayout2;
                                    this.L$1 = arrayList4;
                                    this.L$2 = strMapToReason;
                                    this.L$3 = mutexImpl;
                                    this.L$4 = getcuttext4;
                                    this.L$5 = list8;
                                    this.L$6 = mapboxNavigation3;
                                    this.L$7 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$4;
                                    this.I$0 = z6 ? 1 : 0;
                                    obj = getcontentviewgroupparentlayout2;
                                    try {
                                        try {
                                            this.label = 1;
                                            try {
                                                if (mutexImpl.lock(this) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                r31 = mutexImpl;
                                                r112 = strMapToReason;
                                                mapboxNavigation = mapboxNavigation3;
                                                getcuttext = getcuttext4;
                                                list = list8;
                                                mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$4;
                                                r8 = obj;
                                                r27 = z6;
                                                list2 = arrayList4;
                                                obj2 = "; Job: ";
                                                i = write + 21;
                                                r17 = r36;
                                                serializer = i % Fields.SpotShadowColor;
                                                if (i % 2 == 0) {
                                                    LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO);
                                                    Object obj8 = null;
                                                    obj8.hashCode();
                                                    throw null;
                                                }
                                                loggingLevelLogLevel = LoggerProviderKt.logLevel();
                                                loggingLevel = LoggingLevel.INFO;
                                                if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel, loggingLevel)) {
                                                    ?? sb10 = new StringBuilder();
                                                    str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                                    sb10.append('[');
                                                    sb10.append(r112);
                                                    sb10.append("] Mutex acquired, starting route processing; IDs: ");
                                                    sb10.append(list2);
                                                    LoggerProviderKt.logI(sb10.toString(), "MapboxNavigation");
                                                } else {
                                                    str3 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                                }
                                                if (getcuttext instanceof SetRoutes$Alternatives) {
                                                    str6 = ((NavigationRoute) onContentCardDismissed.read(list)).id;
                                                    str2 = "[";
                                                    mapboxDirectionsSession2 = mapboxNavigation.directionsSession;
                                                    navigationRoute2 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession2.getRoutes());
                                                    if (navigationRoute2 != null) {
                                                        i2 = write + 27;
                                                        serializer = i2 % Fields.SpotShadowColor;
                                                        if (i2 % 2 == 0) {
                                                            String str12 = navigationRoute2.id;
                                                            Object obj9 = null;
                                                            obj9.hashCode();
                                                            throw null;
                                                        }
                                                        str7 = navigationRoute2.id;
                                                    } else {
                                                        str7 = null;
                                                    }
                                                    r33 = r27;
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, str7}, getCieXyz.write())).booleanValue()) {
                                                        StringBuilder sb11 = new StringBuilder();
                                                        sb11.append("Alternatives ");
                                                        List listSerializer2 = onContentCardDismissed.serializer(list, 1);
                                                        arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer2, 10));
                                                        it2 = listSerializer2.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList2.add(((NavigationRoute) it2.next()).id);
                                                        }
                                                        sb11.append(arrayList2);
                                                        sb11.append(" are outdated. Primary route has changed from ");
                                                        sb11.append(((NavigationRoute) onContentCardDismissed.read(list)).id);
                                                        sb11.append(" to ");
                                                        navigationRoute3 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession2.getRoutes());
                                                        if (navigationRoute3 != null) {
                                                            int i26 = write + 75;
                                                            serializer = i26 % Fields.SpotShadowColor;
                                                            int i27 = i26 % 2;
                                                            str8 = navigationRoute3.id;
                                                        } else {
                                                            str8 = null;
                                                        }
                                                        sb11.append(str8);
                                                        ExpectedFactory.createError(new RoutesSetError(sb11.toString())).getClass();
                                                        mapboxDirectionsSession2.setNavigationRoutesFinished(new DirectionsSessionRoutes(mapboxDirectionsSession2.getRoutes(), mapboxDirectionsSession2.getIgnoredRoutes(), getcuttext));
                                                        r34 = r27;
                                                    }
                                                    r9 = r34;
                                                    mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                    r37 = 1;
                                                    r31 = r31;
                                                    r8 = r8;
                                                    r112 = r112;
                                                    r17 = r17;
                                                    obj2 = obj2;
                                                    createfromparcel = createFromParcel.INSTANCE;
                                                    if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                                        int i118 = write + 59;
                                                        serializer = i118 % Fields.SpotShadowColor;
                                                        int i119 = i118 % 2;
                                                        if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                                            ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                        } else {
                                                            ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                        }
                                                    }
                                                    loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                                    loggingLevel2 = LoggingLevel.INFO;
                                                    if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                                        LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                                                    }
                                                    r31.write(null);
                                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                                        int i1110 = serializer + 111;
                                                        write = i1110 % Fields.SpotShadowColor;
                                                        int i1111 = i1110 % 2;
                                                        StringBuilder sbM8 = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                                        sbM8.append(r8.getCoroutineContext().get(r17));
                                                        LoggerProviderKt.logI(sbM8.toString(), "MapboxNavigation");
                                                    }
                                                    return createfromparcel;
                                                }
                                                mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                r33 = r27 == true ? 1 : 0;
                                                str2 = "[";
                                                if (getcuttext instanceof getGetScrollViewportLength) {
                                                    int i120 = serializer + 113;
                                                    write = i120 % Fields.SpotShadowColor;
                                                    int i121 = i120 % 2;
                                                    mapboxDirectionsSession = mapboxNavigation.directionsSession;
                                                    if (!mapboxDirectionsSession.getRoutes().isEmpty()) {
                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) onContentCardDismissed.read(list)).id, ((NavigationRoute) onContentCardDismissed.read(mapboxDirectionsSession.getRoutes())).id}, getCieXyz.write())).booleanValue()) {
                                                            StringBuilder sb12 = new StringBuilder();
                                                            sb12.append("Refresh routes ");
                                                            List list10 = list;
                                                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
                                                            it = list10.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList.add(((NavigationRoute) it.next()).id);
                                                            }
                                                            sb12.append(arrayList);
                                                            sb12.append(" are outdated. Primary route has changed from ");
                                                            sb12.append(((NavigationRoute) onContentCardDismissed.read(list)).id);
                                                            sb12.append(" to ");
                                                            navigationRoute = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession.getRoutes());
                                                            if (navigationRoute != null) {
                                                                str5 = navigationRoute.id;
                                                            } else {
                                                                str5 = null;
                                                            }
                                                            sb12.append(str5);
                                                            ExpectedFactory.createError(new RoutesSetError(sb12.toString())).getClass();
                                                            mapboxDirectionsSession.setNavigationRoutesFinished(new DirectionsSessionRoutes(mapboxDirectionsSession.getRoutes(), mapboxDirectionsSession.getIgnoredRoutes(), getcuttext));
                                                            r34 = r33;
                                                            r9 = r34;
                                                            mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                            r37 = 1;
                                                            r31 = r31;
                                                            r8 = r8;
                                                            r112 = r112;
                                                            r17 = r17;
                                                            obj2 = obj2;
                                                            createfromparcel = createFromParcel.INSTANCE;
                                                            if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                                                int i1112 = write + 59;
                                                                serializer = i1112 % Fields.SpotShadowColor;
                                                                int i1113 = i1112 % 2;
                                                                if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                                                    ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                } else {
                                                                    ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                                }
                                                            }
                                                            loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                                            loggingLevel2 = LoggingLevel.INFO;
                                                            if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                                                LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                                                            }
                                                            r31.write(null);
                                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                                                int i1114 = serializer + 111;
                                                                write = i1114 % Fields.SpotShadowColor;
                                                                int i1115 = i1114 % 2;
                                                                StringBuilder sbM9 = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                                                sbM9.append(r8.getCoroutineContext().get(r17));
                                                                LoggerProviderKt.logI(sbM9.toString(), "MapboxNavigation");
                                                            }
                                                            return createfromparcel;
                                                        }
                                                    }
                                                }
                                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                                                    LoggerProviderKt.logI('[' + r112 + "] Setting routes to history recording handler", "MapboxNavigation");
                                                }
                                                historyRecordingStateHandler = mapboxNavigation.historyRecordingStateHandler;
                                                historyRecordingStateHandler.getClass();
                                                list.getClass();
                                                historyRecordingStateHandler.savedHasRoutes = historyRecordingStateHandler.hasRoutes;
                                                z3 = !list.isEmpty();
                                                if (historyRecordingStateHandler.hasRoutes != z3) {
                                                    historyRecordingStateHandler.hasRoutes = z3;
                                                    historyRecordingStateHandler.updateStateAndNotifyObservers();
                                                }
                                                this.L$0 = r8;
                                                this.L$1 = r112;
                                                this.L$2 = r31;
                                                this.L$3 = getcuttext;
                                                this.L$4 = list;
                                                this.L$5 = mapboxNavigation;
                                                mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$1;
                                                this.L$6 = mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2;
                                                this.L$7 = null;
                                                r9 = r33 == true ? 1 : 0;
                                                this.I$0 = r9 == true ? 1 : 0;
                                                this.label = 2;
                                                objAccess$setRoutesToTripSession = MapboxNavigation.access$setRoutesToTripSession(mapboxNavigation, list, getcuttext, this);
                                                r31 = r31;
                                                r8 = r8;
                                                r9 = r9;
                                                r112 = r112;
                                                r17 = r17;
                                                obj2 = obj2;
                                                if (objAccess$setRoutesToTripSession == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                getscrollbyoffset = (getScrollByOffset) objAccess$setRoutesToTripSession;
                                                if (getscrollbyoffset instanceof NativeSetRouteValue) {
                                                    int i28 = serializer + 53;
                                                    write = i28 % Fields.SpotShadowColor;
                                                    int i29 = i28 % 2;
                                                    loggingLevelLogLevel3 = LoggerProviderKt.logLevel();
                                                    loggingLevel3 = LoggingLevel.INFO;
                                                    if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel3, loggingLevel3)) {
                                                        LoggerProviderKt.logI('[' + r112 + "] TripSession accepted routes, creating DirectionsSessionRoutes", "MapboxNavigation");
                                                    }
                                                    DirectionsSessionRoutes directionsSessionRoutesCreateDirectionsSessionRoutes2 = Utils.createDirectionsSessionRoutes(list, (NativeSetRouteValue) getscrollbyoffset, getcuttext);
                                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel3)) {
                                                        LoggerProviderKt.logI('[' + r112 + "] Notifying observers via setNavigationRoutesFinished - STARTING (this may block if observers do sync work)", "MapboxNavigation");
                                                    }
                                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                                    mapboxNavigation.directionsSession.setNavigationRoutesFinished(directionsSessionRoutesCreateDirectionsSessionRoutes2);
                                                    jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel3)) {
                                                        LoggerProviderKt.logI('[' + r112 + "] Observer notification COMPLETED in " + (jElapsedRealtime2 - jElapsedRealtime) + "ms", "MapboxNavigation");
                                                    }
                                                    if (getcuttext instanceof getExpand) {
                                                        int i210 = serializer + 97;
                                                        write = i210 % Fields.SpotShadowColor;
                                                        int i211 = i210 % 2;
                                                        E$b e$b2 = mapboxNavigation.routeRefreshController;
                                                        e$b2.getClass();
                                                        I$b i$b2 = (I$b) e$b2.RemoteActionCompatParcelizer;
                                                        i$b2.pause();
                                                        i$b2.MediaSessionCompatQueueItem = list;
                                                        z5 = true;
                                                        i$b2.resume(true);
                                                    } else {
                                                        z5 = true;
                                                    }
                                                    List list11 = directionsSessionRoutesCreateDirectionsSessionRoutes2.ignoredRoutes;
                                                    iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list11, 10));
                                                    if (iRemoteActionCompatParcelizer < 16) {
                                                        iRemoteActionCompatParcelizer = 16;
                                                    }
                                                    linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                                                    it4 = list11.iterator();
                                                    while (it4.hasNext()) {
                                                        linkedHashMap.put(((IgnoredRoute) it4.next()).navigationRoute.id, new RoutesSetError("invalid alternative"));
                                                    }
                                                    ExpectedFactory.createValue(new RoutesSetSuccess(linkedHashMap)).getClass();
                                                    r31 = r31;
                                                    r37 = z5;
                                                    r8 = r8;
                                                    r9 = r9;
                                                    r112 = r112;
                                                    r17 = r17;
                                                    obj2 = obj2;
                                                } else {
                                                    r37 = 1;
                                                    r37 = 1;
                                                    if (getscrollbyoffset instanceof NativeSetRouteError) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    ?? sb13 = new StringBuilder();
                                                    sb13.append('[');
                                                    sb13.append(r112);
                                                    sb13.append("] Routes with IDs ");
                                                    List list12 = list;
                                                    arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list12, 10));
                                                    it3 = list12.iterator();
                                                    while (it3.hasNext()) {
                                                        int i212 = write + 61;
                                                        serializer = i212 % Fields.SpotShadowColor;
                                                        int i213 = i212 % 2;
                                                        arrayList3.add(((NavigationRoute) it3.next()).id);
                                                    }
                                                    sb13.append(arrayList3);
                                                    sb13.append(" will be ignored as they are not valid");
                                                    LoggerProviderKt.logE(sb13.toString(), null);
                                                    ExpectedFactory.createError(new RoutesSetError(((NativeSetRouteError) getscrollbyoffset).error)).getClass();
                                                    historyRecordingStateHandler2 = mapboxNavigation.historyRecordingStateHandler;
                                                    z4 = historyRecordingStateHandler2.savedHasRoutes;
                                                    r31 = r31;
                                                    r8 = r8;
                                                    r9 = r9;
                                                    r112 = r112;
                                                    r17 = r17;
                                                    obj2 = obj2;
                                                    if (historyRecordingStateHandler2.hasRoutes != z4) {
                                                        historyRecordingStateHandler2.hasRoutes = z4;
                                                        historyRecordingStateHandler2.updateStateAndNotifyObservers();
                                                        r31 = r31;
                                                        r8 = r8;
                                                        r9 = r9;
                                                        r112 = r112;
                                                        r17 = r17;
                                                        obj2 = obj2;
                                                    }
                                                }
                                                createfromparcel = createFromParcel.INSTANCE;
                                                if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2 != null) {
                                                    int i1116 = write + 59;
                                                    serializer = i1116 % Fields.SpotShadowColor;
                                                    int i1117 = i1116 % 2;
                                                    if (mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$r8$classId != 0) {
                                                        ((CancellableContinuationImpl) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                    } else {
                                                        ((SafeContinuation) mapboxNavigation$prepareNavigationForRoutesParsing$2$1$2.$continuation).resumeWith(createfromparcel);
                                                    }
                                                }
                                                loggingLevelLogLevel2 = LoggerProviderKt.logLevel();
                                                loggingLevel2 = LoggingLevel.INFO;
                                                if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel2, loggingLevel2)) {
                                                    LoggerProviderKt.logI('[' + r112 + "] Callback invoked successfully, releasing mutex", "MapboxNavigation");
                                                }
                                                r31.write(null);
                                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel2)) {
                                                    int i1118 = serializer + 111;
                                                    write = i1118 % Fields.SpotShadowColor;
                                                    int i1119 = i1118 % 2;
                                                    StringBuilder sbM10 = c8$$ExternalSyntheticOutline0.m(str2, (String) r112, str3);
                                                    sbM10.append(r8.getCoroutineContext().get(r17));
                                                    LoggerProviderKt.logI(sbM10.toString(), "MapboxNavigation");
                                                }
                                                return createfromparcel;
                                            } catch (CancellationException e7) {
                                                e = e7;
                                                z2 = true;
                                                r4 = obj;
                                                r26 = z2;
                                                r25 = r36;
                                                r24 = z6;
                                                r111 = strMapToReason;
                                                r110 = r37;
                                                str4 = str;
                                                r3 = r4;
                                                r22 = r26;
                                                r21 = r25;
                                                r20 = r24;
                                                r19 = r111;
                                                r18 = r110;
                                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                                    ?? sb14 = new StringBuilder();
                                                    sb14.append('[');
                                                    sb14.append(r19);
                                                    sb14.append("] Coroutine CANCELLED: ");
                                                    sb14.append(e);
                                                    sb14.append(r18);
                                                    sb14.append(r3.getCoroutineContext().get(r21));
                                                    sb14.append(str4);
                                                    if (r20 != 0) {
                                                        r23 = r22;
                                                    } else {
                                                        r23 = 0;
                                                    }
                                                    sb14.append(r23);
                                                    LoggerProviderKt.logE(sb14.toString(), "MapboxNavigation");
                                                }
                                                throw e;
                                            } catch (Exception e8) {
                                                e = e8;
                                                z = true;
                                                r5 = z;
                                                r13 = z6;
                                                r16 = strMapToReason;
                                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                                    ?? sb15 = new StringBuilder();
                                                    sb15.append('[');
                                                    sb15.append(r16);
                                                    sb15.append("] Coroutine threw exception: ");
                                                    sb15.append(e);
                                                    sb15.append(str);
                                                    if (r13 != 0) {
                                                        int i1120 = serializer + 63;
                                                        write = i1120 % Fields.SpotShadowColor;
                                                        int i1121 = i1120 % 2;
                                                        r14 = r5;
                                                    } else {
                                                        r14 = 0;
                                                    }
                                                    sb15.append(r14);
                                                    LoggerProviderKt.logE(sb15.toString(), "MapboxNavigation");
                                                }
                                                throw e;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            r12 = r36;
                                            r35 = "] Mutex released, coroutine completing/cancelled; Job: ";
                                            r36 = "[";
                                            r32 = obj;
                                            r15 = strMapToReason;
                                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                                StringBuilder sbM11 = c8$$ExternalSyntheticOutline0.m((String) r36, (String) r15, (String) r35);
                                                sbM11.append(r32.getCoroutineContext().get(r12));
                                                LoggerProviderKt.logI(sbM11.toString(), "MapboxNavigation");
                                            }
                                            throw th;
                                        }
                                    } catch (CancellationException e9) {
                                        e = e9;
                                        z2 = true;
                                        r4 = obj;
                                        r26 = z2;
                                        r25 = r36;
                                        r24 = z6;
                                        r111 = strMapToReason;
                                        r110 = r37;
                                        str4 = str;
                                        r3 = r4;
                                        r22 = r26;
                                        r21 = r25;
                                        r20 = r24;
                                        r19 = r111;
                                        r18 = r110;
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                            ?? sb16 = new StringBuilder();
                                            sb16.append('[');
                                            sb16.append(r19);
                                            sb16.append("] Coroutine CANCELLED: ");
                                            sb16.append(e);
                                            sb16.append(r18);
                                            sb16.append(r3.getCoroutineContext().get(r21));
                                            sb16.append(str4);
                                            if (r20 != 0) {
                                                r23 = r22;
                                            } else {
                                                r23 = 0;
                                            }
                                            sb16.append(r23);
                                            LoggerProviderKt.logE(sb16.toString(), "MapboxNavigation");
                                        }
                                        throw e;
                                    } catch (Exception e10) {
                                        e = e10;
                                        z = true;
                                        r5 = z;
                                        r13 = z6;
                                        r16 = strMapToReason;
                                        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                                            ?? sb17 = new StringBuilder();
                                            sb17.append('[');
                                            sb17.append(r16);
                                            sb17.append("] Coroutine threw exception: ");
                                            sb17.append(e);
                                            sb17.append(str);
                                            if (r13 != 0) {
                                                int i1122 = serializer + 63;
                                                write = i1122 % Fields.SpotShadowColor;
                                                int i1123 = i1122 % 2;
                                                r14 = r5;
                                            } else {
                                                r14 = 0;
                                            }
                                            sb17.append(r14);
                                            LoggerProviderKt.logE(sb17.toString(), "MapboxNavigation");
                                        }
                                        throw e;
                                    }
                                } catch (CancellationException e11) {
                                    e = e11;
                                    obj = getcontentviewgroupparentlayout2;
                                }
                            } catch (CancellationException e12) {
                                e = e12;
                                r21 = r36;
                                r18 = "; Job: ";
                                str4 = str;
                                r22 = 1;
                                r3 = getcontentviewgroupparentlayout2;
                                r20 = z6;
                                r19 = strMapToReason;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            obj = getcontentviewgroupparentlayout2;
                        } catch (Throwable th17) {
                            th = th17;
                            obj = getcontentviewgroupparentlayout2;
                        }
                    }
                } catch (Throwable th18) {
                    th = th18;
                }
            } catch (Throwable th19) {
                th = th19;
            }
        } catch (Throwable th20) {
            th = th20;
        }
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            ?? sb18 = new StringBuilder();
            sb18.append('[');
            sb18.append(r19);
            sb18.append("] Coroutine CANCELLED: ");
            sb18.append(e);
            sb18.append(r18);
            sb18.append(r3.getCoroutineContext().get(r21));
            sb18.append(str4);
            if (r20 != 0) {
                r23 = r22;
            } else {
                r23 = 0;
            }
            sb18.append(r23);
            LoggerProviderKt.logE(sb18.toString(), "MapboxNavigation");
        }
        throw e;
    }
}
