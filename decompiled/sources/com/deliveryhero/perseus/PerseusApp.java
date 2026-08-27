package com.deliveryhero.perseus;

import androidx.annotation.Keep;
import bo.app.d4$$ExternalSyntheticLambda2;
import coil3.ExtrasKt;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.accessgetIntersectcp;
import o.createFromParcel;
import o.getPathFillTypeRgk1Os;
import o.getViewportWidth;
import o.onItemDismisslambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setStrokeLineMiter;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
@onItemDismisslambda0
public final class PerseusApp {
    public static final LinkedHashSet write = new LinkedHashSet();
    public static final ArrayList serializer = new ArrayList();

    /* JADX INFO: renamed from: com.deliveryhero.perseus.PerseusApp$updateSessionLastUsedDate$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public int write;

        public AnonymousClass1() {
            super(1, null);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AppSessionManagerImpl appSessionManagerImplIconCompatParcelizer = updateRenderPath.IconCompatParcelizer();
                this.write = 1;
                Object objRefreshSessionTimeStamp = appSessionManagerImplIconCompatParcelizer.read.refreshSessionTimeStamp(this);
                if (objRefreshSessionTimeStamp != coroutineSingletons) {
                    objRefreshSessionTimeStamp = createfromparcel;
                }
                if (objRefreshSessionTimeStamp == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass1(1, shortNewsContentCardView);
        }

        public AnonymousClass1(int i, ShortNewsContentCardView shortNewsContentCardView) {
            super(i, shortNewsContentCardView);
        }
    }

    @Keep
    @onItemDismisslambda0
    public static final void execute(setStrokeLineMiter setstrokelinemiter) {
        setstrokelinemiter.getClass();
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer != null) {
            IconCompatParcelizer(setstrokelinemiter.read());
        } else {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
        }
    }

    public static void IconCompatParcelizer(PerseusEvent perseusEvent) {
        accessgetIntersectcp accessgetintersectcp = new accessgetIntersectcp(16);
        perseusEvent.getClass();
        d4$$ExternalSyntheticLambda2 d4__externalsyntheticlambda2 = new d4$$ExternalSyntheticLambda2(perseusEvent, 19, accessgetintersectcp);
        int i = 1;
        boolean z = pauseWebviewIfNecessarylambda10.IconCompatParcelizer != null;
        updateRenderPath.MediaSessionCompatQueueItem.getClass();
        boolean[] zArr = {z, DefaultPerseusConfigProvider.RemoteActionCompatParcelizer(), pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer};
        for (int i2 = 0; i2 < 3; i2++) {
            if (!zArr[i2]) {
                ContextScope contextScope = getViewportWidth.serializer;
                ContextsKt.IconCompatParcelizer(new ClearDatabaseUseCase$invoke$2(d4__externalsyntheticlambda2, null, i));
                return;
            }
        }
        d4__externalsyntheticlambda2.invoke();
    }

    @Keep
    @onItemDismisslambda0
    public static final void updateSessionLastUsedDate() {
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer == null) {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
        } else {
            ContextScope contextScope = getViewportWidth.serializer;
            ContextsKt.IconCompatParcelizer(new AnonymousClass1());
        }
    }

    @Keep
    @onItemDismisslambda0
    public static final void execute(PerseusEvent perseusEvent) {
        perseusEvent.getClass();
        if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer != null) {
            IconCompatParcelizer(perseusEvent);
        } else {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Application context is missing, PerseusApp should be initialized!", null);
        }
    }
}
