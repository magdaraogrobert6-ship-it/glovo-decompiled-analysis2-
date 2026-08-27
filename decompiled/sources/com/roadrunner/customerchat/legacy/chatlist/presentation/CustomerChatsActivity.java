package com.roadrunner.customerchat.legacy.chatlist.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import com.roadrunner.push.presentation.PushMessagesActivity;
import com.roadrunner.push.presentation.PushMessagesInjectionActivity;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.GapBufferKt;
import o.MemoryCachegetHoldoutsWithLock1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessmultiRemove;
import o.accessremoveFromGlobalEntries;
import o.addToGlobalEntries;
import o.createFromParcel;
import o.createImageBitmap;
import o.debounceEntryb8qMvQI;
import o.displayInAppMessagelambda1;
import o.forEachNewCallbackNeverInvoked;
import o.fractionVisibleInRect;
import o.fractionVisibleInWindowWithInsetsE1MhUcY;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPositionInScreennOccac;
import o.getPostalCode;
import o.getQueryContext;
import o.multiRemove;
import o.onViewAttachedToWindow;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdajwkcXDgrgej7pDpprfk8KeVte28;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatsActivity extends PushMessagesInjectionActivity<debounceEntryb8qMvQI> {
    private static int MediaSessionCompatQueueItem = 0;
    private static int ParcelableVolumeInfo = 1;
    private final onViewDetachedFromWindowlambda1 MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public forEachNewCallbackNeverInvoked MediaDescriptionCompat;

    public static /* synthetic */ Object read(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i)) | (~(i7 | i9)) | (~(i9 | i));
        int i14 = i + i3 + i2 + (669352129 * i5) + (266941808 * i4);
        int i15 = i14 * i14;
        int i16 = (720661947 * i) + 1572077568 + ((-1243901369) * i3) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i2) + ((-1100480512) * i5) + ((-1249902592) * i4) + ((-491520000) * i15);
        int i17 = (i * 1617402437) + 56426783 + (i3 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i2 * 1617401855) + (i5 * 1244927807) + (i4 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        if (i18 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i18 != 2) {
            return serializer(objArr);
        }
        CustomerChatsActivity customerChatsActivity = (CustomerChatsActivity) objArr[0];
        int i19 = 2 % 2;
        int i20 = MediaSessionCompatQueueItem + 111;
        ParcelableVolumeInfo = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(customerChatsActivity);
        int i22 = ParcelableVolumeInfo + 51;
        MediaSessionCompatQueueItem = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
        return createfromparcelRemoteActionCompatParcelizer;
    }

    public static final /* synthetic */ void serializer(CustomerChatsActivity customerChatsActivity, fractionVisibleInWindowWithInsetsE1MhUcY fractionvisibleinwindowwithinsetse1mhucy) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 49;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iSerializer = GapBufferKt.serializer();
            read(-241312097, GapBufferKt.serializer(), new Object[]{customerChatsActivity, fractionvisibleinwindowwithinsetse1mhucy}, 241312098, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
            return;
        }
        int iSerializer2 = GapBufferKt.serializer();
        read(-241312097, GapBufferKt.serializer(), new Object[]{customerChatsActivity, fractionvisibleinwindowwithinsetse1mhucy}, 241312098, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer2);
        int i3 = 2 / 0;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(CustomerChatsActivity customerChatsActivity, fractionVisibleInRect fractionvisibleinrect) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelWrite = write(customerChatsActivity, fractionvisibleinrect);
        int i4 = MediaSessionCompatQueueItem + 95;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelWrite;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(CustomerChatsActivity customerChatsActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 47;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return write(customerChatsActivity, getbirthdatefull, i);
        }
        write(customerChatsActivity, getbirthdatefull, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel read(CustomerChatsActivity customerChatsActivity) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 109;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iSerializer = GapBufferKt.serializer();
            return (createFromParcel) read(1893393800, GapBufferKt.serializer(), new Object[]{customerChatsActivity}, -1893393800, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
        }
        int iSerializer2 = GapBufferKt.serializer();
        int i3 = 77 / 0;
        return (createFromParcel) read(1893393800, GapBufferKt.serializer(), new Object[]{customerChatsActivity}, -1893393800, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer2);
    }

    public static /* synthetic */ createImageBitmap serializer(CustomerChatsActivity customerChatsActivity) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 45;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write(customerChatsActivity);
            throw null;
        }
        createImageBitmap createimagebitmapWrite = write(customerChatsActivity);
        int i3 = MediaSessionCompatQueueItem + 9;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createimagebitmapWrite;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        CustomerChatsActivity customerChatsActivity = (CustomerChatsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 47;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        customerChatsActivity.finish();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = ParcelableVolumeInfo + 77;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public CustomerChatsActivity() {
        int i = 0;
        this.MediaBrowserCompatMediaItem = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(debounceEntryb8qMvQI.class), new accessremoveFromGlobalEntries(this, i), new addToGlobalEntries(this, i), new accessremoveFromGlobalEntries(this, 1));
    }

    private static final accessmultiRemove write(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (accessmultiRemove) onviewattachedtowindow.getValue();
        }
        int i3 = 0 / 0;
        return (accessmultiRemove) onviewattachedtowindow.getValue();
    }

    private final debounceEntryb8qMvQI read() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 59;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        debounceEntryb8qMvQI debounceentryb8qmvqi = (debounceEntryb8qMvQI) this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
        int i4 = ParcelableVolumeInfo + 37;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return debounceentryb8qmvqi;
    }

    private static final createFromParcel RemoteActionCompatParcelizer(CustomerChatsActivity customerChatsActivity) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 121;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        customerChatsActivity.read().read();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = ParcelableVolumeInfo + 117;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final forEachNewCallbackNeverInvoked RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 35;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = this.MediaDescriptionCompat;
        if (foreachnewcallbackneverinvoked == null) {
            removeNodeAtDepth.serializer("legacyInternalCustomerChatProvider");
            throw null;
        }
        int i5 = i3 + 9;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return foreachnewcallbackneverinvoked;
    }

    private static final createFromParcel write(CustomerChatsActivity customerChatsActivity, fractionVisibleInRect fractionvisibleinrect) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 75;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fractionvisibleinrect.getClass();
        customerChatsActivity.read().IconCompatParcelizer(fractionvisibleinrect);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = ParcelableVolumeInfo + 65;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    private static final createImageBitmap write(CustomerChatsActivity customerChatsActivity) {
        int i = 2 % 2;
        int iWrite = MemoryCachegetHoldoutsWithLock1.write();
        r8lambdajwkcXDgrgej7pDpprfk8KeVte28 r8lambdajwkcxdgrgej7pdpprfk8kevte28 = new r8lambdajwkcXDgrgej7pDpprfk8KeVte28(new AnalyticsServiceImpl((debounceEntryb8qMvQI) ((BasePushMessagesViewModel) PushMessagesActivity.read(new Object[]{customerChatsActivity}, -1985989632, MemoryCachegetHoldoutsWithLock1.write(), MemoryCachegetHoldoutsWithLock1.write(), iWrite, MemoryCachegetHoldoutsWithLock1.write(), 1985989632))), customerChatsActivity);
        int i2 = MediaSessionCompatQueueItem + 109;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
        return r8lambdajwkcxdgrgej7pdpprfk8kevte28;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        CustomerChatsActivity customerChatsActivity = (CustomerChatsActivity) objArr[0];
        fractionVisibleInWindowWithInsetsE1MhUcY fractionvisibleinwindowwithinsetse1mhucy = (fractionVisibleInWindowWithInsetsE1MhUcY) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (!(fractionvisibleinwindowwithinsetse1mhucy instanceof getPositionInScreennOccac)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int i2 = MediaSessionCompatQueueItem + 89;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = MediaSessionCompatQueueItem + 91;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            ((CustomerChatProviderImpl) customerChatsActivity.RemoteActionCompatParcelizer()).IconCompatParcelizer(customerChatsActivity, ((getPositionInScreennOccac) fractionvisibleinwindowwithinsetse1mhucy).RemoteActionCompatParcelizer());
            obj.hashCode();
            throw null;
        }
        ((CustomerChatProviderImpl) customerChatsActivity.RemoteActionCompatParcelizer()).IconCompatParcelizer(customerChatsActivity, ((getPositionInScreennOccac) fractionvisibleinwindowwithinsetse1mhucy).RemoteActionCompatParcelizer());
        int i5 = MediaSessionCompatQueueItem + 1;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.roadrunner.push.presentation.PushMessagesInjectionActivity, com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 123;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onResume();
            read().RemoteActionCompatParcelizer();
            read().read();
            read().IconCompatParcelizer();
            int i3 = 4 / 0;
        } else {
            super.onResume();
            read().RemoteActionCompatParcelizer();
            read().read();
            read().IconCompatParcelizer();
        }
        int i4 = MediaSessionCompatQueueItem + 107;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.roadrunner.push.presentation.PushMessagesInjectionActivity, com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(14, this), true, 2036260125));
        String stringExtra = getIntent().getStringExtra("groupChannelUrl");
        if (stringExtra != null) {
            ((CustomerChatProviderImpl) RemoteActionCompatParcelizer()).IconCompatParcelizer(this, stringExtra);
            int i2 = MediaSessionCompatQueueItem + 101;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = MediaSessionCompatQueueItem + 59;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    private static final createFromParcel write(CustomerChatsActivity customerChatsActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = ParcelableVolumeInfo + 101;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = 1;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, i4 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 4)) {
            int i6 = MediaSessionCompatQueueItem + 117;
            ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(customerChatsActivity.read().serializer(), getpostalcode, 0);
            getQueryContext getquerycontextWrite = customerChatsActivity.read().write();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(customerChatsActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NetworkFetcher.AnonymousClass2(customerChatsActivity);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontextWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            accessmultiRemove accessmultiremoveWrite = write(populateViewStructure_androidKtpopulate7Write);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(customerChatsActivity);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new addToGlobalEntries(customerChatsActivity, i5);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i8 = ParcelableVolumeInfo + 79;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new addToGlobalEntries(customerChatsActivity, i5);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(customerChatsActivity);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(i2, customerChatsActivity);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(customerChatsActivity);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new addToGlobalEntries(customerChatsActivity, i2);
                getpostalcode.write(objComponentActivity4);
            }
            multiRemove.IconCompatParcelizer(accessmultiremoveWrite, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, null, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    @Override // com.roadrunner.push.presentation.PushMessagesInjectionActivity, com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.roadrunner.push.presentation.PushMessagesInjectionActivity, com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.roadrunner.push.presentation.PushMessagesInjectionActivity, com.roadrunner.push.presentation.PushMessagesActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private static final createFromParcel MediaSessionCompatQueueItem(CustomerChatsActivity customerChatsActivity) {
        int iSerializer = GapBufferKt.serializer();
        return (createFromParcel) read(1893393800, GapBufferKt.serializer(), new Object[]{customerChatsActivity}, -1893393800, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
    }

    private final void write(fractionVisibleInWindowWithInsetsE1MhUcY fractionvisibleinwindowwithinsetse1mhucy) {
        int iSerializer = GapBufferKt.serializer();
        read(-241312097, GapBufferKt.serializer(), new Object[]{this, fractionvisibleinwindowwithinsetse1mhucy}, 241312098, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(CustomerChatsActivity customerChatsActivity) {
        int iSerializer = GapBufferKt.serializer();
        return (createFromParcel) read(167808002, GapBufferKt.serializer(), new Object[]{customerChatsActivity}, -167808000, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
    }
}
