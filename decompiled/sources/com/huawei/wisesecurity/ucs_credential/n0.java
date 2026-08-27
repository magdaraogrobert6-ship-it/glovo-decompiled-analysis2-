package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.collection.ObjectList$toString$1;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import com.google.android.gms.internal.mlkit_vision_face.zzmi;
import com.google.android.gms.internal.mlkit_vision_face.zzmk;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.huawei.wisesecurity.kfs.crypto.key.ECKeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsKeyStoreException;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.mapbox.api.directions.v5.models.Bearing;
import com.mapbox.api.directions.v5.utils.ParseUtils;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$RestoreTraffic;
import com.mapbox.navigation.core.internal.congestions.processor.TrafficUpdateActionHandler;
import com.mapbox.navigation.core.internal.congestions.speed.SpeedAnalyzeUtilsKt$restoreTraffic$2;
import com.mapbox.search.base.BaseRequestOptions;
import com.mapbox.search.base.result.BaseRawSearchResult;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.internal.bindgen.ResultType;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.home.nest.NestFragment;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ScrollCaptureCandidate;
import o.SimpleItemTouchHelperCallback;
import o.TextForegroundStyle;
import o.accessgetInstancedelegatecp;
import o.accessgetSwitchcp;
import o.addSemanticsPropertiesFrom;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCanScrollVertically;
import o.getChildrenForSearch;
import o.getCieXyz;
import o.getInAppMessageStackannotations;
import o.getSteps;
import o.hideCurrentlyDisplayingInAppMessage;
import o.ignoreRemeasureRequests;
import o.instance_delegatelambda0;
import o.localeSpan;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;
import o.visitScrollCaptureCandidates;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements ScrollCaptureCandidate, ParseUtils.ValueParser, TrafficUpdateActionHandler, addSemanticsPropertiesFrom {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static ECKeyStoreKeyManager write;
    public static final n0 serializer = new n0(0);
    public static final Object IconCompatParcelizer = new Object();

    public /* synthetic */ n0() {
    }

    static {
        int i = RemoteActionCompatParcelizer + 113;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public n0(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, TextForegroundStyle textForegroundStyle, localeSpan localespan, Clock clock) {
    }

    public static /* synthetic */ NestFragment write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 75;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        NestFragment nestFragmentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(false);
        int i4 = PlaybackStateCompatCustomAction + 117;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return nestFragmentRemoteActionCompatParcelizer;
    }

    public static final Expected getCoordinatesData$createError(String str) {
        Expected expectedCreateError;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 5;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            expectedCreateError = ExpectedFactory.createError(str);
            expectedCreateError.getClass();
            int i3 = 95 / 0;
        } else {
            expectedCreateError = ExpectedFactory.createError(str);
            expectedCreateError.getClass();
        }
        int i4 = MediaSessionCompatQueueItem + 85;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return expectedCreateError;
    }

    @Override // o.ScrollCaptureCandidate
    public String IconCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        String str = new String(bArr, StandardCharsets.UTF_8);
        int i2 = PlaybackStateCompatCustomAction + 9;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NestFragment RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        NestFragment nestFragment = new NestFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_slide_animation_arg", z);
        nestFragment.setArguments(bundle);
        int i2 = PlaybackStateCompatCustomAction + 101;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return nestFragment;
        }
        throw null;
    }

    @Override // com.mapbox.navigation.core.internal.congestions.processor.TrafficUpdateActionHandler
    public NavigationRoute handleAction(ignoreRemeasureRequests ignoreremeasurerequests) {
        int i = 2 % 2;
        TrafficUpdateAction$RestoreTraffic trafficUpdateAction$RestoreTraffic = (TrafficUpdateAction$RestoreTraffic) ignoreremeasurerequests;
        trafficUpdateAction$RestoreTraffic.getClass();
        NavigationRoute navigationRoute = trafficUpdateAction$RestoreTraffic.route;
        CongestionNumericOverride congestionNumericOverride = trafficUpdateAction$RestoreTraffic.congestionNumericOverride;
        navigationRoute.getClass();
        NavigationRoute navigationRouteUpdate$default = zzmk.update$default(navigationRoute, new ObjectList$toString$1(22, congestionNumericOverride), SpeedAnalyzeUtilsKt$restoreTraffic$2.INSTANCE, null, null, 8);
        int i2 = PlaybackStateCompatCustomAction + 25;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return navigationRouteUpdate$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 java.lang.String[], still in use, count: 2, list:
          (r6v7 java.lang.String[]) from 0x0014: ARRAY_LENGTH (r6v7 java.lang.String[]) A[WRAPPED] (LINE:6)
          (r6v7 java.lang.String[]) from 0x0020: PHI (r6 I:??) = (r6v1 java.lang.String[]), (r6v7 java.lang.String[]) binds: [B:8:0x001e, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.mapbox.api.directions.v5.utils.ParseUtils.ValueParser
    public java.lang.Object parse(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.wisesecurity.ucs_credential.n0.MediaSessionCompatQueueItem
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.wisesecurity.ucs_credential.n0.PlaybackStateCompatCustomAction = r2
            int r1 = r1 % r0
            java.lang.String r2 = ","
            if (r1 != 0) goto L19
            java.lang.String[] r6 = r6.split(r2)
            int r1 = r6.length
            r2 = 5
            if (r1 != r2) goto L3c
            goto L20
        L19:
            java.lang.String[] r6 = r6.split(r2)
            int r1 = r6.length
            if (r1 != r0) goto L3c
        L20:
            r1 = 0
            r1 = r6[r1]
            double r1 = java.lang.Double.parseDouble(r1)
            r3 = 1
            r6 = r6[r3]
            double r3 = java.lang.Double.parseDouble(r6)
            com.mapbox.geojson.Point r6 = com.mapbox.geojson.Point.fromLngLat(r1, r3)
            int r1 = com.huawei.wisesecurity.ucs_credential.n0.MediaSessionCompatQueueItem
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.wisesecurity.ucs_credential.n0.PlaybackStateCompatCustomAction = r2
            int r1 = r1 % r0
            return r6
        L3c:
            java.lang.String r6 = "Point list should have exactly 2 values, longitude and latitude."
            io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.wisesecurity.ucs_credential.n0.parse(java.lang.String):java.lang.Object");
    }

    public static ArrayList withFirstTrue(int i, List list) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.TRUE);
        List list2 = list;
        if (list2 != null) {
            int i3 = MediaSessionCompatQueueItem + 55;
            PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                list2.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!list2.isEmpty()) {
                arrayList.addAll(onContentCardDismissed.IconCompatParcelizer(i, list));
                return arrayList;
            }
            int i4 = PlaybackStateCompatCustomAction + 91;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        onContentCardDismissed.serializer(arrayList, new Boolean[i]);
        return arrayList;
    }

    public static void IconCompatParcelizer(FragmentActivity fragmentActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment") != null) {
            return;
        }
        TermsAndConditionsFragment termsAndConditionsFragment = new TermsAndConditionsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("address", str);
        termsAndConditionsFragment.setArguments(bundle);
        termsAndConditionsFragment.RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment");
        int i4 = MediaSessionCompatQueueItem + 29;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static String prepareSearchResultInfo$default(BaseRawSearchResult baseRawSearchResult, BaseRequestOptions baseRequestOptions, int i) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 39;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            ResultType[] resultTypeArr = SearchResultFactory.NOT_SEARCH_RESULT_TYPES;
            if ((i & 4) != 0) {
                int i4 = MediaSessionCompatQueueItem + 39;
                PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                baseRequestOptions = null;
            }
        } else {
            ResultType[] resultTypeArr2 = SearchResultFactory.NOT_SEARCH_RESULT_TYPES;
            if ((i & 2) != 0) {
                int i6 = MediaSessionCompatQueueItem + 39;
                PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                baseRequestOptions = null;
            }
        }
        return "[SearchResult] ID: " + baseRawSearchResult.id + ", types: " + baseRawSearchResult.types + ", request options: " + baseRequestOptions + ", api: " + ((Object) null);
    }

    public Certificate[] RemoteActionCompatParcelizer() throws UcsKeyStoreException {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                write.write("ucs_ec_alias_rootKey");
                throw null;
            }
            Certificate[] certificateArrWrite = write.write("ucs_ec_alias_rootKey");
            int i3 = PlaybackStateCompatCustomAction + 45;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return certificateArrWrite;
        } catch (KfsException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("getCertificateChain failed, ");
            sbIconCompatParcelizer.append(e.getMessage());
            getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer.toString(), new Object[0]);
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("getCertificateChain failed , exception ");
            sbIconCompatParcelizer2.append(e.getMessage());
            throw new UcsKeyStoreException(sbIconCompatParcelizer2.toString());
        }
    }

    public static List getUpdatedWaypointIndicesList(List list, int i, String str) {
        int i2 = 2 % 2;
        List list2 = list;
        Object obj = null;
        if (list2 != null) {
            int i3 = PlaybackStateCompatCustomAction + 65;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                list2.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!list2.isEmpty()) {
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "MAP_MATCHING_API"}, iWrite3)).booleanValue()) {
                    return SQLite.read(0, 1);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(0);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = (((Number) it.next()).intValue() - i) + 1;
                    if (iIntValue > 0) {
                        int i4 = PlaybackStateCompatCustomAction + 61;
                        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                }
                return arrayList;
            }
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        int i6 = MediaSessionCompatQueueItem + 125;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return instance_delegatelambda0Var;
        }
        obj.hashCode();
        throw null;
    }

    public static final ArrayList access$getDeviceLanguageTags(Context context) {
        int i = 2 % 2;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        locales.getClass();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(locales.size())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (it.RemoteActionCompatParcelizer) {
            arrayList.add(locales.get(it.RemoteActionCompatParcelizer()));
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (!(!it2.hasNext())) {
            int i2 = PlaybackStateCompatCustomAction + 109;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                arrayList2.add(((Locale) it2.next()).toLanguageTag());
                int i3 = 67 / 0;
            } else {
                arrayList2.add(((Locale) it2.next()).toLanguageTag());
            }
        }
        int i4 = PlaybackStateCompatCustomAction + 105;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public static ArrayList getUpdatedBearingList(int i, int i2, Double d, List list) {
        double dDegrees;
        int size;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i4 = PlaybackStateCompatCustomAction + 109;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Bearing bearing = (Bearing) onContentCardDismissed.read(0, list);
            if (bearing != null) {
                dDegrees = bearing.degrees();
            } else {
                dDegrees = 90.0d;
            }
        } else {
            dDegrees = 90.0d;
        }
        arrayList.add(d != null ? Bearing.builder().angle(d.doubleValue()).degrees(dDegrees).build() : null);
        if (list != null && i2 <= (size = list.size() - 1)) {
            while (true) {
                arrayList.add(list.get(i2));
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        while (arrayList.size() < i + 1) {
            int i6 = MediaSessionCompatQueueItem + 81;
            PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            arrayList.add(null);
        }
        int i8 = PlaybackStateCompatCustomAction + 115;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return arrayList;
    }

    public static Bitmap RemoteActionCompatParcelizer(Bitmap bitmap, int i) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 61;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Integer.max(bitmap.getWidth(), bitmap.getHeight());
            throw null;
        }
        if (Integer.max(bitmap.getWidth(), bitmap.getHeight()) < i) {
            return bitmap;
        }
        float fMax = i / Integer.max(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() > bitmap.getHeight()) {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Integer.valueOf(i), Float.valueOf(bitmap.getHeight() * fMax));
        } else {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Float.valueOf(bitmap.getWidth() * fMax), Integer.valueOf(i));
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, ((Number) onviewattachedtowindowlambda0.serializer).intValue(), ((Number) onviewattachedtowindowlambda0.write).intValue(), true);
        int i4 = PlaybackStateCompatCustomAction + 43;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return bitmapCreateScaledBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public static ArrayList getUpdatedWaypointsList(List list, List list2, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem;
        int i4 = i3 + 119;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        List list3 = list;
        if (list3 != null) {
            int i6 = i3 + 63;
            PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
            Object obj = null;
            if (i6 % 2 == 0) {
                list3.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!list3.isEmpty()) {
                List list4 = list2;
                if (list4 != null) {
                    int i7 = MediaSessionCompatQueueItem + 23;
                    PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (list4.isEmpty()) {
                        list2 = onContentCardDismissed.PlaybackStateCompat(SQLite.write((Collection) list3));
                    }
                } else {
                    list2 = onContentCardDismissed.PlaybackStateCompat(SQLite.write((Collection) list3));
                }
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                if (list2 != null) {
                    int i10 = MediaSessionCompatQueueItem + 89;
                    PlaybackStateCompatCustomAction = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    int i12 = 0;
                    for (Object obj2 : list2) {
                        int i13 = PlaybackStateCompatCustomAction + 121;
                        MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (i12 < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        int i15 = PlaybackStateCompatCustomAction + 91;
                        MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        if (((Number) obj2).intValue() < i) {
                            i9 = i12;
                        }
                        i12++;
                    }
                }
                arrayList.add(null);
                arrayList.addAll(list.subList(i9 + 1, list.size()));
                return arrayList;
            }
        }
        return new ArrayList();
    }

    public static Map getUpdatedUnrecognizedJsonProperties(int i, String str, Map map) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 103;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "MAP_MATCHING_API"}, iWrite3)).booleanValue();
            throw null;
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "MAP_MATCHING_API"}, iWrite6)).booleanValue()) {
            int i4 = PlaybackStateCompatCustomAction + 31;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return SimpleItemTouchHelperCallback.serializer;
            }
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
            obj.hashCode();
            throw null;
        }
        if (map == null) {
            int i5 = PlaybackStateCompatCustomAction + 25;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (zzmi.isEVRoute(map)) {
            for (String str2 : SQLite.read("waypoints.charging_station_id", "waypoints.charging_station_power", "waypoints.charging_station_current_type")) {
                if (map.containsKey(str2)) {
                    Object obj2 = map.get(str2);
                    obj2.getClass();
                    String asString = ((JsonElement) obj2).getAsString();
                    asString.getClass();
                    linkedHashMap.put(str2, new JsonPrimitive(";".concat(onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.serializer(hideCurrentlyDisplayingInAppMessage.serializer(asString, new String[]{";"}, 6), i), ";", null, null, null, 62))));
                } else {
                    int i6 = MediaSessionCompatQueueItem + 111;
                    PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
        }
        return linkedHashMap;
    }

    public void read() throws UcsKeyStoreException {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 77;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            if (write.RemoteActionCompatParcelizer("ucs_ec_alias_rootKey")) {
                getSteps.read("KeyStoreManager", "the alias exists", new Object[0]);
                int i4 = PlaybackStateCompatCustomAction + 95;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            try {
                write.RemoteActionCompatParcelizer(new visitScrollCaptureCandidates("ucs_ec_alias_rootKey", Fields.RotationX, getChildrenForSearch.PURPOSE_SIGN));
            } catch (KfsException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed, ");
                sbIconCompatParcelizer.append(e.getMessage());
                getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer.toString(), new Object[0]);
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed , exception ");
                sbIconCompatParcelizer2.append(e.getMessage());
                throw new UcsKeyStoreException(sbIconCompatParcelizer2.toString());
            }
        } catch (KfsException e2) {
            StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed, ");
            sbIconCompatParcelizer3.append(e2.getMessage());
            getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer3.toString(), new Object[0]);
            StringBuilder sbIconCompatParcelizer4 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed , exception ");
            sbIconCompatParcelizer4.append(e2.getMessage());
            throw new UcsKeyStoreException(sbIconCompatParcelizer4.toString());
        }
    }

    public static void serializer(UcsKeyStoreProvider ucsKeyStoreProvider) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        ECKeyStoreKeyManager eCKeyStoreKeyManager = write;
        if (eCKeyStoreKeyManager != null) {
            int i5 = i3 + 43;
            PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) eCKeyStoreKeyManager.IconCompatParcelizer;
            String name = ucsKeyStoreProvider.getName();
            getCanScrollVertically getcanscrollvertically2 = getCanScrollVertically.ANDROID_KEYSTORE;
            if (!TextUtils.equals(name, getcanscrollvertically2.getName())) {
                getcanscrollvertically2 = getCanScrollVertically.HUAWEI_KEYSTORE;
            }
            if (getcanscrollvertically == getcanscrollvertically2) {
                return;
            }
        }
        String name2 = ucsKeyStoreProvider.getName();
        getCanScrollVertically getcanscrollvertically3 = getCanScrollVertically.ANDROID_KEYSTORE;
        if (!TextUtils.equals(name2, getcanscrollvertically3.getName())) {
            getcanscrollvertically3 = getCanScrollVertically.HUAWEI_KEYSTORE;
        }
        write = new ECKeyStoreKeyManager(getcanscrollvertically3);
    }

    public n0(int i) {
    }
}
