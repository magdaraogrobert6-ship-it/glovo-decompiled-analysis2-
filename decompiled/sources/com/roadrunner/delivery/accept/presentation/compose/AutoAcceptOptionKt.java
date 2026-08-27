package com.roadrunner.delivery.accept.presentation.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import coil3.ExtrasKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import o.AndroidContentCaptureManager;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DefaultLazyKey;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getOffsetX;
import o.getPostalCode;
import o.loadAsync;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AutoAcceptOptionKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    public static final void AutoAcceptOption(getOffsetX getoffsetx, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getoffsetx.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-740896436);
        if ((i & 6) == 0) {
            int i4 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(getoffsetx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            loadAsync loadasync = (loadAsync) ExtrasKt.write(getoffsetx.RatingCompat, getpostalcode, 0).getValue();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getoffsetx);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, getoffsetx, getOffsetX.class, "toggle", "toggle()V", 0, 0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i6 = RemoteActionCompatParcelizer + 21;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, getoffsetx, getOffsetX.class, "toggle", "toggle()V", 0, 0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            RemoteActionCompatParcelizer(loadasync, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode, 0);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(getoffsetx, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(final loadAsync loadasync, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        int i3;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i4;
        int i5 = 2 % 2;
        loadasync.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2054852777);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if ((i6 % 2 == 0 ? (i & 8) != 0 : (i & 48) != 0) ? getpostalcode.IconCompatParcelizer(loadasync) : getpostalcode.read(loadasync)) {
                int i7 = RemoteActionCompatParcelizer + 7;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i9 = i2 | 384;
        boolean z2 = true;
        if ((i9 & 147) != 146) {
            int i10 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            final Modifier.Companion companion = Modifier.Companion;
            if (!loadasync.write) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i12 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getFontMetrics
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaMetadataCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = 2 % 2;
                            int i14 = MediaBrowserCompatMediaItem + 109;
                            MediaMetadataCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            int i16 = i12;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i17 = i;
                            androidx.compose.ui.Modifier modifier3 = companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            loadAsync loadasync2 = loadasync;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i16 == 0) {
                                AutoAcceptOptionKt.RemoteActionCompatParcelizer(loadasync2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                                return createfromparcel;
                            }
                            AutoAcceptOptionKt.RemoteActionCompatParcelizer(loadasync2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                            int i18 = MediaMetadataCompat + 39;
                            MediaBrowserCompatMediaItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i18 % 2 == 0) {
                                return createfromparcel;
                            }
                            throw null;
                        }
                    };
                    gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    return;
                }
                i3 = RemoteActionCompatParcelizer + 13;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i13 = 54 / 0;
                }
            }
            boolean z3 = (i9 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            int i14 = 3;
            if (!(!z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new DefaultLazyKey(i14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            if ((i9 & 14) == 4) {
                int i15 = RemoteActionCompatParcelizer + 91;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else {
                if ((i9 & 8) != 0) {
                    int i17 = RemoteActionCompatParcelizer + 31;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (getpostalcode.IconCompatParcelizer(loadasync)) {
                        int i19 = RemoteActionCompatParcelizer + 91;
                        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    }
                }
                z2 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(14, loadasync);
                getpostalcode.write(objComponentActivity2);
            }
            AndroidViewBindingKt.AndroidViewBinding(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, (i9 >> 3) & 112, 0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i20 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getFontMetrics
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaMetadataCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i111 = 2 % 2;
                    int i112 = MediaBrowserCompatMediaItem + 109;
                    MediaMetadataCompat = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    int i114 = i20;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i115 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    loadAsync loadasync2 = loadasync;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i114 == 0) {
                        AutoAcceptOptionKt.RemoteActionCompatParcelizer(loadasync2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i115 | 1));
                        return createfromparcel;
                    }
                    AutoAcceptOptionKt.RemoteActionCompatParcelizer(loadasync2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i115 | 1));
                    int i116 = MediaMetadataCompat + 39;
                    MediaBrowserCompatMediaItem = i116 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i116 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            return;
        }
        i3 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i111 = 54 / 0;
        }
    }
}
