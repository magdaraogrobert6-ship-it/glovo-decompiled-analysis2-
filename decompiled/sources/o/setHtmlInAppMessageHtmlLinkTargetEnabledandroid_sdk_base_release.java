package o;

import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sentiance.okhttp3.u$a;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.sentry.SentryOptions;
import io.socket.client.Manager$7;
import io.socket.client.SocketIOException;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release implements replacePrefetchedUrlsWithLocalAssetslambda0, onErrorlambda0, io.sentry.android.replay.util.RatingCompat, setMessageImageView, FwFClientKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public Object write;

    public void read(setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release) {
        synchronized (this) {
            ((LinkedHashSet) this.write).remove(settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release);
        }
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(isActive isactive, byte[][] bArr) {
        this.read = 26;
        if (isactive == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("params == null");
            throw null;
        }
        int i = 2 % 2;
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("publicKey byte array == null");
                throw null;
            }
        }
        if (bArr.length != isactive.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong publicKey size");
            throw null;
        }
        int i3 = serializer + 9;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 63;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        while (i2 < bArr.length) {
            if (bArr[i2].length != isactive.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("wrong publicKey format");
                throw null;
            }
            int i8 = RemoteActionCompatParcelizer + 67;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i2 = i8 % 2 == 0 ? i2 + 45 : i2 + 1;
        }
        this.write = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArr);
        int i9 = RemoteActionCompatParcelizer + 89;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void write(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, getDrawable getdrawable, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write(getdrawable, i, BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
        int i5 = RemoteActionCompatParcelizer + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    public int MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i2 % 2 != 0 ? ((String[]) this.write).length % 4 : ((String[]) this.write).length / 2;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int lineVisibleEnd = ((android.text.Layout) this.write).getLineVisibleEnd(i);
        int i5 = serializer + 75;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return lineVisibleEnd;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int RatingCompat() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((android.text.Layout) this.write).getLineCount();
        }
        ((android.text.Layout) this.write).getLineCount();
        throw null;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int RemoteActionCompatParcelizer(int i) {
        int ellipsisCount;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            ellipsisCount = ((android.text.Layout) this.write).getEllipsisCount(i);
            int i4 = 46 / 0;
        } else {
            ellipsisCount = ((android.text.Layout) this.write).getEllipsisCount(i);
        }
        int i5 = serializer + 97;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return ellipsisCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int read(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return ((android.text.Layout) this.write).getLineBottom(i);
        }
        ((android.text.Layout) this.write).getLineBottom(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int serializer(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int lineStart = ((android.text.Layout) this.write).getLineStart(i);
        int i5 = serializer + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return lineStart;
        }
        throw null;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public float write(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        float primaryHorizontal = ((android.text.Layout) this.write).getPrimaryHorizontal(i2);
        int i6 = RemoteActionCompatParcelizer + 97;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return primaryHorizontal;
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public int write(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return ((android.text.Layout) this.write).getLineTop(i);
        }
        ((android.text.Layout) this.write).getLineTop(i);
        throw null;
    }

    @Override // o.replacePrefetchedUrlsWithLocalAssetslambda0
    public void read() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((AtomicLong) this.write).getAndAdd(1L);
        int i4 = serializer + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.setMessageImageView
    public void onFailure(getMessageTextView getmessagetextview, IOException iOException) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((setDefaultEmptyContentCardsAdapter) this.write).write(FWFConstants.EXPLANATION_TYPE_ERROR, iOException);
        } else {
            ((setDefaultEmptyContentCardsAdapter) this.write).write(FWFConstants.EXPLANATION_TYPE_ERROR, iOException);
        }
        int i3 = serializer + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
    }

    @Override // o.FwFClientKt
    public Object IconCompatParcelizer(Object obj) {
        Optional optionalOfNullable;
        int i = 2 % 2;
        int i2 = serializer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            optionalOfNullable = Optional.ofNullable(((FwFClientKt) this.write).IconCompatParcelizer((_get_messageWebView_lambda3) obj));
            int i3 = 29 / 0;
        } else {
            optionalOfNullable = Optional.ofNullable(((FwFClientKt) this.write).IconCompatParcelizer((_get_messageWebView_lambda3) obj));
        }
        int i4 = serializer + 89;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return optionalOfNullable;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r7 >= r2.length) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r3 = r3 + 123;
        o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r7 = 4 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r7 = r2[r7];
        r1 = r1 + 125;
        o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r7 >= r2.length) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String MediaSessionCompatQueueItem(int r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r7 = r7 * r0
            if (r7 < 0) goto L3a
            int r1 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer
            int r2 = r1 + 73
            int r3 = r2 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r6.write
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r4 = r2.length
            r5 = 21
            int r5 = r5 / 0
            if (r7 < r4) goto L30
            goto L24
        L1d:
            java.lang.Object r2 = r6.write
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r4 = r2.length
            if (r7 < r4) goto L30
        L24:
            int r3 = r3 + 123
            int r7 = r3 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L3a
            r7 = 4
            int r7 = r7 / r0
            goto L3a
        L30:
            r7 = r2[r7]
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r7
        L3a:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.MediaSessionCompatQueueItem(int):java.lang.String");
    }

    public String MediaMetadataCompat(int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer;
        int i5 = i4 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            i2 = (i << 2) + 1;
            if (i2 < 0) {
                return null;
            }
        } else {
            i2 = (i * 2) + 1;
            if (i2 < 0) {
                return null;
            }
        }
        String[] strArr = (String[]) this.write;
        if (i2 >= strArr.length) {
            int i6 = i4 + 75;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return null;
            }
            int i7 = 5 / 3;
            return null;
        }
        return strArr[i2];
    }

    public byte[] serializer() {
        int i = 2 % 2;
        SecureRandom secureRandom = (SecureRandom) ((setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.write).write;
        if (!(secureRandom instanceof getGlobalEntityId)) {
            int i2 = serializer + 23;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return secureRandom.generateSeed(48);
        }
        byte[] bArr = new byte[48];
        secureRandom.nextBytes(bArr);
        int i4 = RemoteActionCompatParcelizer + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public void write(int i, int i2, BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0) {
            backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.getClass();
            BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage3 = BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED;
            obj.hashCode();
            throw null;
        }
        getDrawable getdrawable = (getDrawable) this.write;
        backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.getClass();
        write(this, getdrawable, (backgroundInAppMessagePreparerdisplayPreparedInAppMessage2 == BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED ? r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i32 : r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.VARINT).wireIntWithTag(i2));
        write(getdrawable, i, backgroundInAppMessagePreparerdisplayPreparedInAppMessage2);
        int i5 = serializer + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void IconCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            bArr.getClass();
            write(this, (getDrawable) this.write, bArr.length);
            int length = bArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        bArr.getClass();
        getDrawable getdrawable = (getDrawable) this.write;
        write(this, getdrawable, bArr.length);
        int length2 = bArr.length;
        if (length2 == 0) {
            return;
        }
        getdrawable.write(length2);
        onContentCardClicked.write(bArr, getdrawable.write, getdrawable.serializer, 0, length2);
        getdrawable.write += length2;
        int i3 = RemoteActionCompatParcelizer + 25;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
    }

    public void serializer(getDrawable getdrawable) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getdrawable.getClass();
        getDrawable getdrawable2 = (getDrawable) this.write;
        write(this, getdrawable2, getdrawable.write);
        int i4 = getdrawable.write;
        getdrawable2.write(i4);
        onContentCardClicked.write(getdrawable.serializer, getdrawable2.write, getdrawable2.serializer, 0, i4);
        getdrawable2.write += i4;
        int i5 = serializer + 99;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 14) {
            String string = super.toString();
            int i4 = RemoteActionCompatParcelizer + 27;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return string;
        }
        StringBuilder sb = new StringBuilder();
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        for (int i6 = 0; i6 < iMediaBrowserCompatMediaItem; i6++) {
            int i7 = RemoteActionCompatParcelizer + 15;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            sb.append(MediaSessionCompatQueueItem(i6));
            sb.append(": ");
            sb.append(MediaMetadataCompat(i6));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1.getStatSize() == (-1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = new android.os.ParcelFileDescriptor.AutoCloseInputStream(r1).getChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r1.close();
        com.google.gson.Gson$$ExternalSyntheticBUOutline0.m(r1, "Not a file: ");
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r2 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer + 87;
        o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r0 = (java.io.File) r6.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return o.getActiveFocusTargetNode.write(r0, new java.io.FileInputStream(r0)).getChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r6.read != 27) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r6.read != 27) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = (android.os.ParcelFileDescriptor) r6.write;
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.channels.FileChannel RemoteActionCompatParcelizer() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer
            int r1 = r1 + 55
            int r2 = r1 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer = r2
            int r1 = r1 % r0
            r2 = 27
            if (r1 != 0) goto L19
            int r1 = r6.read
            r3 = 95
            int r3 = r3 / 0
            if (r1 == r2) goto L4f
            goto L1d
        L19:
            int r1 = r6.read
            if (r1 == r2) goto L4f
        L1d:
            java.lang.Object r1 = r6.write
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            long r2 = r1.getStatSize()
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L36
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r1 = r2.getChannel()
            goto L3f
        L36:
            r1.close()
            java.lang.String r2 = "Not a file: "
            com.google.gson.Gson$$ExternalSyntheticBUOutline0.m(r1, r2)
            r1 = r3
        L3f:
            int r2 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer
            int r2 = r2 + 87
            int r4 = r2 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L4b
            return r1
        L4b:
            r3.hashCode()
            throw r3
        L4f:
            java.lang.Object r0 = r6.write
            java.io.File r0 = (java.io.File) r0
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            java.io.FileInputStream r0 = o.getActiveFocusTargetNode.write(r0, r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer():java.nio.channels.FileChannel");
    }

    public void write(getDrawable getdrawable, long j, BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = isApiBelowBaklava.read[backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.ordinal()];
        if (i4 == 1) {
            ((getDrawable) this.write).write(Long.reverseBytes(j));
            int i5 = serializer + 49;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        int i7 = serializer;
        int i8 = i7 + 93;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0 ? i4 == 2 : i4 == 2) {
            int i9 = getDrawable.RemoteActionCompatParcelizer[Long.numberOfLeadingZeros(j)];
            getdrawable.write(i9 + 1);
            getdrawable.write(i9, j);
            return;
        }
        int i10 = i7 + 109;
        int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i11;
        int i12 = i10 % 2;
        if (i4 != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        int i13 = i11 + 65;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        long j2 = (j << 1) ^ (j >> 63);
        int i15 = getDrawable.RemoteActionCompatParcelizer[Long.numberOfLeadingZeros(j2)];
        getdrawable.write(i15 + 1);
        getdrawable.write(i15, j2);
    }

    public /* synthetic */ setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(int i, boolean z) {
        this.read = i;
    }

    public /* synthetic */ setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(int i) {
        this.read = i;
        if (i == 12) {
            this.write = new AtomicLong();
        } else if (i != 18) {
            this.write = new LinkedHashSet();
        } else {
            this.write = new zzw();
        }
    }

    public void IconCompatParcelizer(SocketIOException socketIOException) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Manager$7 manager$7 = (Manager$7) ((r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74) this.write).IconCompatParcelizer;
        if (socketIOException == null) {
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("reconnect success");
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) manager$7.IconCompatParcelizer;
            handleCardClick handlecardclick = r8lambdach50szxgsvgzrle_f5bmf0a81gm.RemoteActionCompatParcelizer;
            int i3 = handlecardclick.serializer;
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompatCustomAction = false;
            handlecardclick.serializer = 0;
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.write("reconnect", Integer.valueOf(i3));
            return;
        }
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("reconnect attempt error");
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm2 = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) manager$7.IconCompatParcelizer;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.PlaybackStateCompatCustomAction = false;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.serializer();
        ((r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) manager$7.IconCompatParcelizer).write("reconnect_error", socketIOException);
        int i4 = RemoteActionCompatParcelizer + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(addSingleSynchronousSubscription addsinglesynchronoussubscription) {
        this.read = 2;
        addsinglesynchronoussubscription.getClass();
        this.write = addsinglesynchronoussubscription;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(subscribeToNoMatchingTriggerForEvent subscribetonomatchingtriggerforevent) {
        this.read = 4;
        subscribetonomatchingtriggerforevent.getClass();
        this.write = subscribetonomatchingtriggerforevent;
    }

    public boolean RemoteActionCompatParcelizer(ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5) {
        int i = 2 % 2;
        setContentCardsSwipeLayout setcontentcardsswipelayout = (setContentCardsSwipeLayout) this.write;
        if (setcontentcardsswipelayout.RatingCompat == onRefresh.OPENING && "open".equals(contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer)) {
            int i2 = RemoteActionCompatParcelizer + 81;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setcontentcardsswipelayout.RatingCompat = onRefresh.OPEN;
            setcontentcardsswipelayout.MediaSessionCompatToken = true;
            setcontentcardsswipelayout.write("open", new Object[0]);
            int i4 = RemoteActionCompatParcelizer + 49;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (!"close".equals(contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer)) {
            setcontentcardsswipelayout.write("packet", contentCardsFragmentcontentCardsUpdate5);
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 111;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        setcontentcardsswipelayout.RatingCompat = onRefresh.CLOSED;
        setcontentcardsswipelayout.write("close", new Object[0]);
        return false;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(validateAndStorePushIdandroid_sdk_base_release validateandstorepushidandroid_sdk_base_release) {
        this.read = 5;
        validateandstorepushidandroid_sdk_base_release.getClass();
        this.write = validateandstorepushidandroid_sdk_base_release;
    }

    @Override // o.setMessageImageView
    public void onResponse(getMessageTextView getmessagetextview, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setDefaultEmptyContentCardsAdapter setdefaultemptycontentcardsadapter = (setDefaultEmptyContentCardsAdapter) this.write;
        setdefaultemptycontentcardsadapter.MediaMetadataCompat = _get_messagewebview_lambda1;
        setdefaultemptycontentcardsadapter.write("responseHeaders", _get_messagewebview_lambda1.headers.IconCompatParcelizer());
        try {
            if (_get_messagewebview_lambda1.isSuccessful) {
                int i4 = RemoteActionCompatParcelizer + 51;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                try {
                    setdefaultemptycontentcardsadapter.write(RemoteMessageConst.DATA, setdefaultemptycontentcardsadapter.MediaMetadataCompat.body.MediaMetadataCompat());
                    setdefaultemptycontentcardsadapter.write("success", new Object[0]);
                } catch (IOException e) {
                    setdefaultemptycontentcardsadapter.write(FWFConstants.EXPLANATION_TYPE_ERROR, e);
                }
            } else {
                setdefaultemptycontentcardsadapter.write(FWFConstants.EXPLANATION_TYPE_ERROR, new IOException(Integer.toString(_get_messagewebview_lambda1.code)));
            }
            _get_messagewebview_lambda1.close();
        } catch (Throwable th) {
            _get_messagewebview_lambda1.close();
            throw th;
        }
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(subscribeToPushNotificationEvents subscribetopushnotificationevents) {
        this.read = 3;
        subscribetopushnotificationevents.getClass();
        this.write = subscribetopushnotificationevents;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if ((r6 & 82) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if ((r6 & (-128)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r7 = r5.serializer;
        r0 = r5.write;
        r5.write = r0 + 1;
        r7[r0] = (byte) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r6 = r6;
        r5.write(o.getDrawable.RemoteActionCompatParcelizer[java.lang.Long.numberOfLeadingZeros(r6)], r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(o.getDrawable r5, int r6, o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1a
            int[] r1 = o.isApiBelowBaklava.read
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r2) goto L8c
            goto L24
        L1a:
            int[] r1 = o.isApiBelowBaklava.read
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r2) goto L8c
        L24:
            int r1 = o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer
            int r1 = r1 + 99
            int r2 = r1 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 3
            if (r1 == 0) goto L33
            if (r7 == r3) goto L77
            goto L35
        L33:
            if (r7 == r0) goto L77
        L35:
            if (r7 != r3) goto L73
            int r2 = r2 + 19
            int r7 = r2 % 128
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.serializer = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L4d
            int r7 = r6 + (-1)
            int r6 = r6 >>> 112
            r6 = r6 ^ r7
            r5.write(r0)
            r7 = r6 & 82
            if (r7 != 0) goto L66
            goto L5a
        L4d:
            int r7 = r6 << 1
            int r6 = r6 >> 31
            r6 = r6 ^ r7
            r7 = 5
            r5.write(r7)
            r7 = r6 & (-128(0xffffffffffffff80, float:NaN))
            if (r7 != 0) goto L66
        L5a:
            byte[] r7 = r5.serializer
            int r0 = r5.write
            int r1 = r0 + 1
            r5.write = r1
            byte r5 = (byte) r6
            r7[r0] = r5
            return
        L66:
            long r6 = (long) r6
            int[] r0 = o.getDrawable.RemoteActionCompatParcelizer
            int r1 = java.lang.Long.numberOfLeadingZeros(r6)
            r0 = r0[r1]
            r5.write(r0, r6)
            return
        L73:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            return
        L77:
            long r6 = (long) r6
            r5.getClass()
            int[] r0 = o.getDrawable.RemoteActionCompatParcelizer
            int r1 = java.lang.Long.numberOfLeadingZeros(r6)
            r0 = r0[r1]
            int r1 = r0 + 1
            r5.write(r1)
            r5.write(r0, r6)
            return
        L8c:
            java.lang.Object r5 = r4.write
            o.getDrawable r5 = (o.getDrawable) r5
            int r6 = java.lang.Integer.reverseBytes(r6)
            r5.IconCompatParcelizer(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(o.getDrawable, int, o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2):void");
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21) {
        this.read = 1;
        brazeCompanionExternalSyntheticLambda21.getClass();
        this.write = brazeCompanionExternalSyntheticLambda21;
    }

    public setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(u$a u_a) {
        this.read = 14;
        ArrayList arrayList = u_a.IconCompatParcelizer;
        this.write = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // io.sentry.android.replay.util.RatingCompat
    public Integer write() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        android.text.Layout layout = (android.text.Layout) this.write;
        Object obj = null;
        if (layout.getText() instanceof Spanned) {
            CharSequence text = layout.getText();
            text.getClass();
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
            foregroundColorSpanArr.getClass();
            int i5 = Integer.MIN_VALUE;
            Integer numValueOf = null;
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                int i6 = RemoteActionCompatParcelizer + 95;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                CharSequence text2 = layout.getText();
                text2.getClass();
                int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
                CharSequence text3 = layout.getText();
                text3.getClass();
                int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
                if (spanStart != -1) {
                    int i8 = RemoteActionCompatParcelizer + 59;
                    serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (spanEnd != -1 && (i = spanEnd - spanStart) > i5) {
                        numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                        i5 = i;
                    }
                }
            }
            if (numValueOf != null) {
                return Integer.valueOf(numValueOf.intValue() | (-16777216));
            }
        }
        return null;
    }

    public Serializable IconCompatParcelizer(io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = ((zzw) this.write).read;
            throw null;
        }
        zzw zzwVar = (zzw) this.write;
        if (zzwVar.read) {
            return null;
        }
        if (i >= 100) {
            int i4 = serializer + 41;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                zzwVar.write = false;
                return null;
            }
            zzwVar.write = true;
            return null;
        }
        try {
            switch (io.sentry.util.network.write.RemoteActionCompatParcelizer[remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        remoteActionCompatParcelizer.write();
                        while (remoteActionCompatParcelizer.MediaSessionCompatQueueItem()) {
                            int i5 = RemoteActionCompatParcelizer + 19;
                            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            if (zzwVar.read) {
                                remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                                return linkedHashMap;
                            }
                            linkedHashMap.put(remoteActionCompatParcelizer.MediaSessionCompatToken(), IconCompatParcelizer(remoteActionCompatParcelizer, i + 1));
                        }
                        remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        zzwVar.read = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        remoteActionCompatParcelizer.read();
                        while (remoteActionCompatParcelizer.MediaSessionCompatQueueItem() && !zzwVar.read) {
                            arrayList.add(IconCompatParcelizer(remoteActionCompatParcelizer, i + 1));
                        }
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                        return arrayList;
                    } catch (Exception unused2) {
                        zzwVar.read = true;
                        return arrayList;
                    }
                case 3:
                    return remoteActionCompatParcelizer.ParcelableVolumeInfo();
                case 4:
                    return Double.valueOf(remoteActionCompatParcelizer.MediaMetadataCompat());
                case 5:
                    return Boolean.valueOf(remoteActionCompatParcelizer.RatingCompat());
                case 6:
                    remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
                    return null;
                default:
                    zzwVar.read = true;
                    return null;
            }
        } catch (Exception unused3) {
            zzwVar.read = true;
            return null;
        }
        zzwVar.read = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[Catch: Exception -> 0x0046, all -> 0x012b, TryCatch #4 {Exception -> 0x0046, blocks: (B:26:0x004c, B:28:0x0061, B:37:0x0097, B:39:0x009f, B:40:0x00b1, B:42:0x00b9, B:43:0x00cb, B:45:0x00d3, B:46:0x00dc, B:52:0x00f3, B:53:0x00fb, B:54:0x0106, B:59:0x0116, B:61:0x011e), top: B:83:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[Catch: Exception -> 0x0046, all -> 0x012b, TryCatch #4 {Exception -> 0x0046, blocks: (B:26:0x004c, B:28:0x0061, B:37:0x0097, B:39:0x009f, B:40:0x00b1, B:42:0x00b9, B:43:0x00cb, B:45:0x00d3, B:46:0x00dc, B:52:0x00f3, B:53:0x00fb, B:54:0x0106, B:59:0x0116, B:61:0x011e), top: B:83:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: Exception -> 0x0046, all -> 0x012b, TryCatch #4 {Exception -> 0x0046, blocks: (B:26:0x004c, B:28:0x0061, B:37:0x0097, B:39:0x009f, B:40:0x00b1, B:42:0x00b9, B:43:0x00cb, B:45:0x00d3, B:46:0x00dc, B:52:0x00f3, B:53:0x00fb, B:54:0x0106, B:59:0x0116, B:61:0x011e), top: B:83:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb A[SYNTHETIC] */
    @Override // o.onErrorlambda0
    public boolean IconCompatParcelizer() {
        String value;
        String value2;
        int i;
        int i2 = 2 % 2;
        if (io.sentry.internal.write.serializer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = io.sentry.internal.write.RemoteActionCompatParcelizer.serializer();
            try {
                if (io.sentry.internal.write.serializer == null) {
                    io.sentry.internal.write.serializer = new io.sentry.internal.write();
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        io.sentry.internal.write writeVar = io.sentry.internal.write.serializer;
        if (!writeVar.IconCompatParcelizer) {
            try {
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = writeVar.read.serializer();
                try {
                    if (!writeVar.IconCompatParcelizer) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                                if (mainAttributes != null) {
                                    String value3 = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                    String value4 = mainAttributes.getValue("Implementation-Version");
                                    String value5 = mainAttributes.getValue("Sentry-SDK-Name");
                                    String value6 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                    if (value3 != null) {
                                        int i3 = RemoteActionCompatParcelizer + 43;
                                        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        serializer = i4;
                                        if (i3 % 2 == 0) {
                                            int i5 = 81 / 0;
                                            if (value4 != null) {
                                                int i6 = i4 + 83;
                                                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                int i7 = i6 % 2;
                                                value = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                                if (value != null) {
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.opentelemetry:opentelemetry-sdk", value);
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry");
                                                }
                                                value2 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                if (value2 != null) {
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value2);
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agent");
                                                }
                                                if (value3.equals("sentry.java.opentelemetry.agentless")) {
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless");
                                                }
                                                if (!value3.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                    i = RemoteActionCompatParcelizer + 87;
                                                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    if (i % 2 != 0) {
                                                        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless-Spring");
                                                        Object obj = null;
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless-Spring");
                                                }
                                            }
                                        } else if (value4 != null) {
                                            int i8 = i4 + 83;
                                            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i9 = i8 % 2;
                                            value = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                            if (value != null) {
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.opentelemetry:opentelemetry-sdk", value);
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry");
                                            }
                                            value2 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                            if (value2 != null) {
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value2);
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agent");
                                            }
                                            if (value3.equals("sentry.java.opentelemetry.agentless")) {
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless");
                                            }
                                            if (!value3.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                i = RemoteActionCompatParcelizer + 87;
                                                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i % 2 != 0) {
                                                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless-Spring");
                                                    Object obj2 = null;
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read("OpenTelemetry-Agentless-Spring");
                                            }
                                        }
                                    }
                                    if (value5 != null && value4 != null && value6 != null) {
                                        int i10 = serializer + 109;
                                        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i11 = i10 % 2;
                                        if (value5.startsWith("sentry.java")) {
                                            BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer(value6, value4);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    uriActionExternalSyntheticLambda4Serializer2.close();
                } catch (Throwable th3) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException unused2) {
            } catch (Throwable th5) {
                writeVar.IconCompatParcelizer = true;
                throw th5;
            }
            writeVar.IconCompatParcelizer = true;
        }
        return BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read(((SentryOptions) this.write).getFatalLogger());
    }
}
