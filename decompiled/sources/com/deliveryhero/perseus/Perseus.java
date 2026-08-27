package com.deliveryhero.perseus;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.sqlite.SQLite;
import androidx.work.CoroutineWorker$startWork$1;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.ContextsKt;
import coil3.util.UtilsKt;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider$mutateConfigSync$1;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.perseus.di.DataModule;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import io.sentry.util.UrlUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetIntersectcp;
import o.ensureNotConsumed;
import o.getPathFillTypeRgk1Os;
import o.getViewportWidth;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setStrokeLineMiter;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class Perseus {
    public static final /* synthetic */ int serializer = 0;

    static {
        LinkedHashSet linkedHashSet = PerseusApp.write;
    }

    @Keep
    public static final void updateSessionLastUsedDate() {
        PerseusApp.updateSessionLastUsedDate();
    }

    @Keep
    public enum Environment {
        STAGING("https://perseus-stg.deliveryhero.net"),
        PRODUCTION("https://perseus-productanalytics.deliveryhero.net");

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final String basePath;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final String getBasePath() {
            return this.basePath;
        }

        Environment(String str) {
            this.basePath = str;
        }
    }

    @Keep
    public static final void execute(PerseusEvent perseusEvent) {
        perseusEvent.getClass();
        PerseusApp.execute(perseusEvent);
    }

    @Keep
    public static final class Config extends PerseusParamsConfig {
        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map map, String str14, String str15, Map map2, long j2, long j3, long j4, ensureNotConsumed ensurenotconsumed, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str16 = (i2 & 1) != 0 ? "" : str;
            String str17 = (i2 & 16) != 0 ? "" : str5;
            String str18 = (i2 & 32) != 0 ? "" : str6;
            int i3 = (i2 & Fields.RotationY) != 0 ? 10 : i;
            long j5 = (i2 & Fields.RotationZ) != 0 ? 30L : j;
            String str19 = (i2 & Fields.CameraDistance) != 0 ? "" : str9;
            String str20 = (i2 & Fields.TransformOrigin) != 0 ? "" : str10;
            String str21 = (i2 & 8192) != 0 ? null : str11;
            Consent consent2 = (i2 & Fields.Clip) != 0 ? null : consent;
            String str22 = (32768 & i2) != 0 ? null : str12;
            boolean z3 = (65536 & i2) != 0 ? false : z2;
            String str23 = (131072 & i2) != 0 ? "" : str13;
            SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
            this(str16, str2, str3, str4, str17, str18, str7, z, str8, i3, j5, str19, str20, str21, consent2, str22, z3, str23, (262144 & i2) != 0 ? simpleItemTouchHelperCallback : map, (524288 & i2) != 0 ? "" : str14, (1048576 & i2) != 0 ? "" : str15, (2097152 & i2) != 0 ? simpleItemTouchHelperCallback : map2, (4194304 & i2) != 0 ? 5L : j2, (8388608 & i2) != 0 ? 60L : j3, (16777216 & i2) != 0 ? 300L : j4, (i2 & 33554432) != 0 ? ensureNotConsumed.Durable : ensurenotconsumed);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, 0L, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67107840, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67106816, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67104768, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67100672, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67092480, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67076096, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, false, null, null, null, null, null, 0L, 0L, 0L, null, 67043328, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, null, null, null, null, null, 0L, 0L, 0L, null, 66977792, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, null, null, null, null, 0L, 0L, 0L, null, 66846720, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, null, null, null, 0L, 0L, 0L, null, 66584576, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, null, null, 0L, 0L, 0L, null, 66060288, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, null, 0L, 0L, 0L, null, 65011712, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15, Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map2) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, map2, 0L, 0L, 0L, null, 62914560, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
            map2.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15, Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map2, long j2) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, map2, j2, 0L, 0L, null, 58720256, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
            map2.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15, Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map2, long j2, long j3) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, map2, j2, j3, 0L, null, 50331648, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
            map2.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15, Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map2, long j2, long j3, long j4) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, map2, j2, j3, j4, null, 33554432, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
            map2.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, int i, long j, String str9, String str10, String str11, Consent consent, String str12, boolean z2, String str13, Map<String, ? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> map, String str14, String str15, Map<Integer, ? extends List<? extends r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> map2, long j2, long j3, long j4, ensureNotConsumed ensurenotconsumed) {
            super(str, str2, str3, str4, str5, str6, str7, z, str8, i, j, str9, str10, str11, consent, str12, z2, str13, map, str14, str15, map2, j2, j3, j4, ensurenotconsumed);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
            str9.getClass();
            str10.getClass();
            map.getClass();
            str15.getClass();
            map2.getClass();
            ensurenotconsumed.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
            this(str, str2, str3, str4, str5, null, str6, z, str7, 0, 0L, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67108384, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str6, str7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
            this(str, str2, str3, str4, null, null, str5, z, str6, 0, 0L, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67108400, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, boolean z, String str5) {
            this(null, str, str2, str3, null, null, str4, z, str5, 0, 0L, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67108401, null);
            m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8) {
            this(str, str2, str3, str4, str5, str6, str7, z, str8, 0, 0L, null, null, null, null, null, false, null, null, null, null, null, 0L, 0L, 0L, null, 67108352, null);
            m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str7, str8);
        }
    }

    public static final String RemoteActionCompatParcelizer() {
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer == null) {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
            return "null";
        }
        ClientIdProviderImpl clientIdProviderImpl = updateRenderPath.read();
        String str = clientIdProviderImpl.read;
        if (str != null) {
            return str;
        }
        synchronized (clientIdProviderImpl.write) {
            String strSerializer = clientIdProviderImpl.serializer();
            if (strSerializer != null) {
                return strSerializer;
            }
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            return (String) BuildersKt.serializer(DefaultIoScheduler.RemoteActionCompatParcelizer, new CoroutineWorker$startWork$1(clientIdProviderImpl, shortNewsContentCardView, 5));
        }
    }

    public static final String serializer() {
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer == null) {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
            return "null";
        }
        DataModule dataModule = DataModule.read;
        String str = (String) ((PerseusUserLocalDataStoreImpl) DataModule.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).write.write("session_id");
        if (str != null) {
            return str;
        }
        return (String) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new Perseus$sessionId$1(2, null));
    }

    public static final void serializer(Application application, Config config) {
        PerseusParamsConfig perseusParamsConfig;
        LinkedHashSet linkedHashSet = PerseusApp.write;
        accessgetIntersectcp accessgetintersectcp = new accessgetIntersectcp(16);
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        Application application2 = (Application) applicationContext;
        pauseWebviewIfNecessarylambda10.IconCompatParcelizer = application2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(updateRenderPath.MediaMetadataCompat.plus(UrlUtils.serializer())), null, null, new MapLayersUiModel$1(application2, shortNewsContentCardView, 4), 3);
        updateRenderPath.MediaSessionCompatQueueItem.getClass();
        synchronized (DefaultPerseusConfigProvider.read) {
            DefaultPerseusConfigProvider defaultPerseusConfigProvider = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
            PerseusParamsConfig perseusParamsConfig2 = DefaultPerseusConfigProvider.read(config);
            DefaultPerseusConfigProvider.write = perseusParamsConfig2;
            perseusParamsConfig = DefaultPerseusConfigProvider.read(perseusParamsConfig2);
        }
        EmojiProcessor emojiProcessor = DefaultPerseusConfigProvider.serializer;
        DefaultPerseusConfigProvider$mutateConfigSync$1 defaultPerseusConfigProvider$mutateConfigSync$1 = new DefaultPerseusConfigProvider$mutateConfigSync$1(perseusParamsConfig, shortNewsContentCardView, 1);
        emojiProcessor.getClass();
        ((BufferedChannel) emojiProcessor.IconCompatParcelizer).b_(defaultPerseusConfigProvider$mutateConfigSync$1);
        int i = 0;
        if (config.getClientId() != null) {
            try {
                updateRenderPath.read().IconCompatParcelizer(config.getClientId());
            } catch (Throwable th) {
                getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Failed to set the client id: ", th);
            }
        } else {
            ContextScope contextScope = getViewportWidth.serializer;
            ContextsKt.IconCompatParcelizer(new PerseusApp$init$1(1, 0, null));
        }
        ContextScope contextScope2 = getViewportWidth.serializer;
        ContextsKt.IconCompatParcelizer(new PerseusApp$init$1(1, 1, null));
        ContextsKt.IconCompatParcelizer(new PerseusApp$init$1(1, 2, null));
        ContextsKt.IconCompatParcelizer(new PerseusApp$init$4(accessgetintersectcp, shortNewsContentCardView, i));
    }

    @Keep
    public static final void execute(setStrokeLineMiter setstrokelinemiter) {
        setstrokelinemiter.getClass();
        PerseusApp.execute(setstrokelinemiter);
    }

    public static void serializer(String str, int i, String str2, String str3, String str4) {
        PerseusParamsConfig perseusParamsConfig;
        ShortNewsContentCardView shortNewsContentCardView = null;
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = (i & 32) != 0 ? null : str2;
        String str7 = (i & Fields.RotationX) != 0 ? null : str3;
        String str8 = (i & Fields.RotationZ) != 0 ? null : str4;
        List list = SQLite.read(null, str5, null, str6, null, null, str7, null, str8, null, null);
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                updateRenderPath.MediaSessionCompatQueueItem.getClass();
                synchronized (DefaultPerseusConfigProvider.read) {
                    PerseusParamsConfig perseusParamsConfig2 = DefaultPerseusConfigProvider.write;
                    if (perseusParamsConfig2 == null) {
                        getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
                        perseusParamsConfig = null;
                    } else {
                        if (str8 != null) {
                            perseusParamsConfig2.setUserId(str8);
                        }
                        if (str6 != null) {
                            perseusParamsConfig2.setCountryCode(str6);
                        }
                        if (str5 != null) {
                            perseusParamsConfig2.setAdvertisingId(str5);
                        }
                        if (str7 != null) {
                            perseusParamsConfig2.setGlobalEntityId(str7);
                        }
                        DefaultPerseusConfigProvider defaultPerseusConfigProvider = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
                        PerseusParamsConfig perseusParamsConfig3 = DefaultPerseusConfigProvider.write;
                        if (perseusParamsConfig3 != null) {
                            perseusParamsConfig = DefaultPerseusConfigProvider.read(perseusParamsConfig3);
                        } else {
                            removeNodeAtDepth.serializer("config");
                            throw null;
                        }
                    }
                }
                if (perseusParamsConfig == null) {
                    return;
                }
                EmojiProcessor emojiProcessor = DefaultPerseusConfigProvider.serializer;
                DefaultPerseusConfigProvider$mutateConfigSync$1 defaultPerseusConfigProvider$mutateConfigSync$1 = new DefaultPerseusConfigProvider$mutateConfigSync$1(perseusParamsConfig, shortNewsContentCardView, 0);
                emojiProcessor.getClass();
                ((BufferedChannel) emojiProcessor.IconCompatParcelizer).b_(defaultPerseusConfigProvider$mutateConfigSync$1);
                return;
            }
        }
    }
}
