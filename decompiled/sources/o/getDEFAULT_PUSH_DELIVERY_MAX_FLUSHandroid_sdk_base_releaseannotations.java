package o;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDEFAULT_PUSH_DELIVERY_MAX_FLUSHandroid_sdk_base_releaseannotations implements OnFailureListener {
    public final /* synthetic */ r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getDEFAULT_PUSH_DELIVERY_MAX_FLUSHandroid_sdk_base_releaseannotations(r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = r8lambdalvr3ms6iw1pdnawn92rvcukzrsy;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.serializer;
        r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy = this.IconCompatParcelizer;
        if (i == 0) {
            r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY.RemoteActionCompatParcelizer(r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, exc);
        } else if (i != 1) {
            r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY.read(r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, exc);
        } else {
            r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY.IconCompatParcelizer(r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, exc);
        }
    }
}
