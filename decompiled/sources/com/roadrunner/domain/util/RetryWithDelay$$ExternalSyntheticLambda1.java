package com.roadrunner.domain.util;

import android.os.Bundle;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.n$$ExternalSyntheticLambda3;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.android.gms.tasks.OnSuccessListener;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.AckNewOrderSeenWorker;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.logger.logger.sentry.SentryAppInfoChangedListener;
import com.roadrunner.networking.core.factory.RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.protocol.addObserverForBackInvoker;
import java.util.Map;
import o.BrazeActionUtils;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.SimpleItemTouchHelperCallback;
import o.SparseArraySerializerSparseArraySurrogateCompanion;
import o.accessgetTextCentercp;
import o.addID;
import o.b3;
import o.component3_LCdwA;
import o.createFromParcel;
import o.decode;
import o.displayInAppMessagelambda10;
import o.getDoneeUduSuo;
import o.getNavigationEventDispatcher;
import o.getOutlineProvider;
import o.getSceneString;
import o.getWindowOffsetnOccac;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isUnspecifieduvyYCjk;
import o.onMove;
import o.onViewRemoved;
import o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.removeNodeAtDepth;
import o.runFor;
import o.safeSetClipToOutline;
import o.setAmbientShadowColor8_81llA;
import o.syncCustomerProfilefwf_client_release;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RetryWithDelay$$ExternalSyntheticLambda1 implements Consumer, Function, getNavigationEventDispatcher, isUnspecifieduvyYCjk, OnSuccessListener, Action, r8lambda43nB7leLWjup6aTdW2xmA7XSAs, getOutlineProvider, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ RetryWithDelay$$ExternalSyntheticLambda1(ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1, SentryAppInfoChangedListener sentryAppInfoChangedListener) {
        this.RemoteActionCompatParcelizer = 28;
        this.serializer = executableQueryexecuteAsOneOrNull1;
    }

    public /* synthetic */ RetryWithDelay$$ExternalSyntheticLambda1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs
    public void serializer(boolean z) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 93;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SparseArraySerializerSparseArraySurrogateCompanion sparseArraySerializerSparseArraySurrogateCompanion = (SparseArraySerializerSparseArraySurrogateCompanion) this.serializer;
        if (z) {
            int i5 = i2 + 77;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                sparseArraySerializerSparseArraySurrogateCompanion.RemoteActionCompatParcelizer.invoke();
            } else {
                sparseArraySerializerSparseArraySurrogateCompanion.RemoteActionCompatParcelizer.invoke();
                int i6 = 4 / 0;
            }
        }
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SelfServiceCustomerChatActivity.write(1261957491, new Object[]{(SelfServiceCustomerChatActivity) this.serializer, Boolean.valueOf(((Boolean) obj).booleanValue())}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -1261957481, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            int i3 = 30 / 0;
        } else {
            SelfServiceCustomerChatActivity.write(1261957491, new Object[]{(SelfServiceCustomerChatActivity) this.serializer, Boolean.valueOf(((Boolean) obj).booleanValue())}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -1261957481, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        }
        int i4 = IconCompatParcelizer + 107;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 == 10) {
            ((BarcodeAnalyzer$$ExternalSyntheticLambda0) obj2).invoke(obj);
            int i5 = IconCompatParcelizer + 83;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i4 == 12) {
            ((RetryWithDelay$$ExternalSyntheticLambda0) obj2).invoke(obj);
            return;
        }
        if (i4 != 25) {
            if (i4 == 26) {
                ((RetryWithDelay$$ExternalSyntheticLambda0) obj2).invoke(obj);
                return;
            } else {
                ((b3) obj2).invoke();
                return;
            }
        }
        ((n$$ExternalSyntheticLambda3) obj2).invoke();
        int i6 = write + 57;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i2 == 1) {
            ((runFor) obj2).invoke(obj);
            return;
        }
        if (i2 == 7) {
            ((accessgetTextCentercp) obj2).invoke(obj);
            int i3 = write + 3;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        if (i2 == 3) {
            ((GestureNodeKt$$ExternalSyntheticLambda0) obj2).invoke(obj);
            return;
        }
        if (i2 == 4) {
            ((SessionDao_Impl$$ExternalSyntheticLambda1) obj2).invoke(obj);
            int i5 = write + 53;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
                return;
            }
            return;
        }
        if (i2 == 19) {
            ((onViewRemoved) obj2).invoke(obj);
            return;
        }
        if (i2 == 20) {
            ((onViewRemoved) obj2).invoke(obj);
            return;
        }
        ((onViewRemoved) obj2).invoke(obj);
        int i7 = write + 43;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            brazeActionUtils.getClass();
            brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            throw null;
        }
        ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = (ExecutableQueryexecuteAsOneOrNull1) this.serializer;
        brazeActionUtils.getClass();
        addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
            addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new addObserverForBackInvoker();
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) executableQueryexecuteAsOneOrNull1.read)) {
            addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read = null;
        } else {
            int i3 = IconCompatParcelizer + 1;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read = executableQueryexecuteAsOneOrNull1.read();
                obj.hashCode();
                throw null;
            }
            addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read = executableQueryexecuteAsOneOrNull1.read();
        }
        Map mapWrite = SentryAppInfoChangedListener.write(executableQueryexecuteAsOneOrNull1);
        Map map = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write;
        if (map == null) {
            int i4 = write + 53;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                obj.hashCode();
                throw null;
            }
            map = SimpleItemTouchHelperCallback.serializer;
        }
        addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write = Options.Companion.RemoteActionCompatParcelizer(onMove.RemoteActionCompatParcelizer(map, mapWrite));
        brazeActionUtils.read(addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        brazeActionUtils.IconCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY, (String) onMove.read(mapWrite, PushNotificationParserObj.COUNTRY_KEY));
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        ((BehaviorSubject) this.serializer).onNext(new getSceneString(createFromParcel.INSTANCE));
        int i2 = IconCompatParcelizer + 115;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isUnspecifieduvyYCjk
    public void onFragmentResult(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i2 == 8) {
            GalleryFragment galleryFragment = (GalleryFragment) obj;
            bundle.getClass();
            if (galleryFragment.getNavigationEventDispatcher == null) {
                removeNodeAtDepth.serializer("photoSharedSuccessNavigator");
                throw null;
            }
            int i3 = write + 23;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                FragmentActivity fragmentActivityRequireActivity = galleryFragment.requireActivity();
                fragmentActivityRequireActivity.getClass();
                g0.write(fragmentActivityRequireActivity);
                return;
            } else {
                FragmentActivity fragmentActivityRequireActivity2 = galleryFragment.requireActivity();
                fragmentActivityRequireActivity2.getClass();
                g0.write(fragmentActivityRequireActivity2);
                int i4 = 19 / 0;
                return;
            }
        }
        if (i2 != 9) {
            QrScannerFragment qrScannerFragment = (QrScannerFragment) obj;
            bundle.getClass();
            if (bundle.getBoolean("is_success")) {
                qrScannerFragment.read(false, false);
            }
            int i5 = write + 49;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        ContentSharingFragment contentSharingFragment = (ContentSharingFragment) obj;
        bundle.getClass();
        component3_LCdwA component3_lcdwa = (component3_LCdwA) SQLite.read(bundle, "action", component3_LCdwA.class);
        if (component3_lcdwa == null) {
            return;
        }
        getDoneeUduSuo getdoneeudusuo = contentSharingFragment.serializer().RatingCompat;
        getdoneeudusuo.getClass();
        decode decodeVar = getdoneeudusuo.serializer;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(getdoneeudusuo.IconCompatParcelizer.write());
        safesetcliptooutline.put("action", component3_lcdwa.getRawValue());
        decodeVar.logEvent("cs_take_photo", safesetcliptooutline.IconCompatParcelizer());
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = write + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 == 0) {
            obj.getClass();
            return (syncCustomerProfilefwf_client_release) ((RetryWithDelay$$ExternalSyntheticLambda0) obj2).invoke(obj);
        }
        if (i4 == 2) {
            obj.getClass();
            return (getWindowOffsetnOccac) ((SessionDao_Impl$$ExternalSyntheticLambda1) obj2).invoke(obj);
        }
        if (i4 == 6) {
            Throwable th = (Throwable) obj;
            th.getClass();
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Failed to acknowledge order seen. inputData: " + ((AckNewOrderSeenWorker) obj2).MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, new Object[0]);
            return new setAmbientShadowColor8_81llA(0);
        }
        if (i4 == 11) {
            obj.getClass();
            return (Integer) ((d0$$ExternalSyntheticLambda4) obj2).invoke(obj);
        }
        if (i4 == 21) {
            obj.getClass();
            return (CompletableSource) ((SuspendingWorkUseCase$$ExternalSyntheticLambda0) obj2).invoke(obj);
        }
        switch (i4) {
            case 14:
                obj.getClass();
                return (Boolean) ((invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2) obj2).invoke(obj);
            case 15:
                obj.getClass();
                SingleSource singleSource = (SingleSource) ((invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2) obj2).invoke(obj);
                int i5 = write + 19;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return singleSource;
            case 16:
                obj.getClass();
                SingleSource singleSource2 = (SingleSource) ((RetryWithDelay$$ExternalSyntheticLambda0) obj2).invoke(obj);
                int i7 = write + 21;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return singleSource2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 17:
                obj.getClass();
                return (addID) ((invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2) obj2).invoke(obj);
            case 18:
                obj.getClass();
                return (CompletableSource) ((RetryWithDelay$$ExternalSyntheticLambda0) obj2).invoke(obj);
            default:
                obj.getClass();
                return (CompletableSource) ((RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0) obj2).invoke(obj);
        }
    }
}
