package com.roadrunner.remoteconfig.firebase;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import com.mapbox.navigator.R;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ItemTouchHelperAdapter;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TouchAwareSwipeDismissTouchListener;
import o.accessgetInstancedelegatecp;
import o.addGlobalPartnerParameterI;
import o.displayInAppMessagelambda1;
import o.foregroundTimerFired;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0;
import o.registerInAppMessageManagerlambda40;
import o.removeNodeAtDepth;
import o.requestDisallowParentIntercept;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.setTransacterruntime;
import o.subscribeToBannersUpdateslambda2;
import o.subscribeToBannersUpdateslambda30;
import o.trackPlayStoreSubscriptionI;
import o.trackThirdPartySharingI;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.updateThirdPartySharingSettingsI;
import o.verifyPlayStorePurchaseI;
import o.writeActivityStateI;
import o.writeGlobalPartnerParametersI;
import org.koin.dsl.ModuleDSLKt;
import retrofit2.OkHttpCall$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseRemoteConfigImpl implements transferSessionPackageI {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final FirebaseRemoteConfigProvider IconCompatParcelizer;
    public final foregroundTimerFired RemoteActionCompatParcelizer;
    public final setTransacterruntime read;
    public final writeGlobalPartnerParametersI serializer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = i4 | i8 | (~(i | i6));
        int i10 = (~(i6 | i4)) | (~(i7 | i6)) | (~(i7 | i4));
        int i11 = i4 + i + i2 + (1351532378 * i5) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i2) + ((-1818230784) * i5) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i4 * 406040238) - 634933780) + (i * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i2 * 406039561) + (i5 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        int i15 = i13 + (i14 * i14 * 1831469056);
        if (i15 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i15 == 2) {
            return write(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? read(objArr) : serializer(objArr);
        }
        return RemoteActionCompatParcelizer(objArr);
    }

    public FirebaseRemoteConfigImpl(FirebaseRemoteConfigProvider firebaseRemoteConfigProvider, setTransacterruntime settransacterruntime, foregroundTimerFired foregroundtimerfired) {
        this.IconCompatParcelizer = firebaseRemoteConfigProvider;
        this.read = settransacterruntime;
        this.RemoteActionCompatParcelizer = foregroundtimerfired;
        this.serializer = new writeGlobalPartnerParametersI(new addGlobalPartnerParameterI(firebaseRemoteConfigProvider, FirebaseRemoteConfigProvider.class, "activationVersion", "getActivationVersion()J", 0));
    }

    public static List IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 45;
        write = i3 % Fields.SpotShadowColor;
        List list = null;
        if (i3 % 2 != 0) {
            boolean z = obj instanceof List;
            throw null;
        }
        if (obj instanceof List) {
            list = (List) obj;
            int i4 = i2 + 13;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final boolean MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ENTRANCE_PINS_V1_KILLSWITCH_ENABLED.getFirebaseFlagName());
        int i4 = MediaDescriptionCompat + 57;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zIconCompatParcelizer;
    }

    public final boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        boolean zIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 105;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            zIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_WEBVIEW_CRASH_HANDLING_ENABLED.getFirebaseFlagName());
            int i3 = 26 / 0;
        } else {
            zIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_WEBVIEW_CRASH_HANDLING_ENABLED.getFirebaseFlagName());
        }
        int i4 = MediaDescriptionCompat + 65;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IconCompatParcelizer(updateAdidI updateadidi) {
        int i = 2 % 2;
        String str = this.read.read();
        if (str != null) {
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(updateadidi, str);
            int i2 = MediaDescriptionCompat + 59;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return zRemoteActionCompatParcelizer;
        }
        int i4 = write + 33;
        int i5 = i4 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 93;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(updateAdidI updateadidi) {
        int i = 2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i2 = MediaDescriptionCompat + 71;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(updateadidi, strSerializer);
        int i3 = write + 103;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) objArr[0];
        int i = 2 % 2;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str != null) {
            return Boolean.valueOf(m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_ENTRANCE_PICTURE_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl));
        }
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 25;
        write = i3 % Fields.SpotShadowColor;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 125;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return bo.app.m1$$ExternalSyntheticOutline0.m(o.updateAdidI.IS_TURN_BY_TURN_BUILDING_HIGHLIGHT_ENABLED, r4.IconCompatParcelizer, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.MediaDescriptionCompat + 123;
        com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ComponentActivity() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.MediaDescriptionCompat
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.write = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1b
            o.foregroundTimerFired r1 = r4.RemoteActionCompatParcelizer
            java.lang.String r1 = r1.serializer()
            r3 = 43
            int r3 = r3 / r2
            if (r1 != 0) goto L2d
            goto L23
        L1b:
            o.foregroundTimerFired r1 = r4.RemoteActionCompatParcelizer
            java.lang.String r1 = r1.serializer()
            if (r1 != 0) goto L2d
        L23:
            int r1 = com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.MediaDescriptionCompat
            int r1 = r1 + 123
            int r3 = r1 % 128
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.write = r3
            int r1 = r1 % r0
            return r2
        L2d:
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider r0 = r4.IconCompatParcelizer
            o.updateAdidI r2 = o.updateAdidI.IS_TURN_BY_TURN_BUILDING_HIGHLIGHT_ENABLED
            boolean r0 = bo.app.m1$$ExternalSyntheticOutline0.m(r2, r0, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl.ComponentActivity():boolean");
    }

    public final boolean MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = write + 103;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.read.read();
        if (str != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_DF_PIN_CONNECTORS_ENABLED, this.IconCompatParcelizer, str, this);
        }
        int i4 = MediaDescriptionCompat + 117;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            return false;
        }
        boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_CUSTOMER_CHAT_CALL_MASKING_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        int i4 = MediaDescriptionCompat + 31;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zM;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        String str = this.read.read();
        if (str == null) {
            int i2 = MediaDescriptionCompat + 69;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_DISPATCHER_CHAT_NOTIFICATIONS_ENABLED, this.IconCompatParcelizer, str, this);
        int i4 = MediaDescriptionCompat + 45;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zM;
    }

    public final boolean ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            return false;
        }
        boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_INSTANT_DELIVERY_SEEN_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        int i4 = write + 87;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zM;
    }

    public final boolean PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_RIDER_STATE_CHANGE_SILENT_PUSH_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        }
        int i4 = MediaDescriptionCompat + 117;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = write + 103;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i4 = MediaDescriptionCompat + 51;
            write = i4 % Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        boolean zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_AUTO_ACCEPT_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        int i5 = write + 91;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return zM;
    }

    public final boolean ResultReceiver() {
        int i = 2 % 2;
        int i2 = write + 35;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer.serializer();
            throw null;
        }
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_STACKED_DELIVERY_LIST_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        }
        int i3 = write + 1;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.read.read();
        if (str != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_SMART_POLLING_DEBUG_LOGGING_ENABLED, this.IconCompatParcelizer, str, this);
        }
        int i4 = MediaDescriptionCompat + 103;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        int i2 = write + 111;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TURN_BY_TURN_DEPENDENCIES_ASYNC_LOAD_ENABLED, this.IconCompatParcelizer, strSerializer, this);
        }
        int i3 = MediaDescriptionCompat + 77;
        write = i3 % Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }

    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.read.read();
        if (str != null) {
            return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_TURN_BY_TURN_VOICE_INSTRUCTIONS_ENABLED, this.IconCompatParcelizer, str, this);
        }
        int i4 = MediaDescriptionCompat + 81;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(updateAdidI updateadidi, String str) {
        int i = 2 % 2;
        boolean zSerializer = this.serializer.serializer(af$$ExternalSyntheticOutline0.m(updateadidi.getFirebaseFlagName(), BundleUtil.UNDERLINE_TAG, str), new writeActivityStateI(this, updateadidi, str, 0));
        int i2 = write + 3;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zSerializer;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer != null) {
            return this.IconCompatParcelizer.serializer(updateAdidI.IS_AUTH_STATE_MACHINE_FOR_LOGOUT_ENABLED.getFirebaseFlagName(), strSerializer);
        }
        int i4 = MediaDescriptionCompat + 81;
        write = i4 % Fields.SpotShadowColor;
        return true ^ (i4 % 2 == 0);
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (strSerializer != null) {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
            return RemoteConfigHelperV2.IconCompatParcelizer(this.IconCompatParcelizer.read("customer_chat_translations"), strSerializer, instance_delegatelambda0Var);
        }
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 93;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 125;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return instance_delegatelambda0Var;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) objArr[0];
        int i = 2 % 2;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str != null) {
            updateThirdPartySharingSettingsI updatethirdpartysharingsettingsi = verifyPlayStorePurchaseI.Companion;
            String str2 = firebaseRemoteConfigImpl.IconCompatParcelizer.read("login_type", str);
            updatethirdpartysharingsettingsi.getClass();
            return updateThirdPartySharingSettingsI.write(str2);
        }
        int i2 = write + 79;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        verifyPlayStorePurchaseI verifyplaystorepurchasei = verifyPlayStorePurchaseI.EMAIL_OR_PHONE;
        int i4 = write + 55;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return verifyplaystorepurchasei;
    }

    public final boolean read() {
        int i = 2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null && (strSerializer = this.read.read()) == null) {
            int i2 = write + 113;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        boolean zSerializer = this.IconCompatParcelizer.serializer(updateAdidI.APP_REVIEW_MODE_ENABLED.getFirebaseFlagName(), strSerializer);
        int i3 = MediaDescriptionCompat + 121;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[PHI: r1
  0x002d: PHI (r1v9 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final boolean MediaBrowserCompatMediaItem() {
        String strSerializer;
        String firebaseFlagName;
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider;
        int i = 2 % 2;
        int i2 = write + 75;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strSerializer = this.RemoteActionCompatParcelizer.serializer();
            int i3 = 47 / 0;
            if (strSerializer == null) {
                int i4 = MediaDescriptionCompat + 89;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                firebaseFlagName = updateAdidI.IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED.getFirebaseFlagName();
                firebaseRemoteConfigProvider = this.IconCompatParcelizer;
                if (!firebaseRemoteConfigProvider.IconCompatParcelizer(firebaseFlagName)) {
                    return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_CUSTOMER_UNAVAILABLE_CANCEL_FLOW_ENABLED, firebaseRemoteConfigProvider, strSerializer, this);
                }
            }
        } else {
            strSerializer = this.RemoteActionCompatParcelizer.serializer();
            if (strSerializer == null) {
                int i6 = MediaDescriptionCompat + 89;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                firebaseFlagName = updateAdidI.IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED.getFirebaseFlagName();
                firebaseRemoteConfigProvider = this.IconCompatParcelizer;
                if (!firebaseRemoteConfigProvider.IconCompatParcelizer(firebaseFlagName)) {
                    return m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_CUSTOMER_UNAVAILABLE_CANCEL_FLOW_ENABLED, firebaseRemoteConfigProvider, strSerializer, this);
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) objArr[0];
        int i = 1;
        updateAdidI updateadidi = (updateAdidI) objArr[1];
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 41;
        write = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            firebaseRemoteConfigImpl.read.read();
            obj.hashCode();
            throw null;
        }
        String str = firebaseRemoteConfigImpl.read.read();
        if (str != null) {
            return Boolean.valueOf(firebaseRemoteConfigImpl.serializer.serializer(af$$ExternalSyntheticOutline0.m(updateadidi.getFirebaseFlagName(), BundleUtil.UNDERLINE_TAG, str), new writeActivityStateI(firebaseRemoteConfigImpl, updateadidi, str, i)));
        }
        int i4 = MediaDescriptionCompat + 1;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = this.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            return false;
        }
        Map mapIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_AUTO_ACCEPT_TOGGLE_ENABLED.getFirebaseFlagName(), strSerializer);
        boolean zContains = IconCompatParcelizer(mapIconCompatParcelizer.get("batches")).contains("all");
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        if (!((Boolean) RemoteActionCompatParcelizer(28645399, iSerializer2, R.serializer(), -28645399, iSerializer3, iSerializer, new Object[]{this, mapIconCompatParcelizer})).booleanValue() || !zContains) {
            return false;
        }
        int i4 = write + 59;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) objArr[0];
        int i = 2 % 2;
        int i2 = write + 93;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        trackThirdPartySharingI trackthirdpartysharingi = null;
        if (i2 % 2 == 0) {
            firebaseRemoteConfigImpl.read.read();
            throw null;
        }
        String str = firebaseRemoteConfigImpl.read.read();
        if (str == null) {
            return trackThirdPartySharingI.NOT_AVAILABLE;
        }
        trackPlayStoreSubscriptionI trackplaystoresubscriptioni = trackThirdPartySharingI.Companion;
        String str2 = firebaseRemoteConfigImpl.IconCompatParcelizer.read(updateAdidI.CUSTOMER_CHAT_ENABLED_FROM.getFirebaseFlagName(), str);
        trackplaystoresubscriptioni.getClass();
        for (trackThirdPartySharingI trackthirdpartysharingi2 : trackThirdPartySharingI.values()) {
            int i3 = write + 13;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{trackthirdpartysharingi2.getValue(), str2}, getCieXyz.write())).booleanValue()) {
                int i5 = write + 35;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                trackthirdpartysharingi = trackthirdpartysharingi2;
                break;
            }
        }
        if (trackthirdpartysharingi != null) {
            return trackthirdpartysharingi;
        }
        int i7 = write + 71;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return trackThirdPartySharingI.NOT_AVAILABLE;
        }
        int i8 = 19 / 0;
        return trackThirdPartySharingI.NOT_AVAILABLE;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        foregroundTimerFired foregroundtimerfired = this.RemoteActionCompatParcelizer;
        String strSerializer = foregroundtimerfired.serializer();
        if (strSerializer == null) {
            return false;
        }
        String str = ((subscribeToBannersUpdateslambda2) foregroundtimerfired.read.write).read();
        if (str == null) {
            int i2 = write + 21;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        String firebaseFlagName = updateAdidI.INSTANT_SHIFTS_ENABLED.getFirebaseFlagName();
        firebaseFlagName.getClass();
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
        List listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(this.IconCompatParcelizer.read(firebaseFlagName), strSerializer, instance_delegatelambda0.write);
        if (listIconCompatParcelizer.contains("all")) {
            return true;
        }
        int i4 = write + 111;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return listIconCompatParcelizer.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX INFO: renamed from: resetAndSyncRemoteConfig-IoAF18A, reason: not valid java name */
    public final Object m5014resetAndSyncRemoteConfigIoAF18A(ContinuationImpl continuationImpl) {
        FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1 firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(continuationImpl instanceof FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1)) {
            firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1 = new FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1(this, continuationImpl);
        } else {
            firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1 = (FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1) continuationImpl;
            int i4 = firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1 = new FirebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1(this, continuationImpl);
            }
        }
        Object obj = firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1.RemoteActionCompatParcelizer = 1;
            Object objM5015resetAndSyncRemoteConfigIoAF18A = this.IconCompatParcelizer.m5015resetAndSyncRemoteConfigIoAF18A(firebaseRemoteConfigImpl$resetAndSyncRemoteConfig$1);
            if (objM5015resetAndSyncRemoteConfigIoAF18A != coroutineSingletons) {
                return objM5015resetAndSyncRemoteConfigIoAF18A;
            }
            int i6 = MediaDescriptionCompat + 77;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons;
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i8 = MediaDescriptionCompat + 59;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        throw null;
    }

    public final Set write(String str) {
        int i = 2 % 2;
        int i2 = write + 93;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        try {
            String str2 = this.IconCompatParcelizer.read(str);
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                str2 = "{}";
            }
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
            int i4 = registerInAppMessageManagerlambda40.IconCompatParcelizer;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, displayInAppMessagelambda1.IconCompatParcelizer(ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(String.class)), ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection.class))));
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpIconCompatParcelizer;
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) ((Map) isverticalswipeinalloweddirection.serializer(str2, setgraphicmodalmaxwidthdpIconCompatParcelizer)).get("events");
            if (swipeDismissTouchListenerVerticalDismissDirection == null) {
                return itemTouchHelperAdapter;
            }
            requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection);
            ArrayList arrayList = new ArrayList();
            for (Object obj : requestdisallowparentinterceptIconCompatParcelizer.content) {
                int i5 = MediaDescriptionCompat + 31;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (obj instanceof r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) {
                    int i7 = MediaDescriptionCompat + 17;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        arrayList.add(obj);
                        int i8 = 25 / 0;
                    } else {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i9 = write + 33;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    arrayList2.add(((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) it.next()).IconCompatParcelizer());
                    throw null;
                }
                arrayList2.add(((r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0) it.next()).IconCompatParcelizer());
            }
            return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, ff$$ExternalSyntheticOutline0.m("Blocked ", str, " event parsing failed"), new Object[0]);
            return itemTouchHelperAdapter;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    private static /* synthetic */ Object read(Object[] objArr) {
        int iDoubleValue;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer numMediaSessionCompatQueueItem;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) objArr[0];
        Map map = (Map) objArr[1];
        int i = 2 % 2;
        foregroundTimerFired foregroundtimerfired = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer;
        OkHttpCall$1 okHttpCall$1 = foregroundtimerfired.read;
        Object obj = map.get("min-version");
        String str = !((obj instanceof String) ^ true) ? (String) obj : null;
        if (str == null || (numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str)) == null) {
            Object obj2 = map.get("min-version");
            Double d = obj2 instanceof Double ? (Double) obj2 : null;
            iDoubleValue = d != null ? (int) d.doubleValue() : Integer.MAX_VALUE;
        } else {
            int i2 = MediaDescriptionCompat + 11;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                iDoubleValue = numMediaSessionCompatQueueItem.intValue();
                int i3 = 26 / 0;
            } else {
                iDoubleValue = numMediaSessionCompatQueueItem.intValue();
            }
        }
        List listIconCompatParcelizer = IconCompatParcelizer(map.get("contract-types"));
        List listIconCompatParcelizer2 = IconCompatParcelizer(map.get("employees"));
        List listIconCompatParcelizer3 = IconCompatParcelizer(map.get("cities"));
        if (map.isEmpty()) {
            map = null;
        }
        if (map != null) {
            if (1312 >= iDoubleValue) {
                int i4 = write + 59;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (listIconCompatParcelizer.contains("all")) {
                z2 = true;
            } else {
                int i6 = write + 27;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    onContentCardDismissed.write(listIconCompatParcelizer, ((subscribeToBannersUpdateslambda2) okHttpCall$1.write).read());
                    throw null;
                }
                if (onContentCardDismissed.write(listIconCompatParcelizer, ((subscribeToBannersUpdateslambda2) okHttpCall$1.write).read())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (listIconCompatParcelizer2.contains("all")) {
                z3 = true;
            } else {
                r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) foregroundtimerfired.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.serializer();
                if (listIconCompatParcelizer2.contains(String.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null ? Long.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read) : null))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (listIconCompatParcelizer3.contains("all")) {
                z4 = true;
            } else {
                int i7 = write + 31;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                subscribeToBannersUpdateslambda30 subscribetobannersupdateslambda30 = (subscribeToBannersUpdateslambda30) ((UserPropertiesRepository) ((SharedResourcePool) okHttpCall$1.serializer).IconCompatParcelizer).write.get();
                if (listIconCompatParcelizer3.contains(String.valueOf(subscribetobannersupdateslambda30 != null ? subscribetobannersupdateslambda30.cityId : null))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z) {
                int i9 = MediaDescriptionCompat + 59;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (z2 && z3 && z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final verifyPlayStorePurchaseI r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        return (verifyPlayStorePurchaseI) RemoteActionCompatParcelizer(-383819351, iSerializer2, R.serializer(), 383819352, iSerializer3, iSerializer, new Object[]{this});
    }

    public final boolean serializer(Map map) {
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        return ((Boolean) RemoteActionCompatParcelizer(28645399, iSerializer2, R.serializer(), -28645399, iSerializer3, iSerializer, new Object[]{this, map})).booleanValue();
    }

    public final boolean PlaybackStateCompatCustomAction() {
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        return ((Boolean) RemoteActionCompatParcelizer(52023560, iSerializer2, R.serializer(), -52023556, iSerializer3, iSerializer, new Object[]{this})).booleanValue();
    }

    public final boolean write(updateAdidI updateadidi) {
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        return ((Boolean) RemoteActionCompatParcelizer(1762727223, iSerializer2, R.serializer(), -1762727220, iSerializer3, iSerializer, new Object[]{this, updateadidi})).booleanValue();
    }

    public final trackThirdPartySharingI IconCompatParcelizer() {
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        return (trackThirdPartySharingI) RemoteActionCompatParcelizer(611636138, iSerializer2, R.serializer(), -611636136, iSerializer3, iSerializer, new Object[]{this});
    }
}
