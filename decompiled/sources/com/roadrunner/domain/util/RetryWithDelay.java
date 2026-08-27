package com.roadrunner.domain.util;

import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.SparseArray;
import androidx.activity.result.IntentSenderRequest;
import androidx.biometric.AuthenticatorUtils;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.EndCompoundLayout;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import o.FwFClientExtensionKt;
import o.getClipMetadata;
import o.getPopupBackground;
import o.r8lambda1MNczrzuv4oWduWgKg6cjtSWs;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes3.dex */
public final class RetryWithDelay implements Function {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public int write;

    public RetryWithDelay(getClipMetadata getclipmetadata, int i, int i2) {
        this.serializer = 4;
        if (i < 0 || i >= 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid padding: "));
            throw null;
        }
        if (i2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "Invalid hash count: "));
            throw null;
        }
        int i3 = MediaSessionCompatQueueItem + 41;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (getclipmetadata.RatingCompat() > 0 && i2 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "Invalid hash count: "));
            throw null;
        }
        if (getclipmetadata.RatingCompat() == 0) {
            if (i != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Expected padding of 0 when bitmap length is 0, but got "));
                throw null;
            }
            int i5 = 2 % 2;
        }
        this.IconCompatParcelizer = getclipmetadata;
        this.RemoteActionCompatParcelizer = i2;
        this.write = (getclipmetadata.RatingCompat() * 8) - i;
        try {
            this.read = MessageDigest.getInstance("MD5");
            int i6 = MediaBrowserCompatMediaItem + 77;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
        } catch (NoSuchAlgorithmException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Missing MD5 MessageDigest provider: ", e);
            throw null;
        }
    }

    public void serializer(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 55;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        this.read = intent;
        int i5 = i3 + 21;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void serializer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 109;
        int i5 = i4 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i5;
        int i6 = i4 % 2;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        int i7 = i5 + 57;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public IntentSenderRequest write() {
        int i = 2 % 2;
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest((IntentSender) this.IconCompatParcelizer, (Intent) this.read, this.write, this.RemoteActionCompatParcelizer);
        int i2 = MediaSessionCompatQueueItem + 87;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return intentSenderRequest;
        }
        throw null;
    }

    public static long write(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 113;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        long j = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = MediaBrowserCompatMediaItem + 101;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            j |= (((long) bArr[i + i5]) & 255) << (i5 * 8);
        }
        return j;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) throws Exception {
        int i = 2 % 2;
        Flowable flowable = (Flowable) obj;
        flowable.getClass();
        int i2 = 0;
        RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1 = new RetryWithDelay$$ExternalSyntheticLambda1(i2, new RetryWithDelay$$ExternalSyntheticLambda0(i2, this));
        int i3 = Flowable.write;
        Flowable flowableWrite = flowable.write(retryWithDelay$$ExternalSyntheticLambda1, i3, i3);
        int i4 = MediaSessionCompatQueueItem + 29;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return flowableWrite;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer != 4) {
            String string = super.toString();
            int i4 = MediaSessionCompatQueueItem + 69;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return string;
        }
        return "BloomFilter{hashCount=" + this.RemoteActionCompatParcelizer + ", size=" + this.write + ", bitmap=\"" + Base64.encodeToString(((getClipMetadata) this.IconCompatParcelizer).MediaDescriptionCompat(), 2) + "\"}";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public static RetryWithDelay write(getClipMetadata getclipmetadata, int i, int i2) throws Exception {
        int i3;
        int i4 = 2 % 2;
        int i5 = MediaSessionCompatQueueItem;
        int i6 = i5 + 25;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
        if (i < 0 || i >= 8) {
            final String strM = c8$$ExternalSyntheticOutline0.m(i, "Invalid padding: ");
            throw new Exception(strM) { // from class: com.google.firebase.firestore.remote.BloomFilter$BloomFilterCreateException
            };
        }
        if (i2 < 0) {
            final String strM2 = c8$$ExternalSyntheticOutline0.m(i2, "Invalid hash count: ");
            throw new Exception(strM2) { // from class: com.google.firebase.firestore.remote.BloomFilter$BloomFilterCreateException
            };
        }
        int i7 = i5 + 11;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 42 / 0;
            if (getclipmetadata.RatingCompat() > 0) {
                i3 = MediaBrowserCompatMediaItem;
                int i9 = i3 + 63;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i2 != 0) {
                    final String strM3 = c8$$ExternalSyntheticOutline0.m(i2, "Invalid hash count: ");
                    throw new Exception(strM3) { // from class: com.google.firebase.firestore.remote.BloomFilter$BloomFilterCreateException
                    };
                }
                int i11 = i3 + 43;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        } else if (getclipmetadata.RatingCompat() > 0) {
            i3 = MediaBrowserCompatMediaItem;
            int i13 = i3 + 63;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (i2 != 0) {
                final String strM4 = c8$$ExternalSyntheticOutline0.m(i2, "Invalid hash count: ");
                throw new Exception(strM4) { // from class: com.google.firebase.firestore.remote.BloomFilter$BloomFilterCreateException
                };
            }
            int i15 = i3 + 43;
            MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        if (getclipmetadata.RatingCompat() != 0 || i == 0) {
            return new RetryWithDelay(getclipmetadata, i, i2);
        }
        final String strM5 = c8$$ExternalSyntheticOutline0.m(i, "Expected padding of 0 when bitmap length is 0, but got ");
        throw new Exception(strM5) { // from class: com.google.firebase.firestore.remote.BloomFilter$BloomFilterCreateException
        };
    }

    public RetryWithDelay(int i, Scheduler scheduler) {
        this.serializer = 0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        this.write = i;
        this.IconCompatParcelizer = timeUnit;
        this.read = scheduler;
    }

    public RetryWithDelay(int i) {
        this.serializer = 5;
        this.RemoteActionCompatParcelizer = -1;
        this.write = i;
    }

    public RetryWithDelay(IntentSender intentSender) {
        this.serializer = 1;
        intentSender.getClass();
        this.IconCompatParcelizer = intentSender;
    }

    public RetryWithDelay(FwFClientExtensionKt fwFClientExtensionKt, int i, int i2) {
        this.serializer = 6;
        this.read = fwFClientExtensionKt;
        this.write = i;
        this.RemoteActionCompatParcelizer = (1 << i2) - 1;
        this.IconCompatParcelizer = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs[] r8lambda1mnczrzuv4owduwgkg6cjtswsArr = (r8lambda1MNczrzuv4oWduWgKg6cjtSWs[]) this.IconCompatParcelizer;
            if (i3 >= r8lambda1mnczrzuv4owduwgkg6cjtswsArr.length) {
                int i4 = MediaBrowserCompatMediaItem + 3;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
            r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = this;
            r8lambda1mnczrzuv4owduwgkg6cjtsws.write = new short[768];
            r8lambda1mnczrzuv4owduwgkg6cjtswsArr[i3] = r8lambda1mnczrzuv4owduwgkg6cjtsws;
            i3++;
            int i6 = MediaBrowserCompatMediaItem + 37;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public RetryWithDelay(getPopupBackground getpopupbackground, Resources resources, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        this.serializer = 2;
        this.read = getpopupbackground;
        this.IconCompatParcelizer = resources;
        this.write = i;
        if (z4) {
            i2 = 1;
            if (!AuthenticatorUtils.read(i)) {
                i2 = 0;
            } else {
                int i3 = MediaSessionCompatQueueItem + 23;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 5;
                } else {
                    int i5 = 2 % 2;
                }
            }
        } else {
            i2 = 0;
        }
        if ((i & 32767) != 0) {
            if (z) {
                i2 |= 4;
                int i6 = 2 % 2;
            }
            if (z2) {
                int i7 = MediaBrowserCompatMediaItem + 117;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i2 |= 8;
            }
            if (z3) {
                i2 |= 2;
            }
        }
        this.RemoteActionCompatParcelizer = i2;
    }

    public RetryWithDelay(EndCompoundLayout endCompoundLayout, EmojiProcessor emojiProcessor) {
        this.serializer = 3;
        this.IconCompatParcelizer = new SparseArray();
        this.read = endCompoundLayout;
        TypedArray typedArray = (TypedArray) emojiProcessor.read;
        this.write = typedArray.getResourceId(28, 0);
        this.RemoteActionCompatParcelizer = typedArray.getResourceId(52, 0);
    }
}
