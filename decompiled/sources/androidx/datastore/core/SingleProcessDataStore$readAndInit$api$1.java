package androidx.datastore.core;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FocusTraversalKt;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1 {
    public final /* synthetic */ SingleProcessDataStore IconCompatParcelizer;
    public final /* synthetic */ cancelPendingWebViewPause RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;
    public final /* synthetic */ setCustomInAppMessageAnimationFactorylambda0 write;

    public SingleProcessDataStore$readAndInit$api$1(setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0, cancelPendingWebViewPause cancelpendingwebviewpause, createInAppMessageEventSubscriber createinappmessageeventsubscriber, SingleProcessDataStore singleProcessDataStore) {
        this.write = setcustominappmessageanimationfactorylambda0;
        this.RemoteActionCompatParcelizer = cancelpendingwebviewpause;
        this.read = createinappmessageeventsubscriber;
        this.IconCompatParcelizer = singleProcessDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00da), top: B:55:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object updateData(DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2, ContinuationImpl continuationImpl) throws Throwable {
        FocusTraversalKt focusTraversalKt;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2;
        Object obj;
        if (continuationImpl instanceof FocusTraversalKt) {
            focusTraversalKt = (FocusTraversalKt) continuationImpl;
            int i = focusTraversalKt.MediaSessionCompatQueueItem;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusTraversalKt.MediaSessionCompatQueueItem = i - Integer.MIN_VALUE;
            } else {
                focusTraversalKt = new FocusTraversalKt(this, continuationImpl);
            }
        } else {
            focusTraversalKt = new FocusTraversalKt(this, continuationImpl);
        }
        Object objInvoke = focusTraversalKt.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusTraversalKt.MediaSessionCompatQueueItem;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = dataMigrationInitializer$Companion$runMigrations$2;
                focusTraversalKt.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda3 = this.write;
                focusTraversalKt.serializer = setcustominappmessageanimationfactorylambda3;
                cancelpendingwebviewpause = this.RemoteActionCompatParcelizer;
                focusTraversalKt.RemoteActionCompatParcelizer = cancelpendingwebviewpause;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = this.read;
                focusTraversalKt.read = createinappmessageeventsubscriber3;
                SingleProcessDataStore singleProcessDataStore3 = this.IconCompatParcelizer;
                focusTraversalKt.IconCompatParcelizer = singleProcessDataStore3;
                focusTraversalKt.MediaSessionCompatQueueItem = 1;
                if (setcustominappmessageanimationfactorylambda3.lock(focusTraversalKt) != coroutineSingletons) {
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda3;
                    singleProcessDataStore = singleProcessDataStore3;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = focusTraversalKt.RemoteActionCompatParcelizer;
                    createinappmessageeventsubscriber2 = (createInAppMessageEventSubscriber) focusTraversalKt.serializer;
                    setcustominappmessageanimationfactorylambda2 = (setCustomInAppMessageAnimationFactorylambda0) focusTraversalKt.write;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                        createinappmessageeventsubscriber2.IconCompatParcelizer = obj;
                        Object obj2 = createinappmessageeventsubscriber2.IconCompatParcelizer;
                        setcustominappmessageanimationfactorylambda2.write(null);
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        throw th;
                    }
                }
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) focusTraversalKt.RemoteActionCompatParcelizer;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = (createInAppMessageEventSubscriber) focusTraversalKt.serializer;
                setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) focusTraversalKt.write;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    singleProcessDataStore2 = singleProcessDataStore4;
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber4;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objInvoke, createinappmessageeventsubscriber2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        focusTraversalKt.write = setcustominappmessageanimationfactorylambda1;
                        focusTraversalKt.serializer = createinappmessageeventsubscriber2;
                        focusTraversalKt.RemoteActionCompatParcelizer = objInvoke;
                        focusTraversalKt.MediaSessionCompatQueueItem = 3;
                        if (singleProcessDataStore2.writeData$datastore_core(objInvoke, focusTraversalKt) != coroutineSingletons) {
                            obj = objInvoke;
                            setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                            createinappmessageeventsubscriber2.IconCompatParcelizer = obj;
                        }
                        return coroutineSingletons;
                    }
                    setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                    Object obj3 = createinappmessageeventsubscriber2.IconCompatParcelizer;
                    setcustominappmessageanimationfactorylambda2.write(null);
                    return obj3;
                } catch (Throwable th2) {
                    th = th2;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    setcustominappmessageanimationfactorylambda0.write(null);
                    throw th;
                }
            }
            singleProcessDataStore = focusTraversalKt.IconCompatParcelizer;
            createinappmessageeventsubscriber = focusTraversalKt.read;
            cancelpendingwebviewpause = (cancelPendingWebViewPause) focusTraversalKt.RemoteActionCompatParcelizer;
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) focusTraversalKt.serializer;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) focusTraversalKt.write;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            if (cancelpendingwebviewpause.IconCompatParcelizer) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj4 = createinappmessageeventsubscriber.IconCompatParcelizer;
            focusTraversalKt.write = setcustominappmessageanimationfactorylambda0;
            focusTraversalKt.serializer = createinappmessageeventsubscriber;
            focusTraversalKt.RemoteActionCompatParcelizer = singleProcessDataStore;
            focusTraversalKt.read = null;
            focusTraversalKt.IconCompatParcelizer = null;
            focusTraversalKt.MediaSessionCompatQueueItem = 2;
            objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj4, focusTraversalKt);
            if (objInvoke != coroutineSingletons) {
                singleProcessDataStore2 = singleProcessDataStore;
                createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objInvoke, createinappmessageeventsubscriber2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    focusTraversalKt.write = setcustominappmessageanimationfactorylambda1;
                    focusTraversalKt.serializer = createinappmessageeventsubscriber2;
                    focusTraversalKt.RemoteActionCompatParcelizer = objInvoke;
                    focusTraversalKt.MediaSessionCompatQueueItem = 3;
                    if (singleProcessDataStore2.writeData$datastore_core(objInvoke, focusTraversalKt) != coroutineSingletons) {
                        obj = objInvoke;
                        setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                        createinappmessageeventsubscriber2.IconCompatParcelizer = obj;
                    }
                } else {
                    setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                }
                Object obj5 = createinappmessageeventsubscriber2.IconCompatParcelizer;
                setcustominappmessageanimationfactorylambda2.write(null);
                return obj5;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }
}
