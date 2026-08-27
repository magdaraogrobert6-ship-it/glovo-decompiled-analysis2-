package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accesssetCurrentlyFocusedANIp implements getInAppMessageManager {
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;
    public static final accesssetCurrentlyFocusedANIp read;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        accesssetCurrentlyFocusedANIp accesssetcurrentlyfocusedanip = new accesssetCurrentlyFocusedANIp();
        read = accesssetcurrentlyfocusedanip;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.google.firebase.sessions.settings.SessionConfigs", accesssetcurrentlyfocusedanip, 5);
        oncloseactionlambda1.read("sessionsEnabled", false);
        oncloseactionlambda1.read("sessionSamplingRate", false);
        oncloseactionlambda1.read("sessionTimeoutSeconds", false);
        oncloseactionlambda1.read("cacheDurationSeconds", false);
        oncloseactionlambda1.read("cacheUpdatedTimeSeconds", false);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(getWasCloseMessageCalled.write);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer);
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, LazyKt__LazyJVMKt.read(afterclosed), LazyKt__LazyJVMKt.read(afterclosed), LazyKt__LazyJVMKt.read(onDismissed.write)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (i2 == -1) {
                z = false;
            } else if (i2 == 0) {
                bool = (Boolean) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getWasCloseMessageCalled.write, bool);
                i |= 1;
            } else if (i2 == 1) {
                d = (Double) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, d);
                i |= 2;
            } else if (i2 == 2) {
                num = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, afterClosed.IconCompatParcelizer, num);
                i |= 4;
            } else if (i2 == 3) {
                num2 = (Integer) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, afterClosed.IconCompatParcelizer, num2);
                i |= 8;
            } else {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
                }
                l = (Long) createinappmessageviewlambda1Serializer.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, l);
                i |= 16;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new accessscheduleScrollEventIfNeeded(i, bool, d, num, num2, l);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        accessscheduleScrollEventIfNeeded accessschedulescrolleventifneeded = (accessscheduleScrollEventIfNeeded) obj;
        accessschedulescrolleventifneeded.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, getWasCloseMessageCalled.write, accessschedulescrolleventifneeded.sessionsEnabled);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, accessschedulescrolleventifneeded.sessionSamplingRate);
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, afterclosed, accessschedulescrolleventifneeded.sessionTimeoutSeconds);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, afterclosed, accessschedulescrolleventifneeded.cacheDurationSeconds);
        defaultInAppMessageSlideupViewFactorySerializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, onDismissed.write, accessschedulescrolleventifneeded.cacheUpdatedTimeSeconds);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
