package io.grpc;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.freelancing.presentation.map.GetFreelancingMapLayer$invoke$1$1;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import com.roadrunner.rider.state.provider.domain.SaveWorkOpportunities;
import com.roadrunner.rider.state.provider.domain.mapper.UnknownStatusActionTypeException;
import com.roadrunner.rider.state.quests.data.QuestsCache;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.user.properties.domain.SaveUserPropertiesUseCaseImpl;
import io.grpc.internal.ServiceConfigUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustDeeplink;
import o.AndroidUiFrameClock;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.GooglePlayInstallReferrerDetails;
import o.IActivityHandler;
import o.OnIsEnabledListener;
import o.PackageBuilder;
import o.ShortNewsContentCardView;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.accessgetInstancedelegatecp;
import o.accessgetSystemHomecp;
import o.addBoolean;
import o.asBinder;
import o.buildSubscriptionPackage;
import o.createFromParcel;
import o.createProxyInstallReferrerStateListener;
import o.div7Ah8Wj8;
import o.f8;
import o.f9;
import o.g5;
import o.gExternalSyntheticLambda1;
import o.getActionList;
import o.getDeduplicationId;
import o.getInstallReferrer;
import o.getInstallReferrerStateListenerClass;
import o.getQueryParameterslambda2;
import o.getReferrer;
import o.injectStoreInfoToParameters;
import o.instance_delegatelambda0;
import o.isInfiniteannotations;
import o.lockLogLevel;
import o.o7ExternalSyntheticLambda3;
import o.onContentCardDismissed;
import o.onRemoteTrigger;
import o.onThirdPartySharingSettingsRead;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs;
import o.r8lambdavtysCT7TkpE9w0sgzt7Axv0AiUQ;
import o.se;
import o.setLastHorizontalStyle;
import o.shouldDumpInternalState;
import o.supportsColorMatrixQuery;
import o.t2ExternalSyntheticLambda1;
import o.toBitmapConfig1JJdX4A;
import o.v4;
import o.vg;
import o.warn;
import o.x0;
import o.x4;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class CallOptions$Builder implements r8lambdavtysCT7TkpE9w0sgzt7Axv0AiUQ {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public Object IconCompatParcelizer;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public /* synthetic */ CallOptions$Builder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.write = obj4;
        this.MediaMetadataCompat = obj5;
        this.RatingCompat = obj6;
        this.IconCompatParcelizer = obj7;
        this.MediaSessionCompatQueueItem = obj8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1.serializer(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r1.serializer(r3);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(androidx.drawerlayout.widget.DrawerLayout.write(8388611), "No drawer view found with gravity ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = io.grpc.CallOptions$Builder.MediaDescriptionCompat + 1;
        io.grpc.CallOptions$Builder.MediaBrowserCompatMediaItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializer() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = io.grpc.CallOptions$Builder.MediaBrowserCompatMediaItem
            int r1 = r1 + 101
            int r2 = r1 % 128
            io.grpc.CallOptions$Builder.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != 0) goto L20
            java.lang.Object r1 = r5.write
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            android.view.View r3 = r1.read(r2)
            r4 = 90
            int r4 = r4 / 0
            if (r3 == 0) goto L41
            goto L2a
        L20:
            java.lang.Object r1 = r5.write
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            android.view.View r3 = r1.read(r2)
            if (r3 == 0) goto L41
        L2a:
            int r2 = io.grpc.CallOptions$Builder.MediaDescriptionCompat
            int r2 = r2 + 1
            int r4 = r2 % 128
            io.grpc.CallOptions$Builder.MediaBrowserCompatMediaItem = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L39
            r1.serializer(r3)
            return
        L39:
            r1.serializer(r3)
            r0 = 0
            r0.hashCode()
            throw r0
        L41:
            java.lang.String r0 = androidx.drawerlayout.widget.DrawerLayout.write(r2)
            java.lang.String r1 = "No drawer view found with gravity "
            o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.CallOptions$Builder.serializer():void");
    }

    public static ArrayList IconCompatParcelizer(List list) {
        int i = 2 % 2;
        List<o7ExternalSyntheticLambda3> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : list2) {
            arrayList.add(new f8(o7externalsyntheticlambda3.read, o7externalsyntheticlambda3.write));
            int i2 = MediaBrowserCompatMediaItem + 29;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        return arrayList;
    }

    public void read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.read;
        Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag("com.roadrunner.sidemenu.presentation.SideMenuFragment");
        ShortNewsContentCardView shortNewsContentCardView = null;
        if ((!((fragmentFindFragmentByTag instanceof SideMenuFragment) ^ true) ? (SideMenuFragment) fragmentFindFragmentByTag : null) == null) {
            int i4 = accessgetSystemHomecp.read();
            SideMenuFragment sideMenuFragment = (SideMenuFragment) ServiceConfigUtil.RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), -1553495200, new Object[0], accessgetSystemHomecp.read(), accessgetSystemHomecp.read(), 1553495202, i4);
            isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
            isinfiniteannotations.IconCompatParcelizer(R.id.navigationView, sideMenuFragment, "com.roadrunner.sidemenu.presentation.SideMenuFragment");
            isinfiniteannotations.read();
            int i5 = MediaBrowserCompatMediaItem + 107;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs r8lambdagumkb96aaxyagqcnh2xmdxofas = (r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs) this.MediaMetadataCompat;
        r8lambdagumkb96aaxyagqcnh2xmdxofas.RemoteActionCompatParcelizer.IconCompatParcelizer("Side Menu", null);
        r8lambdagumkb96aaxyagqcnh2xmdxofas.write.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read((supportsColorMatrixQuery) this.RemoteActionCompatParcelizer), null, null, new RxConvertKt$asSingle$1(this, shortNewsContentCardView, 4), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object invoke(getInstallReferrer getinstallreferrer, ContinuationImpl continuationImpl) {
        addBoolean addboolean;
        String str;
        int i = 2 % 2;
        if (continuationImpl instanceof addBoolean) {
            addboolean = (addBoolean) continuationImpl;
            int i2 = addboolean.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaBrowserCompatMediaItem + 15;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                addboolean.serializer = i2 - Integer.MIN_VALUE;
            } else {
                addboolean = new addBoolean(this, continuationImpl);
            }
        } else {
            addboolean = new addBoolean(this, continuationImpl);
        }
        Object obj = addboolean.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = addboolean.serializer;
        Object obj3 = createFromParcel.INSTANCE;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            addboolean.IconCompatParcelizer = getinstallreferrer;
            addboolean.serializer = 1;
            warn warnVar = getinstallreferrer.legacyState;
            lockLogLevel lockloglevel = warnVar != null ? warnVar.courier : null;
            SaveUserPropertiesUseCaseImpl saveUserPropertiesUseCaseImpl = (SaveUserPropertiesUseCaseImpl) this.MediaMetadataCompat;
            if (lockloglevel != null) {
                int i6 = MediaBrowserCompatMediaItem + 87;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    String str2 = lockloglevel.contractType;
                    throw null;
                }
                str = lockloglevel.contractType;
            } else {
                str = null;
            }
            Object objInvoke = saveUserPropertiesUseCaseImpl.invoke(str, lockloglevel != null ? lockloglevel.city : null, lockloglevel != null ? new Integer(lockloglevel.cityId) : null, addboolean);
            if (objInvoke == obj2) {
                int i7 = MediaDescriptionCompat + 25;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                objInvoke = obj3;
            }
            if (objInvoke != obj2) {
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = MediaBrowserCompatMediaItem + 75;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj3;
        }
        getinstallreferrer = addboolean.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        addboolean.IconCompatParcelizer = null;
        addboolean.serializer = 2;
        return saveStatus(getinstallreferrer, addboolean) == obj2 ? obj2 : obj3;
    }

    public Flow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!((getActionList) this.RatingCompat).read()) {
            if (!((v4) this.IconCompatParcelizer).RemoteActionCompatParcelizer()) {
                return FlowKt.RemoteActionCompatParcelizer(((GetRiderStateImpl) this.RemoteActionCompatParcelizer).write(), ((vg) this.read).write, ((GetWorkNowOpportunity) this.write).IconCompatParcelizer(), ((CanRequestLocationUpdatesImpl) this.MediaMetadataCompat).serializer(), new GetFreelancingMapLayer$invoke$1$1(this, null, 1));
            }
            int i4 = MediaDescriptionCompat + 27;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(shouldDumpInternalState.read);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d1 -> B:29:0x00d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object getSubzonePolygons(java.util.List r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.CallOptions$Builder.getSubzonePolygons(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142 A[PHI: r2
  0x0142: PHI (r2v3 o.getInstallReferrer) = (r2v1 o.getInstallReferrer), (r2v4 o.getInstallReferrer) binds: [B:67:0x013e, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191 A[PHI: r2
  0x0191: PHI (r2v5 o.getInstallReferrer) = (r2v3 o.getInstallReferrer), (r2v3 o.getInstallReferrer), (r2v3 o.getInstallReferrer), (r2v13 o.getInstallReferrer) binds: [B:70:0x014a, B:83:0x018e, B:74:0x015d, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0195  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    public Object saveStatus(getInstallReferrer getinstallreferrer, ContinuationImpl continuationImpl) throws Throwable {
        PackageBuilder packageBuilder;
        String str;
        GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetailsValueOf;
        String str2;
        String str3;
        String str4;
        String str5;
        warn warnVar;
        Object objWithContext;
        List list;
        Object objWithContext2;
        CoroutineSingletons coroutineSingletons;
        SaveWorkOpportunities saveWorkOpportunities;
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection;
        Object objSerializer;
        CoroutineSingletons coroutineSingletons2;
        Object objSerializer2;
        CoroutineSingletons coroutineSingletons3;
        getInstallReferrer getinstallreferrer2 = getinstallreferrer;
        int i = 2;
        int i2 = 2 % 2;
        if (!(continuationImpl instanceof PackageBuilder)) {
            packageBuilder = new PackageBuilder(this, continuationImpl);
        } else {
            packageBuilder = (PackageBuilder) continuationImpl;
            int i3 = packageBuilder.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaBrowserCompatMediaItem + 23;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                packageBuilder.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                packageBuilder = new PackageBuilder(this, continuationImpl);
            }
        }
        Object obj = packageBuilder.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = packageBuilder.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i6) {
            case 0:
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                asBinder asbinder = (asBinder) this.serializer;
                createProxyInstallReferrerStateListener createproxyinstallreferrerstatelistener = getinstallreferrer2.status;
                createproxyinstallreferrerstatelistener.getClass();
                getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass = createproxyinstallreferrerstatelistener.action;
                if (getinstallreferrerstatelistenerclass != null) {
                    int i8 = MediaDescriptionCompat + 73;
                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        str5 = getinstallreferrerstatelistenerclass.type;
                        int i9 = 64 / 0;
                    } else {
                        str5 = getinstallreferrerstatelistenerclass.type;
                    }
                    str = str5;
                } else {
                    str = null;
                }
                if (str != null) {
                    try {
                        googlePlayInstallReferrerDetailsValueOf = GooglePlayInstallReferrerDetails.valueOf(str);
                    } catch (IllegalArgumentException e) {
                        Timber.RemoteActionCompatParcelizer.write(new UnknownStatusActionTypeException(ff$$ExternalSyntheticOutline0.m("Couldn't map ", str, " to a known state action"), e));
                        googlePlayInstallReferrerDetailsValueOf = GooglePlayInstallReferrerDetails.UNKNOWN_ACTION;
                    }
                    break;
                } else {
                    googlePlayInstallReferrerDetailsValueOf = null;
                }
                boolean z = googlePlayInstallReferrerDetailsValueOf != GooglePlayInstallReferrerDetails.UNKNOWN_ACTION;
                if (z) {
                    int i10 = MediaDescriptionCompat + 13;
                    int i11 = i10 % Fields.SpotShadowColor;
                    MediaBrowserCompatMediaItem = i11;
                    int i12 = i10 % 2;
                    if (getinstallreferrerstatelistenerclass != null) {
                        int i13 = i11 + 75;
                        MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            str4 = getinstallreferrerstatelistenerclass.text;
                            int i14 = 32 / 0;
                        } else {
                            str4 = getinstallreferrerstatelistenerclass.text;
                        }
                        str2 = str4;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (z) {
                    int i15 = MediaDescriptionCompat + 53;
                    MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    if (getinstallreferrerstatelistenerclass != null) {
                        str3 = getinstallreferrerstatelistenerclass.url;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = null;
                }
                OnIsEnabledListener onIsEnabledListener = new OnIsEnabledListener(0L, createproxyinstallreferrerstatelistener.type, createproxyinstallreferrerstatelistener.text, createproxyinstallreferrerstatelistener.description, googlePlayInstallReferrerDetailsValueOf, str2, str3, System.currentTimeMillis());
                packageBuilder.write = getinstallreferrer2;
                packageBuilder.RemoteActionCompatParcelizer = 1;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objWithContext3 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(asbinder, onIsEnabledListener, shortNewsContentCardView, 14), packageBuilder);
                if (objWithContext3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objWithContext3 = createfromparcel;
                }
                if (objWithContext3 != coroutineSingletons4) {
                    warnVar = getinstallreferrer2.legacyState;
                    if (warnVar != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Legacy state can't be null. With RAVL-2647 BE will make this field required and not optional");
                        return null;
                    }
                    onThirdPartySharingSettingsRead onthirdpartysharingsettingsread = (onThirdPartySharingSettingsRead) this.write;
                    packageBuilder.write = getinstallreferrer2;
                    packageBuilder.RemoteActionCompatParcelizer = 2;
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(onthirdpartysharingsettingsread, warnVar, shortNewsContentCardView, i7), packageBuilder);
                    if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objWithContext = createfromparcel;
                    }
                    if (objWithContext != coroutineSingletons4) {
                        if (((getActionList) this.MediaSessionCompatQueueItem).read()) {
                            swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                            if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                buildSubscriptionPackage buildsubscriptionpackage = (buildSubscriptionPackage) this.RatingCompat;
                                String string = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 5;
                                QuestsCache questsCache = buildsubscriptionpackage.serializer;
                                objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache.read.write(), new NafathTimerDataStore$set$2(questsCache, string, shortNewsContentCardView, 15), packageBuilder);
                                coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            } else {
                                injectStoreInfoToParameters injectstoreinfotoparameters = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 6;
                                objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            }
                        } else {
                            list = getinstallreferrer2.workOpportunities;
                            if (list != null) {
                                saveWorkOpportunities = (SaveWorkOpportunities) this.RemoteActionCompatParcelizer;
                                packageBuilder.write = getinstallreferrer2;
                                packageBuilder.RemoteActionCompatParcelizer = 3;
                                if (saveWorkOpportunities.invoke(list, packageBuilder) != coroutineSingletons4) {
                                    swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                                    if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                        buildSubscriptionPackage buildsubscriptionpackage2 = (buildSubscriptionPackage) this.RatingCompat;
                                        String string2 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                        packageBuilder.write = null;
                                        packageBuilder.RemoteActionCompatParcelizer = 5;
                                        QuestsCache questsCache2 = buildsubscriptionpackage2.serializer;
                                        objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache2.read.write(), new NafathTimerDataStore$set$2(questsCache2, string2, shortNewsContentCardView, 15), packageBuilder);
                                        coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        if (objSerializer2 != coroutineSingletons3) {
                                            objSerializer2 = createfromparcel;
                                        }
                                        if (objSerializer2 != coroutineSingletons3) {
                                            objSerializer2 = createfromparcel;
                                        }
                                        if (objSerializer2 != coroutineSingletons4) {
                                            return createfromparcel;
                                        }
                                    } else {
                                        injectStoreInfoToParameters injectstoreinfotoparameters2 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                        packageBuilder.write = null;
                                        packageBuilder.RemoteActionCompatParcelizer = 6;
                                        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters2.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                        coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        if (objSerializer != coroutineSingletons2) {
                                            objSerializer = createfromparcel;
                                        }
                                        if (objSerializer != coroutineSingletons2) {
                                            objSerializer = createfromparcel;
                                        }
                                        if (objSerializer != coroutineSingletons4) {
                                            return createfromparcel;
                                        }
                                    }
                                }
                            } else {
                                onRemoteTrigger onremotetrigger = (onRemoteTrigger) this.read;
                                packageBuilder.write = getinstallreferrer2;
                                packageBuilder.RemoteActionCompatParcelizer = 4;
                                IActivityHandler iActivityHandler = onremotetrigger.RemoteActionCompatParcelizer;
                                DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(iActivityHandler, shortNewsContentCardView, 25), packageBuilder);
                                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objWithContext2 != coroutineSingletons) {
                                    objWithContext2 = createfromparcel;
                                }
                                if (objWithContext2 == coroutineSingletons) {
                                    int i16 = MediaDescriptionCompat + 69;
                                    MediaBrowserCompatMediaItem = i16 % Fields.SpotShadowColor;
                                    int i17 = i16 % 2;
                                } else {
                                    objWithContext2 = createfromparcel;
                                }
                                if (objWithContext2 != coroutineSingletons4) {
                                    swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                                    if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                        buildSubscriptionPackage buildsubscriptionpackage3 = (buildSubscriptionPackage) this.RatingCompat;
                                        String string3 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                        packageBuilder.write = null;
                                        packageBuilder.RemoteActionCompatParcelizer = 5;
                                        QuestsCache questsCache3 = buildsubscriptionpackage3.serializer;
                                        objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache3.read.write(), new NafathTimerDataStore$set$2(questsCache3, string3, shortNewsContentCardView, 15), packageBuilder);
                                        coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        if (objSerializer2 != coroutineSingletons3) {
                                            objSerializer2 = createfromparcel;
                                        }
                                        if (objSerializer2 != coroutineSingletons3) {
                                            objSerializer2 = createfromparcel;
                                        }
                                        if (objSerializer2 != coroutineSingletons4) {
                                            return createfromparcel;
                                        }
                                    } else {
                                        injectStoreInfoToParameters injectstoreinfotoparameters3 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                        packageBuilder.write = null;
                                        packageBuilder.RemoteActionCompatParcelizer = 6;
                                        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters3.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                        coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        if (objSerializer != coroutineSingletons2) {
                                            objSerializer = createfromparcel;
                                        }
                                        if (objSerializer != coroutineSingletons2) {
                                            objSerializer = createfromparcel;
                                        }
                                        if (objSerializer != coroutineSingletons4) {
                                            return createfromparcel;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons4;
            case 1:
                getinstallreferrer2 = packageBuilder.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                warnVar = getinstallreferrer2.legacyState;
                if (warnVar != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Legacy state can't be null. With RAVL-2647 BE will make this field required and not optional");
                    return null;
                }
                onThirdPartySharingSettingsRead onthirdpartysharingsettingsread2 = (onThirdPartySharingSettingsRead) this.write;
                packageBuilder.write = getinstallreferrer2;
                packageBuilder.RemoteActionCompatParcelizer = 2;
                DefaultScheduler defaultScheduler4 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(onthirdpartysharingsettingsread2, warnVar, shortNewsContentCardView, i7), packageBuilder);
                if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objWithContext = createfromparcel;
                }
                if (objWithContext != coroutineSingletons4) {
                    if (((getActionList) this.MediaSessionCompatQueueItem).read()) {
                        swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                        if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                            buildSubscriptionPackage buildsubscriptionpackage4 = (buildSubscriptionPackage) this.RatingCompat;
                            String string4 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                            packageBuilder.write = null;
                            packageBuilder.RemoteActionCompatParcelizer = 5;
                            QuestsCache questsCache4 = buildsubscriptionpackage4.serializer;
                            objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache4.read.write(), new NafathTimerDataStore$set$2(questsCache4, string4, shortNewsContentCardView, 15), packageBuilder);
                            coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objSerializer2 != coroutineSingletons3) {
                                objSerializer2 = createfromparcel;
                            }
                            if (objSerializer2 != coroutineSingletons3) {
                                objSerializer2 = createfromparcel;
                            }
                            if (objSerializer2 != coroutineSingletons4) {
                                return createfromparcel;
                            }
                        } else {
                            injectStoreInfoToParameters injectstoreinfotoparameters4 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                            packageBuilder.write = null;
                            packageBuilder.RemoteActionCompatParcelizer = 6;
                            objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters4.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                            coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objSerializer != coroutineSingletons2) {
                                objSerializer = createfromparcel;
                            }
                            if (objSerializer != coroutineSingletons2) {
                                objSerializer = createfromparcel;
                            }
                            if (objSerializer != coroutineSingletons4) {
                                return createfromparcel;
                            }
                        }
                    } else {
                        list = getinstallreferrer2.workOpportunities;
                        if (list != null) {
                            saveWorkOpportunities = (SaveWorkOpportunities) this.RemoteActionCompatParcelizer;
                            packageBuilder.write = getinstallreferrer2;
                            packageBuilder.RemoteActionCompatParcelizer = 3;
                            if (saveWorkOpportunities.invoke(list, packageBuilder) != coroutineSingletons4) {
                                swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                                if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                    buildSubscriptionPackage buildsubscriptionpackage5 = (buildSubscriptionPackage) this.RatingCompat;
                                    String string5 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                    packageBuilder.write = null;
                                    packageBuilder.RemoteActionCompatParcelizer = 5;
                                    QuestsCache questsCache5 = buildsubscriptionpackage5.serializer;
                                    objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache5.read.write(), new NafathTimerDataStore$set$2(questsCache5, string5, shortNewsContentCardView, 15), packageBuilder);
                                    coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (objSerializer2 != coroutineSingletons3) {
                                        objSerializer2 = createfromparcel;
                                    }
                                    if (objSerializer2 != coroutineSingletons3) {
                                        objSerializer2 = createfromparcel;
                                    }
                                    if (objSerializer2 != coroutineSingletons4) {
                                        return createfromparcel;
                                    }
                                } else {
                                    injectStoreInfoToParameters injectstoreinfotoparameters5 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                    packageBuilder.write = null;
                                    packageBuilder.RemoteActionCompatParcelizer = 6;
                                    objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters5.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                    coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (objSerializer != coroutineSingletons2) {
                                        objSerializer = createfromparcel;
                                    }
                                    if (objSerializer != coroutineSingletons2) {
                                        objSerializer = createfromparcel;
                                    }
                                    if (objSerializer != coroutineSingletons4) {
                                        return createfromparcel;
                                    }
                                }
                            }
                        } else {
                            onRemoteTrigger onremotetrigger2 = (onRemoteTrigger) this.read;
                            packageBuilder.write = getinstallreferrer2;
                            packageBuilder.RemoteActionCompatParcelizer = 4;
                            IActivityHandler iActivityHandler2 = onremotetrigger2.RemoteActionCompatParcelizer;
                            DefaultScheduler defaultScheduler5 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(iActivityHandler2, shortNewsContentCardView, 25), packageBuilder);
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objWithContext2 != coroutineSingletons) {
                                objWithContext2 = createfromparcel;
                            }
                            if (objWithContext2 == coroutineSingletons) {
                                int i18 = MediaDescriptionCompat + 69;
                                MediaBrowserCompatMediaItem = i18 % Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                            } else {
                                objWithContext2 = createfromparcel;
                            }
                            if (objWithContext2 != coroutineSingletons4) {
                                swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                                if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                    buildSubscriptionPackage buildsubscriptionpackage6 = (buildSubscriptionPackage) this.RatingCompat;
                                    String string6 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                    packageBuilder.write = null;
                                    packageBuilder.RemoteActionCompatParcelizer = 5;
                                    QuestsCache questsCache6 = buildsubscriptionpackage6.serializer;
                                    objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache6.read.write(), new NafathTimerDataStore$set$2(questsCache6, string6, shortNewsContentCardView, 15), packageBuilder);
                                    coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (objSerializer2 != coroutineSingletons3) {
                                        objSerializer2 = createfromparcel;
                                    }
                                    if (objSerializer2 != coroutineSingletons3) {
                                        objSerializer2 = createfromparcel;
                                    }
                                    if (objSerializer2 != coroutineSingletons4) {
                                        return createfromparcel;
                                    }
                                } else {
                                    injectStoreInfoToParameters injectstoreinfotoparameters6 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                    packageBuilder.write = null;
                                    packageBuilder.RemoteActionCompatParcelizer = 6;
                                    objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters6.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                    coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    if (objSerializer != coroutineSingletons2) {
                                        objSerializer = createfromparcel;
                                    }
                                    if (objSerializer != coroutineSingletons2) {
                                        objSerializer = createfromparcel;
                                    }
                                    if (objSerializer != coroutineSingletons4) {
                                        return createfromparcel;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons4;
            case 2:
                getinstallreferrer2 = packageBuilder.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((getActionList) this.MediaSessionCompatQueueItem).read()) {
                    swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                    if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                        buildSubscriptionPackage buildsubscriptionpackage7 = (buildSubscriptionPackage) this.RatingCompat;
                        String string7 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                        packageBuilder.write = null;
                        packageBuilder.RemoteActionCompatParcelizer = 5;
                        QuestsCache questsCache7 = buildsubscriptionpackage7.serializer;
                        objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache7.read.write(), new NafathTimerDataStore$set$2(questsCache7, string7, shortNewsContentCardView, 15), packageBuilder);
                        coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objSerializer2 != coroutineSingletons3) {
                            objSerializer2 = createfromparcel;
                        }
                        if (objSerializer2 != coroutineSingletons3) {
                            objSerializer2 = createfromparcel;
                        }
                        if (objSerializer2 != coroutineSingletons4) {
                            return createfromparcel;
                        }
                    } else {
                        injectStoreInfoToParameters injectstoreinfotoparameters7 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                        packageBuilder.write = null;
                        packageBuilder.RemoteActionCompatParcelizer = 6;
                        objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters7.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                        coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objSerializer != coroutineSingletons2) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons2) {
                            objSerializer = createfromparcel;
                        }
                        if (objSerializer != coroutineSingletons4) {
                            return createfromparcel;
                        }
                    }
                } else {
                    list = getinstallreferrer2.workOpportunities;
                    if (list != null) {
                        saveWorkOpportunities = (SaveWorkOpportunities) this.RemoteActionCompatParcelizer;
                        packageBuilder.write = getinstallreferrer2;
                        packageBuilder.RemoteActionCompatParcelizer = 3;
                        if (saveWorkOpportunities.invoke(list, packageBuilder) != coroutineSingletons4) {
                            swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                            if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                buildSubscriptionPackage buildsubscriptionpackage8 = (buildSubscriptionPackage) this.RatingCompat;
                                String string8 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 5;
                                QuestsCache questsCache8 = buildsubscriptionpackage8.serializer;
                                objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache8.read.write(), new NafathTimerDataStore$set$2(questsCache8, string8, shortNewsContentCardView, 15), packageBuilder);
                                coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            } else {
                                injectStoreInfoToParameters injectstoreinfotoparameters8 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 6;
                                objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters8.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            }
                        }
                    } else {
                        onRemoteTrigger onremotetrigger3 = (onRemoteTrigger) this.read;
                        packageBuilder.write = getinstallreferrer2;
                        packageBuilder.RemoteActionCompatParcelizer = 4;
                        IActivityHandler iActivityHandler3 = onremotetrigger3.RemoteActionCompatParcelizer;
                        DefaultScheduler defaultScheduler6 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(iActivityHandler3, shortNewsContentCardView, 25), packageBuilder);
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objWithContext2 != coroutineSingletons) {
                            objWithContext2 = createfromparcel;
                        }
                        if (objWithContext2 == coroutineSingletons) {
                            int i110 = MediaDescriptionCompat + 69;
                            MediaBrowserCompatMediaItem = i110 % Fields.SpotShadowColor;
                            int i111 = i110 % 2;
                        } else {
                            objWithContext2 = createfromparcel;
                        }
                        if (objWithContext2 != coroutineSingletons4) {
                            swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                            if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                                buildSubscriptionPackage buildsubscriptionpackage9 = (buildSubscriptionPackage) this.RatingCompat;
                                String string9 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 5;
                                QuestsCache questsCache9 = buildsubscriptionpackage9.serializer;
                                objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache9.read.write(), new NafathTimerDataStore$set$2(questsCache9, string9, shortNewsContentCardView, 15), packageBuilder);
                                coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons3) {
                                    objSerializer2 = createfromparcel;
                                }
                                if (objSerializer2 != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            } else {
                                injectStoreInfoToParameters injectstoreinfotoparameters9 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                                packageBuilder.write = null;
                                packageBuilder.RemoteActionCompatParcelizer = 6;
                                objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters9.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                                coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons2) {
                                    objSerializer = createfromparcel;
                                }
                                if (objSerializer != coroutineSingletons4) {
                                    return createfromparcel;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons4;
            case 3:
            case 4:
                getinstallreferrer2 = packageBuilder.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                swipeDismissTouchListenerVerticalDismissDirection = getinstallreferrer2.questInfo;
                if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                    injectStoreInfoToParameters injectstoreinfotoparameters10 = (injectStoreInfoToParameters) this.IconCompatParcelizer;
                    packageBuilder.write = null;
                    packageBuilder.RemoteActionCompatParcelizer = 6;
                    objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) injectstoreinfotoparameters10.IconCompatParcelizer.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), packageBuilder);
                    coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (objSerializer != coroutineSingletons2) {
                        objSerializer = createfromparcel;
                    }
                    if (objSerializer != coroutineSingletons2) {
                        objSerializer = createfromparcel;
                    }
                    if (objSerializer != coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    return createfromparcel;
                }
                buildSubscriptionPackage buildsubscriptionpackage10 = (buildSubscriptionPackage) this.RatingCompat;
                String string10 = swipeDismissTouchListenerVerticalDismissDirection.toString();
                packageBuilder.write = null;
                packageBuilder.RemoteActionCompatParcelizer = 5;
                QuestsCache questsCache10 = buildsubscriptionpackage10.serializer;
                objSerializer2 = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache10.read.write(), new NafathTimerDataStore$set$2(questsCache10, string10, shortNewsContentCardView, 15), packageBuilder);
                coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objSerializer2 != coroutineSingletons3) {
                    objSerializer2 = createfromparcel;
                }
                if (objSerializer2 != coroutineSingletons3) {
                    objSerializer2 = createfromparcel;
                }
                if (objSerializer2 != coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                return createfromparcel;
            case 5:
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 6:
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r5 r8
  0x0035: PHI (r5v11 o.x4) = (r5v10 o.x4), (r5v13 o.x4) binds: [B:10:0x0033, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r8v9 int) = (r8v8 int), (r8v11 int) binds: [B:10:0x0033, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [io.grpc.CallOptions$Builder] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v31 */
    public static final Object access$getMapLayer(CallOptions$Builder callOptions$Builder, AdjustDeeplink adjustDeeplink, se seVar, ContinuationImpl continuationImpl) throws Throwable {
        x4 x4Var;
        ArrayList arrayListWrite;
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda1;
        boolean z;
        boolean zRemoteActionCompatParcelizer;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda1;
        Object subzonePolygons;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda2;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda3;
        ArrayList arrayList;
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda2;
        int i;
        List arrayList2;
        ?? r2;
        int i2;
        List list;
        int i3;
        int i4 = 2 % 2;
        v4 v4Var = (v4) callOptions$Builder.MediaMetadataCompat;
        if (continuationImpl instanceof x4) {
            int i5 = MediaBrowserCompatMediaItem + 71;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                x4Var = (x4) continuationImpl;
                i3 = x4Var.MediaMetadataCompat;
                int i6 = 51 / 0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    x4Var.MediaMetadataCompat = i3 - Integer.MIN_VALUE;
                } else {
                    x4Var = new x4(callOptions$Builder, continuationImpl);
                }
            } else {
                x4Var = (x4) continuationImpl;
                i3 = x4Var.MediaMetadataCompat;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    x4Var.MediaMetadataCompat = i3 - Integer.MIN_VALUE;
                } else {
                    x4Var = new x4(callOptions$Builder, continuationImpl);
                }
            }
        } else {
            x4Var = new x4(callOptions$Builder, continuationImpl);
        }
        Object obj = x4Var.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = x4Var.MediaMetadataCompat;
        List list2 = instance_delegatelambda0.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            List list3 = adjustDeeplink.read.MediaDescriptionCompat;
            if (list3 != null) {
                getReferrer getreferrer = (getReferrer) onContentCardDismissed.MediaMetadataCompat(list3);
                if (getreferrer != null) {
                    getDeduplicationId getdeduplicationid = getreferrer.MediaDescriptionCompat;
                    if (getdeduplicationid == getDeduplicationId.NEXT) {
                        return new f9(list2);
                    }
                    String str = getreferrer.PlaybackStateCompat;
                    if (str != null) {
                        try {
                            ((AndroidUiFrameClock) callOptions$Builder.MediaSessionCompatQueueItem).getClass();
                            arrayListWrite = AndroidUiFrameClock.write(str);
                        } catch (Exception unused) {
                            arrayListWrite = null;
                        }
                        if (arrayListWrite == null || arrayListWrite.isEmpty()) {
                            arrayListWrite = null;
                        }
                    } else {
                        arrayListWrite = null;
                    }
                    Long l = getreferrer.ParcelableVolumeInfo;
                    if (l != null) {
                        t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) seVar.RemoteActionCompatParcelizer.get(new Integer((int) l.longValue()));
                    } else {
                        t2externalsyntheticlambda1 = null;
                    }
                    if (arrayListWrite == null && t2externalsyntheticlambda1 == null) {
                        return new f9(list2);
                    }
                    if (((getActionList) callOptions$Builder.RatingCompat).read()) {
                        int i8 = MediaBrowserCompatMediaItem + 37;
                        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (getreferrer.MediaBrowserCompatMediaItem) {
                            int i10 = MediaBrowserCompatMediaItem + 115;
                            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    int[] iArr = x0.RemoteActionCompatParcelizer;
                    int i12 = iArr[getdeduplicationid.ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        zRemoteActionCompatParcelizer = z || !(v4Var.RemoteActionCompatParcelizer() ^ true);
                    } else {
                        int i13 = MediaBrowserCompatMediaItem + 31;
                        MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                        } else {
                            zRemoteActionCompatParcelizer = v4Var.RemoteActionCompatParcelizer();
                        }
                    }
                    baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
                    if (t2externalsyntheticlambda1 != null) {
                        x4Var.RemoteActionCompatParcelizer = arrayListWrite;
                        x4Var.serializer = t2externalsyntheticlambda1;
                        x4Var.write = baseContentCardViewExternalSyntheticLambda0;
                        x4Var.read = baseContentCardViewExternalSyntheticLambda0;
                        x4Var.MediaBrowserCompatMediaItem = baseContentCardViewExternalSyntheticLambda0;
                        x4Var.IconCompatParcelizer = zRemoteActionCompatParcelizer ? 1 : 0;
                        x4Var.MediaMetadataCompat = 1;
                        if (v4Var.RemoteActionCompatParcelizer()) {
                            int i15 = iArr[getdeduplicationid.ordinal()];
                            if (i15 != 1) {
                                int i16 = MediaDescriptionCompat + 65;
                                MediaBrowserCompatMediaItem = i16 % Fields.SpotShadowColor;
                                if (i16 % 2 == 0 ? i15 == 2 : i15 == 4) {
                                    arrayList2 = t2externalsyntheticlambda1.RatingCompat;
                                    if (arrayList2 == null) {
                                        arrayList2 = list2;
                                    }
                                } else if (i15 != 3) {
                                    if (i15 != 4) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    arrayList2 = list2;
                                } else {
                                    Collection collectionValues = seVar.RemoteActionCompatParcelizer.values();
                                    arrayList2 = new ArrayList();
                                    Iterator it = collectionValues.iterator();
                                    while (it.hasNext()) {
                                        List list4 = ((t2ExternalSyntheticLambda1) it.next()).RatingCompat;
                                        if (list4 == null) {
                                            list4 = list2;
                                        }
                                        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) list4, (Collection) arrayList2);
                                    }
                                }
                            } else {
                                arrayList2 = t2externalsyntheticlambda1.RatingCompat;
                                if (arrayList2 == null) {
                                    arrayList2 = list2;
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                subzonePolygons = list2;
                            } else {
                                subzonePolygons = callOptions$Builder.getSubzonePolygons(arrayList2, x4Var);
                            }
                        } else {
                            subzonePolygons = list2;
                        }
                        if (subzonePolygons == coroutineSingletons) {
                            int i17 = MediaDescriptionCompat + 81;
                            MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            return coroutineSingletons;
                        }
                        baseContentCardViewExternalSyntheticLambda2 = baseContentCardViewExternalSyntheticLambda0;
                        baseContentCardViewExternalSyntheticLambda1 = baseContentCardViewExternalSyntheticLambda2;
                        baseContentCardViewExternalSyntheticLambda3 = baseContentCardViewExternalSyntheticLambda1;
                        arrayList = arrayListWrite;
                        t2externalsyntheticlambda2 = t2externalsyntheticlambda1;
                        boolean z2 = zRemoteActionCompatParcelizer ? 1 : 0;
                        obj = subzonePolygons;
                        i = z2 ? 1 : 0;
                    } else {
                        baseContentCardViewExternalSyntheticLambda1 = baseContentCardViewExternalSyntheticLambda0;
                    }
                    if (arrayListWrite == null) {
                        if (t2externalsyntheticlambda1 != null) {
                            list = t2externalsyntheticlambda1.serializer;
                        } else {
                            list = null;
                        }
                        if (list != null) {
                            list2 = list;
                        }
                    } else {
                        r2 = zRemoteActionCompatParcelizer;
                        list2 = arrayListWrite;
                    }
                    if (r2 != 0) {
                        i2 = MediaDescriptionCompat + 87;
                        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 == 0) {
                            list2.isEmpty();
                            throw null;
                        }
                        if (!list2.isEmpty()) {
                            baseContentCardViewExternalSyntheticLambda1.add(new gExternalSyntheticLambda1(IconCompatParcelizer(list2), 3.0d, ColorKt.m776toArgb8_81llA(((setLastHorizontalStyle) callOptions$Builder.RemoteActionCompatParcelizer).IconCompatParcelizer().setPresenter()), 0, g5.ALWAYS, null, 80));
                        }
                    }
                    return new f9(SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0));
                }
                int i19 = MediaBrowserCompatMediaItem + 65;
                MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
            }
            return new f9(list2);
        }
        if (i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = x4Var.IconCompatParcelizer;
        baseContentCardViewExternalSyntheticLambda2 = x4Var.MediaBrowserCompatMediaItem;
        baseContentCardViewExternalSyntheticLambda1 = x4Var.read;
        baseContentCardViewExternalSyntheticLambda3 = x4Var.write;
        t2externalsyntheticlambda2 = x4Var.serializer;
        arrayList = x4Var.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        baseContentCardViewExternalSyntheticLambda2.addAll((Collection) obj);
        r2 = i;
        arrayListWrite = arrayList;
        baseContentCardViewExternalSyntheticLambda0 = baseContentCardViewExternalSyntheticLambda3;
        t2externalsyntheticlambda1 = t2externalsyntheticlambda2;
        if (arrayListWrite == null) {
            if (t2externalsyntheticlambda1 != null) {
                list = t2externalsyntheticlambda1.serializer;
            } else {
                list = null;
            }
            if (list != null) {
                list2 = list;
            }
        } else {
            r2 = zRemoteActionCompatParcelizer;
            list2 = arrayListWrite;
        }
        if (r2 != 0) {
            i2 = MediaDescriptionCompat + 87;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                list2.isEmpty();
                throw null;
            }
            if (!list2.isEmpty()) {
                baseContentCardViewExternalSyntheticLambda1.add(new gExternalSyntheticLambda1(IconCompatParcelizer(list2), 3.0d, ColorKt.m776toArgb8_81llA(((setLastHorizontalStyle) callOptions$Builder.RemoteActionCompatParcelizer).IconCompatParcelizer().setPresenter()), 0, g5.ALWAYS, null, 80));
            }
        }
        return new f9(SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0));
    }

    public CallOptions$Builder() {
    }
}
