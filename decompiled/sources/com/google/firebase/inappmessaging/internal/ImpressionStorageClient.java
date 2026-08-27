package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import io.reactivex.Maybe;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeFromCallable;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import o.component23;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;

/* JADX INFO: loaded from: classes2.dex */
public final class ImpressionStorageClient {
    public static final CampaignImpressionList read = CampaignImpressionList.getDefaultInstance();
    public final r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM serializer;
    public Maybe write = MaybeEmpty.IconCompatParcelizer;

    public final MaybePeek IconCompatParcelizer() {
        Maybe maybe = this.write;
        component23 rVar = CampaignImpressionList.parser();
        r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = this.serializer;
        r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
        MaybeFromCallable maybeFromCallable = new MaybeFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, 2, rVar));
        final int i = 0;
        Consumer consumer = new Consumer(this) { // from class: o.traverseAncestors
            public final /* synthetic */ ImpressionStorageClient IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                ImpressionStorageClient impressionStorageClient = this.IconCompatParcelizer;
                if (i2 == 0) {
                    impressionStorageClient.write = Maybe.RemoteActionCompatParcelizer((CampaignImpressionList) obj);
                } else {
                    impressionStorageClient.write = MaybeEmpty.IconCompatParcelizer;
                }
            }
        };
        Consumer consumer2 = Functions.serializer;
        MaybeSwitchIfEmpty maybeSwitchIfEmpty = new MaybeSwitchIfEmpty(maybe, new MaybePeek(maybeFromCallable, consumer, consumer2));
        final int i2 = 1;
        return new MaybePeek(maybeSwitchIfEmpty, consumer2, new Consumer(this) { // from class: o.traverseAncestors
            public final /* synthetic */ ImpressionStorageClient IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                ImpressionStorageClient impressionStorageClient = this.IconCompatParcelizer;
                if (i3 == 0) {
                    impressionStorageClient.write = Maybe.RemoteActionCompatParcelizer((CampaignImpressionList) obj);
                } else {
                    impressionStorageClient.write = MaybeEmpty.IconCompatParcelizer;
                }
            }
        });
    }

    public ImpressionStorageClient(r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm) {
        this.serializer = r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm;
    }
}
