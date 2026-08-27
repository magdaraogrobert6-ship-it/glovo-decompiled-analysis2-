package o;

import androidx.camera.video.Recorder$3;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ThrowableExtensionsKt {
    public static final String IconCompatParcelizer(int i) {
        TuplesKt.RemoteActionCompatParcelizer(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final ApiExceptionSessionExpired read(final GifDrawableTransformation gifDrawableTransformation) throws IOException {
        int iIconCompatParcelizer = gifDrawableTransformation.IconCompatParcelizer();
        if (iIconCompatParcelizer != 33639248) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("bad zip: expected ", IconCompatParcelizer(33639248), " but was ", IconCompatParcelizer(iIconCompatParcelizer));
            return null;
        }
        gifDrawableTransformation.RatingCompat(4L);
        short s = gifDrawableTransformation.read();
        if ((s & 1) != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unsupported zip: general purpose bit flag=".concat(IconCompatParcelizer(s & 65535)));
            return null;
        }
        short s2 = gifDrawableTransformation.read();
        short s3 = gifDrawableTransformation.read();
        short s4 = gifDrawableTransformation.read();
        long jIconCompatParcelizer = gifDrawableTransformation.IconCompatParcelizer();
        final createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda0.serializer = ((long) gifDrawableTransformation.IconCompatParcelizer()) & 4294967295L;
        final createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda1 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda1.serializer = ((long) gifDrawableTransformation.IconCompatParcelizer()) & 4294967295L;
        short s5 = gifDrawableTransformation.read();
        short s6 = gifDrawableTransformation.read();
        short s7 = gifDrawableTransformation.read();
        gifDrawableTransformation.RatingCompat(8L);
        final createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda2 = new createBrazeUserChangeEventSubscriberlambda0();
        createbrazeuserchangeeventsubscriberlambda2.serializer = ((long) gifDrawableTransformation.IconCompatParcelizer()) & 4294967295L;
        String str = gifDrawableTransformation.read(s5 & 65535);
        if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) str, (char) 0)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: filename contains 0x00");
            return null;
        }
        long j = createbrazeuserchangeeventsubscriberlambda1.serializer == 4294967295L ? 8L : 0L;
        if (createbrazeuserchangeeventsubscriberlambda0.serializer == 4294967295L) {
            j += 8;
        }
        if (createbrazeuserchangeeventsubscriberlambda2.serializer == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = new createInAppMessageEventSubscriber();
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        read(gifDrawableTransformation, s6 & 65535, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.ShiftCompanion
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                GifDrawableTransformation gifDrawableTransformation2 = gifDrawableTransformation;
                if (iIntValue == 1) {
                    cancelPendingWebViewPause cancelpendingwebviewpause2 = cancelpendingwebviewpause;
                    if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: zip64 extra repeated");
                        return null;
                    }
                    cancelpendingwebviewpause2.IconCompatParcelizer = true;
                    if (jLongValue < j2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: zip64 extra too short");
                        return null;
                    }
                    createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda3 = createbrazeuserchangeeventsubscriberlambda1;
                    long jWrite = createbrazeuserchangeeventsubscriberlambda3.serializer;
                    if (jWrite == 4294967295L) {
                        jWrite = gifDrawableTransformation2.write();
                    }
                    createbrazeuserchangeeventsubscriberlambda3.serializer = jWrite;
                    createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda4 = createbrazeuserchangeeventsubscriberlambda0;
                    createbrazeuserchangeeventsubscriberlambda4.serializer = createbrazeuserchangeeventsubscriberlambda4.serializer == 4294967295L ? gifDrawableTransformation2.write() : 0L;
                    createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda5 = createbrazeuserchangeeventsubscriberlambda2;
                    createbrazeuserchangeeventsubscriberlambda5.serializer = createbrazeuserchangeeventsubscriberlambda5.serializer == 4294967295L ? gifDrawableTransformation2.write() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: NTFS extra too short");
                        return null;
                    }
                    gifDrawableTransformation2.RatingCompat(4L);
                    ThrowableExtensionsKt.read(gifDrawableTransformation2, (int) (jLongValue - 4), new NonBlockingMessageCompanion(createinappmessageeventsubscriber, gifDrawableTransformation2, createinappmessageeventsubscriber2, createinappmessageeventsubscriber3));
                }
                return createFromParcel.INSTANCE;
            }
        });
        if (j2 > 0 && !cancelpendingwebviewpause.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: zip64 extra required but absent");
            return null;
        }
        String str2 = gifDrawableTransformation.read(s7 & 65535);
        String str3 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        return new ApiExceptionSessionExpired(Path$Companion.IconCompatParcelizer("/").write(str), setCarryoverInAppMessage.read(str, "/", false), str2, jIconCompatParcelizer & 4294967295L, createbrazeuserchangeeventsubscriberlambda0.serializer, createbrazeuserchangeeventsubscriberlambda1.serializer, s2 & 65535, createbrazeuserchangeeventsubscriberlambda2.serializer, s4 & 65535, s3 & 65535, (Long) createinappmessageeventsubscriber.IconCompatParcelizer, (Long) createinappmessageeventsubscriber2.IconCompatParcelizer, (Long) createinappmessageeventsubscriber3.IconCompatParcelizer, 57344);
    }

    public static final androidx.room.coroutines.ConnectionPoolImpl write(Recorder$3 recorder$3) {
        return new androidx.room.coroutines.ConnectionPoolImpl(recorder$3);
    }

    public static final ApiExceptionSessionExpired IconCompatParcelizer(GifDrawableTransformation gifDrawableTransformation, ApiExceptionSessionExpired apiExceptionSessionExpired) {
        int iIconCompatParcelizer = gifDrawableTransformation.IconCompatParcelizer();
        if (iIconCompatParcelizer == 67324752) {
            gifDrawableTransformation.RatingCompat(2L);
            short s = gifDrawableTransformation.read();
            if ((s & 1) == 0) {
                gifDrawableTransformation.RatingCompat(18L);
                long j = gifDrawableTransformation.read();
                int i = gifDrawableTransformation.read() & 65535;
                gifDrawableTransformation.RatingCompat(65535 & j);
                if (apiExceptionSessionExpired == null) {
                    gifDrawableTransformation.RatingCompat(i);
                    return null;
                }
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = new createInAppMessageEventSubscriber();
                read(gifDrawableTransformation, i, new NonBlockingMessageCompanion(gifDrawableTransformation, createinappmessageeventsubscriber, createinappmessageeventsubscriber2, createinappmessageeventsubscriber3));
                return new ApiExceptionSessionExpired(apiExceptionSessionExpired.read, apiExceptionSessionExpired.PlaybackStateCompat, apiExceptionSessionExpired.IconCompatParcelizer, apiExceptionSessionExpired.MediaMetadataCompat, apiExceptionSessionExpired.write, apiExceptionSessionExpired.ResultReceiver, apiExceptionSessionExpired.RemoteActionCompatParcelizer, apiExceptionSessionExpired.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, apiExceptionSessionExpired.MediaBrowserCompatMediaItem, apiExceptionSessionExpired.MediaSessionCompatQueueItem, apiExceptionSessionExpired.PlaybackStateCompatCustomAction, apiExceptionSessionExpired.MediaSessionCompatResultReceiverWrapper, apiExceptionSessionExpired.MediaSessionCompatToken, (Integer) createinappmessageeventsubscriber.IconCompatParcelizer, (Integer) createinappmessageeventsubscriber2.IconCompatParcelizer, (Integer) createinappmessageeventsubscriber3.IconCompatParcelizer);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unsupported zip: general purpose bit flag=".concat(IconCompatParcelizer(s & 65535)));
            return null;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("bad zip: expected ", IconCompatParcelizer(67324752), " but was ", IconCompatParcelizer(iIconCompatParcelizer));
        return null;
    }

    public static final LinkedHashMap write(ArrayList arrayList) {
        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer = Path$Companion.IconCompatParcelizer("/");
        LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0(recyclableBufferedInputStreamIconCompatParcelizer, new ApiExceptionSessionExpired(recyclableBufferedInputStreamIconCompatParcelizer, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (ApiExceptionSessionExpired apiExceptionSessionExpired : onContentCardDismissed.serializer(arrayList, new setIsHtmlInAppMessageHtmlLinkTargetEnabled(6))) {
            if (((ApiExceptionSessionExpired) linkedHashMapIconCompatParcelizer.put(apiExceptionSessionExpired.read, apiExceptionSessionExpired)) == null) {
                while (true) {
                    RecyclableBufferedInputStream recyclableBufferedInputStream = apiExceptionSessionExpired.read;
                    RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer2 = recyclableBufferedInputStream.IconCompatParcelizer();
                    if (recyclableBufferedInputStreamIconCompatParcelizer2 == null) {
                        break;
                    }
                    ApiExceptionSessionExpired apiExceptionSessionExpired2 = (ApiExceptionSessionExpired) linkedHashMapIconCompatParcelizer.get(recyclableBufferedInputStreamIconCompatParcelizer2);
                    if (apiExceptionSessionExpired2 != null) {
                        apiExceptionSessionExpired2.serializer.add(recyclableBufferedInputStream);
                        break;
                    }
                    ApiExceptionSessionExpired apiExceptionSessionExpired3 = new ApiExceptionSessionExpired(recyclableBufferedInputStreamIconCompatParcelizer2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapIconCompatParcelizer.put(recyclableBufferedInputStreamIconCompatParcelizer2, apiExceptionSessionExpired3);
                    apiExceptionSessionExpired3.serializer.add(recyclableBufferedInputStream);
                    apiExceptionSessionExpired = apiExceptionSessionExpired3;
                }
            }
        }
        return linkedHashMapIconCompatParcelizer;
    }

    public static final androidx.room.coroutines.ConnectionPoolImpl write(Recorder$3 recorder$3, String str, int i) {
        str.getClass();
        return new androidx.room.coroutines.ConnectionPoolImpl(recorder$3, str, i);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b2 A[Catch: all -> 0x01ec, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01ec, blocks: (B:3:0x000b, B:5:0x0019, B:6:0x0021, B:18:0x007b, B:20:0x0085, B:68:0x014a, B:65:0x0144, B:69:0x014b, B:99:0x01a5, B:102:0x01b2, B:97:0x01a0, B:106:0x01bb, B:109:0x01c7, B:110:0x01ce, B:112:0x01d0, B:113:0x01d3, B:114:0x01d4, B:115:0x01eb, B:61:0x013e, B:7:0x002a, B:9:0x0033, B:17:0x0059, B:103:0x01b3, B:104:0x01b8, B:21:0x008e, B:23:0x0097, B:26:0x00a8, B:52:0x012d, B:48:0x0126, B:53:0x012e, B:54:0x0133, B:93:0x019a), top: B:131:0x000b, inners: #0, #5, #11, #12 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a5 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #3 {all -> 0x01ec, blocks: (B:3:0x000b, B:5:0x0019, B:6:0x0021, B:18:0x007b, B:20:0x0085, B:68:0x014a, B:65:0x0144, B:69:0x014b, B:99:0x01a5, B:102:0x01b2, B:97:0x01a0, B:106:0x01bb, B:109:0x01c7, B:110:0x01ce, B:112:0x01d0, B:113:0x01d3, B:114:0x01d4, B:115:0x01eb, B:61:0x013e, B:7:0x002a, B:9:0x0033, B:17:0x0059, B:103:0x01b3, B:104:0x01b8, B:21:0x008e, B:23:0x0097, B:26:0x00a8, B:52:0x012d, B:48:0x0126, B:53:0x012e, B:54:0x0133, B:93:0x019a), top: B:131:0x000b, inners: #0, #5, #11, #12 }] */
    public static final ApiExceptionForceAppUpdateRequired IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream, HttpUrlFetcher httpUrlFetcher, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        GifDrawableTransformation gifDrawableTransformation;
        Throwable th;
        Throwable th2;
        Throwable th3;
        httpUrlFetcher.getClass();
        DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem = httpUrlFetcher.MediaSessionCompatQueueItem(recyclableBufferedInputStream);
        try {
            long jRemoteActionCompatParcelizer = defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
            long j = jRemoteActionCompatParcelizer - 22;
            long j2 = 0;
            if (j >= 0) {
                long jMax = Math.max(jRemoteActionCompatParcelizer - 65558, 0L);
                do {
                    GifDrawableTransformation gifDrawableTransformation2 = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(j));
                    try {
                        if (gifDrawableTransformation2.IconCompatParcelizer() == 101010256) {
                            short s = gifDrawableTransformation2.read();
                            short s2 = gifDrawableTransformation2.read();
                            long j3 = gifDrawableTransformation2.read() & 65535;
                            if (j3 == (gifDrawableTransformation2.read() & 65535) && (s & 65535) == 0 && (s2 & 65535) == 0) {
                                gifDrawableTransformation2.RatingCompat(4L);
                                long jIconCompatParcelizer = gifDrawableTransformation2.IconCompatParcelizer();
                                int i = gifDrawableTransformation2.read() & 65535;
                                ApiExceptionSessionExpiredForbidden apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j3, jIconCompatParcelizer & 4294967295L, i);
                                gifDrawableTransformation2.read(i);
                                gifDrawableTransformation2.close();
                                long j4 = j - 20;
                                if (j4 > 0) {
                                    GifDrawableTransformation gifDrawableTransformation3 = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(j4));
                                    try {
                                        if (gifDrawableTransformation3.IconCompatParcelizer() == 117853008) {
                                            int iIconCompatParcelizer = gifDrawableTransformation3.IconCompatParcelizer();
                                            long jWrite = gifDrawableTransformation3.write();
                                            if (gifDrawableTransformation3.IconCompatParcelizer() == 1 && iIconCompatParcelizer == 0) {
                                                GifDrawableTransformation gifDrawableTransformation4 = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(jWrite));
                                                try {
                                                    int iIconCompatParcelizer2 = gifDrawableTransformation4.IconCompatParcelizer();
                                                    if (iIconCompatParcelizer2 == 101075792) {
                                                        gifDrawableTransformation4.RatingCompat(12L);
                                                        int iIconCompatParcelizer3 = gifDrawableTransformation4.IconCompatParcelizer();
                                                        int iIconCompatParcelizer4 = gifDrawableTransformation4.IconCompatParcelizer();
                                                        long jWrite2 = gifDrawableTransformation4.write();
                                                        if (jWrite2 == gifDrawableTransformation4.write() && iIconCompatParcelizer3 == 0 && iIconCompatParcelizer4 == 0) {
                                                            gifDrawableTransformation4.RatingCompat(8L);
                                                            ApiExceptionSessionExpiredForbidden apiExceptionSessionExpiredForbidden2 = new ApiExceptionSessionExpiredForbidden(jWrite2, gifDrawableTransformation4.write(), i);
                                                            try {
                                                                gifDrawableTransformation4.close();
                                                                th3 = null;
                                                            } catch (Throwable th4) {
                                                                th3 = th4;
                                                            }
                                                            apiExceptionSessionExpiredForbidden = apiExceptionSessionExpiredForbidden2;
                                                            if (th3 != null) {
                                                                throw th3;
                                                            }
                                                        } else {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                    } else {
                                                        throw new IOException("bad zip: expected " + IconCompatParcelizer(101075792) + " but was " + IconCompatParcelizer(iIconCompatParcelizer2));
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        gifDrawableTransformation4.close();
                                                    } catch (Throwable th6) {
                                                        markOnScreenCardsAsReadlambda1.read(th5, th6);
                                                    }
                                                    th3 = th5;
                                                }
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        }
                                        try {
                                            gifDrawableTransformation3.close();
                                            th2 = null;
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th2 = th8;
                                        try {
                                            gifDrawableTransformation3.close();
                                        } catch (Throwable th9) {
                                            markOnScreenCardsAsReadlambda1.read(th2, th9);
                                        }
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                }
                                ArrayList arrayList = new ArrayList();
                                GifDrawableTransformation gifDrawableTransformation5 = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(apiExceptionSessionExpiredForbidden.write));
                                try {
                                    long j5 = apiExceptionSessionExpiredForbidden.read;
                                    while (j2 < j5) {
                                        ApiExceptionSessionExpired apiExceptionSessionExpired = read(gifDrawableTransformation5);
                                        gifDrawableTransformation = gifDrawableTransformation5;
                                        try {
                                            if (apiExceptionSessionExpired.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < apiExceptionSessionExpiredForbidden.write) {
                                                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(apiExceptionSessionExpired)).booleanValue()) {
                                                    arrayList.add(apiExceptionSessionExpired);
                                                }
                                                j2++;
                                                gifDrawableTransformation5 = gifDrawableTransformation;
                                            } else {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            th = th;
                                            try {
                                                gifDrawableTransformation.close();
                                            } catch (Throwable th11) {
                                                markOnScreenCardsAsReadlambda1.read(th, th11);
                                            }
                                            if (th == null) {
                                                ApiExceptionForceAppUpdateRequired apiExceptionForceAppUpdateRequired = new ApiExceptionForceAppUpdateRequired(recyclableBufferedInputStream, httpUrlFetcher, write(arrayList));
                                                try {
                                                    defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                                                } catch (Throwable unused) {
                                                }
                                                return apiExceptionForceAppUpdateRequired;
                                            }
                                            throw th;
                                        }
                                    }
                                    try {
                                        gifDrawableTransformation5.close();
                                        th = null;
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    gifDrawableTransformation = gifDrawableTransformation5;
                                }
                                if (th == null) {
                                    ApiExceptionForceAppUpdateRequired apiExceptionForceAppUpdateRequired2 = new ApiExceptionForceAppUpdateRequired(recyclableBufferedInputStream, httpUrlFetcher, write(arrayList));
                                    defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                                    return apiExceptionForceAppUpdateRequired2;
                                }
                                throw th;
                            }
                            throw new IOException("unsupported zip: spanned");
                        }
                        gifDrawableTransformation2.close();
                        j--;
                    } catch (Throwable th14) {
                        gifDrawableTransformation2.close();
                        throw th14;
                    }
                } while (j >= jMax);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.RemoteActionCompatParcelizer());
        } catch (Throwable th15) {
            if (defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem != null) {
                try {
                    defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                    throw th15;
                } catch (Throwable th16) {
                    markOnScreenCardsAsReadlambda1.read(th15, th16);
                    throw th15;
                }
            }
            throw th15;
        }
    }

    public static final void read(GifDrawableTransformation gifDrawableTransformation, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) throws IOException {
        RegistryMissingComponentException registryMissingComponentException = gifDrawableTransformation.bufferField;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: truncated header in extra field");
                return;
            }
            int i2 = gifDrawableTransformation.read() & 65535;
            long j2 = ((long) gifDrawableTransformation.read()) & 65535;
            long j3 = j - 4;
            if (j3 < j2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("bad zip: truncated value in extra field");
                return;
            }
            gifDrawableTransformation.MediaMetadataCompat(j2);
            long j4 = registryMissingComponentException.size;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i2), Long.valueOf(j2));
            long j5 = (registryMissingComponentException.size + j2) - j4;
            if (j5 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(i2, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j5 > 0) {
                    registryMissingComponentException.RatingCompat(j5);
                }
                j = j3 - j2;
            }
        }
    }
}
