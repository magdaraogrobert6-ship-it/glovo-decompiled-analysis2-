package o;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.transition.Transition$1;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.oss.licenses.zzm;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.fFk$$ExternalSyntheticLambda0;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import okio.Options;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class getExponentimpl implements WebViewStartUpCallbackBoundaryInterface, WebViewStartUpConfigBoundaryInterface, drawImagegbVJVH8, r8lambdayrUYrLf4y8jALbFcm2n28OpawQ, setGraphicsLayer, recordInternal, getNativeAlpha, accessgetNumPadRightParenthesiscp, PinnableContainer {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public Object read;
    public final /* synthetic */ int write;

    @Override // o.getNativeAlpha
    public void serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getNativeAlpha
    public zzm RemoteActionCompatParcelizer() {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.read;
        Set set = accessgetNumPad6cp.read;
        synchronized (set) {
        }
        return new zzm(signInHubActivity, set);
    }

    public getExponentimpl(int i) {
        this.write = i;
        if (i == 12) {
            this.read = new configureStrokePaintho4zsrM(7);
            return;
        }
        if (i == 13) {
            this.read = new drawCircleV9BoPsw(500L);
        } else if (i == 15) {
            this.read = new getExponentimpl(13);
        } else if (i != 26) {
            this.read = new HashSet();
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            z = ((truncslo4al4) this.read).read;
            int i3 = 61 / 0;
        } else {
            z = ((truncslo4al4) this.read).read;
        }
        int i4 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((WebSettingsBoundaryInterface) this.read).setForceDarkBehavior(1);
        int i4 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fFk$$ExternalSyntheticLambda0 ffk__externalsyntheticlambda0 = (fFk$$ExternalSyntheticLambda0) ((truncslo4al4) this.read).IconCompatParcelizer;
        int i4 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return ffk__externalsyntheticlambda0;
    }

    public void read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((WebSettingsBoundaryInterface) this.read).setForceDark(2);
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    @Override // o.setGraphicsLayer
    public int write() throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = (IconCompatParcelizer() << 8) | IconCompatParcelizer();
        int i4 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iIconCompatParcelizer;
        }
        throw null;
    }

    @Override // o.setGraphicsLayer
    public short IconCompatParcelizer() throws IOException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = ((InputStream) this.read).read();
        if (i4 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        short s = (short) i4;
        int i5 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return s;
    }

    @Override // o.getNativeAlpha
    public /* synthetic */ void write(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SignInHubActivity signInHubActivity = (SignInHubActivity) this.read;
            signInHubActivity.setResult(signInHubActivity.read(), signInHubActivity.RemoteActionCompatParcelizer());
            signInHubActivity.finish();
            return;
        }
        SignInHubActivity signInHubActivity2 = (SignInHubActivity) this.read;
        signInHubActivity2.setResult(signInHubActivity2.read(), signInHubActivity2.RemoteActionCompatParcelizer());
        signInHubActivity2.finish();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = 2;
        int i2 = 2 % 2;
        Object obj = null;
        if (this.write != 12) {
            copyUg5Nnssdefault copyug5nnssdefault = new copyUg5Nnssdefault((getExponentimpl) this.read);
            int i3 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return copyug5nnssdefault;
            }
            obj.hashCode();
            throw null;
        }
        obtainFillPaint obtainfillpaint = new obtainFillPaint(i, (configureStrokePaintho4zsrM) this.read);
        int i4 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return obtainfillpaint;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.setGraphicsLayer
    public int RemoteActionCompatParcelizer(int i, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = 0;
        int i6 = 0;
        while (i6 < i && (i5 = ((InputStream) this.read).read(bArr, i6, i - i6)) != -1) {
            int i7 = RemoteActionCompatParcelizer + 23;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i6 = i7 % 2 != 0 ? i6 << i5 : i6 + i5;
        }
        if (i6 == 0 && i5 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r6 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r8 = o.getExponentimpl.IconCompatParcelizer + 35;
        o.getExponentimpl.RemoteActionCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if ((r8 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r8 = r1.skip(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r8 <= 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r8 = r1.skip(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r8 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r1.read() != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r6 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return r12 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r12 < 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r12 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return 0;
     */
    @Override // o.setGraphicsLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long serializer(long r12) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getExponentimpl.RemoteActionCompatParcelizer
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.getExponentimpl.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r11.read
            java.io.InputStream r1 = (java.io.InputStream) r1
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 >= 0) goto L24
            goto L23
        L1b:
            java.lang.Object r1 = r11.read
            java.io.InputStream r1 = (java.io.InputStream) r1
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 >= 0) goto L24
        L23:
            return r4
        L24:
            r6 = r12
        L25:
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L51
            int r8 = o.getExponentimpl.IconCompatParcelizer
            int r8 = r8 + 35
            int r9 = r8 % 128
            o.getExponentimpl.RemoteActionCompatParcelizer = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L3d
            long r8 = r1.skip(r6)
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L46
            goto L4f
        L3d:
            long r8 = r1.skip(r6)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L46
            goto L4f
        L46:
            int r8 = r1.read()
            r9 = -1
            if (r8 != r9) goto L4e
            goto L51
        L4e:
            r8 = r2
        L4f:
            long r6 = r6 - r8
            goto L25
        L51:
            long r12 = r12 - r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExponentimpl.serializer(long):long");
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        int i = 2 % 2;
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) Options.Companion.read(iWrite, 1514248696, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{WebViewStartUpResultBoundaryInterface.class, invocationHandler}, iWrite3, -1514248694);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        getExponentimpl getexponentimpl = new getExponentimpl(webViewStartUpResultBoundaryInterface);
        new Handler(Looper.getMainLooper()).post(new w4$$ExternalSyntheticLambda0((SentryTracer$$ExternalSyntheticLambda1) ((OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) this.read).serializer, 5, getexponentimpl));
        int i2 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public getExponentimpl(Activity activity) {
        this.write = 20;
        accessgetSystemNavigationDowncp.serializer(activity, "Activity must not be null");
        this.read = activity;
    }

    public getExponentimpl(CourierApplication courierApplication) {
        this.write = 17;
        courierApplication.getClass();
        this.read = courierApplication;
    }

    public /* synthetic */ getExponentimpl(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    public getExponentimpl(Transition$1 transition$1, r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA r8lambdatoejz8ebqikfdbp_lhyd8cduqfa) {
        this.write = 18;
        r8lambdatoejz8ebqikfdbp_lhyd8cduqfa.getClass();
        this.read = r8lambdatoejz8ebqikfdbp_lhyd8cduqfa;
    }

    public getExponentimpl(AlphaKt alphaKt) {
        this.write = 1;
        this.read = new java.lang.ref.WeakReference(alphaKt);
    }

    public getExponentimpl(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.write = 3;
        this.read = webViewStartUpResultBoundaryInterface;
        List<Throwable> blockingStartUpLocations = webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations();
        ArrayList arrayList = new ArrayList();
        for (Throwable th : blockingStartUpLocations) {
            arrayList.add(new getMinNormalslo4al4(0));
            int i = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ
    public boolean IconCompatParcelizer(Object obj, File file, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i = 2 % 2;
        InputStream inputStream = (InputStream) obj;
        getF getf = (getF) this.read;
        byte[] bArr = (byte[]) getf.IconCompatParcelizer(byte[].class, 65536);
        FileOutputStream fileOutputStreamWrite = null;
        try {
            try {
                fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    fileOutputStreamWrite.write(bArr, 0, i2);
                    int i3 = IconCompatParcelizer + 19;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i4 = 5 % 3;
                    }
                }
                fileOutputStreamWrite.close();
                try {
                    fileOutputStreamWrite.close();
                    int i5 = RemoteActionCompatParcelizer + 11;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                } catch (IOException unused) {
                }
                getf.IconCompatParcelizer(bArr);
                return true;
            } catch (IOException unused2) {
                Log.isLoggable("StreamEncoder", 3);
                if (fileOutputStreamWrite != null) {
                    try {
                        fileOutputStreamWrite.close();
                        int i7 = RemoteActionCompatParcelizer + 91;
                        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    } catch (IOException unused3) {
                    }
                }
                getf.IconCompatParcelizer(bArr);
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStreamWrite != null) {
                try {
                    fileOutputStreamWrite.close();
                    int i9 = RemoteActionCompatParcelizer + 119;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } catch (IOException unused4) {
                }
            }
            getf.IconCompatParcelizer(bArr);
            throw th;
        }
    }

    @Override // o.PinnableContainer
    public /* synthetic */ void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Status status = Status.read;
        Status status2 = Status.serializer;
        Status status3 = Status.IconCompatParcelizer;
        if (i4 == 27) {
            getMediaRecordEK5gGoQ getmediarecordek5ggoq = (getMediaRecordEK5gGoQ) this.read;
            if (task.isSuccessful()) {
                getmediarecordek5ggoq.write(status3);
                int i5 = IconCompatParcelizer + 87;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return;
            }
            if (task.isCanceled()) {
                getmediarecordek5ggoq.RemoteActionCompatParcelizer(status2);
                return;
            }
            Exception exception = task.getException();
            if (!(!(exception instanceof com.google.android.gms.common.api.ApiException))) {
                getmediarecordek5ggoq.RemoteActionCompatParcelizer(((com.google.android.gms.common.api.ApiException) exception).getStatus());
                return;
            } else {
                getmediarecordek5ggoq.RemoteActionCompatParcelizer(status);
                return;
            }
        }
        getMetaLeftEK5gGoQ getmetaleftek5ggoq = (getMetaLeftEK5gGoQ) this.read;
        if (!(!task.isSuccessful())) {
            int i7 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getmetaleftek5ggoq.write(status3);
        } else if (task.isCanceled()) {
            int i9 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getmetaleftek5ggoq.RemoteActionCompatParcelizer(status2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getmetaleftek5ggoq.RemoteActionCompatParcelizer(status2);
        } else {
            Exception exception2 = task.getException();
            if (exception2 instanceof com.google.android.gms.common.api.ApiException) {
                getmetaleftek5ggoq.RemoteActionCompatParcelizer(((com.google.android.gms.common.api.ApiException) exception2).getStatus());
            } else {
                getmetaleftek5ggoq.RemoteActionCompatParcelizer(status);
            }
        }
        int i10 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public void serializer(getButton9EK5gGoQ getbutton9ek5ggoq) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = getbutton9ek5ggoq.write;
        long j2 = getbutton9ek5ggoq.read;
        getButtonStartEK5gGoQ getbuttonstartek5ggoq = (getButtonStartEK5gGoQ) this.read;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = getbuttonstartek5ggoq.MediaBrowserCompatMediaItem;
        if (j != 0) {
            accessgettvinputcomposite1cp.getClass();
            if (j + 14400000 < System.currentTimeMillis()) {
                getbuttonstartek5ggoq.RemoteActionCompatParcelizer(new String[]{String.valueOf(j2)});
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                int i4 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        int i6 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        accessgettvinputcomposite1cp.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = getbuttonstartek5ggoq.IconCompatParcelizer("Error opening database for getNumStoredHits.");
        if (sQLiteDatabaseIconCompatParcelizer == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(jCurrentTimeMillis));
        try {
            sQLiteDatabaseIconCompatParcelizer.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j2)});
        } catch (SQLiteException e) {
            getButtonThumbLeftEK5gGoQ.serializer("Error setting HIT_FIRST_DISPATCH_TIME for hitId " + j2 + ": " + e.getMessage());
            getbuttonstartek5ggoq.RemoteActionCompatParcelizer(new String[]{String.valueOf(j2)});
        }
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        Object obj3 = null;
        switch (this.write) {
            case 22:
                accessgetSixcp accessgetsixcp = (accessgetSixcp) ((accessgetShiftRightcp) obj).MediaSessionCompatResultReceiverWrapper();
                zab zabVar = (zab) this.read;
                Parcel parcelWrite = accessgetsixcp.write();
                getBEK5gGoQ.serializer(parcelWrite, zabVar);
                try {
                    accessgetsixcp.IconCompatParcelizer.transact(1, parcelWrite, null, 1);
                    parcelWrite.recycle();
                    parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                    int i4 = RemoteActionCompatParcelizer + 63;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return;
                } catch (Throwable th) {
                    parcelWrite.recycle();
                    throw th;
                }
            case 23:
                accessgetSettingscp accessgetsettingscp = (accessgetSettingscp) ((accessgetSoftSleepcp) obj).MediaSessionCompatResultReceiverWrapper();
                TelemetryData telemetryData = (TelemetryData) this.read;
                Parcel parcelWrite2 = accessgetsettingscp.write();
                getBEK5gGoQ.serializer(parcelWrite2, telemetryData);
                try {
                    accessgetsettingscp.IconCompatParcelizer.transact(1, parcelWrite2, null, 1);
                    parcelWrite2.recycle();
                    parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                    return;
                } catch (Throwable th2) {
                    parcelWrite2.recycle();
                    throw th2;
                }
            case 24:
                getAEK5gGoQ getaek5ggoq = (getAEK5gGoQ) ((accessgetZenkakuHankarucp) obj).MediaSessionCompatResultReceiverWrapper();
                accessgetZoomOutcp accessgetzoomoutcp = new accessgetZoomOutcp((KeyCompanion) this.read, parentDataModifierDefaultImpls);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                parcelObtain.writeString(null);
                int i6 = getAltLeftEK5gGoQ.RemoteActionCompatParcelizer;
                parcelObtain.writeStrongBinder(accessgetzoomoutcp);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    getaek5ggoq.write.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            default:
                ((zzdz) obj).IconCompatParcelizer((LastLocationRequest) this.read, parentDataModifierDefaultImpls);
                int i7 = IconCompatParcelizer + 21;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return;
                }
                obj3.hashCode();
                throw null;
        }
    }
}
