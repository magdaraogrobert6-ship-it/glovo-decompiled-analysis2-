package kotlin;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.Recorder$3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.navigation.internal.NavContext;
import androidx.sqlite.SQLite;
import androidx.transition.Transition$1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzc;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.Timestamp;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core._init_lambda3;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.text.RegexKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.serialization.json.internal.JsonEncodingException;
import o.AndroidView;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.CanvasDrawScopeKt;
import o.CanvasDrawScopeKtasDrawTransform1;
import o.CanvasDrawScopedrawContext1;
import o.ComponentDialogExternalSyntheticLambda0;
import o.ContainerStepgetChildStepIteratorinlinediterator1;
import o.ContentDrawScopeDefaultImpls;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.DefaultInAppMessageModalViewFactory;
import o.DoubleIdentitylambda0;
import o.ImageBitmapCompanion;
import o.IntervalTreeiterator1;
import o.MediaMetadataCompat;
import o.ModalBottomSheetKtModalBottomSheetsettleToDismiss111;
import o.ParentDataModifierDefaultImpls;
import o.PendingBannerDismissSnapshot;
import o.PinnableContainerKt;
import o.Placeable;
import o.ProtoFeatureMsg;
import o.StepDataargs_delegatelambda0inlinediterator1;
import o.SwipeDismissTouchListener2;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TextFieldColors;
import o.TextFieldLayout;
import o.TooltipKtTooltipBoxwrappedContent1;
import o.UncheckedColordefault;
import o.accessgetCenterF1C5BW0jd;
import o.accessgetGreencp;
import o.accessgetParentLayoutDirection;
import o.accessgetPerceptualcp;
import o.accessgetRelativecp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvTeletextcp;
import o.accessisRenderNodeCompatiblecp;
import o.accessrequireViewFactoryHolder;
import o.backwardFocusSearch;
import o.beforeOpened;
import o.configurePaintswdJneEdefault;
import o.configureStrokePaintQ_0CZUIdefault;
import o.configureStrokePaintho4zsrM;
import o.copyUg5Nnss;
import o.createInAppMessageViewlambda0;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.dismisslambda0;
import o.displayInAppMessagelambda1;
import o.doItemsShareIds;
import o.drawArcillE91Idefault;
import o.drawCircleV9BoPswdefault;
import o.drawImage9jGpkUEdefault;
import o.drawImageAZ2fEMsdefault;
import o.drawImagegbVJVH8;
import o.drawOvalnJ9OG0;
import o.drawOvalnJ9OG0default;
import o.drawPathGBMwjPUdefault;
import o.drawPathLG529CIdefault;
import o.drawPointsGsft0Wsdefault;
import o.drawRectnJ9OG0;
import o.fullyDrawnReporter_delegatelambda00;
import o.getColorsui_graphics;
import o.getD;
import o.getDefaultShadowColor;
import o.getDrawContext;
import o.getDrawParamsannotations;
import o.getExponentimpl;
import o.getF;
import o.getImpressedCardIds;
import o.getInverseTransform;
import o.getQueryParameterslambda2;
import o.getTransform;
import o.getWhitePoint;
import o.handleCardUpdate;
import o.isAdapterPositionOnScreen;
import o.isControlCardAtPosition;
import o.isRoot;
import o.modulate5vOe2sY;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.parseUseWebViewFromQueryBundle;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.release;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.scaleimpl;
import o.setDensity;
import o.setGraphicModalMaxWidthDp;
import o.setMeasurementConstraintsBRTryo0;
import o.setNativeShader;
import o.setRotationX;
import o.setTranslationX;
import o.setWasCloseMessageCalled;
import o.tintxETnrds;
import o.toLinear;
import o.translate;
import o.translateimpldefault;
import okhttp3.internal.platform.AndroidPlatform$Companion;
import okio.Okio;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LazyKt__LazyJVMKt {
    private static int IconCompatParcelizer = 1;
    public static volatile SentryActivityScreenPerformanceCallbacks RemoteActionCompatParcelizer;
    private static int read;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        Object beforeopened;
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i4);
        int i10 = (~i4) | (~((~i3) | i2));
        int i11 = (~(i4 | i3)) | (~(i7 | i4)) | (~i8);
        int i12 = i2 + i3 + i5 + ((-953487067) * i) + ((-1992133889) * i6);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i5) + ((-1703411712) * i) + (1961361408 * i6) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i5 * 272662391) + (i * 2077717299) + (i6 * 1957688713) + (i13 * 166854656);
        switch (i14 + (i15 * i15 * (-213778432))) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objArr[0];
                int i16 = 2 % 2;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
                isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                int i17 = IconCompatParcelizer + 63;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return isadapterpositiononscreen;
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                return read(objArr);
            case 5:
                return serializer(objArr);
            case 6:
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) objArr[0];
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = (setGraphicModalMaxWidthDp) objArr[1];
                int i19 = 2 % 2;
                setgraphicmodalmaxwidthdp.getClass();
                setgraphicmodalmaxwidthdp2.getClass();
                beforeopened = new beforeOpened(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2);
                int i20 = IconCompatParcelizer + 87;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                break;
            case 7:
                return write(objArr);
            default:
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) objArr[0];
                isRoot isroot = (isRoot) objArr[1];
                beforeopened = (Serializable) objArr[2];
                int i22 = 2 % 2;
                backwardfocussearch.getClass();
                isroot.getClass();
                Object obj = backwardfocussearch.RemoteActionCompatParcelizer.get(isroot);
                if (obj != null) {
                    return obj;
                }
                int i23 = read + 45;
                int i24 = i23 % Fields.SpotShadowColor;
                IconCompatParcelizer = i24;
                int i25 = i23 % 2;
                int i26 = i24 + 45;
                read = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                break;
                break;
        }
        return beforeopened;
    }

    public abstract void read(ProtoFeatureMsg protoFeatureMsg, Object obj);

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        WorkerWrapper workerWrapper;
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) objArr[0];
        String str = (String) objArr[1];
        WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
        workDatabase.getClass();
        scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
        IntervalTreeiterator1 intervalTreeiterator1IconCompatParcelizer = workDatabase.IconCompatParcelizer();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        while (!arrayList.isEmpty()) {
            String str2 = (String) onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList);
            translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVarMediaMetadataCompat;
            setTranslationX settranslationxSerializer = translateimpldefaultVar.serializer(str2);
            if (settranslationxSerializer != setTranslationX.SUCCEEDED && settranslationxSerializer != setTranslationX.FAILED) {
                ((Number) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str2, 5))).intValue();
            }
            arrayList.addAll(((getColorsui_graphics) intervalTreeiterator1IconCompatParcelizer).read(str2));
        }
        getDefaultShadowColor getdefaultshadowcolor = workManagerImpl.MediaMetadataCompat;
        getdefaultshadowcolor.getClass();
        synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
            setRotationX.read().getClass();
            getdefaultshadowcolor.serializer.add(str);
            workerWrapper = getdefaultshadowcolor.read(str);
        }
        getDefaultShadowColor.IconCompatParcelizer(workerWrapper, 1);
        Iterator it = workManagerImpl.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            ((ImageBitmapCompanion) it.next()).RemoteActionCompatParcelizer(str);
        }
        return null;
    }

    public static zzw RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        zzw zzwVar = new zzw();
        zzwVar.read(obj);
        int i2 = read + 23;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zzwVar;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        Exception exc = (Exception) objArr[0];
        int i = 2 % 2;
        zzw zzwVar = new zzw();
        zzwVar.RemoteActionCompatParcelizer(exc);
        int i2 = read + 87;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zzwVar;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) objArr[0];
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            accessrequireviewfactoryholder.getClass();
            return ((StateProviderImpl) ((AndroidView) accessrequireviewfactoryholder)).RemoteActionCompatParcelizer;
        }
        accessrequireviewfactoryholder.getClass();
        StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$4 = ((StateProviderImpl) ((AndroidView) accessrequireviewfactoryholder)).RemoteActionCompatParcelizer;
        throw null;
    }

    public static final setWasCloseMessageCalled serializer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        int i = 2 % 2;
        setgraphicmodalmaxwidthdp.getClass();
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0);
        int i2 = IconCompatParcelizer + 73;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return setwasclosemessagecalled;
    }

    public static final GeoJsonSource geoJsonSource(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        GeoJsonSource.Builder builder = new GeoJsonSource.Builder(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        GeoJsonSource geoJsonSourceBuild = builder.build();
        int i2 = IconCompatParcelizer + 3;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return geoJsonSourceBuild;
    }

    public static SequenceBuilderIterator read(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.write(LoadBalancer$Helper.createCoroutineUnintercepted(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, sequenceBuilderIterator, sequenceBuilderIterator));
        int i2 = read + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return sequenceBuilderIterator;
    }

    public static final File read(Context context, String str) {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            context.getClass();
            return TuplesKt.read(context, removeNodeAtDepth.write((Object) ".preferences_pb", str));
        }
        context.getClass();
        TuplesKt.read(context, removeNodeAtDepth.write((Object) ".preferences_pb", str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void RemoteActionCompatParcelizer(Status status, Object obj, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            status.write();
            throw null;
        }
        if (!status.write()) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(AndroidPlatform$Companion.read(status));
            return;
        }
        parentDataModifierDefaultImpls.IconCompatParcelizer(obj);
        int i3 = read + 45;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static void serializer(defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        defaultviewmodelproviderfactory_delegatelambda0.getClass();
        fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00 = new fullyDrawnReporter_delegatelambda00(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (accessisrendernodecompatiblecp != null) {
            int i2 = read + 71;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            defaultviewmodelproviderfactory_delegatelambda0.read(fullydrawnreporter_delegatelambda00, accessisrendernodecompatiblecp);
            return;
        }
        defaultviewmodelproviderfactory_delegatelambda0.RemoteActionCompatParcelizer(fullydrawnreporter_delegatelambda00);
        int i4 = read + 17;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    public static String IconCompatParcelizer(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String string = bundle.getString(str, str2);
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, af$$ExternalSyntheticOutline0.m(str, " read: ", string), new Object[0]);
        int i4 = read + 107;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static String serializer(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String string = bundle.getString(str, str2);
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, af$$ExternalSyntheticOutline0.m(str, " read: ", string), new Object[0]);
        int i4 = IconCompatParcelizer + 75;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return string;
    }

    public static final setGraphicModalMaxWidthDp read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        int i = 2 % 2;
        int i2 = read + 29;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            setgraphicmodalmaxwidthdp.getClass();
            setgraphicmodalmaxwidthdp.getDescriptor().MediaBrowserCompatMediaItem();
            throw null;
        }
        setgraphicmodalmaxwidthdp.getClass();
        if (setgraphicmodalmaxwidthdp.getDescriptor().MediaBrowserCompatMediaItem()) {
            return setgraphicmodalmaxwidthdp;
        }
        r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk r8lambdanb7pmhqvco6nu45ziyzaebsfhk = new r8lambdaNb7pmHqvco6NU45ziyZAEBsFHk(setgraphicmodalmaxwidthdp);
        int i3 = read + 15;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return r8lambdanb7pmhqvco6nu45ziyzaebsfhk;
        }
        obj.hashCode();
        throw null;
    }

    public static void serializer(Status status, Object obj, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            status.write();
            throw null;
        }
        if (status.write()) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
            int i3 = read + 45;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        parentDataModifierDefaultImpls.IconCompatParcelizer((Exception) AndroidPlatform$Companion.read(status));
        int i5 = read + 71;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public static zzw write(Executor executor, Callable callable) {
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.serializer(executor, "Executor must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzc(zzwVar, 22, callable));
        int i2 = IconCompatParcelizer + 17;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zzwVar;
    }

    public static final ExecutorCoroutineDispatcherImpl read(String str) {
        int i = 2 % 2;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = new ExecutorCoroutineDispatcherImpl(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new translate(str, new AtomicInteger()))));
        int i2 = IconCompatParcelizer + 15;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return executorCoroutineDispatcherImpl;
    }

    public static void RemoteActionCompatParcelizer(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        Intent intentIconCompatParcelizer = IconCompatParcelizer(appCompatActivity);
        if (intentIconCompatParcelizer != null) {
            int i2 = read + 39;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            appCompatActivity.navigateUpTo(intentIconCompatParcelizer);
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Activity ", appCompatActivity.getClass().getSimpleName(), " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        int i4 = IconCompatParcelizer + 61;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
    }

    public static Bundle IconCompatParcelizer(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        read = i2 % Fields.SpotShadowColor;
        ApplicationInfo applicationInfo = (i2 % 2 == 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 81) ? (ApplicationInfo) _init_lambda3.RemoteActionCompatParcelizer.IconCompatParcelizer(context) : (ApplicationInfo) _init_lambda3.read.IconCompatParcelizer(context);
        if (applicationInfo == null) {
            return null;
        }
        int i3 = IconCompatParcelizer + 97;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return applicationInfo.metaData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, o.tintxETnrds] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer, java.lang.Object] */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer;
        long jSerializer;
        ?? ValueOf = (tintxETnrds) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        read = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                ValueOf.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer = ValueOf.RemoteActionCompatParcelizer("SELECT changes()");
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0);
            } else {
                ValueOf.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer = ValueOf.RemoteActionCompatParcelizer("SELECT changes()");
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(0);
            }
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            int i3 = read + 61;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ValueOf = Integer.valueOf((int) jSerializer);
            return ValueOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(ValueOf, th);
                throw th2;
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, boolean z) {
        int i = 2 % 2;
        boolean z2 = bundle.getBoolean(str, z);
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, str + " read: " + z2, new Object[0]);
        int i2 = IconCompatParcelizer + 113;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return z2;
    }

    public static List read(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        String string;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            string = bundle.getString(str);
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, af$$ExternalSyntheticOutline0.m(str, " read: ", string), new Object[0]);
            if (string == null) {
                return null;
            }
        } else {
            string = bundle.getString(str);
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, af$$ExternalSyntheticOutline0.m(str, " read: ", string), new Object[0]);
            if (string == null) {
                return null;
            }
        }
        List listAsList = Arrays.asList(string.split(",", -1));
        int i3 = read + 73;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return listAsList;
    }

    public static final void read(RegexKt regexKt) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        regexKt.getClass();
        if (regexKt instanceof r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            return;
        }
        if (regexKt instanceof DefaultInAppMessageModalViewFactory) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            return;
        }
        int i4 = read + 69;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            if (regexKt instanceof createInAppMessageViewlambda0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Actual serializer for polymorphic cannot be polymorphic itself");
            }
        } else {
            boolean z = regexKt instanceof createInAppMessageViewlambda0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static long RemoteActionCompatParcelizer(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, long j) {
        int i = 2 % 2;
        long j2 = bundle.getInt(str, (int) j);
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, str + " read: " + j2, new Object[0]);
        int i2 = IconCompatParcelizer + 53;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r1 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r4.isCanceled() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        throw new java.util.concurrent.CancellationException("Task is already canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        throw new java.util.concurrent.ExecutionException(r4.getException());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4.isSuccessful() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.isSuccessful() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r2 = kotlin.LazyKt__LazyJVMKt.read + 45;
        kotlin.LazyKt__LazyJVMKt.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
        r4 = r4.getResult();
        r2 = kotlin.LazyKt__LazyJVMKt.read + 27;
        kotlin.LazyKt__LazyJVMKt.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r4) throws java.util.concurrent.ExecutionException {
        /*
            r0 = 0
            r4 = r4[r0]
            com.google.android.gms.tasks.Task r4 = (com.google.android.gms.tasks.Task) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.LazyKt__LazyJVMKt.read
            int r2 = r2 + 91
            int r3 = r2 % 128
            kotlin.LazyKt__LazyJVMKt.IconCompatParcelizer = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L1d
            boolean r2 = r4.isSuccessful()
            r3 = 20
            int r3 = r3 / r0
            if (r2 == 0) goto L3f
            goto L23
        L1d:
            boolean r2 = r4.isSuccessful()
            if (r2 == 0) goto L3f
        L23:
            int r2 = kotlin.LazyKt__LazyJVMKt.read
            int r2 = r2 + 45
            int r3 = r2 % 128
            kotlin.LazyKt__LazyJVMKt.IconCompatParcelizer = r3
            int r2 = r2 % r1
            java.lang.Object r4 = r4.getResult()
            int r2 = kotlin.LazyKt__LazyJVMKt.read
            int r2 = r2 + 27
            int r3 = r2 % 128
            kotlin.LazyKt__LazyJVMKt.IconCompatParcelizer = r3
            int r2 = r2 % r1
            if (r2 != 0) goto L3e
            r1 = 65
            int r1 = r1 / r0
        L3e:
            return r4
        L3f:
            boolean r0 = r4.isCanceled()
            if (r0 == 0) goto L4d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r4.<init>(r0)
            throw r4
        L4d:
            java.lang.Exception r4 = r4.getException()
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LazyKt__LazyJVMKt.write(java.lang.Object[]):java.lang.Object");
    }

    public static void write(long j, long j2, String str, boolean z) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 11;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 75;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("overflow: ", str, j, "(");
        sbM.append(", ");
        sbM.append(j2);
        sbM.append(")");
        throw new ArithmeticException(sbM.toString());
    }

    public static final void read(String str, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        int i = 2 % 2;
        swipeDismissTouchListenerVerticalDismissDirection.getClass();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbM.append(displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirection.getClass()).IconCompatParcelizer());
        sbM.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbM.toString());
    }

    public static final String write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate) {
        Iterator it;
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            resettransientstate.getClass();
            it = r8lambda92m0p9sit5uf70mvjf4rwmruda.read().iterator();
            int i3 = 31 / 0;
        } else {
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            resettransientstate.getClass();
            it = r8lambda92m0p9sit5uf70mvjf4rwmruda.read().iterator();
        }
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (!(!(annotation instanceof SwipeDismissTouchListener2))) {
                int i4 = IconCompatParcelizer + 105;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return ((SwipeDismissTouchListener2) annotation).write();
            }
        }
        return resettransientstate.IconCompatParcelizer.write;
    }

    public static Task RemoteActionCompatParcelizer(Task... taskArr) {
        int i = 2 % 2;
        if (taskArr.length == 0) {
            int i2 = IconCompatParcelizer + 11;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return RemoteActionCompatParcelizer(Collections.EMPTY_LIST);
            }
            RemoteActionCompatParcelizer(Collections.EMPTY_LIST);
            throw null;
        }
        List listAsList = Arrays.asList(taskArr);
        accessgetParentLayoutDirection accessgetparentlayoutdirection = Placeable.RemoteActionCompatParcelizer;
        if (listAsList != null) {
            int i3 = read + 27;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                listAsList.isEmpty();
                throw null;
            }
            if (!listAsList.isEmpty()) {
                Task taskContinueWithTask = write(listAsList).continueWithTask(accessgetparentlayoutdirection, new Extras$Key(listAsList));
                int i4 = read + 85;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return taskContinueWithTask;
            }
        }
        return RemoteActionCompatParcelizer(Collections.EMPTY_LIST);
    }

    public static onViewDetachedFromWindowlambda1 serializer(onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        doItemsShareIds doitemsshareids = doItemsShareIds.write;
        onviewdetachedfromwindowlambda0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        int i4 = getImpressedCardIds.write[onviewdetachedfromwindowlambda0.ordinal()];
        if (i4 == 1) {
            return new isAdapterPositionOnScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        int i5 = IconCompatParcelizer;
        int i6 = i5 + 119;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i4 == 2) {
            isControlCardAtPosition iscontrolcardatposition = new isControlCardAtPosition();
            iscontrolcardatposition.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            iscontrolcardatposition.serializer = doitemsshareids;
            return iscontrolcardatposition;
        }
        int i8 = i5 + 29;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i4 != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        handleCardUpdate handlecardupdate = new handleCardUpdate();
        handlecardupdate.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        handlecardupdate.write = doitemsshareids;
        int i10 = read + 57;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return handlecardupdate;
    }

    public static double RemoteActionCompatParcelizer(Bundle bundle, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            int i2 = IconCompatParcelizer + 73;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        int i3 = IconCompatParcelizer + 49;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return dDoubleValue;
    }

    public static String RemoteActionCompatParcelizer(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i;
        String string;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 43;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            int i5 = IconCompatParcelizer + 43;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            int i7 = read + 1;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2, String str) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 63;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            boolean z = setgraphicmodalmaxwidthdp instanceof DefaultInAppMessageHtmlFullViewFactory;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(setgraphicmodalmaxwidthdp instanceof DefaultInAppMessageHtmlFullViewFactory)) {
            int i4 = i2 + 13;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp2.getDescriptor();
        descriptor.getClass();
        if (r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(descriptor).contains(str)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Sealed class '", setgraphicmodalmaxwidthdp2.getDescriptor().serializer(), "' cannot be serialized as base class '", ((DefaultInAppMessageHtmlFullViewFactory) setgraphicmodalmaxwidthdp).getDescriptor().serializer(), "' because it has property name that conflicts with JSON class discriminator '");
            sbM.append(str);
            sbM.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(sbM.toString().toString());
        }
    }

    public static Intent IconCompatParcelizer(AppCompatActivity appCompatActivity) {
        int i = 2 % 2;
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            int i2 = IconCompatParcelizer + 7;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return parentActivityIntent;
        }
        try {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(appCompatActivity, appCompatActivity.getComponentName());
            if (strRemoteActionCompatParcelizer == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strRemoteActionCompatParcelizer);
            try {
                if (RemoteActionCompatParcelizer(appCompatActivity, componentName) != null) {
                    return new Intent().setComponent(componentName);
                }
                Intent intentMakeMainActivity = Intent.makeMainActivity(componentName);
                int i4 = IconCompatParcelizer + 43;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return intentMakeMainActivity;
            } catch (PackageManager.NameNotFoundException unused) {
                SentryLogcatAdapter.serializer("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strRemoteActionCompatParcelizer + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent serializer(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, componentName);
        Object obj = null;
        if (strRemoteActionCompatParcelizer == null) {
            int i2 = read + 11;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strRemoteActionCompatParcelizer);
        if (RemoteActionCompatParcelizer(context, componentName2) != null) {
            return new Intent().setComponent(componentName2);
        }
        int i3 = read + 65;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Intent intentMakeMainActivity = Intent.makeMainActivity(componentName2);
        int i5 = IconCompatParcelizer + 39;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return intentMakeMainActivity;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[LOOP:1: B:22:0x006a->B:24:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:12:0x002a->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static zzw write(List list) {
        Iterator it;
        PinnableContainerKt pinnableContainerKt;
        Iterator it2;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 125;
        int i4 = i3 % Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            int i5 = 31 / 0;
            if (list != null) {
                int i6 = i4 + 73;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (!list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        int i8 = read + 123;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (((Task) it.next()) != null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null tasks are not accepted");
                            i = IconCompatParcelizer + 123;
                            read = i % Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                int i10 = 71 / 0;
                            }
                            return null;
                        }
                    }
                    zzw zzwVar = new zzw();
                    pinnableContainerKt = new PinnableContainerKt(list.size(), zzwVar);
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Task task = (Task) it2.next();
                        setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo0 = Placeable.write;
                        task.addOnSuccessListener(setmeasurementconstraintsbrtryo0, pinnableContainerKt);
                        task.addOnFailureListener(setmeasurementconstraintsbrtryo0, pinnableContainerKt);
                        task.addOnCanceledListener(setmeasurementconstraintsbrtryo0, pinnableContainerKt);
                    }
                    int i11 = read + 41;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return zzwVar;
                }
            }
        } else if (list != null) {
            int i13 = i4 + 73;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (!list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    int i15 = read + 123;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (((Task) it.next()) != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null tasks are not accepted");
                        i = IconCompatParcelizer + 123;
                        read = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            int i17 = 71 / 0;
                        }
                        return null;
                    }
                }
                zzw zzwVar2 = new zzw();
                pinnableContainerKt = new PinnableContainerKt(list.size(), zzwVar2);
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Task task2 = (Task) it2.next();
                    setMeasurementConstraintsBRTryo0 setmeasurementconstraintsbrtryo1 = Placeable.write;
                    task2.addOnSuccessListener(setmeasurementconstraintsbrtryo1, pinnableContainerKt);
                    task2.addOnFailureListener(setmeasurementconstraintsbrtryo1, pinnableContainerKt);
                    task2.addOnCanceledListener(setmeasurementconstraintsbrtryo1, pinnableContainerKt);
                }
                int i18 = read + 41;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return zzwVar2;
            }
        }
        return RemoteActionCompatParcelizer((Object) null);
    }

    public static Object RemoteActionCompatParcelizer(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            int i2 = read + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Must not be called on GoogleApiHandler thread.");
                return null;
            }
        }
        accessgetSystemNavigationDowncp.serializer(task, "Task must not be null");
        accessgetSystemNavigationDowncp.serializer(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            int i4 = IconCompatParcelizer + 97;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
        }
        release releaseVar = new release(0);
        Executor executor = Placeable.write;
        task.addOnSuccessListener(executor, releaseVar);
        task.addOnFailureListener(executor, releaseVar);
        task.addOnCanceledListener(executor, releaseVar);
        if (!releaseVar.serializer.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
    }

    public static Object read(Task task) throws InterruptedException {
        int i = 2 % 2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        Object obj = null;
        if (looperMyLooper != null) {
            int i2 = IconCompatParcelizer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Must not be called on GoogleApiHandler thread.");
                return null;
            }
        }
        accessgetSystemNavigationDowncp.serializer(task, "Task must not be null");
        if (!task.isComplete()) {
            release releaseVar = new release(0);
            Executor executor = Placeable.write;
            task.addOnSuccessListener(executor, releaseVar);
            task.addOnFailureListener(executor, releaseVar);
            task.addOnCanceledListener(executor, releaseVar);
            releaseVar.serializer.await();
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
        }
        int i4 = read + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            Object objIconCompatParcelizer = IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
            int i5 = IconCompatParcelizer + 115;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objIconCompatParcelizer;
            }
            obj.hashCode();
            throw null;
        }
        int iRemoteActionCompatParcelizer5 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer6 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer6, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    public static final MeasureResult write(TextFieldColors textFieldColors, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List list, androidx.compose.ui.layout.Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        Object obj;
        int i9;
        int iMax;
        int i10;
        TextFieldLayout textFieldLayout;
        float f;
        int i11;
        int i12 = i7;
        int i13 = 2;
        int i14 = 2 % 2;
        long j = i5;
        int i15 = i12 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int i17 = 0;
        int i18 = 0;
        int iMin = 0;
        int iMax2 = 0;
        boolean z = false;
        float f2 = 0.0f;
        while (true) {
            obj = null;
            if (i16 >= i12) {
                break;
            }
            int i19 = IconCompatParcelizer + 53;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % i13;
            Measurable measurable = (Measurable) list.get(i16);
            TextFieldLayout textFieldLayoutRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(measurable);
            float fFloatValue = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{textFieldLayoutRemoteActionCompatParcelizer}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
            if (z) {
                f = 0.0f;
                z = true;
            } else {
                UrlUtils urlUtils = textFieldLayoutRemoteActionCompatParcelizer != null ? textFieldLayoutRemoteActionCompatParcelizer.RemoteActionCompatParcelizer : null;
                if (urlUtils == null || !(urlUtils instanceof ModalBottomSheetKtModalBottomSheetsettleToDismiss111)) {
                    f = 0.0f;
                    z = false;
                } else {
                    f = 0.0f;
                    z = true;
                }
            }
            if (fFloatValue > f) {
                f2 += fFloatValue;
                i17++;
                i15 = i15;
            } else {
                int i21 = i3 - i18;
                androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = placeableArr[i16];
                if (placeableMo2209measureBRTryo0 == null) {
                    int i22 = IconCompatParcelizer;
                    int i23 = i22 + 43;
                    int i24 = i23 % Fields.SpotShadowColor;
                    read = i24;
                    int i25 = i23 % 2;
                    if (i3 == Integer.MAX_VALUE) {
                        int i26 = i22 + 117;
                        read = i26 % Fields.SpotShadowColor;
                        if (i26 % 2 != 0) {
                            int i27 = 1 / 0;
                        }
                        i11 = Integer.MAX_VALUE;
                    } else if (i21 < 0) {
                        i11 = 0;
                    } else {
                        int i28 = i24 + 109;
                        IconCompatParcelizer = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        i11 = i21;
                    }
                    placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(textFieldColors.read(0, i11, i4, false));
                }
                androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo0;
                int iWrite = textFieldColors.write(placeable);
                int i30 = textFieldColors.read(placeable);
                iArr2[i16 - i6] = iWrite;
                int i31 = i21 - iWrite;
                if (i31 < 0) {
                    i31 = 0;
                }
                iMin = Math.min(i5, i31);
                i18 += iWrite + iMin;
                iMax2 = Math.max(iMax2, i30);
                placeableArr[i16] = placeable;
                int i32 = IconCompatParcelizer + 3;
                read = i32 % Fields.SpotShadowColor;
                int i33 = i32 % 2;
            }
            i16++;
            i15 = i15;
            i13 = 2;
        }
        int i34 = i15;
        int i35 = iMax2;
        if (i17 == 0) {
            i18 -= iMin;
            i9 = 0;
        } else {
            long j2 = ((long) (i17 - 1)) * j;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i36 = i6; i36 < i12; i36++) {
                jRound -= (long) Math.round(((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer((Measurable) list.get(i36))}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue() * f3);
            }
            int i37 = i6;
            int i38 = 0;
            while (i37 < i12) {
                if (placeableArr[i37] == null) {
                    Measurable measurable2 = (Measurable) list.get(i37);
                    TextFieldLayout textFieldLayoutRemoteActionCompatParcelizer2 = BuildersKt.RemoteActionCompatParcelizer(measurable2);
                    float fFloatValue2 = ((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{textFieldLayoutRemoteActionCompatParcelizer2}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue();
                    if (fFloatValue2 <= 0.0f) {
                        TooltipKtTooltipBoxwrappedContent1.serializer("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax3 = Math.max(0, Math.round(fFloatValue2 * f3) + iSignum);
                    if (textFieldLayoutRemoteActionCompatParcelizer2 == null || textFieldLayoutRemoteActionCompatParcelizer2.write) {
                        int i39 = read + 19;
                        IconCompatParcelizer = i39 % Fields.SpotShadowColor;
                        if (i39 % 2 == 0) {
                            throw null;
                        }
                        int i40 = iMax3 != Integer.MAX_VALUE ? iMax3 : 0;
                        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo1 = measurable2.mo2209measureBRTryo0(textFieldColors.read(i40, iMax3, i4, true));
                        int iWrite2 = textFieldColors.write(placeableMo2209measureBRTryo1);
                        int i41 = textFieldColors.read(placeableMo2209measureBRTryo1);
                        iArr2[i37 - i6] = iWrite2;
                        i38 += iWrite2;
                        int iMax4 = Math.max(i35, i41);
                        placeableArr[i37] = placeableMo2209measureBRTryo1;
                        i35 = iMax4;
                    }
                    androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo2 = measurable2.mo2209measureBRTryo0(textFieldColors.read(i40, iMax3, i4, true));
                    int iWrite3 = textFieldColors.write(placeableMo2209measureBRTryo2);
                    int i42 = textFieldColors.read(placeableMo2209measureBRTryo2);
                    iArr2[i37 - i6] = iWrite3;
                    i38 += iWrite3;
                    int iMax5 = Math.max(i35, i42);
                    placeableArr[i37] = placeableMo2209measureBRTryo2;
                    i35 = iMax5;
                }
                i37++;
                i12 = i7;
                j2 = j2;
            }
            int i43 = (int) (((long) i38) + j2);
            i9 = i3 - i18;
            if (i43 < 0) {
                i43 = 0;
            }
            if (i43 > i9) {
                int i44 = IconCompatParcelizer + 83;
                read = i44 % Fields.SpotShadowColor;
                if (i44 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                i9 = i43;
            }
        }
        if (z) {
            int iMax6 = 0;
            iMax = 0;
            for (int i45 = i6; i45 < i7; i45++) {
                int i46 = read + 119;
                IconCompatParcelizer = i46 % Fields.SpotShadowColor;
                int i47 = i46 % 2;
                androidx.compose.ui.layout.Placeable placeable2 = placeableArr[i45];
                placeable2.getClass();
                Object parentData = placeable2.getParentData();
                if (parentData instanceof TextFieldLayout) {
                    int i48 = read + 107;
                    IconCompatParcelizer = i48 % Fields.SpotShadowColor;
                    int i49 = i48 % 2;
                    textFieldLayout = (TextFieldLayout) parentData;
                } else {
                    textFieldLayout = null;
                }
                UrlUtils urlUtils2 = textFieldLayout != null ? textFieldLayout.RemoteActionCompatParcelizer : null;
                Integer numWrite = urlUtils2 != null ? urlUtils2.write(placeable2) : null;
                if (numWrite != null) {
                    int iIntValue = numWrite.intValue();
                    int i50 = textFieldColors.read(placeable2);
                    iMax6 = Math.max(iMax6, iIntValue != Integer.MIN_VALUE ? numWrite.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = i50;
                    }
                    iMax = Math.max(iMax, i50 - iIntValue);
                }
            }
            i10 = iMax6;
        } else {
            iMax = 0;
            i10 = 0;
        }
        int i51 = i18 + i9;
        if (i51 < 0) {
            int i52 = read + 29;
            IconCompatParcelizer = i52 % Fields.SpotShadowColor;
            int i53 = i52 % 2;
            i51 = 0;
        }
        int iMax7 = Math.max(i51, i);
        int iMax8 = Math.max(i35, Math.max(i2, iMax + i10));
        int[] iArr3 = new int[i34];
        textFieldColors.IconCompatParcelizer(iMax7, iArr2, iArr3, measureScope);
        return textFieldColors.serializer(placeableArr, measureScope, i10, iArr3, iMax7, iMax8, iArr, i8, i6, i7);
    }

    public static Registry serializer(Glide glide, ArrayList arrayList) {
        getInverseTransform copyug5nnss;
        getInverseTransform contentDrawScopeDefaultImpls;
        int i = 2 % 2;
        getD getd = glide.read;
        getF getf = glide.write;
        accessgetPerceptualcp accessgetperceptualcp = glide.RatingCompat;
        Context applicationContext = accessgetperceptualcp.getApplicationContext();
        accessgetRelativecp accessgetrelativecp = accessgetperceptualcp.MediaBrowserCompatMediaItem;
        Registry registry = new Registry();
        registry.RemoteActionCompatParcelizer(new CanvasDrawScopedrawContext1());
        registry.RemoteActionCompatParcelizer(new accessgetCenterF1C5BW0jd());
        Resources resources = applicationContext.getResources();
        ArrayList arrayListRemoteActionCompatParcelizer = registry.RemoteActionCompatParcelizer();
        drawImageAZ2fEMsdefault drawimageaz2femsdefault = new drawImageAZ2fEMsdefault(applicationContext, arrayListRemoteActionCompatParcelizer, getd, getf);
        VideoDecoder videoDecoderSerializer = VideoDecoder.serializer(getd);
        CanvasDrawScopeKtasDrawTransform1 canvasDrawScopeKtasDrawTransform1 = new CanvasDrawScopeKtasDrawTransform1(registry.RemoteActionCompatParcelizer(), resources.getDisplayMetrics(), getd, getf);
        int i2 = 0;
        if (accessgetrelativecp.serializer.containsKey(ComponentDialogExternalSyntheticLambda0.class)) {
            contentDrawScopeDefaultImpls = new CanvasDrawScopeKt(1);
            copyug5nnss = new CanvasDrawScopeKt(0);
        } else {
            copyug5nnss = new copyUg5Nnss(canvasDrawScopeKtasDrawTransform1, i2);
            contentDrawScopeDefaultImpls = new ContentDrawScopeDefaultImpls(canvasDrawScopeKtasDrawTransform1, i2, getf);
        }
        registry.write("Animation", InputStream.class, Drawable.class, Recorder$3.read(arrayListRemoteActionCompatParcelizer, getf));
        registry.write("Animation", ByteBuffer.class, Drawable.class, Recorder$3.RemoteActionCompatParcelizer(arrayListRemoteActionCompatParcelizer, getf));
        drawCircleV9BoPswdefault drawcirclev9bopswdefault = new drawCircleV9BoPswdefault(applicationContext);
        setDensity setdensity = new setDensity(getf);
        DeltaDecoder deltaDecoder = new DeltaDecoder((byte) 0, 5);
        drawPointsGsft0Wsdefault drawpointsgsft0wsdefault = new drawPointsGsft0Wsdefault(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.serializer(ByteBuffer.class, new configureStrokePaintho4zsrM(0));
        registry.serializer(InputStream.class, new getExponentimpl(14, getf));
        registry.write("Bitmap", ByteBuffer.class, Bitmap.class, copyug5nnss);
        registry.write("Bitmap", InputStream.class, Bitmap.class, contentDrawScopeDefaultImpls);
        if (toLinear.write()) {
            registry.write("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new copyUg5Nnss(canvasDrawScopeKtasDrawTransform1, 1));
            int i3 = IconCompatParcelizer + 11;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        registry.write("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.write(getd));
        registry.write("Bitmap", ParcelFileDescriptor.class, Bitmap.class, videoDecoderSerializer);
        configureStrokePaintho4zsrM configurestrokepaintho4zsrm = configureStrokePaintho4zsrM.RemoteActionCompatParcelizer;
        registry.write(Bitmap.class, Bitmap.class, configurestrokepaintho4zsrm);
        registry.write("Bitmap", Bitmap.class, Bitmap.class, new drawArcillE91Idefault(1));
        registry.read(Bitmap.class, setdensity);
        registry.write("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ContentDrawScopeDefaultImpls(resources, copyug5nnss));
        registry.write("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ContentDrawScopeDefaultImpls(resources, contentDrawScopeDefaultImpls));
        registry.write("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new ContentDrawScopeDefaultImpls(resources, videoDecoderSerializer));
        registry.read(BitmapDrawable.class, new accessgetGreencp(getd, 14, setdensity));
        registry.write("Animation", InputStream.class, drawImage9jGpkUEdefault.class, new drawPathLG529CIdefault(arrayListRemoteActionCompatParcelizer, drawimageaz2femsdefault, getf));
        registry.write("Animation", ByteBuffer.class, drawImage9jGpkUEdefault.class, drawimageaz2femsdefault);
        registry.read(drawImage9jGpkUEdefault.class, new Timestamp.Companion());
        registry.write(DoubleIdentitylambda0.class, DoubleIdentitylambda0.class, configurestrokepaintho4zsrm);
        registry.write("Bitmap", DoubleIdentitylambda0.class, Bitmap.class, new drawPathGBMwjPUdefault(getd));
        registry.RemoteActionCompatParcelizer(Uri.class, Drawable.class, drawcirclev9bopswdefault);
        int i5 = 2;
        registry.RemoteActionCompatParcelizer(Uri.class, Bitmap.class, new ContentDrawScopeDefaultImpls(drawcirclev9bopswdefault, i5, getd));
        registry.read(new getWhitePoint(i5));
        registry.write(File.class, ByteBuffer.class, new configureStrokePaintho4zsrM(6));
        registry.write(File.class, InputStream.class, new getDrawParamsannotations(0));
        registry.RemoteActionCompatParcelizer(File.class, File.class, new drawArcillE91Idefault(0));
        registry.write(File.class, ParcelFileDescriptor.class, new getDrawParamsannotations(1));
        registry.write(File.class, File.class, configurestrokepaintho4zsrm);
        registry.read(new getTransform(getf));
        if (toLinear.write()) {
            registry.read(new getWhitePoint(1));
        }
        NavContext navContextWrite = configureStrokePaintQ_0CZUIdefault.write(applicationContext);
        NavContext navContextSerializer = configureStrokePaintQ_0CZUIdefault.serializer(applicationContext);
        NavContext navContextIconCompatParcelizer = configureStrokePaintQ_0CZUIdefault.IconCompatParcelizer(applicationContext);
        Class cls = Integer.TYPE;
        registry.write(cls, InputStream.class, navContextWrite);
        registry.write(Integer.class, InputStream.class, navContextWrite);
        registry.write(cls, AssetFileDescriptor.class, navContextSerializer);
        registry.write(Integer.class, AssetFileDescriptor.class, navContextSerializer);
        registry.write(cls, Drawable.class, navContextIconCompatParcelizer);
        registry.write(Integer.class, Drawable.class, navContextIconCompatParcelizer);
        registry.write(Uri.class, InputStream.class, configureStrokePaintQ_0CZUIdefault.read(applicationContext));
        registry.write(Uri.class, AssetFileDescriptor.class, configureStrokePaintQ_0CZUIdefault.RemoteActionCompatParcelizer(applicationContext));
        drawOvalnJ9OG0 drawovalnj9og0 = new drawOvalnJ9OG0(resources, 0);
        drawOvalnJ9OG0 drawovalnj9og1 = new drawOvalnJ9OG0(resources, 1);
        drawOvalnJ9OG0 drawovalnj9og2 = new drawOvalnJ9OG0(resources, 2);
        registry.write(Integer.class, Uri.class, (drawImagegbVJVH8) drawovalnj9og0);
        registry.write(cls, Uri.class, (drawImagegbVJVH8) drawovalnj9og0);
        registry.write(Integer.class, AssetFileDescriptor.class, (drawImagegbVJVH8) drawovalnj9og1);
        registry.write(cls, AssetFileDescriptor.class, (drawImagegbVJVH8) drawovalnj9og1);
        registry.write(Integer.class, InputStream.class, (drawImagegbVJVH8) drawovalnj9og2);
        registry.write(cls, InputStream.class, (drawImagegbVJVH8) drawovalnj9og2);
        registry.write(String.class, InputStream.class, new getExponentimpl(12));
        registry.write(Uri.class, InputStream.class, new getExponentimpl(12));
        registry.write(String.class, InputStream.class, new configureStrokePaintho4zsrM(13));
        registry.write(String.class, ParcelFileDescriptor.class, new configureStrokePaintho4zsrM(12));
        registry.write(String.class, AssetFileDescriptor.class, new configureStrokePaintho4zsrM(11));
        registry.write(Uri.class, InputStream.class, new configurePaintswdJneEdefault(applicationContext.getAssets(), 0));
        registry.write(Uri.class, AssetFileDescriptor.class, new configurePaintswdJneEdefault(applicationContext.getAssets(), 1));
        boolean z = false;
        registry.write(Uri.class, InputStream.class, new NavContext(applicationContext, 8, z));
        registry.write(Uri.class, InputStream.class, new NavContext(applicationContext, 9, z));
        if (Build.VERSION.SDK_INT >= 29) {
            registry.write(Uri.class, InputStream.class, new getDrawContext(applicationContext, 0));
            registry.write(Uri.class, ParcelFileDescriptor.class, new getDrawContext(applicationContext, 1));
            int i6 = IconCompatParcelizer + 111;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        boolean zContainsKey = accessgetrelativecp.serializer.containsKey(MediaMetadataCompat.class);
        registry.write(Uri.class, InputStream.class, new drawRectnJ9OG0(contentResolver, zContainsKey, 0));
        registry.write(Uri.class, ParcelFileDescriptor.class, new drawRectnJ9OG0(contentResolver, zContainsKey, 2));
        registry.write(Uri.class, AssetFileDescriptor.class, new drawRectnJ9OG0(contentResolver, zContainsKey, 1));
        int i8 = 14;
        registry.write(Uri.class, InputStream.class, new configureStrokePaintho4zsrM(i8));
        registry.write(URL.class, InputStream.class, new Transition$1(i8));
        registry.write(Uri.class, File.class, new NavContext(applicationContext, 5, false));
        registry.write(modulate5vOe2sY.class, InputStream.class, new getExponentimpl(15));
        int i9 = 3;
        registry.write(byte[].class, ByteBuffer.class, new configureStrokePaintho4zsrM(i9));
        registry.write(byte[].class, InputStream.class, new configureStrokePaintho4zsrM(5));
        registry.write(Uri.class, Uri.class, configurestrokepaintho4zsrm);
        registry.write(Drawable.class, Drawable.class, configurestrokepaintho4zsrm);
        registry.RemoteActionCompatParcelizer(Drawable.class, Drawable.class, new drawArcillE91Idefault(2));
        registry.write(Bitmap.class, BitmapDrawable.class, (drawOvalnJ9OG0default) new drawOvalnJ9OG0(resources, i9));
        registry.write(Bitmap.class, byte[].class, deltaDecoder);
        registry.write(Drawable.class, byte[].class, new accessgetTvTeletextcp(getd, deltaDecoder, drawpointsgsft0wsdefault, i9));
        registry.write(drawImage9jGpkUEdefault.class, byte[].class, drawpointsgsft0wsdefault);
        VideoDecoder videoDecoder = VideoDecoder.read(getd);
        registry.RemoteActionCompatParcelizer(ByteBuffer.class, Bitmap.class, videoDecoder);
        registry.RemoteActionCompatParcelizer(ByteBuffer.class, BitmapDrawable.class, new ContentDrawScopeDefaultImpls(resources, videoDecoder));
        Iterator it = arrayList.iterator();
        Object obj = null;
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
        int i10 = IconCompatParcelizer + 3;
        read = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return registry;
        }
        obj.hashCode();
        throw null;
    }

    public static void RemoteActionCompatParcelizer(Context context, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, SentryAndroidOptions sentryAndroidOptions) {
        List list;
        List list2;
        List list3;
        int i = 2 % 2;
        setNativeShader.read(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleIconCompatParcelizer = IconCompatParcelizer(context, sentryAndroidOptions.getLogger(), r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
            BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
            if (bundleIconCompatParcelizer != null) {
                sentryAndroidOptions.setDebug(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strIconCompatParcelizer = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strIconCompatParcelizer != null) {
                        int i2 = read + 37;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        sentryAndroidOptions.setDiagnosticLevel(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.valueOf(strIconCompatParcelizer.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.tombstone.enable", sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.sample-rate");
                    if (dRemoteActionCompatParcelizer != -1.0d) {
                        int i4 = IconCompatParcelizer + 83;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dRemoteActionCompatParcelizer));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strIconCompatParcelizer2 = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zRemoteActionCompatParcelizer || (strIconCompatParcelizer2 != null && strIconCompatParcelizer2.isEmpty())) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strIconCompatParcelizer2 == null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zRemoteActionCompatParcelizer);
                sentryAndroidOptions.setDsn(strIconCompatParcelizer2);
                sentryAndroidOptions.setEnableNdk(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strIconCompatParcelizer3 = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strIconCompatParcelizer3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strIconCompatParcelizer3);
                }
                sentryAndroidOptions.setRelease(IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.auto-init", true)) {
                    int i6 = read + 69;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    sentryAndroidOptions.setInitPriority(ContainerStepgetChildStepIteratorinlinediterator1.LOW);
                }
                sentryAndroidOptions.setForceInit(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.sample-rate");
                    if (dRemoteActionCompatParcelizer2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dRemoteActionCompatParcelizer2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dRemoteActionCompatParcelizer3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dRemoteActionCompatParcelizer3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dRemoteActionCompatParcelizer4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dRemoteActionCompatParcelizer4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strIconCompatParcelizer4 = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strIconCompatParcelizer4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(StepDataargs_delegatelambda0inlinediterator1.valueOf(strIconCompatParcelizer4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jRemoteActionCompatParcelizer != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jRemoteActionCompatParcelizer));
                }
                List<String> list4 = read(bundleIconCompatParcelizer, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundleIconCompatParcelizer.containsKey("io.sentry.traces.trace-propagation-targets") && list4 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (list4 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(list4);
                }
                sentryAndroidOptions.setEnableFramesTracking(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4("", "");
                }
                String strSerializer = serializer(bundleIconCompatParcelizer, logger, "io.sentry.sdk.name", sdkVersion.serializer());
                setNativeShader.read(strSerializer, "name is required.");
                sdkVersion.RemoteActionCompatParcelizer = strSerializer;
                String strSerializer2 = serializer(bundleIconCompatParcelizer, logger, "io.sentry.sdk.version", sdkVersion.IconCompatParcelizer());
                setNativeShader.read(strSerializer2, "version is required.");
                sdkVersion.IconCompatParcelizer = strSerializer2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List list5 = read(bundleIconCompatParcelizer, logger, "io.sentry.gradle-plugin-integrations");
                if (list5 != null) {
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        int i8 = read + 1;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().RatingCompat() == null) {
                    double dRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dRemoteActionCompatParcelizer5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().RemoteActionCompatParcelizer(Double.valueOf(dRemoteActionCompatParcelizer5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().RemoteActionCompatParcelizer() == null) {
                    double dRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dRemoteActionCompatParcelizer6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().write(Double.valueOf(dRemoteActionCompatParcelizer6));
                    }
                }
                parseUseWebViewFromQueryBundle sessionReplay = sentryAndroidOptions.getSessionReplay();
                boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.mask-all-text", true);
                CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                CopyOnWriteArraySet copyOnWriteArraySet2 = sessionReplay.write;
                if (zRemoteActionCompatParcelizer2) {
                    copyOnWriteArraySet2.add(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                    copyOnWriteArraySet.remove(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                    int i10 = IconCompatParcelizer + 77;
                    read = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i11 = 3 / 5;
                    }
                } else {
                    copyOnWriteArraySet.add(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                    copyOnWriteArraySet2.remove(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                }
                parseUseWebViewFromQueryBundle sessionReplay2 = sentryAndroidOptions.getSessionReplay();
                boolean zRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.mask-all-images", true);
                CopyOnWriteArraySet copyOnWriteArraySet3 = sessionReplay2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                CopyOnWriteArraySet copyOnWriteArraySet4 = sessionReplay2.write;
                if (zRemoteActionCompatParcelizer3) {
                    copyOnWriteArraySet4.add("android.widget.ImageView");
                    copyOnWriteArraySet3.remove("android.widget.ImageView");
                } else {
                    copyOnWriteArraySet3.add("android.widget.ImageView");
                    copyOnWriteArraySet4.remove("android.widget.ImageView");
                }
                sentryAndroidOptions.getSessionReplay().serializer(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.debug", false));
                Object obj = null;
                String strIconCompatParcelizer5 = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strIconCompatParcelizer5 != null) {
                    int i12 = IconCompatParcelizer + 73;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if ("canvas".equals(strIconCompatParcelizer5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().MediaSessionCompatToken = dismisslambda0.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().MediaSessionCompatToken = dismisslambda0.PIXEL_COPY;
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().write().isEmpty()) {
                    int i14 = read + 67;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    List list6 = read(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.network-detail-allow-urls");
                    if (list6 != null && !list6.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            String strTrim = ((String) it2.next()).trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            sentryAndroidOptions.getSessionReplay().IconCompatParcelizer(arrayList);
                        }
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().read().isEmpty() && (list3 = read(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !list3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().serializer(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().read(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().MediaBrowserCompatMediaItem()));
                if (sentryAndroidOptions.getSessionReplay().IconCompatParcelizer().size() == parseUseWebViewFromQueryBundle.IconCompatParcelizer.size() && (list2 = read(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            int i16 = IconCompatParcelizer + 79;
                            read = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        int i18 = IconCompatParcelizer + 115;
                        read = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 != 0) {
                            sentryAndroidOptions.getSessionReplay().write(arrayList3);
                            obj.hashCode();
                            throw null;
                        }
                        sentryAndroidOptions.getSessionReplay().write(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().serializer().size() == parseUseWebViewFromQueryBundle.IconCompatParcelizer.size() && (list = read(bundleIconCompatParcelizer, logger, "io.sentry.session-replay.network-response-headers")) != null && !list.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().read(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(read(bundleIconCompatParcelizer, logger, "io.sentry.ignored-errors"));
                List list7 = read(bundleIconCompatParcelizer, logger, "io.sentry.in-app-includes");
                if (list7 != null && (!list7.isEmpty())) {
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List list8 = read(bundleIconCompatParcelizer, logger, "io.sentry.in-app-excludes");
                if (list8 != null && !list8.isEmpty()) {
                    Iterator it7 = list8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().read(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().write()));
                sentryAndroidOptions.getMetrics().read(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().serializer()));
                PendingBannerDismissSnapshot feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.write(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.is-name-required", feedbackOptions.read()));
                feedbackOptions.read(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.show-name", feedbackOptions.serializer()));
                feedbackOptions.serializer(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.is-email-required", feedbackOptions.RemoteActionCompatParcelizer()));
                feedbackOptions.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.show-email", feedbackOptions.write()));
                feedbackOptions.MediaMetadataCompat(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.MediaMetadataCompat()));
                feedbackOptions.IconCompatParcelizer(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.feedback.show-branding", feedbackOptions.IconCompatParcelizer()));
                sentryAndroidOptions.setEnableSpotlight(RemoteActionCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.spotlight.enable", sentryAndroidOptions.isEnableSpotlight()));
                String strIconCompatParcelizer6 = IconCompatParcelizer(bundleIconCompatParcelizer, logger, "io.sentry.spotlight.url", null);
                if (strIconCompatParcelizer6 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(strIconCompatParcelizer6);
                }
            }
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to read configuration from android manifest metadata.", th);
            int i19 = read + 79;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
        }
    }

    public static Object write(Task task) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1618399249, -1618399242, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{task});
    }

    public static final StateProviderImpl$special$$inlined$map$4 IconCompatParcelizer(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (StateProviderImpl$special$$inlined$map$4) IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 76932691, -76932687, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{accessrequireviewfactoryholder});
    }

    public static isAdapterPositionOnScreen IconCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (isAdapterPositionOnScreen) IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{r8lambdardpfsr94j4iebcwx_kpqzpm8k0});
    }

    public static final int RemoteActionCompatParcelizer(tintxETnrds tintxetnrds) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return ((Integer) IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds})).intValue();
    }

    public static final Object serializer(backwardFocusSearch backwardfocussearch, isRoot isroot, Serializable serializable) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1970152312, 1970152312, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{backwardfocussearch, isroot, serializable});
    }

    public static zzw RemoteActionCompatParcelizer(Exception exc) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (zzw) IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{exc});
    }

    public static final void write(WorkManagerImpl workManagerImpl, String str) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 676120041, -676120040, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{workManagerImpl, str});
    }

    public static final beforeOpened serializer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (beforeOpened) IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2});
    }
}
