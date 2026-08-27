package o;

import android.content.Context;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class onSemanticsChange implements registerOnEndApplyChangesListener, setShowLayoutBounds {
    public final Context IconCompatParcelizer;
    public final Set RemoteActionCompatParcelizer;
    public final AbstractComposeViewExternalSyntheticLambda0 read;
    public final Executor serializer;
    public final provideRulerValue write;

    public final OwnerCompanion IconCompatParcelizer() {
        boolean zSerializer;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            setEnableExtraAssertions setenableextraassertions = (setEnableExtraAssertions) this.write.write();
            synchronized (setenableextraassertions) {
                zSerializer = setenableextraassertions.serializer(setEnableExtraAssertions.IconCompatParcelizer, jCurrentTimeMillis);
            }
            if (!zSerializer) {
                return OwnerCompanion.NONE;
            }
            synchronized (setenableextraassertions) {
                setenableextraassertions.read.serializer(new SessionDao_Impl$$ExternalSyntheticLambda1(setenableextraassertions, 2, setenableextraassertions.read(System.currentTimeMillis())));
            }
            return OwnerCompanion.GLOBAL;
        }
    }

    public final void serializer() {
        if (this.RemoteActionCompatParcelizer.size() <= 0) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        } else if (!androidx.room.Room.write(this.IconCompatParcelizer)) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        } else {
            LazyKt__LazyJVMKt.write(this.serializer, new setContentCaptureManagerui(2, this));
        }
    }

    public final zzw write() {
        if (!androidx.room.Room.write(this.IconCompatParcelizer)) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer("");
        }
        return LazyKt__LazyJVMKt.write(this.serializer, new HostnameCache$$ExternalSyntheticLambda1(5, this));
    }

    public onSemanticsChange(Context context, String str, Set set, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, Executor executor) {
        this.write = new provideRulerValue(new FirebaseApp$$ExternalSyntheticLambda0(context, str));
        this.RemoteActionCompatParcelizer = set;
        this.serializer = executor;
        this.read = abstractComposeViewExternalSyntheticLambda0;
        this.IconCompatParcelizer = context;
    }
}
