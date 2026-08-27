package o;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class checkForSystemLogLevelPropertydefault implements View.OnClickListener {
    public final /* synthetic */ int write;

    public /* synthetic */ checkForSystemLogLevelPropertydefault(int i) {
        this.write = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.write;
        if (i != 0) {
            if (i == 1) {
                com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createCloseInAppMessageClickListener$lambda$0(view);
            } else if (i != 2) {
                int i2 = createHandler.RemoteActionCompatParcelizer;
            } else {
                int i3 = getNetworkTimeClockannotations.RemoteActionCompatParcelizer;
            }
        }
    }
}
