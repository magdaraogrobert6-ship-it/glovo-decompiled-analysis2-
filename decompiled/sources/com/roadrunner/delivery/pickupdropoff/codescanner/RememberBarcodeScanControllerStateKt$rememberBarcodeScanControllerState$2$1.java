package com.roadrunner.delivery.pickupdropoff.codescanner;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.concurrent.Executor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getExtendedTouchPaddinghWWAJMo;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ getExtendedTouchPaddinghWWAJMo RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Executor serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, Executor executor, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = getextendedtouchpaddinghwwajmo;
        this.serializer = executor;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 77;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            ((RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 99;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.read != 0) {
            return new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, 1);
        }
        RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1 rememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(this.RemoteActionCompatParcelizer, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView, 0);
        int i3 = MediaDescriptionCompat + 117;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return rememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Executor executor = this.serializer;
        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        final getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            final int i5 = 1;
            getextendedtouchpaddinghwwajmo.MediaSessionCompatToken.RemoteActionCompatParcelizer(new Runnable() { // from class: o.getMiddleEllipsisgIe3tQ8
                private static int read = 1;
                private static int serializer;

                /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
                
                    if (r0 != null) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
                
                    r4 = r0.ResultReceiver();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
                
                    if (r4 == null) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
                
                    if (((o.InvalidVideoProfilesQuirk) r4).RemoteActionCompatParcelizer.ComponentActivity() != true) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
                
                    r5.setValue(java.lang.Boolean.valueOf(r3));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
                
                    timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r0, "QR Scanner Screen: Camera init failed", new java.lang.Object[0]);
                    r5.setValue(java.lang.Boolean.FALSE);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
                
                    r6.MediaSessionCompatToken.get();
                    o.PrematureEndOfStreamVideoQuirk.write();
                    r1 = r6.write;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
                
                    if (r1 != null) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
                
                    r1 = o.getMiddleEllipsisgIe3tQ8.serializer + 73;
                    o.getMiddleEllipsisgIe3tQ8.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    r1 = r1 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
                
                    r4 = r1.ResultReceiver();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
                
                    if (r4 == null) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
                
                    if (((o.InvalidVideoProfilesQuirk) r4).RemoteActionCompatParcelizer.ComponentActivity() != true) goto L31;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
                
                    r3 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
                
                    r5.setValue(java.lang.Boolean.valueOf(r3));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
                
                    timber.log.Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r0, "Barcode Scanner: Camera init failed", new java.lang.Object[0]);
                    r5.setValue(java.lang.Boolean.FALSE);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
                
                    if (r1 != 0) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
                
                    if (r1 != 0) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
                
                    r6.MediaSessionCompatToken.get();
                    o.PrematureEndOfStreamVideoQuirk.write();
                    r0 = r6.write;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r7 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = o.getMiddleEllipsisgIe3tQ8.serializer
                        int r1 = r1 + 39
                        int r2 = r1 % 128
                        o.getMiddleEllipsisgIe3tQ8.read = r2
                        int r1 = r1 % r0
                        r2 = 0
                        r3 = 1
                        r4 = 0
                        if (r1 != 0) goto L1a
                        int r1 = r3
                        o.PopulateViewStructure_androidKtpopulate7 r5 = r2
                        o.getExtendedTouchPaddinghWWAJMo r6 = r1
                        if (r1 == 0) goto L59
                        goto L22
                    L1a:
                        int r1 = r3
                        o.PopulateViewStructure_androidKtpopulate7 r5 = r2
                        o.getExtendedTouchPaddinghWWAJMo r6 = r1
                        if (r1 == 0) goto L59
                    L22:
                        o.StretchedVideoResolutionQuirk r0 = r6.MediaSessionCompatToken     // Catch: java.lang.Exception -> L49
                        r0.get()     // Catch: java.lang.Exception -> L49
                        o.PrematureEndOfStreamVideoQuirk.write()     // Catch: java.lang.Exception -> L49
                        o.maxIntrinsicHeight r0 = r6.write     // Catch: java.lang.Exception -> L49
                        if (r0 != 0) goto L2f
                        goto L33
                    L2f:
                        o.FocusMeteringAction r4 = r0.ResultReceiver()     // Catch: java.lang.Exception -> L49
                    L33:
                        if (r4 == 0) goto L40
                        o.InvalidVideoProfilesQuirk r4 = (o.InvalidVideoProfilesQuirk) r4     // Catch: java.lang.Exception -> L49
                        o.FocusMeteringAction r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L49
                        boolean r0 = r0.ComponentActivity()     // Catch: java.lang.Exception -> L49
                        if (r0 != r3) goto L40
                        goto L41
                    L40:
                        r3 = r2
                    L41:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L49
                        r5.setValue(r0)     // Catch: java.lang.Exception -> L49
                        goto L58
                    L49:
                        r0 = move-exception
                        timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        java.lang.String r3 = "QR Scanner Screen: Camera init failed"
                        r1.RemoteActionCompatParcelizer(r0, r3, r2)
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        r5.setValue(r0)
                    L58:
                        return
                    L59:
                        o.StretchedVideoResolutionQuirk r1 = r6.MediaSessionCompatToken     // Catch: java.lang.Exception -> L89
                        r1.get()     // Catch: java.lang.Exception -> L89
                        o.PrematureEndOfStreamVideoQuirk.write()     // Catch: java.lang.Exception -> L89
                        o.maxIntrinsicHeight r1 = r6.write     // Catch: java.lang.Exception -> L89
                        if (r1 != 0) goto L6f
                        int r1 = o.getMiddleEllipsisgIe3tQ8.serializer
                        int r1 = r1 + 73
                        int r6 = r1 % 128
                        o.getMiddleEllipsisgIe3tQ8.read = r6
                        int r1 = r1 % r0
                        goto L73
                    L6f:
                        o.FocusMeteringAction r4 = r1.ResultReceiver()     // Catch: java.lang.Exception -> L89
                    L73:
                        if (r4 == 0) goto L80
                        o.InvalidVideoProfilesQuirk r4 = (o.InvalidVideoProfilesQuirk) r4     // Catch: java.lang.Exception -> L89
                        o.FocusMeteringAction r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L89
                        boolean r0 = r0.ComponentActivity()     // Catch: java.lang.Exception -> L89
                        if (r0 != r3) goto L80
                        goto L81
                    L80:
                        r3 = r2
                    L81:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L89
                        r5.setValue(r0)     // Catch: java.lang.Exception -> L89
                        goto L98
                    L89:
                        r0 = move-exception
                        timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        java.lang.String r3 = "Barcode Scanner: Camera init failed"
                        r1.RemoteActionCompatParcelizer(r0, r3, r2)
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        r5.setValue(r0)
                    L98:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getMiddleEllipsisgIe3tQ8.run():void");
                }
            }, executor);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        final int i6 = 0;
        getextendedtouchpaddinghwwajmo.MediaSessionCompatToken.RemoteActionCompatParcelizer(new Runnable() { // from class: o.getMiddleEllipsisgIe3tQ8
            private static int read = 1;
            private static int serializer;

            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = o.getMiddleEllipsisgIe3tQ8.serializer
                    int r1 = r1 + 39
                    int r2 = r1 % 128
                    o.getMiddleEllipsisgIe3tQ8.read = r2
                    int r1 = r1 % r0
                    r2 = 0
                    r3 = 1
                    r4 = 0
                    if (r1 != 0) goto L1a
                    int r1 = r3
                    o.PopulateViewStructure_androidKtpopulate7 r5 = r2
                    o.getExtendedTouchPaddinghWWAJMo r6 = r1
                    if (r1 == 0) goto L59
                    goto L22
                L1a:
                    int r1 = r3
                    o.PopulateViewStructure_androidKtpopulate7 r5 = r2
                    o.getExtendedTouchPaddinghWWAJMo r6 = r1
                    if (r1 == 0) goto L59
                L22:
                    o.StretchedVideoResolutionQuirk r0 = r6.MediaSessionCompatToken     // Catch: java.lang.Exception -> L49
                    r0.get()     // Catch: java.lang.Exception -> L49
                    o.PrematureEndOfStreamVideoQuirk.write()     // Catch: java.lang.Exception -> L49
                    o.maxIntrinsicHeight r0 = r6.write     // Catch: java.lang.Exception -> L49
                    if (r0 != 0) goto L2f
                    goto L33
                L2f:
                    o.FocusMeteringAction r4 = r0.ResultReceiver()     // Catch: java.lang.Exception -> L49
                L33:
                    if (r4 == 0) goto L40
                    o.InvalidVideoProfilesQuirk r4 = (o.InvalidVideoProfilesQuirk) r4     // Catch: java.lang.Exception -> L49
                    o.FocusMeteringAction r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L49
                    boolean r0 = r0.ComponentActivity()     // Catch: java.lang.Exception -> L49
                    if (r0 != r3) goto L40
                    goto L41
                L40:
                    r3 = r2
                L41:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L49
                    r5.setValue(r0)     // Catch: java.lang.Exception -> L49
                    goto L58
                L49:
                    r0 = move-exception
                    timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r3 = "QR Scanner Screen: Camera init failed"
                    r1.RemoteActionCompatParcelizer(r0, r3, r2)
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r5.setValue(r0)
                L58:
                    return
                L59:
                    o.StretchedVideoResolutionQuirk r1 = r6.MediaSessionCompatToken     // Catch: java.lang.Exception -> L89
                    r1.get()     // Catch: java.lang.Exception -> L89
                    o.PrematureEndOfStreamVideoQuirk.write()     // Catch: java.lang.Exception -> L89
                    o.maxIntrinsicHeight r1 = r6.write     // Catch: java.lang.Exception -> L89
                    if (r1 != 0) goto L6f
                    int r1 = o.getMiddleEllipsisgIe3tQ8.serializer
                    int r1 = r1 + 73
                    int r6 = r1 % 128
                    o.getMiddleEllipsisgIe3tQ8.read = r6
                    int r1 = r1 % r0
                    goto L73
                L6f:
                    o.FocusMeteringAction r4 = r1.ResultReceiver()     // Catch: java.lang.Exception -> L89
                L73:
                    if (r4 == 0) goto L80
                    o.InvalidVideoProfilesQuirk r4 = (o.InvalidVideoProfilesQuirk) r4     // Catch: java.lang.Exception -> L89
                    o.FocusMeteringAction r0 = r4.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L89
                    boolean r0 = r0.ComponentActivity()     // Catch: java.lang.Exception -> L89
                    if (r0 != r3) goto L80
                    goto L81
                L80:
                    r3 = r2
                L81:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L89
                    r5.setValue(r0)     // Catch: java.lang.Exception -> L89
                    goto L98
                L89:
                    r0 = move-exception
                    timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    java.lang.String r3 = "Barcode Scanner: Camera init failed"
                    r1.RemoteActionCompatParcelizer(r0, r3, r2)
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r5.setValue(r0)
                L98:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getMiddleEllipsisgIe3tQ8.run():void");
            }
        }, executor);
        int i7 = MediaDescriptionCompat + 39;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
        return createfromparcel;
    }
}
