package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Dp;
import o.Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.alignKFBX0sM;
import o.getHandleruiannotations;
import o.getTopStart;
import o.getTopStartannotations;
import o.getViewportSizeYbymL2g;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyTextFieldState {
    public final EditProcessor ComponentActivity = new EditProcessor();
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public TextInputSession MediaDescriptionCompat;
    public final Paint MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final getTopStartannotations MediaSessionCompatResultReceiverWrapper;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatToken;
    public final Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 ParcelableVolumeInfo;
    public final SoftwareKeyboardController PlaybackStateCompat;
    public final PopulateViewStructure_androidKtpopulate7 PlaybackStateCompatCustomAction;
    public final PopulateViewStructure_androidKtpopulate7 RatingCompat;
    public LayoutCoordinates RemoteActionCompatParcelizer;
    public final Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 ResultReceiver;
    public final Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getHandleruiannotations r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final PopulateViewStructure_androidKtpopulate7 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public getTopStart r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public AnnotatedString r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final PopulateViewStructure_androidKtpopulate7 serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;

    public final alignKFBX0sM IconCompatParcelizer() {
        return (alignKFBX0sM) this.IconCompatParcelizer.getValue();
    }

    public final TextLayoutResultProxy serializer() {
        return (TextLayoutResultProxy) ((onShowTranslationui) this.MediaSessionCompatToken).getValue();
    }

    public final boolean write() {
        return ((Boolean) this.write.getValue()).booleanValue();
    }

    public LegacyTextFieldState(getTopStart gettopstart, getHandleruiannotations gethandleruiannotations, SoftwareKeyboardController softwareKeyboardController) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = gettopstart;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = gethandleruiannotations;
        this.PlaybackStateCompat = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.write = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.PlaybackStateCompatCustomAction = CompositionKt.RemoteActionCompatParcelizer(Dp.m3671boximpl(Dp.m3673constructorimpl(0.0f)));
        this.MediaSessionCompatToken = CompositionKt.RemoteActionCompatParcelizer(null);
        this.IconCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(alignKFBX0sM.None);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaSessionCompatQueueItem = true;
        this.RatingCompat = CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
        this.MediaSessionCompatResultReceiverWrapper = new getTopStartannotations(softwareKeyboardController);
        this.read = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatMediaItem = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getViewportSizeYbymL2g(24);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1(this, 1);
        this.ParcelableVolumeInfo = new Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1(this, 2);
        this.ResultReceiver = new Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1(this, 3);
        this.MediaMetadataCompat = AndroidPaint_androidKt.Paint();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Color.Companion.m758getUnspecified0d7_KjU();
        TextRange.Companion companion = TextRange.Companion;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = CompositionKt.RemoteActionCompatParcelizer(TextRange.m3064boximpl(companion.m3081getZerod9O1mEE()));
        this.serializer = CompositionKt.RemoteActionCompatParcelizer(TextRange.m3064boximpl(companion.m3081getZerod9O1mEE()));
    }

    public final LayoutCoordinates read() {
        LayoutCoordinates layoutCoordinates = this.RemoteActionCompatParcelizer;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }
}
