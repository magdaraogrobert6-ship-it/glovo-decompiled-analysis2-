package com.deliveryhero.perseus.core.session;

import androidx.emoji2.text.EmojiProcessor;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import o.addPathoIyEayMdefault;
import o.createFromParcel;
import o.getRotate;
import o.setChildren;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientIdProviderImpl {
    public final PerseusUserLocalDataStoreImpl IconCompatParcelizer;
    public volatile String read;
    public final Object write;

    public ClientIdProviderImpl(PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl) {
        perseusUserLocalDataStoreImpl.getClass();
        this.IconCompatParcelizer = perseusUserLocalDataStoreImpl;
        this.write = new Object();
    }

    public final void IconCompatParcelizer(String str) {
        str.getClass();
        if (str.length() > 0) {
            synchronized (this.write) {
                this.read = str;
                PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = this.IconCompatParcelizer;
                perseusUserLocalDataStoreImpl.getClass();
                perseusUserLocalDataStoreImpl.write.serializer(str, "client_id");
                EmojiProcessor emojiProcessor = perseusUserLocalDataStoreImpl.serializer;
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(perseusUserLocalDataStoreImpl, str, null, 5);
                emojiProcessor.getClass();
                ((BufferedChannel) emojiProcessor.IconCompatParcelizer).b_(authRepository$logoutUser$2);
            }
        }
    }

    public final String serializer() {
        String str = this.read;
        if (str == null) {
            str = (String) this.IconCompatParcelizer.write.write("client_id");
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        this.read = str;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getClientId(ContinuationImpl continuationImpl) {
        getRotate getrotate;
        if (continuationImpl instanceof getRotate) {
            getrotate = (getRotate) continuationImpl;
            int i = getrotate.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getrotate.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getrotate = new getRotate(this, continuationImpl);
            }
        } else {
            getrotate = new getRotate(this, continuationImpl);
        }
        Object clientId = getrotate.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getrotate.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(clientId);
            String str = this.read;
            if (str != null) {
                return str;
            }
            synchronized (this.write) {
                String strSerializer = serializer();
                if (strSerializer != null) {
                    return strSerializer;
                }
                PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = this.IconCompatParcelizer;
                getrotate.IconCompatParcelizer = 1;
                clientId = perseusUserLocalDataStoreImpl.getClientId(getrotate);
                if (clientId != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = getrotate.write;
            ExtrasKt.RemoteActionCompatParcelizer(clientId);
            return str2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(clientId);
        String str3 = (String) clientId;
        if (str3 != null && str3.length() != 0) {
            synchronized (this.write) {
                String strSerializer2 = serializer();
                if (strSerializer2 != null) {
                    return strSerializer2;
                }
                this.read = str3;
                return str3;
            }
        }
        synchronized (this.write) {
            String strSerializer3 = serializer();
            if (strSerializer3 != null) {
                return strSerializer3;
            }
            String str4 = new addPathoIyEayMdefault(null).RemoteActionCompatParcelizer;
            this.read = str4;
            PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl2 = this.IconCompatParcelizer;
            getrotate.write = str4;
            getrotate.IconCompatParcelizer = 2;
            return perseusUserLocalDataStoreImpl2.putClientId(str4, getrotate) == coroutineSingletons ? coroutineSingletons : str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object warmUpClientId(ContinuationImpl continuationImpl) {
        setChildren setchildren;
        if (continuationImpl instanceof setChildren) {
            setchildren = (setChildren) continuationImpl;
            int i = setchildren.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setchildren.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setchildren = new setChildren(this, continuationImpl);
            }
        } else {
            setchildren = new setChildren(this, continuationImpl);
        }
        Object clientId = setchildren.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setchildren.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(clientId);
            synchronized (this.write) {
                String strSerializer = serializer();
                if (strSerializer != null && strSerializer.length() != 0) {
                    return createFromParcel.INSTANCE;
                }
                PerseusUserLocalDataStoreImpl perseusUserLocalDataStoreImpl = this.IconCompatParcelizer;
                setchildren.RemoteActionCompatParcelizer = 1;
                clientId = perseusUserLocalDataStoreImpl.getClientId(setchildren);
                if (clientId == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(clientId);
        }
        String str = (String) clientId;
        if (str != null && str.length() != 0) {
            synchronized (this.write) {
                String strSerializer2 = serializer();
                if (strSerializer2 == null || strSerializer2.length() == 0) {
                    this.read = str;
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
