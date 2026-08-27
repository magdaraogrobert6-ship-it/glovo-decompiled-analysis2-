package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.tasks.Task;
import com.huawei.hmf.tasks.a.d$a;
import com.roadrunner.web.performance.WebViewInitializer;
import io.grpc.Status;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetApparentToRealOffsetnOccac implements rotateRad0AR0LA0, accessgetDefaultHandlercp {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public static volatile accessgetApparentToRealOffsetnOccac RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public boolean read;
    public final Object serializer;
    public Object write;

    public void RemoteActionCompatParcelizer(getApparentToRealOffsetnOccac getapparenttorealoffsetnoccac) {
        synchronized (this.serializer) {
            if (((ArrayDeque) this.write) == null) {
                this.write = new ArrayDeque();
            }
            ((ArrayDeque) this.write).add(getapparenttorealoffsetnoccac);
        }
    }

    public void write(Task task) {
        getApparentToRealOffsetnOccac getapparenttorealoffsetnoccac;
        Object obj = this.serializer;
        synchronized (obj) {
            if (((ArrayDeque) this.write) != null && !this.read) {
                this.read = true;
                while (true) {
                    synchronized (obj) {
                        getapparenttorealoffsetnoccac = (getApparentToRealOffsetnOccac) ((ArrayDeque) this.write).poll();
                        if (getapparenttorealoffsetnoccac == null) {
                            this.read = false;
                            return;
                        }
                    }
                    getapparenttorealoffsetnoccac.read(task);
                }
            }
        }
    }

    public accessgetApparentToRealOffsetnOccac(int i) {
        this.IconCompatParcelizer = i;
        if (i != 3) {
            this.serializer = new Object();
        } else {
            this.serializer = Collections.newSetFromMap(new WeakHashMap());
            this.write = new HashSet();
        }
    }

    public void write(boolean z) {
        int i = 2 % 2;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA(r8lambday78ccsnuxer22a2wvqifr2bmbdo, (getLocalHtmlUrlFromRemoteUrllambda2) this.serializer, z));
        int i2 = MediaMetadataCompat + 47;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    public boolean write(rotateRg1IO4c rotaterg1io4c) {
        int i = 2 % 2;
        boolean z = true;
        if (rotaterg1io4c == null) {
            return true;
        }
        boolean zRemove = ((Set) this.serializer).remove(rotaterg1io4c);
        if (!((HashSet) this.write).remove(rotaterg1io4c)) {
            int i2 = RatingCompat + 29;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!zRemove) {
                z = false;
            }
        }
        if (!(!z)) {
            int i3 = RatingCompat + 41;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            rotaterg1io4c.write();
        }
        return z;
    }

    public accessgetApparentToRealOffsetnOccac(boolean z, WebViewInitializer webViewInitializer, CancellableContinuationImpl cancellableContinuationImpl) {
        this.IconCompatParcelizer = 4;
        this.read = z;
        this.serializer = webViewInitializer;
        this.write = cancellableContinuationImpl;
    }

    public accessgetApparentToRealOffsetnOccac(Context context) {
        this.IconCompatParcelizer = 1;
        this.write = new HashSet();
        this.serializer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(new scale0AR0LA0default(new getFocusEK5gGoQ(context, 1)), new clipPathKD09W0Mdefault(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("Glide registry");
        r5.read = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r1 = kotlin.LazyKt__LazyJVMKt.serializer((com.bumptech.glide.Glide) r5.serializer, (java.util.ArrayList) r5.write);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r5.read = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("Glide registry");
        r5.read = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r1 = kotlin.LazyKt__LazyJVMKt.serializer((com.bumptech.glide.Glide) r5.serializer, (java.util.ArrayList) r5.write);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r5.read = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5.read = false;
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.read != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.read == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 41;
        o.accessgetApparentToRealOffsetnOccac.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.rotateRad0AR0LA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B_() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accessgetApparentToRealOffsetnOccac.MediaMetadataCompat
            int r2 = r1 + 39
            int r3 = r2 % 128
            o.accessgetApparentToRealOffsetnOccac.RatingCompat = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            boolean r2 = r5.read
            r4 = 41
            int r4 = r4 / r3
            if (r2 == 0) goto L1b
            goto L59
        L17:
            boolean r2 = r5.read
            if (r2 != 0) goto L59
        L1b:
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.accessgetApparentToRealOffsetnOccac.RatingCompat = r2
            int r1 = r1 % r0
            r0 = 1
            java.lang.String r2 = "Glide registry"
            if (r1 != 0) goto L3b
            o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(r2)
            r5.read = r3
            java.lang.Object r1 = r5.serializer     // Catch: java.lang.Throwable -> L52
            com.bumptech.glide.Glide r1 = (com.bumptech.glide.Glide) r1     // Catch: java.lang.Throwable -> L52
            java.lang.Object r2 = r5.write     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L52
            com.bumptech.glide.Registry r1 = kotlin.LazyKt__LazyJVMKt.serializer(r1, r2)     // Catch: java.lang.Throwable -> L52
            r5.read = r0
            goto L4e
        L3b:
            o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(r2)
            r5.read = r0
            java.lang.Object r0 = r5.serializer     // Catch: java.lang.Throwable -> L52
            com.bumptech.glide.Glide r0 = (com.bumptech.glide.Glide) r0     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r5.write     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L52
            com.bumptech.glide.Registry r1 = kotlin.LazyKt__LazyJVMKt.serializer(r0, r1)     // Catch: java.lang.Throwable -> L52
            r5.read = r3
        L4e:
            android.os.Trace.endSection()
            return r1
        L52:
            r0 = move-exception
            r5.read = r3
            android.os.Trace.endSection()
            throw r0
        L59:
            java.lang.String r0 = "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetApparentToRealOffsetnOccac.B_():java.lang.Object");
    }

    public static accessgetApparentToRealOffsetnOccac IconCompatParcelizer(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (accessgetApparentToRealOffsetnOccac.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = new accessgetApparentToRealOffsetnOccac(context.getApplicationContext());
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public void RemoteActionCompatParcelizer(Status status) {
        int i = 2 % 2;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.RatingCompat.IconCompatParcelizer(optEnum.INFO, "{0} SHUTDOWN with {1}", ((getLocalHtmlUrlFromRemoteUrllambda2) this.serializer).read(), r8lambday78CcsNUxER22a2WVqifR2BmBdo.RemoteActionCompatParcelizer(status));
        this.read = true;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new d$a(this, 13, status));
        int i2 = RatingCompat + 79;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public accessgetApparentToRealOffsetnOccac(com.bumptech.glide.Glide glide, ArrayList arrayList, TuplesKt tuplesKt) {
        this.IconCompatParcelizer = 2;
        this.serializer = glide;
        this.write = arrayList;
    }

    public accessgetApparentToRealOffsetnOccac(r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo, getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2) {
        this.IconCompatParcelizer = 5;
        this.write = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
        this.read = false;
        this.serializer = getlocalhtmlurlfromremoteurllambda2;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 61;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{numRequests=");
            sb.append(((Set) this.serializer).size());
            sb.append(", isPaused=");
            return ff$$ExternalSyntheticOutline0.m(sb, this.read, "}");
        }
        String string = super.toString();
        int i3 = MediaMetadataCompat + 85;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    public void read() {
        boolean z;
        int i = 2 % 2;
        boolean z2 = true;
        if (!(!this.read)) {
            return;
        }
        int i2 = MediaMetadataCompat + 3;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((HashSet) this.write).isEmpty()) {
            return;
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.serializer;
        scale0AR0LA0default scale0ar0la0default = (scale0AR0LA0default) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer;
        if (((ConnectivityManager) scale0ar0la0default.B_()).getActiveNetwork() != null) {
            int i4 = RatingCompat + 23;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = z;
        try {
            ((ConnectivityManager) scale0ar0la0default.B_()).registerDefaultNetworkCallback((io.sentry.android.core.internal.util.write) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read);
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                SentryLogcatAdapter.write("ConnectivityMonitor", "Failed to register callback", e);
            }
            z2 = false;
        }
        this.read = z2;
    }

    public void serializer() {
        int i = 2 % 2;
        TextStreamsKt.RemoteActionCompatParcelizer("transportShutdown() must be called before transportTerminated().", this.read);
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.write;
        r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc r8lambdan29im8cjkn7obdaxnvkijdq8rpc = r8lambday78ccsnuxer22a2wvqifr2bmbdo.RatingCompat;
        optEnum optenum = optEnum.INFO;
        getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2 = (getLocalHtmlUrlFromRemoteUrllambda2) this.serializer;
        r8lambdan29im8cjkn7obdaxnvkijdq8rpc.IconCompatParcelizer(optenum, "{0} Terminated", getlocalhtmlurlfromremoteurllambda2.read());
        getMethodQuietlylambda1 getmethodquietlylambda1 = r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        getmethodquietlylambda1.execute(new r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA(r8lambday78ccsnuxer22a2wvqifr2bmbdo, getlocalhtmlurlfromremoteurllambda2, false));
        Iterator it = r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.iterator();
        Object obj = null;
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            getlocalhtmlurlfromremoteurllambda2.serializer();
            throw null;
        }
        getmethodquietlylambda1.execute(new isAutomaticGeofenceRequestsEnabled(9, this));
        int i2 = MediaMetadataCompat + 55;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
