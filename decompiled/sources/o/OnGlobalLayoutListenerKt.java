package o;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: loaded from: classes2.dex */
public final class OnGlobalLayoutListenerKt extends LayoutNodeSubcompositionsStatecreateMeasureResult1 {
    public final /* synthetic */ layoutdefault MediaMetadataCompat;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OnGlobalLayoutListenerKt(layoutdefault layoutdefaultVar, layoutdefault layoutdefaultVar2, int i) {
        super(layoutdefaultVar2);
        this.write = i;
        this.MediaMetadataCompat = layoutdefaultVar;
    }

    @Override // o.LayoutNodeSubcompositionsStatecreateMeasureResult1
    public final void serializer() {
        int i = this.write;
        layoutdefault layoutdefaultVar = this.MediaMetadataCompat;
        if (i == 0) {
            OnGloballyPositionedModifier onGloballyPositionedModifier = (OnGloballyPositionedModifier) layoutdefaultVar;
            onGloballyPositionedModifier.serializer();
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) onGloballyPositionedModifier.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Starting upload from DelayedRunnable");
            onGloballyPositionedModifier.MediaSessionCompatToken.RemoteActionCompatParcelizer();
            return;
        }
        zzpg zzpgVar = (zzpg) layoutdefaultVar;
        zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
        String str = (String) zzpgVar.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.pollFirst();
        if (str != null) {
            ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
            zzpgVar.MediaSessionCompatResultReceiverWrapper = SystemClock.elapsedRealtime();
            zzpgVar.RatingCompat().PlaybackStateCompat.serializer(str, "Sending trigger URI notification to app");
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpg.IconCompatParcelizer(zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaDescriptionCompat, intent);
        }
        zzpgVar.write();
    }
}
