package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import com.deliveryhero.fwf_http.ConstantKt;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DelayKt;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.setNativeShader;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchyEventProcessor implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final io.sentry.android.core.internal.util.MediaDescriptionCompat IconCompatParcelizer;
    public final SentryAndroidOptions serializer;

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        return accessensureviewmodelstore;
    }

    public static io.sentry.protocol.fullyDrawnReporter_delegatelambda00 write(View view) {
        io.sentry.protocol.fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00 = new io.sentry.protocol.fullyDrawnReporter_delegatelambda00();
        fullydrawnreporter_delegatelambda00.RatingCompat = Okio.serializer(view);
        try {
            fullydrawnreporter_delegatelambda00.write = io.sentry.android.core.internal.gestures.MediaMetadataCompat.IconCompatParcelizer(view);
        } catch (Throwable unused) {
        }
        fullydrawnreporter_delegatelambda00.ParcelableVolumeInfo = Double.valueOf(view.getX());
        fullydrawnreporter_delegatelambda00.MediaSessionCompatToken = Double.valueOf(view.getY());
        fullydrawnreporter_delegatelambda00.MediaBrowserCompatMediaItem = Double.valueOf(view.getWidth());
        fullydrawnreporter_delegatelambda00.read = Double.valueOf(view.getHeight());
        fullydrawnreporter_delegatelambda00.serializer = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            fullydrawnreporter_delegatelambda00.MediaSessionCompatQueueItem = "visible";
        } else if (visibility == 4) {
            fullydrawnreporter_delegatelambda00.MediaSessionCompatQueueItem = "invisible";
        } else if (visibility == 8) {
            fullydrawnreporter_delegatelambda00.MediaSessionCompatQueueItem = "gone";
        }
        return fullydrawnreporter_delegatelambda00;
    }

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.serializer = sentryAndroidOptions;
        this.IconCompatParcelizer = new io.sentry.android.core.internal.util.MediaDescriptionCompat(ConstantKt.DEFAULT_REQUEST_TIMEOUT, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            DelayKt.MediaSessionCompatToken("ViewHierarchy");
        }
    }

    public static void write(View view, io.sentry.protocol.fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ComposeViewHierarchyExporter) it.next()).IconCompatParcelizer(fullydrawnreporter_delegatelambda00, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00Write = write(childAt);
                    arrayList.add(fullydrawnreporter_delegatelambda00Write);
                    write(childAt, fullydrawnreporter_delegatelambda00Write, list);
                }
            }
            fullydrawnreporter_delegatelambda00.IconCompatParcelizer = arrayList;
        }
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        if (bannerViewExternalSyntheticLambda2.read()) {
            SentryAndroidOptions sentryAndroidOptions = this.serializer;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return bannerViewExternalSyntheticLambda2;
            }
            if (!pauseWebviewIfNecessarylambda10.IconCompatParcelizer(executelambda4Var)) {
                boolean zIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zIconCompatParcelizer) {
                    WeakReference weakReference = (WeakReference) r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.write;
                    io.sentry.protocol.createFullyDrawnExecutor createfullydrawnexecutor = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.IconCompatParcelizer threadChecker = sentryAndroidOptions.getThreadChecker();
                    BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.IconCompatParcelizer()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.createFullyDrawnExecutor createfullydrawnexecutor2 = new io.sentry.protocol.createFullyDrawnExecutor("android_view_system", arrayList);
                                        io.sentry.protocol.fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00Write = write(viewPeekDecorView);
                                        arrayList.add(fullydrawnreporter_delegatelambda00Write);
                                        write(viewPeekDecorView, fullydrawnreporter_delegatelambda00Write, viewHierarchyExporters);
                                        createfullydrawnexecutor = createfullydrawnexecutor2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new EdgeToEdge$$ExternalSyntheticLambda0(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            createfullydrawnexecutor = (io.sentry.protocol.createFullyDrawnExecutor) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (createfullydrawnexecutor != null) {
                        executelambda4Var.RatingCompat = new getIntentArrayWithConfiguredBackStacklambda3(createfullydrawnexecutor);
                    }
                }
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }
}
