package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zze;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class provideInsetsValuescytEWk0 {
    public final getMaximumhdzbrEE IconCompatParcelizer;
    public final Context serializer;
    public final Handler write = new Handler(Looper.getMainLooper());

    public final zzw RemoteActionCompatParcelizer() {
        String packageName = this.serializer.getPackageName();
        lightingOWjLjI lightingowjlji = getMaximumhdzbrEE.read;
        getMaximumhdzbrEE getmaximumhdzbree = this.IconCompatParcelizer;
        zzx zzxVar = getmaximumhdzbree.RemoteActionCompatParcelizer;
        if (zzxVar != null) {
            lightingowjlji.write("requestUpdateInfo(%s)", packageName);
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            zzxVar.read().post(new provideWindowInsetsRulers(zzxVar, parentDataModifierDefaultImpls, parentDataModifierDefaultImpls, new provideWindowInsetsRulers(getmaximumhdzbree, parentDataModifierDefaultImpls, packageName, parentDataModifierDefaultImpls)));
            return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        }
        Object[] objArr = {-9};
        lightingowjlji.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            SentryLogcatAdapter.serializer("PlayCore", lightingOWjLjI.IconCompatParcelizer(lightingowjlji.write, "onError(%d)", objArr));
        }
        Object[] objArr2 = {new InstallException(-9)};
        return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
    }

    public final void write(getSafeDrawing getsafedrawing, Activity activity, getCurrenthdzbrEE getcurrenthdzbree) {
        if (activity == null || getsafedrawing.RemoteActionCompatParcelizer()) {
            Object[] objArr = {new InstallException(-4)};
            return;
        }
        if (!getsafedrawing.read(getcurrenthdzbree)) {
            Object[] objArr2 = {new InstallException(-6)};
            return;
        }
        getsafedrawing.read();
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", getsafedrawing.IconCompatParcelizer(getcurrenthdzbree));
        intent.putExtra("result_receiver", new zze(this.write, new ParentDataModifierDefaultImpls()));
        activity.startActivity(intent);
    }

    public provideInsetsValuescytEWk0(getMaximumhdzbrEE getmaximumhdzbree, Context context) {
        this.IconCompatParcelizer = getmaximumhdzbree;
        this.serializer = context;
    }
}
