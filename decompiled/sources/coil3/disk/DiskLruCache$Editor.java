package coil3.disk;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.disk.DiskLruCache$Editor;
import com.airbnb.lottie.PerformanceTracker;
import com.google.android.gms.net.zza;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.encoder.Encoder;
import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.I$b;
import java.io.File;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o.BlurFilter;
import o.RecyclableBufferedInputStream;
import o.StrokeCap;
import o.asList;
import o.getBaselineShift5SSeXJ0;
import o.getCieXyz;
import o.getFontFamily;
import o.getFontSynthesisZQGJjVo;
import o.getLastLayerDrawingWasSkippedui;
import o.getPerceptualuksYyKA;
import o.getRelativeuksYyKA;
import o.getReverseDifferenceannotations;
import o.getTextGeometricTransform;
import o.getTextInputService;
import o.getUnionannotations;
import o.incrementSensitiveComponentCount;
import o.onDescendantInvalidated;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.setBaselineShift_isdbwI;
import o.setFontFamily;
import o.setFontFeatureSettings;
import o.setMeasureResultui;
import o.withinLayerBoundsk4lQ0M;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$Editor implements setMeasureResultui {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public boolean read;
    public final Object serializer;
    public final Object write;

    public DiskLruCache$Editor() {
        this.IconCompatParcelizer = 6;
        this.write = new Object();
        this.RemoteActionCompatParcelizer = new ArrayDeque();
        this.serializer = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public void serializer(getTextGeometricTransform gettextgeometrictransform, setFontFeatureSettings[][][] setfontfeaturesettingsArr, int i, setFontFeatureSettings setfontfeaturesettings) {
        int i2;
        String str = (String) this.write;
        getFontFamily getfontfamily = (getFontFamily) this.RemoteActionCompatParcelizer;
        CharsetEncoder[] charsetEncoderArr = getfontfamily.RemoteActionCompatParcelizer;
        CharsetEncoder[] charsetEncoderArr2 = getfontfamily.RemoteActionCompatParcelizer;
        int length = charsetEncoderArr.length;
        int i3 = getfontfamily.write;
        if (i3 >= 0) {
            char cCharAt = str.charAt(i);
            if (charsetEncoderArr2[i3].canEncode("" + cCharAt)) {
                length = i3 + 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            char cCharAt2 = str.charAt(i);
            if (charsetEncoderArr2[i5].canEncode("" + cCharAt2)) {
                IconCompatParcelizer(setfontfeaturesettingsArr, i, new setFontFeatureSettings(this, getFontSynthesisZQGJjVo.BYTE, i, i5, 1, setfontfeaturesettings, gettextgeometrictransform));
            }
        }
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo = getFontSynthesisZQGJjVo.KANJI;
        if (RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo, str.charAt(i))) {
            IconCompatParcelizer(setfontfeaturesettingsArr, i, new setFontFeatureSettings(this, getfontsynthesiszqgjjvo, i, 0, 1, setfontfeaturesettings, gettextgeometrictransform));
        }
        int length2 = str.length();
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2 = getFontSynthesisZQGJjVo.ALPHANUMERIC;
        int i6 = 2;
        if (RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo2, str.charAt(i))) {
            int i7 = i + 1;
            IconCompatParcelizer(setfontfeaturesettingsArr, i, new setFontFeatureSettings(this, getfontsynthesiszqgjjvo2, i, 0, (i7 >= length2 || !RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo2, str.charAt(i7))) ? 1 : 2, setfontfeaturesettings, gettextgeometrictransform));
        }
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo3 = getFontSynthesisZQGJjVo.NUMERIC;
        if (RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length2 || !RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && RemoteActionCompatParcelizer(getfontsynthesiszqgjjvo3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            IconCompatParcelizer(setfontfeaturesettingsArr, i, new setFontFeatureSettings(this, getfontsynthesiszqgjjvo3, i, 0, i2, setfontfeaturesettings, gettextgeometrictransform));
        }
    }

    public static boolean RemoteActionCompatParcelizer(getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo, char c) {
        int i = setBaselineShift_isdbwI.serializer[getfontsynthesiszqgjjvo.ordinal()];
        if (i == 1) {
            return Encoder.IconCompatParcelizer(String.valueOf(c));
        }
        if (i == 2) {
            int[] iArr = Encoder.RemoteActionCompatParcelizer;
            if (c >= '`' || iArr[c] == -1) {
                return false;
            }
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public void IconCompatParcelizer() {
        synchronized (this.write) {
            if (((ArrayDeque) this.RemoteActionCompatParcelizer).isEmpty()) {
                this.read = false;
                return;
            }
            onDescendantInvalidated ondescendantinvalidated = (onDescendantInvalidated) ((ArrayDeque) this.RemoteActionCompatParcelizer).remove();
            IconCompatParcelizer(ondescendantinvalidated.write, ondescendantinvalidated.serializer);
        }
    }

    public File read() {
        File file;
        synchronized (((getRelativeuksYyKA) this.serializer)) {
            getPerceptualuksYyKA getperceptualuksyyka = (getPerceptualuksYyKA) this.write;
            if (getperceptualuksyyka.IconCompatParcelizer != this) {
                throw new IllegalStateException();
            }
            if (!getperceptualuksyyka.MediaSessionCompatQueueItem) {
                ((boolean[]) this.RemoteActionCompatParcelizer)[0] = true;
            }
            file = getperceptualuksyyka.RemoteActionCompatParcelizer[0];
            ((getRelativeuksYyKA) this.serializer).serializer.mkdirs();
        }
        return file;
    }

    public x serializer(getTextGeometricTransform gettextgeometrictransform) throws WriterException {
        int i;
        String str = (String) this.write;
        int length = str.length();
        getFontFamily getfontfamily = (getFontFamily) this.RemoteActionCompatParcelizer;
        CharsetEncoder[] charsetEncoderArr = getfontfamily.RemoteActionCompatParcelizer;
        CharsetEncoder[] charsetEncoderArr2 = getfontfamily.RemoteActionCompatParcelizer;
        setFontFeatureSettings[][][] setfontfeaturesettingsArr = (setFontFeatureSettings[][][]) Array.newInstance((Class<?>) setFontFeatureSettings.class, length + 1, charsetEncoderArr.length, 4);
        serializer(gettextgeometrictransform, setfontfeaturesettingsArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr2.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    setFontFeatureSettings setfontfeaturesettings = setfontfeaturesettingsArr[i2][i3][i4];
                    if (setfontfeaturesettings != null && i2 < length) {
                        serializer(gettextgeometrictransform, setfontfeaturesettingsArr, i2, setfontfeaturesettings);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr2.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                setFontFeatureSettings setfontfeaturesettings2 = setfontfeaturesettingsArr[length][i8][i9];
                if (setfontfeaturesettings2 != null && (i = setfontfeaturesettings2.write) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new x(this, gettextgeometrictransform, setfontfeaturesettingsArr[length][i5][i7]);
        }
        throw new WriterException(ff$$ExternalSyntheticOutline0.m("Internal error: failed to encode \"", str, "\""));
    }

    public RecyclableBufferedInputStream serializer(int i) {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        getReverseDifferenceannotations getreversedifferenceannotations = (getReverseDifferenceannotations) this.serializer;
        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
            if (this.read) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.RemoteActionCompatParcelizer)[i] = true;
            Object obj = ((getUnionannotations) this.write).read.get(i);
            StrokeCap.IconCompatParcelizer(getreversedifferenceannotations.write, (RecyclableBufferedInputStream) obj);
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) obj;
        }
        return recyclableBufferedInputStream;
    }

    public void serializer() {
        getRelativeuksYyKA.IconCompatParcelizer((getRelativeuksYyKA) this.serializer, this, false);
    }

    public void serializer(boolean z) {
        getReverseDifferenceannotations getreversedifferenceannotations = (getReverseDifferenceannotations) this.serializer;
        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
            if (this.read) {
                throw new IllegalStateException("editor is closed");
            }
            Object[] objArr = {((getUnionannotations) this.write).RemoteActionCompatParcelizer, this};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                getReverseDifferenceannotations.read(getreversedifferenceannotations, this, z);
            }
            this.read = true;
        }
    }

    @Override // o.setMeasureResultui
    public void v_() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i != 3) {
            ((getTextInputService) obj).serializer(incrementSensitiveComponentCount.GARBAGE_COLLECTION, this.read ? 300000L : 60000L, new RxWorker$1$$ExternalSyntheticLambda0(20, this));
            return;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance == 100) {
            Iterator it = ((List) this.serializer).iterator();
            while (it.hasNext()) {
                ((BlurFilter) this.RemoteActionCompatParcelizer).serializer((String) it.next());
            }
            new Handler(Looper.getMainLooper()).post(new RxWorker$1$$ExternalSyntheticLambda0(13, this));
            ((Application) obj).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.deliveryhero.performance.core.appstartup.AppStartUpDetectorImpl$start$3
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    activity.getClass();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    activity.getClass();
                    DiskLruCache$Editor diskLruCache$Editor = this.read;
                    ((Application) diskLruCache$Editor.write).unregisterActivityLifecycleCallbacks(this);
                    if (diskLruCache$Editor.read && bundle == null) {
                        return;
                    }
                    Iterator it2 = ((List) diskLruCache$Editor.serializer).iterator();
                    while (it2.hasNext()) {
                        ((BlurFilter) diskLruCache$Editor.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer((String) it2.next());
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    activity.getClass();
                    bundle.getClass();
                }
            });
        }
    }

    public void write(Runnable runnable, Executor executor) {
        synchronized (this.write) {
            if (this.read) {
                ((ArrayDeque) this.RemoteActionCompatParcelizer).add(new onDescendantInvalidated(runnable, executor));
            } else {
                this.read = true;
                IconCompatParcelizer(runnable, executor);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    public static void IconCompatParcelizer(setFontFeatureSettings[][][] setfontfeaturesettingsArr, int i, setFontFeatureSettings setfontfeaturesettings) {
        char c;
        setFontFeatureSettings[] setfontfeaturesettingsArr2 = setfontfeaturesettingsArr[i + setfontfeaturesettings.read][setfontfeaturesettings.IconCompatParcelizer];
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo = setfontfeaturesettings.RemoteActionCompatParcelizer;
        if (getfontsynthesiszqgjjvo == null) {
            c = 0;
        } else {
            int i2 = setBaselineShift_isdbwI.serializer[getfontsynthesiszqgjjvo.ordinal()];
            char c2 = 1;
            if (i2 != 1) {
                c = 2;
                if (i2 != 2) {
                    c2 = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(getfontsynthesiszqgjjvo, "Illegal mode ");
                            return;
                        }
                        c = c2;
                    }
                } else {
                    c = c2;
                }
            } else {
                c = 0;
            }
        }
        setFontFeatureSettings setfontfeaturesettings2 = setfontfeaturesettingsArr2[c];
        if (setfontfeaturesettings2 == null || setfontfeaturesettings2.write > setfontfeaturesettings.write) {
            setfontfeaturesettingsArr2[c] = setfontfeaturesettings;
        }
    }

    public void IconCompatParcelizer(Runnable runnable, Executor executor) {
        try {
            executor.execute(new zza(this, 29, runnable));
        } catch (RejectedExecutionException unused) {
            IconCompatParcelizer();
        }
    }

    public static getTextGeometricTransform read(setFontFamily setfontfamily) {
        int iOrdinal = setfontfamily.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? getTextGeometricTransform.write(40) : getTextGeometricTransform.write(26);
        }
        return getTextGeometricTransform.write(9);
    }

    public /* synthetic */ DiskLruCache$Editor(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = obj3;
        this.read = true;
    }

    public DiskLruCache$Editor(withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m, PerformanceTracker performanceTracker, asList aslist, boolean z) {
        this.IconCompatParcelizer = 4;
        this.write = withinlayerboundsk4lq0m;
        this.RemoteActionCompatParcelizer = performanceTracker;
        this.serializer = aslist;
        this.read = z;
    }

    public DiskLruCache$Editor(String str, Charset charset, boolean z, getBaselineShift5SSeXJ0 getbaselineshift5ssexj0) {
        this.IconCompatParcelizer = 7;
        this.write = str;
        this.read = z;
        this.RemoteActionCompatParcelizer = new getFontFamily(str, charset);
        this.serializer = getbaselineshift5ssexj0;
    }

    public DiskLruCache$Editor(getLastLayerDrawingWasSkippedui getlastlayerdrawingwasskippedui, getTextInputService gettextinputservice, I$b i$b) {
        this.IconCompatParcelizer = 5;
        this.serializer = getlastlayerdrawingwasskippedui;
        this.read = false;
        this.write = gettextinputservice;
        this.RemoteActionCompatParcelizer = i$b;
    }

    public DiskLruCache$Editor(getReverseDifferenceannotations getreversedifferenceannotations, getUnionannotations getunionannotations) {
        this.IconCompatParcelizer = 0;
        this.serializer = getreversedifferenceannotations;
        this.write = getunionannotations;
        this.RemoteActionCompatParcelizer = new boolean[2];
    }

    public DiskLruCache$Editor(getRelativeuksYyKA getrelativeuksyyka, getPerceptualuksYyKA getperceptualuksyyka) {
        this.IconCompatParcelizer = 2;
        this.serializer = getrelativeuksyyka;
        this.write = getperceptualuksyyka;
        this.RemoteActionCompatParcelizer = getperceptualuksyyka.MediaSessionCompatQueueItem ? null : new boolean[getrelativeuksyyka.PlaybackStateCompat];
    }
}
