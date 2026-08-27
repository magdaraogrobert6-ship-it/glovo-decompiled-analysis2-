package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setDropDownVerticalOffset implements getDrawerToggleDelegate, getOutOfFrameExecutor {
    public static int read = -1;
    public Object IconCompatParcelizer;
    public boolean serializer;

    public boolean read() {
        return this.serializer;
    }

    public DrawModifierNodeKt IconCompatParcelizer() {
        List list = (List) this.IconCompatParcelizer;
        if (list.isEmpty()) {
            return EncoderImplMediaCodecCallback.IconCompatParcelizer;
        }
        PendingValue pendingValueRemoteActionCompatParcelizer = VideoQualityQuirk.RemoteActionCompatParcelizer(new ArrayList(list));
        getTrackDrawable gettrackdrawable = new getTrackDrawable(21);
        return VideoQualityQuirk.write((DrawModifierNodeKt) VideoQualityQuirk.serializer(pendingValueRemoteActionCompatParcelizer, new androidx.camera.view.PendingValue(5, gettrackdrawable), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read()));
    }

    public void RemoteActionCompatParcelizer() {
        LinkedList linkedList = new LinkedList((List) this.IconCompatParcelizer);
        while (!linkedList.isEmpty()) {
            DrawModifierNodeKt drawModifierNodeKt = (DrawModifierNodeKt) linkedList.poll();
            Objects.requireNonNull(drawModifierNodeKt);
            drawModifierNodeKt.cancel(true);
        }
    }

    @Override // o.getDrawerToggleDelegate
    public void read(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        onSupportActionModeStarted onsupportactionmodestarted;
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) this.IconCompatParcelizer;
        if (this.serializer) {
            return;
        }
        this.serializer = true;
        setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility = onBackPressedCallback.write.PlaybackStateCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (setsupportprogressbarindeterminatevisibility != null && (onsupportactionmodestarted = setsupportprogressbarindeterminatevisibility.PlaybackStateCompatCustomAction) != null) {
            onsupportactionmodestarted.RemoteActionCompatParcelizer();
            openOptionsMenu openoptionsmenu = onsupportactionmodestarted.serializer;
            if (openoptionsmenu != null && openoptionsmenu.serializer()) {
                openoptionsmenu.MediaMetadataCompat.RemoteActionCompatParcelizer();
            }
        }
        onBackPressedCallback.MediaSessionCompatQueueItem.onPanelClosed(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        this.serializer = false;
    }

    @Override // o.getDrawerToggleDelegate
    public boolean read(AlertControllerButtonHandler alertControllerButtonHandler) {
        ((OnBackPressedCallback) this.IconCompatParcelizer).MediaSessionCompatQueueItem.onMenuOpened(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        return true;
    }

    @Override // o.getOutOfFrameExecutor
    public zp serializer() {
        boolean z = this.serializer;
        accessgetPrecomposeMapp accessgetprecomposemapp = (accessgetPrecomposeMapp) this.IconCompatParcelizer;
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.RatingCompat = z ? accessgetCurrentApproachIndexp.TYPE_THICK : accessgetCurrentApproachIndexp.TYPE_THIN;
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(7, false);
        pinnableContainerKtLocalPinnableContainer1.serializer = accessgetprecomposemapp;
        blockRunner.RemoteActionCompatParcelizer = new applyPausedPrecompositionlambda000(pinnableContainerKtLocalPinnableContainer1);
        return new zp(blockRunner, 0, (byte) 0);
    }

    public setDropDownVerticalOffset(boolean z) {
        this.IconCompatParcelizer = Collections.synchronizedList(new ArrayList());
        this.serializer = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean write(int i, CharSequence charSequence) {
        char c = 0;
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((getRootFocusNodeui) this.IconCompatParcelizer) == null) {
                return read();
            }
            c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.serializer;
                if (directionality == 0) {
                    c = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            c = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            continue;
                    }
                }
            }
            if (c == 0) {
                return true;
            }
            if (c != 1) {
                return read();
            }
            return false;
        }
        DrawableTransformation.write();
        return false;
    }

    public CameraCaptureSession.CaptureCallback IconCompatParcelizer(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.serializer) {
            return captureCallback;
        }
        getDividerDrawable getdividerdrawable = new getDividerDrawable(2);
        onDrawBehind ondrawbehind = (onDrawBehind) getdividerdrawable.read;
        ((List) this.IconCompatParcelizer).add(ondrawbehind);
        ondrawbehind.serializer.RemoteActionCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(this, getdividerdrawable, ondrawbehind, 4), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        return new getOrientation(Arrays.asList(getdividerdrawable, captureCallback));
    }

    public static boolean write(getThumbTintList getthumbtintlist) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) getthumbtintlist.write(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ setDropDownVerticalOffset(Object obj, boolean z) {
        this.serializer = z;
        this.IconCompatParcelizer = obj;
    }

    public /* synthetic */ setDropDownVerticalOffset(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    public setDropDownVerticalOffset(getRootFocusNodeui getrootfocusnodeui, boolean z) {
        this(getrootfocusnodeui);
        this.serializer = z;
    }

    public setDropDownVerticalOffset(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.IconCompatParcelizer = bottomSheetBehavior;
        this.serializer = z;
    }

    public setDropDownVerticalOffset() {
    }
}
