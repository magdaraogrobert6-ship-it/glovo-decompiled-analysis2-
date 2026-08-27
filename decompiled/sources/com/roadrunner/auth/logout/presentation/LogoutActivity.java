package com.roadrunner.auth.logout.presentation;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.ui.common.base.BaseInjectionActivity;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidContentCaptureManager;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.SubcomposeContentPainterElement;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.enclosingTransactionruntime;
import o.getActionViewIntentlambda0;
import o.getBirthDateFull;
import o.getBitmapui_graphics;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getQueryContext;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.requestFocusdefault;
import o.scrollBydefault;
import o.scrollToIndex;
import o.scrollToIndexdefault;
import o.selectableGroup;
import o.setContainer;
import o.setContentType;
import o.setEditableText;
import o.setFillableData;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutActivity extends BaseInjectionActivity {
    public static final scrollToIndexdefault MediaBrowserCompatMediaItem = new scrollToIndexdefault();
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public enclosingTransactionruntime MediaDescriptionCompat;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public setFillableData RatingCompat;

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i3)) | i4;
        int i9 = i3 | i4 | i7;
        int i10 = i4 + i + i2 + (1159740906 * i5) + ((-617157175) * i6);
        int i11 = i10 * i10;
        int i12 = ((i4 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i2) + (1488977920 * i5) + (2111832064 * i6) + (2070937600 * i11);
        int i13 = (i4 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i2 * (-824977973)) + (i5 * (-135083378)) + (i6 * 1125239651) + (i11 * 298844160);
        return i12 + ((i13 * i13) * 2098200576) != 1 ? write(objArr) : read(objArr);
    }

    static {
        int i = MediaSessionCompatResultReceiverWrapper + 81;
        ParcelableVolumeInfo = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IconCompatParcelizer(LogoutActivity logoutActivity, requestFocusdefault requestfocusdefault) throws Exception {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 97;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            logoutActivity.IconCompatParcelizer(requestfocusdefault);
            throw null;
        }
        logoutActivity.IconCompatParcelizer(requestfocusdefault);
        int i3 = PlaybackStateCompat + 29;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ LogoutViewModel RemoteActionCompatParcelizer(LogoutActivity logoutActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 99;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LogoutViewModel logoutViewModelIconCompatParcelizer = IconCompatParcelizer(logoutActivity, getbitmapui_graphics);
        int i4 = PlaybackStateCompat + 27;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return logoutViewModelIconCompatParcelizer;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(LogoutActivity logoutActivity, getBirthDateFull getbirthdatefull, int i) {
        createFromParcel createfromparcel;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 31;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            createfromparcel = read(logoutActivity, getbirthdatefull, i);
            int i4 = 86 / 0;
        } else {
            createfromparcel = read(logoutActivity, getbirthdatefull, i);
        }
        int i5 = PlaybackStateCompat + 33;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        createFromParcel createfromparcel;
        LogoutActivity logoutActivity = (LogoutActivity) objArr[0];
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 87;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = SubcomposeContentPainterElement.read();
            createfromparcel = (createFromParcel) write(1112161433, SubcomposeContentPainterElement.read(), new Object[]{logoutActivity}, i3, -1112161433, SubcomposeContentPainterElement.read(), SubcomposeContentPainterElement.read());
            int i4 = 38 / 0;
        } else {
            int i5 = SubcomposeContentPainterElement.read();
            createfromparcel = (createFromParcel) write(1112161433, SubcomposeContentPainterElement.read(), new Object[]{logoutActivity}, i5, -1112161433, SubcomposeContentPainterElement.read(), SubcomposeContentPainterElement.read());
        }
        int i6 = PlaybackStateCompat + 71;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel serializer(OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 35;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelWrite = write(onBackPressedCallback);
        int i4 = PlaybackStateCompatCustomAction + 93;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelWrite;
    }

    private static final createFromParcel write(OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 101;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onBackPressedCallback.getClass();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = PlaybackStateCompat + 73;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LogoutActivity() {
        int i = 1;
        this.MediaSessionCompatQueueItem = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(LogoutViewModel.class), new selectableGroup(this, 0), new AndroidSqliteDriverCallback(this, i, new f2$$ExternalSyntheticLambda4(26, this)), new selectableGroup(this, i));
    }

    private final LogoutViewModel read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 67;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LogoutViewModel logoutViewModel = (LogoutViewModel) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
        int i4 = PlaybackStateCompatCustomAction + 73;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return logoutViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        LogoutActivity logoutActivity = (LogoutActivity) objArr[0];
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 39;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        logoutActivity.read().read();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = PlaybackStateCompat + 47;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setFillableData RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        setFillableData setfillabledata = this.RatingCompat;
        if (setfillabledata == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i5 = i3 + 79;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return setfillabledata;
    }

    public final enclosingTransactionruntime serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 35;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        enclosingTransactionruntime enclosingtransactionruntime = this.MediaDescriptionCompat;
        Object obj = null;
        if (enclosingtransactionruntime == null) {
            removeNodeAtDepth.serializer("routerNavigator");
            throw null;
        }
        int i5 = i2 + 7;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return enclosingtransactionruntime;
        }
        obj.hashCode();
        throw null;
    }

    private static final LogoutViewModel IconCompatParcelizer(LogoutActivity logoutActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 21;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getbitmapui_graphics.getClass();
            ((setEditableText) logoutActivity.RemoteActionCompatParcelizer()).read((String) getbitmapui_graphics.write("invocation_site"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getbitmapui_graphics.getClass();
        LogoutViewModel logoutViewModel = ((setEditableText) logoutActivity.RemoteActionCompatParcelizer()).read((String) getbitmapui_graphics.write("invocation_site"));
        int i3 = PlaybackStateCompatCustomAction + 25;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return logoutViewModel;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        LazyKt__LazyJVMKt.serializer(getOnBackPressedDispatcher(), this, new hg$$ExternalSyntheticLambda5(25));
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(12, this), true, -1469871758));
        int i2 = PlaybackStateCompat + 107;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private final void IconCompatParcelizer(requestFocusdefault requestfocusdefault) throws Exception {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 61;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {requestfocusdefault, scrollToIndex.write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Finishing logout", new Object[0]);
            ((getActionViewIntentlambda0) serializer()).getClass();
            invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2 invokesuspendcomroadrunnercustomerchatselfservicedataimageimagecacheresolverimplcacheimagefile2 = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(28);
            Intent intent = new Intent(this, (Class<?>) RouterActivity.class);
            invokesuspendcomroadrunnercustomerchatselfservicedataimageimagecacheresolverimplcacheimagefile2.invoke(intent);
            startActivityForResult(intent, -1, null);
            finish();
            return;
        }
        if (!(requestfocusdefault instanceof scrollBydefault)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            int i4 = PlaybackStateCompatCustomAction + 15;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        int i6 = PlaybackStateCompatCustomAction + 45;
        PlaybackStateCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        write();
        finish();
    }

    private final void write() {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName())));
            int i2 = PlaybackStateCompatCustomAction + 75;
            PlaybackStateCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ActivityNotFoundException e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Unable to find market app", e));
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    private static final createFromParcel read(LogoutActivity logoutActivity, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = PlaybackStateCompat + 79;
            int i4 = i3 % Fields.SpotShadowColor;
            PlaybackStateCompatCustomAction = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 27;
            PlaybackStateCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(i & 1, z);
        Object obj = null;
        if (zWrite) {
            getQueryContext getquerycontextRemoteActionCompatParcelizer = logoutActivity.read().RemoteActionCompatParcelizer();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(logoutActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NetworkFetcher.AnonymousClass2(logoutActivity);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontextRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            setContentType setcontenttype = (setContentType) ExtrasKt.write(logoutActivity.read().serializer(), getpostalcode, 0).getValue();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(logoutActivity);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new BrazeUser$$ExternalSyntheticLambda28(17, logoutActivity);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i8 = PlaybackStateCompat + 5;
                PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new BrazeUser$$ExternalSyntheticLambda28(17, logoutActivity);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            setContainer.IconCompatParcelizer(setcontenttype, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, null, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = PlaybackStateCompat + 15;
        PlaybackStateCompatCustomAction = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return createfromparcel;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private static final createFromParcel write(LogoutActivity logoutActivity) {
        int i = SubcomposeContentPainterElement.read();
        return (createFromParcel) write(1112161433, SubcomposeContentPainterElement.read(), new Object[]{logoutActivity}, i, -1112161433, SubcomposeContentPainterElement.read(), SubcomposeContentPainterElement.read());
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(LogoutActivity logoutActivity) {
        int i = SubcomposeContentPainterElement.read();
        return (createFromParcel) write(771640202, SubcomposeContentPainterElement.read(), new Object[]{logoutActivity}, i, -771640201, SubcomposeContentPainterElement.read(), SubcomposeContentPainterElement.read());
    }
}
