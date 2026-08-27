package com.roadrunner.delivery.accept.acknowledgment.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import java.time.Clock;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getAnnotationRangeSaverannotations;
import o.isItemDismissable;
import o.onBackInvoked;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAcknowledgmentParamsImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Clock RemoteActionCompatParcelizer;
    public final LinkedHashSet serializer = new LinkedHashSet();
    public final zzz write;

    public GetAcknowledgmentParamsImpl(zzz zzzVar, Clock clock) {
        this.write = zzzVar;
        this.RemoteActionCompatParcelizer = clock;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object shouldSendAcknowledgment(onBackInvoked onbackinvoked, ContinuationImpl continuationImpl) {
        getAnnotationRangeSaverannotations getannotationrangesaverannotations;
        Object objM4472invokegIAlus;
        int i;
        boolean zBooleanValue;
        int i2 = 2 % 2;
        if (continuationImpl instanceof getAnnotationRangeSaverannotations) {
            getannotationrangesaverannotations = (getAnnotationRangeSaverannotations) continuationImpl;
            int i3 = getannotationrangesaverannotations.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getannotationrangesaverannotations.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getannotationrangesaverannotations = new getAnnotationRangeSaverannotations(this, continuationImpl);
                int i4 = IconCompatParcelizer + 17;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            getannotationrangesaverannotations = new getAnnotationRangeSaverannotations(this, continuationImpl);
            int i6 = IconCompatParcelizer + 17;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object obj = getannotationrangesaverannotations.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getannotationrangesaverannotations.RemoteActionCompatParcelizer;
        boolean z = true;
        if (i8 != 0) {
            int i9 = IconCompatParcelizer + 49;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            onbackinvoked = getannotationrangesaverannotations.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4472invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            int i11 = read + 1;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            long jSerializer = onbackinvoked.serializer();
            getannotationrangesaverannotations.serializer = onbackinvoked;
            getannotationrangesaverannotations.RemoteActionCompatParcelizer = 1;
            objM4472invokegIAlus = this.write.m4472invokegIAlus(jSerializer, getannotationrangesaverannotations);
            if (objM4472invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (objM4472invokegIAlus instanceof isItemDismissable) {
            objM4472invokegIAlus = null;
        }
        Boolean bool = (Boolean) objM4472invokegIAlus;
        if (bool != null) {
            int i13 = read + 41;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                zBooleanValue = bool.booleanValue();
                int i14 = 24 / 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                z = false;
            } else {
                if (this.serializer.contains(new Long(onbackinvoked.serializer()))) {
                    z = false;
                } else {
                    i = IconCompatParcelizer + 17;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }
        } else {
            if (this.serializer.contains(new Long(onbackinvoked.serializer()))) {
                i = IconCompatParcelizer + 17;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009e -> B:24:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable invoke(o.setFitInsetsSides r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl.invoke(o.setFitInsetsSides, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
