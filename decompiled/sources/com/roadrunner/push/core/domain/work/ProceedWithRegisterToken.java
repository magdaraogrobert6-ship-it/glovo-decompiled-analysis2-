package com.roadrunner.push.core.domain.work;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.push.core.domain.UpdatePushToken;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.EnumColumnAdapter;
import o.SemanticsPropertiesContentDescription1;
import o.access1600;
import o.access800;
import o.accesssetRenderEffectjd;
import o.executeAsList;
import o.setAmbientShadowColor8_81llA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ProceedWithRegisterToken {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final H$b IconCompatParcelizer;
    public final UpdatePushToken RemoteActionCompatParcelizer;
    public final access800 read;
    public final SemanticsPropertiesContentDescription1 serializer;
    public final EnumColumnAdapter write;

    public ProceedWithRegisterToken(access800 access800Var, UpdatePushToken updatePushToken, H$b h$b, EnumColumnAdapter enumColumnAdapter, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1) {
        this.read = access800Var;
        this.RemoteActionCompatParcelizer = updatePushToken;
        this.IconCompatParcelizer = h$b;
        this.write = enumColumnAdapter;
        this.serializer = semanticsPropertiesContentDescription1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object handleFailure(Throwable th, int i, ContinuationImpl continuationImpl) {
        access1600 access1600Var;
        int i2;
        Throwable th2;
        int i3;
        String message;
        int i4 = 2 % 2;
        boolean z = true;
        if (!(continuationImpl instanceof access1600)) {
            access1600Var = new access1600(this, continuationImpl);
        } else {
            int i5 = MediaBrowserCompatMediaItem + 47;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            access1600Var = (access1600) continuationImpl;
            int i7 = access1600Var.IconCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                access1600Var.IconCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                access1600Var = new access1600(this, continuationImpl);
            }
        }
        Object objInvoke = access1600Var.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = access1600Var.IconCompatParcelizer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "ProceedWithRegisterToken failed", new Object[0]);
            this.read.write.logEvent("push_update_error", null);
            if (i >= 5) {
                int i9 = MediaBrowserCompatMediaItem + 121;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 == 0) {
                access1600Var.write = th;
                access1600Var.RemoteActionCompatParcelizer = i2;
                access1600Var.IconCompatParcelizer = 1;
                objInvoke = ((IsUserSignedInImpl) this.serializer).invoke(access1600Var);
                if (objInvoke == coroutineSingletons) {
                    int i11 = MediaBrowserCompatMediaItem + 83;
                    MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return coroutineSingletons;
                }
                int i13 = i2;
                th2 = th;
                i3 = i13;
            } else {
                z = false;
                int i14 = i2;
                th2 = th;
                i3 = i14;
            }
            if (z) {
                return new setAmbientShadowColor8_81llA(0);
            }
            if (i3 != 0) {
                int i15 = MediaBrowserCompatMediaItem + 117;
                MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                executeAsList executeaslist = executeAsList.OA;
                message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                EnumColumnAdapter.serializer(this.write, "push_token_update_failed", executeaslist, message);
                int i17 = MediaSessionCompatQueueItem + 41;
                MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            }
            return new accesssetRenderEffectjd();
        }
        if (i8 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3 = access1600Var.RemoteActionCompatParcelizer;
        th2 = access1600Var.write;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            Throwable th3 = th2;
            i2 = i3;
            th = th3;
            z = false;
            int i19 = i2;
            th2 = th;
            i3 = i19;
        }
        if (z) {
            return new setAmbientShadowColor8_81llA(0);
        }
        if (i3 != 0) {
            int i110 = MediaBrowserCompatMediaItem + 117;
            MediaSessionCompatQueueItem = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            executeAsList executeaslist2 = executeAsList.OA;
            message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            EnumColumnAdapter.serializer(this.write, "push_token_update_failed", executeaslist2, message);
            int i112 = MediaSessionCompatQueueItem + 41;
            MediaBrowserCompatMediaItem = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
        }
        return new accesssetRenderEffectjd();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (r10 == r2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(int r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.access1700
            if (r1 == 0) goto L1f
            int r1 = com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaBrowserCompatMediaItem
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            r1 = r10
            o.access1700 r1 = (o.access1700) r1
            int r2 = r1.serializer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.serializer = r2
            goto L24
        L1f:
            o.access1700 r1 = new o.access1700
            r1.<init>(r7, r10)
        L24:
            java.lang.Object r10 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.serializer
            r4 = 3
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L5b
            if (r3 == r5) goto L4f
            if (r3 == r0) goto L49
            if (r3 != r4) goto L43
            int r8 = com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaSessionCompatQueueItem
            int r8 = r8 + 53
            int r9 = r8 % 128
            com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaBrowserCompatMediaItem = r9
            int r8 = r8 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto Lc5
        L43:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r6
        L49:
            int r8 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> Lb7
            goto L89
        L4f:
            int r8 = r1.IconCompatParcelizer
            java.lang.String r9 = r1.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> Lb7
            o.onItemDismiss r10 = (o.onItemDismiss) r10     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r10 = r10.IconCompatParcelizer     // Catch: java.lang.Exception -> Lb7
            goto L76
        L5b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.access800 r10 = r7.read     // Catch: java.lang.Exception -> Lb7
            o.decode r10 = r10.write     // Catch: java.lang.Exception -> Lb7
            java.lang.String r3 = "push_update"
            r10.logEvent(r3, r6)     // Catch: java.lang.Exception -> Lb7
            com.roadrunner.push.core.domain.UpdatePushToken r10 = r7.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb7
            r1.RemoteActionCompatParcelizer = r9     // Catch: java.lang.Exception -> Lb7
            r1.IconCompatParcelizer = r8     // Catch: java.lang.Exception -> Lb7
            r1.serializer = r5     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r10 = r10.m5006invokegIAlus(r9, r1)     // Catch: java.lang.Exception -> Lb7
            if (r10 != r2) goto L76
            goto Lc4
        L76:
            java.lang.Throwable r10 = o.onItemDismiss.serializer(r10)     // Catch: java.lang.Exception -> Lb7
            if (r10 == 0) goto L98
            r1.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Exception -> Lb7
            r1.IconCompatParcelizer = r8     // Catch: java.lang.Exception -> Lb7
            r1.serializer = r0     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r10 = r7.handleFailure(r10, r8, r1)     // Catch: java.lang.Exception -> Lb7
            if (r10 != r2) goto L89
            goto Lc4
        L89:
            o.setCameraDistance r10 = (o.setCameraDistance) r10     // Catch: java.lang.Exception -> Lb7
            int r8 = com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaSessionCompatQueueItem
            int r8 = r8 + 53
            int r9 = r8 % 128
            com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.MediaBrowserCompatMediaItem = r9
            int r8 = r8 % r0
            if (r8 == 0) goto L97
            return r10
        L97:
            throw r6
        L98:
            com.sentiance.core.model.events.H$b r10 = r7.IconCompatParcelizer     // Catch: java.lang.Exception -> Lb7
            r9.getClass()     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r0 = r10.serializer     // Catch: java.lang.Exception -> Lb7
            o.parseLayoutDescription r0 = (o.parseLayoutDescription) r0     // Catch: java.lang.Exception -> Lb7
            com.roadrunner.experience_tools.braze.BrazeManagerImpl r0 = (com.roadrunner.experience_tools.braze.BrazeManagerImpl) r0     // Catch: java.lang.Exception -> Lb7
            com.braze.Braze r0 = r0.read()     // Catch: java.lang.Exception -> Lb7
            r0.setRegisteredPushToken(r9)     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r10 = r10.write     // Catch: java.lang.Exception -> Lb7
            com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl r10 = (com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl) r10     // Catch: java.lang.Exception -> Lb7
            r10.read(r9)     // Catch: java.lang.Exception -> Lb7
            o.setClip r9 = new o.setClip     // Catch: java.lang.Exception -> Lb7
            r9.<init>()     // Catch: java.lang.Exception -> Lb7
            return r9
        Lb7:
            r9 = move-exception
            r1.RemoteActionCompatParcelizer = r6
            r1.IconCompatParcelizer = r8
            r1.serializer = r4
            java.lang.Object r10 = r7.handleFailure(r9, r8, r1)
            if (r10 != r2) goto Lc5
        Lc4:
            return r2
        Lc5:
            o.setCameraDistance r10 = (o.setCameraDistance) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.push.core.domain.work.ProceedWithRegisterToken.invoke(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
