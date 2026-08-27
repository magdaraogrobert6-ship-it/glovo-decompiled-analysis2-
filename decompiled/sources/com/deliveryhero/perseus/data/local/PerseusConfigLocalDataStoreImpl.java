package com.deliveryhero.perseus.data.local;

import android.os.Trace;
import androidx.emoji2.text.EmojiProcessor;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ImageVectorCompanion;
import o.accessgetIntersectcp;
import o.accesspeek;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.generateImageVectorIdui;
import o.getVerticalEllipseRadius;
import o.onAddedToParentLayer;
import o.setRotate;
import o.setStrokeLineCapBeK7IIE;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class PerseusConfigLocalDataStoreImpl {
    public final generateImageVectorIdui IconCompatParcelizer;
    public final getVerticalEllipseRadius read;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object persistConfiguration(PerseusParamsConfig perseusParamsConfig, ContinuationImpl continuationImpl) {
        setRotate setrotate;
        if (continuationImpl instanceof setRotate) {
            setrotate = (setRotate) continuationImpl;
            int i = setrotate.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                setrotate.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                setrotate = new setRotate(this, continuationImpl);
            }
        } else {
            setrotate = new setRotate(this, continuationImpl);
        }
        Object objSerializer = setrotate.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setrotate.RemoteActionCompatParcelizer;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                setStrokeLineCapBeK7IIE.write("Perseus.config.persistConfiguration");
                Trace.beginSection("Perseus.config.persistConfiguration");
                this.read.serializer(perseusParamsConfig, "perseus_config_key");
                generateImageVectorIdui generateimagevectoridui = this.IconCompatParcelizer;
                String json = updateRenderPath.serializer().toJson(perseusParamsConfig);
                json.getClass();
                setrotate.RemoteActionCompatParcelizer = 1;
                objSerializer = generateimagevectoridui.serializer("perseus_config_key", json, setrotate);
                if (objSerializer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            }
            Trace.endSection();
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public PerseusConfigLocalDataStoreImpl(getVerticalEllipseRadius getverticalellipseradius, generateImageVectorIdui generateimagevectoridui) {
        getverticalellipseradius.getClass();
        generateimagevectoridui.getClass();
        this.read = getverticalellipseradius;
        this.IconCompatParcelizer = generateimagevectoridui;
        new EmojiProcessor(new accessgetIntersectcp(18), new onAddedToParentLayer(13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r10 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getBatchDispatchHitsDelay(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof o.ImageVectorKt
            if (r0 == 0) goto L13
            r0 = r10
            o.ImageVectorKt r0 = (o.ImageVectorKt) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.read = r1
            goto L18
        L13:
            o.ImageVectorKt r0 = new o.ImageVectorKt
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.read
            o.getVerticalEllipseRadius r3 = r9.read
            r4 = 2
            r5 = 1
            java.lang.String r6 = "batch_dispatch_hits_delay"
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2e
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L88
            goto L76
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            r10 = 0
            return r10
        L35:
            int r2 = r0.RemoteActionCompatParcelizer
            int r5 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L88
            goto L61
        L3d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            java.lang.String r10 = "Perseus.config.getBatchDispatchHitsDelay"
            o.setStrokeLineCapBeK7IIE.write(r10)
            android.os.Trace.beginSection(r10)
            java.lang.Object r10 = r3.write(r6)     // Catch: java.lang.Throwable -> L88
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L88
            if (r10 != 0) goto L7b
            com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider r10 = o.updateRenderPath.MediaSessionCompatQueueItem     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r0.serializer = r2     // Catch: java.lang.Throwable -> L88
            r0.RemoteActionCompatParcelizer = r2     // Catch: java.lang.Throwable -> L88
            r0.read = r5     // Catch: java.lang.Throwable -> L88
            java.lang.Object r10 = r10.getConfig(r0)     // Catch: java.lang.Throwable -> L88
            if (r10 != r1) goto L60
            goto L75
        L60:
            r5 = r2
        L61:
            com.deliveryhero.perseus.PerseusParamsConfig r10 = (com.deliveryhero.perseus.PerseusParamsConfig) r10     // Catch: java.lang.Throwable -> L88
            long r7 = r10.getDispatchDelay()     // Catch: java.lang.Throwable -> L88
            o.generateImageVectorIdui r10 = r9.IconCompatParcelizer     // Catch: java.lang.Throwable -> L88
            r0.serializer = r5     // Catch: java.lang.Throwable -> L88
            r0.RemoteActionCompatParcelizer = r2     // Catch: java.lang.Throwable -> L88
            r0.read = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r10 = r10.getLong(r7, r6, r0)     // Catch: java.lang.Throwable -> L88
            if (r10 != r1) goto L76
        L75:
            return r1
        L76:
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L88
            r3.serializer(r10, r6)     // Catch: java.lang.Throwable -> L88
        L7b:
            long r0 = r10.longValue()     // Catch: java.lang.Throwable -> L88
            java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Throwable -> L88
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L88
            android.os.Trace.endSection()
            return r10
        L88:
            r10 = move-exception
            android.os.Trace.endSection()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl.getBatchDispatchHitsDelay(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getMaxBackoffTime(ContinuationImpl continuationImpl) {
        ImageVectorCompanion imageVectorCompanion;
        if (continuationImpl instanceof ImageVectorCompanion) {
            imageVectorCompanion = (ImageVectorCompanion) continuationImpl;
            int i = imageVectorCompanion.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                imageVectorCompanion.serializer = i - Integer.MIN_VALUE;
            } else {
                imageVectorCompanion = new ImageVectorCompanion(this, continuationImpl);
            }
        } else {
            imageVectorCompanion = new ImageVectorCompanion(this, continuationImpl);
        }
        Object config = imageVectorCompanion.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = imageVectorCompanion.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(config);
            DefaultPerseusConfigProvider defaultPerseusConfigProvider = updateRenderPath.MediaSessionCompatQueueItem;
            imageVectorCompanion.serializer = 1;
            config = defaultPerseusConfigProvider.getConfig(imageVectorCompanion);
            if (config == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(config);
        }
        return new Long(((PerseusParamsConfig) config).getMaxBackoffTime());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object retrieveConfiguration(ContinuationImpl continuationImpl) {
        accesspeek accesspeekVar;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        if (continuationImpl instanceof accesspeek) {
            accesspeekVar = (accesspeek) continuationImpl;
            int i = accesspeekVar.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accesspeekVar.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accesspeekVar = new accesspeek(this, continuationImpl);
            }
        } else {
            accesspeekVar = new accesspeek(this, continuationImpl);
        }
        Object obj = accesspeekVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accesspeekVar.IconCompatParcelizer;
        getVerticalEllipseRadius getverticalellipseradius = this.read;
        PerseusParamsConfig perseusParamsConfig = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                setStrokeLineCapBeK7IIE.write("Perseus.config.retrieveConfiguration");
                Trace.beginSection("Perseus.config.retrieveConfiguration");
                createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                Object objWrite = getverticalellipseradius.write("perseus_config_key");
                createinappmessageeventsubscriber.IconCompatParcelizer = objWrite;
                if (objWrite == null) {
                    generateImageVectorIdui generateimagevectoridui = this.IconCompatParcelizer;
                    accesspeekVar.write = createinappmessageeventsubscriber;
                    accesspeekVar.IconCompatParcelizer = 1;
                    Object string = generateimagevectoridui.getString("perseus_config_key", accesspeekVar);
                    if (string == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                    obj = string;
                } else {
                    perseusParamsConfig = (PerseusParamsConfig) createinappmessageeventsubscriber.IconCompatParcelizer;
                }
                Trace.endSection();
                return perseusParamsConfig;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber2 = accesspeekVar.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str = (String) obj;
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                Object objFromJson = updateRenderPath.serializer().fromJson(str, (Class<Object>) PerseusParamsConfig.class);
                createinappmessageeventsubscriber2.IconCompatParcelizer = objFromJson;
                if (((PerseusParamsConfig) objFromJson) != null) {
                    getverticalellipseradius.serializer(objFromJson, "perseus_config_key");
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                perseusParamsConfig = (PerseusParamsConfig) createinappmessageeventsubscriber.IconCompatParcelizer;
            }
            Trace.endSection();
            return perseusParamsConfig;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
