package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.navigation.NavArgsLazy;
import com.bumptech.glide.load.engine.GlideException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt;
import o.AppCompatTextHelper1;
import o.ChildLayerDependenciesTracker;
import o.DrawTransformKt;
import o.Fill;
import o.PositionCalculator;
import o.RenderIntentCompanion;
import o.Stroke;
import o.accessgetPerceptualcp;
import o.accessgetSubCompositionViewjd;
import o.accessisSrgb;
import o.area;
import o.generateOetf;
import o.getEndXimpl;
import o.insetdefault;
import o.r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I;
import o.rotateRadRg1IO4c;
import o.rotateRadRg1IO4cdefault;
import o.rotateRg1IO4c;
import o.scaleRg1IO4cdefault;
import o.withTransform;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest implements rotateRg1IO4c {
    public static final boolean IconCompatParcelizer = Log.isLoggable("GlideRequest", 2);
    public final rotateRadRg1IO4c ComponentActivity;
    public int MediaBrowserCompatMediaItem;
    public final accessgetPerceptualcp MediaDescriptionCompat;
    public Drawable MediaMetadataCompat;
    public Drawable MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public NavArgsLazy MediaSessionCompatToken;
    public final Object ParcelableVolumeInfo;
    public Drawable PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public volatile area RemoteActionCompatParcelizer;
    public final List ResultReceiver;
    public final Object r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final RenderIntentCompanion r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final insetdefault r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final rotateRadRg1IO4cdefault r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public scaleRg1IO4cdefault r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public generateOetf r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final ChildLayerDependenciesTracker r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final RuntimeException r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final Class r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final accessgetSubCompositionViewjd read;
    public final withTransform serializer;
    public final Context write;

    public SingleRequest(Context context, accessgetPerceptualcp accessgetperceptualcp, Object obj, Object obj2, Class cls, insetdefault insetdefaultVar, int i, int i2, RenderIntentCompanion renderIntentCompanion, rotateRadRg1IO4cdefault rotateradrg1io4cdefault, ArrayList arrayList, rotateRadRg1IO4c rotateradrg1io4c, area areaVar, withTransform withtransform) {
        accessgetSubCompositionViewjd accessgetsubcompositionviewjd = DrawTransformKt.read;
        if (IconCompatParcelizer) {
            hashCode();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new ChildLayerDependenciesTracker();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = obj;
        this.write = context;
        this.MediaDescriptionCompat = accessgetperceptualcp;
        this.ParcelableVolumeInfo = obj2;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = cls;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = insetdefaultVar;
        this.PlaybackStateCompatCustomAction = i;
        this.MediaSessionCompatResultReceiverWrapper = i2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = renderIntentCompanion;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = rotateradrg1io4cdefault;
        this.ResultReceiver = arrayList;
        this.ComponentActivity = rotateradrg1io4c;
        this.RemoteActionCompatParcelizer = areaVar;
        this.serializer = withtransform;
        this.read = accessgetsubcompositionviewjd;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scaleRg1IO4cdefault.PENDING;
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null && accessgetperceptualcp.MediaBrowserCompatMediaItem.serializer.containsKey(AppCompatTextHelper1.class)) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new RuntimeException("Glide request origin trace");
        }
    }

    public final void IconCompatParcelizer(GlideException glideException, int i) {
        Drawable drawableMediaDescriptionCompat;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            glideException.getClass();
            int i2 = this.MediaDescriptionCompat.MediaMetadataCompat;
            if (i2 <= i) {
                SentryLogcatAdapter.write("Glide", "Load failed for [" + this.ParcelableVolumeInfo + "] with dimensions [" + this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + "x" + this.MediaBrowserCompatMediaItem + "]", glideException);
                if (i2 <= 4) {
                    ArrayList arrayList = new ArrayList();
                    GlideException.write(glideException, arrayList);
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                    }
                }
            }
            this.MediaSessionCompatToken = null;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scaleRg1IO4cdefault.FAILED;
            rotateRadRg1IO4c rotateradrg1io4c = this.ComponentActivity;
            if (rotateradrg1io4c != null) {
                rotateradrg1io4c.read(this);
            }
            this.RatingCompat = true;
            try {
                List<getEndXimpl> list = this.ResultReceiver;
                if (list != null) {
                    for (getEndXimpl getendximpl : list) {
                        rotateRadRg1IO4c rotateradrg1io4c2 = this.ComponentActivity;
                        if (rotateradrg1io4c2 != null) {
                            rotateradrg1io4c2.IconCompatParcelizer().read();
                        }
                        getendximpl.RemoteActionCompatParcelizer(glideException);
                    }
                }
                rotateRadRg1IO4c rotateradrg1io4c3 = this.ComponentActivity;
                if (rotateradrg1io4c3 == null || rotateradrg1io4c3.serializer(this)) {
                    if (this.ParcelableVolumeInfo == null) {
                        if (this.MediaSessionCompatQueueItem == null) {
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                            this.MediaSessionCompatQueueItem = null;
                        }
                        drawableMediaDescriptionCompat = this.MediaSessionCompatQueueItem;
                    } else {
                        drawableMediaDescriptionCompat = null;
                    }
                    if (drawableMediaDescriptionCompat == null) {
                        if (this.MediaMetadataCompat == null) {
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                            this.MediaMetadataCompat = null;
                        }
                        drawableMediaDescriptionCompat = this.MediaMetadataCompat;
                    }
                    if (drawableMediaDescriptionCompat == null) {
                        drawableMediaDescriptionCompat = MediaDescriptionCompat();
                    }
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read(drawableMediaDescriptionCompat);
                }
                this.RatingCompat = false;
            } catch (Throwable th) {
                this.RatingCompat = false;
                throw th;
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaBrowserCompatMediaItem() {
        boolean z;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            z = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == scaleRg1IO4cdefault.COMPLETE;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean MediaMetadataCompat() {
        boolean z;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            scaleRg1IO4cdefault scalerg1io4cdefault = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            z = scalerg1io4cdefault == scaleRg1IO4cdefault.RUNNING || scalerg1io4cdefault == scaleRg1IO4cdefault.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final void RatingCompat() {
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            if (MediaMetadataCompat()) {
                write();
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final void RemoteActionCompatParcelizer() {
        rotateRadRg1IO4c rotateradrg1io4c;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            if (this.RatingCompat) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
            int i = Stroke.write;
            SystemClock.elapsedRealtimeNanos();
            if (this.ParcelableVolumeInfo == null) {
                if (Fill.read(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper)) {
                    this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = this.PlaybackStateCompatCustomAction;
                    this.MediaBrowserCompatMediaItem = this.MediaSessionCompatResultReceiverWrapper;
                }
                if (this.MediaSessionCompatQueueItem == null) {
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                    this.MediaSessionCompatQueueItem = null;
                }
                IconCompatParcelizer(new GlideException("Received null model"), this.MediaSessionCompatQueueItem == null ? 5 : 3);
                return;
            }
            scaleRg1IO4cdefault scalerg1io4cdefault = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (scalerg1io4cdefault == scaleRg1IO4cdefault.RUNNING) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (scalerg1io4cdefault == scaleRg1IO4cdefault.COMPLETE) {
                write(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.MEMORY_CACHE);
                return;
            }
            List<getEndXimpl> list = this.ResultReceiver;
            if (list != null) {
                for (getEndXimpl getendximpl : list) {
                }
            }
            scaleRg1IO4cdefault scalerg1io4cdefault2 = scaleRg1IO4cdefault.WAITING_FOR_SIZE;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scalerg1io4cdefault2;
            if (Fill.read(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper)) {
                IconCompatParcelizer(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper);
            } else {
                rotateRadRg1IO4cdefault rotateradrg1io4cdefault = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                IconCompatParcelizer(rotateradrg1io4cdefault.MediaBrowserCompatMediaItem, rotateradrg1io4cdefault.RemoteActionCompatParcelizer);
            }
            scaleRg1IO4cdefault scalerg1io4cdefault3 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if ((scalerg1io4cdefault3 == scaleRg1IO4cdefault.RUNNING || scalerg1io4cdefault3 == scalerg1io4cdefault2) && ((rotateradrg1io4c = this.ComponentActivity) == null || rotateradrg1io4c.serializer(this))) {
                rotateRadRg1IO4cdefault rotateradrg1io4cdefault2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                MediaDescriptionCompat();
                rotateradrg1io4cdefault2.getClass();
            }
            if (IconCompatParcelizer) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final boolean read() {
        boolean z;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            z = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == scaleRg1IO4cdefault.COMPLETE;
        }
        return z;
    }

    @Override // o.rotateRg1IO4c
    public final boolean serializer() {
        boolean z;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            z = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == scaleRg1IO4cdefault.CLEARED;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            obj = this.ParcelableVolumeInfo;
            cls = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // o.rotateRg1IO4c
    public final void write() {
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            if (this.RatingCompat) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
            scaleRg1IO4cdefault scalerg1io4cdefault = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            scaleRg1IO4cdefault scalerg1io4cdefault2 = scaleRg1IO4cdefault.CLEARED;
            if (scalerg1io4cdefault == scalerg1io4cdefault2) {
                return;
            }
            IconCompatParcelizer();
            generateOetf generateoetf = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (generateoetf != null) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
            } else {
                generateoetf = null;
            }
            rotateRadRg1IO4c rotateradrg1io4c = this.ComponentActivity;
            if (rotateradrg1io4c == null || rotateradrg1io4c.RemoteActionCompatParcelizer(this)) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write(MediaDescriptionCompat());
            }
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scalerg1io4cdefault2;
            if (generateoetf != null) {
                this.RemoteActionCompatParcelizer.getClass();
                area.RemoteActionCompatParcelizer(generateoetf);
            }
        }
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.getClass();
        NavArgsLazy navArgsLazy = this.MediaSessionCompatToken;
        if (navArgsLazy != null) {
            synchronized (((area) navArgsLazy.RatingCompat)) {
                ((accessisSrgb) navArgsLazy.MediaSessionCompatQueueItem).serializer((SingleRequest) navArgsLazy.read);
            }
            this.MediaSessionCompatToken = null;
        }
    }

    public final Drawable MediaDescriptionCompat() {
        if (this.PlaybackStateCompat == null) {
            insetdefault insetdefaultVar = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            insetdefaultVar.getClass();
            this.PlaybackStateCompat = null;
            int i = insetdefaultVar.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (i > 0) {
                insetdefaultVar.getClass();
                Context context = this.write;
                this.PlaybackStateCompat = PositionCalculator.read(context, context, i, context.getTheme());
            }
        }
        return this.PlaybackStateCompat;
    }

    public final void write(generateOetf generateoetf, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        Throwable th;
        Object obj;
        String str;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
        generateOetf generateoetf2 = null;
        try {
            synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                try {
                    this.MediaSessionCompatToken = null;
                    if (generateoetf == null) {
                        IconCompatParcelizer(new GlideException("Expected to receive a Resource<R> with an object of " + this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object objIconCompatParcelizer = generateoetf.IconCompatParcelizer();
                    try {
                        if (objIconCompatParcelizer != null && this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.isAssignableFrom(objIconCompatParcelizer.getClass())) {
                            rotateRadRg1IO4c rotateradrg1io4c = this.ComponentActivity;
                            if (rotateradrg1io4c != null && !rotateradrg1io4c.write(this)) {
                                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scaleRg1IO4cdefault.COMPLETE;
                            } else {
                                write(generateoetf, objIconCompatParcelizer, r8lambdayjgjsam_wcskwad6z3tn2h9p74i);
                                return;
                            }
                        } else {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                            sb.append(" but instead got ");
                            if (objIconCompatParcelizer != null) {
                                obj = objIconCompatParcelizer.getClass();
                            } else {
                                obj = "";
                            }
                            sb.append(obj);
                            sb.append("{");
                            sb.append(objIconCompatParcelizer);
                            sb.append("} inside Resource{");
                            sb.append(generateoetf);
                            sb.append("}.");
                            if (objIconCompatParcelizer != null) {
                                str = "";
                            } else {
                                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                            }
                            sb.append(str);
                            IconCompatParcelizer(new GlideException(sb.toString()), 5);
                        }
                        this.RemoteActionCompatParcelizer.getClass();
                        area.RemoteActionCompatParcelizer(generateoetf);
                    } catch (Throwable th2) {
                        th = th2;
                        generateoetf2 = generateoetf;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (generateoetf2 != null) {
                this.RemoteActionCompatParcelizer.getClass();
                area.RemoteActionCompatParcelizer(generateoetf2);
            }
            throw th4;
        }
    }

    public final void IconCompatParcelizer(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
        Object obj2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        synchronized (obj2) {
            try {
                try {
                    boolean z = IconCompatParcelizer;
                    if (z) {
                        int i3 = Stroke.write;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == scaleRg1IO4cdefault.WAITING_FOR_SIZE) {
                        scaleRg1IO4cdefault scalerg1io4cdefault = scaleRg1IO4cdefault.RUNNING;
                        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scalerg1io4cdefault;
                        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = iRound;
                        this.MediaBrowserCompatMediaItem = i2 == Integer.MIN_VALUE ? i2 : Math.round(i2 * 1.0f);
                        if (z) {
                            int i4 = Stroke.write;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        area areaVar = this.RemoteActionCompatParcelizer;
                        accessgetPerceptualcp accessgetperceptualcp = this.MediaDescriptionCompat;
                        Object obj3 = this.ParcelableVolumeInfo;
                        insetdefault insetdefaultVar = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        try {
                            obj = obj2;
                            try {
                                this.MediaSessionCompatToken = areaVar.write(accessgetperceptualcp, obj3, insetdefaultVar.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.MediaBrowserCompatMediaItem, insetdefaultVar.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, insetdefaultVar.MediaSessionCompatToken, insetdefaultVar.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, insetdefaultVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, insetdefaultVar.ResultReceiver, insetdefaultVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, insetdefaultVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, insetdefaultVar.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, this, this.read);
                                if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != scalerg1io4cdefault) {
                                    this.MediaSessionCompatToken = null;
                                }
                                if (z) {
                                    int i5 = Stroke.write;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // o.rotateRg1IO4c
    public final boolean IconCompatParcelizer(rotateRg1IO4c rotaterg1io4c) {
        int i;
        int i2;
        Object obj;
        Class cls;
        insetdefault insetdefaultVar;
        RenderIntentCompanion renderIntentCompanion;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        insetdefault insetdefaultVar2;
        RenderIntentCompanion renderIntentCompanion2;
        int size2;
        if (!(rotaterg1io4c instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            i = this.PlaybackStateCompatCustomAction;
            i2 = this.MediaSessionCompatResultReceiverWrapper;
            obj = this.ParcelableVolumeInfo;
            cls = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            insetdefaultVar = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            renderIntentCompanion = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            List list = this.ResultReceiver;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) rotaterg1io4c;
        synchronized (singleRequest.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            i3 = singleRequest.PlaybackStateCompatCustomAction;
            i4 = singleRequest.MediaSessionCompatResultReceiverWrapper;
            obj2 = singleRequest.ParcelableVolumeInfo;
            cls2 = singleRequest.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            insetdefaultVar2 = singleRequest.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            renderIntentCompanion2 = singleRequest.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            List list2 = singleRequest.ResultReceiver;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj.equals(obj2)) {
            return false;
        }
        if (!cls.equals(cls2)) {
            return false;
        }
        if (insetdefaultVar == null) {
            if (insetdefaultVar2 != null) {
                return false;
            }
        } else if (!insetdefaultVar.RemoteActionCompatParcelizer(insetdefaultVar2)) {
            return false;
        }
        return renderIntentCompanion == renderIntentCompanion2 && size == size2;
    }

    public final void write(generateOetf generateoetf, Object obj, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        rotateRadRg1IO4c rotateradrg1io4c = this.ComponentActivity;
        if (rotateradrg1io4c != null) {
            rotateradrg1io4c.IconCompatParcelizer().read();
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = scaleRg1IO4cdefault.COMPLETE;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = generateoetf;
        if (this.MediaDescriptionCompat.MediaMetadataCompat <= 3) {
            Objects.toString(r8lambdayjgjsam_wcskwad6z3tn2h9p74i);
            Objects.toString(this.ParcelableVolumeInfo);
            int i = Stroke.write;
            SystemClock.elapsedRealtimeNanos();
        }
        if (rotateradrg1io4c != null) {
            rotateradrg1io4c.MediaBrowserCompatMediaItem(this);
        }
        this.RatingCompat = true;
        try {
            List list = this.ResultReceiver;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((getEndXimpl) it.next()).getClass();
                    ((Drawable) obj).toString();
                    int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                    int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                    BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
                }
            }
            this.serializer.getClass();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(obj);
        } finally {
            this.RatingCompat = false;
        }
    }
}
