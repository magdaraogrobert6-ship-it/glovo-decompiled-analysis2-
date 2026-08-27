package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.VectorConfig;
import o.VectorConfigDefaultImpls;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getOrDefault;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatIdCacheHelper {
    public final LinkedHashMap read = new LinkedHashMap();
    public final MutexImpl write = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clear(ContinuationImpl continuationImpl) {
        VectorConfigDefaultImpls vectorConfigDefaultImpls;
        ChatIdCacheHelper chatIdCacheHelper;
        MutexImpl mutexImpl;
        if (continuationImpl instanceof VectorConfigDefaultImpls) {
            vectorConfigDefaultImpls = (VectorConfigDefaultImpls) continuationImpl;
            int i = vectorConfigDefaultImpls.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorConfigDefaultImpls.write = i - Integer.MIN_VALUE;
            } else {
                vectorConfigDefaultImpls = new VectorConfigDefaultImpls(this, continuationImpl);
            }
        } else {
            vectorConfigDefaultImpls = new VectorConfigDefaultImpls(this, continuationImpl);
        }
        Object obj = vectorConfigDefaultImpls.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorConfigDefaultImpls.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            vectorConfigDefaultImpls.read = this;
            MutexImpl mutexImpl2 = this.write;
            vectorConfigDefaultImpls.serializer = mutexImpl2;
            vectorConfigDefaultImpls.write = 1;
            if (mutexImpl2.lock(vectorConfigDefaultImpls) == coroutineSingletons) {
                return coroutineSingletons;
            }
            chatIdCacheHelper = this;
            mutexImpl = mutexImpl2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutexImpl = vectorConfigDefaultImpls.serializer;
            chatIdCacheHelper = vectorConfigDefaultImpls.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            chatIdCacheHelper.read.clear();
            return createFromParcel.INSTANCE;
        } finally {
            mutexImpl.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object get(String str, ContinuationImpl continuationImpl) {
        VectorConfig vectorConfig;
        MutexImpl mutexImpl;
        ChatIdCacheHelper chatIdCacheHelper;
        if (continuationImpl instanceof VectorConfig) {
            vectorConfig = (VectorConfig) continuationImpl;
            int i = vectorConfig.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorConfig.serializer = i - Integer.MIN_VALUE;
            } else {
                vectorConfig = new VectorConfig(this, continuationImpl);
            }
        } else {
            vectorConfig = new VectorConfig(this, continuationImpl);
        }
        Object obj = vectorConfig.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorConfig.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            vectorConfig.write = this;
            vectorConfig.read = str;
            mutexImpl = this.write;
            vectorConfig.IconCompatParcelizer = mutexImpl;
            vectorConfig.serializer = 1;
            if (mutexImpl.lock(vectorConfig) == coroutineSingletons) {
                return coroutineSingletons;
            }
            chatIdCacheHelper = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutexImpl mutexImpl2 = vectorConfig.IconCompatParcelizer;
            String str2 = vectorConfig.read;
            chatIdCacheHelper = vectorConfig.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutexImpl = mutexImpl2;
            str = str2;
        }
        try {
            return (String) chatIdCacheHelper.read.get(str);
        } finally {
            mutexImpl.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object put(String str, String str2, ContinuationImpl continuationImpl) {
        getOrDefault getordefault;
        MutexImpl mutexImpl;
        ChatIdCacheHelper chatIdCacheHelper;
        if (continuationImpl instanceof getOrDefault) {
            getordefault = (getOrDefault) continuationImpl;
            int i = getordefault.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getordefault.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getordefault = new getOrDefault(this, continuationImpl);
            }
        } else {
            getordefault = new getOrDefault(this, continuationImpl);
        }
        Object obj = getordefault.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getordefault.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getordefault.serializer = this;
            getordefault.read = str;
            getordefault.IconCompatParcelizer = str2;
            mutexImpl = this.write;
            getordefault.write = mutexImpl;
            getordefault.RemoteActionCompatParcelizer = 1;
            if (mutexImpl.lock(getordefault) == coroutineSingletons) {
                return coroutineSingletons;
            }
            chatIdCacheHelper = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutexImpl mutexImpl2 = getordefault.write;
            str2 = getordefault.IconCompatParcelizer;
            String str3 = getordefault.read;
            chatIdCacheHelper = getordefault.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutexImpl = mutexImpl2;
            str = str3;
        }
        try {
            LinkedHashMap linkedHashMap = chatIdCacheHelper.read;
            linkedHashMap.remove(str);
            linkedHashMap.put(str, str2);
            while (linkedHashMap.size() > 10) {
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                Object objIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Iterable) setKeySet);
                objIconCompatParcelizer.getClass();
                linkedHashMap.remove((String) objIconCompatParcelizer);
            }
            return createFromParcel.INSTANCE;
        } finally {
            mutexImpl.write(null);
        }
    }
}
