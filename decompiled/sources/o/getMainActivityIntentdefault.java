package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.f8$$ExternalSyntheticLambda2;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getMainActivityIntentdefault implements Closeable {
    public static final java.util.logging.Logger logger;
    public final isActivityRegisteredInManifest continuation;
    public final setMessageChevron hpackReader;
    public final RegistryNoSourceEncoderAvailableException source;

    /* JADX WARN: Code duplicated, block: B:179:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:187:0x0309  */
    /* JADX WARN: Code duplicated, block: B:190:0x0310 A[Catch: all -> 0x0317, TRY_LEAVE, TryCatch #3 {, blocks: (B:188:0x030a, B:190:0x0310), top: B:223:0x030a }] */
    /* JADX WARN: Code duplicated, block: B:197:0x031b  */
    /* JADX WARN: Code duplicated, block: B:223:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    public final boolean IconCompatParcelizer(boolean z, r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco r8lambdanbcgczh9jkhunnwsiyypdsyjvco) throws Exception {
        createHorizontalAnimation createhorizontalanimation;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0Serializer;
        RequestBuilder requestBuilderRemoteActionCompatParcelizer;
        createHorizontalAnimation createhorizontalanimation2;
        try {
            this.source.MediaMetadataCompat(9L);
            int iWrite = InAppMessageHtmlBaseViewCompanion.write(this.source);
            if (iWrite > 16384) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem() & 255;
            byte bMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem();
            int i = bMediaBrowserCompatMediaItem & 255;
            int iMediaSessionCompatResultReceiverWrapper = this.source.MediaSessionCompatResultReceiverWrapper();
            int i2 = Integer.MAX_VALUE & iMediaSessionCompatResultReceiverWrapper;
            int i3 = 1;
            if (iMediaBrowserCompatMediaItem != 8) {
                java.util.logging.Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.write(i2, iWrite, iMediaBrowserCompatMediaItem, i, true));
                }
            }
            if (z && iMediaBrowserCompatMediaItem != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.write(iMediaBrowserCompatMediaItem), "Expected a SETTINGS frame but was ");
                return false;
            }
            InAppMessageSlideupView inAppMessageSlideupView = null;
            switch (iMediaBrowserCompatMediaItem) {
                case 0:
                    IconCompatParcelizer(r8lambdanbcgczh9jkhunnwsiyypdsyjvco, iWrite, i, i2);
                    return true;
                case 1:
                    write(r8lambdanbcgczh9jkhunnwsiyypdsyjvco, iWrite, i, i2);
                    return true;
                case 2:
                    if (iWrite != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(d$$ExternalSyntheticOutline0.m(iWrite, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i2 == 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
                    registryNoSourceEncoderAvailableException.MediaSessionCompatResultReceiverWrapper();
                    registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem();
                    return true;
                case 3:
                    if (iWrite != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(d$$ExternalSyntheticOutline0.m(iWrite, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i2 == 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iMediaSessionCompatResultReceiverWrapper2 = this.source.MediaSessionCompatResultReceiverWrapper();
                    InAppMessageSlideupView.Companion.getClass();
                    for (InAppMessageSlideupView inAppMessageSlideupView2 : InAppMessageSlideupView.values()) {
                        if (inAppMessageSlideupView2.getHttpCode() == iMediaSessionCompatResultReceiverWrapper2) {
                            inAppMessageSlideupView = inAppMessageSlideupView2;
                            if (inAppMessageSlideupView != null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatResultReceiverWrapper2, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            createhorizontalanimation = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                            if (i2 == 0 && (iMediaSessionCompatResultReceiverWrapper & 1) == 0) {
                                onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.pushQueue, createhorizontalanimation.connectionName + '[' + i2 + "] onReset", 0L, new UriUtils(createhorizontalanimation, i2, inAppMessageSlideupView, i3), 6);
                                return true;
                            }
                            isactivityregisteredinmanifestlambda0Serializer = createhorizontalanimation.serializer(i2);
                            if (isactivityregisteredinmanifestlambda0Serializer != null) {
                                synchronized (isactivityregisteredinmanifestlambda0Serializer) {
                                    if (isactivityregisteredinmanifestlambda0Serializer.serializer() == null) {
                                        isactivityregisteredinmanifestlambda0Serializer.serializer = inAppMessageSlideupView;
                                        isactivityregisteredinmanifestlambda0Serializer.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (inAppMessageSlideupView != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatResultReceiverWrapper2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    createhorizontalanimation = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                    if (i2 == 0) {
                    }
                    isactivityregisteredinmanifestlambda0Serializer = createhorizontalanimation.serializer(i2);
                    if (isactivityregisteredinmanifestlambda0Serializer != null) {
                        synchronized (isactivityregisteredinmanifestlambda0Serializer) {
                            if (isactivityregisteredinmanifestlambda0Serializer.serializer() == null) {
                                isactivityregisteredinmanifestlambda0Serializer.serializer = inAppMessageSlideupView;
                                isactivityregisteredinmanifestlambda0Serializer.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException2 = this.source;
                    if (i2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bMediaBrowserCompatMediaItem & 1) != 0) {
                        if (iWrite != 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iWrite % 6 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu = new r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU();
                    getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(6, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(iWrite)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
                    int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
                    int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
                    int i6 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                        while (true) {
                            short sComponentActivity = registryNoSourceEncoderAvailableException2.ComponentActivity();
                            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                            int i7 = sComponentActivity & 65535;
                            int iMediaSessionCompatResultReceiverWrapper3 = registryNoSourceEncoderAvailableException2.MediaSessionCompatResultReceiverWrapper();
                            if (i7 != 2) {
                                if (i7 != 4) {
                                    if (i7 == 5 && (iMediaSessionCompatResultReceiverWrapper3 < 16384 || iMediaSessionCompatResultReceiverWrapper3 > 16777215)) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatResultReceiverWrapper3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (iMediaSessionCompatResultReceiverWrapper3 < 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (iMediaSessionCompatResultReceiverWrapper3 != 0 && iMediaSessionCompatResultReceiverWrapper3 != 1) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            r8lambdaegyeunc1miz5uhkn7yqmbsifezu.read(i7, iMediaSessionCompatResultReceiverWrapper3);
                            if (i4 != i5) {
                                i4 += i6;
                            }
                        }
                    }
                    createHorizontalAnimation createhorizontalanimation3 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                    onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation3.writerQueue, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), createhorizontalanimation3.connectionName, " applyAndAckSettings"), 0L, new SealedClassSerializer$$ExternalSyntheticLambda0(r8lambdanbcgczh9jkhunnwsiyypdsyjvco, 23, r8lambdaegyeunc1miz5uhkn7yqmbsifezu), 6);
                    return true;
                case 5:
                    read(r8lambdanbcgczh9jkhunnwsiyypdsyjvco, iWrite, i, i2);
                    return true;
                case 6:
                    if (iWrite != 8) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_PING streamId != 0");
                        return false;
                    }
                    int iMediaSessionCompatResultReceiverWrapper4 = this.source.MediaSessionCompatResultReceiverWrapper();
                    int iMediaSessionCompatResultReceiverWrapper5 = this.source.MediaSessionCompatResultReceiverWrapper();
                    i = (bMediaBrowserCompatMediaItem & 1) != 0 ? 1 : 0;
                    createHorizontalAnimation createhorizontalanimation4 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                    int i8 = 3;
                    if (i == 0) {
                        onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation4.writerQueue, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0.connectionName, " ping"), 0L, new f8$$ExternalSyntheticLambda2(iMediaSessionCompatResultReceiverWrapper4, iMediaSessionCompatResultReceiverWrapper5, i8, r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0), 6);
                        return true;
                    }
                    synchronized (createhorizontalanimation4) {
                        try {
                            if (iMediaSessionCompatResultReceiverWrapper4 == 1) {
                                createhorizontalanimation4.intervalPongsReceived++;
                            } else if (iMediaSessionCompatResultReceiverWrapper4 == 2) {
                                createhorizontalanimation4.degradedPongsReceived++;
                            } else if (iMediaSessionCompatResultReceiverWrapper4 == 3) {
                                createhorizontalanimation4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iWrite < 8) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iMediaSessionCompatResultReceiverWrapper6 = this.source.MediaSessionCompatResultReceiverWrapper();
                    int iMediaSessionCompatResultReceiverWrapper7 = this.source.MediaSessionCompatResultReceiverWrapper();
                    int i9 = iWrite - 8;
                    InAppMessageSlideupView.Companion.getClass();
                    for (InAppMessageSlideupView inAppMessageSlideupView3 : InAppMessageSlideupView.values()) {
                        if (inAppMessageSlideupView3.getHttpCode() == iMediaSessionCompatResultReceiverWrapper7) {
                            inAppMessageSlideupView = inAppMessageSlideupView3;
                            if (inAppMessageSlideupView != null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatResultReceiverWrapper7, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            requestBuilderRemoteActionCompatParcelizer = RequestBuilder.EMPTY;
                            if (i9 > 0) {
                                requestBuilderRemoteActionCompatParcelizer = this.source.RemoteActionCompatParcelizer(i9);
                            }
                            requestBuilderRemoteActionCompatParcelizer.getClass();
                            requestBuilderRemoteActionCompatParcelizer.serializer();
                            createhorizontalanimation2 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                            synchronized (createhorizontalanimation2) {
                                Object[] array = createhorizontalanimation2.streams.values().toArray(new isActivityRegisteredInManifestlambda0[0]);
                                createhorizontalanimation2.isShutdown = true;
                            }
                            for (isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 : (isActivityRegisteredInManifestlambda0[]) array) {
                                if (isactivityregisteredinmanifestlambda0.MediaMetadataCompat <= iMediaSessionCompatResultReceiverWrapper6 && isactivityregisteredinmanifestlambda0.IconCompatParcelizer()) {
                                    InAppMessageSlideupView inAppMessageSlideupView4 = InAppMessageSlideupView.REFUSED_STREAM;
                                    inAppMessageSlideupView4.getClass();
                                    synchronized (isactivityregisteredinmanifestlambda0) {
                                        if (isactivityregisteredinmanifestlambda0.serializer() == null) {
                                            isactivityregisteredinmanifestlambda0.serializer = inAppMessageSlideupView4;
                                            isactivityregisteredinmanifestlambda0.notifyAll();
                                        }
                                        break;
                                    }
                                    r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0.serializer(isactivityregisteredinmanifestlambda0.MediaMetadataCompat);
                                }
                            }
                            return true;
                        }
                    }
                    if (inAppMessageSlideupView != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iMediaSessionCompatResultReceiverWrapper7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    requestBuilderRemoteActionCompatParcelizer = RequestBuilder.EMPTY;
                    if (i9 > 0) {
                        requestBuilderRemoteActionCompatParcelizer = this.source.RemoteActionCompatParcelizer(i9);
                    }
                    requestBuilderRemoteActionCompatParcelizer.getClass();
                    requestBuilderRemoteActionCompatParcelizer.serializer();
                    createhorizontalanimation2 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                    synchronized (createhorizontalanimation2) {
                        Object[] array2 = createhorizontalanimation2.streams.values().toArray(new isActivityRegisteredInManifestlambda0[0]);
                        createhorizontalanimation2.isShutdown = true;
                        while (i < r3) {
                            if (isactivityregisteredinmanifestlambda0.MediaMetadataCompat <= iMediaSessionCompatResultReceiverWrapper6) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iWrite != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iWrite);
                        }
                        long jMediaSessionCompatResultReceiverWrapper = ((long) this.source.MediaSessionCompatResultReceiverWrapper()) & 2147483647L;
                        if (jMediaSessionCompatResultReceiverWrapper == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        java.util.logging.Logger logger3 = logger;
                        if (logger3.isLoggable(Level.FINE)) {
                            logger3.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.serializer(i2, iWrite, jMediaSessionCompatResultReceiverWrapper, true));
                        }
                        createHorizontalAnimation createhorizontalanimation5 = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
                        if (i2 == 0) {
                            synchronized (createhorizontalanimation5) {
                                createhorizontalanimation5.writeBytesMaximum += jMediaSessionCompatResultReceiverWrapper;
                                createhorizontalanimation5.notifyAll();
                            }
                            return true;
                        }
                        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer = createhorizontalanimation5.RemoteActionCompatParcelizer(i2);
                        if (isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer != null) {
                            synchronized (isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer) {
                                isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer.ParcelableVolumeInfo += jMediaSessionCompatResultReceiverWrapper;
                                if (jMediaSessionCompatResultReceiverWrapper > 0) {
                                    isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        logger.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.write(i2, iWrite, 8, i, true));
                        throw e;
                    }
                default:
                    this.source.RatingCompat(iWrite);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.source.close();
    }

    public final List write(int i, int i2, int i3, int i4) throws IOException {
        isActivityRegisteredInManifest isactivityregisteredinmanifest = this.continuation;
        isactivityregisteredinmanifest.left = i;
        isactivityregisteredinmanifest.length = i;
        isactivityregisteredinmanifest.padding = i2;
        isactivityregisteredinmanifest.flags = i3;
        isactivityregisteredinmanifest.streamId = i4;
        setMessageChevron setmessagechevron = this.hpackReader;
        GifDrawableTransformation gifDrawableTransformation = setmessagechevron.source;
        ArrayList arrayList = setmessagechevron.headerList;
        while (!gifDrawableTransformation.RatingCompat()) {
            byte bMediaBrowserCompatMediaItem = gifDrawableTransformation.MediaBrowserCompatMediaItem();
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            int i5 = bMediaBrowserCompatMediaItem & 255;
            if (i5 == 128) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("index == 0");
                return null;
            }
            if ((bMediaBrowserCompatMediaItem & 128) == 128) {
                int iWrite = setmessagechevron.write(i5, 127);
                int i6 = iWrite - 1;
                if (i6 >= 0) {
                    AnimationUtils[] animationUtilsArr = applyWindowInsetslambda0.IconCompatParcelizer;
                    if (i6 <= animationUtilsArr.length - 1) {
                        arrayList.add(animationUtilsArr[i6]);
                    }
                }
                int length = setmessagechevron.nextHeaderIndex + 1 + (i6 - applyWindowInsetslambda0.IconCompatParcelizer.length);
                if (length >= 0) {
                    AnimationUtils[] animationUtilsArr2 = setmessagechevron.dynamicTable;
                    if (length < animationUtilsArr2.length) {
                        AnimationUtils animationUtils = animationUtilsArr2[length];
                        animationUtils.getClass();
                        arrayList.add(animationUtils);
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iWrite, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                AnimationUtils[] animationUtilsArr3 = applyWindowInsetslambda0.IconCompatParcelizer;
                RequestBuilder requestBuilderWrite = setmessagechevron.write();
                applyWindowInsetslambda0.RemoteActionCompatParcelizer(requestBuilderWrite);
                setmessagechevron.write(new AnimationUtils(requestBuilderWrite, setmessagechevron.write()));
            } else if ((bMediaBrowserCompatMediaItem & 64) == 64) {
                setmessagechevron.write(new AnimationUtils(setmessagechevron.write(setmessagechevron.write(i5, 63) - 1), setmessagechevron.write()));
            } else if ((bMediaBrowserCompatMediaItem & 32) == 32) {
                int iWrite2 = setmessagechevron.write(i5, 31);
                setmessagechevron.maxDynamicTableByteCount = iWrite2;
                if (iWrite2 < 0 || iWrite2 > 4096) {
                    DrawableTransformation.RemoteActionCompatParcelizer(setmessagechevron.maxDynamicTableByteCount, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = setmessagechevron.dynamicTableByteCount;
                if (iWrite2 < i7) {
                    if (iWrite2 == 0) {
                        AnimationUtils[] animationUtilsArr4 = setmessagechevron.dynamicTable;
                        onContentCardClicked.write(0, animationUtilsArr4.length, null, animationUtilsArr4);
                        setmessagechevron.nextHeaderIndex = setmessagechevron.dynamicTable.length - 1;
                        setmessagechevron.headerCount = 0;
                        setmessagechevron.dynamicTableByteCount = 0;
                    } else {
                        setmessagechevron.read(i7 - iWrite2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                AnimationUtils[] animationUtilsArr5 = applyWindowInsetslambda0.IconCompatParcelizer;
                RequestBuilder requestBuilderWrite2 = setmessagechevron.write();
                applyWindowInsetslambda0.RemoteActionCompatParcelizer(requestBuilderWrite2);
                arrayList.add(new AnimationUtils(requestBuilderWrite2, setmessagechevron.write()));
            } else {
                arrayList.add(new AnimationUtils(setmessagechevron.write(setmessagechevron.write(i5, 15) - 1), setmessagechevron.write()));
            }
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList);
        arrayList.clear();
        return listPlaybackStateCompat;
    }

    public getMainActivityIntentdefault(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        registryNoSourceEncoderAvailableException.getClass();
        this.source = registryNoSourceEncoderAvailableException;
        isActivityRegisteredInManifest isactivityregisteredinmanifest = new isActivityRegisteredInManifest(registryNoSourceEncoderAvailableException);
        this.continuation = isactivityregisteredinmanifest;
        this.hpackReader = new setMessageChevron(isactivityregisteredinmanifest);
    }

    public final void read(r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco r8lambdanbcgczh9jkhunnwsiyypdsyjvco, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            int i5 = 0;
            if ((i2 & 8) != 0) {
                byte bMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem();
                byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                i4 = bMediaBrowserCompatMediaItem & 255;
            } else {
                i4 = 0;
            }
            int iMediaSessionCompatResultReceiverWrapper = this.source.MediaSessionCompatResultReceiverWrapper() & Integer.MAX_VALUE;
            List listWrite = write(RangesKt.read(i - 4, i2, i4), i4, i2, i3);
            createHorizontalAnimation createhorizontalanimation = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
            synchronized (createhorizontalanimation) {
                if (createhorizontalanimation.currentPushRequests.contains(Integer.valueOf(iMediaSessionCompatResultReceiverWrapper))) {
                    createhorizontalanimation.RemoteActionCompatParcelizer(iMediaSessionCompatResultReceiverWrapper, InAppMessageSlideupView.PROTOCOL_ERROR);
                    return;
                }
                createhorizontalanimation.currentPushRequests.add(Integer.valueOf(iMediaSessionCompatResultReceiverWrapper));
                onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.pushQueue, createhorizontalanimation.connectionName + '[' + iMediaSessionCompatResultReceiverWrapper + "] onRequest", 0L, new UriUtils(createhorizontalanimation, iMediaSessionCompatResultReceiverWrapper, listWrite, i5), 6);
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    public final void write(r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco r8lambdanbcgczh9jkhunnwsiyypdsyjvco, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 != 0) {
            int i5 = 0;
            boolean z = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                byte bMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem();
                byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                i5 = bMediaBrowserCompatMediaItem & 255;
            }
            if ((i2 & 32) != 0) {
                RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
                registryNoSourceEncoderAvailableException.MediaSessionCompatResultReceiverWrapper();
                registryNoSourceEncoderAvailableException.MediaBrowserCompatMediaItem();
                byte[] bArr2 = InAppMessageHtmlBaseViewCompanion.read;
                i4 = i - 5;
            } else {
                i4 = i;
            }
            List listWrite = write(RangesKt.read(i4, i2, i5), i5, i2, i3);
            createHorizontalAnimation createhorizontalanimation = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
            if (i3 != 0 && (i3 & 1) == 0) {
                onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.pushQueue, createhorizontalanimation.connectionName + '[' + i3 + "] onHeaders", 0L, new UriUtils(createhorizontalanimation, i3, listWrite, z), 6);
                return;
            }
            synchronized (createhorizontalanimation) {
                isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer = createhorizontalanimation.RemoteActionCompatParcelizer(i3);
                if (isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer == null) {
                    if (createhorizontalanimation.isShutdown) {
                        return;
                    }
                    if (i3 <= createhorizontalanimation.lastGoodStreamId) {
                        return;
                    }
                    if (i3 % 2 == createhorizontalanimation.nextStreamId % 2) {
                        return;
                    }
                    isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = new isActivityRegisteredInManifestlambda0(i3, createhorizontalanimation, false, z, setWebViewContent.serializer(listWrite));
                    createhorizontalanimation.lastGoodStreamId = i3;
                    createhorizontalanimation.streams.put(Integer.valueOf(i3), isactivityregisteredinmanifestlambda0);
                    onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.taskRunner.read(), createhorizontalanimation.connectionName + '[' + i3 + "] onStream", 0L, new SealedClassSerializer$$ExternalSyntheticLambda0(createhorizontalanimation, 22, isactivityregisteredinmanifestlambda0), 6);
                    return;
                }
                isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer.IconCompatParcelizer(setWebViewContent.serializer(listWrite), z);
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void IconCompatParcelizer(r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco r8lambdanbcgczh9jkhunnwsiyypdsyjvco, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) == 0) {
            if ((i2 & 8) != 0) {
                byte bMediaBrowserCompatMediaItem = this.source.MediaBrowserCompatMediaItem();
                byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                i4 = bMediaBrowserCompatMediaItem & 255;
            } else {
                i4 = 0;
            }
            final int i5 = RangesKt.read(i, i2, i4);
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
            registryNoSourceEncoderAvailableException.getClass();
            final createHorizontalAnimation createhorizontalanimation = r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0;
            if (i3 != 0 && (i3 & 1) == 0) {
                final RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                long j = i5;
                registryNoSourceEncoderAvailableException.MediaMetadataCompat(j);
                registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(registryMissingComponentException, j);
                onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.pushQueue, createhorizontalanimation.connectionName + '[' + i3 + "] onData", 0L, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(i3, registryMissingComponentException, i5, z4) { // from class: o.setAnimationParams
                    public final /* synthetic */ RegistryMissingComponentException read;
                    public final /* synthetic */ int serializer;
                    public final /* synthetic */ int write;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        createHorizontalAnimation createhorizontalanimation2 = this.IconCompatParcelizer;
                        int i6 = this.serializer;
                        RegistryMissingComponentException registryMissingComponentException2 = this.read;
                        int i7 = this.write;
                        try {
                            createhorizontalanimation2.pushObserver.getClass();
                            registryMissingComponentException2.RatingCompat(i7);
                            createhorizontalanimation2.writer.RemoteActionCompatParcelizer(i6, InAppMessageSlideupView.CANCEL);
                            synchronized (createhorizontalanimation2) {
                                createhorizontalanimation2.currentPushRequests.remove(Integer.valueOf(i6));
                            }
                        } catch (IOException unused) {
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, 6);
            } else {
                isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer = createhorizontalanimation.RemoteActionCompatParcelizer(i3);
                if (isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer == null) {
                    r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0.RemoteActionCompatParcelizer(i3, InAppMessageSlideupView.PROTOCOL_ERROR);
                    long j2 = i5;
                    r8lambdanbcgczh9jkhunnwsiyypdsyjvco.this$0.read(j2);
                    registryNoSourceEncoderAvailableException.RatingCompat(j2);
                } else {
                    TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
                    getQueryParameterslambda2 getqueryparameterslambda2 = isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
                    long j3 = i5;
                    getqueryparameterslambda2.getClass();
                    long j4 = j3;
                    while (true) {
                        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = getqueryparameterslambda2.MediaBrowserCompatMediaItem;
                        if (j4 > 0) {
                            synchronized (isactivityregisteredinmanifestlambda0) {
                                z2 = getqueryparameterslambda2.read;
                                z = z4;
                                z3 = getqueryparameterslambda2.RemoteActionCompatParcelizer.size + j4 > getqueryparameterslambda2.serializer;
                            }
                            if (z3) {
                                registryNoSourceEncoderAvailableException.RatingCompat(j4);
                                getqueryparameterslambda2.MediaBrowserCompatMediaItem.IconCompatParcelizer(InAppMessageSlideupView.FLOW_CONTROL_ERROR);
                                break;
                            }
                            if (z2) {
                                registryNoSourceEncoderAvailableException.RatingCompat(j4);
                                break;
                            }
                            long jRemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(getqueryparameterslambda2.IconCompatParcelizer, j4);
                            if (jRemoteActionCompatParcelizer != -1) {
                                j4 -= jRemoteActionCompatParcelizer;
                                isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = getqueryparameterslambda2.MediaBrowserCompatMediaItem;
                                synchronized (isactivityregisteredinmanifestlambda1) {
                                    if (getqueryparameterslambda2.write) {
                                        getqueryparameterslambda2.IconCompatParcelizer.serializer();
                                    } else {
                                        RegistryMissingComponentException registryMissingComponentException2 = getqueryparameterslambda2.RemoteActionCompatParcelizer;
                                        boolean z5 = registryMissingComponentException2.size == 0;
                                        registryMissingComponentException2.IconCompatParcelizer(getqueryparameterslambda2.IconCompatParcelizer);
                                        if (z5) {
                                            isactivityregisteredinmanifestlambda1.notifyAll();
                                        }
                                    }
                                }
                                z4 = z;
                            } else {
                                DrawableTransformation.IconCompatParcelizer();
                                return;
                            }
                        } else {
                            z = z4;
                            TimeZone timeZone2 = setWebViewContent.RemoteActionCompatParcelizer;
                            isactivityregisteredinmanifestlambda0.RemoteActionCompatParcelizer.read(j3);
                            getqueryparameterslambda2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.flowControlListener.getClass();
                            break;
                        }
                    }
                    if (z) {
                        isactivityregisteredinmanifestlambda0RemoteActionCompatParcelizer.IconCompatParcelizer(resetMessageMarginslambda00.EMPTY, true);
                    }
                }
            }
            this.source.RatingCompat(i4);
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }
}
