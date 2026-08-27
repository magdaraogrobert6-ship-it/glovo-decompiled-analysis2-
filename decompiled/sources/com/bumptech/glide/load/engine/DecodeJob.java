package com.bumptech.glide.load.engine;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.emoji2.text.EmojiProcessor;
import androidx.navigation.NavArgsLazy;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import o.CanvasDrawScopeKtasDrawTransform1;
import o.ChildLayerDependenciesTracker;
import o.DrawStyle;
import o.RenderIntent;
import o.RenderIntentCompanion;
import o.Stroke;
import o.accesscomputeWhitePoint;
import o.accessgenerateEotf;
import o.accessgenerateOetf;
import o.accessgetDefaultJoincp;
import o.accessgetMinp;
import o.accessgetPerceptualcp;
import o.accessgetRelativecp;
import o.accessisSrgb;
import o.accessisWideGamut;
import o.accessxyPrimaries;
import o.area;
import o.computePrimariesui_graphics;
import o.computeWhitePoint;
import o.computeXYZMatrix;
import o.cross;
import o.eotfFunclambda0;
import o.fromLinear;
import o.generateEotf;
import o.generateEotflambda0;
import o.generateEotflambda2;
import o.generateEotflambda3;
import o.generateOetf;
import o.generateOetflambda1;
import o.generateOetflambda3;
import o.getEotfFuncui_graphics;
import o.getOetfOrigui_graphics;
import o.getPrimaries;
import o.r8lambda85RvnFzj2hAbPpsZuIihOu5usME;
import o.r8lambdaD96iEcIUdknPeYphmySUeDTc3iU;
import o.r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w;
import o.r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg;
import o.r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.scale0AR0LA0default;
import o.setRootFocusNodeui;

/* JADX INFO: loaded from: classes.dex */
public final class DecodeJob implements r8lambdaD96iEcIUdknPeYphmySUeDTc3iU, Runnable, Comparable, accessgetDefaultJoincp {
    public static final accessgetMinp serializer = new accessgetMinp("glide_thread_priority_override", null, accessgetMinp.IconCompatParcelizer);
    public volatile boolean ComponentActivity;
    public r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I IconCompatParcelizer;
    public Thread MediaBrowserCompatMediaItem;
    public eotfFunclambda0 MediaDescriptionCompat;
    public volatile r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w MediaMetadataCompat;
    public getPrimaries MediaSessionCompatQueueItem;
    public final scale0AR0LA0default MediaSessionCompatResultReceiverWrapper;
    public accessgetPerceptualcp ParcelableVolumeInfo;
    public accessisWideGamut PlaybackStateCompat;
    public accessgetRelativecp PlaybackStateCompatCustomAction;
    public accessisSrgb RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public int _init_lambda4;
    public Supplier r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public volatile boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public getEotfFuncui_graphics r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Object r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public generateEotf r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final setRootFocusNodeui r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public accesscomputeWhitePoint r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public eotfFunclambda0 r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public RenderIntentCompanion r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public Object read;
    public eotfFunclambda0 write;
    public final DecodeHelper RatingCompat = new DecodeHelper();
    public final ArrayList _init_lambda1 = new ArrayList();
    public final ChildLayerDependenciesTracker accessensureViewModelStore = new ChildLayerDependenciesTracker();
    public final NavArgsLazy MediaSessionCompatToken = new NavArgsLazy(27, false);
    public final accessgenerateEotf r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new accessgenerateEotf();

    @Override // o.accessgetDefaultJoincp
    public final ChildLayerDependenciesTracker n_() {
        return this.accessensureViewModelStore;
    }

    @Override // o.r8lambdaD96iEcIUdknPeYphmySUeDTc3iU
    public final void IconCompatParcelizer(eotfFunclambda0 eotffunclambda0, Object obj, getPrimaries getprimaries, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i, eotfFunclambda0 eotffunclambda1) {
        this.MediaDescriptionCompat = eotffunclambda0;
        this.read = obj;
        this.MediaSessionCompatQueueItem = getprimaries;
        this.IconCompatParcelizer = r8lambdayjgjsam_wcskwad6z3tn2h9p74i;
        this.write = eotffunclambda1;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = eotffunclambda0 != this.RatingCompat.write().get(0);
        if (Thread.currentThread() == this.MediaBrowserCompatMediaItem) {
            RemoteActionCompatParcelizer();
            return;
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.DECODE_DATA;
        accessisSrgb accessissrgb = this.RemoteActionCompatParcelizer;
        (accessissrgb.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ? accessissrgb.IconCompatParcelizer : accessissrgb.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).execute(this);
    }

    public final void MediaBrowserCompatMediaItem() {
        this.accessensureViewModelStore.serializer();
        if (this.ComponentActivity) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already notified", this._init_lambda1.isEmpty() ? null : (Throwable) af$$ExternalSyntheticOutline0.m(1, this._init_lambda1));
        } else {
            this.ComponentActivity = true;
        }
    }

    public final void MediaDescriptionCompat() {
        int i = accessgenerateOetf.read[this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()];
        if (i == 1) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = write(accesscomputeWhitePoint.INITIALIZE);
            this.MediaMetadataCompat = read();
            MediaMetadataCompat();
        } else if (i == 2) {
            MediaMetadataCompat();
        } else if (i == 3) {
            RemoteActionCompatParcelizer();
        } else {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unrecognized run reason: ");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        DecodeJob decodeJob = (DecodeJob) obj;
        int iOrdinal = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.ordinal() - decodeJob.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.ordinal();
        return iOrdinal == 0 ? this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM - decodeJob.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM : iOrdinal;
    }

    public final r8lambdaf_R03aPgk3yrRX0m4aPR6MxY0w read() {
        int i = accessgenerateOetf.write[this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.ordinal()];
        DecodeHelper decodeHelper = this.RatingCompat;
        if (i == 1) {
            return new generateEotflambda2(decodeHelper, this);
        }
        if (i == 2) {
            return new r8lambda85RvnFzj2hAbPpsZuIihOu5usME(decodeHelper.write(), decodeHelper, this);
        }
        if (i == 3) {
            return new generateOetflambda3(decodeHelper, this);
        }
        if (i == 4) {
            return null;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, "Unrecognized stage: ");
        return null;
    }

    public final void read(accessgetPerceptualcp accessgetperceptualcp, Object obj, generateEotf generateeotf, eotfFunclambda0 eotffunclambda0, int i, int i2, Class cls, Class cls2, RenderIntentCompanion renderIntentCompanion, accessisWideGamut accessiswidegamut, Map map, boolean z, boolean z2, getEotfFuncui_graphics geteotffuncui_graphics, accessisSrgb accessissrgb, int i3) {
        DecodeHelper decodeHelper = this.RatingCompat;
        decodeHelper.RemoteActionCompatParcelizer = accessgetperceptualcp;
        decodeHelper.MediaSessionCompatToken = obj;
        decodeHelper.PlaybackStateCompatCustomAction = eotffunclambda0;
        decodeHelper.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        decodeHelper.serializer = i2;
        decodeHelper.write = accessiswidegamut;
        decodeHelper.PlaybackStateCompat = cls;
        decodeHelper.IconCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
        decodeHelper.ComponentActivity = cls2;
        decodeHelper.MediaSessionCompatResultReceiverWrapper = renderIntentCompanion;
        decodeHelper.ParcelableVolumeInfo = geteotffuncui_graphics;
        decodeHelper.ResultReceiver = map;
        decodeHelper.MediaMetadataCompat = z;
        decodeHelper.MediaDescriptionCompat = z2;
        this.ParcelableVolumeInfo = accessgetperceptualcp;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = eotffunclambda0;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = renderIntentCompanion;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = generateeotf;
        this._init_lambda4 = i;
        this.ResultReceiver = i2;
        this.PlaybackStateCompat = accessiswidegamut;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = geteotffuncui_graphics;
        this.RemoteActionCompatParcelizer = accessissrgb;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.INITIALIZE;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = obj;
        this.PlaybackStateCompatCustomAction = accessgetperceptualcp.MediaBrowserCompatMediaItem;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (Supplier) geteotffuncui_graphics.serializer(serializer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        getPrimaries getprimaries = this.MediaSessionCompatQueueItem;
        try {
            try {
                if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    write();
                    if (getprimaries != null) {
                        getprimaries.write();
                        return;
                    }
                    return;
                }
                MediaDescriptionCompat();
                if (getprimaries != null) {
                    getprimaries.write();
                }
            } catch (Throwable th) {
                if (getprimaries != null) {
                    getprimaries.write();
                }
                throw th;
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            }
            if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != accesscomputeWhitePoint.ENCODE) {
                this._init_lambda1.add(th2);
                write();
            }
            if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void serializer() {
        accessgenerateEotf accessgenerateeotf = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        synchronized (accessgenerateeotf) {
            accessgenerateeotf.write = false;
            accessgenerateeotf.IconCompatParcelizer = false;
            accessgenerateeotf.read = false;
        }
        NavArgsLazy navArgsLazy = this.MediaSessionCompatToken;
        navArgsLazy.MediaSessionCompatQueueItem = null;
        navArgsLazy.read = null;
        navArgsLazy.RatingCompat = null;
        DecodeHelper decodeHelper = this.RatingCompat;
        decodeHelper.RemoteActionCompatParcelizer = null;
        decodeHelper.MediaSessionCompatToken = null;
        decodeHelper.PlaybackStateCompatCustomAction = null;
        decodeHelper.PlaybackStateCompat = null;
        decodeHelper.ComponentActivity = null;
        decodeHelper.ParcelableVolumeInfo = null;
        decodeHelper.MediaSessionCompatResultReceiverWrapper = null;
        decodeHelper.ResultReceiver = null;
        decodeHelper.write = null;
        decodeHelper.MediaBrowserCompatMediaItem.clear();
        decodeHelper.MediaSessionCompatQueueItem = false;
        decodeHelper.read.clear();
        decodeHelper.RatingCompat = false;
        this.ComponentActivity = false;
        this.ParcelableVolumeInfo = null;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = null;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
        this.RemoteActionCompatParcelizer = null;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaDescriptionCompat = null;
        this.read = null;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        this._init_lambda1.clear();
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer(this);
    }

    public final accesscomputeWhitePoint write(accesscomputeWhitePoint accesscomputewhitepoint) {
        int i = accessgenerateOetf.write[accesscomputewhitepoint.ordinal()];
        if (i == 1) {
            return this.PlaybackStateCompat.RemoteActionCompatParcelizer != 0 ? accesscomputeWhitePoint.DATA_CACHE : write(accesscomputeWhitePoint.DATA_CACHE);
        }
        if (i == 2) {
            return accesscomputeWhitePoint.SOURCE;
        }
        if (i == 3 || i == 4) {
            return accesscomputeWhitePoint.FINISHED;
        }
        if (i == 5) {
            int i2 = this.PlaybackStateCompat.RemoteActionCompatParcelizer;
            return (i2 == 0 || i2 == 1) ? write(accesscomputeWhitePoint.RESOURCE_CACHE) : accesscomputeWhitePoint.RESOURCE_CACHE;
        }
        Gson$$ExternalSyntheticBUOutline0.m(accesscomputewhitepoint, "Unrecognized stage: ");
        return null;
    }

    public final generateOetf write(getPrimaries getprimaries, Object obj, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        if (obj == null) {
            getprimaries.write();
            return null;
        }
        try {
            int i = Stroke.write;
            SystemClock.elapsedRealtimeNanos();
            generateOetf generateoetfRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj, r8lambdayjgjsam_wcskwad6z3tn2h9p74i);
            if (Log.isLoggable("DecodeJob", 2)) {
                generateoetfRemoteActionCompatParcelizer.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                Thread.currentThread().getName();
            }
            return generateoetfRemoteActionCompatParcelizer;
        } finally {
            getprimaries.write();
        }
    }

    public final void RemoteActionCompatParcelizer() {
        generateOetf generateoetfWrite;
        boolean zIconCompatParcelizer;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.read + ", cache key: " + this.MediaDescriptionCompat + ", fetcher: " + this.MediaSessionCompatQueueItem;
            int i = Stroke.write;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            ", ".concat(str);
            Thread.currentThread().getName();
        }
        generateOetflambda1 generateoetflambda1 = null;
        if (this.PlaybackStateCompatCustomAction.serializer.containsKey(RenderIntent.class) && (supplier = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                Log.isLoggable("DecodeJob", 2);
            }
        }
        try {
            generateoetfWrite = write(this.MediaSessionCompatQueueItem, this.read, this.IconCompatParcelizer);
        } catch (GlideException e) {
            eotfFunclambda0 eotffunclambda0 = this.write;
            r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i = this.IconCompatParcelizer;
            e.MediaMetadataCompat = eotffunclambda0;
            e.IconCompatParcelizer = r8lambdayjgjsam_wcskwad6z3tn2h9p74i;
            e.write = null;
            this._init_lambda1.add(e);
            generateoetfWrite = null;
        }
        if (generateoetfWrite != null) {
            r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i2 = this.IconCompatParcelizer;
            if (generateoetfWrite instanceof cross) {
                ((cross) generateoetfWrite).read();
            }
            int i2 = 1;
            if (((generateOetflambda1) this.MediaSessionCompatToken.RatingCompat) != null) {
                generateoetflambda1 = (generateOetflambda1) generateOetflambda1.serializer.write();
                generateoetflambda1.IconCompatParcelizer = false;
                generateoetflambda1.RemoteActionCompatParcelizer = true;
                generateoetflambda1.read = generateoetfWrite;
                generateoetfWrite = generateoetflambda1;
            }
            if (this.PlaybackStateCompatCustomAction.serializer.containsKey(RenderIntent.class)) {
                RatingCompat();
            }
            MediaBrowserCompatMediaItem();
            accessisSrgb accessissrgb = this.RemoteActionCompatParcelizer;
            synchronized (accessissrgb) {
                accessissrgb.ComponentActivity = generateoetfWrite;
                accessissrgb.read = r8lambdayjgjsam_wcskwad6z3tn2h9p74i2;
            }
            synchronized (accessissrgb) {
                accessissrgb.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
                if (accessissrgb.ParcelableVolumeInfo) {
                    accessissrgb.ComponentActivity.MediaBrowserCompatMediaItem();
                    accessissrgb.read();
                } else if (!accessissrgb.write.RemoteActionCompatParcelizer.isEmpty()) {
                    if (!accessissrgb.MediaSessionCompatResultReceiverWrapper) {
                        Timestamp.Companion companion = accessissrgb.MediaDescriptionCompat;
                        generateOetf generateoetf = accessissrgb.ComponentActivity;
                        boolean z = accessissrgb.PlaybackStateCompat;
                        generateEotf generateeotf = accessissrgb.MediaSessionCompatToken;
                        area areaVar = accessissrgb.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        companion.getClass();
                        accessissrgb.MediaMetadataCompat = new generateEotflambda0(generateoetf, z, true, generateeotf, areaVar);
                        accessissrgb.MediaSessionCompatResultReceiverWrapper = true;
                        computeXYZMatrix computexyzmatrix = accessissrgb.write;
                        computexyzmatrix.getClass();
                        ArrayList<computeWhitePoint> arrayList = new ArrayList(computexyzmatrix.RemoteActionCompatParcelizer);
                        accessissrgb.write(arrayList.size() + 1);
                        accessissrgb.RatingCompat.write(accessissrgb, accessissrgb.MediaSessionCompatToken, accessissrgb.MediaMetadataCompat);
                        for (computeWhitePoint computewhitepoint : arrayList) {
                            computewhitepoint.IconCompatParcelizer.execute(new accessxyPrimaries(accessissrgb, computewhitepoint.write, i2));
                        }
                        accessissrgb.RemoteActionCompatParcelizer();
                    } else {
                        throw new IllegalStateException("Already have resource");
                    }
                } else {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
            }
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = accesscomputeWhitePoint.ENCODE;
            try {
                NavArgsLazy navArgsLazy = this.MediaSessionCompatToken;
                if (((generateOetflambda1) navArgsLazy.RatingCompat) != null) {
                    try {
                        this.MediaSessionCompatResultReceiverWrapper.serializer().write((eotfFunclambda0) navArgsLazy.MediaSessionCompatQueueItem, new NavArgsLazy((fromLinear) navArgsLazy.read, (generateOetflambda1) navArgsLazy.RatingCompat, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 26));
                        ((generateOetflambda1) navArgsLazy.RatingCompat).serializer();
                    } catch (Throwable th) {
                        ((generateOetflambda1) navArgsLazy.RatingCompat).serializer();
                        throw th;
                    }
                }
                if (generateoetflambda1 != null) {
                    generateoetflambda1.serializer();
                }
                accessgenerateEotf accessgenerateeotf = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                synchronized (accessgenerateeotf) {
                    accessgenerateeotf.write = true;
                    zIconCompatParcelizer = accessgenerateeotf.IconCompatParcelizer();
                }
                if (zIconCompatParcelizer) {
                    serializer();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (generateoetflambda1 != null) {
                    generateoetflambda1.serializer();
                }
                throw th2;
            }
        }
        MediaMetadataCompat();
    }

    public final void MediaMetadataCompat() {
        this.MediaBrowserCompatMediaItem = Thread.currentThread();
        int i = Stroke.write;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && this.MediaMetadataCompat != null && !(z = this.MediaMetadataCompat.read())) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            this.MediaMetadataCompat = read();
            if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == accesscomputeWhitePoint.SOURCE) {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.SWITCH_TO_SOURCE_SERVICE;
                accessisSrgb accessissrgb = this.RemoteActionCompatParcelizer;
                (accessissrgb.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ? accessissrgb.IconCompatParcelizer : accessissrgb.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).execute(this);
                return;
            }
        }
        if ((this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == accesscomputeWhitePoint.FINISHED || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) && !z) {
            write();
        }
    }

    public final void RatingCompat() {
        if (!this.PlaybackStateCompatCustomAction.serializer.containsKey(RenderIntent.class)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            Log.isLoggable("DecodeJob", 2);
        }
    }

    public final generateOetf RemoteActionCompatParcelizer(Object obj, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        Class<?> cls = obj.getClass();
        DecodeHelper decodeHelper = this.RatingCompat;
        generateEotflambda3 generateeotflambda3RemoteActionCompatParcelizer = decodeHelper.RemoteActionCompatParcelizer(cls);
        getEotfFuncui_graphics geteotffuncui_graphics = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        boolean z = r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.RESOURCE_DISK_CACHE || decodeHelper.MediaDescriptionCompat;
        accessgetMinp accessgetminp = CanvasDrawScopeKtasDrawTransform1.RemoteActionCompatParcelizer;
        Boolean bool = (Boolean) geteotffuncui_graphics.serializer(accessgetminp);
        if (bool == null || (bool.booleanValue() && !z)) {
            geteotffuncui_graphics = new getEotfFuncui_graphics();
            DrawStyle drawStyle = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write;
            DrawStyle drawStyle2 = geteotffuncui_graphics.write;
            drawStyle2.RemoteActionCompatParcelizer(drawStyle);
            drawStyle2.put(accessgetminp, Boolean.valueOf(z));
        }
        getEotfFuncui_graphics geteotffuncui_graphics2 = geteotffuncui_graphics;
        getOetfOrigui_graphics getoetforigui_graphicsSerializer = this.ParcelableVolumeInfo.RemoteActionCompatParcelizer().serializer(obj);
        try {
            return generateeotflambda3RemoteActionCompatParcelizer.write(this._init_lambda4, this.ResultReceiver, geteotffuncui_graphics2, getoetforigui_graphicsSerializer, new computePrimariesui_graphics(this, r8lambdayjgjsam_wcskwad6z3tn2h9p74i));
        } finally {
            getoetforigui_graphicsSerializer.serializer();
        }
    }

    public final void write() {
        boolean zIconCompatParcelizer;
        if (this.PlaybackStateCompatCustomAction.serializer.containsKey(RenderIntent.class)) {
            RatingCompat();
        }
        MediaBrowserCompatMediaItem();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this._init_lambda1));
        accessisSrgb accessissrgb = this.RemoteActionCompatParcelizer;
        synchronized (accessissrgb) {
            accessissrgb.MediaBrowserCompatMediaItem = glideException;
        }
        synchronized (accessissrgb) {
            accessissrgb.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
            if (accessissrgb.ParcelableVolumeInfo) {
                accessissrgb.read();
            } else {
                if (accessissrgb.write.RemoteActionCompatParcelizer.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (accessissrgb.PlaybackStateCompatCustomAction) {
                    throw new IllegalStateException("Already failed once");
                }
                accessissrgb.PlaybackStateCompatCustomAction = true;
                generateEotf generateeotf = accessissrgb.MediaSessionCompatToken;
                computeXYZMatrix computexyzmatrix = accessissrgb.write;
                computexyzmatrix.getClass();
                ArrayList<computeWhitePoint> arrayList = new ArrayList(computexyzmatrix.RemoteActionCompatParcelizer);
                accessissrgb.write(arrayList.size() + 1);
                accessissrgb.RatingCompat.write(accessissrgb, generateeotf, null);
                for (computeWhitePoint computewhitepoint : arrayList) {
                    computewhitepoint.IconCompatParcelizer.execute(new accessxyPrimaries(accessissrgb, computewhitepoint.write, 0));
                }
                accessissrgb.RemoteActionCompatParcelizer();
            }
        }
        accessgenerateEotf accessgenerateeotf = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        synchronized (accessgenerateeotf) {
            accessgenerateeotf.read = true;
            zIconCompatParcelizer = accessgenerateeotf.IconCompatParcelizer();
        }
        if (zIconCompatParcelizer) {
            serializer();
        }
    }

    public DecodeJob(scale0AR0LA0default scale0ar0la0default, EmojiProcessor emojiProcessor) {
        this.MediaSessionCompatResultReceiverWrapper = scale0ar0la0default;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = emojiProcessor;
    }

    @Override // o.r8lambdaD96iEcIUdknPeYphmySUeDTc3iU
    public final void read(eotfFunclambda0 eotffunclambda0, Exception exc, getPrimaries getprimaries, r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        getprimaries.write();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsSerializer = getprimaries.serializer();
        glideException.MediaMetadataCompat = eotffunclambda0;
        glideException.IconCompatParcelizer = r8lambdayjgjsam_wcskwad6z3tn2h9p74i;
        glideException.write = clsSerializer;
        this._init_lambda1.add(glideException);
        if (Thread.currentThread() == this.MediaBrowserCompatMediaItem) {
            MediaMetadataCompat();
            return;
        }
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.SWITCH_TO_SOURCE_SERVICE;
        accessisSrgb accessissrgb = this.RemoteActionCompatParcelizer;
        (accessissrgb.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ? accessissrgb.IconCompatParcelizer : accessissrgb.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).execute(this);
    }
}
