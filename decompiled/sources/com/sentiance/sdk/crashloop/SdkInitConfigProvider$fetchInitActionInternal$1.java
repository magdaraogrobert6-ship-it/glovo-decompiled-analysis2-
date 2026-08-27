package com.sentiance.sdk.crashloop;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.parseLonglambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q;
import o.r8lambdaeD9byxNVlFNFerv0pUjy_LuGI;
import o.r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU;
import o.r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkInitConfigProvider$fetchInitActionInternal$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $callback;
    final /* synthetic */ boolean $keepTrying;
    final /* synthetic */ SdkInitConfigRequestReason $reason;
    final /* synthetic */ r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkInitConfigProvider$fetchInitActionInternal$1(SdkInitConfigRequestReason sdkInitConfigRequestReason, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        super(1);
        this.this$0 = r8lambdazxt1df5niyc198h8rswq6bap4q;
        this.$callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.$keepTrying = z;
        this.$reason = sdkInitConfigRequestReason;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.sentiance.sdk.crashloop.SdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4 r8lambdai5nub7sp_oydxv9gxfmziuf3u4 = (r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4) obj;
        r8lambdai5nub7sp_oydxv9gxfmziuf3u4.getClass();
        boolean z = r8lambdai5nub7sp_oydxv9gxfmziuf3u4 instanceof r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (z) {
            parseLonglambda0 parselonglambda0 = this.this$0.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Init config fetched successfully, init config: ");
            r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.IconCompatParcelizer iconCompatParcelizer = (r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.IconCompatParcelizer) r8lambdai5nub7sp_oydxv9gxfmziuf3u4;
            sb.append(iconCompatParcelizer.IconCompatParcelizer());
            parselonglambda0.IconCompatParcelizer(sb.toString(), new Object[0]);
            r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugiSerializer = r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.serializer(this.this$0, iconCompatParcelizer.IconCompatParcelizer());
            r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.IconCompatParcelizer(this.this$0, iconCompatParcelizer.IconCompatParcelizer(), r8lambdaed9byxnvlfnferv0pujy_lugiSerializer);
            this.$callback.invoke(new r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU.write(r8lambdaed9byxnvlfnferv0pujy_lugiSerializer));
            r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.MediaSessionCompatQueueItem(this.this$0);
            this.this$0.PlaybackStateCompatCustomAction = 0;
        } else if (r8lambdai5nub7sp_oydxv9gxfmziuf3u4 instanceof r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.serializer) {
            parseLonglambda0 parselonglambda1 = this.this$0.IconCompatParcelizer;
            StringBuilder sb2 = new StringBuilder("Failed to fetch SDK init config: ");
            sb2.append(r8lambdai5nub7sp_oydxv9gxfmziuf3u4.write());
            sb2.append(' ');
            String strRemoteActionCompatParcelizer = ((r8lambdai5nUb7sp_oyDXV9GxFMzIuf3U4.serializer) r8lambdai5nub7sp_oydxv9gxfmziuf3u4).RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer == null) {
                strRemoteActionCompatParcelizer = "";
            }
            sb2.append(strRemoteActionCompatParcelizer);
            parselonglambda1.RemoteActionCompatParcelizer(sb2.toString(), new Object[0]);
            if (this.$keepTrying) {
                long jMediaMetadataCompat = r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.MediaMetadataCompat(this.this$0);
                this.this$0.PlaybackStateCompatCustomAction++;
                parseLonglambda0 parselonglambda2 = this.this$0.IconCompatParcelizer;
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(jMediaMetadataCompat, "Retrying SDK init config fetch in ", "ms (retry #");
                sbM.append(this.this$0.PlaybackStateCompatCustomAction);
                sbM.append(')');
                parselonglambda2.IconCompatParcelizer(sbM.toString(), new Object[0]);
                final boolean z2 = this.this$0.PlaybackStateCompatCustomAction <= this.this$0.MediaSessionCompatToken;
                if (z2) {
                    this.this$0.MediaSessionCompatQueueItem.read();
                }
                final r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q = this.this$0;
                final SdkInitConfigRequestReason sdkInitConfigRequestReason = this.$reason;
                final boolean z3 = this.$keepTrying;
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$callback;
                r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.RemoteActionCompatParcelizer(r8lambdazxt1df5niyc198h8rswq6bap4q, jMediaMetadataCompat, new Runnable() { // from class: com.sentiance.sdk.crashloop.SdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q2 = r8lambdazxt1df5niyc198h8rswq6bap4q;
                        r8lambdazxt1df5niyc198h8rswq6bap4q2.getClass();
                        SdkInitConfigRequestReason sdkInitConfigRequestReason2 = sdkInitConfigRequestReason;
                        sdkInitConfigRequestReason2.getClass();
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
                        r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.read(sdkInitConfigRequestReason2, r8lambdazxt1df5niyc198h8rswq6bap4q2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, z3);
                        if (z2) {
                            r8lambdazxt1df5niyc198h8rswq6bap4q2.MediaSessionCompatQueueItem.IconCompatParcelizer();
                        }
                    }
                });
            } else {
                this.$callback.invoke(new r8lambdahx9HHYKRmmIJaGuK5gvk7zXHzU.read(createfromparcel));
            }
        }
        this.this$0.MediaSessionCompatQueueItem.IconCompatParcelizer();
        return createfromparcel;
    }
}
