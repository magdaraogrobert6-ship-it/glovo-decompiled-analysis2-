package androidx.cardview.widget;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2;
import bo.app.bb$$ExternalSyntheticLambda0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Loading;
import com.deliveryhero.performance.core.calculator.PerformanceMetaDataProviderImpl$loadMetaData$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.zzj;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.DragAndDropNodeacceptDragAndDropTransfer1;
import o.InterceptedKeyInputNode;
import o.ParentDataModifierDefaultImpls;
import o.PlatformIndirectPointerEvent;
import o.PlatformShadowContext;
import o.ShaderKt;
import o.ShadowScope;
import o.ShortNewsContentCardView;
import o.SimpleGraphicsLayerModifier;
import o.Size;
import o.TransferParameters;
import o.accessgetAlpha8cp;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetNumPadEntercp;
import o.accessgetNumPadEqualscp;
import o.accessgetRgb565cp;
import o.accessgetStrokecp;
import o.accessrewindjd;
import o.createFromParcel;
import o.dashPathEffect;
import o.div7Ah8Wj8;
import o.drawOutlinewDX37Wwdefault;
import o.drawWithRotationAndOffsetubNVwUQ;
import o.getBirthDateMonth;
import o.getCharSequenceBounds;
import o.getClipannotations;
import o.getDefaultShadowColor;
import o.getDistanceimpl;
import o.getEvenOddRgk1Os;
import o.getInfiniteF1C5BW0;
import o.getOffsetRKDOV3M;
import o.getRadiusD9Ej5fM;
import o.getSpotColor0d7_KjU;
import o.getZeroF1C5BW0annotations;
import o.handleUrlOverridelambda1;
import o.invalidateShadow;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isPQishui_graphics;
import o.lerpNonNull;
import o.mapMKHz9U;
import o.onItemDismiss;
import o.onMove;
import o.onRemeasuredozmzZPI;
import o.onViewAttachedToWindowlambda0;
import o.parseLayoutDescription;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.setBlock;
import o.setVisibility;
import o.unaryMinusF1C5BW0;
import org.xmlpull.v1.XmlPullParserException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public class CardView$1 implements setVisibility, getBirthDateMonth, invalidateShadow, getDistanceimpl, SimpleGraphicsLayerModifier, InterceptedKeyInputNode {
    private static int serializer = 0;
    private static int write = 1;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // o.setVisibility
    public void RemoteActionCompatParcelizer(int i, float f) {
        int i2 = 2 % 2;
        int i3 = write + 111;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public accessgetRgb565cp IconCompatParcelizer(mapMKHz9U mapmkhz9u) {
        accessgetRgb565cp accessgetrgb565cpSerializer;
        synchronized (this.IconCompatParcelizer) {
            accessgetrgb565cpSerializer = ((accessgetCompositingStrategyNrFUSIjd) this.RemoteActionCompatParcelizer).serializer(mapmkhz9u);
        }
        return accessgetrgb565cpSerializer;
    }

    public void RemoteActionCompatParcelizer(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.RemoteActionCompatParcelizer;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.IconCompatParcelizer;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).IconCompatParcelizer(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((ParentDataModifierDefaultImpls) entry2.getKey()).IconCompatParcelizer((Exception) new ApiException(status));
            }
        }
    }

    public boolean RemoteActionCompatParcelizer(mapMKHz9U mapmkhz9u) {
        boolean zContainsKey;
        synchronized (this.IconCompatParcelizer) {
            zContainsKey = ((accessgetCompositingStrategyNrFUSIjd) this.RemoteActionCompatParcelizer).serializer.containsKey(mapmkhz9u);
        }
        return zContainsKey;
    }

    public accessgetRgb565cp write(mapMKHz9U mapmkhz9u) {
        accessgetRgb565cp accessgetrgb565cp;
        mapmkhz9u.getClass();
        synchronized (this.IconCompatParcelizer) {
            accessgetrgb565cp = ((accessgetCompositingStrategyNrFUSIjd) this.RemoteActionCompatParcelizer).read(mapmkhz9u);
        }
        return accessgetrgb565cp;
    }

    @Override // o.getDistanceimpl
    public Object write() {
        int i = 2 % 2;
        int i2 = serializer + 35;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getInfiniteF1C5BW0 getinfinitef1c5bw0 = (getInfiniteF1C5BW0) this.RemoteActionCompatParcelizer;
        int i4 = i3 + 123;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getinfinitef1c5bw0;
    }

    public CardView$1(int i) {
        this.read = i;
        if (i == 3) {
            this.RemoteActionCompatParcelizer = new onRemeasuredozmzZPI();
            this.IconCompatParcelizer = new onRemeasuredozmzZPI();
            return;
        }
        if (i == 14) {
            this.RemoteActionCompatParcelizer = new TransferParameters(null);
            this.IconCompatParcelizer = new HashMap();
            return;
        }
        if (i == 28) {
            this.RemoteActionCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());
            this.IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());
            return;
        }
        this.RemoteActionCompatParcelizer = new ArrayList();
        float[] fArr = new float[5];
        int i2 = 0;
        while (i2 < 5) {
            int i3 = serializer + 37;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                fArr[i2] = Float.NaN;
                i2 += 2;
            } else {
                fArr[i2] = Float.NaN;
                i2++;
            }
            int i4 = 2 % 2;
        }
        this.IconCompatParcelizer = fArr;
        int i5 = write + 15;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public static accessgetNumPadEqualscp IconCompatParcelizer() {
        int i = 2 % 2;
        accessgetNumPadEqualscp accessgetnumpadequalscp = new accessgetNumPadEqualscp();
        accessgetnumpadequalscp.serializer = true;
        int i2 = write + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return accessgetnumpadequalscp;
    }

    @Override // o.invalidateShadow
    public Object restore(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer).invoke(obj);
        }
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer).invoke(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.invalidateShadow
    public Object save(setBlock setblock, Object obj) {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvoke = ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer).invoke(setblock, obj);
        int i4 = write + 27;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }

    public SharedPreferences read() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object objMediaSessionCompatResultReceiverWrapper = ((isAdapterPositionOnScreen) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            return (SharedPreferences) objMediaSessionCompatResultReceiverWrapper;
        }
        Object objMediaSessionCompatResultReceiverWrapper2 = ((isAdapterPositionOnScreen) this.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        int i3 = 3 / 0;
        return (SharedPreferences) objMediaSessionCompatResultReceiverWrapper2;
    }

    @Override // o.getBirthDateMonth
    public void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((DragAndDropNodeacceptDragAndDropTransfer1) this.IconCompatParcelizer).compareAndSet(1, 1)) {
            return;
        }
        int i4 = serializer + 123;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            ((bb$$ExternalSyntheticLambda0) this.RemoteActionCompatParcelizer).invoke();
        } else {
            ((bb$$ExternalSyntheticLambda0) this.RemoteActionCompatParcelizer).invoke();
            int i5 = 59 / 0;
        }
    }

    public void RemoteActionCompatParcelizer(accessgetRgb565cp accessgetrgb565cp, getClipannotations getclipannotations) {
        int i = 2 % 2;
        accessgetrgb565cp.getClass();
        accessgetStrokecp accessgetstrokecp = (accessgetStrokecp) this.IconCompatParcelizer;
        accessgetAlpha8cp accessgetalpha8cp = new accessgetAlpha8cp(this, accessgetrgb565cp, getclipannotations, 3);
        accessgetstrokecp.getClass();
        accessgetstrokecp.RemoteActionCompatParcelizer.execute(accessgetalpha8cp);
        int i2 = write + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void write(accessgetRgb565cp accessgetrgb565cp, int i) {
        int i2 = 2 % 2;
        accessgetrgb565cp.getClass();
        accessgetStrokecp accessgetstrokecp = (accessgetStrokecp) this.IconCompatParcelizer;
        drawOutlinewDX37Wwdefault drawoutlinewdx37wwdefault = new drawOutlinewDX37Wwdefault((getDefaultShadowColor) this.RemoteActionCompatParcelizer, accessgetrgb565cp, false, i);
        accessgetstrokecp.getClass();
        accessgetstrokecp.RemoteActionCompatParcelizer.execute(drawoutlinewdx37wwdefault);
        int i3 = serializer + 15;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void serializer(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = write + 47;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq = (drawWithRotationAndOffsetubNVwUQ) this.IconCompatParcelizer;
        drawwithrotationandoffsetubnvwuq.RatingCompat.set(i, i2, i3, i4);
        Rect rect = drawwithrotationandoffsetubnvwuq.RemoteActionCompatParcelizer;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        int i8 = write + 31;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    public void IconCompatParcelizer(getCharSequenceBounds getcharsequencebounds, float f) {
        int i = 2 % 2;
        int i2 = write + 107;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
            arrayList.add(getcharsequencebounds);
            int length = ((float[]) this.IconCompatParcelizer).length;
            arrayList.size();
            throw null;
        }
        ArrayList arrayList2 = (ArrayList) this.RemoteActionCompatParcelizer;
        arrayList2.add(getcharsequencebounds);
        if (((float[]) this.IconCompatParcelizer).length < arrayList2.size()) {
            int i3 = write + 5;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                this.IconCompatParcelizer = Arrays.copyOf((float[]) this.IconCompatParcelizer, arrayList2.size() >> 3);
            } else {
                this.IconCompatParcelizer = Arrays.copyOf((float[]) this.IconCompatParcelizer, arrayList2.size() + 2);
            }
        }
        ((float[]) this.IconCompatParcelizer)[arrayList2.size() - 1] = f;
        int i4 = serializer + 73;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.SimpleGraphicsLayerModifier
    public void read(accessrewindjd accessrewindjdVar) {
        Painter painterRemoteActionCompatParcelizer;
        Painter painter;
        int i = 2 % 2;
        int i2 = write + 75;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        ShaderKt shaderKt = (ShaderKt) this.RemoteActionCompatParcelizer;
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.IconCompatParcelizer;
        if (accessrewindjdVar != null) {
            int i5 = i3 + 57;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            painterRemoteActionCompatParcelizer = dashPathEffect.RemoteActionCompatParcelizer(accessrewindjdVar, shaderKt.read, asyncImagePainter.MediaMetadataCompat);
        } else {
            painterRemoteActionCompatParcelizer = null;
        }
        if (painterRemoteActionCompatParcelizer == null) {
            int i7 = serializer + 31;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Object[] objArr = {shaderKt, getEvenOddRgk1Os.serializer};
            if (((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr)).booleanValue() && (painter = asyncImagePainter.read()) != null) {
                painterRemoteActionCompatParcelizer = painter;
            }
        }
        AsyncImagePainter.RemoteActionCompatParcelizer(asyncImagePainter, new AsyncImagePainter$State$Loading(painterRemoteActionCompatParcelizer));
        int i9 = write + 31;
        serializer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 78 / 0;
        }
    }

    @Override // o.getDistanceimpl
    public boolean RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2, unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        Spannable spannable;
        int i3 = 2 % 2;
        if ((unaryminusf1c5bw0.RemoteActionCompatParcelizer & 4) > 0) {
            int i4 = write + 27;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (((getInfiniteF1C5BW0) this.RemoteActionCompatParcelizer) == null) {
            int i5 = write;
            int i6 = i5 + 71;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (charSequence instanceof Spannable) {
                int i8 = i5 + 99;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                spannable = (Spannable) charSequence;
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int i10 = serializer + 35;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                spannable = spannableString;
            }
            this.RemoteActionCompatParcelizer = new getInfiniteF1C5BW0(spannable);
        }
        ((zzj) this.IconCompatParcelizer).getClass();
        ((getInfiniteF1C5BW0) this.RemoteActionCompatParcelizer).setSpan(new getZeroF1C5BW0annotations(unaryminusf1c5bw0), i, i2, 33);
        return true;
    }

    public void IconCompatParcelizer(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = write + 55;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            fragment.getClass();
            Fragment fragment2 = ((div7Ah8Wj8) this.RemoteActionCompatParcelizer).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment3 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment3 != null) {
            div7Ah8Wj8 parentFragmentManager = fragment3.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.IconCompatParcelizer(fragment, bundle, true);
        }
        int i3 = serializer + 3;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            int i5 = serializer + 13;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!z || size.IconCompatParcelizer) {
                size.read.RatingCompat(div7ah8wj8, fragment);
            }
        }
    }

    public void MediaBrowserCompatMediaItem(Fragment fragment, boolean z) {
        div7Ah8Wj8 parentFragmentManager;
        int i = 2 % 2;
        int i2 = serializer + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i4 = write + 69;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                parentFragmentManager = fragment2.getParentFragmentManager();
                parentFragmentManager.getClass();
            } else {
                parentFragmentManager = fragment2.getParentFragmentManager();
                parentFragmentManager.getClass();
            }
            parentFragmentManager.ResultReceiver.MediaBrowserCompatMediaItem(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (!(!it.hasNext())) {
            Size size = (Size) it.next();
            if (!z || size.IconCompatParcelizer) {
                size.read.onFragmentStarted(div7ah8wj8, fragment);
            }
        }
    }

    public void MediaDescriptionCompat(Fragment fragment, boolean z) {
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.MediaDescriptionCompat(fragment, true);
            int i2 = write + 57;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (!(!it.hasNext())) {
            int i4 = write + 103;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Size size = (Size) it.next();
            if (!z || size.IconCompatParcelizer) {
                size.read.MediaSessionCompatQueueItem(div7ah8wj8, fragment);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1 r3
  0x0029: PHI (r1v6 o.div7Ah8Wj8) = (r1v5 o.div7Ah8Wj8), (r1v9 o.div7Ah8Wj8) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r3v1 androidx.fragment.app.Fragment) = (r3v0 androidx.fragment.app.Fragment), (r3v12 androidx.fragment.app.Fragment) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public void MediaMetadataCompat(Fragment fragment, boolean z) {
        div7Ah8Wj8 div7ah8wj8;
        Fragment fragment2;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 67;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            fragment.getClass();
            div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
            fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            int i4 = 88 / 0;
            if (fragment2 != null) {
                i = serializer + 39;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    parentFragmentManager.ResultReceiver.MediaMetadataCompat(fragment, false);
                } else {
                    div7Ah8Wj8 parentFragmentManager2 = fragment2.getParentFragmentManager();
                    parentFragmentManager2.getClass();
                    parentFragmentManager2.ResultReceiver.MediaMetadataCompat(fragment, true);
                }
            }
        } else {
            fragment.getClass();
            div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
            fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (fragment2 != null) {
                i = serializer + 39;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    div7Ah8Wj8 parentFragmentManager3 = fragment2.getParentFragmentManager();
                    parentFragmentManager3.getClass();
                    parentFragmentManager3.ResultReceiver.MediaMetadataCompat(fragment, false);
                } else {
                    div7Ah8Wj8 parentFragmentManager4 = fragment2.getParentFragmentManager();
                    parentFragmentManager4.getClass();
                    parentFragmentManager4.ResultReceiver.MediaMetadataCompat(fragment, true);
                }
            }
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i5 = serializer + 21;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            Size size = (Size) it.next();
            if (!z || size.IconCompatParcelizer) {
                size.read.MediaMetadataCompat(div7ah8wj8, fragment);
            }
        }
    }

    public void RatingCompat(Fragment fragment, boolean z) {
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i2 = serializer + 9;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.RatingCompat(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        int i4 = serializer + 91;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            Size size = (Size) it.next();
            if (!z || size.IconCompatParcelizer) {
                size.read.onFragmentResumed(div7ah8wj8, fragment);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[PHI: r4
  0x0054: PHI (r4v13 o.Size) = (r4v5 o.Size), (r4v15 o.Size) binds: [B:14:0x0052, B:11:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x002c A[SYNTHETIC] */
    public void RemoteActionCompatParcelizer(Fragment fragment, Bundle bundle, boolean z) {
        Size size;
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i2 = serializer + 3;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.RemoteActionCompatParcelizer(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i4 = serializer + 57;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                size = (Size) it.next();
                int i5 = 15 / 0;
                if (z) {
                    if (size.IconCompatParcelizer) {
                    }
                }
            } else {
                size = (Size) it.next();
                if (!(!z)) {
                    if (size.IconCompatParcelizer) {
                    }
                }
            }
            size.read.serializer(div7ah8wj8, fragment, bundle);
            int i6 = write + 7;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 / 5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[PHI: r4
  0x0054: PHI (r4v8 o.Size) = (r4v5 o.Size), (r4v10 o.Size) binds: [B:16:0x0052, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x002e A[SYNTHETIC] */
    public void read(Fragment fragment, boolean z) {
        Size size;
        int i = 2 % 2;
        int i2 = serializer + 39;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            fragment.getClass();
            Fragment fragment2 = ((div7Ah8Wj8) this.RemoteActionCompatParcelizer).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            throw null;
        }
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment3 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment3 != null) {
            div7Ah8Wj8 parentFragmentManager = fragment3.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.read(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i3 = write + 5;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                size = (Size) it.next();
                int i4 = 77 / 0;
                if (z) {
                    if (!size.IconCompatParcelizer) {
                    }
                }
            } else {
                size = (Size) it.next();
                if (z) {
                    if (!size.IconCompatParcelizer) {
                    }
                }
            }
            size.read.IconCompatParcelizer(div7ah8wj8, fragment);
        }
    }

    public void serializer(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = write + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i4 = write + 73;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.serializer(fragment, bundle, true);
            int i6 = write + 89;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            if (z) {
                int i8 = write + 103;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (!size.IconCompatParcelizer) {
                }
            }
            size.read.read(div7ah8wj8, fragment);
        }
    }

    public void serializer(Fragment fragment, boolean z) {
        div7Ah8Wj8 parentFragmentManager;
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            fragment.getClass();
            Fragment fragment2 = ((div7Ah8Wj8) this.RemoteActionCompatParcelizer).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            throw null;
        }
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment3 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment3 != null) {
            int i3 = serializer + 87;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                parentFragmentManager = fragment3.getParentFragmentManager();
                parentFragmentManager.getClass();
            } else {
                parentFragmentManager = fragment3.getParentFragmentManager();
                parentFragmentManager.getClass();
            }
            parentFragmentManager.ResultReceiver.serializer(fragment, true);
        }
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            if (!z || size.IconCompatParcelizer) {
                size.read.RemoteActionCompatParcelizer(div7ah8wj8, fragment);
            }
        }
    }

    public void write(Fragment fragment, Bundle bundle, boolean z) {
        int i = 2 % 2;
        int i2 = write + 123;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i4 = write + 75;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.write(fragment, bundle, true);
            int i6 = write + 55;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            int i8 = serializer + 1;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (!z || size.IconCompatParcelizer) {
                size.read.serializer(div7ah8wj8, fragment);
            }
        }
    }

    public void write(Fragment fragment, boolean z) {
        div7Ah8Wj8 parentFragmentManager;
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i2 = write + 97;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                parentFragmentManager = fragment2.getParentFragmentManager();
                parentFragmentManager.getClass();
            } else {
                parentFragmentManager = fragment2.getParentFragmentManager();
                parentFragmentManager.getClass();
            }
            parentFragmentManager.ResultReceiver.write(fragment, true);
        }
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            if (!z || !(!size.IconCompatParcelizer)) {
                size.read.write(div7ah8wj8, fragment);
                int i3 = write + 101;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        }
    }

    public void read(isPQishui_graphics ispqishui_graphics, Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HashMap map = (HashMap) this.IconCompatParcelizer;
        TransferParameters transferParameters = (TransferParameters) map.get(ispqishui_graphics);
        if (transferParameters == null) {
            transferParameters = new TransferParameters(ispqishui_graphics);
            transferParameters.IconCompatParcelizer = transferParameters;
            TransferParameters transferParameters2 = (TransferParameters) this.RemoteActionCompatParcelizer;
            transferParameters.IconCompatParcelizer = transferParameters2.IconCompatParcelizer;
            transferParameters.read = transferParameters2;
            transferParameters2.IconCompatParcelizer = transferParameters;
            transferParameters.IconCompatParcelizer.read = transferParameters;
            map.put(ispqishui_graphics, transferParameters);
        } else {
            ispqishui_graphics.RemoteActionCompatParcelizer();
            int i4 = serializer + 7;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (transferParameters.serializer == null) {
            transferParameters.serializer = new ArrayList();
        }
        transferParameters.serializer.add(obj);
        int i6 = serializer + 47;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public void IconCompatParcelizer(Fragment fragment, View view, Bundle bundle, boolean z) {
        int i = 2 % 2;
        fragment.getClass();
        view.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.IconCompatParcelizer(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        int i2 = write + 123;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = write + 97;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Size size = (Size) it.next();
            if (!z || !(!size.IconCompatParcelizer)) {
                size.read.write(div7ah8wj8, fragment, view);
            }
        }
    }

    public void IconCompatParcelizer(Fragment fragment, boolean z) {
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        FragmentActivity fragmentActivity = div7ah8wj8.PlaybackStateCompat.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i2 = serializer + 23;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.ResultReceiver.IconCompatParcelizer(fragment, true);
        }
        int i4 = serializer + 5;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            int i6 = serializer + 25;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!z || size.IconCompatParcelizer) {
                size.read.getClass();
            }
        }
    }

    public void RemoteActionCompatParcelizer(Fragment fragment, boolean z) {
        CardView$1 cardView$1;
        boolean z2;
        int i = 2 % 2;
        fragment.getClass();
        div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) this.RemoteActionCompatParcelizer;
        FragmentActivity fragmentActivity = div7ah8wj8.PlaybackStateCompat.RemoteActionCompatParcelizer;
        Fragment fragment2 = div7ah8wj8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (fragment2 != null) {
            int i2 = serializer + 37;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                div7Ah8Wj8 parentFragmentManager = fragment2.getParentFragmentManager();
                parentFragmentManager.getClass();
                cardView$1 = parentFragmentManager.ResultReceiver;
                z2 = false;
            } else {
                div7Ah8Wj8 parentFragmentManager2 = fragment2.getParentFragmentManager();
                parentFragmentManager2.getClass();
                cardView$1 = parentFragmentManager2.ResultReceiver;
                z2 = true;
            }
            cardView$1.RemoteActionCompatParcelizer(fragment, z2);
        }
        for (Size size : (CopyOnWriteArrayList) this.IconCompatParcelizer) {
            if (!z || size.IconCompatParcelizer) {
                size.read.RemoteActionCompatParcelizer(div7ah8wj8, fragment, fragmentActivity);
            }
        }
        int i3 = write + 83;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public Object serializer() {
        TransferParameters transferParameters;
        TransferParameters transferParameters2;
        int size;
        int i = 2 % 2;
        int i2 = serializer + 1;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            transferParameters = (TransferParameters) this.RemoteActionCompatParcelizer;
            transferParameters2 = transferParameters.IconCompatParcelizer;
            int i3 = 45 / 0;
        } else {
            transferParameters = (TransferParameters) this.RemoteActionCompatParcelizer;
            transferParameters2 = transferParameters.IconCompatParcelizer;
        }
        while (true) {
            boolean zEquals = transferParameters2.equals(transferParameters);
            Object obj = transferParameters2.write;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = transferParameters2.serializer;
            if (arrayList != null) {
                int i4 = write + 47;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    size = arrayList.size();
                    int i5 = 79 / 0;
                } else {
                    size = arrayList.size();
                }
            } else {
                size = 0;
            }
            Object objRemove = size > 0 ? transferParameters2.serializer.remove(size - 1) : null;
            if (objRemove != null) {
                int i6 = write + 15;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return objRemove;
                }
                throw null;
            }
            TransferParameters transferParameters3 = transferParameters2.IconCompatParcelizer;
            transferParameters3.read = transferParameters2.read;
            transferParameters2.read.IconCompatParcelizer = transferParameters3;
            ((HashMap) this.IconCompatParcelizer).remove(obj);
            ((isPQishui_graphics) obj).RemoteActionCompatParcelizer();
            transferParameters2 = transferParameters2.IconCompatParcelizer;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object updatePushToken(String str, ContinuationImpl continuationImpl) {
        PlatformIndirectPointerEvent platformIndirectPointerEvent;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        int i2 = write + 7;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof PlatformIndirectPointerEvent) {
            platformIndirectPointerEvent = (PlatformIndirectPointerEvent) continuationImpl;
            int i4 = platformIndirectPointerEvent.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 33;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                platformIndirectPointerEvent.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                platformIndirectPointerEvent = new PlatformIndirectPointerEvent(this, continuationImpl);
                int i7 = serializer + 67;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            platformIndirectPointerEvent = new PlatformIndirectPointerEvent(this, continuationImpl);
            int i9 = serializer + 67;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object obj = platformIndirectPointerEvent.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = platformIndirectPointerEvent.RemoteActionCompatParcelizer;
        int i12 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.IconCompatParcelizer;
            DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(this, str, shortNewsContentCardView, i12);
            platformIndirectPointerEvent.RemoteActionCompatParcelizer = 1;
            objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(dBUtil__DBUtil_androidKt$performInTransactionSuspending$2, platformIndirectPointerEvent);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            int i13 = write + 113;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "TokenRegistryRepository failed to update token", new Object[0]);
        }
        if (!(objM4875invokegIAlus instanceof isItemDismissable)) {
            int i15 = write + 107;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return objM4875invokegIAlus;
        }
        int i17 = serializer + 21;
        write = i17 % Fields.SpotShadowColor;
        if (i17 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public /* synthetic */ CardView$1(int i, boolean z) {
        this.read = i;
    }

    public CardView$1(accessgetNumPadEqualscp accessgetnumpadequalscp, accessgetNumPadEntercp accessgetnumpadentercp) {
        this.read = 29;
        this.IconCompatParcelizer = accessgetnumpadequalscp;
        this.RemoteActionCompatParcelizer = accessgetnumpadentercp;
    }

    public /* synthetic */ CardView$1(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    public CardView$1(IBinder iBinder) throws RemoteException {
        this.read = 26;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.RemoteActionCompatParcelizer = new Messenger(iBinder);
            this.IconCompatParcelizer = null;
            int i = serializer + 15;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.IconCompatParcelizer = new zzd(iBinder);
            this.RemoteActionCompatParcelizer = null;
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
        int i4 = serializer + 85;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
    }

    public CardView$1(div7Ah8Wj8 div7ah8wj8, ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1) {
        this.read = 20;
        div7ah8wj8.getClass();
        this.RemoteActionCompatParcelizer = div7ah8wj8;
        this.IconCompatParcelizer = imageLoader$Builder$$ExternalSyntheticLambda1;
    }

    public CardView$1(parseLayoutDescription parselayoutdescription, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 24;
        parselayoutdescription.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.RemoteActionCompatParcelizer = parselayoutdescription;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public CardView$1(TokenRegistryApiRequest tokenRegistryApiRequest, ExecuteApiRequest executeApiRequest) {
        this.read = 23;
        tokenRegistryApiRequest.getClass();
        executeApiRequest.getClass();
        this.RemoteActionCompatParcelizer = tokenRegistryApiRequest;
        this.IconCompatParcelizer = executeApiRequest;
    }

    public CardView$1(Context context, int i) {
        this.read = i;
        if (i != 25) {
            context.getClass();
            this.RemoteActionCompatParcelizer = context;
            this.IconCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(4, this));
        } else {
            this.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = context;
        }
    }

    public CardView$1(Application application, Extras$Key extras$Key) {
        this.read = 16;
        application.getClass();
        this.RemoteActionCompatParcelizer = application;
        this.IconCompatParcelizer = extras$Key;
    }

    public CardView$1(PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        this.read = 15;
        this.RemoteActionCompatParcelizer = new HashMap();
        this.IconCompatParcelizer = playbackStateCompatCustomAction;
    }

    public CardView$1(div7Ah8Wj8 div7ah8wj8) {
        this.read = 9;
        this.RemoteActionCompatParcelizer = div7ah8wj8;
        this.IconCompatParcelizer = new CopyOnWriteArrayList();
    }

    public CardView$1(bb$$ExternalSyntheticLambda0 bb__externalsyntheticlambda0) {
        this.read = 4;
        this.RemoteActionCompatParcelizer = bb__externalsyntheticlambda0;
        this.IconCompatParcelizer = new DragAndDropNodeacceptDragAndDropTransfer1(0);
    }

    public CardView$1(getDefaultShadowColor getdefaultshadowcolor, accessgetStrokecp accessgetstrokecp) {
        this.read = 11;
        getdefaultshadowcolor.getClass();
        accessgetstrokecp.getClass();
        this.RemoteActionCompatParcelizer = getdefaultshadowcolor;
        this.IconCompatParcelizer = accessgetstrokecp;
    }

    public CardView$1(accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd) {
        this.read = 10;
        this.RemoteActionCompatParcelizer = accessgetcompositingstrategynrfusijd;
        this.IconCompatParcelizer = new Object();
    }

    public /* synthetic */ CardView$1(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    public CardView$1(AppCompatTextView appCompatTextView) {
        this.read = 1;
        this.IconCompatParcelizer = appCompatTextView;
        this.RemoteActionCompatParcelizer = appCompatTextView;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b A[LOOP:1: B:29:0x008b->B:31:0x008f, LOOP_START, PHI: r2 r4
  0x008b: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v10 java.lang.String) binds: [B:28:0x0089, B:31:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:28:0x0089, B:31:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f A[LOOP:1: B:29:0x008b->B:31:0x008f, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r1 != 14) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return super.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = new java.lang.StringBuilder("GroupedLinkedMap( ");
        r2 = (o.TransferParameters) r8.RemoteActionCompatParcelizer;
        r3 = r2.read;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((!r3.equals(r2)) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1.append('{');
        r1.append(r3.write);
        r1.append(':');
        r6 = r3.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r6 = r6.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r1.append(r6);
        r1.append("}, ");
        r3 = r3.read;
        r6 = androidx.cardview.widget.CardView$1.serializer + 91;
        androidx.cardview.widget.CardView$1.write = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r6 == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r1.delete(r1.length() - 2, r1.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r1.append(" )");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 != 14) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.cardview.widget.CardView$1.write
            int r1 = r1 + 25
            int r2 = r1 % 128
            androidx.cardview.widget.CardView$1.serializer = r2
            int r1 = r1 % r0
            r2 = 14
            r3 = 6
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1c
            int r1 = r8.read
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L27
            goto L22
        L1a:
            r4 = r5
            goto L83
        L1c:
            int r1 = r8.read
            if (r1 == r3) goto L83
            if (r1 == r2) goto L27
        L22:
            java.lang.String r0 = super.toString()
            return r0
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GroupedLinkedMap( "
            r1.<init>(r2)
            java.lang.Object r2 = r8.RemoteActionCompatParcelizer
            o.TransferParameters r2 = (o.TransferParameters) r2
            o.TransferParameters r3 = r2.read
            r6 = r4
        L35:
            boolean r7 = r3.equals(r2)
            r7 = r7 ^ r5
            if (r7 == 0) goto L6a
            r6 = 123(0x7b, float:1.72E-43)
            r1.append(r6)
            java.lang.Object r6 = r3.write
            r1.append(r6)
            r6 = 58
            r1.append(r6)
            java.util.ArrayList r6 = r3.serializer
            if (r6 == 0) goto L54
            int r6 = r6.size()
            goto L55
        L54:
            r6 = r4
        L55:
            r1.append(r6)
            java.lang.String r6 = "}, "
            r1.append(r6)
            o.TransferParameters r3 = r3.read
            int r6 = androidx.cardview.widget.CardView$1.serializer
            int r6 = r6 + 91
            int r7 = r6 % 128
            androidx.cardview.widget.CardView$1.write = r7
            int r6 = r6 % r0
            r6 = r5
            goto L35
        L6a:
            if (r6 == r5) goto L6d
            goto L79
        L6d:
            int r2 = r1.length()
            int r3 = r1.length()
            int r2 = r2 - r0
            r1.delete(r2, r3)
        L79:
            java.lang.String r0 = " )"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L83:
            java.lang.Object r1 = r8.RemoteActionCompatParcelizer
            o.setBlockui r1 = (o.setBlockui) r1
            java.lang.String r2 = "[ "
            if (r1 == 0) goto Lb3
        L8b:
            r1 = 9
            if (r4 >= r1) goto Lb3
            int r1 = androidx.cardview.widget.CardView$1.write
            int r1 = r1 + 15
            int r3 = r1 % 128
            androidx.cardview.widget.CardView$1.serializer = r3
            int r1 = r1 % r0
            java.lang.StringBuilder r1 = bo.app.d$$ExternalSyntheticOutline0.m(r2)
            java.lang.Object r2 = r8.RemoteActionCompatParcelizer
            o.setBlockui r2 = (o.setBlockui) r2
            float[] r2 = r2.RatingCompat
            r2 = r2[r4]
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            int r4 = r4 + 1
            goto L8b
        Lb3:
            java.lang.String r0 = "] "
            java.lang.StringBuilder r0 = bo.app.af$$ExternalSyntheticOutline0.m(r2, r0)
            java.lang.Object r1 = r8.RemoteActionCompatParcelizer
            o.setBlockui r1 = (o.setBlockui) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView$1.toString():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object store(lerpNonNull lerpnonnull, ContinuationImpl continuationImpl) {
        getRadiusD9Ej5fM getradiusd9ej5fm;
        CardView$1 cardView$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof getRadiusD9Ej5fM) {
            getradiusd9ej5fm = (getRadiusD9Ej5fM) continuationImpl;
            int i3 = getradiusd9ej5fm.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = serializer + 35;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getradiusd9ej5fm.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getradiusd9ej5fm = new getRadiusD9Ej5fM(this, continuationImpl);
            }
        } else {
            getradiusd9ej5fm = new getRadiusD9Ej5fM(this, continuationImpl);
        }
        Object objCoroutineScope = getradiusd9ej5fm.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getradiusd9ej5fm.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
            Extras$Key extras$Key = (Extras$Key) this.RemoteActionCompatParcelizer;
            getradiusd9ej5fm.serializer = this;
            getradiusd9ej5fm.read = lerpnonnull;
            getradiusd9ej5fm.RemoteActionCompatParcelizer = 1;
            objCoroutineScope = YieldKt.coroutineScope(new PerformanceMetaDataProviderImpl$loadMetaData$2(extras$Key, null), getradiusd9ej5fm);
            if (objCoroutineScope != coroutineSingletons) {
                cardView$1 = this;
            }
            i = serializer + 61;
            write = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i6 != 1) {
            int i7 = serializer + 73;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 2 : i6 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
            return createfromparcel;
        }
        lerpnonnull = getradiusd9ej5fm.read;
        cardView$1 = getradiusd9ej5fm.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
        String lowerCase = ((PlatformShadowContext) objCoroutineScope).read.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("performance.class.key.v3", lerpnonnull.name()), new onViewAttachedToWindowlambda0("device.id.key.v3", lowerCase));
        CardView$1 cardView$2 = (CardView$1) cardView$1.IconCompatParcelizer;
        getradiusd9ej5fm.serializer = null;
        getradiusd9ej5fm.read = null;
        getradiusd9ej5fm.RemoteActionCompatParcelizer = 2;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) getOffsetRKDOV3M.serializer.getValue((Context) cardView$2.RemoteActionCompatParcelizer, getOffsetRKDOV3M.write[0]), new FlowLiveDataConversions$asFlow$1$1(mapRemoteActionCompatParcelizer, shortNewsContentCardView, 7), getradiusd9ej5fm);
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            return createfromparcel;
        }
        i = serializer + 61;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return coroutineSingletons;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8 A[SYNTHETIC] */
    public CctBackendFactory serializer(String str) {
        Bundle bundle;
        Iterator<String> it;
        Map map;
        int i;
        Object obj;
        String[] strArrSplit;
        int length;
        int i2 = 2 % 2;
        int i3 = serializer + 57;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (((Map) this.IconCompatParcelizer) == null) {
            Context context = (Context) this.RemoteActionCompatParcelizer;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), Fields.SpotShadowColor);
                    if (serviceInfo == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        it = bundle.keySet().iterator();
                        while (it.hasNext()) {
                            i = write + 67;
                            serializer = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                boolean z = bundle.get(it.next()) instanceof String;
                                throw null;
                            }
                            String next = it.next();
                            obj = bundle.get(next);
                            if (!(obj instanceof String) && next.startsWith("backend:")) {
                                int i5 = write + 101;
                                serializer = i5 % Fields.SpotShadowColor;
                                if (i5 % 2 != 0) {
                                    strArrSplit = ((String) obj).split(",", -1);
                                    length = strArrSplit.length;
                                } else {
                                    strArrSplit = ((String) obj).split(",", -1);
                                    length = strArrSplit.length;
                                }
                                for (int i6 = 0; i6 < length; i6++) {
                                    String strTrim = strArrSplit[i6].trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, next.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.IconCompatParcelizer = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("BackendRegistry", "Application info not found.");
            }
            int i7 = write + 11;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            bundle = null;
            if (bundle == null) {
                SentryLogcatAdapter.IconCompatParcelizer("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    i = write + 67;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        boolean z2 = bundle.get(it.next()) instanceof String;
                        throw null;
                    }
                    String next2 = it.next();
                    obj = bundle.get(next2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.IconCompatParcelizer = map;
        }
        String str2 = (String) ((Map) this.IconCompatParcelizer).get(str);
        if (str2 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str2).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            SentryLogcatAdapter.write("BackendRegistry", "Class " + str2 + " is not found.", e);
            int i9 = write + 105;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 2 % 4;
            }
            return null;
        } catch (IllegalAccessException e2) {
            SentryLogcatAdapter.write("BackendRegistry", "Could not instantiate " + str2 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            SentryLogcatAdapter.write("BackendRegistry", "Could not instantiate " + str2 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            SentryLogcatAdapter.write("BackendRegistry", "Could not instantiate ".concat(str2), e4);
            int i11 = write + 13;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return null;
        } catch (InvocationTargetException e5) {
            SentryLogcatAdapter.write("BackendRegistry", "Could not instantiate ".concat(str2), e5);
            return null;
        }
    }

    public Object IconCompatParcelizer(isPQishui_graphics ispqishui_graphics) {
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HashMap map = (HashMap) this.IconCompatParcelizer;
        TransferParameters transferParameters = (TransferParameters) map.get(ispqishui_graphics);
        if (transferParameters == null) {
            transferParameters = new TransferParameters(ispqishui_graphics);
            map.put(ispqishui_graphics, transferParameters);
        } else {
            ispqishui_graphics.RemoteActionCompatParcelizer();
        }
        TransferParameters transferParameters2 = transferParameters.IconCompatParcelizer;
        transferParameters2.read = transferParameters.read;
        transferParameters.read.IconCompatParcelizer = transferParameters2;
        TransferParameters transferParameters3 = (TransferParameters) this.RemoteActionCompatParcelizer;
        transferParameters.IconCompatParcelizer = transferParameters3;
        TransferParameters transferParameters4 = transferParameters3.read;
        transferParameters.read = transferParameters4;
        transferParameters4.IconCompatParcelizer = transferParameters;
        transferParameters.IconCompatParcelizer.read = transferParameters;
        ArrayList arrayList = transferParameters.serializer;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size <= 0) {
            return null;
        }
        int i4 = serializer + 41;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        ArrayList arrayList2 = transferParameters.serializer;
        if (i5 != 0) {
            size--;
        }
        return arrayList2.remove(size);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void read(Context context, XmlResourceParser xmlResourceParser) {
        int identifier;
        int i = 2 % 2;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null) {
                int i3 = write + 3;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (attributeValue != null && "id".equals(attributeName)) {
                    if (attributeValue.contains("/")) {
                        int i5 = serializer + 21;
                        write = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        identifier = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                    } else {
                        identifier = -1;
                    }
                    if (identifier == -1) {
                        if (attributeValue.length() > 1) {
                            identifier = Integer.parseInt(attributeValue.substring(1));
                        } else {
                            SentryLogcatAdapter.serializer("ConstraintLayoutStates", "error in parsing id");
                        }
                    }
                    try {
                        int eventType = xmlResourceParser.getEventType();
                        Object obj = null;
                        ShadowScope shadowScopeIconCompatParcelizer = null;
                        while (eventType != 1) {
                            if (eventType == 0) {
                                xmlResourceParser.getName();
                            } else if (eventType == 2) {
                                String name = xmlResourceParser.getName();
                                switch (name.hashCode()) {
                                    case -2025855158:
                                        if (name.equals("Layout")) {
                                            int i7 = write;
                                            int i8 = i7 + 61;
                                            serializer = i8 % Fields.SpotShadowColor;
                                            int i9 = i8 % 2;
                                            if (shadowScopeIconCompatParcelizer == null) {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                            int i10 = i7 + 49;
                                            serializer = i10 % Fields.SpotShadowColor;
                                            if (i10 % 2 != 0) {
                                                shadowScopeIconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser));
                                                obj.hashCode();
                                                throw null;
                                            }
                                            shadowScopeIconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser));
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case -1984451626:
                                        if (name.equals("Motion")) {
                                            if (shadowScopeIconCompatParcelizer == null) {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                            shadowScopeIconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser));
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case -1962203927:
                                        if (name.equals("ConstraintOverride")) {
                                            shadowScopeIconCompatParcelizer = ConstraintSet.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser), true);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case -1269513683:
                                        if (name.equals("PropertySet")) {
                                            if (shadowScopeIconCompatParcelizer == null) {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                            shadowScopeIconCompatParcelizer.write.serializer(context, Xml.asAttributeSet(xmlResourceParser));
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case -1238332596:
                                        if (name.equals("Transform")) {
                                            if (shadowScopeIconCompatParcelizer == null) {
                                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                            }
                                            shadowScopeIconCompatParcelizer.RatingCompat.serializer(context, Xml.asAttributeSet(xmlResourceParser));
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case -71750448:
                                        if (name.equals("Guideline")) {
                                            shadowScopeIconCompatParcelizer = ConstraintSet.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser), false);
                                            shadowScopeIconCompatParcelizer.IconCompatParcelizer.onBackPressedDispatcher_delegatelambda00 = true;
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 366511058:
                                        if (!name.equals("CustomMethod")) {
                                            continue;
                                        }
                                        break;
                                    case 1331510167:
                                        if (name.equals("Barrier")) {
                                            shadowScopeIconCompatParcelizer = ConstraintSet.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser), false);
                                            shadowScopeIconCompatParcelizer.IconCompatParcelizer.onBackPressedDispatcher_delegatelambda0 = 1;
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 1791837707:
                                        if (!name.equals("CustomAttribute")) {
                                            continue;
                                        }
                                        break;
                                    case 1803088381:
                                        if (name.equals("Constraint")) {
                                            shadowScopeIconCompatParcelizer = ConstraintSet.IconCompatParcelizer(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                if (shadowScopeIconCompatParcelizer == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                getSpotColor0d7_KjU.RemoteActionCompatParcelizer(context, xmlResourceParser, shadowScopeIconCompatParcelizer.serializer);
                            } else if (eventType == 3) {
                                String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                                switch (lowerCase.hashCode()) {
                                    case -2075718416:
                                        if (!lowerCase.equals("guideline")) {
                                            break;
                                        }
                                        break;
                                    case -190376483:
                                        if (lowerCase.equals("constraint")) {
                                        }
                                        break;
                                    case 426575017:
                                        if (lowerCase.equals("constraintoverride")) {
                                        }
                                        break;
                                    case 2146106725:
                                        if (lowerCase.equals("constraintset")) {
                                            ((SparseArray) this.IconCompatParcelizer).put(identifier, constraintSet);
                                            return;
                                        }
                                        continue;
                                        break;
                                    default:
                                        continue;
                                }
                                constraintSet.RemoteActionCompatParcelizer.put(Integer.valueOf(shadowScopeIconCompatParcelizer.read), shadowScopeIconCompatParcelizer);
                                shadowScopeIconCompatParcelizer = null;
                            }
                            eventType = xmlResourceParser.next();
                        }
                    } catch (IOException e) {
                        SentryLogcatAdapter.read("ConstraintSet", "Error parsing XML resource", e);
                    } catch (XmlPullParserException e2) {
                        SentryLogcatAdapter.read("ConstraintSet", "Error parsing XML resource", e2);
                    }
                    ((SparseArray) this.IconCompatParcelizer).put(identifier, constraintSet);
                    return;
                }
            }
        }
        int i11 = write + 45;
        serializer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            int i12 = 53 / 0;
        }
    }
}
