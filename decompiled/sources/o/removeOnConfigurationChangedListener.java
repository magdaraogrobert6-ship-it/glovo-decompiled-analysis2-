package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class removeOnConfigurationChangedListener implements AdapterView.OnItemClickListener {
    public final /* synthetic */ onRetainCustomNonConfigurationInstance read;
    public final /* synthetic */ onSaveInstanceState write;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = this.read;
        DialogInterface.OnClickListener onClickListener = onretaincustomnonconfigurationinstance.PlaybackStateCompatCustomAction;
        onSaveInstanceState onsaveinstancestate = this.write;
        onClickListener.onClick(onsaveinstancestate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, i);
        if (onretaincustomnonconfigurationinstance.MediaBrowserCompatMediaItem) {
            return;
        }
        onsaveinstancestate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.dismiss();
    }

    public removeOnConfigurationChangedListener(onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance, onSaveInstanceState onsaveinstancestate) {
        this.read = onretaincustomnonconfigurationinstance;
        this.write = onsaveinstancestate;
    }
}
