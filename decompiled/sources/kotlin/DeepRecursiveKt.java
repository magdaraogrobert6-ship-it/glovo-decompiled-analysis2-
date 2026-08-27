package kotlin;

import coil3.ExtrasKt;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.isItemDismissable;
import o.pauseWebviewIfNecessarylambda10;
import o.removeNodeAtDepth;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DeepRecursiveKt {
    public static final CoroutineSingletons IconCompatParcelizer = CoroutineSingletons.COROUTINE_SUSPENDED;

    public static final Object invoke(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = (JsonTreeReader$readDeepRecursive$1) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
        DeepRecursiveScopeImpl deepRecursiveScopeImpl = new DeepRecursiveScopeImpl();
        deepRecursiveScopeImpl.read = jsonTreeReader$readDeepRecursive$1;
        deepRecursiveScopeImpl.serializer = deepRecursiveScopeImpl;
        CoroutineSingletons coroutineSingletons = IconCompatParcelizer;
        deepRecursiveScopeImpl.write = coroutineSingletons;
        while (true) {
            Object obj = deepRecursiveScopeImpl.write;
            ShortNewsContentCardView shortNewsContentCardView = deepRecursiveScopeImpl.serializer;
            if (shortNewsContentCardView == null) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{coroutineSingletons, obj}, getCieXyz.write())).booleanValue()) {
                try {
                    JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$2 = deepRecursiveScopeImpl.read;
                    pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, jsonTreeReader$readDeepRecursive$2}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                    JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$3 = new JsonTreeReader$readDeepRecursive$1(jsonTreeReader$readDeepRecursive$2.read, shortNewsContentCardView);
                    jsonTreeReader$readDeepRecursive$3.serializer = deepRecursiveScopeImpl;
                    Object objInvokeSuspend = jsonTreeReader$readDeepRecursive$3.invokeSuspend(createFromParcel.INSTANCE);
                    if (objInvokeSuspend != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        shortNewsContentCardView.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th) {
                    shortNewsContentCardView.resumeWith(new isItemDismissable(th));
                }
            } else {
                deepRecursiveScopeImpl.write = coroutineSingletons;
                shortNewsContentCardView.resumeWith(obj);
            }
        }
    }
}
