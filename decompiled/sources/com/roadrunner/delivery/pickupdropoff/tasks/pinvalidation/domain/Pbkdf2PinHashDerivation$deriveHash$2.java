package com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isUnspecifiedjoFl9I;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class Pbkdf2PinHashDerivation$deriveHash$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ isUnspecifiedjoFl9I serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pbkdf2PinHashDerivation$deriveHash$2(String str, String str2, int i, int i2, isUnspecifiedjoFl9I isunspecifiedjofl9i, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = i;
        this.write = i2;
        this.serializer = isunspecifiedjofl9i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Pbkdf2PinHashDerivation$deriveHash$2 pbkdf2PinHashDerivation$deriveHash$2 = new Pbkdf2PinHashDerivation$deriveHash$2(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, this.serializer, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return pbkdf2PinHashDerivation$deriveHash$2;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws PinHashDerivationError.InvalidIterations, PinHashDerivationError.EmptySecret, PinHashDerivationError.EmptyPin, PinHashDerivationError.InvalidOutputLength {
        int i = 2 % 2;
        int i2 = RatingCompat + 17;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((Pbkdf2PinHashDerivation$deriveHash$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r3 = r8.IconCompatParcelizer;
        r6 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r3) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r3 = r8.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r3) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r5 = r8.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r5 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r6 = r8.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r6 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r7 = r3.toCharArray();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r9 = o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(r9, r3);
        r3 = o.ensureSubscribedToInAppMessageEvents.write;
        r9 = r9.getBytes(r3);
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r9 = java.security.MessageDigest.getInstance("SHA-256").digest(r9);
        r9.getClass();
        r9 = o.isUnspecifiedjoFl9I.write(r9).getBytes(r3);
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        r9 = javax.crypto.SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new javax.crypto.spec.PBEKeySpec(r7, r9, r5, r6 * 8)).getEncoded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        r9.getClass();
        r9 = o.isUnspecifiedjoFl9I.write(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        java.util.Arrays.fill(r7, 0, r7.length, (char) 0);
        r0 = com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2.MediaBrowserCompatMediaItem + 65;
        com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2.RatingCompat = r0 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if ((r0 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.DerivationFailed(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.AlgorithmNotSupported("PBKDF2WithHmacSHA256");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.AlgorithmNotSupported("SHA-256");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        java.util.Arrays.fill(r7, 0, r7.length, (char) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.InvalidOutputLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.InvalidIterations();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.EmptySecret();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        throw new com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.EmptyPin();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if ((!o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r9)) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r9) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r3 = com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2.MediaBrowserCompatMediaItem + 47;
        com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2.RatingCompat = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.InvalidIterations, com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.EmptySecret, com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.EmptyPin, com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError.InvalidOutputLength {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.domain.Pbkdf2PinHashDerivation$deriveHash$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
