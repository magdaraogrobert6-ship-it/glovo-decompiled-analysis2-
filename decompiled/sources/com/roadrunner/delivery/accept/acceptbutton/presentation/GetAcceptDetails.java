package com.roadrunner.delivery.accept.acceptbutton.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.AndroidView_androidKtupdateViewHolderParams3;
import o.AndroidView_androidKtupdateViewHolderParams5;
import o.TextIndentSaverlambda0;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAcceptDetails {
    private static int serializer = 0;
    private static int write = 1;
    public final accessrequireViewFactoryHolder read;

    public GetAcceptDetails(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        this.read = accessrequireviewfactoryholder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        TextIndentSaverlambda0 textIndentSaverlambda0;
        Object next;
        Object next2;
        int i = 2 % 2;
        if (continuationImpl instanceof TextIndentSaverlambda0) {
            textIndentSaverlambda0 = (TextIndentSaverlambda0) continuationImpl;
            int i2 = textIndentSaverlambda0.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textIndentSaverlambda0.write = i2 - Integer.MIN_VALUE;
            } else {
                textIndentSaverlambda0 = new TextIndentSaverlambda0(this, continuationImpl);
            }
        } else {
            textIndentSaverlambda0 = new TextIndentSaverlambda0(this, continuationImpl);
        }
        Object objFirstOrNull = textIndentSaverlambda0.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = textIndentSaverlambda0.write;
        Object obj = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) this.read)).MediaBrowserCompatMediaItem, 3);
            textIndentSaverlambda0.write = 1;
            objFirstOrNull = FlowKt.firstOrNull(nestLoadingServiceImpl$special$$inlined$map$1, textIndentSaverlambda0);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        onItemDismiss onitemdismiss = (onItemDismiss) objFirstOrNull;
        if (onitemdismiss != null) {
            int i4 = write + 121;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                boolean z = onitemdismiss.IconCompatParcelizer instanceof isItemDismissable;
                obj.hashCode();
                throw null;
            }
            Object obj2 = onitemdismiss.IconCompatParcelizer;
            if (obj2 instanceof isItemDismissable) {
                obj2 = null;
            }
            AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = (AndroidView_androidKtcreateAndroidViewNodeFactory11) obj2;
            if (androidView_androidKtcreateAndroidViewNodeFactory11 != null) {
                int i5 = serializer + 61;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    List list = androidView_androidKtcreateAndroidViewNodeFactory11.footerComponents;
                    throw null;
                }
                List list2 = androidView_androidKtcreateAndroidViewNodeFactory11.footerComponents;
                if (list2 != null) {
                    List list3 = list2;
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        int i6 = serializer + 9;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        next = it.next();
                    } while (!(next instanceof AndroidView_androidKtupdateViewHolderParams3));
                    AndroidView_androidKtupdateViewHolderParams3 androidView_androidKtupdateViewHolderParams3 = (AndroidView_androidKtupdateViewHolderParams3) next;
                    if (androidView_androidKtupdateViewHolderParams3 != null) {
                        int i8 = write + 75;
                        serializer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            int i9 = 17 / 0;
                        }
                        return androidView_androidKtupdateViewHolderParams3;
                    }
                    Iterator it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!(next2 instanceof AndroidView_androidKtupdateViewHolderParams5));
                    AndroidView_androidKtupdateViewHolderParams5 androidView_androidKtupdateViewHolderParams5 = (AndroidView_androidKtupdateViewHolderParams5) next2;
                    if (androidView_androidKtupdateViewHolderParams5 != null) {
                        AndroidView_androidKtupdateViewHolderParams3 androidView_androidKtupdateViewHolderParams4 = new AndroidView_androidKtupdateViewHolderParams3(androidView_androidKtupdateViewHolderParams5.acceptDetails, androidView_androidKtupdateViewHolderParams5.title, androidView_androidKtupdateViewHolderParams5.events, androidView_androidKtupdateViewHolderParams5.style);
                        int i10 = write + 47;
                        serializer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            return androidView_androidKtupdateViewHolderParams4;
                        }
                        throw null;
                    }
                }
            }
        }
        return null;
    }
}
