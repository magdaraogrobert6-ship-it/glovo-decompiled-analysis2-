package com.foodora.courier.base.presentation.view.presenter;

import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import o.getKeyboardTap5zf0vsI;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePresenter {
    public final DialogMessageRequestProxy IconCompatParcelizer;
    public final CompositeDisposable RemoteActionCompatParcelizer = new CompositeDisposable();
    public final WeakReference read;
    public final DefaultForegroundSoundManager serializer;
    public final getKeyboardTap5zf0vsI write;

    public BasePresenter(WeakReference weakReference, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, DialogMessageRequestProxy dialogMessageRequestProxy) {
        this.read = weakReference;
        this.serializer = defaultForegroundSoundManager;
        this.write = getkeyboardtap5zf0vsi;
        this.IconCompatParcelizer = dialogMessageRequestProxy;
    }
}
