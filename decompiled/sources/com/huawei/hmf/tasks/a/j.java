package com.huawei.hmf.tasks.a;

import android.content.res.AssetFileDescriptor;
import android.hardware.camera2.CaptureResult;
import android.media.CamcorderProfile;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.NavArgsLazy;
import coil3.util.UtilsKt;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.location.zzdg;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzac;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidFontResourceLoader;
import o.AnimatedVisibilityKtAnimatedVisibilityImpl11;
import o.Camera2CameraControlExternalSyntheticLambda1;
import o.CameraXExternalSyntheticLambda0;
import o.CaptureRequestOptionsBuilderExternalSyntheticLambda0;
import o.DrawScope;
import o.Lab;
import o.LtrBoundsComparator;
import o.MediaSessionCompatQueueItem;
import o.OneDimensionalFocusSearchKtgenerateAndSearchChildren1;
import o.OnePixelShiftQuirk;
import o.ParentDataModifierDefaultImpls;
import o.PausedPrecompositionImpl;
import o.ScrollCaptureCandidate;
import o.StrokeCompanion;
import o.TorchIsClosedAfterImageCapturingQuirk;
import o.Vertices;
import o.VideoEncoderCrashQuirk;
import o.WrappedCompositionsetContent1211;
import o.ZslDisablerQuirk;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetSwitchcp;
import o.eotfFunclambda0;
import o.getFirstBaselineToTopHeight;
import o.getLocalSavedStateRegistryOwnerannotations;
import o.getMinusEK5gGoQ;
import o.getNumPadDeleteEK5gGoQ;
import o.getViewportBoundsInWindow;
import o.getY;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.setInflatedId;
import o.setIntrinsicsUsageByParentui;
import o.verifyShadowColorProperties;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements getFirstBaselineToTopHeight, CameraXExternalSyntheticLambda0, VideoEncoderCrashQuirk, Arrangement.Horizontal, OneDimensionalFocusSearchKtgenerateAndSearchChildren1, Vertices, getY, DrawScope, StrokeCompanion, verifyShadowColorProperties, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, PausedPrecompositionImpl, accessgetNumPadRightParenthesiscp, setIntrinsicsUsageByParentui, AndroidFontResourceLoader, LtrBoundsComparator, getViewportBoundsInWindow, ScrollCaptureCandidate {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public static final /* synthetic */ j serializer = new j(20);
    public static final /* synthetic */ j write = new j(21);
    public static final /* synthetic */ j RemoteActionCompatParcelizer = new j(22);
    public static final /* synthetic */ j read = new j(23);

    public j(AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11) {
        this.IconCompatParcelizer = 6;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public CaptureResult IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 109;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = i3 + 9;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // o.Vertices
    public float MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 67;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0.0f;
    }

    @Override // o.Vertices
    public boolean ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.Vertices
    public boolean serializer(float f) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 111;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        return i2 % 2 == 0;
    }

    @Override // o.getY
    public void write(eotfFunclambda0 eotffunclambda0, NavArgsLazy navArgsLazy) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 31;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public OnePixelShiftQuirk MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return OnePixelShiftQuirk.read;
        }
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        throw null;
    }

    @Override // o.Vertices
    public float MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 111;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 1.0f;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public long RatingCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 63;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -1L;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public /* bridge */ /* synthetic */ void inject(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 23;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public CaptureRequestOptionsBuilderExternalSyntheticLambda0 read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 69;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            CaptureRequestOptionsBuilderExternalSyntheticLambda0 captureRequestOptionsBuilderExternalSyntheticLambda0 = CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN;
            obj.hashCode();
            throw null;
        }
        CaptureRequestOptionsBuilderExternalSyntheticLambda0 captureRequestOptionsBuilderExternalSyntheticLambda1 = CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN;
        int i3 = MediaSessionCompatToken + 55;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return captureRequestOptionsBuilderExternalSyntheticLambda1;
        }
        throw null;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public Camera2CameraControlExternalSyntheticLambda1 serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 125;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = Camera2CameraControlExternalSyntheticLambda1.UNKNOWN;
        int i4 = PlaybackStateCompatCustomAction + 1;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return camera2CameraControlExternalSyntheticLambda1;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public ZslDisablerQuirk u_() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 89;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ZslDisablerQuirk zslDisablerQuirk = ZslDisablerQuirk.UNKNOWN;
        int i4 = MediaSessionCompatToken + 91;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zslDisablerQuirk;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public TorchIsClosedAfterImageCapturingQuirk write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 59;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TorchIsClosedAfterImageCapturingQuirk torchIsClosedAfterImageCapturingQuirk = TorchIsClosedAfterImageCapturingQuirk.UNKNOWN;
        int i4 = PlaybackStateCompatCustomAction + 9;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return torchIsClosedAfterImageCapturingQuirk;
    }

    @Override // o.LtrBoundsComparator
    public void IconCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 5;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            WrappedCompositionsetContent1211.read(str, str2);
            obj.hashCode();
            throw null;
        }
        WrappedCompositionsetContent1211.read(str, str2);
        int i3 = PlaybackStateCompatCustomAction + 79;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.LtrBoundsComparator
    public void RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 105;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            WrappedCompositionsetContent1211.read();
            throw null;
        }
        WrappedCompositionsetContent1211.read();
        int i3 = MediaSessionCompatToken + 37;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.LtrBoundsComparator
    public void read(String str, String str2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 19;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(str, str2);
        int i4 = PlaybackStateCompatCustomAction + 49;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LtrBoundsComparator
    public void write(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 51;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WrappedCompositionsetContent1211.write(str, str2);
        int i4 = MediaSessionCompatToken + 29;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    static {
        int i = MediaSessionCompatResultReceiverWrapper + 51;
        ParcelableVolumeInfo = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.getFirstBaselineToTopHeight
    public CamcorderProfile RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = PlaybackStateCompatCustomAction + 105;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        CamcorderProfile camcorderProfile = CamcorderProfile.get(i, i2);
        int i6 = MediaSessionCompatToken + 7;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return camcorderProfile;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public void RemoteActionCompatParcelizer(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 99;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Arrangement.RemoteActionCompatParcelizer(i, iArr, iArr2, false);
        int i5 = MediaSessionCompatToken + 47;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.getFirstBaselineToTopHeight
    public boolean write(int i, int i2) {
        boolean zHasProfile;
        int i3 = 2 % 2;
        int i4 = MediaSessionCompatToken + 61;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            zHasProfile = CamcorderProfile.hasProfile(i, i2);
            int i5 = 65 / 0;
        } else {
            zHasProfile = CamcorderProfile.hasProfile(i, i2);
        }
        int i6 = PlaybackStateCompatCustomAction + 35;
        MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return zHasProfile;
    }

    @Override // o.getY
    public File RemoteActionCompatParcelizer(eotfFunclambda0 eotffunclambda0) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 1;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.StrokeCompanion
    public Object RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = MediaSessionCompatToken + 99;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    @Override // o.ScrollCaptureCandidate
    public String IconCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 111;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        int i4 = PlaybackStateCompatCustomAction + 65;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strEncodeToString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AndroidFontResourceLoader
    public Object write(getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 63;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(getlocalsavedstateregistryownerannotations.RemoteActionCompatParcelizer);
        int i4 = PlaybackStateCompatCustomAction + 73;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return numValueOf;
    }

    public /* synthetic */ j(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.Vertices
    public boolean IconCompatParcelizer(float f) {
        int i = 2 % 2;
        throw new IllegalStateException("not implemented");
    }

    @Override // o.Vertices
    public Lab MediaDescriptionCompat() {
        int i = 2 % 2;
        throw new IllegalStateException("not implemented");
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 113;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            UtilsKt.RemoteActionCompatParcelizer("In-progress recording shouldn't be null", false);
            throw null;
        }
        UtilsKt.RemoteActionCompatParcelizer("In-progress recording shouldn't be null", false);
        throw null;
    }

    @Override // o.PausedPrecompositionImpl
    public /* synthetic */ Task then(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 81;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            int i3 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
            obj2.hashCode();
            throw null;
        }
        int i4 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        int i5 = MediaSessionCompatToken + 103;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return zzwVarRemoteActionCompatParcelizer;
    }

    public String toString() {
        int i = 2 % 2;
        Object obj = null;
        if (this.IconCompatParcelizer != 7) {
            String string = super.toString();
            int i2 = MediaSessionCompatToken + 123;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }
        int i3 = MediaSessionCompatToken + 79;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return "AbsoluteArrangement#Right";
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        int i = 2 % 2;
        setInflatedId.IconCompatParcelizer(3, "Recorder");
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    @Override // o.OneDimensionalFocusSearchKtgenerateAndSearchChildren1, o.setIntrinsicsUsageByParentui
    public byte[] read(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = PlaybackStateCompatCustomAction + 45;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer == 9) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        int i5 = PlaybackStateCompatCustomAction + 71;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return bArrCopyOfRange;
    }

    @Override // o.DrawScope
    public void IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 23;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } else {
            AssetFileDescriptor assetFileDescriptor2 = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
            int i3 = 38 / 0;
        }
    }

    @Override // o.DrawScope
    public void RemoteActionCompatParcelizer(MediaExtractor mediaExtractor, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 19;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            int i3 = 21 / 0;
        } else {
            AssetFileDescriptor assetFileDescriptor2 = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
        int i4 = PlaybackStateCompatCustomAction + 87;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    @Override // o.getViewportBoundsInWindow
    public byte[] IconCompatParcelizer(String str) throws CodecException {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 31;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            int i4 = MediaSessionCompatToken + 5;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return bArrDecode;
            }
            throw null;
        } catch (Exception e) {
            throw new CodecException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("Base64 decode fail : ")));
        }
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 117;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        if (i4 != 21) {
            if (i4 == 22) {
                ((zzdz) obj).serializer((ParentDataModifierDefaultImpls) obj2);
                return;
            }
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((zzdz) obj).MediaSessionCompatResultReceiverWrapper();
            zzdg zzdgVar = new zzdg(2, (ParentDataModifierDefaultImpls) obj2);
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            int i5 = getMinusEK5gGoQ.IconCompatParcelizer;
            parcelZza.writeStrongBinder(zzdgVar.asBinder());
            getnumpaddeleteek5ggoq.zzc(95, parcelZza);
            return;
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        zzdz zzdzVar = (zzdz) obj;
        zzad zzadVarZza = zzac.zza();
        if (!zzdzVar.IconCompatParcelizer(zzo.zzj)) {
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) zzdzVar.MediaSessionCompatResultReceiverWrapper();
            String packageName = zzdzVar.ParcelableVolumeInfo.getPackageName();
            Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
            parcelZza2.writeString(packageName);
            Parcel parcelZzb = getnumpaddeleteek5ggoq2.zzb(34, parcelZza2);
            LocationAvailability locationAvailability = (LocationAvailability) getMinusEK5gGoQ.read(parcelZzb, LocationAvailability.CREATOR);
            parcelZzb.recycle();
            parentDataModifierDefaultImpls.IconCompatParcelizer(locationAvailability);
            return;
        }
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq3 = (getNumPadDeleteEK5gGoQ) zzdzVar.MediaSessionCompatResultReceiverWrapper();
        zzee zzeeVar = new zzee(5, null, new zzdg(1, parentDataModifierDefaultImpls), null, null);
        Parcel parcelZza3 = getnumpaddeleteek5ggoq3.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza3, zzadVarZza);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza3, zzeeVar);
        getnumpaddeleteek5ggoq3.zzc(91, parcelZza3);
        int i6 = PlaybackStateCompatCustomAction + 75;
        MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4.isEmpty() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r13 = com.huawei.hmf.tasks.a.j.MediaSessionCompatToken + 123;
        com.huawei.hmf.tasks.a.j.PlaybackStateCompatCustomAction = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r4.isEmpty() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.SupportedSurfaceCombination serializer(androidx.camera.core.LegacySessionConfig r13, o.FocusMeteringAction r14) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hmf.tasks.a.j.serializer(androidx.camera.core.LegacySessionConfig, o.FocusMeteringAction):o.SupportedSurfaceCombination");
    }
}
