package com.sentiance.core.model.events;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedCallback;
import com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedResult;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.AccountCreationException;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.CreateAccountUseCase$invoke$1;
import com.roadrunner.rider.safety.report.data.SafetyReportRepository$getSafetyReport$1;
import com.roadrunner.rider.safety.report.data.SafetyReportRepository$getSafetyReport$2;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import com.roadrunner.startworking.data.StartWorkingRepository;
import com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1;
import io.sentry.util.network.NetworkBody;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BrazeExternalSyntheticLambda5;
import o.QueryResultCompanion;
import o.deserialize;
import o.f8;
import o.g8;
import o.getOrNull;
import o.handleInternalBannerRefreshlambda1;
import o.intercept;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.m7;
import o.mb;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.requestPermissions;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.transferSessionPackageI;
import o.unpackInt2;
import o.updateAdidI;
import o.validateAndStorePushId;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class C$b implements RoutesRenderedCallback {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public Object IconCompatParcelizer;
    public Object serializer;
    public Object write;

    public C$b(QueryResultCompanion queryResultCompanion, transferSessionPackageI transfersessionpackagei, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5) {
        queryResultCompanion.getClass();
        transfersessionpackagei.getClass();
        brazeExternalSyntheticLambda5.getClass();
        this.serializer = queryResultCompanion;
        this.write = transfersessionpackagei;
        this.IconCompatParcelizer = brazeExternalSyntheticLambda5;
    }

    public schedulePushDeliveryandroid_sdk_base_release IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 103;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (schedulePushDeliveryandroid_sdk_base_release) ((isAdapterPositionOnScreen) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 85 / 0;
        return (schedulePushDeliveryandroid_sdk_base_release) ((isAdapterPositionOnScreen) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
    }

    public /* synthetic */ C$b(Object obj, Object obj2, Object obj3) {
        this.serializer = obj;
        this.write = obj2;
        this.IconCompatParcelizer = obj3;
    }

    public C$b(NetworkBody networkBody, AccountCreationLogger accountCreationLogger, getOrNull getornull) {
        networkBody.getClass();
        accountCreationLogger.getClass();
        getornull.getClass();
        this.serializer = networkBody;
        this.write = accountCreationLogger;
        this.IconCompatParcelizer = getornull;
    }

    public C$b(intercept interceptVar, unpackInt2 unpackint2, requestPermissions requestpermissions) {
        interceptVar.getClass();
        unpackint2.getClass();
        requestpermissions.getClass();
        this.serializer = interceptVar;
        this.write = unpackint2;
        this.IconCompatParcelizer = requestpermissions;
    }

    public validateAndStorePushId serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 115;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (((Byte) this.write) != null) {
            int i5 = i2 + 81;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (((Long) this.serializer) != null) {
                return new validateAndStorePushId(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'reason' is missing");
        }
        int i7 = read + 7;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056 A[PHI: r1
  0x0056: PHI (r1v12 com.mapbox.geojson.Point) = (r1v11 com.mapbox.geojson.Point), (r1v17 com.mapbox.geojson.Point) binds: [B:10:0x0054, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0069  */
    @Override // com.mapbox.navigation.ui.maps.route.line.api.RoutesRenderedCallback
    public void onRoutesRendered(RoutesRenderedResult routesRenderedResult) {
        Object g8Var;
        Point point;
        int i = 2 % 2;
        routesRenderedResult.getClass();
        mb mbVar = ((m7) this.serializer).PlaybackStateCompat;
        NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.read((List) this.write);
        navigationRoute.getClass();
        String strGeometry = navigationRoute.directionsRoute.geometry();
        if (strGeometry != null) {
            int i2 = read + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                List<Point> listCoordinates = LineString.fromPolyline(strGeometry, 37).coordinates();
                listCoordinates.getClass();
                point = (Point) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listCoordinates);
                if (point != null) {
                    g8Var = new g8(new f8(point.latitude(), point.longitude()));
                } else {
                    g8Var = deserialize.read;
                }
            } else {
                List<Point> listCoordinates2 = LineString.fromPolyline(strGeometry, 6).coordinates();
                listCoordinates2.getClass();
                point = (Point) onContentCardDismissed.MediaBrowserCompatMediaItem((List) listCoordinates2);
                if (point != null) {
                    g8Var = new g8(new f8(point.latitude(), point.longitude()));
                } else {
                    g8Var = deserialize.read;
                }
            }
        } else {
            g8Var = deserialize.read;
        }
        mbVar.IconCompatParcelizer.write(g8Var);
        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.IconCompatParcelizer).invoke();
        int i3 = RemoteActionCompatParcelizer + 71;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: getSafetyReport-IoAF18A$implementation, reason: not valid java name */
    public Object m5073getSafetyReportIoAF18A$implementation(ContinuationImpl continuationImpl) {
        SafetyReportRepository$getSafetyReport$1 safetyReportRepository$getSafetyReport$1;
        int i;
        int i2;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i3;
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer;
        Long l;
        Object objM4875invokegIAlus;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 121;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            if (continuationImpl instanceof SafetyReportRepository$getSafetyReport$1) {
                safetyReportRepository$getSafetyReport$1 = (SafetyReportRepository$getSafetyReport$1) continuationImpl;
                i = safetyReportRepository$getSafetyReport$1.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    safetyReportRepository$getSafetyReport$1.read = i - Integer.MIN_VALUE;
                    i2 = RemoteActionCompatParcelizer + 91;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        int i7 = 4 % 4;
                    }
                }
            }
            obj = safetyReportRepository$getSafetyReport$1.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = safetyReportRepository$getSafetyReport$1.read;
            if (i3 != 0) {
                i4 = read + 73;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) ((r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) this.IconCompatParcelizer)).RemoteActionCompatParcelizer.serializer();
            if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
                l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
            } else {
                l = null;
            }
            if (l == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                return null;
            }
            long jLongValue = l.longValue();
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.write;
            SafetyReportRepository$getSafetyReport$2 safetyReportRepository$getSafetyReport$2 = new SafetyReportRepository$getSafetyReport$2(this, jLongValue, null, 0);
            safetyReportRepository$getSafetyReport$1.read = 1;
            objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(safetyReportRepository$getSafetyReport$2, safetyReportRepository$getSafetyReport$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM4875invokegIAlus;
        }
        int i8 = 12 / 0;
        if (!(!(continuationImpl instanceof SafetyReportRepository$getSafetyReport$1))) {
            safetyReportRepository$getSafetyReport$1 = (SafetyReportRepository$getSafetyReport$1) continuationImpl;
            i = safetyReportRepository$getSafetyReport$1.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                safetyReportRepository$getSafetyReport$1.read = i - Integer.MIN_VALUE;
                i2 = RemoteActionCompatParcelizer + 91;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i9 = 4 % 4;
                }
            }
        }
        obj = safetyReportRepository$getSafetyReport$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = safetyReportRepository$getSafetyReport$1.read;
        if (i3 != 0) {
            i4 = read + 73;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) ((r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) this.IconCompatParcelizer)).RemoteActionCompatParcelizer.serializer();
        if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
            l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
        } else {
            l = null;
        }
        if (l == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            return null;
        }
        long jLongValue2 = l.longValue();
        ExecuteApiRequest executeApiRequest2 = (ExecuteApiRequest) this.write;
        SafetyReportRepository$getSafetyReport$2 safetyReportRepository$getSafetyReport$3 = new SafetyReportRepository$getSafetyReport$2(this, jLongValue2, null, 0);
        safetyReportRepository$getSafetyReport$1.read = 1;
        objM4875invokegIAlus = executeApiRequest2.m4875invokegIAlus(safetyReportRepository$getSafetyReport$3, safetyReportRepository$getSafetyReport$1);
        if (objM4875invokegIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM4875invokegIAlus;
        safetyReportRepository$getSafetyReport$1 = new SafetyReportRepository$getSafetyReport$1(this, continuationImpl);
        int i10 = read + 105;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        obj = safetyReportRepository$getSafetyReport$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = safetyReportRepository$getSafetyReport$1.read;
        if (i3 != 0) {
            i4 = read + 73;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) ((r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) this.IconCompatParcelizer)).RemoteActionCompatParcelizer.serializer();
        if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
            l = new Long(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
        } else {
            l = null;
        }
        if (l == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            return null;
        }
        long jLongValue3 = l.longValue();
        ExecuteApiRequest executeApiRequest3 = (ExecuteApiRequest) this.write;
        SafetyReportRepository$getSafetyReport$2 safetyReportRepository$getSafetyReport$4 = new SafetyReportRepository$getSafetyReport$2(this, jLongValue3, null, 0);
        safetyReportRepository$getSafetyReport$1.read = 1;
        objM4875invokegIAlus = executeApiRequest3.m4875invokegIAlus(safetyReportRepository$getSafetyReport$4, safetyReportRepository$getSafetyReport$1);
        if (objM4875invokegIAlus == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM4875invokegIAlus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r1.booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r5 == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.getLastDeeplink IconCompatParcelizer(com.roadrunner.realtime.domain.GetAppStateImpl r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r5.getClass()
            java.lang.Object r5 = r5.serializer
            o.getBitmapui_graphics r5 = (o.getBitmapui_graphics) r5
            java.lang.Object r1 = r4.serializer
            o.disableCoppaComplianceInDelay r1 = (o.disableCoppaComplianceInDelay) r1
            boolean r1 = r1.IconCompatParcelizer()
            if (r1 == 0) goto L49
            java.lang.String r1 = "BACKGROUND_LOCATION_REQUESTED"
            java.lang.Object r5 = r5.write(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L3b
            int r1 = com.sentiance.core.model.events.C$b.read
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L32
            boolean r5 = r5.booleanValue()
            r0 = 33
            int r0 = r0 / 0
            goto L36
        L32:
            boolean r5 = r5.booleanValue()
        L36:
            if (r5 == 0) goto L3b
            o.initSdk r5 = o.initSdk.RemoteActionCompatParcelizer
            return r5
        L3b:
            o.setReferrer r5 = o.setReferrer.BACKGROUND_LOCATION
            o.getSdkVersion r0 = new o.getSdkVersion
            r1 = 2131231460(0x7f0802e4, float:1.8079002E38)
            r2 = 2132019049(0x7f140769, float:1.9676422E38)
            r0.<init>(r5, r1, r2)
            return r0
        L49:
            java.lang.Object r1 = r4.write
            o.setEventDeduplicationIdsMaxSize r1 = (o.setEventDeduplicationIdsMaxSize) r1
            boolean r1 = r1.write()
            if (r1 == 0) goto L82
            java.lang.String r1 = "ACTIVITY_RECOGNITION_REQUESTED"
            java.lang.Object r1 = r5.write(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L74
            int r2 = com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer
            int r2 = r2 + 125
            int r3 = r2 % 128
            com.sentiance.core.model.events.C$b.read = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L6f
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L82
            goto L74
        L6f:
            r1.booleanValue()
            r5 = 0
            throw r5
        L74:
            o.setReferrer r5 = o.setReferrer.ACTIVITY_RECOGNITION
            o.getSdkVersion r0 = new o.getSdkVersion
            r1 = 2131231371(0x7f08028b, float:1.8078821E38)
            r2 = 2132019071(0x7f14077f, float:1.9676467E38)
            r0.<init>(r5, r1, r2)
            return r0
        L82:
            java.lang.Object r1 = r4.IconCompatParcelizer
            o.enablePlayStoreKidsComplianceInDelay r1 = (o.enablePlayStoreKidsComplianceInDelay) r1
            boolean r1 = r1.IconCompatParcelizer()
            if (r1 == 0) goto Lb3
            java.lang.String r1 = "DISABLE_BATTERY_OPTIMIZATION_REQUESTED"
            java.lang.Object r5 = r5.write(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto La5
            boolean r5 = r5.booleanValue()
            int r1 = com.sentiance.core.model.events.C$b.read
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r5 != 0) goto Lb3
        La5:
            o.setReferrer r5 = o.setReferrer.DISABLE_BATTERY_OPTIMIZATION
            o.getSdkVersion r0 = new o.getSdkVersion
            r1 = 2131231367(0x7f080287, float:1.8078813E38)
            r2 = 2132019052(0x7f14076c, float:1.9676428E38)
            r0.<init>(r5, r1, r2)
            return r0
        Lb3:
            o.initSdk r5 = o.initSdk.read
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.C$b.IconCompatParcelizer(com.roadrunner.realtime.domain.GetAppStateImpl):o.getLastDeeplink");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        return new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl) r6.serializer).IconCompatParcelizer(), r1.write(), new com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1(r2, 5, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (((com.roadrunner.home.state.data.RiderStateRepositoryImpl) ((o.dispatchChildDetached) r6.IconCompatParcelizer)).write() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (((com.roadrunner.home.state.data.RiderStateRepositoryImpl) ((o.dispatchChildDetached) r6.IconCompatParcelizer)).write() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r3 = new com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1(r1.write(), r2);
        r1 = com.sentiance.core.model.events.C$b.read + 57;
        com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.Flow read() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.sentiance.core.model.events.C$b.read = r2
            int r1 = r1 % r0
            r2 = 3
            if (r1 != 0) goto L24
            java.lang.Object r1 = r6.write
            com.roadrunner.delivery.repository.CachedDeliveryRepository r1 = (com.roadrunner.delivery.repository.CachedDeliveryRepository) r1
            java.lang.Object r3 = r6.IconCompatParcelizer
            o.dispatchChildDetached r3 = (o.dispatchChildDetached) r3
            com.roadrunner.home.state.data.RiderStateRepositoryImpl r3 = (com.roadrunner.home.state.data.RiderStateRepositoryImpl) r3
            boolean r3 = r3.write()
            r4 = 87
            int r4 = r4 / 0
            if (r3 == 0) goto L47
            goto L34
        L24:
            java.lang.Object r1 = r6.write
            com.roadrunner.delivery.repository.CachedDeliveryRepository r1 = (com.roadrunner.delivery.repository.CachedDeliveryRepository) r1
            java.lang.Object r3 = r6.IconCompatParcelizer
            o.dispatchChildDetached r3 = (o.dispatchChildDetached) r3
            com.roadrunner.home.state.data.RiderStateRepositoryImpl r3 = (com.roadrunner.home.state.data.RiderStateRepositoryImpl) r3
            boolean r3 = r3.write()
            if (r3 == 0) goto L47
        L34:
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = r1.write()
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1 r3 = new com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1
            r3.<init>(r1, r2)
            int r1 = com.sentiance.core.model.events.C$b.read
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.sentiance.core.model.events.C$b.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r3
        L47:
            java.lang.Object r0 = r6.serializer
            com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl r0 = (com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl) r0
            com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1 r0 = r0.IconCompatParcelizer()
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = r1.write()
            com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1 r3 = new com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1
            r4 = 5
            r5 = 0
            r3.<init>(r2, r4, r5)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 r2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.C$b.read():kotlinx.coroutines.flow.Flow");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f A[PHI: r8
  0x009f: PHI (r8v3 java.lang.Object) = (r8v2 java.lang.Object), (r8v2 java.lang.Object), (r8v5 java.lang.Object) binds: [B:27:0x0086, B:29:0x009c, B:21:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m5075invokegIAlus(handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda1, ContinuationImpl continuationImpl) {
        StartWorkingUseCase$invoke$1 startWorkingUseCase$invoke$1;
        Object objM5070startWorkinggIAlus;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        int i = 2 % 2;
        FetchRiderStatusImpl fetchRiderStatusImpl = (FetchRiderStatusImpl) this.write;
        if (continuationImpl instanceof StartWorkingUseCase$invoke$1) {
            int i2 = read + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            startWorkingUseCase$invoke$1 = (StartWorkingUseCase$invoke$1) continuationImpl;
            int i4 = startWorkingUseCase$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 65;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                startWorkingUseCase$invoke$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                startWorkingUseCase$invoke$1 = new StartWorkingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            startWorkingUseCase$invoke$1 = new StartWorkingUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = startWorkingUseCase$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = startWorkingUseCase$invoke$1.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StartWorkingRepository startWorkingRepository = (StartWorkingRepository) this.serializer;
            startWorkingUseCase$invoke$1.serializer = 1;
            objM5070startWorkinggIAlus = startWorkingRepository.m5070startWorkinggIAlus(handleinternalbannerrefreshlambda1, startWorkingUseCase$invoke$1);
            if (objM5070startWorkinggIAlus != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5070startWorkinggIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            if (i7 != 2) {
                int i8 = RemoteActionCompatParcelizer + 95;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0 ? i7 != 3 : i7 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = startWorkingUseCase$invoke$1.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((onItemDismiss) obj).getClass();
                return obj2;
            }
            objM5070startWorkinggIAlus = startWorkingUseCase$invoke$1.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((onItemDismiss) obj).getClass();
        }
        if (onItemDismiss.serializer(objM5070startWorkinggIAlus) != null) {
            firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.IconCompatParcelizer);
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED)) {
                startWorkingUseCase$invoke$1.read = objM5070startWorkinggIAlus;
                startWorkingUseCase$invoke$1.serializer = 3;
                if (fetchRiderStatusImpl.m5029invokeIoAF18A(startWorkingUseCase$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return objM5070startWorkinggIAlus;
        if (objM5070startWorkinggIAlus instanceof isItemDismissable) {
            if (onItemDismiss.serializer(objM5070startWorkinggIAlus) != null) {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.IconCompatParcelizer);
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED)) {
                    startWorkingUseCase$invoke$1.read = objM5070startWorkinggIAlus;
                    startWorkingUseCase$invoke$1.serializer = 3;
                    if (fetchRiderStatusImpl.m5029invokeIoAF18A(startWorkingUseCase$invoke$1) == coroutineSingletons) {
                    }
                }
            }
            return objM5070startWorkinggIAlus;
        }
        int i9 = RemoteActionCompatParcelizer + 95;
        read = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        startWorkingUseCase$invoke$1.read = objM5070startWorkinggIAlus;
        startWorkingUseCase$invoke$1.serializer = 2;
        if (fetchRiderStatusImpl.m5029invokeIoAF18A(startWorkingUseCase$invoke$1) != coroutineSingletons) {
            if (onItemDismiss.serializer(objM5070startWorkinggIAlus) != null) {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.IconCompatParcelizer);
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_REFRESH_STATE_ON_START_WORKING_FAILURE_ENABLED)) {
                    startWorkingUseCase$invoke$1.read = objM5070startWorkinggIAlus;
                    startWorkingUseCase$invoke$1.serializer = 3;
                    if (fetchRiderStatusImpl.m5029invokeIoAF18A(startWorkingUseCase$invoke$1) == coroutineSingletons) {
                    }
                }
            }
            return objM5070startWorkinggIAlus;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX INFO: renamed from: invoke-bMdYcbs$implementation, reason: not valid java name */
    public Object m5074invokebMdYcbs$implementation(String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        CreateAccountUseCase$invoke$1 createAccountUseCase$invoke$1;
        Object objM5141createAccountbMdYcbs$implementation;
        int i = 2 % 2;
        AccountCreationLogger accountCreationLogger = (AccountCreationLogger) this.write;
        if (continuationImpl instanceof CreateAccountUseCase$invoke$1) {
            int i2 = RemoteActionCompatParcelizer + 49;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            createAccountUseCase$invoke$1 = (CreateAccountUseCase$invoke$1) continuationImpl;
            int i4 = createAccountUseCase$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                createAccountUseCase$invoke$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                createAccountUseCase$invoke$1 = new CreateAccountUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createAccountUseCase$invoke$1 = new CreateAccountUseCase$invoke$1(this, continuationImpl);
        }
        CreateAccountUseCase$invoke$1 createAccountUseCase$invoke$2 = createAccountUseCase$invoke$1;
        int i5 = RemoteActionCompatParcelizer + 51;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj = createAccountUseCase$invoke$2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = createAccountUseCase$invoke$2.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NetworkBody networkBody = (NetworkBody) this.serializer;
            createAccountUseCase$invoke$2.serializer = 1;
            objM5141createAccountbMdYcbs$implementation = networkBody.m5141createAccountbMdYcbs$implementation(str, str2, str3, str4, str5, str6, createAccountUseCase$invoke$2);
            if (objM5141createAccountbMdYcbs$implementation == coroutineSingletons) {
                int i8 = RemoteActionCompatParcelizer + 103;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5141createAccountbMdYcbs$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM5141createAccountbMdYcbs$implementation instanceof isItemDismissable)) {
            accountCreationLogger.RemoteActionCompatParcelizer.logEvent("account_creation_success", null);
            String string = ((getOrNull) this.IconCompatParcelizer).serializer.getString(R.string.adjust_event_token_account_created);
            string.getClass();
            if (string.length() > 0) {
                Adjust.trackEvent(new AdjustEvent(string));
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5141createAccountbMdYcbs$implementation);
        if (thSerializer != null) {
            accountCreationLogger.getClass();
            accountCreationLogger.RemoteActionCompatParcelizer.logEvent("account_creation_fail", accountCreationLogger.write(thSerializer));
            Timber.RemoteActionCompatParcelizer.write(new AccountCreationException(thSerializer));
        }
        return objM5141createAccountbMdYcbs$implementation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r12 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        if (r0 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        r10 = r0;
        r0 = r12;
        r12 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke$implementation(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.core.model.events.C$b.invoke$implementation(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public C$b() {
    }
}
