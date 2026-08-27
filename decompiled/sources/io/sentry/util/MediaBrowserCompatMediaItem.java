package io.sentry.util;

import androidx.compose.ui.graphics.Fields;
import coil3.Extras$Key;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.AckNewOrderSeenWorker;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryOptions;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import o.AndroidUiFrameClock;
import o.AndroidUiFrameClockwithFrameNanos21;
import o.AndroidUriHandler;
import o.AndroidViewConfiguration;
import o.Api29Impl;
import o.BaseCardViewsetImageViewToUrl1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.CSSParseException;
import o.GraphicsLayerScope;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.clearPrimaryClip;
import o.drawOutlinehn5TExg;
import o.getPlacementScope;
import o.isAppSetIdReadingEnabled;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onPreDraw;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setCompositingStrategyaDBOjCE;
import o.setFrom58bKbWc;
import o.setRotationY;
import o.toolingGraphicsLayer;
import o.tryMaxHeightJN0ABg;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem implements getPlacementScope {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int serializer;

    public MediaBrowserCompatMediaItem(AndroidUiFrameClock androidUiFrameClock) {
        this.serializer = 23;
    }

    public /* synthetic */ MediaBrowserCompatMediaItem(int i) {
        this.serializer = i;
    }

    public static boolean IconCompatParcelizer(SentryOptions sentryOptions, String str) {
        BrazeActionParserExternalSyntheticLambda0 logger;
        int i = 2 % 2;
        if (sentryOptions != null) {
            int i2 = read + 45;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                logger = sentryOptions.getLogger();
                int i3 = 6 / 0;
            } else {
                logger = sentryOptions.getLogger();
            }
            int i4 = write + 87;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            logger = null;
        }
        return write(logger, str);
    }

    public static boolean write(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0, str) == null) {
            return false;
        }
        int i4 = read + 43;
        int i5 = i4 % Fields.SpotShadowColor;
        write = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 13;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static Class RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = read + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            Class<?> cls = Class.forName(str);
            int i4 = write + 3;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return cls;
        } catch (ClassNotFoundException unused) {
            if (brazeActionParserExternalSyntheticLambda0 == null) {
                return null;
            }
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (brazeActionParserExternalSyntheticLambda0 == null) {
                return null;
            }
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (brazeActionParserExternalSyntheticLambda0 == null) {
                return null;
            }
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to initialize ".concat(str), th);
            int i6 = read + 59;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
    }

    public static CashPaymentTaskUiItem RemoteActionCompatParcelizer(CashPaymentTaskUiItem cashPaymentTaskUiItem, CashPaymentTaskUiItem cashPaymentTaskUiItem2) {
        String str;
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CashPaymentTaskUiItem.ReasonItem reasonItemParcelableVolumeInfo = cashPaymentTaskUiItem.ParcelableVolumeInfo();
        CashPaymentTaskUiItem.ReasonItem reasonItemRatingCompat = cashPaymentTaskUiItem.RatingCompat();
        Double dSerializer = cashPaymentTaskUiItem.serializer();
        Double dMediaSessionCompatResultReceiverWrapper = cashPaymentTaskUiItem.MediaSessionCompatResultReceiverWrapper();
        String strMediaSessionCompatQueueItem = cashPaymentTaskUiItem.MediaSessionCompatQueueItem();
        String strMediaMetadataCompat = cashPaymentTaskUiItem.MediaMetadataCompat();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        String str2 = (String) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1261427077, 1261427080, new Object[]{cashPaymentTaskUiItem}, iWrite, BehaviorSubject.BehaviorDisposable.write());
        if (str2.length() > 0) {
            int i4 = read + 107;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            int i6 = write + 65;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
            str = (String) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1261427077, 1261427080, new Object[]{cashPaymentTaskUiItem2}, iWrite2, BehaviorSubject.BehaviorDisposable.write());
        } else {
            str = str2;
        }
        return CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, dMediaSessionCompatResultReceiverWrapper, dSerializer, reasonItemParcelableVolumeInfo, reasonItemRatingCompat, strMediaSessionCompatQueueItem, strMediaMetadataCompat, str, cashPaymentTaskUiItem.PlaybackStateCompatCustomAction(), cashPaymentTaskUiItem.MediaDescriptionCompat(), 28346367);
    }

    public static setRotationY RemoteActionCompatParcelizer(long j, long j2, String str, String str2) {
        int i = 2 % 2;
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce2 = setCompositingStrategyaDBOjCE.CONNECTED;
        setcompositingstrategyadbojce2.getClass();
        toolingGraphicsLayer toolinggraphicslayer = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce2, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet));
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujdSerializer = tryMaxHeightJN0ABg.serializer(j, j2, str, str2);
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(AckNewOrderSeenWorker.class);
        setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer;
        setfrom58bkbwc.read = toolinggraphicslayer;
        setfrom58bkbwc.MediaSessionCompatToken = accessgetambientshadowcolor0d7_kjujdSerializer;
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.read(GraphicsLayerScope.EXPONENTIAL, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM).RemoteActionCompatParcelizer();
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = 2 % 2;
        int i2 = read + 115;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer == 1) {
            return new Extras$Key(metricsBatchProcessor.read(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(AndroidUiFrameClockwithFrameNanos21.class)));
        }
        clearPrimaryClip clearprimaryclip = new clearPrimaryClip((Api29Impl) metricsBatchProcessor.read(Api29Impl.class), (AndroidViewConfiguration) metricsBatchProcessor.read(AndroidViewConfiguration.class), (AndroidUriHandler) metricsBatchProcessor.read(AndroidUriHandler.class));
        int i4 = read + 81;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return clearprimaryclip;
    }

    public static onPreDraw IconCompatParcelizer() throws InterruptedException {
        int i = 2 % 2;
        CSSParseException cSSParseException = onPreDraw.MediaBrowserCompatMediaItem;
        onPreDraw onpredraw = ((onPreDraw[]) cSSParseException.RemoteActionCompatParcelizer)[1];
        Object obj = null;
        if (onpredraw != null) {
            long jNanoTime = onpredraw.MediaMetadataCompat - System.nanoTime();
            if (jNanoTime > 0) {
                onPreDraw.IconCompatParcelizer.await(jNanoTime, TimeUnit.NANOSECONDS);
                return null;
            }
            cSSParseException.read(onpredraw);
            onpredraw.MediaDescriptionCompat = 2;
            int i2 = write + 45;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return onpredraw;
        }
        long jNanoTime2 = System.nanoTime();
        onPreDraw.IconCompatParcelizer.await(onPreDraw.write, TimeUnit.MILLISECONDS);
        if (((onPreDraw[]) cSSParseException.RemoteActionCompatParcelizer)[1] == null) {
            int i4 = read + 101;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (System.nanoTime() - jNanoTime2 >= onPreDraw.read) {
                return onPreDraw.serializer;
            }
        }
        int i6 = read + 71;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public static final void write(onPreDraw onpredraw) {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 79;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            CSSParseException cSSParseException = onPreDraw.MediaBrowserCompatMediaItem;
            int i4 = 92 / 0;
            if (onPreDraw.serializer == null) {
                onPreDraw.serializer = new onPreDraw();
                BaseCardViewsetImageViewToUrl1 baseCardViewsetImageViewToUrl1 = new BaseCardViewsetImageViewToUrl1("Okio Watchdog");
                baseCardViewsetImageViewToUrl1.setDaemon(true);
                baseCardViewsetImageViewToUrl1.start();
            }
        } else {
            CSSParseException cSSParseException2 = onPreDraw.MediaBrowserCompatMediaItem;
            if (onPreDraw.serializer == null) {
                onPreDraw.serializer = new onPreDraw();
                BaseCardViewsetImageViewToUrl1 baseCardViewsetImageViewToUrl2 = new BaseCardViewsetImageViewToUrl1("Okio Watchdog");
                baseCardViewsetImageViewToUrl2.setDaemon(true);
                baseCardViewsetImageViewToUrl2.start();
            }
        }
        long jNanoTime = System.nanoTime();
        long j = onpredraw.MediaSessionCompatToken;
        boolean z = onpredraw.ParcelableVolumeInfo;
        if (j != 0) {
            int i5 = read + 95;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (z) {
                onpredraw.MediaMetadataCompat = Math.min(j, onpredraw.Q_() - jNanoTime) + jNanoTime;
                int i7 = read + 89;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                }
            } else if (j != 0) {
                i = read + 63;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    onpredraw.MediaMetadataCompat = jNanoTime ^ j;
                } else {
                    onpredraw.MediaMetadataCompat = jNanoTime + j;
                }
            } else {
                if (z) {
                    int iSerializer = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                    return;
                }
                onpredraw.MediaMetadataCompat = onpredraw.Q_();
                int i9 = read + 47;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        } else if (j != 0) {
            i = read + 63;
            write = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                onpredraw.MediaMetadataCompat = jNanoTime ^ j;
            } else {
                onpredraw.MediaMetadataCompat = jNanoTime + j;
            }
        } else {
            if (z) {
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer2);
                return;
            }
            onpredraw.MediaMetadataCompat = onpredraw.Q_();
            int i11 = read + 47;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        CSSParseException cSSParseException3 = onPreDraw.MediaBrowserCompatMediaItem;
        int i13 = cSSParseException3.IconCompatParcelizer + 1;
        cSSParseException3.IconCompatParcelizer = i13;
        onPreDraw[] onpredrawArr = (onPreDraw[]) cSSParseException3.RemoteActionCompatParcelizer;
        if (i13 == onpredrawArr.length) {
            onPreDraw[] onpredrawArr2 = new onPreDraw[i13 * 2];
            onContentCardClicked.IconCompatParcelizer(0, 0, 14, onpredrawArr, onpredrawArr2);
            cSSParseException3.RemoteActionCompatParcelizer = onpredrawArr2;
        }
        cSSParseException3.IconCompatParcelizer(i13, onpredraw);
        if (onpredraw.MediaSessionCompatQueueItem == 1) {
            onPreDraw.IconCompatParcelizer.signal();
        }
    }
}
