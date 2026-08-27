package com.roadrunner.push.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.push.event.PushDeepLink;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import o.createFromParcel;
import o.lambdaisEnabled11;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NotificationDialogKt$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ MessageDialogData RemoteActionCompatParcelizer;
    public final /* synthetic */ lambdaisEnabled11 read;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ NotificationDialogKt$$ExternalSyntheticLambda0(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, lambdaisEnabled11 lambdaisenabled11, MessageDialogData messageDialogData) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = lambdaisenabled11;
        this.RemoteActionCompatParcelizer = messageDialogData;
    }

    public /* synthetic */ NotificationDialogKt$$ExternalSyntheticLambda0(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, MessageDialogData messageDialogData, lambdaisEnabled11 lambdaisenabled11) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = messageDialogData;
        this.read = lambdaisenabled11;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 105;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        MessageDialogData messageDialogData = this.RemoteActionCompatParcelizer;
        lambdaisEnabled11 lambdaisenabled11 = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        if (i3 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            if (lambdaisenabled11 != null) {
                lambdaisenabled11.read(messageDialogData);
                int i4 = MediaSessionCompatQueueItem + 51;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            return createfromparcel2;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        PushDeepLink pushDeepLink = messageDialogData.RemoteActionCompatParcelizer;
        if (pushDeepLink != null && lambdaisenabled11 != null) {
            int i6 = MediaSessionCompatQueueItem + 115;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            lambdaisenabled11.write(pushDeepLink.RemoteActionCompatParcelizer, messageDialogData.IconCompatParcelizer);
        }
        return createfromparcel2;
    }
}
