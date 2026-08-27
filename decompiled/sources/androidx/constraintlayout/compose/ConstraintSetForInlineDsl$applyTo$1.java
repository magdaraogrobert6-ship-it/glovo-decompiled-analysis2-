package androidx.constraintlayout.compose;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.NavArgsLazy;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.service.ChatService;
import com.google.firestore.v1.FirestoreGrpc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.callout.model.CalloutViewHolder;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineSourceKey;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$DataProviderContext;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.sentiance.core.model.events.H$b;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import o.ClipKt;
import o.DrawBackgroundModifier;
import o.DropShadowScope;
import o.GraphicsViewLayer;
import o.InnerShadowScope;
import o.InnerShadowScopeDefaultImpls;
import o.PainterElement;
import o.ShortNewsContentCardView;
import o.VectorPainterKtrememberVectorPainter211;
import o.accessgetInstancedelegatecp;
import o.accessgetMayRenderInSoftwarecp;
import o.accessroundToPxR2X_6ojd;
import o.accesstoPxR2X_6ojd;
import o.accesstoRectjd;
import o.accesstoSizeXkaWNTQjd;
import o.cancelPendingWebViewPause;
import o.component5;
import o.createFromParcel;
import o.drawBehind;
import o.getAlignment;
import o.getColorFilter;
import o.getCutText;
import o.getGlobalChangeEntries;
import o.getMinDebounceDeadline;
import o.getOnDraw;
import o.isPlacementApproachInProgress;
import o.migrateSealedSessionsMapToJsonlambda3;
import o.onCreate;
import o.onPanelClosed;
import o.onPictureInPictureModeChanged;
import o.onPreparePanel;
import o.onRequestPermissionsResult;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.roundToPx0680j_4;
import o.roundToPxR2X_6o;
import o.setDrawResultui;
import o.setGravity;
import o.setViewBackgroundColorFilter;
import o.toDpSizekrfVVM;
import o.toPxR2X_6o;
import o.toRect;
import o.toSizeXkaWNTQ;
import o.toSp0xMU5do;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintSetForInlineDsl$applyTo$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$applyTo$1(getCutText getcuttext, List list, String str) {
        super(0);
        this.serializer = 4;
        this.RemoteActionCompatParcelizer = getcuttext;
        this.read = list;
        this.write = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:197:0x0413 A[PHI: r24
  0x0413: PHI (r24v26 o.accesstoPxR2X_6ojd) = 
  (r24v12 o.accesstoPxR2X_6ojd)
  (r24v13 o.accesstoPxR2X_6ojd)
  (r24v14 o.accesstoPxR2X_6ojd)
  (r24v15 o.accesstoPxR2X_6ojd)
  (r24v16 o.accesstoPxR2X_6ojd)
  (r24v17 o.accesstoPxR2X_6ojd)
  (r24v18 o.accesstoPxR2X_6ojd)
  (r24v19 o.accesstoPxR2X_6ojd)
  (r24v20 o.accesstoPxR2X_6ojd)
  (r24v21 o.accesstoPxR2X_6ojd)
  (r24v22 o.accesstoPxR2X_6ojd)
  (r24v23 o.accesstoPxR2X_6ojd)
  (r24v24 o.accesstoPxR2X_6ojd)
  (r24v27 o.accesstoPxR2X_6ojd)
 binds: [B:194:0x040e, B:190:0x0401, B:186:0x03f4, B:182:0x03e7, B:178:0x03da, B:174:0x03cd, B:170:0x03c0, B:166:0x03b0, B:162:0x03a2, B:158:0x0392, B:154:0x0382, B:150:0x0374, B:146:0x0364, B:144:0x0358] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:235:0x0514  */
    /* JADX WARN: Code duplicated, block: B:237:0x0518  */
    /* JADX WARN: Code duplicated, block: B:241:0x052e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0532  */
    /* JADX WARN: Code duplicated, block: B:247:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x054c  */
    /* JADX WARN: Code duplicated, block: B:265:0x05da  */
    /* JADX WARN: Code duplicated, block: B:284:0x064e  */
    /* JADX WARN: Code duplicated, block: B:295:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:322:0x0726  */
    /* JADX WARN: Code duplicated, block: B:341:0x0784  */
    /* JADX WARN: Code duplicated, block: B:358:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:402:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:446:0x0944  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:526:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:63:0x0232  */
    /* JADX WARN: Code duplicated, block: B:653:0x0d20  */
    /* JADX WARN: Code duplicated, block: B:726:0x0eab  */
    /* JADX WARN: Code duplicated, block: B:833:0x114a  */
    /* JADX WARN: Code duplicated, block: B:858:0x119a  */
    /* JADX WARN: Code duplicated, block: B:866:0x11bf  */
    /* JADX WARN: Code duplicated, block: B:910:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o.drawBehind] */
    /* JADX WARN: Type inference failed for: r7v191 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws CLParsingException, InterruptedException, IOException {
        ?? r13;
        accesstoPxR2X_6ojd accesstopxr2x_6ojd;
        Iterator it;
        byte b;
        accesstoPxR2X_6ojd accesstopxr2x_6ojd2;
        String strWrite;
        accesstoPxR2X_6ojd accesstopxr2x_6ojd3;
        String strWrite2;
        String str;
        String strIconCompatParcelizer;
        ?? r7;
        float fMediaMetadataCompat;
        float fIconCompatParcelizer;
        float fIconCompatParcelizer2;
        float fIconCompatParcelizer3;
        String strWrite3;
        int iMediaMetadataCompat;
        PainterElement painterElement;
        byte b2;
        Iterator it2;
        String str2;
        float fRemoteActionCompatParcelizer;
        float f;
        float f2;
        float fIconCompatParcelizer4;
        float f3;
        float fIconCompatParcelizer5;
        float f4;
        String strWrite4;
        byte b3;
        byte b4;
        byte b5;
        String str3;
        String strWrite5;
        String strWrite6;
        String strWrite7;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        byte b6;
        String strWrite8;
        String strWrite9;
        String strWrite10;
        float fMediaMetadataCompat2;
        float fIconCompatParcelizer6;
        float fIconCompatParcelizer7;
        float fIconCompatParcelizer8;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd;
        String str4;
        float fRemoteActionCompatParcelizer2;
        float fIconCompatParcelizer9;
        float fIconCompatParcelizer10;
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.read;
        int i2 = 8;
        ShortNewsContentCardView shortNewsContentCardView = null;
        char c = 2;
        int i3 = 0;
        ?? r10 = 0;
        boolean z = true;
        switch (i) {
            case 0:
                List list = (List) obj3;
                DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) obj2;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object parentData = ((Measurable) list.get(i4)).getParentData();
                    getOnDraw getondraw = parentData instanceof getOnDraw ? (getOnDraw) parentData : null;
                    if (getondraw != null) {
                        ClipKt clipKt = getondraw.IconCompatParcelizer;
                        getondraw.serializer.invoke(new setDrawResultui(clipKt.IconCompatParcelizer, drawBackgroundModifier.MediaSessionCompatQueueItem.IconCompatParcelizer(clipKt)));
                    }
                    drawBackgroundModifier.serializer.add(getondraw);
                }
                ?? r3 = (drawBehind) obj;
                accesstoPxR2X_6ojd accesstopxr2x_6ojd4 = drawBackgroundModifier.MediaSessionCompatQueueItem.read;
                NavArgsLazy navArgsLazy = new NavArgsLazy(20, (boolean) (r10 == true ? 1 : 0));
                navArgsLazy.MediaSessionCompatQueueItem = new HashMap();
                navArgsLazy.read = new HashMap();
                navArgsLazy.RatingCompat = new HashMap();
                Iterator it3 = accesstopxr2x_6ojd4.serializer().iterator();
                while (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    DropShadowScope dropShadowScope = accesstopxr2x_6ojd4.read(str5);
                    str5.getClass();
                    int iHashCode = str5.hashCode();
                    if (iHashCode != -1824489883) {
                        if (iHashCode != 1875016085) {
                            if (iHashCode == 1921490263 && str5.equals("Variables")) {
                                r13 = c;
                            } else {
                                r13 = -1;
                            }
                        } else if (str5.equals("Generate")) {
                            r13 = z;
                        } else {
                            r13 = -1;
                        }
                    } else if (str5.equals("Helpers")) {
                        r13 = i3;
                    } else {
                        r13 = -1;
                    }
                    if (r13 == 0) {
                        accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                        it = it3;
                        if (dropShadowScope instanceof accessroundToPxR2X_6ojd) {
                            accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd2 = (accessroundToPxR2X_6ojd) dropShadowScope;
                            for (int i5 = 0; i5 < accessroundtopxr2x_6ojd2.RemoteActionCompatParcelizer.size(); i5++) {
                                DropShadowScope dropShadowScope2 = accessroundtopxr2x_6ojd2.read(i5);
                                if (dropShadowScope2 instanceof accessroundToPxR2X_6ojd) {
                                    accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd3 = (accessroundToPxR2X_6ojd) dropShadowScope2;
                                    if (accessroundtopxr2x_6ojd3.RemoteActionCompatParcelizer.size() > 1) {
                                        switch (accessroundtopxr2x_6ojd3.write(0)) {
                                            case "vGuideline":
                                                b = 0;
                                                break;
                                            case "hChain":
                                                b = 1;
                                                break;
                                            case "vChain":
                                                b = 2;
                                                break;
                                            case "hGuideline":
                                                b = 3;
                                                break;
                                            default:
                                                b = -1;
                                                break;
                                        }
                                        if (b == 0) {
                                            DropShadowScope dropShadowScope3 = accessroundtopxr2x_6ojd3.read(1);
                                            if ((dropShadowScope3 instanceof accesstoPxR2X_6ojd) && (strWrite = (accesstopxr2x_6ojd2 = (accesstoPxR2X_6ojd) dropShadowScope3).write("id")) != null) {
                                                migrateSealedSessionsMapToJsonlambda3.IconCompatParcelizer(1, (drawBehind) r3, strWrite, accesstopxr2x_6ojd2);
                                            }
                                        } else if (b == 1) {
                                            migrateSealedSessionsMapToJsonlambda3.write(0, r3, navArgsLazy, accessroundtopxr2x_6ojd3);
                                        } else if (b == 2) {
                                            migrateSealedSessionsMapToJsonlambda3.write(1, r3, navArgsLazy, accessroundtopxr2x_6ojd3);
                                        } else if (b == 3) {
                                            DropShadowScope dropShadowScope4 = accessroundtopxr2x_6ojd3.read(1);
                                            if ((dropShadowScope4 instanceof accesstoPxR2X_6ojd) && (strWrite2 = (accesstopxr2x_6ojd3 = (accesstoPxR2X_6ojd) dropShadowScope4).write("id")) != null) {
                                                migrateSealedSessionsMapToJsonlambda3.IconCompatParcelizer(0, (drawBehind) r3, strWrite2, accesstopxr2x_6ojd3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (r13 == z) {
                        accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                        it = it3;
                        if (dropShadowScope instanceof accesstoPxR2X_6ojd) {
                            accesstoPxR2X_6ojd accesstopxr2x_6ojd5 = (accesstoPxR2X_6ojd) dropShadowScope;
                            for (String str6 : accesstopxr2x_6ojd5.serializer()) {
                                DropShadowScope dropShadowScope5 = accesstopxr2x_6ojd5.read(str6);
                                HashMap map = (HashMap) navArgsLazy.RatingCompat;
                                ArrayList arrayList = map.containsKey(str6) ? (ArrayList) map.get(str6) : null;
                                if (arrayList != null && (dropShadowScope5 instanceof accesstoPxR2X_6ojd)) {
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(r3, navArgsLazy, (String) it4.next(), (accesstoPxR2X_6ojd) dropShadowScope5);
                                    }
                                }
                            }
                        }
                    } else if (r13 == c) {
                        accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                        it = it3;
                        if (dropShadowScope instanceof accesstoPxR2X_6ojd) {
                            accesstoPxR2X_6ojd accesstopxr2x_6ojd6 = (accesstoPxR2X_6ojd) dropShadowScope;
                            for (String str7 : accesstopxr2x_6ojd6.serializer()) {
                                DropShadowScope dropShadowScope6 = accesstopxr2x_6ojd6.read(str7);
                                if (dropShadowScope6 instanceof accesstoRectjd) {
                                    ((HashMap) navArgsLazy.MediaSessionCompatQueueItem).put(str7, Integer.valueOf(dropShadowScope6.MediaMetadataCompat()));
                                } else if (dropShadowScope6 instanceof accesstoPxR2X_6ojd) {
                                    accesstoPxR2X_6ojd accesstopxr2x_6ojd7 = (accesstoPxR2X_6ojd) dropShadowScope6;
                                    if (accesstopxr2x_6ojd7.RatingCompat(RemoteMessageConst.FROM) && accesstopxr2x_6ojd7.RatingCompat(RemoteMessageConst.TO)) {
                                        float fIconCompatParcelizer11 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd7.read(RemoteMessageConst.FROM));
                                        float fIconCompatParcelizer12 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd7.read(RemoteMessageConst.TO));
                                        String strWrite11 = accesstopxr2x_6ojd7.write("prefix");
                                        String strWrite12 = accesstopxr2x_6ojd7.write("postfix");
                                        HashMap map2 = (HashMap) navArgsLazy.read;
                                        if (map2.containsKey(str7)) {
                                            map2.get(str7);
                                        }
                                        roundToPx0680j_4 roundtopx0680j_4 = new roundToPx0680j_4();
                                        roundtopx0680j_4.serializer = false;
                                        roundtopx0680j_4.IconCompatParcelizer = 0.0f;
                                        if (strWrite11 == null) {
                                            strWrite11 = "";
                                        }
                                        roundtopx0680j_4.read = strWrite11;
                                        if (strWrite12 == null) {
                                            strWrite12 = "";
                                        }
                                        roundtopx0680j_4.write = strWrite12;
                                        roundtopx0680j_4.RemoteActionCompatParcelizer = fIconCompatParcelizer12;
                                        map2.put(str7, roundtopx0680j_4);
                                        HashMap map3 = (HashMap) navArgsLazy.RatingCompat;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i6 = (int) fIconCompatParcelizer11;
                                        int i7 = (int) fIconCompatParcelizer12;
                                        int i8 = i6;
                                        while (i6 <= i7) {
                                            arrayList2.add(roundtopx0680j_4.read + i8 + roundtopx0680j_4.write);
                                            i8++;
                                            i6++;
                                        }
                                        map3.put(str7, arrayList2);
                                    } else if (accesstopxr2x_6ojd7.RatingCompat(RemoteMessageConst.FROM) && accesstopxr2x_6ojd7.RatingCompat("step")) {
                                        float fIconCompatParcelizer13 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd7.read(RemoteMessageConst.FROM));
                                        float fIconCompatParcelizer14 = navArgsLazy.IconCompatParcelizer(accesstopxr2x_6ojd7.read("step"));
                                        HashMap map4 = (HashMap) navArgsLazy.read;
                                        if (map4.containsKey(str7)) {
                                            map4.get(str7);
                                        }
                                        roundToPxR2X_6o roundtopxr2x_6o = new roundToPxR2X_6o();
                                        roundtopxr2x_6o.serializer = fIconCompatParcelizer14;
                                        roundtopxr2x_6o.read = fIconCompatParcelizer13;
                                        map4.put(str7, roundtopxr2x_6o);
                                    } else if (accesstopxr2x_6ojd7.RatingCompat("ids")) {
                                        DropShadowScope dropShadowScope7 = accesstopxr2x_6ojd7.read("ids");
                                        if (!(dropShadowScope7 instanceof accessroundToPxR2X_6ojd)) {
                                            throw new CLParsingException("no array found for key <ids>, found [" + dropShadowScope7.RatingCompat() + "] : " + dropShadowScope7, accesstopxr2x_6ojd7);
                                        }
                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd4 = (accessroundToPxR2X_6ojd) dropShadowScope7;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i9 = 0; i9 < accessroundtopxr2x_6ojd4.RemoteActionCompatParcelizer.size(); i9++) {
                                            arrayList3.add(accessroundtopxr2x_6ojd4.write(i9));
                                        }
                                        ((HashMap) navArgsLazy.RatingCompat).put(str7, arrayList3);
                                    } else if (accesstopxr2x_6ojd7.RatingCompat(RemoteMessageConst.Notification.TAG)) {
                                        String strIconCompatParcelizer2 = accesstopxr2x_6ojd7.IconCompatParcelizer(RemoteMessageConst.Notification.TAG);
                                        HashMap map5 = r3.ParcelableVolumeInfo;
                                        ((HashMap) navArgsLazy.RatingCompat).put(str7, map5.containsKey(strIconCompatParcelizer2) ? (ArrayList) map5.get(strIconCompatParcelizer2) : null);
                                    }
                                }
                            }
                        }
                    } else if (dropShadowScope instanceof accesstoPxR2X_6ojd) {
                        accesstoPxR2X_6ojd accesstopxr2x_6ojd8 = (accesstoPxR2X_6ojd) dropShadowScope;
                        Iterator it5 = accesstopxr2x_6ojd8.serializer().iterator();
                        while (true) {
                            str = "type";
                            if (!it5.hasNext()) {
                                strIconCompatParcelizer = null;
                            } else if (((String) it5.next()).equals("type")) {
                                strIconCompatParcelizer = accesstopxr2x_6ojd8.IconCompatParcelizer("type");
                            }
                        }
                        if (strIconCompatParcelizer != null) {
                            switch (strIconCompatParcelizer) {
                                case "vGuideline":
                                    r7 = i3;
                                    break;
                                case "column":
                                    r7 = z;
                                    break;
                                case "hChain":
                                    r7 = c;
                                    break;
                                case "vChain":
                                    r7 = 3;
                                    break;
                                case "barrier":
                                    r7 = 4;
                                    break;
                                case "row":
                                    r7 = 5;
                                    break;
                                case "grid":
                                    r7 = 6;
                                    break;
                                case "hFlow":
                                    r7 = 7;
                                    break;
                                case "vFlow":
                                    r7 = 8;
                                    break;
                                case "hGuideline":
                                    r7 = 9;
                                    break;
                                default:
                                    r7 = -1;
                                    break;
                            }
                            String str8 = "end";
                            switch (r7) {
                                case 0:
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    migrateSealedSessionsMapToJsonlambda3.IconCompatParcelizer(1, (drawBehind) r3, str5, accesstopxr2x_6ojd8);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = r3.write(str5);
                                    InnerShadowScope innerShadowScope = accesstosizexkawntqjdWrite.ComponentActivity;
                                    if (innerShadowScope == null || !(innerShadowScope instanceof InnerShadowScopeDefaultImpls)) {
                                        toRect torect = toRect.GRID;
                                        if (strIconCompatParcelizer.charAt(0) == 'r') {
                                            torect = toRect.ROW;
                                        } else if (strIconCompatParcelizer.charAt(0) == 'c') {
                                            torect = toRect.COLUMN;
                                        }
                                        InnerShadowScopeDefaultImpls innerShadowScopeDefaultImpls = new InnerShadowScopeDefaultImpls(r3, torect);
                                        accesstosizexkawntqjdWrite.ComponentActivity = innerShadowScopeDefaultImpls;
                                        accesstosizexkawntqjdWrite.read(innerShadowScopeDefaultImpls.write());
                                    }
                                    InnerShadowScopeDefaultImpls innerShadowScopeDefaultImpls2 = (InnerShadowScopeDefaultImpls) accesstosizexkawntqjdWrite.ComponentActivity;
                                    for (String str9 : accesstopxr2x_6ojd8.serializer()) {
                                        str9.getClass();
                                        switch (str9) {
                                            case "orientation":
                                                innerShadowScopeDefaultImpls2.onActivityResult = accesstopxr2x_6ojd8.read(str9).MediaMetadataCompat();
                                                break;
                                            case "padding":
                                                DropShadowScope dropShadowScope8 = accesstopxr2x_6ojd8.read(str9);
                                                if (dropShadowScope8 instanceof accessroundToPxR2X_6ojd) {
                                                    accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd5 = (accessroundToPxR2X_6ojd) dropShadowScope8;
                                                    if (accessroundtopxr2x_6ojd5.RemoteActionCompatParcelizer.size() > 1) {
                                                        fMediaMetadataCompat = accessroundtopxr2x_6ojd5.IconCompatParcelizer(0);
                                                        fIconCompatParcelizer3 = accessroundtopxr2x_6ojd5.IconCompatParcelizer(1);
                                                        if (accessroundtopxr2x_6ojd5.RemoteActionCompatParcelizer.size() > 2) {
                                                            fIconCompatParcelizer2 = accessroundtopxr2x_6ojd5.IconCompatParcelizer(2);
                                                            try {
                                                                fIconCompatParcelizer = ((accessroundToPxR2X_6ojd) dropShadowScope8).IconCompatParcelizer(3);
                                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                                fIconCompatParcelizer = 0.0f;
                                                            }
                                                        } else {
                                                            fIconCompatParcelizer2 = fMediaMetadataCompat;
                                                            fIconCompatParcelizer = fIconCompatParcelizer3;
                                                        }
                                                    } else {
                                                        fMediaMetadataCompat = dropShadowScope8.MediaMetadataCompat();
                                                        fIconCompatParcelizer = fMediaMetadataCompat;
                                                        fIconCompatParcelizer2 = fIconCompatParcelizer;
                                                        fIconCompatParcelizer3 = fIconCompatParcelizer2;
                                                    }
                                                } else {
                                                    fMediaMetadataCompat = dropShadowScope8.MediaMetadataCompat();
                                                    fIconCompatParcelizer = fMediaMetadataCompat;
                                                    fIconCompatParcelizer2 = fIconCompatParcelizer;
                                                    fIconCompatParcelizer3 = fIconCompatParcelizer2;
                                                }
                                                innerShadowScopeDefaultImpls2.invalidateMenu = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fMediaMetadataCompat));
                                                innerShadowScopeDefaultImpls2.onConfigurationChanged = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer3));
                                                innerShadowScopeDefaultImpls2.onBackPressed = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer2));
                                                innerShadowScopeDefaultImpls2.initializeViewTreeOwners = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer));
                                                break;
                                            case "contains":
                                                DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd8.RemoteActionCompatParcelizer(str9);
                                                accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd6 = dropShadowScopeRemoteActionCompatParcelizer instanceof accessroundToPxR2X_6ojd ? (accessroundToPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer : null;
                                                if (accessroundtopxr2x_6ojd6 == null) {
                                                    break;
                                                } else {
                                                    for (int i10 = 0; i10 < accessroundtopxr2x_6ojd6.RemoteActionCompatParcelizer.size(); i10++) {
                                                        innerShadowScopeDefaultImpls2.IconCompatParcelizer(r3.write(accessroundtopxr2x_6ojd6.read(i10).write()));
                                                    }
                                                    break;
                                                }
                                                break;
                                            case "hGap":
                                                innerShadowScopeDefaultImpls2.getOnBackPressedDispatcher = r3.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd8.read(str9).IconCompatParcelizer());
                                                break;
                                            case "rows":
                                                int iMediaMetadataCompat2 = accesstopxr2x_6ojd8.read(str9).MediaMetadataCompat();
                                                if (iMediaMetadataCompat2 > 0 && innerShadowScopeDefaultImpls2.getFullyDrawnReporter != toRect.COLUMN) {
                                                    innerShadowScopeDefaultImpls2.onMenuItemSelected = iMediaMetadataCompat2;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case "vGap":
                                                innerShadowScopeDefaultImpls2.onNewIntent = r3.IconCompatParcelizer.IconCompatParcelizer(accesstopxr2x_6ojd8.read(str9).IconCompatParcelizer());
                                                break;
                                            case "flags":
                                                try {
                                                    DropShadowScope dropShadowScope9 = accesstopxr2x_6ojd8.read(str9);
                                                    if (dropShadowScope9 instanceof accesstoRectjd) {
                                                        iMediaMetadataCompat = dropShadowScope9.MediaMetadataCompat();
                                                        strWrite3 = "";
                                                    } else {
                                                        strWrite3 = dropShadowScope9.write();
                                                        iMediaMetadataCompat = 0;
                                                    }
                                                } catch (Exception e) {
                                                    System.err.println("Error parsing grid flags " + e);
                                                    strWrite3 = "";
                                                }
                                                if (!strWrite3.isEmpty()) {
                                                    innerShadowScopeDefaultImpls2.getClass();
                                                    if (!strWrite3.isEmpty()) {
                                                        String[] strArrSplit = strWrite3.split("\\|");
                                                        innerShadowScopeDefaultImpls2.getViewModelStore = 0;
                                                        for (String str10 : strArrSplit) {
                                                            String lowerCase = str10.toLowerCase();
                                                            lowerCase.getClass();
                                                            if (lowerCase.equals("subgridbycolrow")) {
                                                                innerShadowScopeDefaultImpls2.getViewModelStore |= 1;
                                                            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                                                                innerShadowScopeDefaultImpls2.getViewModelStore |= 2;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    innerShadowScopeDefaultImpls2.getViewModelStore = iMediaMetadataCompat;
                                                    break;
                                                }
                                                break;
                                            case "skips":
                                                String strWrite13 = accesstopxr2x_6ojd8.read(str9).write();
                                                if (!strWrite13.contains(":")) {
                                                    break;
                                                } else {
                                                    innerShadowScopeDefaultImpls2.onCreatePanelMenu = strWrite13;
                                                    break;
                                                }
                                                break;
                                            case "spans":
                                                String strWrite14 = accesstopxr2x_6ojd8.read(str9).write();
                                                if (!strWrite14.contains(":")) {
                                                    break;
                                                } else {
                                                    innerShadowScopeDefaultImpls2.onMultiWindowModeChanged = strWrite14;
                                                    break;
                                                }
                                                break;
                                            case "rowWeights":
                                                String strWrite15 = accesstopxr2x_6ojd8.read(str9).write();
                                                if (!strWrite15.contains(",")) {
                                                    break;
                                                } else {
                                                    innerShadowScopeDefaultImpls2.onCreate = strWrite15;
                                                    break;
                                                }
                                                break;
                                            case "columns":
                                                int iMediaMetadataCompat3 = accesstopxr2x_6ojd8.read(str9).MediaMetadataCompat();
                                                if (iMediaMetadataCompat3 > 0 && innerShadowScopeDefaultImpls2.getFullyDrawnReporter != toRect.ROW) {
                                                    innerShadowScopeDefaultImpls2.getSavedStateRegistry = iMediaMetadataCompat3;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case "columnWeights":
                                                String strWrite16 = accesstopxr2x_6ojd8.read(str9).write();
                                                if (!strWrite16.contains(",")) {
                                                    break;
                                                } else {
                                                    innerShadowScopeDefaultImpls2.getLifecycle = strWrite16;
                                                    break;
                                                }
                                                break;
                                            default:
                                                migrateSealedSessionsMapToJsonlambda3.read(r3, accesstopxr2x_6ojd8, r3.write(str5), navArgsLazy, str9);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    if (strIconCompatParcelizer.charAt(i3) == 'h') {
                                        r3.getClass();
                                        painterElement = (getColorFilter) r3.serializer(toRect.HORIZONTAL_CHAIN);
                                    } else {
                                        r3.getClass();
                                        painterElement = (getAlignment) r3.serializer(toRect.VERTICAL_CHAIN);
                                    }
                                    painterElement.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = str5;
                                    Iterator it6 = accesstopxr2x_6ojd8.serializer().iterator();
                                    while (it6.hasNext()) {
                                        String str11 = (String) it6.next();
                                        str11.getClass();
                                        switch (str11.hashCode()) {
                                            case -1383228885:
                                                if (str11.equals("bottom")) {
                                                    b2 = 0;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case -567445985:
                                                if (str11.equals("contains")) {
                                                    b2 = 1;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 100571:
                                                if (str11.equals(str8)) {
                                                    b2 = 2;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 115029:
                                                if (str11.equals("top")) {
                                                    b2 = 3;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 3317767:
                                                if (str11.equals("left")) {
                                                    b2 = 4;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 108511772:
                                                if (str11.equals("right")) {
                                                    b2 = 5;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 109757538:
                                                if (str11.equals("start")) {
                                                    b2 = 6;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            case 109780401:
                                                if (str11.equals("style")) {
                                                    b2 = 7;
                                                } else {
                                                    b2 = -1;
                                                }
                                                break;
                                            default:
                                                b2 = -1;
                                                break;
                                        }
                                        switch (b2) {
                                            case 0:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                it2 = it6;
                                                str2 = str8;
                                                migrateSealedSessionsMapToJsonlambda3.IconCompatParcelizer(r3, accesstopxr2x_6ojd8, painterElement, navArgsLazy, str11);
                                                it6 = it2;
                                                str8 = str2;
                                                break;
                                            case 1:
                                                DropShadowScope dropShadowScope10 = accesstopxr2x_6ojd8.read(str11);
                                                if (dropShadowScope10 instanceof accessroundToPxR2X_6ojd) {
                                                    accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd7 = (accessroundToPxR2X_6ojd) dropShadowScope10;
                                                    if (accessroundtopxr2x_6ojd7.RemoteActionCompatParcelizer.size() >= 1) {
                                                        int i11 = 0;
                                                        while (i11 < accessroundtopxr2x_6ojd7.RemoteActionCompatParcelizer.size()) {
                                                            DropShadowScope dropShadowScope11 = accessroundtopxr2x_6ojd7.read(i11);
                                                            if (dropShadowScope11 instanceof accessroundToPxR2X_6ojd) {
                                                                accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd8 = (accessroundToPxR2X_6ojd) dropShadowScope11;
                                                                if (accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer.size() > 0) {
                                                                    String strWrite17 = accessroundtopxr2x_6ojd8.read(0).write();
                                                                    int size2 = accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer.size();
                                                                    if (size2 != 2) {
                                                                        if (size2 == 3) {
                                                                            float fRemoteActionCompatParcelizer3 = accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(1);
                                                                            fIconCompatParcelizer5 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(2));
                                                                            fRemoteActionCompatParcelizer = fRemoteActionCompatParcelizer3;
                                                                            f4 = fIconCompatParcelizer5;
                                                                        } else if (size2 == 4) {
                                                                            float fRemoteActionCompatParcelizer4 = accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(1);
                                                                            float fIconCompatParcelizer15 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(2));
                                                                            fIconCompatParcelizer5 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(3));
                                                                            fRemoteActionCompatParcelizer = fRemoteActionCompatParcelizer4;
                                                                            f4 = fIconCompatParcelizer15;
                                                                        } else if (size2 != 6) {
                                                                            it6 = it6;
                                                                            f = Float.NaN;
                                                                            f2 = Float.NaN;
                                                                            fIconCompatParcelizer4 = Float.NaN;
                                                                            f3 = Float.NaN;
                                                                            fRemoteActionCompatParcelizer = Float.NaN;
                                                                        } else {
                                                                            fRemoteActionCompatParcelizer = accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(1);
                                                                            float fIconCompatParcelizer16 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(2));
                                                                            it6 = it6;
                                                                            float fIconCompatParcelizer17 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(3));
                                                                            float fIconCompatParcelizer18 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(4));
                                                                            f3 = fIconCompatParcelizer16;
                                                                            fIconCompatParcelizer4 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(5));
                                                                            f2 = fIconCompatParcelizer18;
                                                                            f = fIconCompatParcelizer17;
                                                                        }
                                                                        f = fIconCompatParcelizer5;
                                                                        f3 = f4;
                                                                        f2 = Float.NaN;
                                                                        fIconCompatParcelizer4 = Float.NaN;
                                                                    } else {
                                                                        it6 = it6;
                                                                        fRemoteActionCompatParcelizer = accessroundtopxr2x_6ojd8.RemoteActionCompatParcelizer(1);
                                                                        f = Float.NaN;
                                                                        f2 = Float.NaN;
                                                                        fIconCompatParcelizer4 = Float.NaN;
                                                                        f3 = Float.NaN;
                                                                    }
                                                                    painterElement.IconCompatParcelizer(strWrite17);
                                                                    String string = strWrite17.toString();
                                                                    if (!Float.isNaN(fRemoteActionCompatParcelizer)) {
                                                                        painterElement.invalidateMenu.put(string, Float.valueOf(fRemoteActionCompatParcelizer));
                                                                    }
                                                                    if (!Float.isNaN(f3)) {
                                                                        painterElement.getOnBackPressedDispatcher.put(string, Float.valueOf(f3));
                                                                    }
                                                                    if (!Float.isNaN(f)) {
                                                                        painterElement.getNavigationEventDispatcher.put(string, Float.valueOf(f));
                                                                    }
                                                                    if (!Float.isNaN(f2)) {
                                                                        if (painterElement.getSavedStateRegistry == null) {
                                                                            painterElement.getSavedStateRegistry = new HashMap();
                                                                        }
                                                                        painterElement.getSavedStateRegistry.put(string, Float.valueOf(f2));
                                                                    }
                                                                    if (!Float.isNaN(fIconCompatParcelizer4)) {
                                                                        if (painterElement.getLifecycle == null) {
                                                                            painterElement.getLifecycle = new HashMap();
                                                                        }
                                                                        painterElement.getLifecycle.put(string, Float.valueOf(fIconCompatParcelizer4));
                                                                    }
                                                                } else {
                                                                    it6 = it6;
                                                                    accessroundtopxr2x_6ojd7 = accessroundtopxr2x_6ojd7;
                                                                    str8 = str8;
                                                                }
                                                            } else {
                                                                it6 = it6;
                                                                accessroundtopxr2x_6ojd7 = accessroundtopxr2x_6ojd7;
                                                                str8 = str8;
                                                                painterElement.IconCompatParcelizer(dropShadowScope11.write());
                                                            }
                                                            i11++;
                                                            it6 = it6;
                                                            accessroundtopxr2x_6ojd7 = accessroundtopxr2x_6ojd7;
                                                            str8 = str8;
                                                        }
                                                        it2 = it6;
                                                        str2 = str8;
                                                        it6 = it2;
                                                        str8 = str2;
                                                        break;
                                                    }
                                                }
                                                PrintStream printStream = System.err;
                                                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str5, " contains should be an array \"");
                                                sbM.append(dropShadowScope10.write());
                                                sbM.append("\"");
                                                printStream.println(sbM.toString());
                                                break;
                                            case 7:
                                                DropShadowScope dropShadowScope12 = accesstopxr2x_6ojd8.read(str11);
                                                if (dropShadowScope12 instanceof accessroundToPxR2X_6ojd) {
                                                    accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd9 = (accessroundToPxR2X_6ojd) dropShadowScope12;
                                                    if (accessroundtopxr2x_6ojd9.RemoteActionCompatParcelizer.size() > 1) {
                                                        strWrite4 = accessroundtopxr2x_6ojd9.write(0);
                                                        painterElement.getViewModelStore = accessroundtopxr2x_6ojd9.RemoteActionCompatParcelizer(1);
                                                    } else {
                                                        strWrite4 = dropShadowScope12.write();
                                                    }
                                                } else {
                                                    strWrite4 = dropShadowScope12.write();
                                                }
                                                if (strWrite4.equals("packed")) {
                                                    painterElement.onConfigurationChanged = toDpSizekrfVVM.PACKED;
                                                } else if (strWrite4.equals("spread_inside")) {
                                                    painterElement.onConfigurationChanged = toDpSizekrfVVM.SPREAD_INSIDE;
                                                } else {
                                                    painterElement.onConfigurationChanged = toDpSizekrfVVM.SPREAD;
                                                }
                                                it2 = it6;
                                                str2 = str8;
                                                it6 = it2;
                                                str8 = str2;
                                                break;
                                            default:
                                                it2 = it6;
                                                str2 = str8;
                                                it6 = it2;
                                                str8 = str2;
                                                break;
                                        }
                                    }
                                    break;
                                case 4:
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    boolean z2 = r3.MediaBrowserCompatMediaItem;
                                    toPxR2X_6o topxr2x_6o = toPxR2X_6o.END;
                                    accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite2 = r3.write(str5);
                                    InnerShadowScope innerShadowScope2 = accesstosizexkawntqjdWrite2.ComponentActivity;
                                    if (innerShadowScope2 == null || !(innerShadowScope2 instanceof toSp0xMU5do)) {
                                        toSp0xMU5do tosp0xmu5do = new toSp0xMU5do(r3);
                                        tosp0xmu5do.getLifecycle = topxr2x_6o;
                                        accesstosizexkawntqjdWrite2.ComponentActivity = tosp0xmu5do;
                                        accesstosizexkawntqjdWrite2.read(tosp0xmu5do.write());
                                    }
                                    toSp0xMU5do tosp0xmu5do2 = (toSp0xMU5do) accesstosizexkawntqjdWrite2.ComponentActivity;
                                    for (String str12 : accesstopxr2x_6ojd8.serializer()) {
                                        str12.getClass();
                                        int iHashCode2 = str12.hashCode();
                                        if (iHashCode2 != -1081309778) {
                                            if (iHashCode2 != -962590849) {
                                                if (iHashCode2 == -567445985 && str12.equals("contains")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                            } else if (str12.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                        } else if (str12.equals("margin")) {
                                            b3 = 0;
                                        } else {
                                            b3 = -1;
                                        }
                                        if (b3 == 0) {
                                            DropShadowScope dropShadowScopeRemoteActionCompatParcelizer2 = accesstopxr2x_6ojd8.RemoteActionCompatParcelizer(str12);
                                            float fIconCompatParcelizer19 = dropShadowScopeRemoteActionCompatParcelizer2 instanceof accesstoRectjd ? dropShadowScopeRemoteActionCompatParcelizer2.IconCompatParcelizer() : Float.NaN;
                                            if (!Float.isNaN(fIconCompatParcelizer19)) {
                                                tosp0xmu5do2.IconCompatParcelizer(Float.valueOf(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer19)));
                                            }
                                        } else if (b3 == 1) {
                                            switch (accesstopxr2x_6ojd8.IconCompatParcelizer(str12)) {
                                                case "bottom":
                                                    b4 = 0;
                                                    break;
                                                case "end":
                                                    b4 = 1;
                                                    break;
                                                case "top":
                                                    b4 = 2;
                                                    break;
                                                case "left":
                                                    b4 = 3;
                                                    break;
                                                case "right":
                                                    b4 = 4;
                                                    break;
                                                case "start":
                                                    b4 = 5;
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            if (b4 == 0) {
                                                tosp0xmu5do2.getLifecycle = toPxR2X_6o.BOTTOM;
                                            } else if (b4 != 1) {
                                                if (b4 == 2) {
                                                    tosp0xmu5do2.getLifecycle = toPxR2X_6o.TOP;
                                                } else if (b4 == 3) {
                                                    tosp0xmu5do2.getLifecycle = toPxR2X_6o.LEFT;
                                                } else if (b4 == 4) {
                                                    tosp0xmu5do2.getLifecycle = toPxR2X_6o.RIGHT;
                                                } else if (b4 == 5) {
                                                    if (z2) {
                                                        tosp0xmu5do2.getLifecycle = toPxR2X_6o.LEFT;
                                                    } else {
                                                        tosp0xmu5do2.getLifecycle = toPxR2X_6o.RIGHT;
                                                    }
                                                }
                                            } else if (z2) {
                                                tosp0xmu5do2.getLifecycle = toPxR2X_6o.RIGHT;
                                            } else {
                                                tosp0xmu5do2.getLifecycle = toPxR2X_6o.LEFT;
                                            }
                                        } else if (b3 == 2) {
                                            DropShadowScope dropShadowScopeRemoteActionCompatParcelizer3 = accesstopxr2x_6ojd8.RemoteActionCompatParcelizer(str12);
                                            accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd10 = dropShadowScopeRemoteActionCompatParcelizer3 instanceof accessroundToPxR2X_6ojd ? (accessroundToPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer3 : null;
                                            if (accessroundtopxr2x_6ojd10 != null) {
                                                for (int i12 = 0; i12 < accessroundtopxr2x_6ojd10.RemoteActionCompatParcelizer.size(); i12++) {
                                                    tosp0xmu5do2.IconCompatParcelizer(r3.write(accessroundtopxr2x_6ojd10.read(i12).write()));
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 7:
                                case 8:
                                    Float fValueOf7 = Float.valueOf(0.5f);
                                    int i13 = strIconCompatParcelizer.charAt(i3) == 'v' ? 1 : i3;
                                    accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite3 = r3.write(str5);
                                    InnerShadowScope innerShadowScope3 = accesstosizexkawntqjdWrite3.ComponentActivity;
                                    if (innerShadowScope3 == null || !(innerShadowScope3 instanceof component5)) {
                                        component5 component5Var = i13 != 0 ? new component5(r3, toRect.VERTICAL_FLOW) : new component5(r3, toRect.HORIZONTAL_FLOW);
                                        accesstosizexkawntqjdWrite3.ComponentActivity = component5Var;
                                        accesstosizexkawntqjdWrite3.read(component5Var.write());
                                    }
                                    component5 component5Var2 = (component5) accesstosizexkawntqjdWrite3.ComponentActivity;
                                    Iterator it7 = accesstopxr2x_6ojd8.serializer().iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                            it = it3;
                                            break;
                                        } else {
                                            String str13 = (String) it7.next();
                                            str13.getClass();
                                            switch (str13.hashCode()) {
                                                case -1254185091:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("hAlign")) {
                                                        b5 = 0;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -1237307863:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("hStyle")) {
                                                        b5 = 1;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -1198076529:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("hFlowBias")) {
                                                        b5 = 2;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -853376977:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("vAlign")) {
                                                        b5 = 3;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -836499749:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("vStyle")) {
                                                        b5 = 4;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -806339567:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("padding")) {
                                                        b5 = 5;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -732635235:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("vFlowBias")) {
                                                        b5 = 6;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -567445985:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("contains")) {
                                                        b5 = 7;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case -488900360:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("maxElement")) {
                                                        b5 = 8;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case 3169614:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("hGap")) {
                                                        b5 = 9;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case 3575610:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals(str)) {
                                                        b5 = 10;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case 3586688:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("vGap")) {
                                                        b5 = 11;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case 3657802:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    if (str13.equals("wrap")) {
                                                        b5 = 12;
                                                    } else {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                default:
                                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                                    b5 = -1;
                                                    break;
                                            }
                                            switch (b5) {
                                                case 0:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    String strWrite18 = accesstopxr2x_6ojd8.read(str13).write();
                                                    if (strWrite18.equals("end")) {
                                                        component5Var2.onBackPressed = 1;
                                                    } else if (strWrite18.equals("start")) {
                                                        component5Var2.onBackPressed = 0;
                                                    } else {
                                                        component5Var2.onBackPressed = 2;
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 1:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    DropShadowScope dropShadowScope13 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope13 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd11 = (accessroundToPxR2X_6ojd) dropShadowScope13;
                                                        if (accessroundtopxr2x_6ojd11.RemoteActionCompatParcelizer.size() > 1) {
                                                            strWrite6 = accessroundtopxr2x_6ojd11.write(0);
                                                            strWrite5 = accessroundtopxr2x_6ojd11.write(1);
                                                            strWrite7 = accessroundtopxr2x_6ojd11.RemoteActionCompatParcelizer.size() > 2 ? accessroundtopxr2x_6ojd11.write(2) : "";
                                                        } else {
                                                            strWrite5 = dropShadowScope13.write();
                                                            strWrite6 = "";
                                                            strWrite7 = strWrite6;
                                                        }
                                                    } else {
                                                        strWrite5 = dropShadowScope13.write();
                                                        strWrite6 = "";
                                                        strWrite7 = strWrite6;
                                                    }
                                                    if (!strWrite5.equals("")) {
                                                        component5Var2.initializeViewTreeOwners = toDpSizekrfVVM.getValueByString(strWrite5);
                                                    }
                                                    if (!strWrite6.equals("")) {
                                                        component5Var2.getLifecycle = toDpSizekrfVVM.getValueByString(strWrite6);
                                                    }
                                                    if (!strWrite7.equals("")) {
                                                        component5Var2.onConfigurationChanged = toDpSizekrfVVM.getValueByString(strWrite7);
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 2:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    DropShadowScope dropShadowScope14 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope14 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd12 = (accessroundToPxR2X_6ojd) dropShadowScope14;
                                                        if (accessroundtopxr2x_6ojd12.RemoteActionCompatParcelizer.size() > 1) {
                                                            fValueOf2 = Float.valueOf(accessroundtopxr2x_6ojd12.RemoteActionCompatParcelizer(0));
                                                            fValueOf = Float.valueOf(accessroundtopxr2x_6ojd12.RemoteActionCompatParcelizer(1));
                                                            fValueOf3 = accessroundtopxr2x_6ojd12.RemoteActionCompatParcelizer.size() > 2 ? Float.valueOf(accessroundtopxr2x_6ojd12.RemoteActionCompatParcelizer(2)) : fValueOf7;
                                                        } else {
                                                            fValueOf = Float.valueOf(dropShadowScope14.IconCompatParcelizer());
                                                            fValueOf2 = fValueOf7;
                                                            fValueOf3 = fValueOf2;
                                                        }
                                                    } else {
                                                        fValueOf = Float.valueOf(dropShadowScope14.IconCompatParcelizer());
                                                        fValueOf2 = fValueOf7;
                                                        fValueOf3 = fValueOf2;
                                                    }
                                                    component5Var2.ResultReceiver = fValueOf.floatValue();
                                                    if (fValueOf2.floatValue() != 0.5f) {
                                                        component5Var2.getOnBackPressedDispatcher = fValueOf2.floatValue();
                                                    }
                                                    if (fValueOf3.floatValue() != 0.5f) {
                                                        try {
                                                            component5Var2.onActivityResult = fValueOf3.floatValue();
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 3:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    String strWrite19 = accesstopxr2x_6ojd8.read(str13).write();
                                                    int iHashCode3 = strWrite19.hashCode();
                                                    if (iHashCode3 != -1720785339) {
                                                        if (iHashCode3 != -1383228885) {
                                                            if (iHashCode3 == 115029 && strWrite19.equals("top")) {
                                                                b6 = 2;
                                                            } else {
                                                                b6 = -1;
                                                            }
                                                        } else if (strWrite19.equals("bottom")) {
                                                            b6 = 1;
                                                        } else {
                                                            b6 = -1;
                                                        }
                                                    } else if (strWrite19.equals("baseline")) {
                                                        b6 = 0;
                                                    } else {
                                                        b6 = -1;
                                                    }
                                                    if (b6 == 0) {
                                                        component5Var2.onUserLeaveHint = 3;
                                                    } else if (b6 == 1) {
                                                        component5Var2.onUserLeaveHint = 1;
                                                    } else if (b6 != 2) {
                                                        component5Var2.onUserLeaveHint = 2;
                                                    } else {
                                                        component5Var2.onUserLeaveHint = 0;
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 4:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    DropShadowScope dropShadowScope15 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope15 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd13 = (accessroundToPxR2X_6ojd) dropShadowScope15;
                                                        if (accessroundtopxr2x_6ojd13.RemoteActionCompatParcelizer.size() > 1) {
                                                            strWrite9 = accessroundtopxr2x_6ojd13.write(0);
                                                            strWrite8 = accessroundtopxr2x_6ojd13.write(1);
                                                            strWrite10 = accessroundtopxr2x_6ojd13.RemoteActionCompatParcelizer.size() > 2 ? accessroundtopxr2x_6ojd13.write(2) : "";
                                                        } else {
                                                            strWrite8 = dropShadowScope15.write();
                                                            strWrite9 = "";
                                                            strWrite10 = strWrite9;
                                                        }
                                                    } else {
                                                        strWrite8 = dropShadowScope15.write();
                                                        strWrite9 = "";
                                                        strWrite10 = strWrite9;
                                                    }
                                                    if (!strWrite8.equals("")) {
                                                        component5Var2.onTrimMemory = toDpSizekrfVVM.getValueByString(strWrite8);
                                                    }
                                                    if (!strWrite9.equals("")) {
                                                        component5Var2.getNavigationEventDispatcher = toDpSizekrfVVM.getValueByString(strWrite9);
                                                    }
                                                    if (!strWrite10.equals("")) {
                                                        component5Var2.onMultiWindowModeChanged = toDpSizekrfVVM.getValueByString(strWrite10);
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 5:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    DropShadowScope dropShadowScope16 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope16 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd14 = (accessroundToPxR2X_6ojd) dropShadowScope16;
                                                        if (accessroundtopxr2x_6ojd14.RemoteActionCompatParcelizer.size() > 1) {
                                                            fMediaMetadataCompat2 = accessroundtopxr2x_6ojd14.IconCompatParcelizer(0);
                                                            fIconCompatParcelizer8 = accessroundtopxr2x_6ojd14.IconCompatParcelizer(1);
                                                            if (accessroundtopxr2x_6ojd14.RemoteActionCompatParcelizer.size() > 2) {
                                                                fIconCompatParcelizer7 = accessroundtopxr2x_6ojd14.IconCompatParcelizer(2);
                                                                try {
                                                                    fIconCompatParcelizer6 = ((accessroundToPxR2X_6ojd) dropShadowScope16).IconCompatParcelizer(3);
                                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                    fIconCompatParcelizer6 = 0.0f;
                                                                }
                                                            } else {
                                                                fIconCompatParcelizer7 = fMediaMetadataCompat2;
                                                                fIconCompatParcelizer6 = fIconCompatParcelizer8;
                                                            }
                                                        } else {
                                                            fMediaMetadataCompat2 = dropShadowScope16.MediaMetadataCompat();
                                                            fIconCompatParcelizer6 = fMediaMetadataCompat2;
                                                            fIconCompatParcelizer7 = fIconCompatParcelizer6;
                                                            fIconCompatParcelizer8 = fIconCompatParcelizer7;
                                                        }
                                                    } else {
                                                        fMediaMetadataCompat2 = dropShadowScope16.MediaMetadataCompat();
                                                        fIconCompatParcelizer6 = fMediaMetadataCompat2;
                                                        fIconCompatParcelizer7 = fIconCompatParcelizer6;
                                                        fIconCompatParcelizer8 = fIconCompatParcelizer7;
                                                    }
                                                    component5Var2.onRequestPermissionsResult = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fMediaMetadataCompat2));
                                                    component5Var2.onRetainNonConfigurationInstance = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer8));
                                                    component5Var2.onPictureInPictureUiStateChanged = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer7));
                                                    component5Var2.onPreparePanel = Math.round(r3.IconCompatParcelizer.IconCompatParcelizer(fIconCompatParcelizer6));
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 6:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    DropShadowScope dropShadowScope17 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope17 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd15 = (accessroundToPxR2X_6ojd) dropShadowScope17;
                                                        if (accessroundtopxr2x_6ojd15.RemoteActionCompatParcelizer.size() > 1) {
                                                            float fRemoteActionCompatParcelizer5 = accessroundtopxr2x_6ojd15.RemoteActionCompatParcelizer(0);
                                                            fValueOf4 = Float.valueOf(accessroundtopxr2x_6ojd15.RemoteActionCompatParcelizer(1));
                                                            fValueOf6 = accessroundtopxr2x_6ojd15.RemoteActionCompatParcelizer.size() > 2 ? Float.valueOf(accessroundtopxr2x_6ojd15.RemoteActionCompatParcelizer(2)) : fValueOf7;
                                                            fValueOf5 = Float.valueOf(fRemoteActionCompatParcelizer5);
                                                        } else {
                                                            fValueOf4 = Float.valueOf(dropShadowScope17.IconCompatParcelizer());
                                                            fValueOf5 = fValueOf7;
                                                            fValueOf6 = fValueOf5;
                                                        }
                                                    } else {
                                                        fValueOf4 = Float.valueOf(dropShadowScope17.IconCompatParcelizer());
                                                        fValueOf5 = fValueOf7;
                                                        fValueOf6 = fValueOf5;
                                                    }
                                                    try {
                                                        component5Var2.enterPictureInPictureMode = fValueOf4.floatValue();
                                                        if (fValueOf5.floatValue() != 0.5f) {
                                                            component5Var2.getViewModelStore = fValueOf5.floatValue();
                                                        }
                                                        if (fValueOf6.floatValue() != 0.5f) {
                                                            component5Var2.onNewIntent = fValueOf6.floatValue();
                                                        }
                                                    } catch (NumberFormatException unused4) {
                                                    }
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 7:
                                                    DropShadowScope dropShadowScope18 = accesstopxr2x_6ojd8.read(str13);
                                                    if (dropShadowScope18 instanceof accessroundToPxR2X_6ojd) {
                                                        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd16 = (accessroundToPxR2X_6ojd) dropShadowScope18;
                                                        it = it3;
                                                        if (accessroundtopxr2x_6ojd16.RemoteActionCompatParcelizer.size() >= 1) {
                                                            int i14 = 0;
                                                            while (i14 < accessroundtopxr2x_6ojd16.RemoteActionCompatParcelizer.size()) {
                                                                DropShadowScope dropShadowScope19 = accessroundtopxr2x_6ojd16.read(i14);
                                                                if (dropShadowScope19 instanceof accessroundToPxR2X_6ojd) {
                                                                    accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd17 = (accessroundToPxR2X_6ojd) dropShadowScope19;
                                                                    if (accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer.size() > 0) {
                                                                        String strWrite20 = accessroundtopxr2x_6ojd17.read(0).write();
                                                                        accessroundtopxr2x_6ojd = accessroundtopxr2x_6ojd16;
                                                                        int size3 = accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer.size();
                                                                        str4 = str;
                                                                        if (size3 == 2) {
                                                                            fRemoteActionCompatParcelizer2 = accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(1);
                                                                            fIconCompatParcelizer9 = Float.NaN;
                                                                        } else if (size3 != 3) {
                                                                            if (size3 != 4) {
                                                                                fIconCompatParcelizer9 = Float.NaN;
                                                                                fRemoteActionCompatParcelizer2 = Float.NaN;
                                                                            } else {
                                                                                float fRemoteActionCompatParcelizer6 = accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(1);
                                                                                fIconCompatParcelizer9 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(2));
                                                                                fIconCompatParcelizer10 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(3));
                                                                                fRemoteActionCompatParcelizer2 = fRemoteActionCompatParcelizer6;
                                                                            }
                                                                            component5Var2.IconCompatParcelizer(strWrite20);
                                                                            if (!Float.isNaN(fRemoteActionCompatParcelizer2)) {
                                                                                if (component5Var2.onCreate == null) {
                                                                                    component5Var2.onCreate = new HashMap();
                                                                                }
                                                                                component5Var2.onCreate.put(strWrite20, Float.valueOf(fRemoteActionCompatParcelizer2));
                                                                            }
                                                                            if (!Float.isNaN(fIconCompatParcelizer9)) {
                                                                                if (component5Var2.onMenuItemSelected == null) {
                                                                                    component5Var2.onMenuItemSelected = new HashMap();
                                                                                }
                                                                                component5Var2.onMenuItemSelected.put(strWrite20, Float.valueOf(fIconCompatParcelizer9));
                                                                            }
                                                                            if (Float.isNaN(fIconCompatParcelizer10)) {
                                                                                if (component5Var2.onCreatePanelMenu == null) {
                                                                                    component5Var2.onCreatePanelMenu = new HashMap();
                                                                                }
                                                                                component5Var2.onCreatePanelMenu.put(strWrite20, Float.valueOf(fIconCompatParcelizer10));
                                                                            }
                                                                        } else {
                                                                            fRemoteActionCompatParcelizer2 = accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(1);
                                                                            fIconCompatParcelizer9 = r3.IconCompatParcelizer.IconCompatParcelizer(accessroundtopxr2x_6ojd17.RemoteActionCompatParcelizer(2));
                                                                        }
                                                                        fIconCompatParcelizer10 = fIconCompatParcelizer9;
                                                                        component5Var2.IconCompatParcelizer(strWrite20);
                                                                        if (!Float.isNaN(fRemoteActionCompatParcelizer2)) {
                                                                            if (component5Var2.onCreate == null) {
                                                                                component5Var2.onCreate = new HashMap();
                                                                            }
                                                                            component5Var2.onCreate.put(strWrite20, Float.valueOf(fRemoteActionCompatParcelizer2));
                                                                        }
                                                                        if (!Float.isNaN(fIconCompatParcelizer9)) {
                                                                            if (component5Var2.onMenuItemSelected == null) {
                                                                                component5Var2.onMenuItemSelected = new HashMap();
                                                                            }
                                                                            component5Var2.onMenuItemSelected.put(strWrite20, Float.valueOf(fIconCompatParcelizer9));
                                                                        }
                                                                        if (Float.isNaN(fIconCompatParcelizer10)) {
                                                                            if (component5Var2.onCreatePanelMenu == null) {
                                                                                component5Var2.onCreatePanelMenu = new HashMap();
                                                                            }
                                                                            component5Var2.onCreatePanelMenu.put(strWrite20, Float.valueOf(fIconCompatParcelizer10));
                                                                        }
                                                                    } else {
                                                                        accessroundtopxr2x_6ojd = accessroundtopxr2x_6ojd16;
                                                                        str4 = str;
                                                                    }
                                                                } else {
                                                                    accessroundtopxr2x_6ojd = accessroundtopxr2x_6ojd16;
                                                                    str4 = str;
                                                                    component5Var2.IconCompatParcelizer(dropShadowScope19.write());
                                                                }
                                                                i14++;
                                                                accessroundtopxr2x_6ojd16 = accessroundtopxr2x_6ojd;
                                                                str = str4;
                                                            }
                                                            str3 = str;
                                                            accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                            it3 = it;
                                                            it7 = it7;
                                                            str = str3;
                                                            break;
                                                        }
                                                    } else {
                                                        it = it3;
                                                    }
                                                    PrintStream printStream2 = System.err;
                                                    StringBuilder sbM2 = af$$ExternalSyntheticOutline0.m(str5, " contains should be an array \"");
                                                    sbM2.append(dropShadowScope18.write());
                                                    sbM2.append("\"");
                                                    printStream2.println(sbM2.toString());
                                                    break;
                                                case 8:
                                                    component5Var2.onPictureInPictureModeChanged = accesstopxr2x_6ojd8.read(str13).MediaMetadataCompat();
                                                    it = it3;
                                                    str3 = str;
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 9:
                                                    component5Var2.invalidateMenu = accesstopxr2x_6ojd8.read(str13).MediaMetadataCompat();
                                                    it = it3;
                                                    str3 = str;
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 10:
                                                    if (accesstopxr2x_6ojd8.read(str13).write().equals("hFlow")) {
                                                        component5Var2.onPanelClosed = 0;
                                                    } else {
                                                        component5Var2.onPanelClosed = 1;
                                                    }
                                                    it = it3;
                                                    str3 = str;
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 11:
                                                    component5Var2.onSaveInstanceState = accesstopxr2x_6ojd8.read(str13).MediaMetadataCompat();
                                                    it = it3;
                                                    str3 = str;
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                case 12:
                                                    component5Var2.onRetainCustomNonConfigurationInstance = toSizeXkaWNTQ.getValueByString(accesstopxr2x_6ojd8.read(str13).write());
                                                    it = it3;
                                                    str3 = str;
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                                default:
                                                    it = it3;
                                                    it7 = it7;
                                                    str3 = str;
                                                    migrateSealedSessionsMapToJsonlambda3.read(r3, accesstopxr2x_6ojd8, r3.write(str5), navArgsLazy, str13);
                                                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                                                    it3 = it;
                                                    it7 = it7;
                                                    str = str3;
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 9:
                                    migrateSealedSessionsMapToJsonlambda3.IconCompatParcelizer(i3, (drawBehind) r3, str5, accesstopxr2x_6ojd8);
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    break;
                                default:
                                    accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                                    it = it3;
                                    break;
                            }
                        } else {
                            accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                            it = it3;
                            migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(r3, navArgsLazy, str5, accesstopxr2x_6ojd8);
                        }
                    } else {
                        accesstopxr2x_6ojd = accesstopxr2x_6ojd4;
                        it = it3;
                        if (dropShadowScope instanceof accesstoRectjd) {
                            ((HashMap) navArgsLazy.MediaSessionCompatQueueItem).put(str5, Integer.valueOf(dropShadowScope.MediaMetadataCompat()));
                        }
                    }
                    c = 2;
                    accesstopxr2x_6ojd4 = accesstopxr2x_6ojd;
                    it3 = it;
                    i3 = 0;
                    z = true;
                }
                return createfromparcel;
            case 1:
                Uri uri = ((accessgetMayRenderInSoftwarecp) ((isPlacementApproachInProgress) obj)).serializer;
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uri);
                setGravity.RemoteActionCompatParcelizer();
                onCreate oncreate = new onCreate();
                oncreate.write = onPreparePanel.IconCompatParcelizer;
                setGravity.RemoteActionCompatParcelizer();
                oncreate.write = onRequestPermissionsResult.RemoteActionCompatParcelizer;
                oncreate.IconCompatParcelizer = onPanelClosed.serializer;
                Intent intent2 = onPictureInPictureModeChanged.read((Context) obj2, oncreate);
                Intent intentCreateChooser = Intent.createChooser(intent, null);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                ((GraphicsViewLayer) obj3).RemoteActionCompatParcelizer.write(intentCreateChooser);
                return createfromparcel;
            case 2:
                ChatService chatServiceIconCompatParcelizer = ((CustomerChatModule) obj3).IconCompatParcelizer();
                chatServiceIconCompatParcelizer.getClass();
                BuildersKt.RemoteActionCompatParcelizer(chatServiceIconCompatParcelizer, new VectorPainterKtrememberVectorPainter211((getMinDebounceDeadline) obj, chatServiceIconCompatParcelizer), null, new RealImageLoader.AnonymousClass2((getGlobalChangeEntries) obj2, chatServiceIconCompatParcelizer, shortNewsContentCardView, 26), 2);
                return createfromparcel;
            case 3:
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                PerformanceTracker.asyncSectionCompleted((AsyncSection) obj3);
                RouteOptions routeOptions = (RouteOptions) obj;
                routeOptions.getClass();
                ((CallsKt$await$2$2) ((AnalyticsServiceImpl) obj2).locationProvider).onCanceled(routeOptions, "OFFLINE");
                return createfromparcel;
            case 4:
                ?? sb = new StringBuilder("routes update (reason: ");
                sb.append(FirestoreGrpc.mapToReason((getCutText) obj2));
                sb.append(", route IDs: ");
                List list2 = (List) obj3;
                ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(((NavigationRoute) it8.next()).id);
                }
                sb.append(arrayList4);
                sb.append(") ");
                sb.append((String) obj);
                return sb.toString();
            case 5:
                CalloutViewHolder calloutViewHolder = (CalloutViewHolder) obj;
                ViewAnnotationOptions.Builder builder = calloutViewHolder.options.toBuilder();
                builder.getClass();
                ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(new AnnotatedLayerFeature.Builder().layerId((String) obj2).build()));
                builderAnnotatedFeature.getClass();
                ViewAnnotationOptions viewAnnotationOptionsBuild = builderAnnotatedFeature.build();
                ViewAnnotationManager viewAnnotationManager = (ViewAnnotationManager) ((BlockRunner) obj3).read;
                View view = calloutViewHolder.view;
                viewAnnotationOptionsBuild.getClass();
                viewAnnotationManager.addViewAnnotation(view, viewAnnotationOptionsBuild);
                return createfromparcel;
            case 6:
                new MapboxNavigation$notification$1$1((Expression) obj2, i2, (String) obj3).invoke((Style) obj);
                return createfromparcel;
            case 7:
                Style style = (Style) obj2;
                String str14 = ((RouteLineSourceKey) ((onViewAttachedToWindowlambda0) obj).serializer).sourceId;
                Map map6 = MapboxRouteLineUtils.sourceLayerMap;
                ((MapboxRouteLineView) obj3).getClass();
                Set set = (Set) map6.get(new RouteLineSourceKey(str14));
                if (set != null) {
                    Iterator it9 = set.iterator();
                    while (it9.hasNext()) {
                        style.moveStyleLayer((String) it9.next(), new LayerPosition(null, "mapbox-top-level-route-layer", null));
                    }
                }
                return createfromparcel;
            case 8:
                LocalDataProviderImpl localDataProviderImpl = (LocalDataProviderImpl) obj2;
                ((x) ((H$b) obj3).write).registerDataProviderContext(localDataProviderImpl, new IndexableDataProvidersRegistryImpl$DataProviderContext((IndexableDataProviderEngineImpl) obj, localDataProviderImpl));
                return createfromparcel;
            default:
                if (((HandlerThread) obj3).isAlive()) {
                    cancelPendingWebViewPause cancelpendingwebviewpause = (cancelPendingWebViewPause) obj2;
                    if (cancelpendingwebviewpause.IconCompatParcelizer) {
                        cancelpendingwebviewpause.IconCompatParcelizer = false;
                        try {
                            try {
                                ((Handler) obj).postDelayed(new setViewBackgroundColorFilter(this, 1), 1000L);
                                break;
                            } catch (RuntimeException unused5) {
                            }
                        } catch (RuntimeException unused6) {
                        }
                    }
                }
                return createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$applyTo$1(MapboxRouteLineView mapboxRouteLineView, String str, Expression expression, Style style) {
        super(0);
        this.serializer = 6;
        this.read = str;
        this.RemoteActionCompatParcelizer = expression;
        this.write = style;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConstraintSetForInlineDsl$applyTo$1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.serializer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = obj3;
    }
}
