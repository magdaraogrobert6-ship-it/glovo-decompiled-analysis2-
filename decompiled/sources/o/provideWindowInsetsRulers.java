package o;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.internal.zzx;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class provideWindowInsetsRulers extends WindowInsetsRulersImpl {
    public final /* synthetic */ ParentDataModifierDefaultImpls IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public provideWindowInsetsRulers(zzx zzxVar, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2, provideWindowInsetsRulers providewindowinsetsrulers) {
        super(parentDataModifierDefaultImpls);
        this.RemoteActionCompatParcelizer = zzxVar;
        this.IconCompatParcelizer = parentDataModifierDefaultImpls2;
        this.write = providewindowinsetsrulers;
    }

    @Override // o.WindowInsetsRulersImpl
    public final void RemoteActionCompatParcelizer() {
        if (this.serializer != 0) {
            synchronized (((zzx) this.RemoteActionCompatParcelizer).RatingCompat) {
                zzx zzxVar = (zzx) this.RemoteActionCompatParcelizer;
                ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.IconCompatParcelizer;
                zzxVar.MediaBrowserCompatMediaItem.add(parentDataModifierDefaultImpls);
                parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(new zzbv(zzxVar, 9, parentDataModifierDefaultImpls));
                if (((zzx) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction.getAndIncrement() > 0) {
                    ((zzx) this.RemoteActionCompatParcelizer).write.write("Already connected to the service.", new Object[0]);
                }
                zzx.IconCompatParcelizer((zzx) this.RemoteActionCompatParcelizer, (provideWindowInsetsRulers) this.write);
            }
            return;
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = this.IconCompatParcelizer;
        getMaximumhdzbrEE getmaximumhdzbree = (getMaximumhdzbrEE) this.RemoteActionCompatParcelizer;
        String str = (String) this.write;
        try {
            getmaximumhdzbree.RemoteActionCompatParcelizer.PlaybackStateCompat.IconCompatParcelizer(getmaximumhdzbree.serializer, getMaximumhdzbrEE.RemoteActionCompatParcelizer(getmaximumhdzbree, str), new getTargetValueInsetshdzbrEE(getmaximumhdzbree, parentDataModifierDefaultImpls2, str));
        } catch (RemoteException e) {
            lightingOWjLjI lightingowjlji = getMaximumhdzbrEE.read;
            Object[] objArr = {str};
            lightingowjlji.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                SentryLogcatAdapter.read("PlayCore", lightingOWjLjI.IconCompatParcelizer(lightingowjlji.write, "requestUpdateInfo(%s)", objArr), e);
            }
            parentDataModifierDefaultImpls2.IconCompatParcelizer((Exception) new RuntimeException(e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public provideWindowInsetsRulers(getMaximumhdzbrEE getmaximumhdzbree, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, String str, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2) {
        super(parentDataModifierDefaultImpls);
        this.RemoteActionCompatParcelizer = getmaximumhdzbree;
        this.write = str;
        this.IconCompatParcelizer = parentDataModifierDefaultImpls2;
    }
}
