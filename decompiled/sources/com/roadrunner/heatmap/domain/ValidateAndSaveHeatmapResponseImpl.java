package com.roadrunner.heatmap.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbsSavedState1;
import o.CorruptionException;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getMaxFlingVelocity;
import o.isItemDismissable;
import o.pauseWebviewIfNecessarylambda10;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveHeatmapResponseImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final resetTransientState read;
    public final SaveHeatmapUrlImpl serializer;

    public ValidateAndSaveHeatmapResponseImpl(SaveHeatmapUrlImpl saveHeatmapUrlImpl, resetTransientState resettransientstate) {
        this.serializer = saveHeatmapUrlImpl;
        this.read = resettransientstate;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #0 {all -> 0x00a6, blocks: (B:18:0x0051, B:20:0x0055, B:27:0x0067), top: B:43:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:18:0x0051, B:20:0x0055, B:27:0x0067), top: B:43:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a6, blocks: (B:18:0x0051, B:20:0x0055, B:27:0x0067), top: B:43:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4965invokegIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        ValidateAndSaveHeatmapResponseImpl$invoke$1 validateAndSaveHeatmapResponseImpl$invoke$1;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        createFromParcel createfromparcel;
        ShortNewsContentCardView shortNewsContentCardView;
        Object objSerializer;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = 0;
        try {
            if (i5 % 2 == 0) {
                if (continuationImpl instanceof ValidateAndSaveHeatmapResponseImpl$invoke$1) {
                    validateAndSaveHeatmapResponseImpl$invoke$1 = (ValidateAndSaveHeatmapResponseImpl$invoke$1) continuationImpl;
                    i = validateAndSaveHeatmapResponseImpl$invoke$1.serializer;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        int i7 = RemoteActionCompatParcelizer + 61;
                        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        validateAndSaveHeatmapResponseImpl$invoke$1.serializer = i - Integer.MIN_VALUE;
                    }
                }
                obj = validateAndSaveHeatmapResponseImpl$invoke$1.IconCompatParcelizer;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = validateAndSaveHeatmapResponseImpl$invoke$1.serializer;
                createfromparcel = createFromParcel.INSTANCE;
                shortNewsContentCardView = null;
                if (i2 != 0) {
                    if (i2 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = RemoteActionCompatParcelizer + 23;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (getmaxflingvelocity != null) {
                    resetTransientState resettransientstate = this.read;
                    String string = getmaxflingvelocity.jsonBody.toString();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = AbsSavedState1.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    AbsSavedState1 absSavedState1 = (AbsSavedState1) resettransientstate.serializer(string, setgraphicmodalmaxwidthdpSerializer);
                    SaveHeatmapUrlImpl saveHeatmapUrlImpl = this.serializer;
                    String str = absSavedState1.url;
                    validateAndSaveHeatmapResponseImpl$invoke$1.serializer = 1;
                    CorruptionException corruptionException = (CorruptionException) saveHeatmapUrlImpl.serializer;
                    objSerializer = pauseWebviewIfNecessarylambda10.serializer(corruptionException.write.IconCompatParcelizer, new HeatmapDataStore$set$2(corruptionException.RemoteActionCompatParcelizer, str, shortNewsContentCardView, i6), validateAndSaveHeatmapResponseImpl$invoke$1);
                    if (objSerializer != coroutineSingletons) {
                        objSerializer = createfromparcel;
                    }
                    if (objSerializer != coroutineSingletons) {
                        objSerializer = createfromparcel;
                    }
                    if (objSerializer != coroutineSingletons) {
                        objSerializer = createfromparcel;
                    }
                    if (objSerializer == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return createfromparcel;
            }
            int i9 = 44 / 0;
            if (continuationImpl instanceof ValidateAndSaveHeatmapResponseImpl$invoke$1) {
                validateAndSaveHeatmapResponseImpl$invoke$1 = (ValidateAndSaveHeatmapResponseImpl$invoke$1) continuationImpl;
                i = validateAndSaveHeatmapResponseImpl$invoke$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i10 = RemoteActionCompatParcelizer + 61;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    validateAndSaveHeatmapResponseImpl$invoke$1.serializer = i - Integer.MIN_VALUE;
                }
            }
            obj = validateAndSaveHeatmapResponseImpl$invoke$1.IconCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = validateAndSaveHeatmapResponseImpl$invoke$1.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (getmaxflingvelocity != null) {
                resetTransientState resettransientstate2 = this.read;
                String string2 = getmaxflingvelocity.jsonBody.toString();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer2 = AbsSavedState1.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer2;
                AbsSavedState1 absSavedState2 = (AbsSavedState1) resettransientstate2.serializer(string2, setgraphicmodalmaxwidthdpSerializer2);
                SaveHeatmapUrlImpl saveHeatmapUrlImpl2 = this.serializer;
                String str2 = absSavedState2.url;
                validateAndSaveHeatmapResponseImpl$invoke$1.serializer = 1;
                CorruptionException corruptionException2 = (CorruptionException) saveHeatmapUrlImpl2.serializer;
                objSerializer = pauseWebviewIfNecessarylambda10.serializer(corruptionException2.write.IconCompatParcelizer, new HeatmapDataStore$set$2(corruptionException2.RemoteActionCompatParcelizer, str2, shortNewsContentCardView, i6), validateAndSaveHeatmapResponseImpl$invoke$1);
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
            if (i2 != 0) {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (getmaxflingvelocity != null) {
                resetTransientState resettransientstate3 = this.read;
                String string3 = getmaxflingvelocity.jsonBody.toString();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer3 = AbsSavedState1.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = setgraphicmodalmaxwidthdpSerializer3;
                AbsSavedState1 absSavedState3 = (AbsSavedState1) resettransientstate3.serializer(string3, setgraphicmodalmaxwidthdpSerializer3);
                SaveHeatmapUrlImpl saveHeatmapUrlImpl3 = this.serializer;
                String str3 = absSavedState3.url;
                validateAndSaveHeatmapResponseImpl$invoke$1.serializer = 1;
                CorruptionException corruptionException3 = (CorruptionException) saveHeatmapUrlImpl3.serializer;
                objSerializer = pauseWebviewIfNecessarylambda10.serializer(corruptionException3.write.IconCompatParcelizer, new HeatmapDataStore$set$2(corruptionException3.RemoteActionCompatParcelizer, str3, shortNewsContentCardView, i6), validateAndSaveHeatmapResponseImpl$invoke$1);
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer != coroutineSingletons) {
                    objSerializer = createfromparcel;
                }
                if (objSerializer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
        validateAndSaveHeatmapResponseImpl$invoke$1 = new ValidateAndSaveHeatmapResponseImpl$invoke$1(this, continuationImpl);
        obj = validateAndSaveHeatmapResponseImpl$invoke$1.IconCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = validateAndSaveHeatmapResponseImpl$invoke$1.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        shortNewsContentCardView = null;
    }
}
