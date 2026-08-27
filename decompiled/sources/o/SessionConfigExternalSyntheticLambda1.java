package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class SessionConfigExternalSyntheticLambda1 implements VideoEncoderCrashQuirk {
    public final /* synthetic */ onDrawWithContent IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ SessionConfigExternalSyntheticLambda1(onDrawWithContent ondrawwithcontent, int i) {
        this.read = i;
        this.IconCompatParcelizer = ondrawwithcontent;
    }

    @Override // o.VideoEncoderCrashQuirk
    public final void a_(Object obj) {
        int i = this.read;
        onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
        if (i == 0) {
            List list = (List) obj;
            list.getClass();
            ondrawwithcontent.RemoteActionCompatParcelizer(new ArrayList(list));
        } else {
            try {
                ondrawwithcontent.RemoteActionCompatParcelizer(obj);
            } catch (Throwable th) {
                ondrawwithcontent.serializer(th);
            }
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public final void write(Throwable th) {
        int i = this.read;
        onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
        if (i != 0) {
            ondrawwithcontent.serializer(th);
        } else if (th instanceof TimeoutException) {
            ondrawwithcontent.serializer(th);
        } else {
            ondrawwithcontent.RemoteActionCompatParcelizer(Collections.EMPTY_LIST);
        }
    }
}
