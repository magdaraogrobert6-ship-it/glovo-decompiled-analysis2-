package o;

import android.view.FrameMetrics;
import android.view.Window;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setNativeFilterQuality50PEsBU implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ setNativeFilterQuality50PEsBU(Object obj, int i, Object obj2) {
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        setNativeShader setnativeshader;
        if (this.read != 0) {
            SentryFrameMetricsCollector.IconCompatParcelizer((SentryFrameMetricsCollector) this.IconCompatParcelizer, (io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) this.write, window, frameMetrics);
            return;
        }
        setNativeShader setnativeshader2 = (setNativeShader) this.IconCompatParcelizer;
        setNativeColor4WTKRHQ setnativecolor4wtkrhq = (setNativeColor4WTKRHQ) this.write;
        frameMetrics.getClass();
        long jMax = Math.max(frameMetrics.getMetric(10), setnativeshader2.MediaDescriptionCompat);
        if (jMax < setnativeshader2.MediaMetadataCompat || jMax == setnativeshader2.MediaSessionCompatQueueItem) {
            return;
        }
        setNativeBlendModeGB0RdKg setnativeblendmodegb0rdkgWrite = setnativeshader2.write(jMax, (long) (setnativeshader2.serializer(frameMetrics) * setnativecolor4wtkrhq.serializer), frameMetrics);
        setnativeblendmodegb0rdkgWrite.getClass();
        JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = setnativecolor4wtkrhq.IconCompatParcelizer;
        setInvalidateListenerui setinvalidatelistenerui = (setInvalidateListenerui) jankStatsFrameTracker$$ExternalSyntheticLambda3.IconCompatParcelizer;
        Window window2 = (Window) jankStatsFrameTracker$$ExternalSyntheticLambda3.RemoteActionCompatParcelizer;
        window2.getClass();
        setName setname = new setName(window2.hashCode(), setnativeblendmodegb0rdkgWrite.IconCompatParcelizer);
        synchronized (setinvalidatelistenerui.RatingCompat) {
            LinkedHashMap linkedHashMap = setinvalidatelistenerui.RatingCompat;
            BrazeContentCardsManager brazeContentCardsManager = (BrazeContentCardsManager) linkedHashMap.get(setname);
            if (brazeContentCardsManager == null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) brazeContentCardsManager.RatingCompat();
                if (brazeContentCardsManager.isEmpty()) {
                    linkedHashMap.remove(setname);
                }
            }
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                setName setname2 = new setName(Integer.MIN_VALUE, setnativeblendmodegb0rdkgWrite.IconCompatParcelizer);
                LinkedHashMap linkedHashMap2 = setinvalidatelistenerui.RatingCompat;
                BrazeContentCardsManager brazeContentCardsManager2 = (BrazeContentCardsManager) linkedHashMap2.get(setname2);
                if (brazeContentCardsManager2 == null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) brazeContentCardsManager2.RatingCompat();
                    if (brazeContentCardsManager2.isEmpty()) {
                        linkedHashMap2.remove(setname2);
                    }
                }
            }
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(setnativeblendmodegb0rdkgWrite.serializer());
        }
        for (setClipPathData setclippathdata : setinvalidatelistenerui.read) {
            setclippathdata.getClass();
            insertAt insertat = setclippathdata.serializer;
            if (insertat.write.get() > 0) {
                getTintColor0d7_KjU gettintcolor0d7_kju = insertat.read;
                int i2 = (int) (setnativeblendmodegb0rdkgWrite.serializer / 1000000);
                synchronized (gettintcolor0d7_kju.MediaBrowserCompatMediaItem) {
                    gettintcolor0d7_kju.write++;
                    if (setnativeblendmodegb0rdkgWrite.RemoteActionCompatParcelizer) {
                        gettintcolor0d7_kju.RemoteActionCompatParcelizer++;
                    }
                    long j = i2;
                    requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview = gettintcolor0d7_kju.serializer;
                    setnativeshader = setnativeshader2;
                    if (j > requestfocusbypassunfocusablecomposeview.read) {
                        gettintcolor0d7_kju.read++;
                    }
                    if (j > requestfocusbypassunfocusablecomposeview.IconCompatParcelizer) {
                        gettintcolor0d7_kju.IconCompatParcelizer++;
                    }
                }
                List<setNativePathEffect> list = setnativeblendmodegb0rdkgWrite.read;
                list.getClass();
                String str = null;
                String str2 = null;
                String str3 = null;
                for (setNativePathEffect setnativepatheffect : list) {
                    String str4 = setnativepatheffect.RemoteActionCompatParcelizer;
                    String str5 = setnativepatheffect.read;
                    int iHashCode = str4.hashCode();
                    if (iHashCode != -507834177) {
                        if (iHashCode != 380385666) {
                            if (iHashCode == 386083011 && str4.equals("Screen_Fragment") && str2 == null) {
                                str2 = str5;
                            }
                        } else if (str4.equals("Screen_Activity") && str3 == null) {
                            str3 = str5;
                        }
                    } else if (str4.equals("Screen_Compose") && str == null) {
                        str = str5;
                    }
                }
                getPivotY getpivoty = (str == null && str2 == null && str3 == null) ? null : new getPivotY(str3, str2, str);
                if (getpivoty != null) {
                    androidx.emoji2.text.EmojiProcessor emojiProcessor = insertat.MediaSessionCompatQueueItem;
                    androidx.emoji2.text.EmojiProcessor emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.IconCompatParcelizer;
                    requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview2 = (requestFocusBypassUnfocusableComposeView) emojiProcessor.serializer;
                    String str6 = getpivoty.IconCompatParcelizer;
                    String str7 = getpivoty.serializer;
                    int i3 = (int) (setnativeblendmodegb0rdkgWrite.serializer / 1000000);
                    String str8 = getpivoty.RemoteActionCompatParcelizer;
                    String str9 = str8 == null ? str7 == null ? str6 : str7 : str8;
                    if (str9 != null) {
                        ((androidx.emoji2.text.EmojiProcessor) emojiProcessor.read).serializer(str9, setnativeblendmodegb0rdkgWrite, i3, requestfocusbypassunfocusablecomposeview2);
                    }
                    if (str8 != null) {
                        emojiProcessor2.serializer(str8, setnativeblendmodegb0rdkgWrite, i3, requestfocusbypassunfocusablecomposeview2);
                    }
                    if (str7 != null && !str7.equals(str8)) {
                        emojiProcessor2.serializer(str7, setnativeblendmodegb0rdkgWrite, i3, requestfocusbypassunfocusablecomposeview2);
                    }
                    if (str6 != null && !str6.equals(str7) && !str6.equals(str8)) {
                        emojiProcessor2.serializer(str6, setnativeblendmodegb0rdkgWrite, i3, requestfocusbypassunfocusablecomposeview2);
                    }
                }
                setnativeshader2 = setnativeshader;
            }
        }
        setnativeshader2.MediaSessionCompatQueueItem = jMax;
    }
}
