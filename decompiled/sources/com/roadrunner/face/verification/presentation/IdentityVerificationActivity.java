package com.roadrunner.face.verification.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.api.directions.v5.models.C$AutoValue_MapboxShield;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.ui.common.base.BaseInjectionActivity;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropTargetModifierNode;
import o.FocusManager;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.asComposePath;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getRootSemanticsNode;
import o.getScrimColor;
import o.getStatusBarBackground;
import o.getSuggestedMinimumHeight;
import o.getSuggestedMinimumWidth;
import o.getTransactionExecutor;
import o.hideTranslatedText;
import o.invokeOverPasshUlJWOEdefault;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.removeNodeAtDepth;
import o.requestGeofences;
import o.setWidgetBaseline;
import o.toAndroidPathDashPathEffectStyleoQv6xUo;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityVerificationActivity extends BaseInjectionActivity {
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public requestGeofences MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getSuggestedMinimumWidth MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public setWidgetBaseline MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getTransactionExecutor MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getStatusBarBackground MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getScrimColor ParcelableVolumeInfo;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaLZjsjPSXWRendXZH98LKrH6PSs PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsOwner PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsOwnerKt RatingCompat;

    public static /* synthetic */ Object IconCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i6)) | i9 | (~(i8 | i6));
        int i11 = ~i6;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i4;
        int i14 = i2 + i4 + i + ((-700610695) * i5) + ((-1151578525) * i3);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i2) + 1030029312 + ((-1366800679) * i4) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i) + ((-665714688) * i5) + (367394816 * i3) + (374145024 * i15);
        int i17 = ((i2 * 323709325) - 650539883) + (i4 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i * 323709601) + (i5 * (-499299047)) + (i3 * 1568885315) + (i15 * (-395509760));
        int i18 = i16 + (i17 * i17 * (-772603904));
        if (i18 != 1) {
            return i18 != 2 ? serializer(objArr) : read(objArr);
        }
        return write(objArr);
    }

    public static final /* synthetic */ void IconCompatParcelizer(IdentityVerificationActivity identityVerificationActivity) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 15;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        identityVerificationActivity.MediaBrowserCompatMediaItem();
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 105;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 25;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            identityVerificationActivity.PlaybackStateCompatCustomAction();
            int i3 = 29 / 0;
        } else {
            identityVerificationActivity.PlaybackStateCompatCustomAction();
        }
        int i4 = ResultReceiver + 3;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationParams identityVerificationParams, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 23;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return read(identityVerificationActivity, identityVerificationParams, getbirthdatefull, i);
        }
        createFromParcel createfromparcel = read(identityVerificationActivity, identityVerificationParams, getbirthdatefull, i);
        int i4 = 68 / 0;
        return createfromparcel;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) objArr[0];
        IdentityVerificationParams identityVerificationParams = (IdentityVerificationParams) objArr[1];
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = ResultReceiver + 15;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelSerializer = serializer(identityVerificationActivity, identityVerificationParams, getbirthdatefull, iIntValue);
        int i4 = ResultReceiver + 99;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelSerializer;
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 13;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        setResult(i2 % 2 == 0 ? 1 : 0);
        finish();
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 117;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 61;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setResult(-1);
            finish();
            int i3 = 13 / 0;
        } else {
            setResult(-1);
            finish();
        }
        int i4 = ResultReceiver + 23;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i3 = i2 + 19;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            SemanticsOwnerKt semanticsOwnerKt = identityVerificationActivity.RatingCompat;
            throw null;
        }
        SemanticsOwnerKt semanticsOwnerKt2 = identityVerificationActivity.RatingCompat;
        if (semanticsOwnerKt2 == null) {
            removeNodeAtDepth.serializer("appStartToInteractiveCoordinator");
            throw null;
        }
        int i4 = i2 + 43;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsOwnerKt2;
    }

    public final requestGeofences RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        requestGeofences requestgeofences = this.MediaBrowserCompatMediaItem;
        if (requestgeofences == null) {
            removeNodeAtDepth.serializer("cancellationSignal");
            throw null;
        }
        int i2 = ResultReceiver + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return requestgeofences;
    }

    public final setWidgetBaseline serializer() {
        int i = 2 % 2;
        setWidgetBaseline setwidgetbaseline = this.MediaSessionCompatQueueItem;
        if (setwidgetbaseline == null) {
            removeNodeAtDepth.serializer("imageCaptureUseCase");
            throw null;
        }
        int i2 = ResultReceiver;
        int i3 = i2 + 85;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 41;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setwidgetbaseline;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        o.removeNodeAtDepth.serializer("identityPopupViewModelFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 33;
        com.roadrunner.face.verification.presentation.IdentityVerificationActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getSuggestedMinimumWidth write() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver
            int r2 = r1 + 43
            int r3 = r2 % 128
            com.roadrunner.face.verification.presentation.IdentityVerificationActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            o.getSuggestedMinimumWidth r2 = r4.MediaDescriptionCompat
            r3 = 59
            int r3 = r3 / 0
            if (r2 == 0) goto L23
            goto L1b
        L17:
            o.getSuggestedMinimumWidth r2 = r4.MediaDescriptionCompat
            if (r2 == 0) goto L23
        L1b:
            int r1 = r1 + 33
            int r3 = r1 % 128
            com.roadrunner.face.verification.presentation.IdentityVerificationActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r3
            int r1 = r1 % r0
            return r2
        L23:
            java.lang.String r0 = "identityPopupViewModelFactory"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.face.verification.presentation.IdentityVerificationActivity.write():o.getSuggestedMinimumWidth");
    }

    public final getTransactionExecutor MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 105;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        getTransactionExecutor gettransactionexecutor = this.MediaSessionCompatResultReceiverWrapper;
        Object obj = null;
        if (gettransactionexecutor == null) {
            removeNodeAtDepth.serializer("permissionStateHolder");
            throw null;
        }
        int i5 = i3 + 111;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return gettransactionexecutor;
        }
        obj.hashCode();
        throw null;
    }

    public final getScrimColor MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i3 = i2 + 5;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getScrimColor getscrimcolor = this.ParcelableVolumeInfo;
        if (getscrimcolor == null) {
            removeNodeAtDepth.serializer("selfieFlowViewModelFactory");
            throw null;
        }
        int i5 = i2 + 27;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getscrimcolor;
    }

    public final SemanticsOwner MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 81;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SemanticsOwner semanticsOwner = this.PlaybackStateCompatCustomAction;
        if (semanticsOwner == null) {
            removeNodeAtDepth.serializer("performanceTrackingManager");
            throw null;
        }
        int i5 = i2 + 27;
        int i6 = i5 % Fields.SpotShadowColor;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 105;
        ResultReceiver = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return semanticsOwner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = r1 + 97;
        com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        o.removeNodeAtDepth.serializer("navigator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r4 = r1 + 107;
        com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getStatusBarBackground RatingCompat() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.face.verification.presentation.IdentityVerificationActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            int r2 = r1 + 87
            int r3 = r2 % 128
            com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.getStatusBarBackground r2 = r6.MediaSessionCompatToken
            r4 = 99
            int r4 = r4 / 0
            if (r2 == 0) goto L37
            goto L1c
        L18:
            o.getStatusBarBackground r2 = r6.MediaSessionCompatToken
            if (r2 == 0) goto L37
        L1c:
            int r4 = r1 + 107
            int r5 = r4 % 128
            com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L33
            int r1 = r1 + 97
            int r3 = r1 % 128
            com.roadrunner.face.verification.presentation.IdentityVerificationActivity.ResultReceiver = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L32
            r0 = 73
            int r0 = r0 / 0
        L32:
            return r2
        L33:
            r3.hashCode()
            throw r3
        L37:
            java.lang.String r0 = "navigator"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.face.verification.presentation.IdentityVerificationActivity.RatingCompat():o.getStatusBarBackground");
    }

    private final void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new DividerUiModelImpl$1(this, null, 3), 3);
        int i2 = ResultReceiver + 69;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 15;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            FocusManager.serializer(getIntent(), "identity-verification-params", IdentityVerificationParams.class);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        Object objSerializer = FocusManager.serializer(getIntent(), "identity-verification-params", IdentityVerificationParams.class);
        if (objSerializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("params is null");
            return;
        }
        RatingCompat().read(new NestScreenKt$NestScreen$1$1(this, 3));
        RatingCompat().getClass();
        MediaSessionCompatResultReceiverWrapper();
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new getSuggestedMinimumHeight(this, (IdentityVerificationParams) objSerializer, 0), true, -1991793072));
        int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 51;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
    }

    private static final createFromParcel serializer(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationParams identityVerificationParams, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = 1;
        if ((i & 3) != 2) {
            int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 57;
            ResultReceiver = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = ResultReceiver + 89;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, z)) {
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{getRootSemanticsNode.RemoteActionCompatParcelizer().write(identityVerificationActivity.MediaSessionCompatQueueItem()), getRootSemanticsNode.read().write((SemanticsOwnerKt) IconCompatParcelizer(new Object[]{identityVerificationActivity}, C$AutoValue_MapboxShield.write(), -1479238312, C$AutoValue_MapboxShield.write(), 1479238314, C$AutoValue_MapboxShield.write(), C$AutoValue_MapboxShield.write()))}, ExtrasKt.write(-1463334128, new getSuggestedMinimumHeight(identityVerificationActivity, identityVerificationParams, i3), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    private static final createFromParcel read(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationParams identityVerificationParams, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = ResultReceiver + 1;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(i & 1, i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i4 = ResultReceiver + 23;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            relativeMoveTo relativemoveto = asComposePath.read(new toAndroidPathDashPathEffectStyleoQv6xUo[0], getpostalcode);
            getScrimColor getscrimcolorMediaMetadataCompat = identityVerificationActivity.MediaMetadataCompat();
            identityVerificationActivity.RatingCompat().getClass();
            getSuggestedMinimumWidth getsuggestedminimumwidthWrite = identityVerificationActivity.write();
            getStatusBarBackground getstatusbarbackgroundRatingCompat = identityVerificationActivity.RatingCompat();
            getTransactionExecutor gettransactionexecutorMediaDescriptionCompat = identityVerificationActivity.MediaDescriptionCompat();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(identityVerificationActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity = new NestScreenKt$NestScreen$1$1(identityVerificationActivity, 4);
                getpostalcode.write(objComponentActivity);
            } else {
                int i6 = ResultReceiver + 31;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new NestScreenKt$NestScreen$1$1(identityVerificationActivity, 4);
                    getpostalcode.write(objComponentActivity);
                }
            }
            invokeOverPasshUlJWOEdefault.read(gettransactionexecutorMediaDescriptionCompat, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), relativemoveto, getscrimcolorMediaMetadataCompat, getsuggestedminimumwidthWrite, getstatusbarbackgroundRatingCompat, identityVerificationParams, identityVerificationActivity.serializer(), null, getpostalcode, 64);
        }
        return createFromParcel.INSTANCE;
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

    public final SemanticsOwnerKt read() {
        int iWrite = C$AutoValue_MapboxShield.write();
        return (SemanticsOwnerKt) IconCompatParcelizer(new Object[]{this}, C$AutoValue_MapboxShield.write(), -1479238312, C$AutoValue_MapboxShield.write(), 1479238314, C$AutoValue_MapboxShield.write(), iWrite);
    }

    public static final /* synthetic */ void write(IdentityVerificationActivity identityVerificationActivity) {
        int iWrite = C$AutoValue_MapboxShield.write();
        IconCompatParcelizer(new Object[]{identityVerificationActivity}, C$AutoValue_MapboxShield.write(), 1722656450, C$AutoValue_MapboxShield.write(), -1722656449, C$AutoValue_MapboxShield.write(), iWrite);
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationParams identityVerificationParams, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {identityVerificationActivity, identityVerificationParams, getbirthdatefull, Integer.valueOf(i)};
        int iWrite = C$AutoValue_MapboxShield.write();
        return (createFromParcel) IconCompatParcelizer(objArr, C$AutoValue_MapboxShield.write(), 1499772340, C$AutoValue_MapboxShield.write(), -1499772340, C$AutoValue_MapboxShield.write(), iWrite);
    }
}
