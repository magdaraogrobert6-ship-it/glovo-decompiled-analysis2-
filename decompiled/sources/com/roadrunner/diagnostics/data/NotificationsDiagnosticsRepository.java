package com.roadrunner.diagnostics.data;

import android.app.Application;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.setDpMargin;
import o.setWrapMode;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsDiagnosticsRepository {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final p0 IconCompatParcelizer;
    public final ExecuteApiRequest RemoteActionCompatParcelizer;
    public final Application read;
    public final setDpMargin serializer;
    public final setWrapMode write;

    public NotificationsDiagnosticsRepository(Application application, p0 p0Var, setDpMargin setdpmargin, setWrapMode setwrapmode, ExecuteApiRequest executeApiRequest) {
        application.getClass();
        p0Var.getClass();
        setdpmargin.getClass();
        setwrapmode.getClass();
        executeApiRequest.getClass();
        this.read = application;
        this.IconCompatParcelizer = p0Var;
        this.serializer = setdpmargin;
        this.write = setwrapmode;
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r3
  0x002b: PHI (r1v9 com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository$sendTestPush$1) = 
  (r1v8 com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository$sendTestPush$1)
  (r1v11 com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository$sendTestPush$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: sendTestPush-0E7RQCE, reason: not valid java name */
    public final Object m4953sendTestPush0E7RQCE(String str, String str2, ContinuationImpl continuationImpl) {
        NotificationsDiagnosticsRepository$sendTestPush$1 notificationsDiagnosticsRepository$sendTestPush$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof NotificationsDiagnosticsRepository$sendTestPush$1) {
            int i3 = MediaSessionCompatQueueItem + 115;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                notificationsDiagnosticsRepository$sendTestPush$1 = (NotificationsDiagnosticsRepository$sendTestPush$1) continuationImpl;
                i = notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer;
                int i4 = 98 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    notificationsDiagnosticsRepository$sendTestPush$1 = new NotificationsDiagnosticsRepository$sendTestPush$1(this, continuationImpl);
                }
            } else {
                notificationsDiagnosticsRepository$sendTestPush$1 = (NotificationsDiagnosticsRepository$sendTestPush$1) continuationImpl;
                i = notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    notificationsDiagnosticsRepository$sendTestPush$1 = new NotificationsDiagnosticsRepository$sendTestPush$1(this, continuationImpl);
                }
            }
        } else {
            notificationsDiagnosticsRepository$sendTestPush$1 = new NotificationsDiagnosticsRepository$sendTestPush$1(this, continuationImpl);
        }
        Object obj = notificationsDiagnosticsRepository$sendTestPush$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, str, str2, null, 15);
            notificationsDiagnosticsRepository$sendTestPush$1.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(anonymousClass2, notificationsDiagnosticsRepository$sendTestPush$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i6 = MediaMetadataCompat + 13;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }
}
