package coil3;

import android.app.ActivityManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Density;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.EmojiProcessor;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.transition.TransitionValuesMaps;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerWrapper;
import bo.app.f2$$ExternalSyntheticLambda4;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase;
import com.foodora.courier.base.presentation.dialog.MessageDialogFragment;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.model.CustomRemoteModel;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0;
import o.AnchoredDraggableNode;
import o.AndroidShadowContext_androidKt;
import o.AndroidUiFrameClockwithFrameNanos21;
import o.ClipboardUtils_androidKt;
import o.DraggableKtNoOpOnDragStarted1;
import o.ForEachGestureKt;
import o.HttpUrlFetcher;
import o.ImageKt;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.MeasureScopeMarker;
import o.MutableInteractionSourceImpl;
import o.NoWindowInsetsAnimation;
import o.OuterPlacementScope;
import o.PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1;
import o.ShaderKt;
import o.StrokeCompanion;
import o.TapGestureDetectorKtprocessTapGesture3;
import o.accessgetBevelcp;
import o.accessgetDarkencp;
import o.accessgetLayerBlockp;
import o.accessgetTvInputComposite1cp;
import o.accessisSrgb;
import o.accessplusjd;
import o.area;
import o.clamp;
import o.compositeOverOWjLjI;
import o.createFromParcel;
import o.detectTapGesturesdefault;
import o.div7Ah8Wj8;
import o.emit;
import o.getBirthDateYear;
import o.getBlurRadius;
import o.getBlurRadiusannotations;
import o.getComponents8_81llA;
import o.getExit;
import o.getInvalidateListenerui;
import o.getKeyUpCS__XNY;
import o.getLookaheadDelegate;
import o.getNoneannotations;
import o.getPivotX;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START;
import o.getSafeGestures;
import o.getSubtitle;
import o.handleUrlOverridelambda1;
import o.isChangedToDowndefault;
import o.isInfiniteannotations;
import o.lineToRelative;
import o.markNotTintable;
import o.obtainBrushFromComplexColor;
import o.onContentCardClicked;
import o.onInterceptKeyBeforeSoftKeyboardZmokQxo;
import o.onMove;
import o.onRenderProcessGone;
import o.onUnplaced;
import o.provideInsetsValuescytEWk0;
import o.quadToRelative;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setOutlineui;
import o.setStrokeLineCapBeK7IIE;
import o.setToRotateBlueimpl;
import o.triggerCallback;
import o.waitForLongPress;

/* JADX INFO: loaded from: classes.dex */
public final class Extras$Key implements getSubtitle, emit, PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1, getExit, accessgetDarkencp, compositeOverOWjLjI, StrokeCompanion, onInterceptKeyBeforeSoftKeyboardZmokQxo, MeasureScopeMarker, OuterPlacementScope, getSafeGestures {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public Extras$Key(long[] jArr) {
        AnchoredDraggableNode anchoredDraggableNode;
        this.write = 6;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            anchoredDraggableNode = new AnchoredDraggableNode(jArrCopyOf.length);
            int i = anchoredDraggableNode.RemoteActionCompatParcelizer;
            if (i < 0) {
                ForEachGestureKt.serializer("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArr2 = anchoredDraggableNode.serializer;
                if (jArr2.length < length) {
                    int i2 = read + 105;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    anchoredDraggableNode.serializer = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    int i4 = 2 % 2;
                }
                long[] jArr3 = anchoredDraggableNode.serializer;
                int i5 = anchoredDraggableNode.RemoteActionCompatParcelizer;
                if (i != i5) {
                    int i6 = RemoteActionCompatParcelizer + 11;
                    read = i6 % Fields.SpotShadowColor;
                    onContentCardClicked.IconCompatParcelizer(jArr3, jArr3, i6 % 2 == 0 ? jArrCopyOf.length >>> i : jArrCopyOf.length + i, i, i5);
                    int i7 = 2 % 2;
                }
                onContentCardClicked.IconCompatParcelizer(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                anchoredDraggableNode.RemoteActionCompatParcelizer += jArrCopyOf.length;
                int i8 = read + 101;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
        } else {
            anchoredDraggableNode = new AnchoredDraggableNode();
        }
        this.IconCompatParcelizer = anchoredDraggableNode;
    }

    @Override // o.emit
    public float write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return 0.0f;
    }

    @Override // o.PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1
    public MutableInteractionSourceImpl write(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 11;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return (ClipboardUtils_androidKt) this.IconCompatParcelizer;
        }
        int i4 = 83 / 0;
        return (ClipboardUtils_androidKt) this.IconCompatParcelizer;
    }

    @Override // o.compositeOverOWjLjI
    public String getSql() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((setToRotateBlueimpl) this.IconCompatParcelizer).IconCompatParcelizer;
        }
        String str = ((setToRotateBlueimpl) this.IconCompatParcelizer).IconCompatParcelizer;
        throw null;
    }

    public void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((getBirthDateYear) this.IconCompatParcelizer).getClass();
        } else {
            ((getBirthDateYear) this.IconCompatParcelizer).getClass();
            int i3 = 94 / 0;
        }
    }

    @Override // o.getExit
    public float read() {
        int i = 2 % 2;
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float f = -((NestedScrollView) this.IconCompatParcelizer).getVerticalScrollFactorCompat();
        int i4 = RemoteActionCompatParcelizer + 21;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    @Override // o.getExit
    public void serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((NestedScrollView) this.IconCompatParcelizer).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.abortAnimation();
            obj.hashCode();
            throw null;
        }
        ((NestedScrollView) this.IconCompatParcelizer).r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.abortAnimation();
        int i3 = read + 35;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START IconCompatParcelizer(obtainBrushFromComplexColor obtainbrushfromcomplexcolor) {
        int i = 2 % 2;
        getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(obtainbrushfromcomplexcolor.read(), new f2$$ExternalSyntheticLambda4(14, obtainbrushfromcomplexcolor));
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getstyleable_vector_drawable_path_trim_path_start;
    }

    @Override // o.emit
    public float IconCompatParcelizer(float f, long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float f2 = ((waitForLongPress) this.IconCompatParcelizer).write(f).read(j / 1000000);
        int i4 = RemoteActionCompatParcelizer + 103;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.OuterPlacementScope
    public /* synthetic */ Object then(Task task) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.IconCompatParcelizer);
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(arrayList);
        int i2 = RemoteActionCompatParcelizer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return zzwVarRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.emit
    public float read(float f, float f2, long j) {
        long j2;
        isChangedToDowndefault ischangedtodowndefaultWrite;
        int i = 2 % 2;
        int i2 = read + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            j2 = j / 1000000;
            ischangedtodowndefaultWrite = ((waitForLongPress) this.IconCompatParcelizer).write(f2);
        } else {
            j2 = j / 1000000;
            ischangedtodowndefaultWrite = ((waitForLongPress) this.IconCompatParcelizer).write(f2);
        }
        float fWrite = ischangedtodowndefaultWrite.write(j2) + f;
        int i3 = read + 107;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return fWrite;
        }
        throw null;
    }

    @Override // o.MeasureScopeMarker
    public void RemoteActionCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        int i = 2 % 2;
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                ((onUnplaced) this.IconCompatParcelizer).write(j, bundle, str, str2);
                Object obj = null;
                try {
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((onUnplaced) this.IconCompatParcelizer).write(j, bundle, str, str2);
            int i3 = RemoteActionCompatParcelizer + 23;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 89 / 0;
            }
        } catch (RemoteException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
        }
    }

    @Override // o.getExit
    public boolean startDifferentialMotionFling(float f) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0 ? f != 0.0f : f != 1.0f) {
            serializer();
            ((NestedScrollView) this.IconCompatParcelizer).read((int) f);
            int i4 = read + 45;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return true;
        }
        int i6 = i3 + 93;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public void read(String str, MessageDialogFragment messageDialogFragment) {
        DialogFragment dialogFragment;
        int i = 2 % 2;
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.IconCompatParcelizer;
        Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag(str);
        if (fragmentFindFragmentByTag instanceof DialogFragment) {
            int i2 = RemoteActionCompatParcelizer + 7;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            int i4 = RemoteActionCompatParcelizer + 73;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            dialogFragment.RemoteActionCompatParcelizer();
        }
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        isinfiniteannotations.read(0, messageDialogFragment, str, 1);
        isinfiniteannotations.read(true, true);
        int i6 = read + 63;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
    }

    @Override // o.StrokeCompanion
    public Object RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.IconCompatParcelizer;
        accessisSrgb accessissrgb = new accessisSrgb((clamp) builder.write, (clamp) builder.MediaSessionCompatQueueItem, (clamp) builder.read, (clamp) builder.MediaBrowserCompatMediaItem, (area) builder.MediaMetadataCompat, (area) builder.IconCompatParcelizer, (EmojiProcessor) builder.RemoteActionCompatParcelizer);
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return accessissrgb;
        }
        throw null;
    }

    @Override // o.emit
    public long serializer(float f) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        waitForLongPress waitforlongpress = (waitForLongPress) this.IconCompatParcelizer;
        waitforlongpress.getClass();
        float[] fArr = DraggableKtNoOpOnDragStarted1.IconCompatParcelizer;
        long jExp = ((long) (Math.exp(DraggableKtNoOpOnDragStarted1.read(f, waitforlongpress.IconCompatParcelizer * waitforlongpress.read) / (((double) detectTapGesturesdefault.read) - 1.0d)) * 1000.0d)) * 1000000;
        int i4 = read + 15;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jExp;
    }

    @Override // o.emit
    public float write(float f, float f2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        waitForLongPress waitforlongpress = (waitForLongPress) this.IconCompatParcelizer;
        waitforlongpress.getClass();
        float[] fArr = DraggableKtNoOpOnDragStarted1.IconCompatParcelizer;
        float f3 = waitforlongpress.IconCompatParcelizer * waitforlongpress.read;
        double d = DraggableKtNoOpOnDragStarted1.read(f2, f3);
        double d2 = detectTapGesturesdefault.read;
        float fSignum = (Math.signum(f2) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * d) * ((double) f3)))) + f;
        int i4 = read + 47;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fSignum;
    }

    public quadToRelative MediaMetadataCompat() {
        int i = 2 % 2;
        setStrokeLineCapBeK7IIE.write("Perseus.hits.databaseEventInfo");
        Trace.beginSection("Perseus.hits.databaseEventInfo");
        try {
            lineToRelative linetorelative = (lineToRelative) ((TrackingDatabase) this.IconCompatParcelizer).serializer();
            quadToRelative quadtorelative = (quadToRelative) TuplesKt.write(linetorelative.read, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new RoomDatabase$$ExternalSyntheticLambda2(12, linetorelative));
            Trace.endSection();
            int i2 = RemoteActionCompatParcelizer + 49;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return quadtorelative;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public int serializer(long j) {
        int i = 2;
        int i2 = 2 % 2;
        setStrokeLineCapBeK7IIE.write("Perseus.hits.deleteEventsOlderThan");
        Trace.beginSection("Perseus.hits.deleteEventsOlderThan");
        try {
            int iIntValue = ((Number) TuplesKt.write(((lineToRelative) ((TrackingDatabase) this.IconCompatParcelizer).serializer()).read, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new FlowKt__DelayKt$$ExternalSyntheticLambda0(j, i))).intValue();
            Trace.endSection();
            int i3 = RemoteActionCompatParcelizer + 55;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // o.accessgetDarkencp
    public void IconCompatParcelizer(int i, Object obj) {
        String str;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 123;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                int i6 = i3 + 7;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            SentryLogcatAdapter.read("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.IconCompatParcelizer).setResultCode(i);
    }

    public void IconCompatParcelizer(long j) {
        int i = 2 % 2;
        triggerCallback triggercallback = (triggerCallback) this.IconCompatParcelizer;
        triggercallback.MediaSessionCompatToken();
        triggercallback.MediaSessionCompatQueueItem();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        if (lookaheadScopeKt.serializer(j)) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.RatingCompat.serializer(true);
            lookaheadScopeKtLookaheadScope221.MediaMetadataCompat().MediaSessionCompatQueueItem();
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.MediaSessionCompatQueueItem.serializer(j);
        if (lookaheadScopeKt.RatingCompat.read()) {
            int i2 = read + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                write(j);
                throw null;
            }
            write(j);
        }
        int i3 = RemoteActionCompatParcelizer + 97;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.compositeOverOWjLjI
    public void bindTo(getComponents8_81llA getcomponents8_81lla) {
        setToRotateBlueimpl settorotateblueimpl;
        int length;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 109;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            settorotateblueimpl = (setToRotateBlueimpl) this.IconCompatParcelizer;
            length = settorotateblueimpl.serializer.length;
            i = 0;
        } else {
            settorotateblueimpl = (setToRotateBlueimpl) this.IconCompatParcelizer;
            length = settorotateblueimpl.serializer.length;
            i = 1;
        }
        while (i < length) {
            int i5 = read + 29;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? (i2 = settorotateblueimpl.serializer[i]) == 1 : (i2 = settorotateblueimpl.serializer[i]) == 1) {
                getcomponents8_81lla.IconCompatParcelizer(i, settorotateblueimpl.MediaDescriptionCompat[i]);
            } else if (i2 == 2) {
                getcomponents8_81lla.write(settorotateblueimpl.RatingCompat[i], i);
            } else if (i2 == 3) {
                String str = settorotateblueimpl.MediaMetadataCompat[i];
                str.getClass();
                getcomponents8_81lla.serializer(i, str);
            } else if (i2 == 4) {
                byte[] bArr = settorotateblueimpl.RemoteActionCompatParcelizer[i];
                bArr.getClass();
                getcomponents8_81lla.IconCompatParcelizer(i, bArr);
            } else if (i2 == 5) {
                getcomponents8_81lla.serializer(i);
            }
            i++;
            int i6 = read + 29;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public Extras$Key(List list) {
        this.write = 27;
        this.IconCompatParcelizer = list;
    }

    public Extras$Key(onRenderProcessGone onrenderprocessgone, LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        this.write = 24;
        this.IconCompatParcelizer = lookaheadScopeKtLookaheadScope221;
    }

    public Extras$Key(Set set) {
        this.write = 1;
        this.IconCompatParcelizer = new HashMap();
        Iterator it = set.iterator();
        int i = 2 % 2;
        while (it.hasNext()) {
            int i2 = read + 21;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidUiFrameClockwithFrameNanos21 androidUiFrameClockwithFrameNanos21 = (AndroidUiFrameClockwithFrameNanos21) it.next();
            HashMap map = (HashMap) this.IconCompatParcelizer;
            androidUiFrameClockwithFrameNanos21.getClass();
            map.put(CustomRemoteModel.class, androidUiFrameClockwithFrameNanos21.read);
        }
        int i4 = read + 39;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public Extras$Key(TrackingDatabase trackingDatabase) {
        this.write = 17;
        trackingDatabase.getClass();
        this.IconCompatParcelizer = trackingDatabase;
    }

    public Extras$Key(div7Ah8Wj8 div7ah8wj8) {
        this.write = 19;
        div7ah8wj8.getClass();
        this.IconCompatParcelizer = div7ah8wj8;
    }

    public Extras$Key(Density density) {
        this.write = 3;
        this.IconCompatParcelizer = new waitForLongPress(density, TapGestureDetectorKtprocessTapGesture3.read);
    }

    public Extras$Key(WorkDatabase workDatabase) {
        this.write = 11;
        workDatabase.getClass();
        this.IconCompatParcelizer = workDatabase;
    }

    public /* synthetic */ Extras$Key(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    public Extras$Key() {
        this.write = 9;
        this.IconCompatParcelizer = null;
    }

    public Extras$Key(float f, float f2) {
        this.write = 4;
        this.IconCompatParcelizer = new ClipboardUtils_androidKt(f, f2, 0.01f);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[PHI: r2 r4
  0x0035: PHI (r2v9 o.getPivotX) = (r2v8 o.getPivotX), (r2v11 o.getPivotX) binds: [B:12:0x0033, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:12:0x0033, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    public Object report(String str, ContinuationImpl continuationImpl) {
        getPivotX getpivotx;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 5;
        int i4 = i3 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        AndroidShadowContext_androidKt androidShadowContext_androidKt = null;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof getPivotX;
            throw null;
        }
        if (continuationImpl instanceof getPivotX) {
            int i5 = i4 + 3;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpivotx = (getPivotX) continuationImpl;
                i = getpivotx.serializer;
                int i6 = 82 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getpivotx.serializer = i - Integer.MIN_VALUE;
                } else {
                    getpivotx = new getPivotX(this, continuationImpl);
                }
            } else {
                getpivotx = (getPivotX) continuationImpl;
                i = getpivotx.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getpivotx.serializer = i - Integer.MIN_VALUE;
                } else {
                    getpivotx = new getPivotX(this, continuationImpl);
                }
            }
        } else {
            getpivotx = new getPivotX(this, continuationImpl);
        }
        Object objSerializer = getpivotx.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getpivotx.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.IconCompatParcelizer;
            getpivotx.read = str;
            getpivotx.serializer = 1;
            objSerializer = transitionValuesMaps.serializer(str, getpivotx);
            if (objSerializer == coroutineSingletons) {
                int i8 = RemoteActionCompatParcelizer + 91;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getpivotx.read;
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        }
        Map map = (Map) objSerializer;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                ConcurrentHashMap concurrentHashMap = getInvalidateListenerui.write;
                str.getClass();
                str2.getClass();
                getInvalidateListenerui.RemoteActionCompatParcelizer(str, str2, new markNotTintable(jLongValue, androidShadowContext_androidKt, 6));
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = read + 43;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c A[PHI: r9
  0x008c: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v11 java.lang.Object) binds: [B:29:0x0089, B:26:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r9 == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getNextEvents(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.Extras$Key.getNextEvents(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void write(long j) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            triggerCallback triggercallback = (triggerCallback) this.IconCompatParcelizer;
            triggercallback.MediaSessionCompatToken();
            ((LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        triggerCallback triggercallback2 = (triggerCallback) this.IconCompatParcelizer;
        triggercallback2.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (lookaheadScopeKtLookaheadScope221.write()) {
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.MediaSessionCompatQueueItem.serializer(j);
            lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.read(j, Long.valueOf(j2), "auto", "_sid");
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.PlaybackStateCompat.serializer(j2);
            lookaheadScopeKt.RatingCompat.serializer(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.write(j, bundle, "auto", "_s");
            String strRatingCompat = lookaheadScopeKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat();
            if (!TextUtils.isEmpty(strRatingCompat)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strRatingCompat);
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
                noWindowInsetsAnimation.write(j, bundle2, "auto", "_ssr");
            }
        }
        int i3 = RemoteActionCompatParcelizer + 65;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.getSafeGestures
    public Object m_() {
        Map map;
        Map map2;
        int i = 2 % 2;
        if (this.write != 22) {
            provideInsetsValuescytEWk0 provideinsetsvaluescytewk0 = (provideInsetsValuescytEWk0) ((getSafeGestures) this.IconCompatParcelizer).m_();
            if (provideinsetsvaluescytewk0 != null) {
                return provideinsetsvaluescytewk0;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable @Provides method");
            return null;
        }
        getKeyUpCS__XNY getkeyupcs__xny = (getKeyUpCS__XNY) this.IconCompatParcelizer;
        ContentResolver contentResolver = getkeyupcs__xny.serializer;
        Uri uri = getkeyupcs__xny.write;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                SentryLogcatAdapter.IconCompatParcelizer("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, getKeyUpCS__XNY.RemoteActionCompatParcelizer, null, null, null);
                try {
                    if (cursorQuery == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        int i2 = RemoteActionCompatParcelizer + 105;
                        read = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        map2 = Collections.EMPTY_MAP;
                    } else {
                        Map imageKt = count <= 256 ? new ImageKt(count) : new HashMap(count, 1.0f);
                        while (cursorQuery.moveToNext()) {
                            imageKt.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (cursorQuery.isAfterLast()) {
                            cursorQuery.close();
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            int i4 = RemoteActionCompatParcelizer + 47;
                            read = i4 % Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            return imageKt;
                        }
                        SentryLogcatAdapter.IconCompatParcelizer("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                        map2 = Collections.EMPTY_MAP;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map2;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        int i6 = RemoteActionCompatParcelizer + 99;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                SentryLogcatAdapter.write("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                map = Collections.EMPTY_MAP;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        triggerCallback triggercallback = (triggerCallback) this.IconCompatParcelizer;
        triggercallback.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) triggercallback.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        accessgettvinputcomposite1cp.getClass();
        if (lookaheadScopeKt.serializer(System.currentTimeMillis())) {
            LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
            lookaheadScopeKt2.RatingCompat.serializer(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                int i4 = read + 65;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Detected application was in foreground");
                accessgettvinputcomposite1cp.getClass();
                write(System.currentTimeMillis());
            }
        }
        int i6 = RemoteActionCompatParcelizer + 31;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.IconCompatParcelizer).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        boolean zIsLoggable = Log.isLoggable(getlookaheaddelegate.ResultReceiver(), 3);
        int i4 = read + 79;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zIsLoggable;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0163  */
    /* JADX WARN: Code duplicated, block: B:21:0x0176  */
    /* JADX WARN: Code duplicated, block: B:28:0x01b8  */
    public getBlurRadiusannotations write(ShaderKt shaderKt, accessgetLayerBlockp accessgetlayerblockp) {
        boolean z;
        boolean z2;
        Bitmap.Config config;
        boolean z3;
        int i = 2 % 2;
        Context context = shaderKt.read;
        getBlurRadius getblurradius = shaderKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getNoneannotations getnoneannotations = shaderKt.ComponentActivity;
        String str = shaderKt.MediaBrowserCompatMediaItem;
        HttpUrlFetcher httpUrlFetcher = shaderKt.ParcelableVolumeInfo;
        setOutlineui setoutlineui = shaderKt.ResultReceiver;
        setOutlineui setoutlineui2 = shaderKt.MediaSessionCompatQueueItem;
        setOutlineui setoutlineui3 = shaderKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Extras$Key extras$Key = LinearGradientShaderVjE6UOU.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        Bitmap.Config config2 = (Bitmap.Config) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{shaderKt, extras$Key});
        Extras$Key extras$Key2 = LinearGradientShaderVjE6UOU.read;
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        boolean zBooleanValue = ((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, new Object[]{shaderKt, extras$Key2})).booleanValue();
        Extras$Key extras$Key3 = LinearGradientShaderVjE6UOUdefault.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        if (((List) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer3, new Object[]{shaderKt, extras$Key3})).isEmpty()) {
            z = true;
        } else {
            int i2 = read + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Bitmap.Config[] configArr = accessgetBevelcp.write;
            int iRemoteActionCompatParcelizer4 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            if (onContentCardClicked.IconCompatParcelizer(configArr, (Bitmap.Config) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, new Object[]{shaderKt, extras$Key}))) {
                int i4 = read + 71;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        int iRemoteActionCompatParcelizer5 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        Bitmap.Config config3 = (Bitmap.Config) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer5, new Object[]{shaderKt, extras$Key});
        Bitmap.Config config4 = Bitmap.Config.HARDWARE;
        if (config3 == config4) {
            int iRemoteActionCompatParcelizer6 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            if (((Bitmap.Config) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer6, new Object[]{shaderKt, extras$Key})) == config4) {
                Object[] objArr = {shaderKt, LinearGradientShaderVjE6UOU.serializer};
                if (((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr)).booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z) {
            int i6 = read + 35;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!z2) {
                config = Bitmap.Config.ARGB_8888;
            }
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            int iRemoteActionCompatParcelizer7 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            if (((List) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer7, new Object[]{shaderKt, extras$Key3})).isEmpty()) {
                int i8 = RemoteActionCompatParcelizer + 115;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (config != Bitmap.Config.ALPHA_8) {
                    config = config2;
                    z3 = true;
                } else {
                    config = config2;
                    config = config2;
                    config = config2;
                    z3 = false;
                }
            } else {
                config = config2;
                config = config2;
                config = config2;
                z3 = false;
            }
        } else {
            config = config2;
            config = config2;
            config = config2;
            z3 = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(shaderKt.IconCompatParcelizer.RemoteActionCompatParcelizer.read, shaderKt.RatingCompat.read));
        int iRemoteActionCompatParcelizer8 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        if (config != ((Bitmap.Config) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer8, new Object[]{shaderKt, extras$Key}))) {
            int i10 = read + 83;
            int i11 = i10 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i11;
            int i12 = i10 % 2;
            if (config != null) {
                int i13 = i11 + 45;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                linkedHashMap.put(extras$Key, config);
            } else {
                linkedHashMap.remove(extras$Key);
            }
        }
        int iRemoteActionCompatParcelizer9 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        if (z3 != ((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer9, new Object[]{shaderKt, extras$Key2})).booleanValue()) {
            linkedHashMap.put(extras$Key2, Boolean.valueOf(z3));
        }
        getBlurRadiusannotations getblurradiusannotations = new getBlurRadiusannotations(context, accessgetlayerblockp, getblurradius, getnoneannotations, str, httpUrlFetcher, setoutlineui, setoutlineui2, setoutlineui3, new accessplusjd(DelayKt.write(linkedHashMap)));
        int i15 = read + 55;
        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            int i16 = 95 / 0;
        }
        return getblurradiusannotations;
    }
}
