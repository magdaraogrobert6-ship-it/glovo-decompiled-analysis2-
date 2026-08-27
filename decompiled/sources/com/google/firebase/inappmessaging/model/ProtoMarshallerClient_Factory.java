package com.google.firebase.inappmessaging.model;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import o.disposeComposition;
import o.forceAccessibilityForTesting;
import o.setComposeViewContextui;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoMarshallerClient_Factory implements forceAccessibilityForTesting {
    public final /* synthetic */ int write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.write;
        if (i == 0) {
            return new setComposeViewContextui();
        }
        if (i == 1) {
            return "firebaseinappmessaging.googleapis.com";
        }
        if (i == 2) {
            Scheduler scheduler = Schedulers.RemoteActionCompatParcelizer;
            OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.write;
            if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
                try {
                    scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
                } catch (Throwable th) {
                    throw ExceptionHelper.write(th);
                }
            }
            setNativeShader.RemoteActionCompatParcelizer(scheduler);
            return scheduler;
        }
        if (i != 3) {
            return i != 4 ? new disposeComposition() : AndroidSchedulers.RemoteActionCompatParcelizer();
        }
        Scheduler scheduler2 = Schedulers.IconCompatParcelizer;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 = RxJavaPlugins.MediaMetadataCompat;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1 != null) {
            try {
                scheduler2 = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda1.apply(scheduler2);
            } catch (Throwable th2) {
                throw ExceptionHelper.write(th2);
            }
        }
        setNativeShader.RemoteActionCompatParcelizer(scheduler2);
        return scheduler2;
    }
}
